package bc9.r;
import z3b.t0;
import bc9.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.camera.record.CameraActivity;
import e17.i;
import com.yxcorp.gifshow.camera.record.assistant.a;
import ec9.j;
import cc9.c;
import sa6.a;
import w46.b;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.camera.record.base.b;
import androidx.fragment.app.Fragment;
import cc9.e;
import com.yxcorp.gifshow.camera.record.assistant.utils.AssistantUtils;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantResponse;
import nsd.u;

public final class r implements t0	// class@000403
{
    public final l a;

    public void r(l p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, r.class, "3")) {
          return;
       }
       this.a.i2(false);
       Object[] objArray = new Object[false];
       a.D().w("CameraAssistant", "download model onNetworkUnconnected", objArray);
       if (this.a.e instanceof CameraActivity) {
          i.a(R.style.arg_RES_7f110668, 0x7f1041e3);
          this.a.g2().g().w0(new c(3));
       }
       return;
    }
    public void onFailed(){
       if (PatchProxy.applyVoid(null, this, r.class, "2")) {
          return;
       }
       this.a.i2(false);
       Object[] objArray = new Object[false];
       a.D().t("CameraAssistant", "download model onFailed", objArray);
       r ta = this.a;
       if (ta.e instanceof CameraActivity) {
          ta.g2().g().w0(new c(3));
       }
       return;
    }
    public void onSuccess(){
       if (PatchProxy.applyVoid(null, this, r.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("CameraAssistant", "download model success", objArray);
       this.a.i2(0);
       d d = this.a.d;
       String str = "mCallerContext";
       a.o(d, str);
       BaseFragment uBaseFragmen = d.f();
       a.o(uBaseFragmen, "mCallerContext.fragment");
       if (uBaseFragmen.isResumed() && (this.a.g2().D() && this.a.g2().y())) {
          d d1 = this.a.d;
          a.o(d1, str);
          e uoe = new e(AssistantUtils.d.m(d1), 0, false, null, 12, null);
          this.a.g2().g().w0(v9);
       }else {
          this.a.G = true;
       }
       return;
    }
}
