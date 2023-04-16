package ii9.v$a;
import android.os.Handler;
import ii9.v;
import android.os.Looper;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.camerasdk.q;
import j8c.a;
import q87.c;

public class v$a extends Handler	// class@002848
{
    public final v a;

    public void v$a(v p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$a.class, "1")) {
          return;
       }
       Object[] objArray = 1;
       if (p0.what == objArray) {
          d h = this.a.h;
          if (h == null) {
             return;
          }else {
             int i = 0;
             if (h.M()) {
                objArray = new Object[i];
                a.D().w("WhatsUpTakePicture", "HideCoverView time out runnable run", objArray);
                this.a.h2();
             }else {
                Object[] objArray1 = new Object[i];
                a.D().w("WhatsUpTakePicture", "camera isn\'t opened, continue wait", objArray1);
                this.a.I.sendEmptyMessageDelayed(objArray, 0x2710);
             }
          }
       }
       return;
    }
}
