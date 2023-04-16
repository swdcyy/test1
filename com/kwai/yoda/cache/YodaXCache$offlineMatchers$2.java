package com.kwai.yoda.cache.YodaXCache$offlineMatchers$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import androidx.collection.LruCache;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class YodaXCache$offlineMatchers$2 extends Lambda implements a	// class@0011a2
{
    public static final YodaXCache$offlineMatchers$2 INSTANCE;

    static {
       YodaXCache$offlineMatchers$2.INSTANCE = new YodaXCache$offlineMatchers$2();
    }
    public void YodaXCache$offlineMatchers$2(){
       super(0);
    }
    public final LruCache invoke(){
       Object obj = PatchProxy.apply(null, this, YodaXCache$offlineMatchers$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LruCache(8);
    }
    public Object invoke(){
       return this.invoke();
    }
}
