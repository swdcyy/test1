package com.google.common.cache.LocalCache$LocalManualCache$a;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LocalCache$LocalManualCache;
import java.util.concurrent.Callable;
import java.lang.Object;

public class LocalCache$LocalManualCache$a extends CacheLoader	// class@001748
{
    public final Callable a;
    public final LocalCache$LocalManualCache b;

    public void LocalCache$LocalManualCache$a(LocalCache$LocalManualCache p0,Callable p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public Object a(Object p0){
       return this.a.call();
    }
}
