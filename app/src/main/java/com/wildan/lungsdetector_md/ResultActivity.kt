package com.wildan.lungsdetector_md

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
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
        activityResultBinding.btnBack.setOnClickListener {
            finish()
        }

    }
}