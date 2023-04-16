package com.google.common.cache.CacheBuilder$NullListener;
import pk.e;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import com.google.common.cache.RemovalNotification;

public final class CacheBuilder$NullListener extends Enum implements e	// class@001737
{
    public static final CacheBuilder$NullListener[] $VALUES;
    public static final CacheBuilder$NullListener INSTANCE;

    static {
       CacheBuilder$NullListener nullListener = new CacheBuilder$NullListener("INSTANCE", 0);
       CacheBuilder$NullListener.INSTANCE = nullListener;
       CacheBuilder$NullListener[] nullListener1 = new CacheBuilder$NullListener[]{nullListener};
       CacheBuilder$NullListener.$VALUES = nullListener1;
    }
    public void CacheBuilder$NullListener(String p0,int p1){
       super(p0, p1);
    }
    public static CacheBuilder$NullListener valueOf(String p0){
       return Enum.valueOf(CacheBuilder$NullListener.class, p0);
    }
    public static CacheBuilder$NullListener[] values(){
       return CacheBuilder$NullListener.$VALUES.clone();
    }
    public void onRemoval(RemovalNotification p0){
    }
}
