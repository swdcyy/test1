package com.yxcorp.gifshow.camera.record.widget.CameraView$b;
import android.os.Handler;
import com.yxcorp.gifshow.camera.record.widget.CameraView;
import android.os.Looper;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.widget.FocusView;
import java.util.Objects;
import android.view.View;
import java.lang.Runnable;

public class CameraView$b extends Handler	// class@000fbf
{
    public final CameraView a;

    public void CameraView$b(CameraView p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraView$b.class, "1")) {
          return;
       }
       super.handleMessage(p0);
       if (this.a.e.d()) {
          CameraView e = this.a.e;
          Objects.requireNonNull(e);
          if (!PatchProxy.applyVoid(null, e, FocusView.class, "8") && e.b != null) {
             e.m = true;
             boolean b = false;
             e.l = b;
             if (e.k == null) {
                e.a(b, 200);
             }else {
                e.invalidate();
             }
             e.k = true;
             e.removeCallbacks(e);
             e.postDelayed(e, 1000);
          }
       }
       this.removeMessages(1);
       return;
    }
}
