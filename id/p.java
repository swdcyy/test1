package id.p;
import id.b0;
import tc.v;
import tc.h;
import java.lang.Object;
import id.i;
import id.c0;
import kd.b;
import java.lang.String;
import id.e0;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.a;
import bd.d;
import java.util.Map;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.imagepipeline.request.ImageRequest$RequestLevel;
import id.p$a;
import vc.h;
import vc.i;

public class p implements b0	// class@0021c6
{
    public final v a;
    public final h b;
    public final b0 c;

    public void p(v p0,h p1,b0 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void produceResults(i p0,c0 p1){
       boolean b;
       p op = this;
       i oi = p0;
       c0 uoc0 = p1;
       if (b.d()) {
          b.a("EncodedMemoryCacheProducer#produceResults");
       }
       e0 uoe0 = p1.l();
       uoe0.onProducerStart(uoc0, "EncodedMemoryCacheProducer");
       CacheKey uCacheKey = op.b.b(p1.b(), p1.h());
       a uoa = op.a.get(uCacheKey);
       String str = "memory_encoded";
       b = true;
       Map map = null;
       if (uoa != null) {
          d uod = new d(uoa);
          if (uoe0.requiresExtraMap(uoc0, "EncodedMemoryCacheProducer")) {
             map = ImmutableMap.of("cached_value_found", "true");
          }
          uoe0.onProducerFinishWithSuccess(uoc0, "EncodedMemoryCacheProducer", map);
          uoe0.onUltimateProducerReached(uoc0, "EncodedMemoryCacheProducer", b);
          uoc0.o(str);
          oi.a(0x3f800000);
          oi.d(uod, b);
          d.b(uod);
          a.f(uoa);
          if (b.d()) {
             b.b();
          }
          return;
       }else if(p1.q().getValue() >= ImageRequest$RequestLevel.ENCODED_MEMORY_CACHE.getValue()){
          Map map1 = (uoe0.requiresExtraMap(uoc0, "EncodedMemoryCacheProducer"))? ImmutableMap.of("cached_value_found", "false"): map;
          uoe0.onProducerFinishWithSuccess(uoc0, "EncodedMemoryCacheProducer", map1);
          uoe0.onUltimateProducerReached(uoc0, "EncodedMemoryCacheProducer", false);
          uoc0.n(str, "nil-result");
          oi.d(map, b);
          a.f(uoa);
          if (b.d()) {
             b.b();
          }
          return;
       }else {
          p$a uoa1 = new p$a(p0, op.a, uCacheKey, p1.b().v(), p1.c().h().w);
          if (uoe0.requiresExtraMap(uoc0, "EncodedMemoryCacheProducer")) {
             map = ImmutableMap.of("cached_value_found", "false");
          }
          uoe0.onProducerFinishWithSuccess(uoc0, "EncodedMemoryCacheProducer", map);
          op.c.produceResults(v15, uoc0);
          a.f(uoa);
          if (b.d()) {
             b.b();
          }
          return;
       }
    }
}
