package com.facebook.imagepipeline.core.ImagePipeline$h;
import ab.f;
import com.facebook.imagepipeline.core.ImagePipeline;
import android.net.Uri;
import java.lang.Object;
import com.facebook.cache.common.CacheKey;

public class ImagePipeline$h implements f	// class@0010f5
{
    public final Uri a;
    public final ImagePipeline b;

    public void ImagePipeline$h(ImagePipeline p0,Uri p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public boolean apply(Object p0){
       return p0.c(this.a);
    }
}
