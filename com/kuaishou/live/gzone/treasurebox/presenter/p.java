package com.kuaishou.live.gzone.treasurebox.presenter.p;
import f37.b0;
import p53.s0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.gzone.treasurebox.presenter.TreasureBoxCommonModel;
import r53.b;
import com.kuaishou.live.gzone.treasurebox.presenter.o;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import p53.u0;
import com.kuaishou.live.gzone.treasurebox.presenter.n;
import p53.t0;
import mq5.h;
import mq5.b;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import aq5.d;
import com.kwai.library.widget.popup.common.c;
import j77.c;
import j77.b;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import n53.c;
import n53.b;
import cjd.e;
import erd.o;
import com.kuaishou.live.gzone.treasurebox.bean.LiveGzoneTreasureTask;
import o53.b;
import brd.y;
import fq5.b;
import t57.a;
import c77.p;
import k67.d;
import j47.a;
import k67.b;

public class p extends b0	// class@001c90
{
    public d A;
    public a B;
    public boolean C;
    public c D;
    public LiveGzoneTreasureTask E;
    public boolean F;
    public h G;
    public c H;
    public b I;
    public final b J;
    public Set q;
    public int r;
    public String s;
    public b t;
    public b u;
    public b v;
    public b w;
    public a x;
    public p y;
    public d z;
    public static String sLivePresenterClassName = "LiveGzoneTreasureBoxTaskPresenter";

    public void p(){
       super();
       this.C = true;
       this.J = new s0(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, p.class, "2")) {
          return;
       }
       p tu = this.u;
       if (tu == null) {
          return;
       }
       TreasureBoxCommonModel treasureBoxC = tu.p();
       this.X7(treasureBoxC.s.subscribe(new o(this)));
       this.X7(treasureBoxC.l.subscribe(new u0(this)));
       this.X7(treasureBoxC.m.subscribe(new n(this)));
       t0 ot0 = new t0(this);
       this.G = ot0;
       this.w.Km(ot0);
       a[] uoaArray = new a[]{AudienceBizRelation.PK};
       this.A.u5(this.J, uoaArray);
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, p.class, "3")) {
          return;
       }
       super.J8();
       boolean b = true;
       this.C = b;
       this.F = false;
       p tH = this.H;
       if (tH != null) {
          tH.o();
          this.H = objArray;
       }
       tH = this.D;
       if (tH != null) {
          p tv = this.v;
          if (tv != null) {
             tv.g(tH);
          }
       }
       this.D = objArray;
       p tG = this.G;
       if (tG != null) {
          this.w.le(tG);
       }
       k1.n(this);
       a[] uoaArray = new a[b];
       uoaArray[0] = AudienceBizRelation.PK;
       this.A.G5(this.J, uoaArray);
       return;
    }
    public final t S8(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, p.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.b().c(p1, p0).map(new e());
    }
    public final t V8(String p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, p.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.b().a(p0, p1, p2).map(new e());
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, p.class, "17")) {
          return;
       }
       p tu = this.u;
       if (tu != null) {
          tu.p().u(this.E);
          this.u.p().i.onNext(b.b(this.E));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p.class, "1")) {
          return;
       }
       this.t = this.r8("LIVE_BASIC_CONTEXT");
       this.u = this.t8("LIVE_GZONE_TREASUREBOX_SERVICE");
       this.v = this.s8(b.class);
       this.w = this.r8("LIVE_AUDIENCE_LIVE_END_SERVICE");
       this.x = this.s8(a.class);
       this.y = this.s8(p.class);
       this.z = this.t8("LIVE_GZONE_FEATURE_PENDANT_BUBBLE_SERVICE");
       this.A = this.r8("LIVE_BIZ_RELATION_SERVICE");
       this.B = this.q8(a.class);
       this.I = this.s8(b.class);
       return;
    }
}
