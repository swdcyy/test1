package eg9.e;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView$a;
import eg9.j;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.camerasdk.videoCapture.CameraController;

public final class e implements AnimCameraView$a	// class@00213b
{
    public final j a;
    public final boolean b;

    public void e(j p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(){
       e tb = this.b;
       d h = this.a.h;
       if (h != null) {
          h.switchCamera(tb);
       }
       return;
    }
}
