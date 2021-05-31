package com.wildan.lungsdetector_md.database;

import java.lang.System;

@androidx.room.Entity(tableName = "IllnessData")
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011\u00a8\u0006\u001d"}, d2 = {"Lcom/wildan/lungsdetector_md/database/DataIllnessEntity;", "Landroid/os/Parcelable;", "IllnessId", "", "type", "", "desc", "name", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIllnessId", "()Ljava/lang/Integer;", "setIllnessId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDesc", "()Ljava/lang/String;", "setDesc", "(Ljava/lang/String;)V", "getName", "setName", "getType", "setType", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "app_debug"})
public final class DataIllnessEntity implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.PrimaryKey(autoGenerate = false)
    private java.lang.Integer IllnessId;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "type")
    private java.lang.String type;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "desc")
    private java.lang.String desc;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "name")
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COLOUMN_TYPE = "type";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COLOUMN_NAME = "name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COLOUMN_DESC = "desc";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COLOUMN_ILLNESSID = "IllnessId";
    @org.jetbrains.annotations.NotNull()
    public static final com.wildan.lungsdetector_md.database.DataIllnessEntity.Companion Companion = null;
    public static final android.os.Parcelable.Creator<com.wildan.lungsdetector_md.database.DataIllnessEntity> CREATOR = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getIllnessId() {
        return null;
    }
    
    public final void setIllnessId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDesc() {
        return null;
    }
    
    public final void setDesc(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public DataIllnessEntity(@org.jetbrains.annotations.Nullable()
    java.lang.Integer IllnessId, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.lang.String desc, @org.jetbrains.annotations.Nullable()
    java.lang.String name) {
        super();
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.wildan.lungsdetector_md.database.DataIllnessEntity> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.wildan.lungsdetector_md.database.DataIllnessEntity[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.wildan.lungsdetector_md.database.DataIllnessEntity createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/wildan/lungsdetector_md/database/DataIllnessEntity$Companion;", "", "()V", "COLOUMN_DESC", "", "COLOUMN_ILLNESSID", "COLOUMN_NAME", "COLOUMN_TYPE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}