package l01.c;
import im8.g;
import k51.c;
import l01.a;
import java.util.HashMap;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import java.lang.String;
import lnc.a1;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.sort.LiveGiftSortType;
import l01.c$a;
import h01.o;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import h01.t;
import h01.e;
import i01.j;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import mk1.h;
import l01.c$b;
import cl1.b;
import cl1.c;
import t45.d;
import brd.z;
import brd.t;
import l01.b;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import mk1.b;
import com.kwai.framework.model.user.UserInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import lm1.i;
import java.lang.Integer;
import lp3.e;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import mm1.c;
import mm1.e;
import mm1.g;
import km1.b;
import java.util.List;
import com.kuaishou.android.live.log.b;
import java.util.Map;
import om1.a;
import com.yxcorp.gifshow.models.Gift;
import mk1.w;
import xk1.a;
import com.kuaishou.live.core.show.gift.DrawingGift;
import oy1.a;
import com.kuaishou.live.core.show.gift.DrawingGift$Point;
import cm1.a;
import com.kuaishou.live.common.core.component.trace.gift.bean.LiveSendGiftTraceInfo;
import com.kwai.framework.model.user.QCurrentUser;
import android.content.Context;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import va1.y;
import e17.i;
import java.lang.StringBuilder;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import bl1.a;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.LiveCustomGift;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import ik1.h0;
import ik1.h0$a;
import java.lang.Enum;
import qk1.a;
import va1.j;
import java.util.Collection;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import w91.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;
import ik1.a0;
import android.os.SystemClock;
import java.lang.Long;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchMoreInfoPackageV2;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Set;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import ik1.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import k2b.u1;
import com.kuaishou.live.common.core.component.gift.gift.p;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import q91.a;
import d61.h0;
import k2b.e0;
import l01.c$c;
import lm1.f;
import tk1.b;
import mk1.f;
import lm1.e;
import i01.n;
import h01.i;
import h01.x;
import h01.j;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;
import ry1.b;
import l01.f;
import el1.a;
import fl1.a;
import zk1.a;
import qk1.d;
import qk1.e;
import lp3.c;
import mrd.c;

public class c extends c implements g	// class@002e43
{
    public a A;
    public a B;
    public a C;
    public a D;
    public a E;
    public b F;
    public d G;
    public e H;
    public LiveGiftSortType I;
    public c J;
    public a K;
    public a p;
    public a q;
    public h r;
    public c s;
    public final HashMap t;
    public a0 u;
    public h v;
    public j w;
    public x x;
    public i y;
    public n z;
    public static String sLivePresenterClassName = "LiveAudienceGiftBoxSingleSendHandlerPresenter";

