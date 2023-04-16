package bib.i;
import com.kwai.camerasdk.videoCapture.CameraController$g;
import bib.k;
import java.lang.Object;
import com.kwai.camerasdk.ErrorCode$Result;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.Throwable;
import dc5.c;
import com.kwai.camerasdk.videoCapture.CameraController;
import com.kwai.camerasdk.videoCapture.CameraController$CameraState;
import java.lang.Enum;

public class i implements CameraController$g	// class@0003d7
{
    public final k a;

    public void i(k p0){
       this.a = p0;
       super();
    }
    public void i1(ErrorCode$Result p0,Exception p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i.class, "2")) {
          return;
       }
       i ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, ta, k.class, "3")) {
          c.d("IMRTCVideoWrapper", "onOpenCameraFailed errorCode="+p0, p1);
       }
       return;
    }
    public void j1(CameraController p0,CameraController$CameraState p1,CameraController$CameraState p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, i.class, "1")) {
          return;
       }
       i ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, ta, k.class, "2")) {
          String str = "";
          String str1 = (p1 != null)? p1.name(): str;
          if (p2 != null) {
             str = p2.name();
          }
          c.g("IMRTCVideoWrapper", "stateFront=["+str1+"] stateBack=["+str);
       }
       return;
    }
}
