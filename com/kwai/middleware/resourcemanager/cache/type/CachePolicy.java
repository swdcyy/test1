package com.kwai.middleware.resourcemanager.cache.type.CachePolicy;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class CachePolicy extends Enum	// class@000f3f
{
    public static final CachePolicy[] $VALUES;
    public static final CachePolicy CACHE_ELSE_NETWORK;
    public static final CachePolicy CACHE_ONLY;
    public static final CachePolicy CACHE_THEN_NETWORK;
    public static final CachePolicy NETWORK_ELSE_CACHE;
    public static final CachePolicy NETWORK_ONLY;

    static {
       CachePolicy uCachePolicy1;
       CachePolicy[] uCachePolicy = new CachePolicy[]{uCachePolicy1,uCachePolicy1,uCachePolicy1,uCachePolicy1,uCachePolicy1};
       uCachePolicy1 = new CachePolicy("CACHE_THEN_NETWORK", 0);
       CachePolicy.CACHE_THEN_NETWORK = uCachePolicy1;
       uCachePolicy1 = new CachePolicy("CACHE_ELSE_NETWORK", 1);
       CachePolicy.CACHE_ELSE_NETWORK = uCachePolicy1;
       uCachePolicy1 = new CachePolicy("NETWORK_ELSE_CACHE", 2);
       CachePolicy.NETWORK_ELSE_CACHE = uCachePolicy1;
       uCachePolicy1 = new CachePolicy("CACHE_ONLY", 3);
       CachePolicy.CACHE_ONLY = uCachePolicy1;
       uCachePolicy1 = new CachePolicy("NETWORK_ONLY", 4);
       CachePolicy.NETWORK_ONLY = uCachePolicy1;
       CachePolicy.$VALUES = uCachePolicy;
    }
    public void CachePolicy(String p0,int p1){
       super(p0, p1);
    }
    public static CachePolicy valueOf(String p0){
       return Enum.valueOf(CachePolicy.class, p0);
    }
    public static CachePolicy[] values(){
       return CachePolicy.$VALUES.clone();
    }
}
