package com.feature.post.bridge.s;
import erd.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.post.api.feature.bridge.JsVideoCaptureParams;
import f55.g;
import java.lang.Object;
import om6.o;
import mg.a2;
import java.io.Serializable;
import n3d.a;

public final class s implements g	// class@0014b9
{
    public final GifshowActivity b;
    public final JsVideoCaptureParams c;
    public final g d;

    public void s(GifshowActivity p0,JsVideoCaptureParams p1,g p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       p0.zD(this.b, this.c, 4, new a2(this.d));
    }
}
