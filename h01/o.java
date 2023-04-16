package h01.o;
import im8.g;
import k51.c;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.sort.LiveGiftSortType;
import h01.o$a;
import h01.o$b;
import h01.o$c;
import h01.o$d;
import j01.x;
import k01.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import j01.m;
import j01.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t45.d;
import brd.z;
import brd.t;
import h01.m;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.framework.model.user.QCurrentUser;
import x57.e;
import x57.a;
import t02.a0;
import p91.m;
import e82.c;
import java.lang.Integer;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import sz0.c;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import lm1.i;
import java.util.List;
import com.yxcorp.gifshow.models.Gift;
import java.lang.Long;
import m53.n;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.app.Activity;
import r53.b;
import u07.t$a;
import h01.l;
import u07.u;
import u07.t;
import u07.j;
import e17.i;
import java.lang.StringBuilder;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import mk1.h;
import lm1.f;
import yz0.a;
import dl1.b;
import wkd.b;
import ad5.a;
import mk1.b;
import com.kuaishou.live.common.core.component.gift.gift.p;
import lp3.e;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import mm1.c;
import mm1.e;
import mm1.g;
import km1.b;
import java.util.Iterator;
import java.util.HashMap;
import f92.b;
import com.kuaishou.live.core.show.gift.GiftMessage;
import lm1.c;
import fq5.b;
import w91.a;
import lp3.c;
import java.util.Map;
import lm1.d;
import lm1.e;
import lm1.g;
import ik1.i0;
import j01.m$b;
import j01.x$b;
import wk1.b;
import jk1.f;
import h01.s;
import j01.f$d;
import om1.a;
import sz0.b;
import xp5.i;
import xp5.g;
import rp5.a;
import bt5.b;
import ty1.d;
import mrd.c;

public class o extends c implements g	// class@0025f5
{
    public m$b A;
    public f$d B;
    public LiveGiftSortType C;
    public c D;
    public b E;
    public final e F;
    public j G;
    public y H;
    public boolean I;
    public a J;
    public a0 p;
    public e q;
    public a r;
    public i s;
    public g t;
    public a u;
    public b v;
    public d w;
    public b x;
    public h y;
    public x$b z;
    public static String sLivePresenterClassName = "NormalGiftSenderPresenter";

