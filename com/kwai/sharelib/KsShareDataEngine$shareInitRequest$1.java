package com.kwai.sharelib.KsShareDataEngine$shareInitRequest$1;
import io.reactivex.g;
import com.kwai.sharelib.KsShareDataEngine;
import uo7.k;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import brd.v;
import xo7.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.sharelib.log.KsSharePerformanceStat;
import vo7.a;
import com.kwai.sharelib.KsShareApi;
import android.app.Application;
import com.kwai.sharelib.KsShareDataEngine$shareInitRequest$1$a;
import java.util.Objects;
import com.google.gson.JsonObject;
import com.kwai.sharelib.jsshare.StartShareParam$JsShareParam;
import com.kwai.sharelib.jsshare.StartShareParam$shareInitConfig;
import com.google.gson.JsonElement;
import ekd.k0;
import com.kwai.sharelib.KsShareDataEngine$shareInitRequest$1$2;
import java.util.HashMap;
import kotlin.Pair;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import c97.d;
import com.kwai.middleware.azeroth.network.a$b;
import zk.d;
import com.yxcorp.utility.gson.ForwardingGsonLifecycleFactory;
import zk.j;
import okhttp3.OkHttpClient$Builder;
import java.util.concurrent.TimeUnit;
import com.kwai.middleware.azeroth.network.a;
import com.kwai.sharelib.model.ShareInitResponse;
import java.util.Map;
import ca7.c;
import msd.l;

public final class KsShareDataEngine$shareInitRequest$1 implements g	// class@00169f
{
    public final KsShareDataEngine b;
    public final k c;
    public final Ref$ObjectRef d;

