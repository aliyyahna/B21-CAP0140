package com.wildan.lungsdetector_md

import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.widget.Toast
import com.wildan.lungsdetector_md.databinding.ActivityMainBinding
import com.wildan.lungsdetector_md.ml.Model
import com.wildan.lungsdetector_md.ml.Model2
import org.tensorflow.lite.DataType
import org.tensorflow.lite.support.image.TensorImage
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    lateinit var bitmap: Bitmap
    private var bitmatcod : Boolean = false

    companion object {
        const val ILLNESS_DESC = "illness_desc"
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
                Log.d("TAG", byteBuffer.toString())
// Creates inputs for reference.
                val inputFeature0 = TensorBuffer.createFixedSize(intArrayOf(1, 224, 224, 3), DataType.UINT8)
                Log.d("TAG", inputFeature0.toString())
                inputFeature0.loadBuffer(byteBuffer)

// Runs model inference and gets result.
                val outputs = model.process(inputFeature0)
                val outputFeature0 = outputs.outputFeature0AsTensorBuffer

                var max = getMax(outputFeature0.floatArray)

                binding.txSelect.text = labels[max]
//            text_view.setText(labels[max])

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

            val uri: Uri? = data.data
            bitmap = MediaStore.Images.Media.getBitmap(this.contentResolver, uri)
            bitmatcod = true
        }
    }

    fun getMax(arr:FloatArray) : Int{
        var ind = 0
        var min = 0.0f

        for(i in 0..1000)
        {
            if(arr[i] > min)
            {
                min = arr[i]
                ind = i
            }
        }
        return ind
    }
}