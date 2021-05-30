package com.wildan.lungsdetector_md

import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import com.wildan.lungsdetector_md.databinding.ActivityMainBinding
import com.wildan.lungsdetector_md.ml.Model
import org.tensorflow.lite.DataType
import org.tensorflow.lite.support.image.TensorImage
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    lateinit var bitmap: Bitmap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val labels = application.assets.open("labels.txt").bufferedReader().use { it.readText() }.split("\n")

        binding.button.setOnClickListener {
            Log.d("mssg", "button pressed")
            var intent : Intent = Intent(Intent.ACTION_GET_CONTENT)
            intent.type = "image/*"

            startActivityForResult(intent, 100)
        }

        binding.button2.setOnClickListener {
            var resized = Bitmap.createScaledBitmap(bitmap, 224, 224, true)
            val model = Model.newInstance(this)

            var tbuffer = TensorImage.fromBitmap(resized)
            var byteBuffer = tbuffer.buffer
            Log.d("TAG" , byteBuffer.toString())
// Creates inputs for reference.
            val inputFeature0 = TensorBuffer.createFixedSize(intArrayOf(1, 224, 224, 3), DataType.FLOAT32)
            Log.d("TAG" , inputFeature0.toString())
            inputFeature0.loadBuffer(byteBuffer)

// Runs model inference and gets result.
            val outputs = model.process(inputFeature0)
            val outputFeature0 = outputs.outputFeature0AsTensorBuffer

            var max = getMax(outputFeature0.floatArray)

//            text_view.setText(labels[max])

// Releases model resources if no longer used.
            model.close()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        binding.imageView.setImageURI(data?.data)

        var uri : Uri?= data?.data
        bitmap = MediaStore.Images.Media.getBitmap(this.contentResolver, uri)

    }

    fun getMax(arr:FloatArray) : Int{
        var ind = 0;
        var min = 0.0f;

        for(i in 0..1000)
        {
            if(arr[i] > min)
            {
                min = arr[i]
                ind = i;
            }
        }
        return ind
    }
}