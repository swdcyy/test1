package com.kuaishou.live.core.show.pk.bottombar.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.k1;
import java.util.Random;
import com.yxcorp.gifshow.models.Gift;
import lm1.i;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import om1.a;
import com.kuaishou.live.common.core.component.trace.gift.bean.LiveSendGiftTraceInfo;
import sw1.c;
import lp3.e;
import km1.b;
import java.util.List;
import com.kuaishou.android.live.log.b;
import mm1.c;
import mm1.e;
import mm1.g;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import w91.a;
import lp3.c;
import java.util.Map;
import android.app.Activity;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.live.common.core.component.recharge.d;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.util.HashMap;
import pm8.a;
import ht5.b$b;
import com.kuaishou.live.core.show.pk.bottombar.i$b;
import ht5.d;
import ht5.b;
import lm1.f;
import id2.p;
import lnc.c3$a;
import lnc.c3;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.QCurrentUser;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import va1.y;
import sw1.a;
import xp5.g;
import com.kwai.framework.model.user.UserInfo;
import lm1.e;
import com.kuaishou.live.common.core.component.gift.gift.p;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import com.yxcorp.utility.SystemUtil;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import q2b.h$b;
import com.google.common.collect.ImmutableMap;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;
import wkd.b;
import ad5.a;
import f92.b;
import com.kuaishou.live.core.show.gift.GiftMessage;
import lm1.c;
import lm1.d;
import lm1.g;
import ik1.i0;
import hj1.d;
import hj1.c;
import java.util.Objects;
import hj1.d$a;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.basic.model.LiveGiftGuideConfig$AttachGiftConfig;
import hj1.b;
import id2.r;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveAudienceSendExplicitGiftConfirmDialog$a;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveAudienceSendExplicitGiftConfirmDialog;
import id2.o;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.c;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import androidx.collection.ArrayMap;
import com.kuaishou.live.core.show.pk.bottombar.g;
import com.kuaishou.live.common.core.component.gift.domain.combo.animation.LiveGiftComboAnimationView;
import com.kuaishou.live.common.core.component.gift.domain.combo.animation.LiveGiftBoxGiftParticleAnimationView;
import com.kuaishou.live.common.core.component.gift.domain.combo.animation.LiveGiftBoxComboTextAnimationView;
import com.kuaishou.live.core.show.pk.bottombar.LivePkRecommendGiftSendButtonView;
import android.view.View;
import com.yxcorp.utility.n;
import com.kuaishou.live.core.show.pk.bottombar.i$a;
import id2.q;
import android.widget.FrameLayout;
import com.kuaishou.live.core.show.pk.bottombar.d;
import id2.i;
import java.lang.Runnable;
import android.view.View$OnTouchListener;
import sw1.d$a;
import sw1.d;

public class i	// class@000d82
{
    public d A;
    public int B;
    public c C;
    public LivePkRecommendGiftInfo$PkRecommendGiftsList D;
    public LiveAudienceSendExplicitGiftConfirmDialog a;
    public g b;
    public LiveGiftComboAnimationView c;
    public LiveGiftBoxGiftParticleAnimationView d;
    public LiveGiftBoxComboTextAnimationView e;
    public View f;
    public LivePkRecommendGiftSendButtonView g;
    public boolean h;
    public c i;
    public Activity j;
    public ClientContent$LiveStreamPackage k;
    public String l;
    public String m;
    public Gift n;
    public String o;
    public int p;
    public LiveStreamFeed q;
    public LiveBizParam r;
    public String s;
    public a t;
    public e u;
    public a v;
    public i w;
    public g x;
    public a y;
    public b z;
    public static boolean E = false;
    public static boolean F;
    public static String G = "HOLD";
    public static String H = "CLICK";

