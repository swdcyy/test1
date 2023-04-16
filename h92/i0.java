package h92.i0;
import im8.g;
import k51.c;
import mrd.c;
import java.util.HashMap;
import h92.i0$a;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.CopyOnWriteArrayList;
import h92.i0$b;
import h92.i0$c;
import h92.e0;
import h92.g0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h92.c;
import h92.s$c;
import h92.f0;
import vq5.b;
import vq5.d;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;
import java.util.List;
import i92.l$a;
import i92.l;
import ekd.k1;
import java.util.Random;
import com.yxcorp.gifshow.models.Gift;
import lm1.i;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import om1.a;
import com.kuaishou.live.common.core.component.trace.gift.bean.LiveSendGiftTraceInfo;
import com.kwai.framework.model.user.User;
import xp5.g;
import lm1.f;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.common.core.component.gift.gift.p;
import lm1.e;
import ok.x;
import com.kuaishou.live.core.basic.model.LiveGiftGuideConfig;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.framework.model.user.QCurrentUser;
import o56.c;
import o56.a;
import android.app.Application;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import va1.y;
import java.util.Collection;
import com.kwai.imsdk.internal.util.b;
import java.util.Iterator;
import h92.a;
import h92.d0;
import z1.a;
import h92.s$d;
import hj1.c;
import hj1.d;
import java.util.Map;
import gq5.f;
import brd.y;
import java.lang.StringBuilder;
import wkd.b;
import ad5.a;
import lp3.i;
import mm1.c;
import mm1.e;
import mm1.g;
import km1.b;
import hg2.e;
import f92.b;
import p91.m;
import com.kuaishou.live.core.show.gift.GiftMessage;
import lm1.c;
import fq5.b;
import lp3.e;
import w91.a;
import lp3.c;
import lm1.d;
import lm1.g;
import ik1.i0;
import com.kuaishou.live.external.invoke.deserializer.gift.PacketGift;
import ht5.b$b;
import h92.l0;
import ht5.b;
import ht5.a;
import h92.k0;
import androidx.collection.ArrayMap;
import fg6.a;
import com.google.gson.Gson;
import ht5.d;
import com.kuaishou.live.core.basic.model.LiveGiftGuideConfig$AttachGiftConfig;
import gj1.b;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveAudienceSendExplicitGiftConfirmDialog$a;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveAudienceSendExplicitGiftConfirmDialog;
import h92.b0;
import android.content.DialogInterface$OnDismissListener;
import com.kuaishou.live.core.basic.activity.x;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import androidx.fragment.app.Fragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import h92.f;
import androidx.fragment.app.c;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import java.lang.Long;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.live.common.core.component.recharge.d;
import lnc.a1;
import h92.p0;
import xp5.i;
import rp5.a;
import bt5.b;
import ty1.d;

public class i0 extends c implements g	// class@002d11
{
    public g A;
    public a B;
    public b C;
    public d D;
    public d E;
    public i0$d F;
    public c G;
    public final c H;
    public b I;
    public int J;
    public int K;
    public LiveAudienceSendExplicitGiftConfirmDialog L;
    public final List M;
    public final c N;
    public final LiveAudienceSendExplicitGiftConfirmDialog$a O;
    public final LiveGuideGiftAnimationView$b P;
    public final Runnable Q;
    public final Map p;
    public a0 q;
    public x r;
    public x s;
    public s$c t;
    public e u;
    public s$d v;
    public l w;
    public i x;
    public a y;
    public i z;
    public static String sLivePresenterClassName = "LiveAudienceNormalGiftGuidePresenter";

