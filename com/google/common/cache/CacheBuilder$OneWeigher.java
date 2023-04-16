package com.google.common.cache.CacheBuilder$OneWeigher;
import pk.f;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class CacheBuilder$OneWeigher extends Enum implements f	// class@001738
{
    public static final CacheBuilder$OneWeigher[] $VALUES;
    public static final CacheBuilder$OneWeigher INSTANCE;

    static {
       CacheBuilder$OneWeigher oneWeigher = new CacheBuilder$OneWeigher("INSTANCE", 0);
       CacheBuilder$OneWeigher.INSTANCE = oneWeigher;
       CacheBuilder$OneWeigher[] oneWeigherAr = new CacheBuilder$OneWeigher[]{oneWeigher};
       CacheBuilder$OneWeigher.$VALUES = oneWeigherAr;
    }
    public void CacheBuilder$OneWeigher(String p0,int p1){
       super(p0, p1);
    }
    public static CacheBuilder$OneWeigher valueOf(String p0){
       return Enum.valueOf(CacheBuilder$OneWeigher.class, p0);
    }
    public static CacheBuilder$OneWeigher[] values(){
       return CacheBuilder$OneWeigher.$VALUES.clone();
    }
    public int weigh(Object p0,Object p1){
       return 1;
    }
}
