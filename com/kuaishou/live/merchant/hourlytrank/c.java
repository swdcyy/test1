package com.kuaishou.live.merchant.hourlytrank.c;
import im8.g;
import k51.c;
import com.kuaishou.live.merchant.hourlytrank.c$a;
import mrd.a;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$SellerRankSignal;
import brd.t;
import ks3.k0;
import com.kuaishou.live.merchant.hourlytrank.b;
import erd.r;
import fg3.o;
import com.kuaishou.live.merchant.hourlytrank.a;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Integer;
import jt5.a;
import brd.y;
import com.kwai.robust.PatchProxyResult;
import fg3.r;
import java.util.Map;
import t02.a0;
import p91.m;

public class c extends c implements g	// class@000cce
{
    public a0 p;
    public m q;
    public k0 r;
    public final s s;
    public c t;
    public c u;
    public HashMap v;
    public int w;
    public static String sLivePresenterClassName = "LiveMerchantHourlyRankPresenter";

    public void c(){
       super();
       this.s = new c$a(this);
       this.t = a.g();
       this.u = a.g();
       this.v = new HashMap();
       this.w = 0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.X7(this.r.a("sellerRankRefresh", LiveRoomSignalMessage$SellerRankSignal.class).filter(b.b).subscribe(new o(this), a.b));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.v.clear();
       this.w = 0;
       return;
    }
    public void P8(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "5")) {
          return;
       }
       this.w = p0;
       a uoa = this.v.get(Integer.valueOf(p0));
       if (uoa == null) {
          uoa = new a();
          uoa.b = false;
       }
       this.t.onNext(uoa);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new r();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(c.class, new r());
       }else {
          obj.put(c.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.p = this.s8(a0.class);
       this.q = this.r8("LIVE_BASIC_CONTEXT");
       this.r = this.r8("LIVE_MERCHANT_SIGNAL_SERVICE");
       return;
    }
}
