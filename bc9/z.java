package bc9.z;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.assistant.a;
import dc9.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qr4.k$a;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import cc9.n;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.yxcorp.gifshow.camera.record.assistant.utils.AssistantUtils;
import cc9.q;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.record.base.d;
import ui9.f;
import ui9.j;
import ui9.f$d;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.rx.RxBus;
import j4b.f;
import android.content.Context;
import com.yxcorp.gifshow.camerasdk.q;
import j8c.a;
import q87.c;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.camera.record.assistant.a$b;
import bc9.z$b;
import cc9.i;
import bc9.z$c;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import bc9.z$d;
import erd.g;
import crd.b;
import eoc.f;
import android.content.Intent;
import ke9.b;
import bc9.z$a;
import com.yxcorp.gifshow.camera.record.base.b$a;

public final class z extends d0	// class@000418
{
    public b o;
    public n p;
    public m q;
    public boolean r;
    public q s;
    public View t;
    public MagicEmoji$MagicFace u;
    public final a v;
    public final b w;

    public void z(CameraPageType p0,b p1,a p2,b p3){
       a.p(p0, "pageType");
       a.p(p1, "callerContext");
       a.p(p2, "assistContext");
       a.p(p3, "viewHelper");
       super(p0, p1);
       this.v = p2;
       this.w = p3;
    }
    public void L3(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "4")) {
          return;
       }
       if (p0 != null && this.p != null) {
          a e = p0.e;
          String str = "info.mVideoContext";
          a.o(e, str);
          k$a uoa = e.J();
          if (uoa == null) {
             uoa = new k$a();
          }
          z tp = this.p;
          a.m(tp);
          uoa.c = tp.c().mId;
          a e1 = p0.e;
          a.o(e1, str);
          e1.I1(uoa);
          p0 = p0.e;
          a.o(p0, str);
          k$a uoa1 = p0.J();
          String str1 = AssistantUtils.d.h(this.s);
          if (str1 == null) {
             str1 = "";
          }
          uoa1.h = str1;
       }
       return;
    }
    public final a g2(){
       return this.v;
    }
    public final MagicEmoji$MagicFace h2(){
       Object[] objArray = null;
       d obj = PatchProxy.apply(objArray, this, z.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g;
       if (obj != null) {
          f uof = obj.O0();
          if (uof != null) {
             uof = uof.a;
             if (uof != null) {
                objArray = uof.a;
             }
          }
       }
       return objArray;
    }
    public final void i2(boolean p0){
       z oz = z.class;
       if (PatchProxy.isSupport(oz) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oz, "5")) {
          return;
       }
       MagicEmoji$MagicFace magicFace = null;
       if (p0) {
          RxBus.f.b(new f(magicFace, this.e));
          if (this.v.B()) {
             this.u = magicFace;
          }
       }
       d th = this.h;
       boolean b = false;
       if (th != null) {
          th.x0(b);
       }
       this.p = magicFace;
       Object[] objArray = new Object[b];
       a.D().w("CameraAssistant", "onMagicItemUnselected", objArray);
       return;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "2")) {
          return;
       }
       super.k(p0);
       this.t = m1.f(p0, 0x7f0a3d49);
       this.v.q().c(new z$b(this));
       this.v.f().c(new z$c(this));
       this.Y1(f.a(PanelShowEvent.class, new z$d(this)));
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, z.class, "3")) {
          return;
       }
       if (this.p != null) {
          this.i2(false);
       }
       super.onDestroyView();
       this.r = false;
       this.s = null;
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "1")) {
          return;
       }
       super.w1(p0);
       this.d.n(b.class, new z$a(this));
       return;
    }
}
