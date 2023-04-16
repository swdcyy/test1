package bc9.l$f;
import cc9.i;
import bc9.l;
import java.lang.Object;
import cc9.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.assistant.a;
import java.util.List;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantResponse;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.camera.record.intelligentidentify.a;
import com.yxcorp.gifshow.camera.record.intelligentidentify.ui.a$b;
import android.app.Activity;
import com.yxcorp.gifshow.camera.record.assistant.utils.AssistantUtils;
import java.lang.CharSequence;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.camera.record.base.b;
import k2b.e0;
import qd9.f;
import w46.b;
import e17.i;
import bc9.k;
import g9c.a;
import com.yxcorp.gifshow.camera.record.CameraActivity;
import ec9.j;
import cc9.c;
import sa6.a;

public final class l$f implements i	// class@0003f8
{
    public final l a;

    public void l$f(l p0){
       this.a = p0;
       super();
    }
    public void a(Object p0){
       l ol = l.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, l$f.class, "1")) {
       }else {
          a.p(p0, "newState");
          l$f ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidOneRefs(p0, ta, ol, "16") && (p0.e() && ta.J.z() != p0.d())) {
             ta.J.H(p0.d());
             l r = ta.r;
             if (r != null) {
                List templateList = r.getTemplateList();
                if (templateList == null || templateList.isEmpty() != true) {
                }
             }else if(ta.J.z()){
                Object[] objArray1 = new Object[0];
                a.D().w("CameraAssistant", "show detecting toast", objArray1);
                d e = ta.e;
                if (e != null) {
                   a$b uob = new a$b(e);
                   AssistantUtils d = AssistantUtils.d;
                   uob.b(d.l(R.string.arg_RES_7f10418b));
                   uob.c = d.l(0x7f10418a);
                   uob.a(-1);
                   ta.J.v().b(uob);
                }
             }else {
                ta.J.v().a(0);
             }
          }
       label_00a0 :
          ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidOneRefs(p0, ta, ol, "17") && (p0.e() && ta.w != p0.c())) {
             boolean b = p0.c();
             ta.w = b;
             if (b && ta.J.D()) {
                b = ta.d;
                a.o(b, "mCallerContext");
                f.a(b.f());
                Object[] objArray = new Object[0];
                a.D().t("CameraAssistant", "detect error", objArray);
                i.a(R.style.arg_RES_7f110668, 0x7f1041e3);
                b = ta.J.p();
                if (b == null || (b.R0() && ta.e instanceof CameraActivity)) {
                   ta.J.g().w0(new c(3));
                }
             }
          }
       }
    label_0113 :
       return;
    }
}
