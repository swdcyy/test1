package com.kwai.poi.cache.cache.PoiMemoryLruCache$mLruCache$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import fk7.d;
import com.kwai.poi.cache.cache.PoiMemoryLruCache$mLruCache$2$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PoiMemoryLruCache$mLruCache$2 extends Lambda implements a	// class@0013b0
{
    public final d $calculateMemorySizeDelegate;
    public final int $maxSize;

    public void PoiMemoryLruCache$mLruCache$2(d p0,int p1){
       this.$calculateMemorySizeDelegate = p0;
       this.$maxSize = p1;
       super(0);
    }
    public final PoiMemoryLruCache$mLruCache$2$a invoke(){
       Object obj = PatchProxy.apply(null, this, PoiMemoryLruCache$mLruCache$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PoiMemoryLruCache$mLruCache$2$a(this, this.$maxSize);
    }
    public Object invoke(){
       return this.invoke();
    }
}
