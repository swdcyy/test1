package com.yxcorp.gifshow.ad.webview.jsbridge.f;
import tl9.d;
import java.lang.Object;
import com.yxcorp.gifshow.commercial.bridge.model.ReportAdLogParam;
import f55.g;
import im9.a;
import ql9.o;
import com.yxcorp.gifshow.commercial.response.magnetic.ProvideNeoInfo;
import java.lang.StringBuilder;
import java.lang.String;
import yx.j0;
import com.kwai.framework.model.feed.BaseFeed;
import mxb.j0;
import mxb.i0;
import com.yxcorp.gifshow.commercial.response.magnetic.ProvideNeoInfo$Data;
import java.lang.Long;
import java.lang.Throwable;
import android.os.Bundle;
import fg6.a;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.google.gson.Gson;
import lnc.o5;
import wkd.b;
import mxb.f0;
import java.lang.Integer;
import o59.g;
import erd.g;
import android.app.Activity;
import com.yxcorp.gifshow.commercial.bridge.model.GetAdInfoParam;
import com.kwai.robust.PatchProxy;
import mxb.d;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import kotlin.jvm.internal.a;
import org.json.JSONObject;
import ol9.b;
import qw.g;
import com.yxcorp.gifshow.webview.bridge.JsSuccessResult;
import q35.c$a;
import q35.d;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.adclient.kscommerciallogger.model.SubBusinessType;
import com.yxcorp.gifshow.commercial.bridge.model.MKPageJsonParam;
import o59.a;
import x49.a;
import java.util.Map;
import com.kwai.adclient.kscommerciallogger.snapshot.Span;
import z1.a;
import com.yxcorp.gifshow.commercial.bridge.model.NeoTaskVideoParam;
import com.yxcorp.gifshow.commercial.bridge.model.NeoTaskParam;
import com.kuaishou.android.model.ads.NeoParamsVideoInfo;
import ql9.l$a;
import com.kuaishou.android.model.ads.AdNeoInfo;
import com.yxcorp.gifshow.commercial.api.AdBusinessType;
import ql9.l;
import tkd.b;
import tkd.d;
import nl9.g0;
import o59.l;
import msd.l;
import com.yxcorp.gifshow.commercial.bridge.model.CommercialLogParam;
import p49.c;
import p49.d;
import p49.f;
import p49.e;
import o59.k;
import p49.a;
import o59.m;
import com.yxcorp.gifshow.commercial.bridge.model.OpenVideoFeedListPageParam;
import brd.t;
import t45.d;
import brd.z;
import o59.h;
import erd.o;
import o59.q;
import o59.d;
import crd.b;
import com.yxcorp.gifshow.model.ReportAdLogActionParam;
import com.yxcorp.gifshow.util.rx.RxBus;
import wl9.q;
import by.f;
import by.c;
import by.e;
import by.b;
import tl9.c;
import com.yxcorp.gifshow.commercial.bridge.model.NeoTaskLiveParam;
import com.yxcorp.gifshow.activity.GifshowActivity;
import ul9.a;
import com.yxcorp.gifshow.ad.webview.jsbridge.d;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import java.lang.Boolean;
import o59.i;
import com.yxcorp.gifshow.ad.webview.jsbridge.a;
import o59.p;
import o59.b;
import com.yxcorp.gifshow.commercial.bridge.model.OpenVideoFeedPageParam;
import com.kuaishou.android.model.feed.VideoFeed;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import vm5.e;
import android.view.View;
import o59.j;
import java.lang.Runnable;
import t45.c;

public class f implements d	// class@0018cf
{

