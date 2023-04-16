package j01.f;
import im8.g;
import j01.i0;
import k01.a;
import j01.a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.sort.LiveGiftSortType;
import j01.f$a;
import j01.f$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t45.d;
import brd.z;
import brd.t;
import j01.b;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lm1.i;
import com.kuaishou.live.core.show.gift.DrawingGift;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import android.content.res.Resources;
import java.lang.Integer;
import java.lang.CharSequence;
import e17.i;
import e17.s;
import java.lang.StringBuilder;
import w91.a;
import mk1.b;
import mk1.w;
import wkd.b;
import ad5.a;
import t02.a0;
import com.kuaishou.live.common.core.component.gift.gift.p;
import lp3.c;
import lp3.e;
import java.util.Map;
import jk1.f;
import mk1.h;
import com.yxcorp.gifshow.models.Gift;
import java.util.HashMap;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import lm1.f;
import com.kwai.framework.model.user.UserInfo;
import f92.b;
import p91.m;
import com.kuaishou.live.core.show.gift.GiftMessage;
import lm1.c;
import fq5.b;
import lm1.d;
import lm1.e;
import lm1.g;
import ik1.i0;
import java.lang.Number;
import java.util.Iterator;
import com.kuaishou.live.core.show.gift.DrawingGift$Point;
import android.util.SparseArray;
import com.kuaishou.live.common.core.component.gift.data.message.LiveGiftToAudienceMessage;
import java.util.ArrayList;
import e82.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import sz0.c;
import xp5.i;
import xp5.g;
import ekd.t0;
import android.os.SystemClock;
import k2b.u1;
import z12.e;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import d61.e0;
import com.kuaishou.common.encryption.model.DrawingGiftParam$b;
import com.kuaishou.common.encryption.model.DrawingGiftParam;
import java.lang.System;
import com.kuaishou.common.encryption.model.a$a;
import com.kuaishou.common.encryption.model.a;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Long;
import android.text.TextUtils;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.gifshow.log.h;
import com.kuaishou.live.core.basic.activity.x;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import fg6.a;
import com.google.gson.Gson;
import tkd.b;
import tkd.d;
import nl9.r;
import com.kuaishou.common.encryption.model.enums.GiftUserSource;
import java.lang.Enum;
import java.util.Collection;
import ekd.q;
import com.kuaishou.common.encryption.model.DrawingGiftPoint;
import com.kuaishou.common.encryption.model.BatchDrawingGiftParam$b;
import com.kuaishou.common.encryption.model.BatchDrawingGiftParam;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.common.encryption.model.DrawingSendInfo;
import hg2.e;
import ad5.b;
import j01.e;
import erd.o;
import qj1.h;
import j01.d;
import j01.c;
import j01.f$c;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import mm1.c;
import mm1.e;
import mm1.g;
import km1.b;
import xk1.a;
import vk1.a;
import wo1.a;
import j01.i;
import om1.a;
import el1.a;
import sz0.b;
import mrd.c;

public class f extends i0 implements g	// class@0029f7
{
    public c A;
    public b B;
    public final e C;
    public final f$d D;
    public c t;
    public a0 u;
    public e v;
    public a w;
    public a x;
    public a y;
    public LiveGiftSortType z;
    public static String sLivePresenterClassName = "GiftBoxSendDrawingGiftPresenter";

