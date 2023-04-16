package com.kwai.yoda.cache.CacheEntry$a;
import java.lang.Object;
import nsd.u;
import androidx.collection.LruCache;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.yoda.cache.CacheEntry;
import qrd.p;

public final class CacheEntry$a	// class@001195
{

    public void CacheEntry$a(){
       super();
    }
    public void CacheEntry$a(u p0){
       super();
    }
    public final LruCache a(){
       Object obj = PatchProxy.apply(null, this, CacheEntry$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CacheEntry.o.getValue();
    }
}
