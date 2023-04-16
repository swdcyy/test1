package bc9.b0;
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
import com.kuaishou.android.model.music.Music;
import cc9.p;
import com.yxcorp.gifshow.camera.record.assistant.utils.AssistantUtils;
import cc9.q;
import java.lang.Integer;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.base.d;
import vf9.s;
import android.content.Intent;
import android.view.View;
import kob.p;
import bc9.b0$a;
import erd.g;
import crd.b;
import eoc.f;
import com.yxcorp.gifshow.camera.record.assistant.a$b;
import bc9.b0$b;
import cc9.i;
import bc9.b0$c;

public final class b0 extends d0	// class@0003db
{
    public p o;
    public Intent p;
    public boolean q;
    public boolean r;
    public boolean s;
    public q t;
    public final a u;
    public final b v;

    public void b0(CameraPageType p0,b p1,a p2,b p3){
       a.p(p0, "pageType");
       a.p(p1, "callerContext");
       a.p(p2, "assistContext");
       a.p(p3, "viewHelper");
       super(p0, p1);
       this.u = p2;
       this.v = p3;
    }
    public void L3(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "6")) {
          return;
       }
       if (p0 != null && this.o != null) {
          a e = p0.e;
          String str = "info.mVideoContext";
          a.o(e, str);
          k$a uoa = e.J();
          if (uoa == null) {
             uoa = new k$a();
          }
          b0 to = this.o;
          a.m(to);
          uoa.f = to.b().getId();
          a e1 = p0.e;
          a.o(e1, str);
          e1.I1(uoa);
          p0 = p0.e;
          a.o(p0, str);
          k$a uoa1 = p0.J();
          String str1 = AssistantUtils.d.h(this.t);
          if (str1 == null) {
             str1 = "";
          }
          uoa1.h = str1;
       }
       return;
    }
    public void d5(int p0){
       b0 uob0 = b0.class;
       if (PatchProxy.isSupport(uob0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob0, "3")) {
          return;
       }
       super.d5(p0);
       if (this.r != null) {
          this.i2();
       }
       return;
    }
    public final a g2(){
       return this.u;
    }
    public final void h2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b0.class, "4")) {
          return;
       }
       this.i2();
       this.o = objArray;
       this.p = objArray;
       objArray = new Object[0];
       a.D().w("CameraAssistant", "onMusicItemUnselected", objArray);
       return;
    }
    public final void i2(){
       if (PatchProxy.applyVoid(null, this, b0.class, "7")) {
          return;
       }
       if (this.s != null) {
          this.r = true;
          return;
       }else {
          this.r = false;
          s os = new s(this.u.n(), false, false, true, false);
          this.d.m(v8);
          this.u.K(null);
          return;
       }
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "1")) {
          return;
       }
       super.k(p0);
       this.s = false;
       this.p = null;
       this.Y1(f.a(p.class, new b0$a(this)));
       this.u.q().c(new b0$b(this));
       this.u.f().c(new b0$c(this));
       if (this.r != null) {
          this.i2();
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, b0.class, "2")) {
          return;
       }
       this.s = true;
       if (this.o != null) {
          this.h2();
       }
       super.onDestroyView();
       this.q = false;
       this.t = null;
       return;
    }
}
