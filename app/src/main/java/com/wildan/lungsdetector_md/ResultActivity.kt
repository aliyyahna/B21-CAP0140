package com.wildan.lungsdetector_md

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.net.toUri
import com.wildan.lungsdetector_md.database.DataIllnessEntity
import com.wildan.lungsdetector_md.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var activityResultBinding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityResultBinding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(activityResultBinding.root)

        val extra = intent.getParcelableExtra<DataIllnessEntity>(MainActivity.ILLNESS_DESC)
        val img = intent.getStringExtra(MainActivity.ILLNESS_PIC)
        val uri = Uri.parse(img)
        activityResultBinding.apply {
            titleIllness.text = extra?.name
            description.text = extra?.desc
            imageView.setImageURI(uri)
        }
    }
}