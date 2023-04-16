package com.facebook.imagepipeline.core.ImagePipeline$a;
import ab.h;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.Object;
import com.facebook.imagepipeline.request.ImageRequest$RequestLevel;
import kb.c;
import java.lang.String;
import ab.d$b;
import ab.d;
import android.net.Uri;

public class ImagePipeline$a implements h	// class@0010ee
{
    public final ImageRequest a;
    public final Object b;
    public final ImageRequest$RequestLevel c;
    public final ImagePipeline d;

    public void ImagePipeline$a(ImagePipeline p0,ImageRequest p1,Object p2,ImageRequest$RequestLevel p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public Object get(){
       return this.d.fetchDecodedImage(this.a, this.b, this.c);
    }
    public String toString(){
       d$b uob = d.c(this);
       uob.b("uri", this.a.s());
       return uob.toString();
    }
}
