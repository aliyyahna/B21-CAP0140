package com.wildan.lungsdetector_md.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = AppDatabase.TABLE_NAME)
class DataIllnessEntity(
    @PrimaryKey(autoGenerate = false) var IllnessId : Int ?= null,
    @ColumnInfo(name = COLOUMN_TYPE) var type : String?,
    @ColumnInfo(name = COLOUMN_DESC) var desc : String?,
    @ColumnInfo(name = COLOUMN_NAME) var name : Boolean?
) {
    companion object {
        const val COLOUMN_TYPE = "type"
        const val COLOUMN_NAME = "name"
        const val COLOUMN_DESC = "desc"
        const val COLOUMN_ILLNESSID = "IllnessId"
    }
}