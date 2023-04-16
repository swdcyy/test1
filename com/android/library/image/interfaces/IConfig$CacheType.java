package com.android.library.image.interfaces.IConfig$CacheType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class IConfig$CacheType extends Enum	// class@000efe
{
    public static final IConfig$CacheType[] $VALUES;
    public static final IConfig$CacheType FULL_CACHE;
    public static final IConfig$CacheType NOCACHE;
    public static final IConfig$CacheType NO_DISK_CACHE;
    public static final IConfig$CacheType NO_MEMORY_CACHE;

    static {
       IConfig$CacheType uCacheType = new IConfig$CacheType("FULL_CACHE", 0);
       IConfig$CacheType.FULL_CACHE = uCacheType;
       IConfig$CacheType uCacheType1 = new IConfig$CacheType("NO_MEMORY_CACHE", 1);
       IConfig$CacheType.NO_MEMORY_CACHE = uCacheType1;
       IConfig$CacheType uCacheType2 = new IConfig$CacheType("NO_DISK_CACHE", 2);
       IConfig$CacheType.NO_DISK_CACHE = uCacheType2;
       IConfig$CacheType uCacheType3 = new IConfig$CacheType("NOCACHE", 3);
       IConfig$CacheType.NOCACHE = uCacheType3;
       IConfig$CacheType[] uCacheTypeAr = new IConfig$CacheType[]{uCacheType,uCacheType1,uCacheType2,uCacheType3};
       IConfig$CacheType.$VALUES = uCacheTypeAr;
    }
    public void IConfig$CacheType(String p0,int p1){
       super(p0, p1);
    }
    public static IConfig$CacheType valueOf(String p0){
       return Enum.valueOf(IConfig$CacheType.class, p0);
    }
    public static IConfig$CacheType[] values(){
       return IConfig$CacheType.$VALUES.clone();
    }
}
