package b65.b;
import java.lang.Object;
import android.content.Context;
import com.kwai.camerasdk.models.DaenerysCaptureConfig;
import com.kwai.camerasdk.videoCapture.CameraController$g;
import com.kwai.camerasdk.videoCapture.CameraController;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.camerasdk.render.OpengGL.EglBase$Context;
import com.kwai.camerasdk.videoCapture.CameraController$b;
import com.kwai.camerasdk.videoCapture.CameraController$f;
import com.kwai.camerasdk.videoCapture.MultiCameraControllerImpl;
import com.kwai.camerasdk.videoCapture.CameraControllerImpl;
import com.kwai.camerasdk.videoCapture.CameraController$c;
import java.lang.Boolean;
import com.kwai.camerasdk.models.CameraApiVersion;

public class b	// class@000347
{

    public void b(){
       super();
    }
    public static CameraController a(Context p0,DaenerysCaptureConfig p1,CameraController$g p2){
       object oobject;
       CameraController uCameraContr;
       b obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = PatchProxy.applyFourRefs(p0, p1, p2, null, null, b.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = b.class;
          if (PatchProxy.isSupport(obj)) {
             Object[] objArray = new Object[]{p0,p1,p2,oobject,oobject};
             oobject = null;
             uCameraContr = PatchProxy.apply(objArray, oobject, obj, "5");
             if (uCameraContr != PatchProxyResult.class) {
             }
          }
          uCameraContr = b.b(p0, p1, p2, null, null, null);
       }
       return obj;
    }
    public static CameraController b(Context p0,DaenerysCaptureConfig p1,CameraController$g p2,EglBase$Context p3,CameraController$b p4,CameraController$f p5){
       CameraControllerImpl obj;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          obj = PatchProxy.apply(objArray, null, uob, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (b.c(p0, p1)) {
          MultiCameraControllerImpl multiCameraC = new MultiCameraControllerImpl(p0, p1, p2, p4, p5);
          return p3;
       }else {
          obj = new CameraControllerImpl(p0, p1, p2, null, p3, false, p4, p5);
          return v9;
       }
    }
    public static boolean c(Context p0,DaenerysCaptureConfig p1){
       boolean b;
       CameraApiVersion obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = CameraApiVersion.kAndroidCameraVivo;
       b = (p1.getCameraApiVersion() == obj && CameraController.supportApi(obj, p0))? true: false;
       return b;
    }
}
