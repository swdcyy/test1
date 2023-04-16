package h31.l;
import ds5.c;
import vf1.b;
import c12.f;
import h31.l$a;
import java.lang.String;
import ds5.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import vf1.a;
import lp3.c;
import ds5.a;
import os3.b;
import ks3.i0$a;
import ks3.i0;
import io.reactivex.subjects.ReplaySubject;
import crd.b;
import lnc.b9;
import com.kwai.robust.PatchProxyResult;
import lp3.e;
import com.kuaishou.android.live.model.QLivePlayConfig;
import ms5.c;
import ms5.a;
import h31.e;
import brd.w;
import erd.c;
import brd.t;
import h31.f;
import erd.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import h31.g;
import t02.a0;
import ds5.e;
import kg1.e;
import java.lang.Throwable;
import h31.h;
import ry1.b;
import h31.j;
import com.gifshow.tuna.player.poi.e;
import com.kuaishou.live.core.show.delayinfo.LiveAudienceDelayInfosResponse;
import h31.b;
import erd.o;
import t45.d;
import brd.z;
import h31.i;

public class l extends f implements c, b	// class@00261a
{
    public a0 K;
    public e L;
    public i0 M;
    public b N;
    public e O;
    public e P;
    public QLivePlayConfig Q;
    public a R;
    public boolean S;
    public boolean T;
    public ReplaySubject U;
    public ReplaySubject V;
    public b W;
    public b X;
    public final i0$a Y;
    public static String sLivePresenterClassName = "LiveAudienceAuthorReinforcePresenter";

    public void l(){
       super();
       this.S = false;
       this.T = false;
       this.Y = new l$a(this);
    }
    public String N5(){
       return b.a(this);
    }
    public void Q(boolean p0){
       l tM;
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ol, "3")) {
          return;
       }
       this.a9(a.class).uh(this);
       this.L.fo(this);
       if (!this.N.a()) {
          tM = this.M;
          if (tM != null) {
             tM.c(this.Y);
          }
       }
       tM = this.U;
       if (tM != null) {
          tM.onComplete();
       }
       tM = this.V;
       if (tM != null) {
          tM.onComplete();
       }
       b9.a(this.W);
       b9.a(this.X);
       return;
    }
    public final c a9(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.O.a(p0);
    }
    public final void b9(){
       if (PatchProxy.applyVoid(null, this, l.class, "6")) {
          return;
       }
       l tQ = this.Q;
       if (tQ == null || (this.R != null && (tQ.mIsShopLive == null || (this.S != null && this.T == null)))) {
          this.a9(c.class).mi(this.R);
       }
    label_002e :
       return;
    }
    public void e2(QLivePlayConfig p0,QLivePlayConfig p1){
       b.c(this, p0, p1);
    }
    public void ff(QLivePlayConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "4")) {
          return;
       }
       this.Q = p0;
       if (p0.mIsShopLive != null) {
          this.X7(t.zip(this.U, this.V, e.a).subscribe(new f(this)));
       }else {
          this.X7(this.V.subscribe(new g(this)));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       super.j8();
       this.O = this.r8("LIVE_SERVICE_MANAGER");
       this.K = this.q8(a0.class);
       this.L = this.r8("LIVE_PLAY_CONFIG_SERVICE");
       this.M = this.t8("LIVE_MERCHANT_PLAY_CONFIG_SERVICE");
       this.N = this.r8("LIVE_MERCHANT_AUDIENCE_TOP_SLIDE_BAR_SERVICE");
       this.P = this.r8("LIVE_FANS_GROUP_SERVICE");
       return;
    }
    public void onError(Throwable p0){
       b.d(this, p0);
    }
    public void x(boolean p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ol, "2")) {
          return;
       }
       this.a9(a.class).Z9(this);
       this.U = ReplaySubject.i(1);
       this.V = ReplaySubject.i(1);
       this.L.gd(this);
       if (!this.N.a()) {
          l tM = this.M;
          if (tM != null) {
             tM.b(this.Y);
          }
       }else {
          this.X7(this.N.d().subscribe(new h(this)));
       }
       this.X7(this.K.b3.W().subscribe(new j(this), e.b));
       return;
    }
    public void x6(LiveAudienceDelayInfosResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "5")) {
          return;
       }
       if (this.L.C0().mIsShopLive != null) {
          return;
       }
       b9.a(this.W);
       this.W = t.just(p0).map(new b(this)).observeOn(d.a).subscribe(new i(this));
       return;
    }
    public boolean xi(){
       return b.e(this);
    }
}
