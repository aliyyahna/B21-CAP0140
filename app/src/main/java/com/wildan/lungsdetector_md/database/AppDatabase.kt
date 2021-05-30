package com.wildan.lungsdetector_md.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = arrayOf(DataIllnessEntity::class), version = 1)
abstract class AppDatabase : RoomDatabase()  {

    abstract fun illnessDao() :IllnessDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null
        const val TABLE_NAME = "IllnessData"

        fun getDatabase(context: Context): AppDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "IllnessDB"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}