package b94.m;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import b94.a;
import java.util.HashMap;
import b94.m$a;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$AuctionInfoSignal;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ks3.n;
import ks3.n$d;
import b94.d;
import u84.d;
import hoc.c;
import brd.t;
import ks3.k0;
import b94.f;
import b94.j;
import erd.g;
import crd.b;
import b94.h;
import b94.k;
import b94.e;
import b94.l;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$SCKwaishopLiveActivityPendant;
import b94.c;
import erd.r;
import b94.g;
import b94.b;
import lnc.b9;
import java.util.Objects;
import com.kuaishou.merchant.basic.util.o;
import java.lang.Math;
import com.kuaishou.merchant.marketing.shop.MerchantMarketingShopLogBiz;
import java.lang.Long;
import p74.a;
import o74.a;
import com.yxcorp.utility.f;
import b94.i;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import b94.p;
import java.util.Map;
import ks3.a0;
import ks3.x;
import fq5.b;

public class m extends PresenterV2 implements g	// class@000334
{
    public k0 p;
    public a0 q;
    public x r;
    public d s;
    public b t;
    public final n$d u;
    public b v;
    public final Map w;
    public l x;

    public void m(){
       super();
       this.u = new a(this);
       this.w = new HashMap();
       this.x = new m$a(this);
    }
    public void E8(){
       LiveRoomSignalMessage$AuctionInfoSignal uAuctionInfo = LiveRoomSignalMessage$AuctionInfoSignal.class;
       m om = m.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, om, "3")) {
          return;
       }
       m tr = this.r;
       if (tr instanceof n) {
          tr.m(this.u);
       }
       tr = this.s;
       tr.i = new d(this);
       tr.o();
       if (!PatchProxy.applyVoid(objArray, this, om, "5")) {
          this.X7(this.p.a("auctionStart", uAuctionInfo).subscribe(new f(this), j.b));
       }
       if (!PatchProxy.applyVoid(objArray, this, om, "6")) {
          this.X7(this.p.a("auctionBid", uAuctionInfo).subscribe(new h(this), k.b));
       }
       if (!PatchProxy.applyVoid(objArray, this, om, "7")) {
          this.X7(this.p.a("auctionDeal", uAuctionInfo).subscribe(new e(this), l.b));
       }
       if (!PatchProxy.applyVoid(objArray, this, om, "8")) {
          this.X7(this.p.b(833, LiveRoomSignalMessage$SCKwaishopLiveActivityPendant.class).filter(new c(this)).subscribe(new g(this), b.b));
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       this.s = new d();
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, m.class, "4")) {
          return;
       }
       b9.a(this.t);
       m ts = this.s;
       Objects.requireNonNull(ts);
       if (!PatchProxy.applyVoid(objArray, ts, d.class, "4")) {
          b9.a(ts.j);
          ts.g();
       }
       ts = this.r;
       if (ts instanceof n) {
          ts.h(this.u);
       }
       return;
    }
    public final void P8(LiveRoomSignalMessage$AuctionInfoSignal p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "14")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       b9.a(this.t);
       LiveRoomSignalMessage$AuctionInfoSignal realEndTime = p0.realEndTime;
       long l = 0;
       if (realEndTime - l > 0) {
          p0.endTime = realEndTime;
       }
       long l1 = Math.max(l, (p0.endTime - o.d())) + (long)(p0.requestDelaySecond * 1000);
       a.u(MerchantMarketingShopLogBiz.AUCTION, "LiveAuctionPresenter", "delay send finishAuction", "delayMillis", Long.valueOf(l1), "endTime", Long.valueOf(p0.endTime));
       this.t = f.d().e(l1).subscribe(new i(this, p0));
       return;
    }
    public final long R8(LiveRoomSignalMessage$AuctionInfoSignal p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = 0;
       if (p0 == null) {
          return l;
       }
       LiveRoomSignalMessage$AuctionInfoSignal realEndTime = p0.realEndTime;
       if (realEndTime - l <= 0) {
          realEndTime = p0.endTime;
       }
       return (realEndTime - o.d());
    }
    public final void S8(int p0,LiveRoomSignalMessage$AuctionInfoSignal p1){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, om, "15")) {
          return;
       }
       if (p1 != null) {
          LiveRoomSignalMessage$AuctionInfoSignal realEndTime = p1.realEndTime;
          if (realEndTime > 0) {
             p1.endTime = realEndTime;
          }
       }
       this.s.k(p0, p1);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, m.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(m.class, new p());
       }else {
          obj.put(m.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "2")) {
          return;
       }
       this.p = this.r8("LIVE_MERCHANT_SIGNAL_SERVICE");
       this.q = this.r8("LIVE_MERCHANT_CALLER_CONTEXT_SERVICE");
       this.r = this.r8("LIVE_MERCHANT_AUCTION_SERVICE");
       this.v = this.r8("LIVE_BASIC_CONTEXT");
       return;
    }
}
