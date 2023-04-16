package com.kwai.yoda.cache.CacheEntry$Companion$caches$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import androidx.collection.LruCache;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CacheEntry$Companion$caches$2 extends Lambda implements a	// class@001194
{
    public static final CacheEntry$Companion$caches$2 INSTANCE;

    static {
       CacheEntry$Companion$caches$2.INSTANCE = new CacheEntry$Companion$caches$2();
    }
    public void CacheEntry$Companion$caches$2(){
       super(0);
    }
    public final LruCache invoke(){
       Object obj = PatchProxy.apply(null, this, CacheEntry$Companion$caches$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LruCache(32);
    }
    public Object invoke(){
       return this.invoke();
    }
}
