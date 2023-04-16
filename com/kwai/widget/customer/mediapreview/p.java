package com.kwai.widget.customer.mediapreview.p;
import erd.o;
import java.lang.Object;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import kb.c;

public final class p implements o	// class@00113f
{
    public static final p b;

    static {
       p.b = new p();
    }
    public void p(){
       super();
    }
    public final Object apply(Object p0){
       return Fresco.getImagePipeline().prefetchToBitmapCache(p0, null);
    }
}
