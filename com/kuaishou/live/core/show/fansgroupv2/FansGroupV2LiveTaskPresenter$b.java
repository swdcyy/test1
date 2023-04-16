package com.kuaishou.live.core.show.fansgroupv2.FansGroupV2LiveTaskPresenter$b;
import vq5.b;
import com.kuaishou.live.core.show.fansgroupv2.FansGroupV2LiveTaskPresenter;
import java.lang.Object;
import vq5.a;
import android.net.Uri;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.x0;
import i95.f;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import com.kwai.component.fansgroup.FansGroupSourceType;
import nsd.u;
import java.util.Objects;
import com.kuaishou.live.core.show.fansgroupv2.FansGroupV2LiveTaskPresenter$handleFansGroupTask$1;
import msd.a;
import s95.c;
import ks3.r;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import t02.a0;
import p91.m;
import com.yxcorp.gifshow.models.Gift;
import cm1.a;
import java.lang.StringBuilder;
import va1.l0;
import com.kuaishou.live.core.show.fansgroupv2.FansGroupV2LiveTaskPresenter$sendGift$3;
import com.kuaishou.live.core.show.fansgroupv2.FansGroupV2LiveTaskPresenter$sendGift$$inlined$let$lambda$1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import ad5.b;
import ad5.a;
import lnc.a1;
import e17.i;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lp3.e;
import w91.a;
import lp3.c;
import java.util.Map;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.live.common.core.component.recharge.d;
import n82.e;
import ht5.b$b;
import ht5.d;
import ht5.b;
import om1.a;
import lm1.i;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import lm1.f;
import lm1.f$a;
import ht5.a;
import com.kuaishou.live.core.show.fansgroupv2.FansGroupV2LiveTaskPresenter$sendGift$2;
import com.kwai.framework.model.user.UserInfo;
import mk1.b;
import e92.a;
import jk1.f;
import o82.h$b;
import o82.h$c;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import android.content.Context;
import vq5.d;

public final class FansGroupV2LiveTaskPresenter$b implements b	// class@000b49
{
    public final FansGroupV2LiveTaskPresenter a;

