package com.wildan.lungsdetector_md

import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.widget.Toast
import com.wildan.lungsdetector_md.database.AppDatabase
import com.wildan.lungsdetector_md.database.DataIllnessEntity
import com.wildan.lungsdetector_md.databinding.ActivityMainBinding
import com.wildan.lungsdetector_md.ml.Model
import com.wildan.lungsdetector_md.ml.Model2
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.tensorflow.lite.DataType
import org.tensorflow.lite.support.image.TensorImage
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var uri: Uri
    private lateinit var bitmap: Bitmap
    private var bitmatcod : Boolean = false

    companion object {
        const val ILLNESS_DESC = "illness_desc"
        const val ILLNESS_PIC = "illness_pic"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val labels = application.assets.open("labels.txt").bufferedReader().use { it.readText() }.split("\n")

        binding.button.setOnClickListener {
            Log.d("mssg", "button pressed")
            val intent = Intent(Intent.ACTION_GET_CONTENT)
            intent.type = "image/*"

            startActivityForResult(intent, 100)
        }

        binding.button2.setOnClickListener {
            if (bitmatcod) {
                val resized = Bitmap.createScaledBitmap(bitmap, 224, 224, true)
                val model = Model2.newInstance(this)

                val tbuffer = TensorImage.fromBitmap(resized)
                val byteBuffer = tbuffer.buffer
// Creates inputs for reference.
                val inputFeature0 = TensorBuffer.createFixedSize(intArrayOf(1, 224, 224, 3), DataType.UINT8)
                inputFeature0.loadBuffer(byteBuffer)

// Runs model inference and gets result.
                val outputs = model.process(inputFeature0)
                val outputFeature0 = outputs.outputFeature0AsTensorBuffer

                val max = getMax(outputFeature0.floatArray)



                Intent(this, ResultActivity::class.java).apply {
                    CoroutineScope(Dispatchers.IO).launch {
                        val detail = getDetail(labels[max].trim())
                        withContext(Dispatchers.Main) {
                            if (detail.IllnessId!=9) {
                                putExtra(ILLNESS_DESC, detail)
                                putExtra(ILLNESS_PIC, uri.toString())
                                startActivity(this@apply)
                                }
                            }
                    }
                }
// Releases model resources if no longer used.
                model.close()


            }
            else if (!bitmatcod) Toast.makeText(this, "Please Insert the Image", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (data!=null) {
            binding.imageView.setImageURI(data.data)

            uri = data.data!!
            bitmap = MediaStore.Images.Media.getBitmap(this.contentResolver, uri)
            bitmatcod = true
        }
    }

    fun getMax(arr:FloatArray) : Int{
        var ind = 0
        var min = 0.0f

        for(i in 0..2)
        {
            if(arr[i] > min)
            {
                min = arr[i]
                ind = i
            }
        }
        return ind
    }

    fun getDetail(name : String) : DataIllnessEntity {
        return when (name) {
            "pneumonia"->  AppDatabase.getDatabase(this).illnessDao().loadById(1)
            "normal"->  AppDatabase.getDatabase(this).illnessDao().loadById(2)
            "covid"->  AppDatabase.getDatabase(this).illnessDao().loadById(3)
            else -> DataIllnessEntity(9,null,null,null)
        }

    }

}