package com.kuaishou.live.common.core.component.recharge.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import android.app.Activity;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import u07.u;
import java.util.Map;
import java.lang.Integer;
import lnc.a1;
import java.lang.Number;
import wkd.b;
import ad5.a;
import java.lang.CharSequence;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import rw1.b;
import com.yxcorp.utility.TextUtils;
import rw1.h;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import u07.t$a;
import u07.f;
import rw1.c;
import rw1.d;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import d61.y;
import com.kwai.component.payment.bridge.params.KsCoinHalfScreenRechargeParams;
import com.google.gson.JsonObject;
import com.kwai.feature.api.live.base.model.LiveActivityTaskInfo;
import ug1.v0;
import tkd.b;
import tkd.d;
import ym5.a;
import rkd.b;
import com.google.gson.JsonElement;
import gy2.f;
import gy2.c;
import com.kuaishou.live.common.core.component.recharge.d$a;
import com.kuaishou.live.common.core.component.recharge.b;
import com.kuaishou.live.common.core.component.recharge.a;
import gy2.a;
import gy2.b$a;
import ad5.b;
import com.kuaishou.live.common.core.component.recharge.c;
import rw1.a;
import bd5.b;
import android.os.Bundle;
import android.content.Intent;
import com.kuaishou.live.common.core.component.recharge.LiveRechargeKwaiCoinHalfScreenActivity;
import android.content.Context;
import com.yxcorp.gifshow.activity.GifshowActivity;
import rw1.f;
import n3d.a;
import rw1.e;
import rw1.i;
import java.lang.Long;

public final class d	// class@00174b
{

