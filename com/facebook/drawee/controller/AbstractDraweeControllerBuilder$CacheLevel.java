package com.facebook.drawee.controller.AbstractDraweeControllerBuilder$CacheLevel;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class AbstractDraweeControllerBuilder$CacheLevel extends Enum	// class@001086
{
    public static final AbstractDraweeControllerBuilder$CacheLevel[] $VALUES;
    public static final AbstractDraweeControllerBuilder$CacheLevel BITMAP_MEMORY_CACHE;
    public static final AbstractDraweeControllerBuilder$CacheLevel DISK_CACHE;
    public static final AbstractDraweeControllerBuilder$CacheLevel FULL_FETCH;

    static {
       AbstractDraweeControllerBuilder$CacheLevel uCacheLevel = new AbstractDraweeControllerBuilder$CacheLevel("FULL_FETCH", 0);
       AbstractDraweeControllerBuilder$CacheLevel.FULL_FETCH = uCacheLevel;
       AbstractDraweeControllerBuilder$CacheLevel uCacheLevel1 = new AbstractDraweeControllerBuilder$CacheLevel("DISK_CACHE", 1);
       AbstractDraweeControllerBuilder$CacheLevel.DISK_CACHE = uCacheLevel1;
       AbstractDraweeControllerBuilder$CacheLevel uCacheLevel2 = new AbstractDraweeControllerBuilder$CacheLevel("BITMAP_MEMORY_CACHE", 2);
       AbstractDraweeControllerBuilder$CacheLevel.BITMAP_MEMORY_CACHE = uCacheLevel2;
       AbstractDraweeControllerBuilder$CacheLevel[] uCacheLevelA = new AbstractDraweeControllerBuilder$CacheLevel[]{uCacheLevel,uCacheLevel1,uCacheLevel2};
       AbstractDraweeControllerBuilder$CacheLevel.$VALUES = uCacheLevelA;
    }
    public void AbstractDraweeControllerBuilder$CacheLevel(String p0,int p1){
       super(p0, p1);
    }
    public static AbstractDraweeControllerBuilder$CacheLevel valueOf(String p0){
       return Enum.valueOf(AbstractDraweeControllerBuilder$CacheLevel.class, p0);
    }
    public static AbstractDraweeControllerBuilder$CacheLevel[] values(){
       return AbstractDraweeControllerBuilder$CacheLevel.$VALUES.clone();
    }
}
