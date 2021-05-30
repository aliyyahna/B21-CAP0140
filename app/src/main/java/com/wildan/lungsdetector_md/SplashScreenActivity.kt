package com.wildan.lungsdetector_md

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.wildan.lungsdetector_md.databinding.ActivitySplashScreenBinding
import com.wildan.lungsdetector_md.settings.SharedPrefs
import kotlinx.coroutines.*

class SplashScreenActivity : AppCompatActivity() {

    lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val sharedPrefs = SharedPrefs(this)
        val initstart = sharedPrefs.getFirstRun()
        if (initstart) {
            CoroutineScope(Dispatchers.IO).launch {
                binding.progressBar.isIndeterminate=true
                binding.progressBar.visibility = View.VISIBLE
                sharedPrefs.setFirstRun(false)
                    withContext(Dispatchers.Main) {
                        Toast.makeText(this@SplashScreenActivity, "First Run Complete", Toast.LENGTH_SHORT).show()
                        finish()
                        startActivity(Intent(this@SplashScreenActivity, MainActivity::class.java))
                    }
            }
        }
        else if (!initstart) {
            Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }, 2000)
        }

    }
}