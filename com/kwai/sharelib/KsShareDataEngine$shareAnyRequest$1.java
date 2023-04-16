package com.kwai.sharelib.KsShareDataEngine$shareAnyRequest$1;
import io.reactivex.g;
import com.kwai.sharelib.KsShareDataEngine;
import uo7.k;
import uo7.h0;
import java.lang.String;
import java.lang.Object;
import brd.v;
import xo7.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.sharelib.log.KsSharePerformanceStat;
import vo7.a;
import com.kwai.sharelib.KsShareApi;
import android.app.Application;
import com.kwai.sharelib.KsShareDataEngine$shareAnyRequest$1$a;
import java.util.Objects;
import com.kwai.sharelib.jsshare.StartShareParam$JsShareParam;
import com.kwai.sharelib.jsshare.StartShareParam$ChannelOption;
import com.google.gson.JsonObject;
import ekd.k0;
import com.google.gson.JsonElement;
import yo7.a;
import qrd.l1;
import com.kwai.sharelib.model.ShareInitResponse;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelData;
import com.kwai.sharelib.model.PainterModel;
import com.kwai.sharelib.KsShareDataEngine$shareAnyRequest$1$7;
import zo7.a;
import msd.l;
import ca7.c;
import nsd.u;
import vo7.c;
import brd.t;
import vo7.d;
import ip7.b;
import crd.b;

public final class KsShareDataEngine$shareAnyRequest$1 implements g	// class@00169c
{
    public final KsShareDataEngine b;
    public final k c;
    public final h0 d;
    public final String e;

