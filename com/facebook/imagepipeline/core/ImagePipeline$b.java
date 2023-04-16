package com.facebook.imagepipeline.core.ImagePipeline$b;
import ab.h;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.Object;
import com.facebook.imagepipeline.request.ImageRequest$RequestLevel;
import dd.d;
import kb.c;
import java.lang.String;
import ab.d$b;
import ab.d;
import android.net.Uri;

public class ImagePipeline$b implements h	// class@0010ef
{
    public final ImageRequest a;
    public final Object b;
    public final ImageRequest$RequestLevel c;
    public final d d;
    public final ImagePipeline e;

    public void ImagePipeline$b(ImagePipeline p0,ImageRequest p1,Object p2,ImageRequest$RequestLevel p3,d p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public Object get(){
       return this.e.fetchDecodedImage(this.a, this.b, this.c, this.d);
    }
    public String toString(){
       d$b uob = d.c(this);
       uob.b("uri", this.a.s());
       return uob.toString();
    }
}
