package com.facebook.common.statfs.StatFsHelper$StorageType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class StatFsHelper$StorageType extends Enum	// class@00106d
{
    public static final StatFsHelper$StorageType[] $VALUES;
    public static final StatFsHelper$StorageType EXTERNAL;
    public static final StatFsHelper$StorageType INTERNAL;

    static {
       StatFsHelper$StorageType storageType = new StatFsHelper$StorageType("INTERNAL", 0);
       StatFsHelper$StorageType.INTERNAL = storageType;
       StatFsHelper$StorageType storageType1 = new StatFsHelper$StorageType("EXTERNAL", 1);
       StatFsHelper$StorageType.EXTERNAL = storageType1;
       StatFsHelper$StorageType[] storageTypeA = new StatFsHelper$StorageType[]{storageType,storageType1};
       StatFsHelper$StorageType.$VALUES = storageTypeA;
    }
    public void StatFsHelper$StorageType(String p0,int p1){
       super(p0, p1);
    }
    public static StatFsHelper$StorageType valueOf(String p0){
       return Enum.valueOf(StatFsHelper$StorageType.class, p0);
    }
    public static StatFsHelper$StorageType[] values(){
       return StatFsHelper$StorageType.$VALUES.clone();
    }
}
