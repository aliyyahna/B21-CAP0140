package com.wildan.lungsdetector_md

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wildan.lungsdetector_md.database.DataIllnessEntity
import com.wildan.lungsdetector_md.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var activityResultBinding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityResultBinding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(activityResultBinding.root)

        val extra = intent.getParcelableExtra<DataIllnessEntity>(MainActivity.ILLNESS_DESC)

        activityResultBinding.apply {
            titleIllness.text = extra?.name
            description.text = extra?.desc
        }
    }
}