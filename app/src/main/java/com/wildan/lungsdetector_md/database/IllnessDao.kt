package com.wildan.lungsdetector_md.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface IllnessDao {
    @Query("SELECT * FROM illnessdata")
    fun getAll(): List<DataIllnessEntity>

    @Query("SELECT * FROM illnessdata WHERE IllnessId =:id")
    fun loadById(id: Int): DataIllnessEntity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(ilness: DataIllnessEntity) : Long

    @Query("DELETE FROM illnessdata WHERE IllnessId =:id")
    fun delete(id: String): Int

}