    public void KsShareDataEngine$shareInitRequest$1(KsShareDataEngine p0,k p1,Ref$ObjectRef p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void subscribe(v p0){
       KsShareDataEngine$shareInitRequest$1 b;
       String str8;
       String str9;
       a uoa1;
       StartShareParam$JsShareParam jsShareParam;
       StartShareParam$shareInitConfig mInitExtPain;
       JsonObject jsonObject2;
       StartShareParam$shareInitConfig mInitExtPost;
       JsonObject jsonObject3;
       StartShareParam$shareInitConfig mInitExtToke;
       Object obj = this;
       String obj1 = p0;
       b uob = b.class;
       KsShareDataEngine ksShareDataE = KsShareDataEngine.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, KsShareDataEngine$shareInitRequest$1.class, "1")) {
          return;
       }
       a.p(obj1, "emitter");
       obj.c.h().x("request_share_init_start");
       KsShareApi s = KsShareApi.s;
       KsShareDataEngine$shareInitRequest$1$a oshareInitRe = new KsShareDataEngine$shareInitRequest$1$a(obj, obj1);
       obj1 = obj.c.w();
       String str = "1.14.0.4";
       String str1 = s.g();
       String str2 = s.h();
       String str3 = obj.c.x();
       String str4 = obj.c.v();
       b = obj.b;
       KsShareDataEngine$shareInitRequest$1 c = obj.c;
       Objects.requireNonNull(b);
       String str5 = "14";
       String str6 = PatchProxy.applyOneRefs(c, b, ksShareDataE, str5);
       KsShareApi ksShareApi = s;
       String str7 = "conf";
       a uoa = new a(s.k());
       KsShareDataEngine$shareInitRequest$1 oshareInitRe1 = null;
       if (str6 != patchProxyRe) {
       }else {
          jsonObject3 = PatchProxy.applyOneRefs(c, oshareInitRe1, uob, "11");
          if (jsonObject3 != patchProxyRe) {
          }else {
             a.p(c, str7);
             k u = c.u;
             StartShareParam$JsShareParam jsShareParam2 = c.f();
             if (jsShareParam2 != null) {
                jsShareParam2 = jsShareParam2.mShareInitConfig;
                if (jsShareParam2 != null) {
                   mInitExtToke = jsShareParam2.mInitExtTokenStoreParams;
                label_0088 :
                   jsonObject3 = b.d(u, mInitExtToke);
                }
             }
             mInitExtToke = oshareInitRe1;
             goto label_0088 ;
          }
          if (jsonObject3 != null) {
             str6 = jsonObject3.toString();
          }else {
             str6 = oshareInitRe1;
          }
       }
       c = obj.b;
       oshareInitRe1 = obj.c;
       Objects.requireNonNull(c);
       Object obj2 = str6;
       str6 = PatchProxy.applyOneRefs(oshareInitRe1, c, ksShareDataE, "15");
       if (str6 != patchProxyRe) {
       }else {
          jsonObject3 = PatchProxy.applyOneRefs(oshareInitRe1, null, uob, "12");
          if (jsonObject3 != patchProxyRe) {
          }else {
             a.p(oshareInitRe1, str7);
             jsonObject3 = oshareInitRe1.n();
             jsShareParam = oshareInitRe1.f();
             if (jsShareParam != null) {
                jsShareParam = jsShareParam.mShareInitConfig;
                if (jsShareParam != null) {
                   mInitExtPain = jsShareParam.mInitExtTransientParams;
                label_00c9 :
                   jsonObject3 = b.d(jsonObject3, mInitExtPain);
                }
             }
             jsonObject2 = null;
             goto label_00c9 ;
          }
          str8 = (jsonObject3 != null)? jsonObject3.toString(): null;
          str6 = str8;
       }
       oshareInitRe1 = obj.b;
       c = obj.c;
       Objects.requireNonNull(oshareInitRe1);
       Object obj3 = str6;
       str8 = PatchProxy.applyOneRefs(c, oshareInitRe1, ksShareDataE, "16");
       if (str8 != patchProxyRe) {
       }else {
          jsonObject2 = PatchProxy.applyOneRefs(c, null, uob, "13");
          if (jsonObject2 != patchProxyRe) {
          }else {
             a.p(c, str7);
             k x = c.x;
             StartShareParam$JsShareParam jsShareParam1 = c.f();
             if (jsShareParam1 != null) {
                jsShareParam1 = jsShareParam1.mShareInitConfig;
                if (jsShareParam1 != null) {
                   mInitExtPost = jsShareParam1.mInitExtPosterParams;
                label_0109 :
                   jsonObject2 = b.d(x, mInitExtPost);
                }
             }
             mInitExtPost = null;
             goto label_0109 ;
          }
          if (jsonObject2 != null) {
             str8 = jsonObject2.toString();
          }else {
             str8 = null;
          }
       }
       b = obj.b;
       c = obj.c;
       Objects.requireNonNull(b);
       Object obj4 = str8;
       a obj5 = PatchProxy.applyOneRefs(c, b, ksShareDataE, "17");
       if (obj5 != patchProxyRe) {
          str9 = obj5;
       }else {
          JsonObject jsonObject1 = PatchProxy.applyOneRefs(c, null, uob, str5);
          if (jsonObject1 != patchProxyRe) {
          }else {
             a.p(c, str7);
             k y = c.y;
             jsShareParam = c.f();
             if (jsShareParam != null) {
                jsShareParam = jsShareParam.mShareInitConfig;
                if (jsShareParam != null) {
                   mInitExtPain = jsShareParam.mInitExtPainterParams;
                label_0148 :
                   jsonObject1 = b.d(y, mInitExtPain);
                }
             }
             mInitExtPain = null;
             goto label_0148 ;
          }
          if (jsonObject1 != null) {
             str8 = "imageBytes";
             if (k0.a(jsonObject1, str8)) {
                c.d = k0.h(jsonObject1, str8, "");
                jsonObject1 = jsonObject1.d0();
                jsonObject1.z0(str8);
                if (jsonObject1.size() > 0) {
                   str9 = jsonObject1.toString();
                }else {
                label_0177 :
                   str9 = null;
                }
             }
          }
          if (jsonObject1 != null) {
             str9 = jsonObject1.toString();
          }else {
             goto label_0177 ;
          }
       }
       String str10 = obj.c.A();
       oshareInitRe1 = obj.b;
       KsShareDataEngine$shareInitRequest$1 c1 = obj.c;
       Objects.requireNonNull(oshareInitRe1);
       String str11 = PatchProxy.applyOneRefs(c1, oshareInitRe1, ksShareDataE, "10");
       if (str11 != patchProxyRe) {
       }else {
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("clientSharePanelPosterStyle", c1.D);
          str11 = jsonObject.toString();
          a.o(str11, "param.toString\(\)");
       }
       KsShareDataEngine$shareInitRequest$1$2 oshareInitRe2 = new KsShareDataEngine$shareInitRequest$1$2(obj);
       obj5 = a.class;
       int i = 0;
       int i1 = 1;
       if (PatchProxy.isSupport(obj5)) {
          Object[] objArray = new Object[14];
          objArray[i] = oshareInitRe;
          objArray[i1] = obj1;
          objArray[2] = str;
          objArray[3] = str1;
          objArray[4] = str2;
          objArray[5] = str3;
          objArray[6] = str4;
          objArray[7] = obj2;
          objArray[8] = obj3;
          objArray[9] = obj4;
          objArray[10] = str9;
          objArray[11] = str10;
          objArray[12] = str11;
          objArray[13] = oshareInitRe2;
          uoa1 = uoa;
          if (PatchProxy.applyVoid(objArray, uoa1, obj5, "2")) {
          label_0304 :
             return;
          }
       }else {
          uoa1 = uoa;
       }
       HashMap hashMap = new HashMap();
       hashMap.put("sdkVersion", str);
       hashMap.put("kpf", str1);
       hashMap.put("kpn", str2);
       if (!TextUtils.x(ksShareApi.a().getFirst()) && !TextUtils.x(ksShareApi.a().getSecond())) {
          hashMap.put(ksShareApi.a().getFirst(), ksShareApi.a().getSecond());
       }
       if (!TextUtils.x(ksShareApi.i().getFirst()) && !TextUtils.x(ksShareApi.i().getSecond())) {
          hashMap.put(ksShareApi.i().getFirst(), ksShareApi.i().getSecond());
       }
       hashMap.put("shareObjectId", str3);
       if (str4 != null) {
          hashMap.put("shareResourceType", str4);
       }
       if (obj2 != null) {
          hashMap.put("extTokenStoreParams", obj2);
       }
       if (obj3 != null) {
          hashMap.put("extTransientParams", obj3);
       }
       if (obj4 != null) {
          hashMap.put("extPosterParams", obj4);
       }
       if (str9 != null) {
          hashMap.put("extPainterParams", str9);
       }
       if (str10 != null) {
          hashMap.put("theme", str10);
       }
       if (str11 != null) {
          hashMap.put("extInnerSdkParams", str11);
       }
       hashMap.put("subBiz", obj1);
       a$b uob1 = d.a().k("ks_share_lib");
       uob1.b().g(new ForwardingGsonLifecycleFactory(null));
       TimeUnit sECONDS = TimeUnit.SECONDS;
       uob1.c().connectTimeout(1, sECONDS).readTimeout(1, sECONDS);
       uob1.i(obj1);
       uob1.h(false);
       uob1.j((ksShareApi.f() ^ 1));
       uob1.k(uoa1.a());
       a uoa2 = uob1.a();
       uoa2.d("/rest/zt/share/init", hashMap, ShareInitResponse.class, oshareInitRe);
       oshareInitRe2.invoke(hashMap.toString());
       goto label_0304 ;
    }
}
