package com.facebook.imagepipeline.producers.p;
import id.b0;
import tc.g;
import tc.h;
import com.facebook.common.memory.b;
import eb.a;
import java.lang.Object;
import id.e0;
import id.c0;
import java.util.Map;
import java.lang.String;
import com.facebook.common.internal.ImmutableMap;
import id.i;
import com.facebook.cache.common.CacheKey;
import bd.d;
import com.facebook.imagepipeline.producers.p$a;
import com.facebook.imagepipeline.producers.o;
import com.facebook.imagepipeline.request.ImageRequest;
import android.net.Uri;
import android.net.Uri$Builder;
import java.util.concurrent.atomic.AtomicBoolean;
import bolts.Task;
import bolts.a;
import id.x;
import id.d0;

public class p implements b0	// class@001142
{
    public final g a;
    public final h b;
    public final b c;
    public final a d;
    public final b0 e;

    public void p(g p0,h p1,b p2,a p3,b0 p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public static Map b(e0 p0,c0 p1,boolean p2,int p3){
       if (!p0.requiresExtraMap(p1, "PartialDiskCacheProducer")) {
          return null;
       }
       String str = "cached_value_found";
       if (p2) {
          return ImmutableMap.of(str, String.valueOf(p2), "encodedImageSize", String.valueOf(p3));
       }
       return ImmutableMap.of(str, String.valueOf(p2));
    }
    public void c(i p0,c0 p1,CacheKey p2,d p3){
       p$a uoa = new p$a(p0, this.a, p2, this.c, this.d, p3, null);
       this.e.produceResults(v8, p1);
    }
    public void produceResults(i p0,c0 p1){
       ImageRequest imageRequest = p1.b();
       if (!imageRequest.u()) {
          this.e.produceResults(p0, p1);
          return;
       }else {
          p1.l().onProducerStart(p1, "PartialDiskCacheProducer");
          CacheKey uCacheKey = this.b.d(imageRequest, imageRequest.s().buildUpon().appendQueryParameter("fresco_partial", "true").build(), p1.h());
          AtomicBoolean uAtomicBoole = new AtomicBoolean(false);
          o oo = new o(this, p1.l(), p1, p0, uCacheKey);
          this.a.g(uCacheKey, uAtomicBoole).continueWith(v2);
          p1.k(new x(this, uAtomicBoole));
          return;
       }
    }
}
