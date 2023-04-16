package com.yxcorp.gifshow.camerasdk.j$o;
import com.kwai.video.westeros.Westeros$OnBacklightDetectListener;
import com.yxcorp.gifshow.camerasdk.j;
import qi9.r1;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;

public class j$o implements Westeros$OnBacklightDetectListener	// class@001028
{
    public final r1 a;
    public final j b;

    public void j$o(j p0,r1 p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onBacklightDetectorResult(boolean p0){
       j$o oo = j$o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oo, "1")) {
          return;
       }
       oo = this.a;
       if (oo != null) {
          oo.onBacklightDetectorResult(p0);
       }
       return;
    }
}
