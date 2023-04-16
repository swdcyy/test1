package com.kwai.poi.cache.cache.PoiMemoryLruCache$mLruCache$2$a;
import android.util.LruCache;
import com.kwai.poi.cache.cache.PoiMemoryLruCache$mLruCache$2;
import java.lang.Object;
import java.lang.String;
import fk7.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import fk7.d;

public final class PoiMemoryLruCache$mLruCache$2$a extends LruCache	// class@0013af
{
    public final PoiMemoryLruCache$mLruCache$2 a;

    public void PoiMemoryLruCache$mLruCache$2$a(PoiMemoryLruCache$mLruCache$2 p0,int p1){
       this.a = p0;
       super(p1);
    }
    public int sizeOf(Object p0,Object p1){
       int i;
       PoiMemoryLruCache$mLruCache$2 obj = PatchProxy.applyTwoRefs(p0, p1, this, PoiMemoryLruCache$mLruCache$2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          a.p(p0, "key");
          a.p(p1, "value");
          obj = this.a.$calculateMemorySizeDelegate;
          i = (obj != null)? obj.a(p0, p1): super.sizeOf(p0, p1);
       }
       return i;
    }
}
