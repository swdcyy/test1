package bib.e;
import java.lang.Runnable;
import bib.k;
import java.lang.Object;
import java.lang.String;
import dc5.c;
import com.kwai.camerasdk.videoCapture.CameraController;
import java.lang.StringBuilder;

public final class e implements Runnable	// class@0003d3
{
    public final k b;

    public void e(k p0){
       this.b = p0;
    }
    public final void run(){
       k c;
       e tb = this.b;
       if (tb.i != null) {
          c.c("IMRTCVideoWrapper", "switchCamera, has released, return");
       }else {
          c = tb.c;
          if (c == null) {
             c.c("IMRTCVideoWrapper", "mCameraController is null");
          }else {
             int b = c.isFrontCamera();
             b = b ^ 0x01;
             c.g("IMRTCVideoWrapper", "switchCamera, now is front = "+b+", switch to"+b);
             tb.c.switchCamera(b);
          }
       }
       return;
    }
}
