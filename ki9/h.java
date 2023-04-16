package ki9.h;
import u07.u;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class h implements u	// class@002c95
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "<anonymous parameter 1>");
       if (!PatchProxy.applyVoid(null, null, CameraLogger.class, "42")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.name = "PRODUCE_HEAD_PENDANT_DIALOG";
          i3 oi3 = i3.f();
          oi3.d("dialog_type", "FUNCTION");
          uElementPack.params = oi3.e();
          u1.u(1, uElementPack, null);
       }
       return;
    }
}
