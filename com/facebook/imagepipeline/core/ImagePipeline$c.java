package com.facebook.imagepipeline.core.ImagePipeline$c;
import ab.h;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.Object;
import com.facebook.imagepipeline.request.ImageRequest$RequestLevel;
import dd.d;
import java.lang.String;
import kb.c;
import ab.d$b;
import ab.d;
import android.net.Uri;

public class ImagePipeline$c implements h	// class@0010f0
{
    public final ImageRequest a;
    public final Object b;
    public final ImageRequest$RequestLevel c;
    public final d d;
    public final String e;
    public final ImagePipeline f;

    public void ImagePipeline$c(ImagePipeline p0,ImageRequest p1,Object p2,ImageRequest$RequestLevel p3,d p4,String p5){
       this.f = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       super();
    }
    public Object get(){
       return this.f.fetchDecodedImage(this.a, this.b, this.c, this.d, this.e);
    }
    public String toString(){
       d$b uob = d.c(this);
       uob.b("uri", this.a.s());
       return uob.toString();
    }
}
