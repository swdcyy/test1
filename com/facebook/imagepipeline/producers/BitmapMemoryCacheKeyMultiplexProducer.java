package com.facebook.imagepipeline.producers.BitmapMemoryCacheKeyMultiplexProducer;
import id.w;
import tc.h;
import id.b0;
import java.lang.String;
import com.facebook.common.references.a;
import java.io.Closeable;
import id.c0;
import android.util.Pair;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.Object;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.request.ImageRequest$RequestLevel;

public class BitmapMemoryCacheKeyMultiplexProducer extends w	// class@001114
{
    public final h mCacheKeyFactory;

    public void BitmapMemoryCacheKeyMultiplexProducer(h p0,b0 p1){
       super(p1, "BitmapMemoryCacheKeyMultiplexProducer", "multiplex_bmp_cnt");
       this.mCacheKeyFactory = p0;
    }
    public a cloneOrNull(a p0){
       return a.d(p0);
    }
    public Closeable cloneOrNull(Closeable p0){
       return this.cloneOrNull(p0);
    }
    public Pair getKey(c0 p0){
       return Pair.create(this.mCacheKeyFactory.c(p0.b(), p0.h()), p0.q());
    }
    public Object getKey(c0 p0){
       return this.getKey(p0);
    }
}
