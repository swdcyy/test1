package com.kwai.live.gzone.accompanyplay.anchor.f0;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Boolean;
import java.lang.Object;
import mrd.a;
import com.kwai.live.gzone.accompanyplay.anchor.f0$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import g37.d;
import com.kwai.live.gzone.accompanyplay.anchor.f0$b;
import erd.g;
import crd.b;
import com.kwai.live.gzone.accompanyplay.edit.g;
import com.kwai.robust.PatchProxyResult;
import com.kwai.live.gzone.accompanyplay.anchor.h0;
import java.util.Map;
import java.util.HashMap;
import fq5.b;
import lp3.i;
import k37.p1;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import j77.b;
import oq5.a;
import mq5.b;
import s67.h1;
import uq5.a;
import lp3.c;
import j47.c;

public class f0 extends PresenterV2 implements g	// class@000b0d
{
    public g p;
    public a q;
    public b r;
    public d s;
    public p1 t;
    public f0$c u;

    public void f0(){
       super();
       this.q = a.h(Boolean.FALSE);
       this.u = new f0$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f0.class, "2")) {
          return;
       }
       f0 ts = this.s;
       if (ts != null) {
          this.X7(ts.d().subscribe(new f0$b(this)));
       }
       return;
    }
    public void J8(){
       f0 uof0 = f0.class;
       if (PatchProxy.applyVoid(null, this, uof0, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uof0, "4")) {
          uof0 = this.p;
          if (uof0 != null) {
             uof0.n();
             this.p = null;
          }
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f0.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, f0.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(f0.class, new h0());
       }else {
          obj.put(f0.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f0.class, "1")) {
          return;
       }
       this.r = this.r8("LIVE_BASIC_CONTEXT");
       this.s = this.t8("LIVE_GZONE_ANCHOR_ACCOMPANY_SDK_SERVICE");
       i oi = this.r8("LIVE_SERVICE_MANAGER");
       p1 op1 = new p1();
       this.t = op1;
       op1.a = this.r;
       op1.b = this.r8("LIVE_PHOTO");
       this.t.c = this.s8(b.class);
       this.t.d = this.r8("LIVE_CONFIGURATION_SERVICE");
       this.t.e = this.r8("LIVE_AUDIENCE_LIVE_END_SERVICE");
       this.t.f = this.q8(h1.class);
       this.t.g = oi.a(a.class);
       this.t.h = this.q8(c.class);
       return;
    }
}
