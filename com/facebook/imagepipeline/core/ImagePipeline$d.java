package com.facebook.imagepipeline.core.ImagePipeline$d;
import ab.h;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.Object;
import kb.c;
import java.lang.String;
import ab.d$b;
import ab.d;
import android.net.Uri;

public class ImagePipeline$d implements h	// class@0010f1
{
    public final ImageRequest a;
    public final Object b;
    public final ImagePipeline c;

    public void ImagePipeline$d(ImagePipeline p0,ImageRequest p1,Object p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public Object get(){
       return this.c.fetchEncodedImage(this.a, this.b);
    }
    public String toString(){
       d$b uob = d.c(this);
       uob.b("uri", this.a.s());
       return uob.toString();
    }
}
