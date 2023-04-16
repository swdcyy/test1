package b65.h;
import java.lang.Runnable;
import com.kwai.camerasdk.Daenerys;
import com.kwai.camerasdk.videoCapture.CameraController;
import java.lang.Object;

public final class h implements Runnable	// class@00034d
{
    public final Daenerys b;
    public final CameraController c;

    public void h(Daenerys p0,CameraController p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       h tb = this.b;
       tb.nativeSetCameraController(tb.c, this.c.getNativeCameraController());
    }
}
