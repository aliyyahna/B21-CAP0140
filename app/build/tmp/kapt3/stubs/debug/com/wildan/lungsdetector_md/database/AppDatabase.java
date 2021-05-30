package com.wildan.lungsdetector_md.database;

import java.lang.System;

@androidx.room.Database(entities = {com.wildan.lungsdetector_md.database.DataIllnessEntity.class}, version = 1)
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/wildan/lungsdetector_md/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "illnessDao", "Lcom/wildan/lungsdetector_md/database/IllnessDao;", "Companion", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    private static volatile com.wildan.lungsdetector_md.database.AppDatabase INSTANCE;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TABLE_NAME = "IllnessData";
    @org.jetbrains.annotations.NotNull()
    public static final com.wildan.lungsdetector_md.database.AppDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.wildan.lungsdetector_md.database.IllnessDao illnessDao();
    
    public AppDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/wildan/lungsdetector_md/database/AppDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/wildan/lungsdetector_md/database/AppDatabase;", "TABLE_NAME", "", "getDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.wildan.lungsdetector_md.database.AppDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}