    public void c(){
       super();
       this.s = a.b;
       HashMap hashMap = new HashMap();
       this.t = hashMap;
       hashMap.put(GiftTab.PacketGift, a1.p(R.string.arg_RES_7f100523));
       hashMap.put(GiftTab.PrivilegeGift, a1.p(R.string.arg_RES_7f100525));
       hashMap.put(GiftTab.FansGroupGift, a1.p(R.string.arg_RES_7f100524));
       this.I = LiveGiftSortType.DEFAULT;
       this.K = new c$a(this);
       this.U7(new o());
       this.U7(new t());
       this.U7(new e());
       this.U7(new j());
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.v.t.l(new c$b(this));
       this.X7(this.J.observeOn(d.a).subscribe(new b(this)));
       return;
    }
    public final boolean P8(){
       Object obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.F.l();
    }
    public final boolean R8(UserInfo p0,UserInfo p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.equals(p0.mId, p1.mId) ^ 0x01);
    }
    public final void S8(i p0,String p1,String p2,int p3){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, c.class, "5")) {
          return;
       }
       this.V8(p0, "SENDING_GIFT", p1, p2, p3);
       return;
    }
    public final void V8(i p0,String p1,String p2,String p3,int p4){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoc, "6")) {
             return;
          }
       }
       if (!this.r.n.b()) {
          this.p.yk(p0.e()).d(p2).f(p1).g(p4).e(p3).a();
       }else {
          b.P(b.a, "[LiveAudienceGiftBoxSingleSendHandlerPresenter][logTraceInfo]service manager cleared");
       }
       return;
    }
    public void W8(Map p0){
       c uoc2;
       String uoc2;
       PatchProxyResult patchProxyRe1;
       c uoc3;
       Object obj3;
       c obj4;
       String str2;
       c f;
       boolean i1;
       ClientContent$BatchMoreInfoPackageV2 uBatchMoreIn;
       ClientEvent$ElementPackage uElementPack;
       ClientContent$ContentPackage uContentPack;
       ClientContent$GiftPackage uBaseFragmen1;
       HashMap uBaseFragmen2;
       Iterator iterator;
       DrawingGift$Point point;
       int i2;
       ArrayList uArrayList;
       Iterator iterator1;
       UserInfo mId;
       Iterator iterator2;
       Integer integer;
       Integer integer1;
       Gift mId1;
       List list;
       ClientContent$MoreInfoPackageV2[] moreInfoPack;
       int i3;
       ClientEvent$ElementPackage uElementPack1;
       ClientContent$ContentPackage uContentPack1;
       ClientContent$GiftPackage giftPackage;
       ClientContent$MoreInfoPackageV2 moreInfoPack1;
       ClientContent$MoreInfoPackageV2[] moreInfoPack2;
       int i4;
       int i5;
       GiftTab giftTab2;
       Object[] objArray1;
       DrawingGift uDrawingGift1;
       Object obj = this;
       HashMap hashMap = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(hashMap, obj, uoc, "7")) {
          return;
       }
       Object[] objArray = null;
       i oi = PatchProxy.apply(objArray, obj, uoc, "9");
       String str = 3;
       j oj = 4;
       c uoc1 = 2;
       Object[] obj1 = null;
       int i = 1;
       if (oi != patchProxyRe) {
       }else {
          oi = new i(obj.p.o6());
          Gift gift = w.h(obj.F, obj.v);
          if (!obj.E.n()) {
             DrawingGift uDrawingGift = obj.E.o();
             Gift gift1 = PatchProxy.applyOneRefs(uDrawingGift, objArray, a.class, "3");
             if (gift1 != patchProxyRe) {
             }else {
                uDrawingGift1 = uDrawingGift.mPoints;
                if (uDrawingGift1 != null && !uDrawingGift1.isEmpty()) {
                   DrawingGift$Point point1 = uDrawingGift1.get(obj1);
                   if (point1 != null) {
                      gift1 = a.a(point1.mGiftId);
                   }
                }
                gift1 = objArray;
             }
             uDrawingGift1 = uDrawingGift;
             gift = gift1;
          }else {
             uDrawingGift1 = objArray;
          }
          i5 = w.m(obj.F, obj.v);
          int i6 = w.i(obj.F, obj.v, gift);
          int i7 = obj.v.t.g();
          LiveSendGiftBaseTraceInfo liveSendGift = oi.e();
          liveSendGift.j(gift);
          liveSendGift.D(obj.F);
          liveSendGift.h(uDrawingGift1);
          i4 = (this.P8())? 1: 2;
          if (obj.F.k()) {
             i4 = 3;
          }
          liveSendGift.z(i4);
          liveSendGift.p(i7);
          liveSendGift.x(a.c(obj.F, i5, i6));
          liveSendGift.t(oj);
          oi.h(obj.F.d());
       }
       obj1 = oi;
       this.V8(obj1, "PRE_SEND_GIFT", "CLIENT_GIFT_BOX_SINGLE_GIFT_SEND_CLICK", "[LiveAudienceGiftBoxSingleSendHandlerPresenter][performSendGift]single send", 1);
       obj.S8(obj1, "CLIENT_CLICK_SEND_GIFT", "[LiveAudienceGiftBoxSingleSendHandlerPresenter][performSendGift]single send", i);
       String str1 = "CLIENT_SEND_PRE_CHECK";
       if (!QCurrentUser.me().isLogined()) {
          y.a(this.getContext(), this.getActivity().getUrl(), "live_gift_recharge", 44, a1.p(R.string.arg_RES_7f103081), obj.u.c.mEntity, null, null, null);
          obj.S8(obj1, str1, "[LiveAudienceGiftBoxSingleSendHandlerPresenter][performSendGift]no login", 0x18705);
          return;
       }else if(this.Y8() && !this.P8()){
          uoc2 = 1;
       }else {
          uoc2 = null;
       }
       if (uoc2) {
          uoc2 = obj.t.get(obj.F.d());
          if (!TextUtils.isEmpty(uoc2)) {
             i.d(R.style.arg_RES_7f110668, uoc2);
          }
          obj.S8(obj1, str1, "[LiveAudienceGiftBoxSingleSendHandlerPresenter][performSendGift]shouldOnlyAnchorAsReceiver:"+this.Y8()+",!isAnchorGiftReceiver:"+(this.P8() ^ i), 0x18706);
          return;
       }else {
          GiftPanelItem int uoc21 = obj.v.o.a();
          String obj2 = PatchProxy.applyOneRefs(uoc21, obj, uoc, "28");
          if (obj2 != patchProxyRe) {
             uoc21 = obj2.booleanValue();
          }else if(uoc21 != null && uoc21.isCustomGift()){
             int state = uoc21.getCustomGift().getState();
             i5 = 0x7f11066a;
             if (state) {
                if (state != i) {
                   if (state == uoc1 || state == str) {
                      b.Z(LiveLogTag.CUSTOM_GIFT, obj.s+"interruptSendingInvalidCustomGift block");
                      i.a(i5, R.string.arg_RES_7f102040);
                   }
                }else {
                   b.Z(LiveLogTag.CUSTOM_GIFT, obj.s+"interruptSendingInvalidCustomGift sending");
                   uoc21.getCustomGift().setState(str);
                }
             }else {
                b.Z(LiveLogTag.CUSTOM_GIFT, obj.s+"interruptSendingInvalidCustomGift failed");
                i.a(i5, R.string.arg_RES_7f10203f);
             }
             uoc21 = true;
          }
       label_0207 :
          uoc21 = false;
          if (uoc21) {
             obj.S8(obj1, str1, "[LiveAudienceGiftBoxSingleSendHandlerPresenter][performSendGift] interruptSendingInvalidCustomGift", 0x18731);
             return;
          }else {
             Gift uoc211 = w.h(obj.F, obj.v);
             if (uoc211 == null) {
                obj.S8(obj1, str1, "[LiveAudienceGiftBoxSingleSendHandlerPresenter][performSendGift]getCurrentSelectedGift is null", 0x18707);
                return;
             }else {
                h0 oh0 = new h0(obj.u.c, uoc211, w.i(obj.F, obj.v, uoc211));
                if (!PatchProxy.applyVoidOneRefs(oh0, obj, uoc, "11")) {
                   uoc21 = obj.E.n() ^ i;
                   i4 = obj.v.t.g();
                   f = obj.F;
                   if (!PatchProxy.isSupport(h0.class) || !PatchProxy.applyVoidFourRefs(f, Integer.valueOf(i4), Boolean.valueOf(uoc21), Boolean.FALSE, oh0, h0.class, "1")) {
                      GiftTab normalGift = GiftTab.NormalGift;
                      GiftTab giftTab1 = f.d();
                      i5 = h0$a.a[giftTab1.ordinal()];
                      if (i5 != i) {
                         if (i5 != uoc1) {
                            if (i5 != str) {
                               if (i5 != oj) {
                               label_02db :
                                  giftTab2 = normalGift;
                                  objArray1 = objArray;
                               label_02e5 :
                                  if (objArray1 == null) {
                                     obj2 = ": receiverUserInfo is null";
                                     ExceptionHandler.handleCaughtException(new IllegalArgumentException(giftTab1.name()+obj2));
                                     b.Z(LiveLogTag.GIFT, giftTab1.name()+obj2);
                                  }else {
                                     oh0.a(i4, uoc21, giftTab2, TextUtils.equals(objArray1.mId, f.b().mId), objArray1, null);
                                  }
                               }else {
                                  objArray1 = f.d.a();
                                  normalGift = GiftTab.FansGroupGift;
                               }
                            }else {
                               objArray1 = f.c.a();
                               normalGift = GiftTab.PrivilegeGift;
                            }
                         }else {
                            objArray1 = f.b.a();
                            normalGift = GiftTab.PacketGift;
                         }
                      }else if(f.k()){
                         List list1 = f.g();
                         Object obj5 = PatchProxy.applyOneRefs(list1, objArray, j.class, "2");
                         if (obj5 != patchProxyRe) {
                            i1 = obj5.booleanValue();
                         }else if(list1 == null || !list1.size()){
                            i1 = true;
                         }else {
                            i1 = false;
                         }
                         if (!i1) {
                            objArray1 = list1.get((list1.size() - i));
                         }else {
                            goto label_02db ;
                         }
                      }else {
                         objArray1 = f.e();
                      }
                      giftTab2 = normalGift;
                      goto label_02e5 ;
                   }
                }
                if (hashMap == null) {
                   hashMap = new HashMap();
                }
                obj2 = "type";
                if (obj1.c() == GiftTab.NormalGift) {
                   hashMap.put(obj2, Integer.valueOf(obj.I.getType()));
                }else {
                   hashMap.put(obj2, Integer.valueOf(LiveGiftSortType.DEFAULT.getType()));
                }
                hashMap.putAll(obj.q.d6());
                h0 oh01 = oh0;
                if (PatchProxy.applyVoidThreeRefs(obj1, oh0, hashMap, this, c.class, "8")) {
                   patchProxyRe1 = patchProxyRe;
                   uoc3 = uoc;
                   obj3 = obj1;
                }else {
                   uoc2 = obj.v;
                   obj4 = obj.E;
                   f = obj.F;
                   BaseFragment uBaseFragmen = obj.u.Z2.b();
                   ClientContent$LiveVoicePartyPackageV2 liveVoicePar = obj.u.Z2.y();
                   ClientContent$LiveStreamPackage liveStreamPa = obj.u.Z2.a();
                   i1 = obj.F.i();
                   GiftTab giftTab = obj1.c();
                   int indexInAdapt = obj.u.B.getIndexInAdapter();
                   a0 uoa0 = a0.class;
                   obj3 = obj1;
                   if (PatchProxy.isSupport(uoa0)) {
                      obj1 = new Object[11];
                      obj1[0] = uoc2;
                      obj1[1] = obj4;
                      obj1[2] = f;
                      obj1[3] = uBaseFragmen;
                      obj1[4] = liveVoicePar;
                      obj1[5] = liveStreamPa;
                      obj1[6] = oh01;
                      obj1[7] = Integer.valueOf(i1);
                      obj1[8] = giftTab;
                      obj1[9] = Integer.valueOf(indexInAdapt);
                      obj1[10] = hashMap;
                      patchProxyRe1 = patchProxyRe;
                      uoc3 = uoc;
                      if (!PatchProxy.applyVoid(obj1, null, uoa0, "6")) {
                      }
                   }else {
                      patchProxyRe1 = patchProxyRe;
                      uoc3 = uoc;
                      b uob = null;
                   }
                }
             label_064a :
                uoc21 = obj.v.o.a();
                obj4 = PatchProxy.applyOneRefs(uoc21, obj, uoc3, "29");
                if (obj4 != patchProxyRe1) {
                   str2 = obj4;
                }else {
                   b.Z(obj.s, "obtainSendExtraInfo");
                   if (uoc21 == null) {
                      b.Z(obj.s, "obtainSendExtraInfo null item");
                   }else if(uoc21.isCustomGift()){
                      uoc21 = uoc21.mCurrentSelectedAlbumPanelItem;
                      if (uoc21 != null) {
                         str2 = uoc21.mSendExtraInfo;
                         if (TextUtils.isEmpty(str2)) {
                            b.Z(LiveLogTag.CUSTOM_GIFT, "obtainSendExtraInfo empty info");
                         }else {
                            b.Z(LiveLogTag.CUSTOM_GIFT, "obtainSendExtraInfo valid info");
                         }
                      }else {
                         b.Z(LiveLogTag.CUSTOM_GIFT, "obtainSendExtraInfo null subItem");
                      }
                   }
                   str2 = null;
                }
                ClientContent$MoreInfoPackageV2[] uoc212 = obj3;
                uoc212.i(str2);
                uoc212.e().B(str2);
                obj.X8(uoc212);
                return;
             }
          }
       }
    }
    public void X8(i p0){
       UserInfo userInfo;
       boolean b1;
       f uof;
       UserInfo userInfo1;
       Gift gift;
       Gift gift1;
       c f;
       f uof2;
       boolean b3;
       Object obj = this;
       Object obj1 = p0;
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, uoc, "12")) {
          return;
       }
       int i = c$c.a[obj.F.d().ordinal()];
       boolean b = false;
       String str = 0x18707;
       String str1 = "gift_send_error";
       String str2 = "CLIENT_SEND_PRE_CHECK";
       int i1 = 3;
       if (i != 1) {
          int i2 = 2;
          if (i != i2) {
             if (i != i1) {
                if (i == 4 && !PatchProxy.applyVoidOneRefs(obj1, obj, uoc, "17")) {
                   userInfo = obj.F.d.a();
                   if (userInfo == null) {
                      ExceptionHandler.handleCaughtException(new IllegalArgumentException("onFansGroupGiftSend currentReceiver == null"));
                   }else {
                      b1 = obj.R8(userInfo, obj.F.b());
                      uof = new f(userInfo, obj.C.b(), obj.v.c.s(i1), false, false, (b1 ^ 0x01), obj.v.e.i(), 4, (obj.E.n() ^ 0x01), obj.v.t.g(), obj.v.O(p0.c()), w.k(obj.F, obj.v, obj.C.b()));
                      obj1.g(i);
                      if (!obj.E.n()) {
                         if (PatchProxy.isSupport(uoc)) {
                            userInfo1 = userInfo;
                            if (!PatchProxy.applyVoidThreeRefs(p0, userInfo, Boolean.valueOf(b1), this, c.class, "22")) {
                            }
                         }else {
                            userInfo1 = userInfo;
                         }
                      }else {
                         userInfo1 = userInfo;
                         if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidThreeRefs(p0, userInfo1, Boolean.valueOf(b1), this, c.class, "27")) {
                            gift = obj.C.b();
                            if (gift == null) {
                               ExceptionHandler.handleCaughtException(new IllegalArgumentException("handleFansGroupNotDrawingGiftSend gift == null"));
                               u1.R(str1, "handleFansGroupNotDrawingGiftSend gift == null", i1);
                               obj.S8(obj1, str2, "[LiveAudienceGiftBoxSingleSendHandlerPresenter][handleFansGroupNotDrawingGiftSend]getCurrentSelectedNormalGift is null", str);
                            }else if(!b1){
                               obj.z.c(p0, gift, userInfo1, true, false);
                            }else {
                               ExceptionHandler.handleCaughtException(new IllegalArgumentException("handleFansGroupNotDrawingGiftSend to audience error"));
                               u1.R(str1, "handleFansGroupNotDrawingGiftSend to audience error", i1);
                               obj.S8(obj1, str2, "[LiveAudienceGiftBoxSingleSendHandlerPresenter][handleFansGroupNotDrawingGiftSend]fans group gift not support send to audience", 0x1870d);
                            }
                         }
                      }
                   }
                }
             }else if(PatchProxy.applyVoidOneRefs(obj1, obj, uoc, "16")){
                userInfo = obj.H.a();
                if (userInfo == null) {
                   ExceptionHandler.handleCaughtException(new IllegalArgumentException("onPrivilegeGiftSend currentReceiver == null"));
                }else {
                   b1 = obj.R8(userInfo, obj.F.b());
                   uof = new f(userInfo, obj.B.b(), obj.v.c.s(i2), false, false, (b1 ^ 0x01), obj.v.e.i(), 4, (obj.E.n() ^ 0x01), obj.v.t.g(), obj.v.O(p0.c()), w.k(obj.F, obj.v, obj.B.b()));
                   obj1.g(i);
                   if (!obj.E.n()) {
                      if (PatchProxy.isSupport(uoc)) {
                         userInfo1 = userInfo;
                         if (!PatchProxy.applyVoidThreeRefs(p0, userInfo, Boolean.valueOf(b1), this, c.class, "21")) {
                         }
                      }else {
                         userInfo1 = userInfo;
                      }
                   }else {
                      userInfo1 = userInfo;
                      if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidThreeRefs(p0, userInfo1, Boolean.valueOf(b1), this, c.class, "26")) {
                         gift = obj.B.b();
                         if (gift == null) {
                            ExceptionHandler.handleCaughtException(new IllegalArgumentException(" handlePrivilegeNotDrawingGiftSend gift == null"));
                            u1.R(str1, "handlePrivilegeNotDrawingGiftSend gift == null", i1);
                            obj.S8(obj1, str2, "[LiveAudienceGiftBoxSingleSendHandlerPresenter][handlePrivilegeNotDrawingGiftSend]getCurrentSelectedNormalGift is null", str);
                         }else if(!b1){
                            obj.y.b(p0, gift, userInfo1, true, false);
                         }else {
                            ExceptionHandler.handleCaughtException(new IllegalArgumentException(" handlePrivilegeNotDrawingGiftSend to audience error"));
                            u1.R(str1, "handlePacketNotDrawingGiftSend to audience error", i1);
                            obj.S8(obj1, str2, "[LiveAudienceGiftBoxSingleSendHandlerPresenter][handlePrivilegeNotDrawingGiftSend]privilege gift not support send to audience", 0x1870d);
                         }
                      }
                   }
                }
             }
          }else if(PatchProxy.applyVoidOneRefs(obj1, obj, uoc, "15")){
             UserInfo userInfo2 = obj.G.a();
             if (userInfo2 == null) {
                ExceptionHandler.handleCaughtException(new IllegalArgumentException("onPacketGiftSend currentReceiver == null"));
             }else {
                f uof1 = new f(userInfo2, obj.A.b(), "", false, true, true, obj.v.e.i(), 4, (obj.E.n() ^ 0x01), obj.v.t.g(), obj.v.O(p0.c()), w.k(obj.F, obj.v, obj.A.b()));
                obj1.g(i2);
                if (!obj.E.n()) {
                   if (!PatchProxy.applyVoidOneRefs(obj1, obj, uoc, "20")) {
                      ExceptionHandler.handleCaughtException(new IllegalArgumentException("handlePacketDrawingGiftSend error!!! no supprot"));
                      u1.R(str1, "handlePacketDrawingGiftSend error!!! no support", i1);
                      obj.S8(obj1, str2, "[LiveAudienceGiftBoxSingleSendHandlerPresenter][handlePacketDrawingGiftSend]not support", 0x1870c);
                   }
                }else if(PatchProxy.applyVoidTwoRefs(obj1, userInfo2, obj, uoc, "25")){
                   gift1 = obj.A.b();
                   if (gift1 == null) {
                      ExceptionHandler.handleCaughtException(new IllegalArgumentException(" handlePacketNotDrawingGiftSend gift == null"));
                      u1.R(str1, "handlePacketNotDrawingGiftSend gift == null", i1);
                      obj.S8(obj1, str2, "[LiveAudienceGiftBoxSingleSendHandlerPresenter][handlePacketNotDrawingGiftSend]getCurrentSelectedNormalGift is null", str);
                   }else {
                      obj.x.a(obj1, gift1, userInfo2, b);
                   }
                }
             }
          }
       }else {
          String str3 = "[LiveAudienceGiftBoxSingleSendHandlerPresenter][handleNormalNotDrawingGiftSend]getCurrentSelectedNormalGift is null";
          if (obj.F.k()) {
             if (!PatchProxy.applyVoidOneRefs(obj1, obj, uoc, "14")) {
                List list = obj.F.g();
                if (list == null || !list.size()) {
                   b.B(obj.s, "send to multiple receivers but list is empty!");
                }else {
                   f = obj.F;
                   c v = obj.v;
                   uof2 = new f(null, obj.D.M2(), "", false, false, false, obj.v.e.i(), 4, (obj.E.n() ^ 0x01), obj.v.t.g(), obj.v.O(p0.c()), w.k(f, v, w.h(f, v)));
                   obj1.g(v3);
                   if (!obj.E.n()) {
                      if (!PatchProxy.applyVoidTwoRefs(obj1, list, obj, uoc, "19")) {
                         obj.w.a(obj1, list, b);
                      }
                   }else if(PatchProxy.applyVoidTwoRefs(obj1, list, obj, uoc, "24")){
                      gift1 = obj.D.M2();
                      if (gift1 == null) {
                         ExceptionHandler.handleCaughtException(new IllegalArgumentException(" handleNormalNotDrawingGiftSend gift == null"));
                         u1.R(str1, "handleNormalNotDrawingGiftSend gift == null", i1);
                         obj.S8(obj1, str2, str3, str);
                      }else if(gift1.isMagicBoxGift()){
                         i.d(R.style.arg_RES_7f110668, a1.p(R.string.arg_RES_7f101263));
                      }else {
                         obj.w.c(obj1, list, gift1, b);
                      }
                   }
                }
             }
          }else if(PatchProxy.applyVoidOneRefs(obj1, obj, uoc, "13")){
             UserInfo userInfo3 = obj.F.e();
             boolean b2 = obj.R8(userInfo3, obj.F.b());
             int i3 = b2 ^ 0x01;
             f = obj.F;
             c v1 = obj.v;
             uof2 = new f(userInfo3, obj.D.M2(), obj.v.c.s(b2), false, false, i3, obj.v.e.i(), 4, (obj.E.n() ^ 0x01), obj.v.t.g(), obj.v.O(p0.c()), w.k(f, v1, w.h(f, v1)));
             obj1.g(i);
             if (!obj.E.n()) {
                if (PatchProxy.isSupport(uoc)) {
                   b3 = b2;
                   if (!PatchProxy.applyVoidThreeRefs(p0, userInfo3, Boolean.valueOf(b2), this, c.class, "18")) {
                   }
                }else {
                   b3 = b2;
                }
             }else {
                b3 = b2;
                if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidThreeRefs(p0, userInfo3, Boolean.valueOf(b3), this, c.class, "23")) {
                   gift1 = obj.D.M2();
                   if (gift1 == null) {
                      ExceptionHandler.handleCaughtException(new IllegalArgumentException(" handleNormalNotDrawingGiftSend gift == null"));
                      u1.R(str1, "handleNormalNotDrawingGiftSend gift == null", i1);
                      obj.S8(obj1, str2, str3, str);
                   }else {
                      obj.w.d(p0, b3, gift1, userInfo3, i3, false);
                   }
                }
             }
          }
       }
    label_04e0 :
       return;
    }
    public final boolean Y8(){
       GiftTab obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.F.d();
       boolean b = true;
       if (obj == GiftTab.FansGroupGift || obj == GiftTab.PrivilegeGift) {
          return b;
       }
       if (obj != GiftTab.PacketGift) {
          return false;
       }
       LiveUserStatusResponse liveUserStat = this.u.b3.D1();
       if (this.F.k()) {
          return b;
       }
       if (liveUserStat == null || liveUserStat.mEnableSendMagicBoxToGuest != null) {
          b = false;
       }
       return b;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, c.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(c.class, new f());
       }else {
          obj.put(c.class, null);
       }
       return obj;
    }
    public void j8(){
       h oh = h.class;
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.u = this.q8(a0.class);
       this.v = this.q8(oh);
       this.w = this.q8(j.class);
       this.x = this.q8(x.class);
       this.y = this.q8(i.class);
       this.z = this.q8(n.class);
       this.A = this.q8(a.class);
       this.B = this.q8(a.class);
       this.C = this.q8(a.class);
       this.D = this.q8(a.class);
       this.E = this.q8(a.class);
       this.F = this.q8(b.class);
       this.G = this.q8(d.class);
       this.H = this.q8(e.class);
       oh = this.q8(oh);
       this.r = oh;
       this.p = oh.n.a(a.class);
       this.q = this.r.n.a(a.class);
       this.J = this.r8("current_sort_type_subject");
       return;
    }
}
