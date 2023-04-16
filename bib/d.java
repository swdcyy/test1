package bib.d;
import java.lang.Runnable;
import bib.k;
import java.lang.Object;
import java.lang.String;
import dc5.c;
import com.kwai.camerasdk.videoCapture.CameraController;

public final class d implements Runnable	// class@0003d2
{
    public final k b;

    public void d(k p0){
       this.b = p0;
    }
    public final void run(){
       d tb = this.b;
       if (tb.i != null) {
          c.c("IMRTCVideoWrapper", "stopCapture, has released, return");
       }else if(tb.c == null){
          c.c("IMRTCVideoWrapper", "mCameraController is null");
       }else {
          c.g("IMRTCVideoWrapper", "real stopCapture");
          tb.c.stopPreview();
       }
       return;
    }
}