    public void FansGroupV2LiveTaskPresenter$b(FansGroupV2LiveTaskPresenter p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return a.a(this);
    }
    public final void b(Uri p0){
       b obj2;
       boolean b;
       String str8;
       a0 z22;
       String liveStreamId;
       Object[] objArray1;
       Object[] objArray2;
       Object obj = this;
       FansGroupV2LiveTaskPresenter obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, FansGroupV2LiveTaskPresenter$b.class, "1")) {
          return;
       }
       String str = x0.a(obj1, "actiontype");
       String str1 = x0.a(obj1, "extra");
       String str2 = "";
       String str3 = (str1 != null)? str1: str2;
       str1 = x0.a(obj1, "rnViewTag");
       String str4 = (str1 != null)? str1: str2;
       FansGroupV2LiveTaskPresenter$b a = obj.a;
       a.o(str, "type");
       String str5 = p0.toString();
       a.o(str5, "uri.toString\(\)");
       f uof = new f(Integer.parseInt(str), str5, str3, str4, null, 16, null);
       Objects.requireNonNull(a);
       obj1 = FansGroupV2LiveTaskPresenter.class;
       if (!PatchProxy.applyVoidOneRefs(v13, a, obj1, "5")) {
          String str6 = "FansGroupV2LiveTask";
          c.c(str6, new FansGroupV2LiveTaskPresenter$handleFansGroupTask$1(v13));
          int i = v13.d();
          if (i != 3) {
             Object[] objArray = null;
             if (i != 4) {
                if (i != 5) {
                   if (i != 6) {
                      if (i == 7 && !PatchProxy.applyVoid(objArray, a, obj1, "10")) {
                         obj1 = a.N;
                         if (obj1 == null) {
                            a.S("mMerchantService");
                         }
                         obj1.f();
                      }
                   }else if(PatchProxy.applyVoidOneRefs(v13, a, obj1, "7")){
                      Ref$ObjectRef objectRef = new Ref$ObjectRef();
                      objectRef.element = str2;
                      Ref$ObjectRef objectRef1 = new Ref$ObjectRef();
                      objectRef1.element = objArray;
                      Ref$ObjectRef objectRef2 = new Ref$ObjectRef();
                      objectRef2.element = objArray;
                      String str7 = v13.a();
                      if (str7 != null) {
                         JSONObject jSONObject = new JSONObject(str7);
                         str7 = jSONObject.optString("giftId");
                         a.o(str7, "jsonObject.optString\(\"giftId\"\)");
                         objectRef.element = str7;
                         objectRef1.element = jSONObject.optString("giftToken");
                         objectRef2.element = jSONObject.optString("liveStreamId");
                      }
                      if (!TextUtils.x(objectRef.element)) {
                         FansGroupV2LiveTaskPresenter m = a.M;
                         if (m == null) {
                            a.S("mLivePlayCallerContext");
                         }
                         a0 z2 = m.Z2;
                         str7 = (z2 != null)? z2.getLiveStreamId(): objArray;
                         if (!TextUtils.x(str7)) {
                            m = a.M;
                            if (m == null) {
                               a.S("mLivePlayCallerContext");
                            }
                            z2 = m.Z2;
                            str7 = (z2 != null)? z2.getLiveStreamId(): objArray;
                            if (TextUtils.n(str7, objectRef2.element)) {
                               Gift gift = a.a(Integer.parseInt(objectRef.element));
                               if (gift == null) {
                                  l0.n("[2][粉丝团]送礼失败,gift是null,giftId="+objectRef.element);
                                  c.c(str6, new FansGroupV2LiveTaskPresenter$sendGift$3(objectRef));
                               }
                               FansGroupV2LiveTaskPresenter m1 = a.M;
                               if (m1 == null) {
                                  a.S("mLivePlayCallerContext");
                               }
                               a0 z21 = m1.Z2;
                               str = (z21 != null)? z21.d(): objArray;
                               str = TextUtils.k(str);
                               if (gift != null) {
                                  a.o(str, "anchorId");
                                  Ref$ObjectRef element = objectRef1.element;
                                  FansGroupV2LiveTaskPresenter$sendGift$$inlined$let$lambda$1 osendGift$$i = new FansGroupV2LiveTaskPresenter$sendGift$$inlined$let$lambda$1(a, str, objectRef1, v13);
                                  FansGroupV2LiveTaskPresenter$sendGift$$inlined$let$lambda$1 osendGift$$i1 = osendGift$$i;
                                  FansGroupV2LiveTaskPresenter$sendGift$$inlined$let$lambda$1 osendGift$$i2 = osendGift$$i;
                                  if (!PatchProxy.applyVoidFourRefs(gift, str, element, osendGift$$i1, a, FansGroupV2LiveTaskPresenter.class, "11")) {
                                     Gift mPrice = gift.mPrice;
                                     if (PatchProxy.isSupport(obj1)) {
                                        obj2 = PatchProxy.applyOneRefs(Integer.valueOf(mPrice), a, obj1, "12");
                                        if (obj2 != PatchProxyResult.class) {
                                           b = obj2.booleanValue();
                                           str8 = "mLivePlayCallerContext";
                                        }else {
                                        label_01a1 :
                                           obj2 = d.a(0x630bc993);
                                           a.o(obj2, "PluginManager.get\(PaymentPlugin::class.java\)");
                                           a uoa = obj2.d1();
                                           a.o(uoa, "PluginManager.get\(Paymen…lass.java\).paymentManager");
                                           str8 = "mLivePlayCallerContext";
                                           if (uoa.q() - (long)mPrice < 0) {
                                              i.d(R.style.arg_RES_7f110668, a1.p(R.string.arg_RES_7f1021a4));
                                              obj1 = a.M;
                                              if (obj1 == null) {
                                                 a.S(str8);
                                              }
                                              z22 = obj1.Z2;
                                              a.o(z22, "mLivePlayCallerContext.mLiveBasicContext");
                                              liveStreamId = z22.getLiveStreamId();
                                              obj1 = a.M;
                                              if (obj1 == null) {
                                                 a.S(str8);
                                              }
                                              z22 = obj1.Z2;
                                              a.o(z22, "mLivePlayCallerContext.mLiveBasicContext");
                                              String str9 = z22.d();
                                              obj1 = a.M;
                                              if (obj1 == null) {
                                                 a.S(str8);
                                              }
                                              z22 = obj1.Z2;
                                              a.o(z22, "mLivePlayCallerContext.mLiveBasicContext");
                                              String str10 = z22.i();
                                              Activity activity = a.getActivity();
                                              obj1 = a.M;
                                              if (obj1 == null) {
                                                 a.S(str8);
                                              }
                                              z22 = obj1.Z2;
                                              a.o(z22, "mLivePlayCallerContext.mLiveBasicContext");
                                              c uoc1 = z22.t5().a(a.class);
                                              a.o(uoc1, "mLivePlayCallerContext.m…ice::class.java\n        \)");
                                              d.g(liveStreamId, str9, str10, activity, "LIVE_ROOM_SEND_GIFT", null, uoc1.d6());
                                              b = true;
                                           }else {
                                              b = false;
                                           }
                                        }
                                     }else {
                                        goto label_01a1 ;
                                     }
                                     if (!b) {
                                        b$b uob = new b$b(gift);
                                        uob.g(element);
                                        uob.d(1);
                                        uob.b(1);
                                        uob.c(0);
                                        uob.f(0);
                                        uob.h(null);
                                        uob.i(0);
                                        uob.k(new e(a, osendGift$$i2, gift, str));
                                        obj2 = uob.a();
                                        m1 = a.M;
                                        if (m1 == null) {
                                           a.S(str8);
                                        }
                                        z21 = m1.Z2;
                                        a.o(z21, "mLivePlayCallerContext.mLiveBasicContext");
                                        c uoc = z21.t5().a(a.class);
                                        a.o(uoc, "mLivePlayCallerContext.m…TraceService::class.java\)");
                                        i oi = new i(uoc.o6());
                                        oi.e().k(obj2);
                                        a.o(obj2, "sendGiftParams");
                                        oi.g(f.m.a(obj2));
                                        obj2.a("key_send_gift_context", oi);
                                        m1 = a.M;
                                        if (m1 == null) {
                                           a.S(str8);
                                        }
                                        z21 = m1.I1;
                                        if (z21 != null) {
                                           z21.a7(obj2);
                                        }
                                     }
                                  }
                               }
                            }
                         }
                      }
                   label_02aa :
                      l0.n("[1][粉丝团]送礼失败,参数有问题");
                      c.c(str6, new FansGroupV2LiveTaskPresenter$sendGift$2(a, objectRef, objectRef2));
                   }
                }else {
                   str8 = "mLivePlayCallerContext";
                   if (!PatchProxy.applyVoid(null, a, obj1, "9")) {
                      obj1 = a.M;
                      if (obj1 == null) {
                         a.S(str8);
                      }
                      z22 = obj1.x1;
                      i = -1;
                      FansGroupV2LiveTaskPresenter m2 = a.M;
                      if (m2 == null) {
                         a.S(str8);
                      }
                      z22.bb(a.e(null, i, 26, m2));
                   }
                }
             }else {
                str8 = "mLivePlayCallerContext";
                Object[] objArray3 = objArray;
                if (!PatchProxy.applyVoid(objArray3, a, obj1, "8")) {
                   obj1 = a.M;
                   if (obj1 == null) {
                      a.S(str8);
                   }
                   obj1.s1.b(objArray3, "FANS_GROUP");
                }
             }
          }else if(PatchProxy.applyVoidOneRefs(v13, a, obj1, "6")){
             try{
                String str11 = v13.a();
                if (str11 != null && new JSONObject(str11).getInt("giftTab") == 1) {
                   str2 = "FansGroupGift";
                }
             }catch(java.lang.Exception e0){
                b.I(LiveLogTag.FANS_GROUP, "deal task:[openGiftPanel], get giftTab error", e0);
             }
             obj1 = a.K;
             if (obj1 == null) {
                a.S("mLiveRouterManager");
             }
             obj1.r4("kwailive://giftpanel?tab="+str2, a.getContext());
          }
       }
    label_0345 :
       return;
    }
}
