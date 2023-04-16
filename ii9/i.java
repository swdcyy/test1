package ii9.i;
import eg9.c;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.base.d;
import ii9.i$a;
import ii9.h;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import android.view.View;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import eg9.j;
import com.kwai.camerasdk.videoCapture.CameraController;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;

public class i extends c	// class@00283b
{
    public boolean t;

    public void i(CameraPageType p0,b p1){
       super(p0, p1);
       this.d.n(i$a.class, new h(this));
    }
    public void f2(View p0,boolean p1){
       int i;
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, oi, "1")) {
          return;
       }
       d th = this.h;
       i = 0;
       if (th == null || this.r != null) {
          Object[] objArray = new Object[i];
          a.D().w("WhatsUpSwitchCameraController", "abort switchCamera", objArray);
          return;
       }else {
          this.t = th.isFrontCamera() ^ 0x01;
          Object[] objArray1 = new Object[i];
          a.D().w("WhatsUpSwitchCameraController", "switchCamera to front:"+this.t, objArray1);
          super.f2(p0, p1);
          return;
       }
    }
}
