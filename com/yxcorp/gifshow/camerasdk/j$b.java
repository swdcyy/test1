package com.yxcorp.gifshow.camerasdk.j$b;
import com.kwai.camerasdk.videoCapture.CameraController$g;
import com.yxcorp.gifshow.camerasdk.j;
import qi9.c;
import java.lang.Object;
import com.kwai.camerasdk.ErrorCode$Result;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qi9.q1;
import java.lang.StringBuilder;
import java.lang.Throwable;
import q87.c;
import qi9.r0;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.camerasdk.videoCapture.CameraController;
import com.kwai.camerasdk.videoCapture.CameraController$CameraState;
import qi9.q0;

public class j$b implements CameraController$g	// class@00101b
{
    public final c a;
    public final j b;

    public void j$b(j p0,c p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void i1(ErrorCode$Result p0,Exception p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j$b.class, "2")) {
          return;
       }
       q1.C().e("CameraSDK", "onOpenCameraFailed errorCode = "+p0+" Exception = ", p1);
       if (this.b.t != null) {
          k1.o(new r0(this, p0, p1));
       }
       return;
    }
    public void j1(CameraController p0,CameraController$CameraState p1,CameraController$CameraState p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, j$b.class, "1")) {
          return;
       }
       if (p1 == CameraController$CameraState.PreviewState && p2 == CameraController$CameraState.OpeningState) {
          int i = 0;
          Object[] objArray = new Object[i];
          q1.C().s("CameraSDK", "onStateChange onCameraOpened", objArray);
          if (!this.b.isMultiCamera() && (this.a.s0 != null && this.b.J != null)) {
             p0.n = i;
             Object[] objArray1 = new Object[i];
             q1.C().s("CameraSDK", "need reset SurfaceView", objArray1);
          }
       label_0048 :
          this.b.D1();
       }else if(p1 == CameraController$CameraState.IdleState && p2 == CameraController$CameraState.ClosingState){
          k1.o(new q0(this));
       }
       return;
    }
}
