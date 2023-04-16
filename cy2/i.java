package cy2.i;
import v71.b;
import cy2.h;
import u71.a;
import q00.b;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import k2b.u1;
import v71.a;
import u71.e;

public final class i implements b	// class@002406
{
    public final h b;
    public final a c;
    public final b d;

    public void i(h p0,a p1,b p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void B3(int p0,Exception p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oi, "2")) {
          return;
       }
       a.p(p1, "e");
       this.b.a = null;
       b.H(LiveLogTag.LIVE_CAMERA, "onOpenCameraFailed", "errorCode", Integer.valueOf(p0), p1);
       u1.R("VoicePartyKtvAudienceCameraController onOpenCameraFailed", String.valueOf(p0), 3);
       return;
    }
    public void G(){
       a.a(this);
    }
    public void N(long p0,long p1){
       a.e(this, p0, p1);
    }
    public void t1(){
       a.c(this);
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       e cameraCaptur = this.c.getCameraCaptureSize();
       e uoe = this.c.H();
       b.d0(LiveLogTag.LIVE_CAMERA, "onCameraOpened", "captureSize", cameraCaptur, "previewSize", uoe);
       if (cameraCaptur != null) {
          this.d.x(cameraCaptur.getWidth(), cameraCaptur.getHeight());
       }
       if (uoe != null) {
          this.d.n(uoe.getWidth(), uoe.getHeight());
       }
       return;
    }
}
