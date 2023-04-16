package com.yxcorp.gifshow.camerasdk.j$d;
import com.kwai.camerasdk.videoCapture.CameraController$d;
import com.yxcorp.gifshow.camerasdk.j;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import qi9.u0;
import java.lang.Runnable;
import ekd.k1;
import qi9.t0;

public class j$d implements CameraController$d	// class@00101d
{
    public final j b;

    public void j$d(j p0){
       this.b = p0;
       super();
    }
    public void N(long p0,long p1){
       j$d uod = j$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, uod, "2")) {
          return;
       }
       this.b.v = Long.valueOf(p0);
       this.b.w = Long.valueOf(p1);
       u0 ou0 = new u0(this, p0, p1);
       k1.o(uod);
       return;
    }
    public void O(long p0){
       j$d uod = j$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uod, "1")) {
          return;
       }
       this.b.v = Long.valueOf(p0);
       k1.o(new t0(this, p0));
       return;
    }
}
