package com.facebook.imagepipeline.core.ImagePipeline$f;
import bolts.a;
import com.facebook.imagepipeline.core.ImagePipeline;
import kb.i;
import java.lang.Object;
import bolts.Task;
import java.lang.Boolean;

public class ImagePipeline$f implements a	// class@0010f3
{
    public final i a;
    public final ImagePipeline b;

    public void ImagePipeline$f(ImagePipeline p0,i p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public Object a(Task p0){
       ImagePipeline$f ta = this.a;
       boolean b = (!p0.isCancelled() && (!p0.isFaulted() && p0.getResult().booleanValue()))? true: false;
       ta.q(Boolean.valueOf(b));
       return null;
    }
}
