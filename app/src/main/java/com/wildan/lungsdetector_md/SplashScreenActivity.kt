package com.wildan.lungsdetector_md

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.wildan.lungsdetector_md.database.AppDatabase
import com.wildan.lungsdetector_md.databinding.ActivitySplashScreenBinding
import com.wildan.lungsdetector_md.helper.IllnessData
import com.wildan.lungsdetector_md.helper.SharedPrefs
import kotlinx.coroutines.*

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val db = AppDatabase.getDatabase(this)
        val sharedPrefs = SharedPrefs(this)
        val initstart = sharedPrefs.getFirstRun()
        if (initstart) {
            CoroutineScope(Dispatchers.IO).launch {
                binding.progressBar.isIndeterminate=true
                binding.progressBar.max=100
                binding.progressBar.visibility = View.VISIBLE
                IllnessData.IllnessList.forEach {
                    db.illnessDao().insert(it)
                    delay(1000L)
                }

                sharedPrefs.setFirstRun(false)
                    withContext(Dispatchers.Main) {
                        Toast.makeText(this@SplashScreenActivity, "First Run Complete", Toast.LENGTH_SHORT).show()
                        delay(1000L)
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