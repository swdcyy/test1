package mg9.a;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import oc9.b0;
import oc9.a0;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.camerasdk.q;
import java.io.File;
import gn6.a;

public final class a extends d0	// class@003029
{
    public boolean o;

    public void a(CameraPageType p0,b p1){
       a.p(p0, "pageType");
       a.p(p1, "callerContext");
       super(p0, p1);
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       a0.i(this);
       if (this.o != null) {
          d th = this.h;
          if (th != null) {
             th.r0(true);
          }
       }
       return;
    }
    public void nb(q p0){
       a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "camera");
       super.nb(p0);
       a = a.a;
       boolean b = new File(a.b()).exists();
       this.o = b;
       if (b) {
          p0.I0(a.b());
       }
       return;
    }
}
