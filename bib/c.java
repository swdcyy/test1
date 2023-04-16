package bib.c;
import java.lang.Runnable;
import bib.k;
import java.lang.Object;
import java.lang.String;
import dc5.c;
import com.kwai.camerasdk.videoCapture.CameraController;
import mw5.e;
import lw5.b;

public final class c implements Runnable	// class@0003d1
{
    public final k b;

    public void c(k p0){
       this.b = p0;
    }
    public final void run(){
       c tb = this.b;
       if (tb.i != null) {
          c.c("IMRTCVideoWrapper", "startCapture, has released, return");
       }else if(tb.c == null){
          c.c("IMRTCVideoWrapper", "mCameraController is null");
       }else {
          c.g("IMRTCVideoWrapper", "real startCapture");
          tb.c.resumePreview();
          tb.g.a(tb);
       }
       return;
    }
}
