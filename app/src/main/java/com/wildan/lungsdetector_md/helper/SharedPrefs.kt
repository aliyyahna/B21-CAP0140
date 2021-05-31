package com.wildan.lungsdetector_md.helper

import android.content.Context
import androidx.core.content.edit

class SharedPrefs(context: Context) {

    companion object {
        private const val PREFS_NAME = "settings_pref"
        private const val FIRSTRUN = "first_run"
    }

    private val preferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    fun setFirstRun(value : Boolean) {
        preferences.edit{
            putBoolean(FIRSTRUN, value)
        }
    }

    fun getFirstRun(): Boolean {
        return preferences.getBoolean(FIRSTRUN, true)
    }
}