    public void KsShareDataEngine$shareAnyRequest$1(KsShareDataEngine p0,k p1,h0 p2,String p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void subscribe(v p0){
       Object obj3;
       l1 a;
       Object obj4;
       String str16;
       String str17;
       KsShareDataEngine$shareAnyRequest$1 d1;
       c b;
       k z;
       ShareInitResponse$SharePanelData mZtShareSDKE;
       StartShareParam$JsShareParam jsShareParam;
       StartShareParam$ChannelOption uChannelOpti;
       JsonObject jsonObject3;
       StartShareParam$JsShareParam jsShareParam1;
       StartShareParam$JsShareParam obj6;
       StartShareParam$ChannelOption obj7;
       StartShareParam$ChannelOption uChannelOpti1;
       a obj = this;
       KsShareDataEngine$shareAnyRequest$1 obj1 = p0;
       b uob = b.class;
       KsShareDataEngine ksShareDataE = KsShareDataEngine.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, KsShareDataEngine$shareAnyRequest$1.class, str)) {
          return;
       }
       a.p(obj1, "emitter");
       obj.c.h().x("request_share_any_start");
       KsShareApi s = KsShareApi.s;
       KsShareDataEngine$shareAnyRequest$1$a oshareAnyReq = new KsShareDataEngine$shareAnyRequest$1$a(obj, obj1);
       String str1 = obj.c.w();
       String str2 = s.g();
       String str3 = s.h();
       String str4 = obj.d.c();
       a.m(str4);
       String str5 = obj.c.v();
       obj1 = obj.b;
       KsShareDataEngine$shareAnyRequest$1 c = obj.c;
       KsShareDataEngine$shareAnyRequest$1 d = obj.d;
       Objects.requireNonNull(obj1);
       a uoa = new a(s.k());
       String str6 = PatchProxy.applyTwoRefs(c, d, obj1, ksShareDataE, "7");
       String str7 = "5";
       String str8 = str;
       str = "";
       String str9 = str4;
       str4 = "ksShareUrlHdlMgr";
       String str10 = obj.c.x();
       String str11 = "jsShareParam";
       String str12 = str3;
       KsShareDataEngine$shareAnyRequest$1 oshareAnyReq1 = null;
       if (str6 != patchProxyRe) {
       }else if(c.f() == null){
          str6 = c.s();
       }else {
          obj6 = c.f();
          Object obj8 = PatchProxy.applyTwoRefs(obj6, d, oshareAnyReq1, uob, str7);
          if (obj8 != patchProxyRe) {
             str6 = obj8;
          }else {
             a.p(obj6, str11);
             a.p(d, str4);
             obj7 = b.a(obj6, d);
             if (obj7 != null) {
                obj7 = obj7.mShareMethod;
                if (obj7 != null) {
                   uChannelOpti = obj7;
                }
             }
             obj6 = obj6.mCommonConfig;
             if (obj6 != null) {
                str6 = k0.h(obj6, "shareMethod", str);
             }else {
                str6 = oshareAnyReq1;
             }
          }
       }
       c = obj.b;
       d = obj.c;
       oshareAnyReq1 = obj.d;
       Objects.requireNonNull(c);
       String str13 = str7;
       str7 = PatchProxy.applyTwoRefs(d, oshareAnyReq1, c, ksShareDataE, "8");
       if (str7 != patchProxyRe) {
       }else if(d.f() == null){
          str7 = d.u();
       }else {
          jsShareParam1 = d.f();
          obj7 = PatchProxy.applyTwoRefs(jsShareParam1, oshareAnyReq1, null, uob, "4");
          if (obj7 != patchProxyRe) {
             str7 = obj7;
          }else {
             a.p(jsShareParam1, str11);
             a.p(oshareAnyReq1, str4);
             obj7 = b.a(jsShareParam1, oshareAnyReq1);
             if (obj7 != null) {
                obj7 = obj7.mShareMode;
                if (obj7 != null) {
                   uChannelOpti1 = obj7;
                }
             }
             jsShareParam1 = jsShareParam1.mCommonConfig;
             if (jsShareParam1 != null) {
                uChannelOpti1 = k0.h(jsShareParam1, "shareMode", str);
             }else {
                uChannelOpti1 = null;
             }
          }
       }
       c = obj.b;
       d = obj.c;
       oshareAnyReq1 = obj.d;
       Objects.requireNonNull(c);
       Object obj2 = str7;
       str7 = PatchProxy.applyTwoRefs(d, oshareAnyReq1, c, ksShareDataE, "9");
       String str14 = "6";
       if (str7 != patchProxyRe) {
          obj3 = str6;
       }else if(d.f() == null){
          jsonObject3 = d.i();
          obj3 = str6;
       }else {
          jsShareParam1 = d.f();
          obj3 = str6;
          obj6 = PatchProxy.applyTwoRefs(jsShareParam1, oshareAnyReq1, null, uob, str14);
          if (obj6 != patchProxyRe) {
             jsonObject3 = obj6;
          }else {
             a.p(jsShareParam1, str11);
             a.p(oshareAnyReq1, str4);
             uChannelOpti = b.a(jsShareParam1, oshareAnyReq1);
             jsShareParam1 = jsShareParam1.mTokenStoreParams;
             StartShareParam$ChannelOption mSubTokenSto = (uChannelOpti != null)? uChannelOpti.mSubTokenStoreParams: null;
             jsonObject3 = b.d(jsShareParam1, mSubTokenSto);
          }
       }
       String str20 = (jsonObject3 != null)? jsonObject3.toString(): null;
       str7 = str20;
       if (str7 != null) {
          obj.c.m().b = str7;
          a = l1.a;
       }else {
          d1 = null;
       }
       JsonObject jsonObject = obj.c.l();
       if (jsonObject != null) {
          str6 = jsonObject.toString();
          if (str6 != null) {
             obj.c.m().c = str6;
             l1 a1 = l1.a;
          label_0187 :
             d = obj.b;
             oshareAnyReq1 = obj.c;
             String str15 = str6;
             obj1 = obj.d;
             Objects.requireNonNull(d);
             k ok = PatchProxy.applyTwoRefs(oshareAnyReq1, obj1, d, ksShareDataE, str14);
             if (ok != patchProxyRe) {
             label_01a4 :
                obj4 = str7;
                str16 = str2;
                str2 = null;
             }else if(oshareAnyReq1.f() == null){
                ok = oshareAnyReq1.w;
                goto label_01a4 ;
             }else {
                jsShareParam = oshareAnyReq1.f();
                obj4 = str7;
                str16 = str2;
                str2 = null;
                StartShareParam$JsShareParam obj5 = PatchProxy.applyTwoRefs(jsShareParam, obj1, str2, uob, "3");
                if (obj5 != patchProxyRe) {
                   ok = obj5;
                }else {
                   a.p(jsShareParam, str11);
                   a.p(obj1, str4);
                   jsShareParam.mActionUrlCatch = obj1.b();
                   uChannelOpti = b.a(jsShareParam, obj1);
                   obj5 = jsShareParam.mCommonConfig;
                   uChannelOpti = (uChannelOpti != null)? uChannelOpti.mConfig: str2;
                   ok = b.d(obj5, uChannelOpti);
                }
             }
             Objects.requireNonNull(d);
             str6 = PatchProxy.applyTwoRefs(oshareAnyReq1, ok, d, ksShareDataE, "18");
             if (str6 != patchProxyRe) {
             }else {
                ShareInitResponse shareInitRes = oshareAnyReq1.z();
                if (shareInitRes != null) {
                   shareInitRes = shareInitRes.mSharePanel;
                   if (shareInitRes != null) {
                      mZtShareSDKE = shareInitRes.mZtShareSDKExtParams;
                   label_01f8 :
                      if (mZtShareSDKE != null) {
                         if (ok == null) {
                            ok = new JsonObject();
                         }
                         ok.c0("ztShareSDKExtParams", mZtShareSDKE);
                      }
                      str20 = (ok != null)? ok.toString(): str2;
                      str6 = str20;
                   }
                }
                mZtShareSDKE = str2;
                goto label_01f8 ;
             }
             if (str6 != null) {
                obj.c.m().a(str6);
                str17 = str6;
             }else {
                str17 = str2;
             }
             obj1 = obj.b;
             KsShareDataEngine$shareAnyRequest$1 c1 = obj.c;
             d1 = obj.d;
             Objects.requireNonNull(obj1);
             str6 = PatchProxy.applyTwoRefs(c1, d1, obj1, ksShareDataE, "12");
             str14 = "imageBytes";
             if (str6 != patchProxyRe) {
             }else if(c1.f() == null){
                z = c1.z;
             }else {
                z = b.b(c1.f(), d1);
             }
             if (z != null && k0.a(z, str14)) {
                c1.F(k0.h(z, str14, str));
                jsonObject = z.d0();
                jsonObject.z0(str14);
                if (jsonObject.size() > 0) {
                   str6 = jsonObject.toString();
                }else {
                   str6 = str2;
                }
             }else if(z != null){
                str20 = z.toString();
             }else {
                str20 = str2;
             }
             str6 = str20;
             obj.c.m().d = str6;
             c1 = obj.b;
             d1 = obj.c;
             KsShareDataEngine$shareAnyRequest$1 d2 = obj.d;
             Objects.requireNonNull(c1);
             String str18 = PatchProxy.applyTwoRefs(d1, d2, c1, ksShareDataE, "13");
             if (str18 != patchProxyRe) {
             }else if(d1.f() != null){
                JsonObject jsonObject2 = b.c(d1.f(), d2);
                if (jsonObject2 != null && k0.a(jsonObject2, str14)) {
                   jsonObject2 = jsonObject2.d0();
                   jsonObject2.z0(str14);
                   if (jsonObject2.size() > 0) {
                      str18 = jsonObject2.toString();
                   }else {
                      str18 = str2;
                   }
                }else if(jsonObject2 != null){
                   str3 = jsonObject2.toString();
                label_02c7 :
                   str18 = str3;
                }
             }
             str3 = str2;
             goto label_02c7 ;
             obj.c.m().e = str18;
             str7 = obj.c.A();
             d2 = obj.e;
             c = obj.b;
             d = obj.c;
             Objects.requireNonNull(c);
             String str19 = PatchProxy.applyOneRefs(d, c, ksShareDataE, "11");
             if (str19 != patchProxyRe) {
             }else {
                JsonObject jsonObject1 = new JsonObject();
                PainterModel painterModel = d.c();
                if (painterModel != null) {
                   jsonObject1.c0("posterName", painterModel.mPainterId);
                }
                str19 = jsonObject1.toString();
                a.o(str19, "param.toString\(\)");
             }
             KsShareDataEngine$shareAnyRequest$1$7 oshareAnyReq2 = new KsShareDataEngine$shareAnyRequest$1$7(obj);
             a uoa1 = a.class;
             if (PatchProxy.isSupport(uoa1)) {
                Object[] objArray = new Object[19];
                objArray[0] = oshareAnyReq;
                objArray[1] = str1;
                objArray[2] = "1.14.0.4";
                objArray[3] = str16;
                objArray[4] = str12;
                objArray[5] = str10;
                objArray[6] = str9;
                objArray[7] = str5;
                objArray[8] = obj3;
                objArray[9] = obj2;
                objArray[10] = obj4;
                objArray[11] = str15;
                objArray[12] = str17;
                objArray[13] = str6;
                objArray[14] = str18;
                objArray[15] = str7;
                objArray[16] = d2;
                objArray[17] = str19;
                objArray[18] = oshareAnyReq2;
                if (PatchProxy.applyVoid(objArray, uoa, uoa1, str8)) {
                label_03c0 :
                   return;
                }
             }
             uoa1 = str4;
             obj = str4;
             uoa1 = new a(str1, "1.14.0.4", str16, str12, str10, str9, str5, obj3, obj2, obj4, str15, str17, str6, str18, str7, d2, str19, oshareAnyReq2, oshareAnyReq, null, null, 0x180000, null);
             b = c.b;
             Objects.requireNonNull(b);
             t ot = PatchProxy.applyOneRefs(obj, b, c.class, str13);
             if (ot != patchProxyRe) {
             }else {
                a.p(obj, "shareElement");
                ot = t.create(new d(c.a, obj, "/rest/zt/share/any", "shareAny"));
                a.o(ot, "Observable.create<T> { e¡­paramsMap.toString\(\)\)\n  }");
             }
             ot.subscribe();
             goto label_03c0 ;
          }
       }
       obj1 = null;
       goto label_0187 ;
    }
}
