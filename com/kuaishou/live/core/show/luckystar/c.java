package com.kuaishou.live.core.show.luckystar.c;
import im8.g;
import zb2.h;
import com.kuaishou.live.core.show.luckystar.c$a;
import yb2.a;
import com.kuaishou.live.core.show.luckystar.c$b;
import com.kuaishou.live.core.show.luckystar.c$c;
import yb2.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import t02.a0;
import mq5.b;
import yb2.g;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import com.kuaishou.live.common.core.component.share.LiveShareSubBiz$AudienceSubBiz;
import com.kuaishou.live.common.core.component.share.LiveShareSubBiz;
import sx1.i;
import com.kuaishou.live.core.show.share.f$b;
import mq5.h;
import yb2.c;
import vq5.b;
import vq5.d;
import yb2.d;
import ekd.k1;
import bc2.d;
import p91.m;
import zb2.f0;
import zb2.h0;
import ks5.i;
import yb2.i;
import com.kuaishou.live.core.show.luckystar.LiveLuckyStarStyle;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e17.i$b;
import e17.i;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewGroup;
import com.kuaishou.live.core.show.luckystar.m;
import java.util.Map;
import java.util.HashMap;
import ft5.b;
import ng2.s;
import lp3.e;
import lp3.c;
import cc2.c;
import cc2.b;
import com.kuaishou.live.core.show.luckystar.util.b;
import brd.t;
import cjd.e;
import erd.o;
import yb2.e;
import com.kuaishou.live.core.show.luckystar.c$d;
import erd.g;
import crd.b;
import com.kuaishou.live.core.show.luckystar.a;
import com.kuaishou.live.core.show.luckystar.b;

public class c extends h implements g	// class@000cbf
{
    public a0 D;
    public LiveSlidePlayService E;
    public b F;
    public s G;
    public d H;
    public i I;
    public c J;
    public boolean K;
    public c$e L;
    public final i M;
    public final h0 N;
    public final f0 O;
    public h P;
    public static String sLivePresenterClassName = "LiveAudienceLuckyStarPresenter";

    public void c(){
       super();
       this.K = false;
       this.L = new c$a(this);
       this.M = new a(this);
       this.N = new c$b(this);
       this.O = new c$c(this);
       this.P = new b(this);
    }
    public boolean E0(){
       Object obj = PatchProxy.apply(null, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.K != null && !this.D.D2.U0())? true: false;
       return b;
    }
    public void E8(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "2")) {
          return;
       }
       super.E8();
       if (!PatchProxy.applyVoid(objArray, this, uoc, "6")) {
          if (this.D.h == null) {
             this.K = true;
          }else {
             g og = new g(this);
             this.J = og;
             this.E.P4(og);
          }
       }
       this.D.o1.N0(LiveShareSubBiz$AudienceSubBiz.LUCKY_STAR, this.M);
       this.D.D2.Km(this.P);
       this.H.t5("luckyStarWatchLiveTaskAutoParticpate", new c(this));
       this.H.t5("luckyStarAutoParticpate", new d(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       super.J8();
       k1.n(this);
       c tJ = this.J;
       if (tJ != null) {
          this.E.d5(tJ);
       }
       this.D.o1.F1(LiveShareSubBiz$AudienceSubBiz.LUCKY_STAR);
       this.D.D2.le(this.P);
       this.H.Z4("luckyStarWatchLiveTaskAutoParticpate");
       this.H.Z4("luckyStarAutoParticpate");
       this.W8().b();
       return;
    }
    public m X8(){
       return this.D.Z2;
    }
    public f0 Z8(){
       return this.O;
    }
    public h0 a9(){
       return this.N;
    }
    public d b9(){
       return this.H;
    }
    public i c9(){
       return this.I;
    }
    public void e9(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "8")) {
          return;
       }
       if (this.v.g == LiveLuckyStarStyle.LUCKY_STAR_V2 && !TextUtils.x(p0)) {
          i$b uob = i.m();
          uob.y(p0);
          uob.n(this.m8());
          i.z(uob);
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new m();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, c.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(c.class, new m());
       }else {
          obj.put(c.class, null);
       }
       return obj;
    }
    public boolean h2(){
       Object obj = PatchProxy.apply(null, this, c.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.K != null && !this.D.D2.U0())? true: false;
       return b;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.D = this.q8(a0.class);
       this.E = this.r8("LIVE_SLIDE_PLAY_SERVICE");
       this.F = this.r8("LIVE_AUDIENCE_SEND_COMMENTS_SERVICE");
       this.G = this.r8("LIVE_RED_PACKET_PENDANT_SERVICE");
       this.H = this.r8("LIVE_ROUTER_SERVICE");
       this.I = this.D.Z2.t5().a(i.class);
       return;
    }
    public void l9(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       this.X7(b.b().j(b.g(this.D.Z2.e()), this.D.Z2.getLiveStreamId(), p0).map(new e()).subscribe(new e(this), new c$d(this)));
       return;
    }
    public final void m9(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       this.X7(b.b().g(b.g(this.D.Z2.e()), this.D.Z2.getLiveStreamId(), p0).map(new e()).subscribe(a.b, b.b));
       return;
    }
}
