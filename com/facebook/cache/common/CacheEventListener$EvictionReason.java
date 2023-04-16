package com.facebook.cache.common.CacheEventListener$EvictionReason;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class CacheEventListener$EvictionReason extends Enum	// class@00103a
{
    public static final CacheEventListener$EvictionReason[] $VALUES;
    public static final CacheEventListener$EvictionReason CACHE_FULL;
    public static final CacheEventListener$EvictionReason CACHE_MANAGER_TRIMMED;
    public static final CacheEventListener$EvictionReason CONTENT_STALE;
    public static final CacheEventListener$EvictionReason USER_FORCED;

    static {
       CacheEventListener$EvictionReason uEvictionRea = new CacheEventListener$EvictionReason("CACHE_FULL", 0);
       CacheEventListener$EvictionReason.CACHE_FULL = uEvictionRea;
       CacheEventListener$EvictionReason uEvictionRea1 = new CacheEventListener$EvictionReason("CONTENT_STALE", 1);
       CacheEventListener$EvictionReason.CONTENT_STALE = uEvictionRea1;
       CacheEventListener$EvictionReason uEvictionRea2 = new CacheEventListener$EvictionReason("USER_FORCED", 2);
       CacheEventListener$EvictionReason.USER_FORCED = uEvictionRea2;
       CacheEventListener$EvictionReason uEvictionRea3 = new CacheEventListener$EvictionReason("CACHE_MANAGER_TRIMMED", 3);
       CacheEventListener$EvictionReason.CACHE_MANAGER_TRIMMED = uEvictionRea3;
       CacheEventListener$EvictionReason[] uEvictionRea4 = new CacheEventListener$EvictionReason[]{uEvictionRea,uEvictionRea1,uEvictionRea2,uEvictionRea3};
       CacheEventListener$EvictionReason.$VALUES = uEvictionRea4;
    }
    public void CacheEventListener$EvictionReason(String p0,int p1){
       super(p0, p1);
    }
    public static CacheEventListener$EvictionReason valueOf(String p0){
       return Enum.valueOf(CacheEventListener$EvictionReason.class, p0);
    }
    public static CacheEventListener$EvictionReason[] values(){
       return CacheEventListener$EvictionReason.$VALUES.clone();
    }
}