    public void f(a p0){
       super(p0);
       this.t = a.b;
       this.z = LiveGiftSortType.DEFAULT;
       this.C = new f$a(this);
       this.D = new f$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       this.X7(this.A.observeOn(d.a).subscribe(new b(this)));
       return;
    }
    public final boolean R8(i p0,DrawingGift p1){
       Object[] objArray;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 10;
       int i1 = 1;
       if (p1.mPoints.size() < i) {
          objArray = new Object[i1];
          objArray[0] = Integer.valueOf(i);
          s.h(this.l8().getString(R.string.arg_RES_7f102259, objArray));
          this.b9(p0, "CLIENT_SEND_PRE_CHECK", "[GiftBoxSendDrawingGiftPresenter][checkDrawingGiftValid]count:"+p1.mPoints.size(), 0x1870e);
          return 0;
       }else {
          i = 100;
          if (p1.mPoints.size() <= i) {
             return i1;
          }
          objArray = new Object[i1];
          objArray[0] = Integer.valueOf(i);
          s.h(this.l8().getString(R.string.arg_RES_7f102258, objArray));
          this.b9(p0, "CLIENT_SEND_PRE_CHECK", "[GiftBoxSendDrawingGiftPresenter][checkDrawingGiftValid]count:"+p1.mPoints.size(), 0x1870e);
          return 0;
       }
    }
    public final boolean S8(i p0,DrawingGift p1,boolean p2){
       boolean b;
       int this;
       i0 oi0 = this;
       a uoa = a.class;
       if (PatchProxy.isSupport(f.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, f.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = (oi0.p.k())? w.a(p1) * oi0.p.g().size(): w.a(p1);
       long l = b.a(0x4c90014d).q();
       long l1 = (long)i;
       b = true;
       if (l - l1 < 0 && oi0.u.x1.ge(0, p.j(oi0.p, b), (l1 - l), oi0.v.a(uoa).d6())) {
          this = 0x1870a;
          oi0.b9(p0, "CLIENT_SEND_PRE_CHECK", "[GiftBoxSendDrawingGiftPresenter][checkDrawingGiftValid]kCoin:"+l+"need:"+i+"is send to multiple receivers :"+oi0.p.k(), this);
          Gift gift = w.h(oi0.p, oi0.q);
          HashMap hashMap = new HashMap();
          String str = "type";
          if (oi0.p.d() == GiftTab.NormalGift) {
             hashMap.put(str, Integer.valueOf(oi0.z.getType()));
          }else {
             hashMap.put(str, Integer.valueOf(LiveGiftSortType.DEFAULT.getType()));
          }
          int i1 = oi0.Y8(p1);
          f uof = p0.b();
          uof.q(oi0.p.b());
          uof.m(i1);
          uof.j(b);
          String liveStreamId = oi0.u.Z2.getLiveStreamId();
          Gift gift1 = (gift != null)? gift.mId: -1;
          Gift mGiftType = (gift != null)? gift.mGiftType: -1;
          b uob = new b(liveStreamId, GiftMessage.createSelfGiftMessage(gift1, mGiftType, i1, 0, 0), gift, i1, false, true, 4);
          c uoc = new c("", 0, hashMap, oi0.u.b().t5().a(uoa).d6(), null);
          b.c(new d(uof, i1, uof.g(), g.a(this, "")));
          oi0.u.V1.G4(b);
          b = false;
       }
       return b;
    }
    public int V8(DrawingGift p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       Iterator iterator = p0.mPoints.iterator();
       while (iterator.hasNext()) {
          i = i + iterator.next().mPrice;
       }
       return i;
    }
    public GiftMessage W8(DrawingGift p0,boolean p1,UserInfo p2){
       i0 obj;
       if (PatchProxy.isSupport(f.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, this, f.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.q;
       int i = obj.H + 1;
       obj.H = i;
       obj.I.put(i, Integer.valueOf(0));
       GiftMessage giftMessage = (p1)? GiftMessage.createSelfDrawingGiftMessage(p0, this.q.H): LiveGiftToAudienceMessage.createSelfToAudienceDrawingGiftMessage(p0, p2, this.q.H);
       return giftMessage;
    }
    public List X8(DrawingGift p0,boolean p1,UserInfo p2){
       SparseArray obj;
       LiveGiftToAudienceMessage liveGiftToAu;
       if (PatchProxy.isSupport(f.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, this, f.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new SparseArray();
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.mPoints.iterator();
       while (iterator.hasNext()) {
          DrawingGift$Point point = iterator.next();
          GiftMessage giftMessage = obj.get(point.mGiftId);
          if (giftMessage == null) {
             giftMessage = (p1)? GiftMessage.createSelfGiftMessage(point.mGiftId, 1, 1, 1, -1): LiveGiftToAudienceMessage.createSelfToAudienceGiftMessage(point.mGiftId, 1, 1, -1, p2);
             giftMessage.mIsDrawingGift = true;
             obj.put(point.mGiftId, giftMessage);
             uArrayList.add(giftMessage);
          }else {
             int i = giftMessage.mCount + true;
             giftMessage.mCount = i;
          }
       }
       return uArrayList;
    }
    public int Y8(DrawingGift p0){
       int i;
       DrawingGift obj = PatchProxy.applyOneRefs(p0, this, f.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = p0.mPoints;
       if (obj != null && !obj.isEmpty()) {
          i = p0.mPoints.size();
          p0.mIsHandUp = true;
       }else {
          i = 0;
       }
       return i;
    }
    public void Z8(c p0,int p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uof, "17")) {
          return;
       }
       c.a(p0, p1, this.u.Z2.a());
       return;
    }
    public final void a9(i p0,int p1,boolean p2,UserInfo p3,DrawingGift p4){
       String str;
       Gift gift;
       Object[] objArray1;
       String str6;
       a$a a;
       FeedLogCtx uFeedLogCtx;
       DrawingGift$Point mLeft;
       a$a a1;
       c obj = this;
       object oobject = p0;
       int i = p1;
       boolean b = p2;
       object oobject1 = p3;
       object oobject2 = p4;
       i oi = i.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       f uof = f.class;
       int i1 = 5;
       int i2 = 4;
       int i3 = 3;
       int i4 = 2;
       int i5 = 1;
       int i6 = 0;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[i1];
          objArray[i6] = oobject;
          objArray[i5] = Integer.valueOf(p1);
          objArray[i4] = Boolean.valueOf(p2);
          objArray[i3] = oobject1;
          objArray[i2] = oobject2;
          if (PatchProxy.applyVoid(objArray, obj, uof, "8")) {
             return;
          }
       }
       if (!b && (oobject1 == null || !t0.a(oobject1.mId))) {
          str = "[GiftBoxSendDrawingGiftPresenter][httpSendDrawingGift]drawing gift receiver is invalid,receiver:";
          String str1 = (oobject1 == null)? "": oobject1.mId;
          obj.b9(oobject, "CLIENT_SEND_PRE_CHECK", str+str1, 0x1870f);
          return;
       }else {
          long l = SystemClock.elapsedRealtime();
          String str2 = u1.f();
          int i7 = obj.Y8(oobject2);
          String[] stringArray = new String[i2];
          stringArray[i6] = "taskSessionId=";
          stringArray[i5] = str2;
          stringArray[i4] = "giftCount=";
          stringArray[3] = String.valueOf(i7);
          e.c("LiveAudienceGiftBox", "sendDrawingGiftStart", stringArray);
          gift = w.h(obj.p, obj.q);
          w.i(obj.p, obj.q, gift);
          obj.P8(i);
          String str3 = e0.a(obj.u.c);
          String str4 = e0.b();
          String str5 = p0.a();
          int i8 = 0x4b316083;
          i4 = 6;
          int i9 = 0x691527a8;
          if (b) {
             if (PatchProxy.isSupport(uof)) {
                objArray1 = new Object[i4];
                objArray1[i6] = oobject;
                objArray1[i5] = Integer.valueOf(p1);
                objArray1[2] = oobject2;
                objArray1[3] = str3;
                objArray1[4] = str4;
                objArray1[5] = str5;
                str6 = PatchProxy.apply(objArray1, obj, uof, "6");
                if (str6 != patchProxyRe) {
                }
             }
             DrawingGiftParam$b uob = DrawingGiftParam.newBuilder();
             uob.a.clientTimestamp = System.currentTimeMillis();
             a = uob.a;
             a.seqId = System.currentTimeMillis();
             a.height = oobject2.mHeight;
             a.width = oobject2.mWidth;
             uob.a.liveStreamId = obj.v.a(og).getLiveStreamId();
             uob.a.visitorId = Long.valueOf(QCurrentUser.me().getId()).longValue();
             uob.a.giftToken = obj.P8(i);
             HashMap hashMap = new HashMap();
             hashMap.put("exp_tag", str3);
             hashMap.put("expTagList", str4);
             if (!TextUtils.isEmpty(str5)) {
                hashMap.put("creditExchangeId", str5);
             }
             uFeedLogCtx = obj.u.b().t5().a(oi).c0();
             if (uFeedLogCtx != null) {
                hashMap.put("interStid", uFeedLogCtx.stidContainer);
             }
             hashMap.put("commonStid", b.a(i8).i(obj.u.R().t0().o(), null));
             hashMap.put("recoGiftLlsid", obj.q.O(p0.c()));
             uob.a.logExtraInfo = a.a.q(hashMap);
             if (d.a(i9).OB(obj.u.c)) {
                uob.b(GiftUserSource.LIVE_FANS_TOP.ordinal());
             }else {
                uob.b(GiftUserSource.DEFAULT.ordinal());
             }
             if (!q.f(oobject2.mPoints)) {
                Iterator iterator = oobject2.mPoints.iterator();
                while (iterator.hasNext()) {
                   DrawingGift$Point point = iterator.next();
                   DrawingGift$Point mGiftId = point.mGiftId;
                   mLeft = point.mLeft;
                   DrawingGift$Point mTop = point.mTop;
                   DrawingGift$Point mRight = point.mRight;
                   DrawingGift$Point mBottom = point.mBottom;
                   point = point.mIsHandUp;
                   a1 = uob.a;
                   if (a1.drawingGiftPoints == null) {
                      a1.drawingGiftPoints = new ArrayList();
                   }
                   DrawingGiftPoint uDrawingGift = new DrawingGiftPoint(mGiftId, mLeft, mTop, mRight, mBottom, Boolean.valueOf(point));
                   uob.a.drawingGiftPoints.add(i5);
                }
             }
             str6 = uob.a().toJson();
          }else if(PatchProxy.isSupport(uof)){
             objArray1 = new Object[]{oobject,Integer.valueOf(p1),oobject1,oobject2,str3,str4,str5};
             str6 = PatchProxy.apply(objArray1, obj, uof, "7");
             if (str6 != patchProxyRe) {
             }
          }
          BatchDrawingGiftParam$b uob1 = BatchDrawingGiftParam.newBuilder();
          a1 = uob1.a;
          a1.height = oobject2.mHeight;
          a1.width = oobject2.mWidth;
          uob1.a.clientTimestamp = System.currentTimeMillis();
          uob1.a.seqId = System.currentTimeMillis();
          uob1.a.liveStreamId = obj.v.a(og).getLiveStreamId();
          uob1.a.visitorId = Long.valueOf(QCurrentUser.me().getId()).longValue();
          uob1.a.giftToken = obj.P8(i);
          if (d.a(i9).OB(obj.u.c)) {
             uob1.b(GiftUserSource.LIVE_FANS_TOP.ordinal());
          }else {
             uob1.b(GiftUserSource.DEFAULT.ordinal());
          }
          ArrayList uArrayList = new ArrayList();
          if (!q.f(oobject2.mPoints)) {
             Iterator iterator1 = oobject2.mPoints.iterator();
             while (iterator1.hasNext()) {
                mLeft = iterator1.next();
                DrawingGiftPoint uDrawingGift1 = new DrawingGiftPoint(mLeft.mGiftId, mLeft.mLeft, mLeft.mTop, mLeft.mRight, mLeft.mBottom, Boolean.valueOf(mLeft.mIsHandUp));
                uArrayList.add(a1);
                iterator1 = iterator1;
                gift = gift;
             }
          }
          Gift gift1 = gift;
          HashMap hashMap1 = new HashMap();
          hashMap1.put("exp_tag", str3);
          hashMap1.put("expTagList", str4);
          hashMap1.put("recoGiftLlsid", obj.q.O(p0.c()));
          if (!TextUtils.isEmpty(str5)) {
             hashMap1.put("creditExchangeId", str5);
          }
          uFeedLogCtx = obj.u.b().t5().a(oi).c0();
          if (uFeedLogCtx != null) {
             hashMap1.put("interStid", uFeedLogCtx.stidContainer);
          }
          hashMap1.put("commonStid", b.a(i8).i(obj.u.R().t0().o(), null));
          str = obj.p.h();
          if (!TextUtils.isEmpty(str)) {
             uob1.a.scene = str;
             hashMap1.put("scene", str);
             b.c0(LiveLogTag.LIVE_GUEST_ACTIVITY, "httpSendDrawingGift to audience append scene,", "scene", str);
          }
          uob1.a.logExtraInfo = a.a.q(hashMap1);
          DrawingSendInfo uDrawingSend = new DrawingSendInfo(Long.valueOf(oobject1.mId).longValue(), uArrayList);
          _monitor_enter(uob1);
          a$a a2 = uob1.a;
          if (a2.drawingSendInfos == null) {
             a2.drawingSendInfos = new ArrayList();
          }
          uob1.a.drawingSendInfos.add(uDrawingSend);
          _monitor_exit(uob1);
          str6 = uob1.a().toJson();
       label_03ed :
          if (b) {
             obj.u.z2.Nh((long)obj.V8(p4));
          }else {
             int i10 = p4;
          }
          c uoc = objArray1;
          f uof1 = this;
          i oi1 = p0;
          obj = objArray1;
          uoc = new c(uof1, oi1, p2, p4, p3, l, str2, i7, gift1);
          f$c uoc1 = new f$c(uof1, oi1, l, str2, i7, p4, p2, p3);
          d.a(0x630bc993).d1().x(str6).flatMap(new e(obj, b, p0)).retryWhen(new h()).doOnNext(d.b).subscribe(obj, i5);
          return;
          gift1 = gift;
          goto label_03ed ;
       }
    }
    public void b9(i p0,String p1,String p2,int p3){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, f.class, "18")) {
          return;
       }
       if (!this.v.b()) {
          this.w.yk(p0.e()).d(p1).f("SENDING_GIFT").g(p3).e(p2).a();
       }else {
          b.P(b.a, "[GiftBoxSendDrawingGiftPresenter][logTraceInfo]service manager cleared");
       }
       return;
    }
    public void c9(i p0,int p1,boolean p2,UserInfo p3,DrawingGift p4){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Boolean.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uof, "4")) {
             return;
          }
       }
       this.a9(p0, p1, p2, p3, p4);
       this.x.c(p2, p4);
       this.x.m();
       this.q.z.dismiss();
       a0 w2 = this.u.W2;
       if (w2 != null) {
          w2.a();
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new i();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, f.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(f.class, new i());
       }else {
          obj.put(f.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       super.j8();
       this.u = this.q8(a0.class);
       e uoe = this.r8("LIVE_SERVICE_MANAGER");
       this.v = uoe;
       this.w = uoe.a(a.class);
       this.x = this.q8(a.class);
       this.y = this.q8(a.class);
       this.B = this.s8(b.class);
       this.A = this.r8("current_sort_type_subject");
       return;
    }
}
