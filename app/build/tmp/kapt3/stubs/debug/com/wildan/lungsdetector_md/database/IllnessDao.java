package com.wildan.lungsdetector_md.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\'J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\'\u00a8\u0006\r"}, d2 = {"Lcom/wildan/lungsdetector_md/database/IllnessDao;", "", "delete", "", "id", "", "getAll", "", "Lcom/wildan/lungsdetector_md/database/DataIllnessEntity;", "insert", "", "ilness", "loadById", "app_debug"})
public abstract interface IllnessDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM illnessdata")
    public abstract java.util.List<com.wildan.lungsdetector_md.database.DataIllnessEntity> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM illnessdata WHERE IllnessId =:id")
    public abstract com.wildan.lungsdetector_md.database.DataIllnessEntity loadById(int id);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract long insert(@org.jetbrains.annotations.NotNull()
    com.wildan.lungsdetector_md.database.DataIllnessEntity ilness);
    
    @androidx.room.Query(value = "DELETE FROM illnessdata WHERE IllnessId =:id")
    public abstract int delete(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
}