    public void f(){
       super();
    }
    public static void Na(f p0,ReportAdLogParam p1){
       p0.Ra(p1);
    }
    public static void Pa(g p0,a p1,o p2,ProvideNeoInfo p3){
       p0.onSuccess(p3);
       int i = 0;
       Object[] objArray = new Object[i];
       j0.f("AdvertiseBridgeModule", "onNeoAdVideoPageClose, request success, info: "+p1, objArray);
       if (p2.a() == null) {
          Object[] objArray1 = new Object[i];
          j0.c("AdvertiseBridgeModule", "onNeoAdVideoPageClose, rewardInfo.getFeed\(\) is null", objArray1);
       }else {
          i0.a().e(804, p2.a()).q("get_points_cnt", Long.valueOf(p3.mData.mNeoAmount)).a();
       }
       return;
    }
    public static void Qa(g p0,o p1,Throwable p2){
       j0.b("AdvertiseBridgeModule", "onNeoAdVideoPageClose, request error", p2);
       p0.a(-1, "request error. message:"+p2.getMessage(), null);
       i0.a().e(805, p1.a()).a();
    }
    private void Ra(ReportAdLogParam p0){
       String str = "AdvertiseBridgeModule";
       try{
          QPhoto qPhoto = a.a.h(p0.mFeedData, QPhoto.class);
          int i = 0;
          if (qPhoto == null) {
             Object[] objArray = new Object[i];
             j0.c(str, "reportAdLog qPhoto is null ", objArray);
             return;
          }else {
             qPhoto.setListLoadSequenceID(p0.mllSid);
             qPhoto.setPosition((o5.b(p0.mAdPlacePosition, i) - 1));
             qPhoto.setPositionInPage((o5.b(p0.posSequence, i) - 1));
             b.a(-762347696).r1(qPhoto.mEntity, "key_enteraction", Integer.valueOf(7));
             i0.a().e(p0.mActionType, qPhoto.mEntity).d(new g(this, p0)).a();
          }
       }catch(java.lang.Exception e7){
          j0.b(str, "reportAdLog ", e7);
       }
       return;
    }
    public void C(Activity p0,GetAdInfoParam p1,g p2){
       JSONObject jSONObject;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f.class, "14")) {
          return;
       }
       GetAdInfoParam mUniqueId = p1.mUniqueId;
       Object obj = null;
       p1 = PatchProxy.applyOneRefs(mUniqueId, obj, d.class, "3");
       if (p1 != PatchProxyResult.class) {
          obj = p1;
       }else if(mUniqueId == null || !mUniqueId.length()){
          jSONObject = 1;
       }else {
          jSONObject = null;
       }
       if (!jSONObject) {
          Iterator iterator = d.a.iterator();
          while (iterator.hasNext()) {
             BaseFeed uBaseFeed = iterator.next();
             PhotoAdvertisement photoAdverti1 = k.A(uBaseFeed);
             if (!a.g(mUniqueId, uBaseFeed.getId())) {
                photoAdverti1 = (photoAdverti1 != null)? photoAdverti1.mAdInstanceId: obj;
                if (!a.g(mUniqueId, photoAdverti1)) {
                }
             }
             obj = uBaseFeed;
             break ;
          }
       }
       PhotoAdvertisement photoAdverti = k.A(obj);
       jSONObject = new JSONObject();
       if (photoAdverti != null) {
          photoAdverti = photoAdverti.mCallbackParam;
          if (photoAdverti != null) {
          label_0072 :
             b.e(jSONObject, "adCallbackParam", photoAdverti);
             p2.onSuccess(jSONObject.toString());
             return;
          }
       }
       String str = "";
       goto label_0072 ;
    }
    public void Da(Activity p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "8")) {
          return;
       }
       p1.onSuccess(new Object());
       return;
    }
    public void N7(Activity p0,String p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f.class, "18")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("anywhere", "connectAnywhereDoor >>>", objArray);
       g og = b.a(-530279002);
       if (og != null) {
          og.a(p0, p1);
       }
       p2.onSuccess(new JsSuccessResult());
       return;
    }
    public final void Oa(c$a p0,String p1,String p2,d p3,String p4,String p5){
       Object[] objArray;
       JsonObject jsonObject;
       object oobject;
       f uof = f.class;
       int i = 0;
       if (PatchProxy.isSupport(uof)) {
          objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, uof, "16")) {
             return;
          }
       }
       try{
          jsonObject = new JsonObject();
          jsonObject = a.a.h(p1, JsonElement.class).r();
       }catch(java.lang.Exception e9){
          objArray = new Object[i];
          j0.d("AdvertiseBridgeModule", e9, objArray);
       }
       BusinessType[] uBusinessTyp = BusinessType.values();
       int len = uBusinessTyp.length;
       int i1 = 0;
       while (true) {
          SubBusinessType subBusinessT = null;
          if (i1 < len) {
             oobject = uBusinessTyp[i1];
             if (TextUtils.n(oobject.value, p4)) {
             label_005a :
                SubBusinessType[] subBusinessT1 = SubBusinessType.values();
                int len1 = subBusinessT1.length;
                while (i < len1) {
                   object oobject1 = subBusinessT1[i];
                   if (TextUtils.n(oobject1.value, p5)) {
                      subBusinessT = oobject1;
                      break ;
                   }
                   i = i + 1;
                }
                p0.i(p3);
                p0.f(jsonObject);
                p0.h(p2);
                p0.d(oobject);
                p0.g(subBusinessT);
                return;
             }else {
                i1 = i1 + 1;
             }
          }else {
             oobject = subBusinessT;
             goto label_005a ;
          }
       }
    }
    public void T5(MKPageJsonParam p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "13")) {
          return;
       }
       MKPageJsonParam mPageId = p0.mPageId;
       MKPageJsonParam mPageVersion = p0.mPageVersion;
       p0 = p0.mQueryMap;
       a uoa = new a(p1);
       if (!PatchProxy.applyVoidFourRefs(mPageId, mPageVersion, p0, uoa, null, a.class, "3")) {
          a.p(mPageId, "pageId");
          a.p(p0, "queryMap");
          a.p(uoa, "callback");
          a.e(null, mPageId, mPageVersion, p0, null, uoa);
       }
       return;
    }
    public void U1(Activity p0,NeoTaskVideoParam p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f.class, "2")) {
          return;
       }
       NeoTaskParam mNeoParams = p1.mNeoParams;
       Bundle uBundle = null;
       int i = -1;
       if (mNeoParams == null) {
          Object[] objArray = new Object[0];
          j0.c("AdvertiseBridgeModule", "startNeoAdVideo, neoParams is null", objArray);
          p2.a(i, "neoParams is null", uBundle);
          return;
       }else {
          Object[] objArray1 = new Object[]{mNeoParams};
          j0.f("AdvertiseBridgeModule", "startNeoAdVideo, neoParams:", objArray1);
          NeoTaskParam mNeoParamsIn = p1.mNeoParamsInfo;
          if (mNeoParamsIn == null || !mNeoParamsIn.checkIsValid()) {
             Object[] objArray2 = new Object[0];
             j0.c("AdvertiseBridgeModule", "startNeoAdVideo, check invalid.startVideoInfo:"+mNeoParamsIn, objArray2);
             p2.a(i, "check invalid", uBundle);
             return;
          }else {
             l$a uoa = new l$a();
             uoa.d(mNeoParamsIn.mPageId);
             uoa.e(mNeoParamsIn.mSubPageId);
             uoa = uoa.c(AdBusinessType.GENERAL_BUSINESS);
             uoa.e = mNeoParamsIn.mDrainageType;
             d.a(0x129a3b95).YY(p0, uoa.b(), new l(this, p2, p0, mNeoParamsIn));
             return;
          }
       }
    }
    public void U4(Activity p0,CommercialLogParam p1,g p2){
       CommercialLogParam this;
       f uof;
       String str;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f.class, "15")) {
          return;
       }
       CommercialLogParam eventId = p1.eventId;
       CommercialLogParam msg = p1.msg;
       if (msg == null) {
          str = "{}";
       }
       this = msg;
       msg = p1.tag;
       if (msg == null) {
          str = "commercial";
       }
       CommercialLogParam uCommercialL = msg;
       msg = p1.type;
       if (msg == null) {
          str = "other";
       }
       CommercialLogParam uCommercialL1 = msg;
       msg = p1.ratioKey;
       CommercialLogParam realTime = p1.realTime;
       CommercialLogParam biz = p1.biz;
       CommercialLogParam subBiz = p1.subBiz;
       if (TextUtils.x(eventId)) {
          Object[] objArray = new Object[0];
          j0.c("AdvertiseBridgeModule", "event id or msg is null", objArray);
          if (p2 != null) {
             p2.a(-1, "event id is null", null);
          }
          return;
       }else if(realTime != null){
          uof = e.a(new c(eventId, d.c));
          if (!TextUtils.x(msg)) {
             uof.d(msg);
          }
          k ok = new k(this, this, uCommercialL, uCommercialL1, biz, subBiz);
          uof.g(TextUtils.x(msg));
       }else {
          uof = e.a(new c(eventId, d.d));
          if (!TextUtils.x(msg)) {
             uof.d(msg);
          }
          m om = new m(this, this, uCommercialL, uCommercialL1, biz, subBiz);
          uof.h(TextUtils.x(msg));
       }
       p2.onSuccess("");
       return;
    }
    public void X6(Activity p0,OpenVideoFeedListPageParam p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f.class, "7")) {
          return;
       }
       if (TextUtils.x(p1.feedList)) {
          p2.a(412, "feed is empty", null);
          return;
       }else {
          t.just(p1.feedList).observeOn(d.c).map(new h(this, p1)).observeOn(d.a).subscribe(new q(p0, p2), new d(p2));
          return;
       }
    }
    public void Y4(Activity p0,ReportAdLogActionParam p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f.class, "11")) {
          return;
       }
       RxBus.f.b(new q(p1));
       return;
    }
    public void a7(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "12")) {
          return;
       }
       JSONObject jSONObject = new JSONObject();
       b.g(jSONObject, "appInfo", f.a().b());
       b.g(jSONObject, "deviceInfo", c.a().c().b());
       b.g(jSONObject, "networkInfo", e.a().b());
       b.g(jSONObject, "userInfo", b.a().b());
       p0.onSuccess(jSONObject.toString());
       return;
    }
    public String getNameSpace(){
       return c.a(this);
    }
    public void i3(Activity p0,NeoTaskLiveParam p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f.class, "5")) {
          return;
       }
       Bundle uBundle = null;
       if (!p0 instanceof GifshowActivity) {
          p2.a(412, "activit is not GifshowActivity", uBundle);
          return;
       }else {
          t ot = PatchProxy.applyTwoRefs(p0, "neo_live", uBundle, a.class, "5");
          if (ot != PatchProxyResult.class) {
          }else {
             ot = a.f(p0, "neo_live", 0, 0, 12, null);
          }
          ot.observeOn(d.a).subscribe(new d(p0, p1, p2));
          return;
       }
    }
    public void k6(Activity p0,String p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f.class, "17")) {
          return;
       }
       t.just(Boolean.valueOf(PermissionUtils.a(p0, "android.permission.WRITE_EXTERNAL_STORAGE"))).flatMap(new i("android.permission.WRITE_EXTERNAL_STORAGE", p0)).flatMap(new a(p1, p0)).subscribe(new p(p0, p2), new b(p2));
       return;
    }
    public void u8(Activity p0,OpenVideoFeedPageParam p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f.class, "6")) {
          return;
       }
       if (TextUtils.x(p1.feed)) {
          p2.a(412, "feed is empty", null);
          return;
       }else {
          d.a(-1818031860).L5(p0, 0, new PhotoDetailParam(new QPhoto(a.a.h(p1.feed, VideoFeed.class))), null);
          p2.onSuccess(new JsSuccessResult());
          return;
       }
    }
    public void z9(Activity p0,ReportAdLogParam p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f.class, "9")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("AdvertiseBridgeModule", "reportAdLog "+a.a.q(p1), objArray);
       c.a(new j(this, p1));
       return;
    }
}
