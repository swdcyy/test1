package com.kwai.yoda.cache.CacheEntry$b;
import erd.g;
import com.kwai.yoda.cache.CacheEntry;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class CacheEntry$b implements g	// class@001196
{
    public final CacheEntry b;

    public void CacheEntry$b(CacheEntry p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CacheEntry$b.class, "1")) {
       }else {
          this.b.b();
       }
       return;
    }
}
