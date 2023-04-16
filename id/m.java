package id.m;
import id.b0;
import tc.g;
import tc.h;
import java.lang.Object;
import id.e0;
import id.c0;
import java.util.Map;
import java.lang.String;
import com.facebook.common.internal.ImmutableMap;
import id.i;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequest$RequestLevel;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.request.ImageRequest$CacheChoice;
import java.util.concurrent.atomic.AtomicBoolean;
import bolts.Task;
import com.facebook.imagepipeline.producers.c;
import bolts.a;
import id.l;
import id.d0;

public class m implements b0	// class@0021bc
{
    public final g a;
    public final g b;
    public final h c;
    public final b0 d;

    public void m(g p0,g p1,h p2,b0 p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public static Map b(e0 p0,c0 p1,boolean p2,int p3){
       if (!p0.requiresExtraMap(p1, "DiskCacheProducer")) {
          return null;
       }
       String str = "cached_value_found";
       if (p2) {
          return ImmutableMap.of(str, String.valueOf(p2), "encodedImageSize", String.valueOf(p3));
       }
       return ImmutableMap.of(str, String.valueOf(p2));
    }
    public void produceResults(i p0,c0 p1){
       ImageRequest imageRequest = p1.b();
       int i = 1;
       if (!imageRequest.u()) {
          if (p1.q().getValue() >= ImageRequest$RequestLevel.DISK_CACHE.getValue()) {
             p1.n("disk", "nil-result_read");
             p0.d(null, i);
          }else {
             this.d.produceResults(p0, p1);
          }
          return;
       }else {
          p1.l().onProducerStart(p1, "DiskCacheProducer");
          CacheKey uCacheKey = this.c.b(imageRequest, p1.h());
          if (imageRequest.e() != ImageRequest$CacheChoice.SMALL) {
             i = 0;
          }
          m tb = (i)? this.b: this.a;
          AtomicBoolean uAtomicBoole = new AtomicBoolean(false);
          tb.g(uCacheKey, uAtomicBoole).continueWith(new c(this, p1.l(), p1, p0));
          p1.k(new l(this, uAtomicBoole));
          return;
       }
    }
}
