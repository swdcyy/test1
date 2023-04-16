package com.yxcorp.gifshow.camerasdk.p;
import com.yxcorp.gifshow.camerasdk.j;
import java.lang.Object;
import com.kwai.video.westeros.processors.WesterosFrameAttributesDumpProcessor;
import com.kwai.camerasdk.models.Rect;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import qi9.q1;
import q87.c;
import l65.a;
import com.yxcorp.gifshow.camerasdk.p$a;
import com.yxcorp.gifshow.camerasdk.p$c;
import com.kwai.video.westeros.processors.WesterosFrameAttributesDumpProcessor$OnFacesArrayListener;

public class p	// class@00103d
{
    public final j a;
    public final WesterosFrameAttributesDumpProcessor b;
    public p$b c;
    public p$a d;
    public p$c e;
    public static long f;

    public void p(j p0){
       super();
       this.a = p0;
       this.b = new WesterosFrameAttributesDumpProcessor();
    }
    public final float a(Rect p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return ((p0.getBottom() - p0.getTop()) * (p0.getRight() - p0.getLeft()));
    }
    public WesterosFrameAttributesDumpProcessor b(){
       return this.b;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, p.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().s("FaceTracer", "release", objArray);
       this.b.release();
       return;
    }
    public void d(p$a p0){
       this.d = p0;
    }
    public void e(p$c p0){
       this.e = p0;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, p.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().s("FaceTracer", "stop", objArray);
       this.b.setFacesArrayListener(null);
       this.b.stop();
       return;
    }
}
