package c12.k;
import com.kuaishou.live.common.core.basic.livepresenter.LiveVCHostPresenter;
import c12.i;
import c12.h;
import c12.j;
import c12.k$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a51.c;
import rp5.a;
import lp3.c;
import lp3.e;
import com.kuaishou.live.core.basic.activity.x;
import c12.l;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import androidx.lifecycle.LifecycleOwner;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
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

public class k extends LiveVCHostPresenter	// class@0004a5
{
    public b A;
    public boolean B;
    public boolean C;
    public x D;
    public a E;
    public e F;
    public boolean G;
    public boolean H;
    public c I;
    public i J;
    public h K;
    public c L;
    public c$b M;
    public LiveSlidePlayService w;
    public b x;
    public d y;
    public m z;
    public static String sLivePresenterClassName = "LiveAudienceVcHostPresenter";

    public void k(){
       super();
       this.J = new i(this);
       this.K = new h(this);
       this.L = new j(this);
       this.M = new k$a(this);
    }
    public final void E8(){
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ok, "2")) {
          return;
       }
       super.E8();
       this.E = this.F.a(a.class);
       if (this.D.a()) {
          this.x(this.B);
          this.W8();
          this.G = true;
          this.H = false;
       }
       if (this.C != null && (!PatchProxy.applyVoid(objArray, this, ok, "6") && this.w != null)) {
          l ol = new l(this);
          this.I = ol;
          this.w.P4(ol);
       }
    label_004f :
       return;
    }
    public final void J8(){
       if (PatchProxy.applyVoid(null, this, k.class, "3")) {
          return;
       }
       super.J8();
       if (this.C != null) {
          k tw = this.w;
          if (tw != null) {
             k tI = this.I;
             if (tI != null) {
                tw.d5(tI);
             }
          }
       }
       if (this.G != null && this.H == null) {
          this.Q(this.B);
          this.X8();
          this.G = false;
          this.H = true;
       }
       return;
    }
    public void Q(boolean p0){
    }
    public LifecycleOwner V8(){
       Object obj = PatchProxy.apply(null, this, k.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.E.t();
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, k.class, "4")) {
          return;
       }
       if (this.z.k() != null) {
          this.z.k().c(this.M);
       }
       k ty = this.y;
       if (ty != null) {
          ty.h9(this.J);
       }
       ty = this.x;
       if (ty != null) {
          ty.H6(this.L);
       }
       this.A.Km(this.K);
       return;
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, k.class, "5")) {
          return;
       }
       if (this.z.k() != null) {
          this.z.k().a(this.M);
       }
       k ty = this.y;
       if (ty != null) {
          ty.gf(this.J);
       }
       ty = this.x;
       if (ty != null) {
          ty.Q0(this.L);
       }
       this.A.le(this.K);
       return;
    }
    public void j8(){
       Boolean uBoolean = Boolean.class;
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.w = this.t8("LIVE_SLIDE_PLAY_SERVICE");
       this.x = this.s8(b.class);
       this.y = this.t8("LIVE_AUDIENCE_OFFLINE_SERVICE");
       this.A = this.r8("LIVE_AUDIENCE_LIVE_END_SERVICE");
       this.z = this.r8("LIVE_BASIC_CONTEXT");
       this.D = this.r8("LIVE_FRAGMENT_SERVICE");
       this.B = this.v8("LIVE_IS_SLIDE_AVAILABLE", uBoolean).booleanValue();
       this.C = this.v8("LIVE_IS_SLIDE_CONTAINER", uBoolean).booleanValue();
       this.F = this.r8("LIVE_SERVICE_MANAGER");
       return;
    }
    public void x(boolean p0){
    }
}