    public void i0(c p0){
       super();
       this.p = new HashMap();
       this.F = new i0$a(this);
       this.G = PublishSubject.g();
       this.K = 1;
       this.M = new CopyOnWriteArrayList();
       this.N = new i0$b(this);
       this.O = new i0$c(this);
       this.P = new e0(this);
       this.Q = new g0(this);
       this.H = p0;
    }
    public void E8(){
       i0 oi0 = i0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi0, "3")) {
          return;
       }
       this.t.b(this.N);
       if (!PatchProxy.applyVoid(objArray, this, oi0, "4")) {
          this.E.t5("openattachgiftalert", new f0(this));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, i0.class, "5")) {
          return;
       }
       this.K = 1;
       this.t.a(this.N);
       x.E(this.L);
       this.E.Z4("openattachgiftalert");
       this.M.clear();
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, i0.class, "17")) {
          return;
       }
       this.w.a().j();
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, i0.class, "14")) {
          return;
       }
       this.J = k1.b.nextInt(0x989680);
       return;
    }
    public i S8(Gift p0,int p1,int p2){
       LiveSendGiftTraceInfo obj;
       i0 oi0 = this;
       if (PatchProxy.isSupport(i0.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, i0.class, "20");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = oi0.y.o6();
       obj.j(p0);
       obj.t(p1);
       obj.s(p2);
       User user = oi0.A.I();
       if (user == null) {
          user = new User();
       }
       f uof = new f(UserInfo.convertFromQUser(user), p0, "", p.k(oi0.K), false, true, 0, p1, false, 1, "", null);
       i oi = new i(obj);
       oi.g(v4);
       return oi;
    }
    public String V8(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, i0.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.r.get() != null) {
          objArray = this.r.get().mRecoGiftLlsid;
       }else {
          b.Z(LiveLogTag.GIFT_GUIDE, "[LiveAudienceNormalGiftGuidePresenter][getRecoGiftLlsid]:mGiftGuideInfoSupplier.get\(\) is null");
       }
       if (TextUtils.x(objArray)) {
          objArray = "";
       }
       return objArray;
    }
    public void W8(boolean p0,int p1){
       Object obj = this;
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), obj, oi0, "8")) {
          return;
       }
       String obj1 = obj.r.get();
       Object obj2 = obj.s.get();
       int i = 6;
       boolean b = true;
       int i1 = (obj1 != null && obj1.mExplicitGiftType == 4)? 15: 1;
       i oi = obj.S8(obj2, i, i1);
       this.Y8(oi, "SENDING_GIFT", "CLIENT_CLICK_SEND_GIFT", "[LiveAudienceNormalGiftGuidePresenter][handleNormalGiftGuideClick]normal guide send gift", 1);
       if (this.getContext() != null && (obj1 == null || obj2 == null)) {
          this.Y8(oi, "SENDING_GIFT", "CLIENT_SEND_PRE_CHECK", "[LiveAudienceNormalGiftGuidePresenter][handleNormalGiftGuideClick]context:"+this.getContext()+",guideInfo:"+obj1+",explicitGift:"+obj2, 0x1871b);
          return;
       }else if(!QCurrentUser.me().isLogined()){
          y.a(this.getContext(), this.getActivity().getUrl(), "live_gift_guide_recharge", 44, a.a().a().getString(R.string.arg_RES_7f103081), obj.q.c.mEntity, null, null, null);
          this.Y8(oi, "SENDING_GIFT", "CLIENT_SEND_PRE_CHECK", "[LiveAudienceNormalGiftGuidePresenter][handleNormalGiftGuideClick] not login", 0x18705);
          return;
       }else if(!b.c(obj.M)){
          Iterator iterator = obj.M.iterator();
          while (true) {
             if (iterator.hasNext()) {
                a uoa = iterator.next();
                if (uoa != null && uoa.a(obj1.mExplicitGiftType, new d0(obj, oi))) {
                   return;
                }
                continue ;
             }
          }
       }
       obj1 = obj.v.c();
       c f iterator1 = oi.b();
       iterator1.n(this.V8());
       iterator1.r(2);
       iterator1.o(obj1);
       iterator1 = d.a(obj.r.get(), obj2.mId);
       obj.p.put(Integer.valueOf(obj2.mId), iterator1);
       if (p0 && iterator1.a()) {
          this.c9(obj.s.get(), obj1, p1, 6, 4, 0);
       }else if(p.m(obj2)){
          obj.q.g2.t();
          obj.w.a().d(b);
          obj.w.a().c();
          this.b9(oi, obj2, 1, obj1, "guide_gift", 2, 6, 4);
          obj.G.onNext(Boolean.TRUE);
       }else {
          oi0 = this;
          i oi1 = oi;
          oi0.Y8(oi1, "SENDING_GIFT", "CLIENT_SEND_PRE_CHECK", "[LiveAudienceNormalGiftGuidePresenter][handleNormalGiftGuideClick]kCoin:"+b.a(0x4c90014d).q()+",need:"+p.g(obj2), 0x1870a);
          oi0.a9(oi1, obj2, 1, obj.K, obj1, this.V8(), 6, p1, 0x1870a);
          obj.d9(p.h(obj2));
       }
       return;
    }
    public boolean X8(){
       Object obj = PatchProxy.apply(null, this, i0.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.r.get() != null && this.r.get().mExplicitGiftType != 2)? true: false;
       return b;
    }
    public void Y8(i p0,String p1,String p2,String p3,int p4){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, oi0, "21")) {
             return;
          }
       }
       if (!this.x.b()) {
          this.y.yk(p0.e()).d(p2).f(p1).g(p4).e(p3).a();
       }else {
          b.P(b.a, "[LiveAudienceNormalGiftGuidePresenter][logTraceInfo]service manager cleared");
       }
       return;
    }
    public void Z8(){
       if (PatchProxy.applyVoid(null, this, i0.class, "2")) {
          return;
       }
       this.K = 1;
       this.R8();
       this.w.a().d(false);
       this.u.ma();
       return;
    }
    public void a9(i p0,Gift p1,int p2,int p3,String p4,String p5,int p6,int p7,int p8){
       i0 oi0 = this;
       i0 oi01 = i0.class;
       if (PatchProxy.isSupport(oi01)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, this, oi01, "22")) {
             return;
          }
       }
       b uob = new b(oi0.q.Z2.getLiveStreamId(), GiftMessage.createSelfGiftMessage(p1, p2), p1, p2, false, true, p6);
       f uof = p0.b();
       c uoc = new c("", null, 0, oi0.q.b().t5().a(a.class).d6(), 0);
       oi01.c(new d(uof, v3, uof.g(), g.a(0x1870a, "")));
       oi0.q.V1.G4(oi01);
       return;
    }
    public void b9(i p0,Gift p1,int p2,String p3,String p4,int p5,int p6,int p7){
       Object[] objArray;
       b uob1;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p3;
       object oobject3 = p4;
       i0 oi0 = i0.class;
       int i = 3;
       int i1 = 4;
       int i2 = 7;
       int i3 = 6;
       int i4 = 5;
       int i5 = 0;
       if (PatchProxy.isSupport(oi0)) {
          objArray = new Object[]{oobject,oobject1,Integer.valueOf(p2),oobject2,oobject3,Integer.valueOf(p5),Integer.valueOf(p6),Integer.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, obj, oi0, "10")) {
             return;
          }
       }
       f uof = p0.b();
       if (oobject1 instanceof PacketGift && oobject1.mCanCombo != null) {
          uof.p(1);
          if (!PatchProxy.applyVoidThreeRefs(p0, p1, p4, this, i0.class, "12")) {
             if (obj.q.I1 == null) {
                this.Y8(p0, "SENDING_GIFT", "CLIENT_SEND_PRE_CHECK", "[LiveAudienceNormalGiftGuidePresenter][sendPacketComboGift]send gift service is null", 0x18719);
             }else {
                HashMap hashMap = new HashMap();
                hashMap.put("recoGiftLlsid", this.V8());
                b$b uob = new b$b(oobject1);
                uob.d(1);
                uob.f = oobject3;
                uob.b(obj.K);
                uob.c(obj.J);
                uob.h(hashMap);
                uob.j(UserInfo.convertFromQUser(obj.q.Z2.I()));
                uob.m = new l0(obj);
                uob1 = uob.a();
                oobject.g(f.a(uob1));
                uob1.a("key_send_gift_context", oobject);
                p0.e().k(uob1);
                obj.q.I1.Yh(uob1);
                obj.K = obj.K + 1;
             }
          }
       }else if(PatchProxy.isSupport(oi0)){
          objArray = new Object[i2];
          objArray[i5] = oobject;
          objArray[1] = oobject1;
          objArray[2] = Integer.valueOf(p2);
          objArray[i] = oobject2;
          objArray[i1] = Integer.valueOf(p6);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p7);
          if (!PatchProxy.applyVoid(objArray, obj, oi0, "11")) {
          }
       }else if(obj.q.I1 == null){
          this.Y8(p0, "SENDING_GIFT", "CLIENT_SEND_PRE_CHECK", "[LiveAudienceNormalGiftGuidePresenter][sendNormalGift]send gift service is null", 0x18719);
       }else {
          HashMap hashMap1 = new HashMap();
          hashMap1.put("recoGiftLlsid", this.V8());
          ArrayMap uArrayMap = new ArrayMap();
          uArrayMap.put("panel_source", String.valueOf(p7));
          b$b uob2 = new b$b(oobject1);
          uob2.g(oobject2);
          uob2.e(a.a.q(uArrayMap));
          uob2.d(p2);
          uob2.f(p6);
          uob2.l(p5);
          uob2.h(hashMap1);
          uob2.i(1);
          uob2.k(new k0(obj, oobject1, oobject2));
          uob1 = uob2.a();
          uob1.a("key_send_gift_context", oobject);
          if (oobject1.mCanCombo != null) {
             uob1.c = obj.K;
             uob1.d = obj.J;
             p0.e().k(uob1);
             f uof1 = p0.b();
             if (obj.K > 1) {
                i5 = true;
             }
             uof1.k(i5);
             obj.q.I1.a7(uob1);
             obj.K = obj.K + 1;
          }else {
             p0.e().k(uob1);
             obj.q.I1.a7(uob1);
             obj.K = 1;
          }
       }
       return;
    }
    public final void c9(Gift p0,String p1,int p2,int p3,int p4,String p5){
       String str1;
       i0 oi0 = this;
       object oobject = p0;
       i0 oi01 = i0.class;
       int i = 0;
       int i1 = 1;
       if (PatchProxy.isSupport(oi01)) {
          Object[] objArray = new Object[]{oobject,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, this, oi01, "9")) {
             return;
          }
       }
       Object obj = oi0.r.get();
       LiveGiftGuideConfig$AttachGiftConfig uAttachGiftC = b.b(obj, oobject.mId);
       i oi = this.S8(oobject, p3, i1);
       if (this.getActivity() != null && (obj == null || obj.mExplicitGiftConfirmDialogInfo == null)) {
          this.Y8(oi, "PRE_SEND_GIFT", "CLIENT_BOTTOM_BAR_GIFT_CONFIRM_SHOW", "[LiveAudienceNormalGiftGuidePresenter][showExplicitGiftPromptDialog]activity:"+this.getActivity()+",explicitGift:"+oobject+",giftGuideInfo:"+obj, 0x1871b);
          return;
       }else {
          k1.n(this);
          x.E(oi0.L);
          Object obj1 = obj.mExplicitGiftConfirmDialogInfo.get(String.valueOf(oobject.mId));
          i0 o = oi0.O;
          if (uAttachGiftC != null && uAttachGiftC.mEnableDefaultSelectNotNotify != null) {
             i = true;
          }
          String str = null;
          uAttachGiftC = (uAttachGiftC != null && !TextUtils.x(uAttachGiftC.mNotNotifyText))? uAttachGiftC.mNotNotifyText: "";
          LiveAudienceSendExplicitGiftConfirmDialog liveAudience = LiveAudienceSendExplicitGiftConfirmDialog.xh(p0, o, i, str, obj1, uAttachGiftC, p2, p3, p4, p1, p5);
          oi0.L = liveAudience;
          liveAudience.k0(new b0(this));
          if (oi0.q.R().t0().isAdded()) {
             f.d(oi0.q.Z2.a(), oobject.mId, 1, false, p4, obj.mRecoGiftLlsid);
             this.Y8(oi, "PRE_SEND_GIFT", "CLIENT_BOTTOM_BAR_GIFT_CONFIRM_SHOW", "[LiveAudienceNormalGiftGuidePresenter][showExplicitGiftPromptDialog]dialog show", 1);
             oi0.L.Cb(oi0.q.R().t0().getFragmentManager(), "liveAudienceGiftGuideSendExplicitGiftConfirm");
          }
          return;
       }
    }
    public void d9(long p0){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, oi0, "13")) {
          return;
       }
       oi0 = this.q;
       d.e("LIVE_ROOM_CHEAP_GIFT_BUTTON", this.getActivity(), this.q.Z2.getLiveStreamId(), this.q.Z2.d(), p0, oi0.p, oi0.c.getExpTag(), this.x.a(a.class).d6());
       x.H(a1.p(R.string.arg_RES_7f101c45));
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i0.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, i0.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(i0.class, new p0());
       }else {
          obj.put(i0.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i0.class, "1")) {
          return;
       }
       this.q = this.q8(a0.class);
       this.r = this.r8("giftGuideInfoSupplierAccessId");
       this.s = this.r8("explicitGiftSupplierAccessId");
       this.t = this.q8(s$c.class);
       this.u = this.r8("LIVE_AUDIENCE_SEND_GIFT_REAL_ACTION_SERVICE");
       this.v = this.q8(s$d.class);
       this.w = this.q8(l.class);
       i oi = this.r8("LIVE_SERVICE_MANAGER");
       this.x = oi;
       this.y = oi.a(a.class);
       this.z = this.x.a(i.class);
       this.A = this.x.a(g.class);
       this.B = this.x.a(a.class);
       this.C = this.x.a(b.class);
       this.D = this.x.a(d.class);
       this.E = this.r8("LIVE_ROUTER_SERVICE");
       return;
    }
}