    public void i(){
       super();
       this.a();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, i.class, "9")) {
          return;
       }
       this.B = k1.b.nextInt(0x989680);
       return;
    }
    public i b(Gift p0,boolean p1,String p2,int p3){
       LiveSendGiftTraceInfo obj;
       int i;
       if (PatchProxy.isSupport(i.class)) {
          obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), p2, Integer.valueOf(p3), this, i.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.v.o6();
       obj.j(p0);
       i = c.b(p2, p3);
       if (p1) {
          i = 5;
       }
       obj.t(i);
       obj.s(5);
       return new i(obj);
    }
    public void c(i p0,String p1,String p2,String p3,int p4){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, oi, "14")) {
             return;
          }
       }
       if (this.u.b()) {
          b.P(b.a, "[LivePkRecommendGiftSendProcessor][logTraceInfo]service manager cleared");
          return;
       }else {
          this.v.yk(p0.e()).d(p2).f(p1).g(p4).e(p3).a();
          return;
       }
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, i.class, "8")) {
          return;
       }
       i.d(R.style.arg_RES_7f110668, a1.p(R.string.arg_RES_7f104257));
       i tj = this.j;
       if (tj == null) {
          return;
       }
       d.f("LIVE_ROOM_SEND_GIFT", tj, this.l, this.m, this.r, this.s, this.u.a(a.class).d6());
       return;
    }
    public void e(i p0,Gift p1,String p2,int p3,int p4,int p5,boolean p6,boolean p7,String p8){
       if (PatchProxy.isSupport(i.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Boolean.valueOf(p6);
          objArray[7] = Boolean.valueOf(p7);
          objArray[8] = p8;
          if (PatchProxy.applyVoid(objArray, this, i.class, "6")) {
             return;
          }
       }
       if (p1 == null) {
          b.Z(LiveLogTag.PK, "recommend gift is null, can not send");
          return;
       }else {
          HashMap hashMap = new HashMap();
          hashMap.put("if_pk", "TRUE");
          hashMap.put("recoGiftLlsid", p8);
          if (p7) {
             Gift mId = p1.mId;
             if (!PatchProxy.isSupport(i.class) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p6), Integer.valueOf(mId), this, i.class, "11")) {
                i tp = this.p;
                if (tp == 1) {
                   a.c1(p6);
                }else if(tp == 2){
                   a.b1(p6);
                }
             }
          }
          b$b uob = new b$b(p1);
          uob.g(p2);
          uob.d(1);
          uob.f(p3);
          uob.l(p4);
          uob.h(hashMap);
          uob.i(1);
          uob.c(this.B);
          uob.k(new i$b(this, p1));
          uob.b(p5);
          b uob1 = uob.a();
          p0.g(f.a(uob1));
          uob1.a("key_send_gift_context", p0);
          p0.e().k(uob1);
          c3.c(this.t, new p(uob1));
          return;
       }
    }
    public void f(i p0,String p1,int p2,String p3){
       boolean i;
       boolean b;
       int this;
       i oi2;
       f uof1;
       int i5;
       int i6;
       Object obj3;
       i oi3;
       i oi4;
       Object obj4;
       r or;
       boolean b1;
       String str2;
       String str3;
       LiveAudienceSendExplicitGiftConfirmDialog oi11;
       i k;
       d$a a;
       String str4;
       LiveAudienceSendExplicitGiftConfirmDialog liveAudience = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, i.class, "2")) {
          return;
       }
       Object[] obj = PatchProxy.apply(null, liveAudience, oi, "12");
       i = 1;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          String str6 = a1.p(R.string.arg_RES_7f103081);
          if (!liveAudience.j instanceof GifshowActivity) {
             i.d(R.style.arg_RES_7f11066a, str6);
          }else if(!QCurrentUser.me().isLogined()){
             i j = liveAudience.j;
             y.a(j, j.getUrl(), "live_pk_recommend_gift_recharge", 44, str6, liveAudience.q, null, null, null);
          }else {
             b = true;
          }
          b = false;
       }
       if (!b) {
          this.c(p0, "SENDING_GIFT", "CLIENT_SEND_PRE_CHECK", "[LivePkRecommendGiftSendProcessor][sendPkRecommendGiftIfNecessary]not login", 0x18705);
          return;
       }else {
          int i1 = c.b(p1, p2);
          this = 6;
          int i2 = 3;
          int i3 = 4;
          int i4 = 2;
          if (PatchProxy.isSupport(oi)) {
             obj = new Object[this];
             obj[0] = oobject;
             obj[i] = Integer.valueOf(i1);
             obj[i4] = Integer.valueOf(i4);
             obj[i2] = oobject1;
             obj[i3] = Integer.valueOf(p2);
             obj[5] = oobject2;
             if (!PatchProxy.applyVoid(obj, liveAudience, oi, "3")) {
             label_00c4 :
                User user = liveAudience.x.I();
                if (user == null) {
                   b.Z(LiveLogTag.PK, "anchor is null");
                   user = new User();
                }
                f uof = v13;
                f this1 = v13;
                i LiveGiftGuideConfig$AttachGiftConfig oi1 = oi;
                PatchProxyResult patchProxyRe1 = patchProxyRe;
                uof = new f(UserInfo.convertFromQUser(user), liveAudience.n, liveAudience.o, 0, 0, 1, 2, i1, false, 1, p3, null);
                oobject.g(this1);
                String str = "";
                if (PatchProxy.isSupport(oi1)) {
                   i obj1 = PatchProxy.applyTwoRefs(oobject1, Integer.valueOf(p2), liveAudience, oi1, "7");
                   if (obj1 != patchProxyRe1) {
                      oi2 = oi1;
                      uof1 = this1;
                      i = obj1.booleanValue();
                      i5 = 2;
                      obj1 = 4;
                      i6 = 1;
                   }else if(!p.m(liveAudience.n)){
                      this.d();
                      obj1 = liveAudience.k;
                      Gift mId = liveAudience.n.mId;
                      if (PatchProxy.isSupport(a.class)) {
                         oi2 = oi1;
                         uof1 = this1;
                         i6 = 1;
                         if (PatchProxy.applyVoidFourRefs(obj1, p1, Integer.valueOf(p2), Integer.valueOf(mId), 0, a.class, "1")) {
                            i5 = 2;
                            obj1 = 4;
                         label_01db :
                            i = true;
                         }
                      }else {
                         oi2 = oi1;
                         uof1 = this1;
                         i6 = 1;
                      }
                      ClientContent$ContentPackage uContentPack = a.a(obj1);
                      ClientContent$GiftPackage giftPackage = new ClientContent$GiftPackage();
                      giftPackage.identity = String.valueOf(mId);
                      giftPackage.totalCount = i6;
                      uContentPack.giftPackage = giftPackage;
                      i4 = c.c(p1, p2);
                      if (i4 != i6) {
                         i5 = 2;
                         if (i4 != i5) {
                            if (i4 != 3) {
                               obj1 = 4;
                               if (i4 != obj1) {
                                  if (!SystemUtil.I()) {
                                     str4 = str;
                                  }else {
                                     throw new RuntimeException("埋点参数错误，原因:没有处理triggerSourceType="+i4);
                                  }
                               }else {
                                  str4 = "STEAL_TOWER_TIME_HIGH";
                               }
                            }else {
                               obj1 = 4;
                               str4 = "STEAL_TOWER_TIME_LOW";
                            }
                         }else {
                            obj1 = 4;
                            str4 = "CRIT_TIME_HIGH";
                         }
                      }else {
                         i5 = 2;
                         obj1 = 4;
                         str4 = "CRIT_TIME_LOW";
                      }
                      String str5 = "PK_RECOMMEND_GIFT_INSUFFICIENT_BALANCE";
                      h$b uob2 = h$b.e(7, str5);
                      uob2.h(uContentPack);
                      uob2.k(a.b(str5, ImmutableMap.of("trigger_source", str4)));
                      u1.r0(uob2);
                      goto label_01db ;
                   }else {
                      oi2 = oi1;
                      uof1 = this1;
                      i5 = 2;
                      obj1 = 4;
                      i6 = 1;
                      i = false;
                   }
                }else {
                   goto label_012e ;
                }
                if (i) {
                   long l = b.a(0x4c90014d).q();
                   i n = liveAudience.n;
                   Gift mPrice = (n != null)? n.mPrice: 0;
                   this.c(p0, "SENDING_GIFT", "CLIENT_SEND_PRE_CHECK", "[LivePkRecommendGiftSendProcessor][showSendGiftConfirmDialogIfNecessary]current:"+l+",need:"+mPrice, 0x1870a);
                   f uof2 = uof1;
                   super(liveAudience.l, GiftMessage.createSelfGiftMessage(liveAudience.n, i6), liveAudience.n, 1, null, true, i1);
                   c uoc = new c("", 0, null, liveAudience.u.a(a.class).d6(), null);
                   this.c(new d(uof2, mPrice, uof2.g(), g.a(0x1870a, str)));
                   liveAudience.u.a(i0.class).G4(this);
                }else {
                   oi1 = liveAudience.D;
                   String str1 = "4";
                   ArrayMap obj2 = PatchProxy.applyOneRefs(oi1, null, d.class, str1);
                   if (obj2 != patchProxyRe1) {
                      obj3 = obj2;
                   }else {
                      a = d.a;
                      Objects.requireNonNull(a);
                      b uob = PatchProxy.applyOneRefs(oi1, a, d$a.class, str1);
                      if (uob != patchProxyRe1) {
                      }else {
                         a.p(oi1, "pkRecommendGiftsList");
                         LiveGiftGuideConfig$AttachGiftConfig mSendGiftMsg = oi1.mSendGiftMsgKeys;
                         b uob1 = (mSendGiftMsg != null && mSendGiftMsg.size() > 0)? new b(mSendGiftMsg): a.a(oi1.mGiftId);
                         uob = uob1;
                      }
                      obj3 = uob;
                   }
                   if (!obj3.a()) {
                      this.g(p0, i1, 2, false, false, p1, p2, p3);
                   }else {
                      this.c(p0, "SENDING_GIFT", "CLIENT_SEND_PRE_CHECK", "[LivePkRecommendGiftSendProcessor][showSendGiftConfirmDialogIfNecessary]show dialog", 0x1871a);
                      if (PatchProxy.isSupport(oi2)) {
                         obj = new Object[]{Integer.valueOf(i1),Integer.valueOf(i5),oobject1,Integer.valueOf(p2),p3,obj3};
                         if (!PatchProxy.applyVoid(obj, liveAudience, oi2, str1)) {
                         }
                      }else {
                      }
                   }
                }
             }
          }else {
             goto label_00c4 ;
          }
       label_03f5 :
          return;
       }
    }
    public void g(i p0,int p1,int p2,boolean p3,boolean p4,String p5,int p6,String p7){
       int i;
       Object[] objArray;
       i n;
       g og = this;
       object oobject = p5;
       object oobject1 = p7;
       i oi = i.class;
       i = 6;
       int i1 = 5;
       int i2 = 4;
       int i3 = 8;
       int i4 = 0;
       int i5 = 1;
       if (PatchProxy.isSupport(oi)) {
          objArray = new Object[i3];
          objArray[i4] = p0;
          objArray[i5] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Boolean.valueOf(p3);
          objArray[i2] = Boolean.valueOf(p4);
          objArray[i1] = oobject;
          objArray[i] = Integer.valueOf(p6);
          objArray[7] = oobject1;
          if (PatchProxy.applyVoid(objArray, og, oi, "5")) {
             return;
          }
       }
       if (og.g == null) {
          if (!SystemUtil.I()) {
             this.c(p0, "SENDING_GIFT", "CLIENT_SEND_PRE_CHECK", "[LivePkRecommendGiftSendProcessor][showComboSendGiftView]mGiftSendButtonView is null", 0x1871b);
             return;
          }else {
             throw new RuntimeException("底部栏PK推荐送礼view是null");
          }
       }else {
          og.b = new g(og.c, og.d, og.e);
          i oi1 = 8;
          this.e(p0, og.n, og.o, p1, p2, 1, p3, p4, p7);
          oi = og.g;
          Objects.requireNonNull(oi);
          if (!PatchProxy.applyVoid(null, oi, LivePkRecommendGiftSendButtonView.class, "3")) {
             View[] viewArray = new View[]{oi.D};
             n.Z(oi1, viewArray);
          }
          oi1 = og.b;
          i$a g oi2 = i4;
          i$a uoa = i4;
          oi2 = new i$a(this, p5, p6, p1, p2, p3, p4, p7);
          q oq = new q(og);
          n = og.n;
          i g = og.g;
          i f = og.f;
          Objects.requireNonNull(oi1);
          oi2 = g.class;
          if (PatchProxy.isSupport(oi2)) {
             objArray = new Object[]{uoa,oq,n,g,f};
             if (PatchProxy.applyVoid(objArray, oi1, oi2, "1")) {
             label_011d :
                d$a d oi21 = new d$a();
                oi21.d(og.k);
                oi21.e(oobject);
                oi21.f(p6);
                oi21.b(og.n.mId);
                oi21.c(oobject1);
                oi21 = oi21.a();
                if (!PatchProxy.applyVoidOneRefs(oi21, null, a.class, "7")) {
                   ClientContent$ContentPackage objArray1 = a.a(oi21.c());
                   ClientContent$GiftPackage giftPackage = new ClientContent$GiftPackage();
                   giftPackage.identity = String.valueOf(oi21.a());
                   giftPackage.totalCount = 1;
                   objArray1.giftPackage = giftPackage;
                   giftPackage.giftEntryType = 6;
                   ArrayMap uArrayMap = new ArrayMap();
                   uArrayMap.put(a.c, a.d(oi21.d(), oi21.e()));
                   uArrayMap.put("gift_llsid", oi21.b());
                   u1.u0(9, a.b("CONTINUE_SEND_BUTTON", uArrayMap), objArray1);
                }
                return;
             }
          }
          if (oi1.a.getVisibility()) {
             oi1.a.setVisibility(0);
             oi1.a.h();
             d uod = new d(oi1, uoa, oq, n, g, f);
             oi1.a.setOnTouchListener(objArray);
          }
          oi1.b(uoa);
          goto label_011d ;
       }
    }
}
