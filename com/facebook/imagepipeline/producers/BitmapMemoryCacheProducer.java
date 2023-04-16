package com.facebook.imagepipeline.producers.BitmapMemoryCacheProducer;
import id.b0;
import tc.v;
import tc.h;
import java.lang.Object;
import bd.e;
import id.c0;
import java.util.Map;
import java.lang.String;
import id.i;
import kd.b;
import id.e0;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.a;
import com.facebook.imagepipeline.image.a;
import bd.h;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.imagepipeline.request.ImageRequest$RequestLevel;
import com.facebook.imagepipeline.producers.BitmapMemoryCacheProducer$a;

public class BitmapMemoryCacheProducer implements b0	// class@001116
{
    public final h mCacheKeyFactory;
    public final b0 mInputProducer;
    public final v mMemoryCache;

    public void BitmapMemoryCacheProducer(v p0,h p1,b0 p2){
       super();
       this.mMemoryCache = p0;
       this.mCacheKeyFactory = p1;
       this.mInputProducer = p2;
    }
    public static void maybeSetExtrasFromCloseableImage(e p0,c0 p1){
       p1.f(p0.getExtras());
    }
    public String getOriginSubcategory(){
       return "pipe_bg";
    }
    public String getProducerName(){
       return "BitmapMemoryCacheProducer";
    }
    public void produceResults(i p0,c0 p1){
       boolean b;
       String producerName1;
       if (b.d()) {
          b.a("BitmapMemoryCacheProducer#produceResults");
       }
       e0 uoe0 = p1.l();
       uoe0.onProducerStart(p1, this.getProducerName());
       CacheKey uCacheKey = this.mCacheKeyFactory.c(p1.b(), p1.h());
       a uoa = this.mMemoryCache.get(uCacheKey);
       Map map = null;
       if (uoa != null) {
          BitmapMemoryCacheProducer.maybeSetExtrasFromCloseableImage(uoa.j(), p1);
          b = uoa.j().a().a();
          if (b) {
             String producerName = this.getProducerName();
             Map map1 = (uoe0.requiresExtraMap(p1, this.getProducerName()))? ImmutableMap.of("cached_value_found", "true"): map;
             uoe0.onProducerFinishWithSuccess(p1, producerName, map1);
             uoe0.onUltimateProducerReached(p1, this.getProducerName(), true);
             p1.n("memory_bitmap", this.getOriginSubcategory());
             p0.a(0x3f800000);
          }
          p0.d(uoa, b);
          uoa.close();
          if (b) {
             if (b.d()) {
                b.b();
             }
             return;
          }
       }
       if (p1.q().getValue() >= ImageRequest$RequestLevel.BITMAP_MEMORY_CACHE.getValue()) {
          producerName1 = this.getProducerName();
          Map map2 = (uoe0.requiresExtraMap(p1, this.getProducerName()))? ImmutableMap.of("cached_value_found", "false"): map;
          uoe0.onProducerFinishWithSuccess(p1, producerName1, map2);
          uoe0.onUltimateProducerReached(p1, this.getProducerName(), false);
          p1.n("memory_bitmap", this.getOriginSubcategory());
          p0.d(map, true);
          if (b.d()) {
             b.b();
          }
          return;
       }else {
          p0 = this.wrapConsumer(p0, uCacheKey, p1.b().v());
          producerName1 = this.getProducerName();
          if (uoe0.requiresExtraMap(p1, this.getProducerName())) {
             map = ImmutableMap.of("cached_value_found", "false");
          }
          uoe0.onProducerFinishWithSuccess(p1, producerName1, map);
          if (b.d()) {
             b.a("mInputProducer.produceResult");
          }
          this.mInputProducer.produceResults(p0, p1);
          if (b.d()) {
             b.b();
          }
          if (b.d()) {
             b.b();
          }
          return;
       }
    }
    public i wrapConsumer(i p0,CacheKey p1,boolean p2){
       return new BitmapMemoryCacheProducer$a(this, p0, p1, p2);
    }
}
