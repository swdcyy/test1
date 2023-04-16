package ec1.i;
import k51.c;
import android.os.Handler;
import android.os.Looper;
import ec1.i$a;
import ec1.i$b;
import ec1.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.c$b;
import kq5.b;
import oq5.c;
import oq5.a;
import bq5.h$a;
import bq5.h;
import p91.m;
import android.view.View;
import ea1.a;
import com.kuaishou.live.common.core.basic.optimizeui.ViewElement;
import ec1.h;
import java.lang.Runnable;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager;
import i81.g;
import ec1.j;
import i81.a;
import lp3.i;
import lp3.c;
import crd.b;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import bq5.f;
import jq5.a;
import bq5.b;
import ec1.c;
import dp3.g;
import fp3.e;
import fp3.d;
import n91.d;
import va1.b0;
import bq5.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ec1.i$c;
import i81.d;
import i81.b;
import ec1.d;
import java.lang.StringBuilder;
import ekd.m1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.common.core.component.comments.fluency.quick.a;

public class i extends c	// class@0020dc
{
    public b A;
    public boolean B;
    public boolean C;
    public a D;
    public b E;
    public final h$a F;
    public c$b G;
    public final c H;
    public View p;
    public i q;
    public b r;
    public a s;
    public h t;
    public a u;
    public g v;
    public m w;
    public f x;
    public boolean y;
    public Handler z;
    public static String sLivePresenterClassName = "LiveBottomBubblePresenter";

    public void i(){
       super();
       this.y = false;
       this.z = new Handler(Looper.getMainLooper());
       this.C = false;
       this.F = new i$a(this);
       this.G = new i$b(this);
       this.H = new e(this);
    }
    public void E8(){
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "3")) {
          return;
       }
       this.r.c(this.G);
       this.s.W0(this.H, true);
       this.t.Fh(this.F);
       i tw = this.w;
       if (tw != null && !tw.e()) {
          this.p.setVisibility(4);
          a uoa = new a(ViewElement.COMMENT_NOTICE, new h(this));
          this.D = uoa;
          uoa.c();
       }
       if (!PatchProxy.applyVoid(objArray, this, oi, "4")) {
          LiveBulletinLayoutManager liveBulletin = this.v.i7();
          if (liveBulletin != null) {
             liveBulletin.m(new j(this));
          }
       }
       this.V8();
       return;
    }
    public void J8(){
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i.class, "6")) {
          return;
       }
       this.r.a(this.G);
       this.s.Q0(this.H);
       this.z.removeCallbacksAndMessages(objArray);
       this.P8().a(oh).xc(this.F);
       this.P8().a(oh).zb();
       this.R8(this.A);
       i tD = this.D;
       if (tD != null) {
          tD.b();
       }
       this.v = this.P8().a(g.class);
       return;
    }
    public final i P8(){
       return this.q;
    }
    public final void R8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "13")) {
          return;
       }
       if (p0 != null && !p0.isDisposed()) {
          p0.dispose();
       }
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, i.class, "11")) {
          return;
       }
       this.R8(this.A);
       LiveCommonLogTag bOTTOM_BUBBL = LiveCommonLogTag.BOTTOM_BUBBLE;
       b.Z(bOTTOM_BUBBL, "tryRemoveBottomBubbleItem");
       if (this.y != null) {
          return;
       }
       this.y = true;
       b.c0(bOTTOM_BUBBL, "remove bottom bubble item", "widget", this.x.c());
       this.P8().a(a.class).G(this.x.c(), new c(this));
       return;
    }
    public final void V8(){
       boolean b;
       int i;
       String str;
       h oh = h.class;
       i oi = i.class;
       if (PatchProxy.applyVoid(null, this, oi, "10")) {
          return;
       }
       LiveCommonLogTag bOTTOM_BUBBL = LiveCommonLogTag.BOTTOM_BUBBLE;
       b.Z(bOTTOM_BUBBL, "try show next bottom bubble item");
       i tD = this.D;
       if (tD != null && !tD.a()) {
          b.Z(bOTTOM_BUBBL, "show bubble failed, mChoreographer not ready");
          return;
       }else {
          b = this.P8().a(d.class).M();
          i = this.v.R6() ^ 0x01;
          i tx = this.x;
          if (tx == null && (this.B == null || (b && i))) {
             if (tx != null) {
                str = "current showing";
             }else if(b){
                str = "editor showing";
             }else {
                str = "live in background";
             }
             b.Z(bOTTOM_BUBBL, "show bubble failed: "+str);
             return;
          }else {
             f uof = this.P8().a(oh).dn();
             if (uof == null) {
                b.Z(bOTTOM_BUBBL, "show bubble failed: empty queue");
                return;
             }else if(b0.a() && uof.f == null){
                b.Z(bOTTOM_BUBBL, "show bubble failed: in landscape");
                return;
             }else if(uof.c() instanceof b && (uof.a() > 0 && (uof.b() == null || uof.b().a()))){
                Object obj = PatchProxy.applyOneRefs(uof, this, oi, "15");
                boolean b1 = (obj != PatchProxyResult.class)? obj.booleanValue(): this.t.lj(uof);
                if (!b1) {
                   this.W8(uof);
                   if (this.E != null) {
                      int i1 = uof.c().z();
                      this.E.b(i1, new i$c(this, i1));
                   }
                   b.c0(bOTTOM_BUBBL, "show next bottom bubble item", "widget", uof.c());
                   this.P8().a(a.class).w(uof.c(), new d(this, uof));
                   return;
                }
             }
          label_00ee :
             b.c0(bOTTOM_BUBBL, "show bubble failed: bubble not valid", "widget", uof.c());
             this.P8().a(oh).ce(uof);
             this.V8();
             return;
          }
       }
    }
    public final void W8(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "14")) {
          return;
       }
       this.x = p0;
       this.P8().a(h.class).gi(this.x);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a1ac8);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.q = this.r8("LIVE_SERVICE_MANAGER");
       this.r = this.r8("FRAGMENT_LIFE_CYCLE_SERVICE");
       this.s = this.r8("LIVE_CONFIGURATION_SERVICE");
       this.w = this.t8("LIVE_BASIC_CONTEXT");
       this.v = this.q.a(g.class);
       this.u = this.q.c(a.class);
       this.t = this.q.a(h.class);
       return;
    }
}
