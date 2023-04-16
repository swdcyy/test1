package id.y;
import id.b0;
import tc.v;
import tc.h;
import java.lang.Object;
import id.i;
import id.c0;
import id.e0;
import com.facebook.imagepipeline.request.ImageRequest;
import jd.c;
import com.facebook.cache.common.CacheKey;
import java.lang.String;
import com.facebook.common.references.a;
import java.util.Map;
import com.facebook.common.internal.ImmutableMap;
import jd.d;
import id.y$a;

public class y implements b0	// class@0021d3
{
    public final v a;
    public final h b;
    public final b0 c;

    public void y(v p0,h p1,b0 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void produceResults(i p0,c0 p1){
       e0 uoe0 = p1.l();
       ImageRequest imageRequest = p1.b();
       String obj = p1.h();
       c uoc = imageRequest.j();
       if (uoc == null || uoc.a() == null) {
          this.c.produceResults(p0, p1);
          return;
       }else {
          uoe0.onProducerStart(p1, "PostprocessedBitmapMemoryCacheProducer");
          CacheKey uCacheKey = this.b.a(imageRequest, obj);
          a uoa = this.a.get(uCacheKey);
          obj = "cached_value_found";
          Map map = null;
          if (uoa != null) {
             if (uoe0.requiresExtraMap(p1, "PostprocessedBitmapMemoryCacheProducer")) {
                map = ImmutableMap.of(obj, "true");
             }
             uoe0.onProducerFinishWithSuccess(p1, "PostprocessedBitmapMemoryCacheProducer", map);
             uoe0.onUltimateProducerReached(p1, "PostprocessedBitmapMemoryCacheProducer", true);
             p1.n("memory_bitmap", "postprocessed");
             p0.a(0x3f800000);
             p0.d(uoa, true);
             uoa.close();
          }else {
             y$a uoa1 = new y$a(p0, uCacheKey, uoc instanceof d, this.a, p1.b().v());
             if (uoe0.requiresExtraMap(p1, "PostprocessedBitmapMemoryCacheProducer")) {
                map = ImmutableMap.of(obj, "false");
             }
             uoe0.onProducerFinishWithSuccess(p1, "PostprocessedBitmapMemoryCacheProducer", map);
             this.c.produceResults(uoa, p1);
          }
          return;
       }
    }
}