    public void d(){
       super();
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().u("SOURCE_LIVE").d("enableLiveRechargeSDK", false);
    }
    public static void b(Activity p0,ClientContent$LiveStreamPackage p1,int p2,u p3,u p4,boolean p5,String p6,Map p7){
       int i1;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,p4,Boolean.valueOf(p5),p6,p7};
          if (PatchProxy.applyVoid(objArray, null, uod, "11")) {
             return;
          }
       }
       int i = (!p2)? 0x7f101c46: p2;
       String str = a1.p(i);
       Object obj = PatchProxy.apply(null, null, uod, "1");
       if (obj != PatchProxyResult.class) {
          i1 = obj.intValue();
       }else if(b.a(0x4c90014d).r()){
          i1 = 0x7f1021f6;
       }else {
          i1 = 0x7f104114;
       }
       d.c(p0, p1, str, i1, R.string.cancel, p3, p4, null, p5, p6, p7);
       return;
    }
    public static void c(Activity p0,ClientContent$LiveStreamPackage p1,CharSequence p2,int p3,int p4,u p5,u p6,String p7,boolean p8,String p9,Map p10){
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p5;
       object oobject4 = p6;
       object oobject5 = p9;
       object oobject6 = p10;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[11];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[2] = oobject2;
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = oobject3;
          objArray[6] = oobject4;
          objArray[7] = null;
          objArray[8] = Boolean.valueOf(p8);
          objArray[9] = oobject5;
          objArray[10] = oobject6;
          if (PatchProxy.applyVoid(objArray, null, uod, "12")) {
             return;
          }
       }
       if (oobject == null) {
          b.P(LiveLogTag.LIVE_INSUFFICIENT_DIALOG.appendTag("LiveRechargeActivityUtils"), "Cannot showNormalKwaiCoinInsufficientDialog. activity is null");
          return;
       }else {
          b.c(p1, oobject5, oobject6);
          String str = TextUtils.k(null);
          if (!PatchProxy.applyVoidOneRefs(str, null, h.class, "1")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action = 1504;
             i3 oi3 = i3.f();
             oi3.d("source", str);
             uElementPack.params = oi3.toString();
             u1.u0(9, uElementPack, null);
          }
          t$a uoa = new t$a(p0);
          uoa.W0(R.string.arg_RES_7f101c45);
          uoa.z0(oobject2);
          uoa.S0(p3);
          uoa.Q0(p4);
          t$a uoa1 = f.e(uoa);
          uoa1.u0(new c(p1, oobject5, oobject6, oobject3));
          uoa1.t0(new d(oobject4));
          uoa1.v(p8);
          uoa1.Y(PopupInterface.a);
          b.P(LiveLogTag.LIVE_INSUFFICIENT_DIALOG.appendTag("LiveRechargeActivityUtils"), "showNormalKwaiCoinInsufficientDialog success.");
          return;
       }
    }
    public static void d(Activity p0,ClientContent$LiveStreamPackage p1,u p2,boolean p3,String p4,Map p5){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),p4,p5};
          if (PatchProxy.applyVoid(objArray, null, uod, "10")) {
             return;
          }
       }
       d.b(p0, p1, 0, p2, null, p3, p4, p5);
       return;
    }
    public static void e(String p0,Activity p1,String p2,String p3,long p4,LiveBizParam p5,String p6,Map p7){
       String str = p0;
       Activity uActivity = p1;
       String str1 = p2;
       String str2 = p3;
       LiveBizParam liveBizParam = p5;
       Map map = p7;
       if (!uActivity) {
          b.Z(LiveLogTag.LIVE_RECHARGE, "StartLiveRechargeKwaiCoinListPageActivity, activity is null, returned.");
       }else if(y.d(p1)){
          uActivity.setRequestedOrientation(1);
       }
       if (d.a()) {
          b.e0(LiveLogTag.LIVE_RECHARGE, "startLiveRechargeKwaiCoinListPageActivityV2", "source", p0, "liveStreamId", p2, "anchorUserId", p3);
          String str3 = (liveBizParam && (liveBizParam.mLiveSourceType == 271 && (liveBizParam.mLiveSquareReplaceModel == null && liveBizParam.mLiveActivityTaskInfo != null)))? 1: null;
          KsCoinHalfScreenRechargeParams ksCoinHalfSc = new KsCoinHalfScreenRechargeParams();
          ksCoinHalfSc.mTargetCoin = 0;
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("liveStreamId", str1);
          jsonObject.c0("anchorUserId", str2);
          jsonObject.c0("expTag", p6);
          if (str3) {
             ksCoinHalfSc.mSource = "LIVE_CNY_TASK";
             jsonObject.c0("backUrl", liveBizParam.mLiveActivityTaskInfo.mTaskBackUrl);
             jsonObject.c0("closeBtnText", a1.p(R.string.arg_RES_7f102b39));
             str3 = a1.p(R.string.arg_RES_7f102b37);
             jsonObject.c0("backBtnText", str3);
          }else {
             ksCoinHalfSc.mSource = str;
          }
          if (map) {
             str3.a(jsonObject, map);
          }
          if (ksCoinHalfSc.mMaxHeight <= null && (d.a(0x4c5dd1b8).f2() && b.e())) {
             ksCoinHalfSc.mMaxHeight = 80;
          }
       label_00b9 :
          ksCoinHalfSc.mExtraParams = jsonObject.toString();
          ksCoinHalfSc.mNewContainer = true;
          c uoc = f.e.a(uActivity);
          d$a uoa = new d$a(null);
          uoc.b(uoa, a.a);
          d.a(0x630bc993).Hu(uActivity, ksCoinHalfSc, new c(null, uoc, uoa));
       }else {
          d.h(str, uActivity, str1, str2, null);
       }
       return;
    }
    public static void f(String p0,Activity p1,String p2,String p3,LiveBizParam p4,String p5,Map p6){
       d.e(p0, p1, p2, p3, 0, p4, p5, p6);
    }
    public static void g(String p0,String p1,String p2,Activity p3,String p4,LiveBizParam p5,Map p6){
       d uod = d.class;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6};
          if (PatchProxy.applyVoid(objArray, null, uod, "6")) {
             return;
          }
       }
       if (p3 == null || p3.isFinishing()) {
          List list = LiveLogTag.LIVE_INSUFFICIENT_DIALOG.appendTag("LiveGiftUtils");
          if (p3 != null) {
             i = false;
          }
          b.S(list, "Cannot rechargeKwaiCoinListPageActivity", "activity is null", Boolean.valueOf(i));
          return;
       }else {
          d.e(p4, p3, p0, p1, 0, p5, p2, p6);
          return;
       }
    }
    public static void h(String p0,Activity p1,String p2,String p3,a p4){
       if (PatchProxy.isSupport(d.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, d.class, "7")) {
             return;
          }
       }
       Bundle uBundle = new Bundle();
       uBundle.putString("LIVE_RECHARGE_SOURCE", p0);
       uBundle.putString("LIVE_RECHARGE_LIVE_STREAM_ID", p2);
       uBundle.putString("LIVE_RECHARGE_ANCHOR_USER_ID", p3);
       Intent intent = new Intent(p1, LiveRechargeKwaiCoinHalfScreenActivity.class);
       intent.putExtra("LIVE_RECHARGE_KWAI_COIN_LIST_PAGE", uBundle);
       if (p4 != null) {
          p4.a();
       }
       p1.startActivityForResult(intent, 1);
       if (p4 == null) {
          if (!PatchProxy.applyVoidOneRefs(p1, null, d.class, "8")) {
             c uoc = f.e.a(p1);
             if (uoc != null && p1 instanceof GifshowActivity) {
                d$a uoa = new d$a(null);
                uoc.b(uoa, a.a);
                p1.e(new f(uoc, uoa));
             }
          }
       }else {
          p1.e(new e(p4));
       }
       return;
    }
    public static void i(Activity p0,i p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, d.class, "4")) {
          return;
       }
       d.j(p0, p1, null);
       return;
    }
    public static void j(Activity p0,i p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, d.class, "3")) {
          return;
       }
       if (p0 == null) {
          b.Z(LiveLogTag.LIVE_RECHARGE, "startLiveRechargeKwaiCoinListPageActivityV3, activity is null, returned.");
          return;
       }else {
          int i = 1;
          if (y.d(p0)) {
             p0.setRequestedOrientation(i);
          }
          if (d.a()) {
             if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidFourRefs(p0, p1, Boolean.TRUE, p2, null, d.class, "5")) {
                b.e0(LiveLogTag.LIVE_RECHARGE, "startLiveRechargeKwaiCoinListPageActivityNewV3", "source", p1.d(), "liveStreamId", p1.c(), "anchorUserId", p1.a());
                String str = (p1.b() != null && (p1.b().mLiveSourceType == 271 && (p1.b().mLiveSquareReplaceModel == null && p1.b().mLiveActivityTaskInfo != null)))? 1: null;
                KsCoinHalfScreenRechargeParams ksCoinHalfSc = new KsCoinHalfScreenRechargeParams();
                ksCoinHalfSc.mTargetCoin = p1.f;
                JsonObject jsonObject = new JsonObject();
                jsonObject.c0("liveStreamId", p1.c());
                jsonObject.c0("anchorUserId", p1.a());
                String str1 = (p1.g != null)? "true": "false";
                jsonObject.c0("goldExchange", str1);
                jsonObject.a0("equalKsCoin", Long.valueOf(p1.i));
                jsonObject.c0("exchangeText", p1.h);
                jsonObject.c0("expTag", p1.d);
                if (str) {
                   ksCoinHalfSc.mSource = "LIVE_CNY_TASK";
                   jsonObject.c0("backUrl", p1.b().mLiveActivityTaskInfo.mTaskBackUrl);
                   jsonObject.c0("closeBtnText", a1.p(R.string.arg_RES_7f102b39));
                   str = a1.p(R.string.arg_RES_7f102b37);
                   jsonObject.c0("backBtnText", str);
                }else {
                   str = p1.d();
                   ksCoinHalfSc.mSource = str;
                }
                p1 = p1.j;
                if (p1 != null) {
                   str.a(jsonObject, p1);
                }
                ksCoinHalfSc.mExtraParams = jsonObject.toString();
                ksCoinHalfSc.mNewContainer = i;
                c uoc = f.e.a(p0);
                d$a uoa = new d$a(null);
                if (p2 != null) {
                   p2.a();
                }else {
                   uoc.b(uoa, a.a);
                }
                d.a(0x630bc993).Hu(p0, ksCoinHalfSc, new b(p2, uoc, uoa));
             }
          }else {
             d.h(p1.d(), p0, p1.c(), p1.a(), p2);
          }
          return;
       }
    }
}