    public void o(){
       super();
       this.C = LiveGiftSortType.DEFAULT;
       this.F = new o$a(this);
       this.G = new o$b(this);
       this.H = new o$c(this);
       this.I = false;
       o$d uod = new o$d(this);
       this.J = uod;
       this.U7(new x(uod));
       this.U7(new m(this.J));
       this.U7(new f(this.J));
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, o.class, "2")) {
          return;
       }
       this.X7(this.D.observeOn(d.a).subscribe(new m(this)));
       return;
    }
    public final long P8(){
       Object obj = PatchProxy.apply(null, this, o.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (QCurrentUser.me().isLogined() && this.p != null) {
          return a.a().c("giftBox", this.p.Z2.getLiveStreamId());
       }
       return -1;
    }
    public void R8(c p0,int p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oo, "18")) {
          return;
       }
       oo = this.p;
       if (oo == null) {
          b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[NormalGiftSenderPresenter] [goldCoinLogger] mLivePlayCallerContext is null ");
          return;
       }else {
          a0 z2 = oo.Z2;
          if (z2 == null) {
             b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[NormalGiftSenderPresenter] [goldCoinLogger] mLivePlayCallerContext.mLiveBasicContext is null ");
             return;
          }else {
             c.a(p0, p1, z2.a());
             return;
          }
       }
    }
    public final boolean S8(UserInfo p0,UserInfo p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, o.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.equals(p0.mId, p1.mId) ^ 0x01);
    }
    public final boolean V8(i p0,List p1,Gift p2,int p3,boolean p4){
       Gift obj;
       o oo = this;
       object oobject = p0;
       object oobject1 = p2;
       o oo1 = o.class;
       int i = 4;
       int i1 = 0;
       if (PatchProxy.isSupport(oo1)) {
          Object[] objArray = new Object[]{oobject,p1,oobject1,Integer.valueOf(p3),Boolean.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, oo1, "8");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p2.isKShellGift()) {
          obj = oobject1.mVirtualPrice;
          if (this.P8() - (long)(obj * p3) < 0) {
             long l = (long)(obj * p3);
             obj = oobject1.mName;
             if (!PatchProxy.isSupport(oo1) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(l), obj, this, oo1, "14")) {
                if (!PatchProxy.applyVoid(null, null, n.class, "5")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action = 0x7643;
                   uElementPack.name = "SHOW_CHEST_KSHELL_NOTENOUGHT";
                   u1.u0(i, uElementPack, n.b());
                }
                Activity activity = this.getActivity();
                if (activity != null) {
                   a0 z = oo.p.Z;
                   if (z == null || !z.o()) {
                      i.a(R.style.arg_RES_7f11066a, 0x7f10243c);
                   }else {
                      t$a uoa = new t$a(activity);
                      uoa.W0(R.string.arg_RES_7f102d3a);
                      uoa.y0(R.string.arg_RES_7f1018e9);
                      uoa.S0(R.string.arg_RES_7f1018e8);
                      uoa.Q0(R.string.arg_RES_7f1018e7);
                      uoa.u0(new l(this));
                      j.d(uoa);
                   }
                }
             }
             this.Y8(p0, "CLIENT_SEND_PRE_CHECK", "[NormalGiftSenderPresenter][isKShellGiftMoneyNotEnough]onInsufficientKShell:"+this.P8()+",need:"+(oobject1.mVirtualPrice * p3), 0x18708);
             this.Z8(p2, p1, p3, p4, oo.y.O(p0.c()), 0x18708, p0.b());
             return 1;
          }
       }
       return i1;
    }
    public final boolean W8(i p0,Gift p1,int p2){
       Object obj;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(o.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, o.class, "9");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       o tp = this.p;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyThreeRefs(p1, tp, Integer.valueOf(p2), null, a.class, "1");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(p1.isNebulaCreditGift()){
             a0 q = tp.Q;
             if (q != null && (q.e() * 100.00f) - (float)(p1.mVirtualPrice * p2) < 0) {
                b = true;
             }
          }
          b = false;
       }else {
          goto label_0046 ;
       }
       if (b) {
          i.a(R.style.arg_RES_7f11066a, 0x7f101dd2);
          this.Y8(p0, "CLIENT_SEND_PRE_CHECK", "[NormalGiftSenderPresenter][isNebulaCreditPayMoneyNotEnough]isNebulaCreditPayMoneyInsufficient true", 0x18709);
          return true;
       }else {
          return false;
       }
    }
    public final boolean X8(i p0,List p1,Gift p2,int p3,boolean p4){
       o oo = o.class;
       int i = 0;
       if (PatchProxy.isSupport(oo)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Boolean.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, oo, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       long l = b.a(0x4c90014d).q();
       if (l - (long)(p2.mPrice * p3) < 0 && this.c9(p.j(this.x, 1), ((long)(p2.mPrice * p3) - l))) {
          this.Y8(p0, "CLIENT_SEND_PRE_CHECK", "[NormalGiftSenderPresenter][isNotSufficientToSendGift]kCoin:"+l+",need:"+(p2.mPrice * p3), 0x1870a);
          this.Z8(p2, p1, p3, p4, this.y.O(p0.c()), 0x1870a, p0.b());
          return 1;
       }else {
          return i;
       }
    }
    public void Y8(i p0,String p1,String p2,int p3){
       if (PatchProxy.isSupport(o.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, o.class, "19")) {
          return;
       }
       if (!this.q.b()) {
          this.r.yk(p0.e()).d(p1).f("SENDING_GIFT").g(p3).e(p2).a();
       }else {
          b.P(b.a, "[NormalGiftSenderPresenter][logTraceInfo]service manager cleared");
       }
       return;
    }
    public final void Z8(Gift p0,List p1,int p2,boolean p3,String p4,int p5,f p6){
       Object obj = this;
       object oobject = p0;
       object oobject1 = p6;
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object[] objArray = new Object[]{oobject,p1,Integer.valueOf(p2),Boolean.valueOf(p3),p4,Integer.valueOf(p5),oobject1};
          if (PatchProxy.applyVoid(objArray, obj, oo, "20")) {
             return;
          }
       }
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          UserInfo userInfo = iterator.next();
          boolean b = (userInfo.mId).equals(obj.p.Z2.d());
          HashMap hashMap = new HashMap();
          String str = "type";
          if (obj.x.d() == GiftTab.NormalGift) {
             hashMap.put(str, Integer.valueOf(obj.C.getType()));
          }else {
             hashMap.put(str, Integer.valueOf(LiveGiftSortType.DEFAULT.getType()));
          }
          oobject1.q(userInfo);
          oobject1.j(b);
          b uob = new b(obj.p.Z2.getLiveStreamId(), GiftMessage.createSelfGiftMessage(oobject, p2), p0, p2, false, true, 4);
          c uoc = new c("", 0, hashMap, obj.p.b().t5().a(a.class).d6(), null);
          v14.c(new d(oobject1, uob, p6.g(), g.a(p5, "")));
          if (b) {
             obj.p.V1.G4(v14);
          }else {
             obj.p.V1.o4(v14);
          }
       }
       return;
    }
    public void a9(boolean p0,i p1,int p2,Gift p3,int p4,boolean p5,UserInfo p6){
       o oo = this;
       o oo1 = o.class;
       if (PatchProxy.isSupport(oo1)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),p1,Integer.valueOf(p2),p3,Integer.valueOf(p4),Boolean.valueOf(p5),p6};
          if (PatchProxy.applyVoid(objArray, this, oo1, "11")) {
             return;
          }
       }
       if (p0) {
          oo.A.a(p1, p2, p3, p4, p5);
       }else {
          oo.z.a(p1, p2, p3, p4, p6, p5);
       }
       return;
    }
    public void b9(boolean p0,Gift p1,int p2,boolean p3,String p4){
       if (PatchProxy.isSupport(o.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),p1,Integer.valueOf(p2),Boolean.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, o.class, "12")) {
             return;
          }
       }
       if (!p0 && (!this.x.k() && (p1.mCanCombo != null && p3))) {
          this.y.A.f(p4, 0);
       }
    label_0046 :
       return;
    }
    public final boolean c9(String p0,long p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, oo, "15");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.p.x1.ge(0, p0, p1, this.q.a(a.class).d6());
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new s();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, o.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(o.class, new s());
       }else {
          obj.put(o.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       this.p = this.q8(a0.class);
       this.x = this.q8(b.class);
       this.y = this.q8(h.class);
       this.z = this.q8(x$b.class);
       this.A = this.q8(m$b.class);
       this.B = this.q8(f$d.class);
       e uoe = this.r8("LIVE_SERVICE_MANAGER");
       this.q = uoe;
       this.r = uoe.a(a.class);
       this.E = this.s8(b.class);
       this.s = this.q.a(i.class);
       this.t = this.q.a(g.class);
       this.u = this.q.a(a.class);
       this.v = this.q.a(b.class);
       this.w = this.q.a(d.class);
       this.D = this.r8("current_sort_type_subject");
       return;
    }
}
