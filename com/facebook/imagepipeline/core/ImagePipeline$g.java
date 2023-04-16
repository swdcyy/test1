package com.facebook.imagepipeline.core.ImagePipeline$g;
import bolts.a;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.cache.common.CacheKey;
import java.lang.Object;
import bolts.Task;
import java.lang.Boolean;
import tc.g;

public class ImagePipeline$g implements a	// class@0010f4
{
    public final CacheKey a;
    public final ImagePipeline b;

    public void ImagePipeline$g(ImagePipeline p0,CacheKey p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public Object a(Task p0){
       p0 = (!p0.isCancelled() && (!p0.isFaulted() && p0.getResult().booleanValue()))? Task.forResult(Boolean.TRUE): this.b.mSmallImageBufferedDiskCache.d(this.a);
       return p0;
    }
}
