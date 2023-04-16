package com.yxcorp.gifshow.camerasdk.j$c;
import com.kwai.camerasdk.videoCapture.CameraController$b;
import com.yxcorp.gifshow.camerasdk.j;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import qi9.s0;
import java.lang.Runnable;
import ekd.k1;

public class j$c implements CameraController$b	// class@00101c
{
    public final j a;

    public void j$c(j p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0){
       if (PatchProxy.isSupport(j$c.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, j$c.class, "1")) {
          return;
       }
       k1.o(new s0(this));
       return;
    }
}
