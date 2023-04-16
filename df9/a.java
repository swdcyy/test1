package df9.a;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import df9.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicRecordingControlListener;
import com.yxcorp.gifshow.camerasdk.q;
import oc9.w;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import android.view.View;
import java.util.Objects;

public final class a extends d0	// class@001f24
{
    public final b o;

    public void a(CameraPageType p0,b p1){
       a.p(p0, "pageType");
       a.p(p1, "callerContext");
       super(p0, p1);
       this.o = new b();
    }
    public void G(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       d th = this.h;
       if (th != null) {
          th.G0(null);
       }
       return;
    }
    public final w g2(){
       d obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       a.o(obj, "mCallerContext");
       w ow = obj.b();
       a.o(ow, "mCallerContext.controllerManager");
       return ow;
    }
    public final boolean h2(){
       d obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.d;
       a.o(obj, "mCallerContext");
       BaseFragment uBaseFragmen = obj.f();
       a.o(uBaseFragmen, "mCallerContext.fragment");
       return uBaseFragmen.isResumed();
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       super.k(p0);
       a to = this.o;
       Objects.requireNonNull(to);
       if (!PatchProxy.applyVoidOneRefs(this, to, b.class, "1")) {
          a.p(this, "magicRecordController");
          to.a = this;
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       super.onDestroyView();
       this.o.a = null;
       return;
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       d th = this.h;
       if (th != null) {
          th.G0(this.o);
       }
       return;
    }
}
