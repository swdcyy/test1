package com.kuaishou.live.core.show.wealthgrade.b;
import im8.g;
import k51.c;
import lnc.a1;
import com.kuaishou.live.core.show.wealthgrade.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hf3.a;
import p91.m;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import hm2.e;
import lf3.g;
import com.kuaishou.live.core.show.enterroom.floatingscreen.biz.wealthgrade.LiveWealthGradeEnterRoomData;
import com.kuaishou.live.core.show.wealthgrade.b$b;
import gr5.a;
import kr5.a;
import zq5.b;
import ekd.k1;
import android.animation.ObjectAnimator;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.wealthgrade.e;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import t02.a0;
import t02.r1;
import lp3.i;
import lp3.c;

public class b extends c implements g	// class@001255
{
    public m p;
    public a0 q;
    public r1 r;
    public ObjectAnimator s;
    public b t;
    public i u;
    public b$c v;
    public static String sLivePresenterClassName = "LiveWealthGradeEnterRoomEffectPresenter";
    public static final int w;

    static {
       b.w = - a1.e(40.00f);
    }
    public void b(){
       super();
       this.t = null;
       this.v = new b$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.p.u().u0(510, SCActionSignal.class, new e(this));
       b tt = this.t;
       if (tt != null) {
          tt.v9(1, LiveWealthGradeEnterRoomData.class, null, new b$b(this));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "7")) {
          return;
       }
       k1.n(this);
       this.P8();
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       b ts = this.s;
       if (ts != null && ts.isRunning()) {
          this.s.cancel();
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(b.class, new e());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_BASIC_CONTEXT");
       this.q = this.s8(a0.class);
       this.r = this.s8(r1.class);
       i oi = this.r8("LIVE_SERVICE_MANAGER");
       this.u = oi;
       this.t = oi.c(b.class);
       return;
    }
}
