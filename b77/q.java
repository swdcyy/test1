package b77.q;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import mrd.a;
import b77.q$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y43.a;
import android.view.ViewStub;
import android.view.View;
import b77.l;
import com.kwai.robust.PatchProxyResult;
import fq5.b;
import b77.o;
import mw1.d;
import mw1.b;
import b77.q$a;
import oq5.c;
import oq5.a;
import mrd.c;
import c77.p;
import b77.q$b;
import erd.g;
import crd.b;
import brd.t;
import b77.p;
import com.gifshow.tuna.player.poi.e;
import java.util.Objects;
import java.lang.Runnable;
import android.widget.FrameLayout;
import com.kwai.live.gzone.widget.ViewFlipperScrollView;
import com.kwai.live.gzone.widget.ViewAnimator2;
import android.animation.ObjectAnimator;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import com.kwai.imsdk.msg.KwaiMsg;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import dz1.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kwai.imsdk.m;
import qo6.t1;
import com.kwai.imsdk.internal.v;
import com.kwai.imsdk.internal.y;
import java.util.concurrent.Callable;
import qo6.k;
import ekd.m1;
import b77.y;
import java.util.Map;
import java.util.HashMap;

public class q extends PresenterV2 implements g	// class@0003eb
{
    public KwaiMsg A;
    public t1 B;
    public Boolean C;
    public l D;
    public b E;
    public c F;
    public c p;
    public ViewStub q;
    public b r;
    public d s;
    public View t;
    public View u;
    public j v;
    public a w;
    public String x;
    public String y;
    public k z;

    public void q(){
       super();
       this.p = a.g();
       this.v = new q$c(this);
       this.C = null;
    }
    public void E8(){
       q oq = q.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oq, "4")) {
          return;
       }
       if (this.w.p == null) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oq, "3")) {
          this.q.setLayoutResource(R.layout.arg_RES_7f0d059f);
          this.u = this.q.inflate();
       }
       oq = this.u;
       q tE = this.E;
       l ol = PatchProxy.applyTwoRefs(oq, tE, objArray, l.class, "1");
       if (ol != PatchProxyResult.class) {
       }else {
          ol = new l(oq, tE);
       }
       this.D = ol;
       this.C = objArray;
       o oo = new o(this);
       this.s = oo;
       this.r.Y3(oo);
       q$a uoa = new q$a(this);
       this.F = uoa;
       this.w.v.H6(uoa);
       this.X7(this.w.p.sf().subscribe(new q$b(this)));
       this.X7(this.p.subscribe(new p(this), e.b));
       return;
    }
    public void J8(){
       Object[] objArray = null;
       String str = "11";
       if (PatchProxy.applyVoid(objArray, this, q.class, str)) {
          return;
       }
       this.S8();
       q tD = this.D;
       if (tD != null) {
          Objects.requireNonNull(tD);
          if (!PatchProxy.applyVoid(objArray, tD, l.class, "8")) {
             l b = tD.b;
             if (b != null) {
                b.removeCallbacks(tD.c);
                l b1 = tD.b;
                Objects.requireNonNull(b1);
                if (!PatchProxy.applyVoid(objArray, b1, ViewFlipperScrollView.class, str)) {
                   if (!PatchProxy.applyVoid(objArray, b1, ViewAnimator2.class, "23")) {
                      ViewAnimator2 e = b1.e;
                      if (e != null && e.isRunning()) {
                         b1.e.cancel();
                         b1.e = objArray;
                      }
                      e = b1.f;
                      if (e != null && e.isRunning()) {
                         b1.f.cancel();
                      }
                   }
                label_0063 :
                   b1.removeCallbacks(b1.k);
                }
             }
          }
          this.D = objArray;
       }
       this.w.v.Q0(this.F);
       return;
    }
    public void P8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "10")) {
          return;
       }
       if (p0 == null) {
          this.C = null;
          return;
       }else {
          this.C = Boolean.valueOf((TextUtils.n(this.y, p0) ^ 0x01));
          return;
       }
    }
    public void R8(KwaiMsg p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "9")) {
          return;
       }
       p0.getText();
       if (this.C == null) {
          a p = this.w.p;
          if (p != null) {
             this.P8(p.Q2());
          }
       }
       q tC = this.C;
       if (tC != null && tC.booleanValue()) {
          tC = this.D;
          if (tC != null) {
             Objects.requireNonNull(tC);
             l ol = l.class;
             if (!PatchProxy.applyVoidOneRefs(p0, tC, ol, "6")) {
                Object[] objArray = null;
                if (!PatchProxy.applyVoid(objArray, tC, ol, "5") && (tC.a.getVisibility() && tC.f == null)) {
                   tC.a.setVisibility(0);
                   if (tC.d == null) {
                      tC.d = true;
                      ClientContent$LiveStreamPackage liveStreamPa = tC.e.a();
                      if (!PatchProxy.applyVoidOneRefs(liveStreamPa, objArray, a.class, "23")) {
                         ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                         uElementPack.action2 = "MATCH_MASK";
                         ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                         uContentPack.liveStreamPackage = liveStreamPa;
                         u1.u0(3, uElementPack, uContentPack);
                      }
                   }
                }
                l b = tC.b;
                if (b != null) {
                   b.d(p0);
                }
             }
          }
       }
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, q.class, "8")) {
          return;
       }
       String str = "WOG_2022";
       if (this.B != null) {
          m.G(str).V0(this.B);
          this.B = null;
       }
       if (this.z != null && this.x != null) {
          v ov = v.m(m.G(str).c);
          ov.a(new y(ov, this.x), this.z);
          this.z = null;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "1")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a1f88);
       this.t = m1.f(p0, 0x7f0a30e6);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, q.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new y();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, q.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(q.class, new y());
       }else {
          obj.put(q.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, q.class, "2")) {
          return;
       }
       this.r = this.r8("LIVE_AUDIENCE_PLAY_VIEW_LAYOUT_SERVICE");
       this.w = this.q8(a.class);
       this.E = this.r8("LIVE_BASIC_CONTEXT");
       return;
    }
}
