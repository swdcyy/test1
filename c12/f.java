package c12.f;
import a51.c;
import c12.d;
import c12.c;
import c12.e;
import c12.f$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.basic.activity.x;
import c12.g;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import android.content.res.Configuration;
import kq5.b;
import p91.m;
import androidx.fragment.app.c$b;
import mq5.i;
import mq5.f;
import oq5.c;
import jv1.b;
import mq5.h;
import mq5.b;
import java.lang.Boolean;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import mq5.d;

public class f extends c	// class@00049f
{
    public boolean A;
    public boolean B;
    public x C;
    public boolean D;
    public boolean E;
    public c F;
    public i G;
    public h H;
    public c I;
    public c$b J;
    public LiveSlidePlayService v;
    public b w;
    public d x;
    public m y;
    public b z;
    public static String sLivePresenterClassName = "LiveAudiencePresenter";

    public void f(){
       super();
       this.G = new d(this);
       this.H = new c(this);
       this.I = new e(this);
       this.J = new f$a(this);
    }
    public final void E8(){
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "2")) {
          return;
       }
       super.E8();
       if (this.C.a()) {
          this.x(this.A);
          this.Y8();
          this.D = true;
          this.E = false;
       }
       if (this.B != null && (!PatchProxy.applyVoid(objArray, this, uof, "6") && this.v != null)) {
          g og = new g(this);
          this.F = og;
          this.v.P4(og);
       }
    label_0043 :
       return;
    }
    public final void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       super.J8();
       if (this.B != null) {
          f tv = this.v;
          if (tv != null) {
             f tF = this.F;
             if (tF != null) {
                tv.d5(tF);
             }
          }
       }
       if (this.D != null && this.E == null) {
          this.Q(this.A);
          this.Z8();
          this.D = false;
          this.E = true;
       }
       return;
    }
    public void Q(boolean p0){
    }
    public void S8(Configuration p0,boolean p1){
    }
    public void V8(){
    }
    public void W8(){
    }
    public void X8(){
    }
    public void Y8(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       if (this.y.k() != null) {
          this.y.k().c(this.J);
       }
       f tx = this.x;
       if (tx != null) {
          tx.h9(this.G);
       }
       tx = this.w;
       if (tx != null) {
          tx.H6(this.I);
       }
       this.z.Km(this.H);
       return;
    }
    public void Z8(){
       if (PatchProxy.applyVoid(null, this, f.class, "5")) {
          return;
       }
       if (this.y.k() != null) {
          this.y.k().a(this.J);
       }
       f tx = this.x;
       if (tx != null) {
          tx.gf(this.G);
       }
       tx = this.w;
       if (tx != null) {
          tx.Q0(this.I);
       }
       this.z.le(this.H);
       return;
    }
    public void j8(){
       Boolean uBoolean = Boolean.class;
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.v = this.t8("LIVE_SLIDE_PLAY_SERVICE");
       this.w = this.s8(b.class);
       this.x = this.t8("LIVE_AUDIENCE_OFFLINE_SERVICE");
       this.z = this.r8("LIVE_AUDIENCE_LIVE_END_SERVICE");
       this.y = this.r8("LIVE_BASIC_CONTEXT");
       this.C = this.r8("LIVE_FRAGMENT_SERVICE");
       this.A = this.v8("LIVE_IS_SLIDE_AVAILABLE", uBoolean).booleanValue();
       this.B = this.v8("LIVE_IS_SLIDE_CONTAINER", uBoolean).booleanValue();
       return;
    }
    public void k(){
    }
    public void x(boolean p0){
    }
}
