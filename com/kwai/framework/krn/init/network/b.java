package com.kwai.framework.krn.init.network.b;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import okhttp3.MediaType;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import java.util.concurrent.ConcurrentHashMap;
import com.kwai.framework.krn.init.network.b$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.SystemUtil;
import o56.c;
import o56.a;
import android.app.Application;
import com.kwai.framework.krn.init.network.b$b;
import com.facebook.react.bridge.ReactContext;
import com.kwai.framework.krn.init.network.RequestConfig;
import com.kwai.framework.krn.init.preload.e$h;
import brd.t;
import java.util.Map;
import java.util.HashMap;
import ik0.m;
import ri0.b;
import lj0.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import os6.a;
import java.util.Set;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import xf6.h;
import java.lang.Boolean;
import java.io.File;
import java.lang.StringBuilder;
import ek0.d;
import com.kwai.framework.krn.init.network.KdsUploadProgressListener;
import androidx.fragment.app.FragmentActivity;
import okhttp3.RequestBody;
import y86.w;
import y86.b;
import ojd.f;
import okhttp3.MultipartBody$Part;
import ojd.e;
import y86.m;
import erd.g;
import y86.h;
import erd.a;
import y86.n;
import okhttp3.Headers;
import fg6.a;
import com.google.gson.Gson;
import java.net.URL;
import c96.a;
import java.lang.Throwable;
import com.kuaishou.krn.model.LaunchModel;
import y86.d;
import com.kwai.framework.krn.init.network.KrnNetErrorInfo;
import y86.g;
import java.lang.StackTraceElement;
import java.util.Arrays;
import android.os.Bundle;
import com.kwai.framework.krn.init.preload.a;
import k2b.u1;
import njd.a;
import java.lang.System;
import okhttp3.Response;
import okhttp3.Request;
import com.kwai.framework.krn.init.network.KrnNetResponse;
import java.util.List;
import java.util.ArrayList;
import java.lang.Iterable;
import com.kuaishou.krn.c;
import y86.c;
import y86.s;
import q87.c;
import com.yxcorp.retrofit.model.KwaiException;
import com.kwai.framework.krn.init.network.b$c;
import com.yxcorp.retrofit.model.RetrofitException;
import aegon.chrome.net.NetworkException;
import com.kwai.framework.krn.init.network.KrnNetErrorInfo$SubErrorInfo;
import java.io.IOException;
import retrofit2.HttpException;
import retrofit2.p;
import com.facebook.react.bridge.CatalystInstance;
import java.lang.Long;
import gk0.b;
import java.util.Objects;
import gk0.a;
import com.facebook.react.bridge.ReadableMap;
import ri0.a;
import com.kwai.framework.krn.init.preload.e;
import y86.o;
import y86.p;
import crd.b;
import java.lang.Exception;
import okhttp3.HttpUrl;

public class b	// class@0015ef
{
    public static boolean a;
    public static boolean b;
    public static final MediaType c;
    public static final SharedPreferences d;
    public static final Map e;
    public static b$c f;

    static {
       b.a = a.t().d("krnDealRiskManagementException", false);
       b.b = a.t().d("krnNetworkOptimize2", false);
       b.c = MediaType.parse("application/json;charset=utf-8");
       b.d = b.b("DefaultPreferenceHelper");
       b.e = new ConcurrentHashMap();
    }
    public void b(){
       super();
    }
    public void b(b$a p0){
       super();
    }
    public static String a(int p0,String p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, uob, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (SystemUtil.I() || a.a().c()) {
          return p1;
       }else if(-1004 == p0){
          return a.a().a().getString(0x7f1038e7);
       }else {
          return a.a().a().getString(0x7f1038e3);
       }
    }
    public static b b(){
       return b$b.a;
    }
    public static t c(ReactContext p0,RequestConfig p1,e$h p2){
       e$h a;
       e$h b;
       HashMap hashMap;
       Object obj3;
       String fileKey;
       t ot1;
       String str1;
       Set obj4;
       b uob = b.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, b.class, "25");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = p1.getUrl();
       String method = p1.getMethod();
       Map headers = p1.getHeaders();
       if (p2 != null) {
          a = p2.a;
          b = p2.b;
          if (a != null && b != null) {
             headers.put(a, b);
          }
       }
       Map params = p1.getParams();
       String obj1 = PatchProxy.applyThreeRefs(p0, p1, p2, null, b.class, "26");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = PatchProxy.applyThreeRefs(p0, p1, p2, null, b.class, "27");
          if (obj1 != patchProxyRe) {
          }else {
             obj1 = new HashMap();
             if (p2 != null) {
                e$h a1 = p2.a;
                p2 = p2.b;
                if (a1 != null && p2 != null) {
                   obj1.put(a1, p2);
                }
             }
             if (p1.getIsAddCommonParameters() && p1.getRootTag()) {
                m om = b.a(p0, p1.getRootTag());
                if (om != null) {
                   c krnContext = om.getKrnContext();
                   if (krnContext != null) {
                      obj1.put("kdsBundleId", krnContext.b());
                      obj1.put("kdsBundleVersionCode", Integer.valueOf(krnContext.e()));
                      obj1.put("kdsComponentName", krnContext.f());
                   }
                }
             }
          }
       label_00a6 :
          if (!p1.getQueryParams().isEmpty()) {
             obj1.putAll(p1.getQueryParams());
          }
       }
       Object obj2 = obj1;
       String businessName = p1.getBusinessName();
       boolean isAddCommonP = p1.getIsAddCommonParameters();
       t ot = null;
       if (!TextUtils.isEmpty(obj) && (p1.isUpload() || !TextUtils.isEmpty(method))) {
          String str = null;
          if (!PatchProxy.applyVoidOneRefs(headers, ot, a.class, "1")) {
             obj4 = headers.keySet();
             String str3 = 1;
             if (!q.f(obj4)) {
                Iterator iterator1 = obj4.iterator();
                while (true) {
                   if (iterator1.hasNext()) {
                      if ("Referer".equalsIgnoreCase(iterator1.next())) {
                         str3 = null;
                      }
                   }
                }
             }
             if (str3) {
                headers.put("Referer", "https://rn.kuaishou.com/");
             }
          }
          obj1 = PatchProxy.applyTwoRefs(obj, businessName, ot, uob, "29");
          if (obj1 != patchProxyRe) {
          }else if(TextUtils.equals("web_merchant", businessName) || (TextUtils.equals("webMerchant", businessName) && !TextUtils.isEmpty(h.m()))){
             obj4 = PatchProxy.apply(ot, ot, uob, "31");
             boolean b1 = (obj4 != patchProxyRe)? obj4.booleanValue(): b.d.getBoolean("disable_web_https", str);
             if (b1) {
                obj = b.l(obj, h.m());
             }else {
                obj = (b.l(obj, h.m())).replace("http://", "https://");
             }
          }
          obj1 = obj;
          if (p1.isUpload()) {
             File uFile = new File(p1.getLocalFilePath());
             if (!uFile.exists()) {
                d.i("file not exists "+p1.getLocalFilePath());
                return ot;
             }else {
                KdsUploadProgressListener kdsUploadPro = new KdsUploadProgressListener(ot, p1.isShowProgress(), p1.getCustomUploadEventKey());
                params = p1.getParts();
                hashMap = PatchProxy.applyOneRefs(params, ot, uob, "28");
                if (hashMap != patchProxyRe) {
                }else {
                   hashMap = new HashMap();
                   Iterator iterator = params.keySet().iterator();
                   while (iterator.hasNext()) {
                      str1 = iterator.next();
                      obj3 = params.get(str1);
                      MediaType mediaType = MediaType.get("text/plain");
                      str = (obj3 == null)? "": obj3.toString();
                      hashMap.put(str1, RequestBody.create(mediaType, str));
                   }
                }
                obj3 = hashMap;
                fileKey = p1.getFileKey();
                if (TextUtils.isEmpty(fileKey)) {
                   fileKey = "file";
                }
                ot1 = (b.k(obj1))? b.b(businessName, isAddCommonP, p1.getTimeout()).j(obj1, headers, e.f(fileKey, uFile, kdsUploadPro), obj3, obj2).doOnError(new m(kdsUploadPro)).doOnComplete(new h(kdsUploadPro)): b.b(businessName, isAddCommonP, p1.getTimeout()).f(obj1, headers, e.f(fileKey, uFile, kdsUploadPro), obj3, obj2).doOnError(new n(kdsUploadPro)).doOnComplete(new h(kdsUploadPro));
                return ot1;
             }
          }else if(("GET").equalsIgnoreCase(method)){
             if (!q.h(obj2)) {
                hashMap = new HashMap(params);
                hashMap.putAll(obj2);
                params = hashMap;
             }
             ot1 = (b.k(obj1))? b.e(businessName, isAddCommonP, p1.getTimeout()).a(obj1, headers, params): b.e(businessName, isAddCommonP, p1.getTimeout()).e(obj1, headers, params);
             return ot1;
          }else if(("POST").equalsIgnoreCase(method)){
             fileKey = Headers.of(headers).get("content-type");
             if (fileKey != null) {
                str1 = fileKey.toLowerCase();
             }
             if (ot != null && ot.contains("application/json")) {
                String str2 = a.a.q(params);
                MediaType c = b.c;
                if (ot.contains("charset") && !ot.contains("utf-8")) {
                   c = MediaType.parse(fileKey);
                }
                RequestBody requestBody = RequestBody.create(c, str2);
                ot1 = (b.k(obj1))? b.e(businessName, isAddCommonP, p1.getTimeout()).d(obj1, headers, requestBody, obj2): b.e(businessName, isAddCommonP, p1.getTimeout()).h(obj1, headers, requestBody, obj2);
                return ot1;
             }else if(b.k(obj1)){
                ot1 = b.e(businessName, isAddCommonP, p1.getTimeout()).b(obj1, headers, params, obj2);
             }else {
                ot1 = b.e(businessName, isAddCommonP, p1.getTimeout()).g(obj1, headers, params, obj2);
             }
             return ot1;
          }
       }
       return ot;
    }
    public static boolean k(String p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = false;
       if (!TextUtils.isEmpty(p0)) {
          p0 = p0.toLowerCase();
          if (p0.startsWith("http://") || p0.startsWith("https://")) {
             b = true;
          }
       }
       return b;
    }
    public static String l(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          p1 = p0.replace(new URL(p0).getHost(), p1);
          if (p1.startsWith("https://")) {
             return p1.replace("https://", "http://");
          }
          return p1;
       }catch(java.lang.Exception e5){
          a.D().C("KrnNetwork", e5);
          return p0;
       }
    }
    public final void d(LaunchModel p0,ReactContext p1,RequestConfig p2,d p3,int p4,Throwable p5,String p6){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),p5,p6};
          if (PatchProxy.applyVoid(objArray, this, uob, "8")) {
             return;
          }
       }
       KrnNetErrorInfo krnNetErrorI = (p5 == null)? new KrnNetErrorInfo(p4, b.a(p4, p6)): new KrnNetErrorInfo(p4, b.a(p4, p6), p5);
       p3.b(krnNetErrorI);
       g og = new g();
       if (p2 != null) {
          String url = (TextUtils.isEmpty(p2.getHttpReportUrl()))? p2.getUrl(): p2.getHttpReportUrl();
          og.mUrl = url;
       }else {
          og.mUrl = "total";
       }
       og.mCode = (long)p4;
       og.mErrorMessage = p6;
       if (p5 != null) {
          og.mStackTrack = Arrays.toString(p5.getStackTrace());
       }
       if (p1 != null && (p2 != null && p2.getRootTag())) {
          m om = b.a(p1, p2.getRootTag());
          if (om != null) {
             c krnContext = om.getKrnContext();
             if (krnContext != null) {
                og.mBundleId = krnContext.b();
                og.mComponentName = krnContext.f();
                og.mSessionId = krnContext.t();
                og.mBundleVersionCode = krnContext.e();
                og.scheme = krnContext.m().f();
             }
          }
       }
       if (p0 != null) {
          og.mBundleId = p0.a();
          og.mComponentName = p0.b();
          og.mSessionId = p0.g().getString("SessionId");
          og.mBundleVersionCode = a.M().K(p0);
          og.scheme = p0.f();
       }
       u1.R("kds_network_error_event", a.a.q(og), 20);
       return;
    }
    public final void e(ReactContext p0,RequestConfig p1,d p2,Throwable p3,String p4){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uob, "6")) {
             return;
          }
       }
       this.d(null, p0, p1, p2, -1000, p3, p4);
       return;
    }
    public final void f(ReactContext p0,RequestConfig p1,d p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, b.class, "7")) {
          return;
       }
       this.d(null, p0, p1, p2, -1002, null, p3);
       return;
    }
    public void g(LaunchModel p0,ReactContext p1,RequestConfig p2,a p3,d p4){
       Object[] objArray;
       ArrayList uArrayList;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p4;
       b uob = b.class;
       int i = 4;
       int i1 = 3;
       int i2 = 5;
       int i3 = 2;
       int i4 = 1;
       int i5 = 0;
       if (PatchProxy.isSupport(uob)) {
          objArray = new Object[i2];
          objArray[i5] = oobject;
          objArray[i4] = oobject1;
          objArray[i3] = oobject2;
          objArray[i1] = p3;
          objArray[i] = oobject3;
          if (PatchProxy.applyVoid(objArray, obj, uob, "14")) {
             return;
          }
       }
       long l = (p2.isHitKrnPageLoadMonitorSample())? System.currentTimeMillis(): 0;
       String str = p3.a();
       Response response = p3.n();
       if (response != null && response.request() != null) {
          obj.p(response.request(), oobject2);
       }
       KrnNetResponse krnNetRespon = new KrnNetResponse();
       if (response != null) {
          krnNetRespon.statusCode = response.code();
          krnNetRespon.cookies = response.headers("Set-Cookie");
          Headers headers = response.headers();
          HashMap hashMap = PatchProxy.applyOneRefs(headers, obj, uob, "22");
          if (hashMap != PatchProxyResult.class) {
          }else {
             hashMap = new HashMap();
             i4 = headers.size();
             i2 = 0;
             while (i2 < i4) {
                String str1 = headers.name(i2);
                List list = hashMap.get(str1);
                int i6 = i4;
                if (list == null) {
                   uArrayList = new ArrayList(i3);
                   hashMap.put(str1, uArrayList);
                }else {
                   uArrayList = list;
                }
                uArrayList.add(headers.value(i2));
                i2 = i2 + 1;
                i4 = i6;
                str1 = null;
             }
             HashMap hashMap1 = new HashMap();
             Iterator iterator = hashMap.keySet().iterator();
             while (iterator.hasNext()) {
                String str2 = iterator.next();
                List list1 = hashMap.get(str2);
                if (list1.isEmpty()) {
                   continue ;
                }
                hashMap1.put(str2, TextUtils.join(",", list1));
                i3 = 2;
             }
             hashMap = hashMap1;
          }
          krnNetRespon.headers = hashMap;
       }
       if (str != null) {
          if (b.b && (!c.b().k() && !p2.isRequestV2())) {
             krnNetRespon.data = str;
          }else if(("string").equalsIgnoreCase(p2.getResponseType())){
             krnNetRespon.data = str;
          }else {
             krnNetRespon.data = a.a.h(str, Map.class);
          }
          long l1 = (p2.isHitKrnPageLoadMonitorSample())? System.currentTimeMillis(): 0;
          oobject3.a(krnNetRespon, p2.getResponseType());
          if (response != null) {
             c uoc = s.e(response.request());
             if (uoc != null && (uoc.a != null && !uoc.code - 200)) {
                if (oobject1 != null && p2.getRootTag()) {
                   m om = b.a(oobject1, p2.getRootTag());
                   if (om != null) {
                      c krnContext = om.getKrnContext();
                      if (krnContext != null) {
                         uoc.mBundleId = krnContext.b();
                         uoc.mComponentName = krnContext.f();
                         uoc.mSessionId = krnContext.t();
                         uoc.mBundleVersionCode = krnContext.e();
                         uoc.scheme = krnContext.m().f();
                      }
                   }
                }
                if (oobject != null) {
                   uoc.mBundleId = p0.a();
                   uoc.mComponentName = p0.b();
                   uoc.mSessionId = p0.g().getString("SessionId");
                   uoc.mBundleVersionCode = a.M().K(oobject);
                   uoc.scheme = p0.f();
                }
                Object[] objArray1 = new Object[0];
                a.D().w("KrnNetwork", "kds_network_event report:"+uoc, objArray1);
                u1.Y("kds_network_event", a.a.q(uoc), 20);
             }
          }
          this.m(p2, p3, l, l1);
       }else if(PatchProxy.isSupport(uob)){
          objArray = new Object[]{oobject,oobject1,oobject2,oobject3,"response body is null"};
          if (!PatchProxy.applyVoid(objArray, obj, uob, "5")) {
          }
       }else {
       }
       return;
    }
    public void h(LaunchModel p0,ReactContext p1,Throwable p2,RequestConfig p3,d p4){
       boolean b;
       KrnNetErrorInfo obj;
       int b1;
       long l;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       int i = 4;
       int i1 = 2;
       int i2 = 1;
       int i3 = 0;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,oobject4};
          if (PatchProxy.applyVoid(objArray, this, uob, "18")) {
             return;
          }
       }
       b = p3.isHitKrnPageLoadMonitorSample();
       if (oobject2 instanceof KwaiException) {
          object oobject5 = oobject2;
          if (b.a) {
             KwaiException mErrorCode = oobject5.mErrorCode;
             String str = (mErrorCode >= 0x61a81 && mErrorCode <= 0x64577)? 1: null;
             if (str) {
                this.d(p0, p1, p3, p4, -1005, p2, "用户取消风控验证");
                this.o(oobject3, oobject2);
                return;
             }else {
                obj = PatchProxy.applyOneRefs(oobject5, this, uob, "17");
                if (obj != patchProxyRe) {
                   b1 = obj.booleanValue();
                }else {
                   b$c f = b.f;
                   if (f == null || !f.a(oobject5)) {
                      i2 = null;
                   }
                   b1 = i2;
                }
                if (b1) {
                   this.d(p0, p1, p3, p4, -1006, p2, "风控验证失败");
                   this.o(oobject3, oobject2);
                   return;
                }
             }
          }
          if (oobject5.mResponse.a() instanceof String) {
             this.g(p0, p1, p3, oobject5.mResponse, p4);
          }else if(b.a){
             this.e(p1, p3, p4, p2, p2.getMessage());
          }
       }else {
          v2 = oobject2 instanceof RetrofitException;
          if (objArray) {
             object oobject6 = oobject2;
             RetrofitException mCause = oobject6.mCause;
             if (mCause instanceof NetworkException) {
                obj = PatchProxy.applyTwoRefs(oobject2, mCause, this, uob, "9");
                if (obj != patchProxyRe) {
                }else {
                   b1 = mCause.getErrorCode();
                   if (b1 == 6 || b1 == i) {
                      b1 = -1001;
                   }else if(b1 == i1){
                      b1 = -1004;
                   }else {
                      b1 = -1000;
                   }
                   obj = new KrnNetErrorInfo(b1, b.a(b1, p2.getMessage()), oobject2);
                   KrnNetErrorInfo$SubErrorInfo subErrorInfo = new KrnNetErrorInfo$SubErrorInfo();
                   subErrorInfo.code = mCause.getErrorCode();
                   subErrorInfo.message = mCause.getMessage();
                   obj.apiErrorInfo = subErrorInfo;
                }
                oobject4.b(obj);
                this.p(oobject6.mRequest, oobject3);
                if (!PatchProxy.applyVoidFourRefs(p3, p0, p1, mCause, this, b.class, "19")) {
                   g og = new g();
                   String url = (TextUtils.isEmpty(p3.getHttpReportUrl()))? p3.getUrl(): p3.getHttpReportUrl();
                   og.mUrl = url;
                   og.mCode = (long)mCause.getErrorCode();
                   og.mErrorMessage = mCause.getMessage();
                   og.mStackTrack = Arrays.toString(mCause.getStackTrace());
                   if (oobject1 != null && p3.getRootTag()) {
                      m om = b.a(oobject1, p3.getRootTag());
                      if (om != null) {
                         c krnContext = om.getKrnContext();
                         if (krnContext != null) {
                            og.mBundleId = krnContext.b();
                            og.mComponentName = krnContext.f();
                            og.mSessionId = krnContext.t();
                            og.mBundleVersionCode = krnContext.e();
                         }
                      }
                   }
                   if (oobject != null) {
                      og.mBundleId = p0.a();
                      og.mComponentName = p0.b();
                      og.mSessionId = p0.g().getString("SessionId");
                      og.mBundleVersionCode = a.M().K(oobject);
                   }
                   u1.R("kds_network_error_event", a.a.q(og), 20);
                }
                l = (b)? System.currentTimeMillis(): 0;
                this.m(p3, null, l, 0);
             }
          }
          object oobject7 = null;
          if (objArray) {
             oobject7 = oobject2.mRequest;
          }else if(oobject2 instanceof HttpException){
             object oobject8 = oobject2;
             if (oobject8.response() != null && oobject8.response().g() != null) {
                oobject7 = oobject8.response().g().request();
             }
          }
          this.p(oobject7, oobject3);
          this.d(p0, p1, p3, p4, -1000, p2, p2.getMessage());
          l = (b)? System.currentTimeMillis(): 0;
          this.m(p3, null, l, 0);
       }
       this.o(oobject3, oobject2);
       return;
    }
    public void i(ReactContext p0,RequestConfig p1,a p2,d p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, b.class, "13")) {
          return;
       }
       this.g(null, p0, p1, p2, p3);
       return;
    }
    public boolean j(ReactContext p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null && p0.hasActiveCatalystInstance()) {
          return p0.getCatalystInstance().enableReportLoadMonitor();
       }
       return false;
    }
    public final void m(RequestConfig p0,a p1,long p2,long p3){
       a uoa;
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, p1, Long.valueOf(p2), Long.valueOf(p3), this, b.class, "21")) {
          return;
       }
       if (p0.isHitKrnPageLoadMonitorSample()) {
          long l = System.currentTimeMillis();
          Map e = b.e;
          if (e.get(p0.getUrl()) != null) {
             long l1 = e.get(p0.getUrl()).longValue();
             e.remove(p0.getUrl());
             int i = 0;
             int i1 = (p1 == null)? 0: (p1.a()).length();
             b uob = b.a();
             int uniqueId = p0.getUniqueId();
             String url = p0.getUrl();
             long l2 = (long)i1;
             Objects.requireNonNull(uob);
             b uob1 = b.class;
             if (PatchProxy.isSupport(uob1)) {
                Object[] objArray = new Object[]{Integer.valueOf(uniqueId),url,Long.valueOf(l1),Long.valueOf(p2),Long.valueOf(p3),Long.valueOf(l),Long.valueOf(l2)};
                if (!PatchProxy.applyVoid(objArray, uob, uob1, "1")) {
                }
             }else {
             }
          }
       }
       return;
    }
    public void n(Boolean p0,ReactContext p1,ReadableMap p2,d p3){
       Exception this;
       boolean b;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, b.class, "3")) {
          return;
       }
       RequestConfig requestConfi = null;
       if (p2 == null) {
          this.f(p1, requestConfi, p3, "request params can not be null");
          return;
       }else {
          try{
             Gson a = a.a;
             String str = a.q(a.b(p2));
             RequestConfig requestConfi1 = a.h(str, RequestConfig.class);
             if (requestConfi1 == null) {
                this.f(p1, requestConfi, p3, "request config can not be null");
                return;
             }else {
                b = this.j(p1);
                if (b) {
                   b.e.put(requestConfi1.getUrl(), Long.valueOf(System.currentTimeMillis()));
                }
                requestConfi1.setIsRequestV2(p0.booleanValue());
                requestConfi1.setHitKrnPageLoadMonitorSample(b);
                if (b && (p1.hasActiveCatalystInstance() && p1.getCatalystInstance().getUniqueId() != -1)) {
                   requestConfi1.setUniqueId(p1.getCatalystInstance().getUniqueId());
                }
             label_0072 :
                d.e("["+"KrnNetworkService"+"]请求配置为："+str);
                if (e.b().o(p1, requestConfi1, p3)) {
                   Object[] objArray = new Object[0];
                   a.D().w("KrnNetwork", "命中预拉取:"+requestConfi1.getUrl(), objArray);
                   a.M().F("命中预请求的URL是: \n"+requestConfi1.getUrl());
                   return;
                }else {
                   t ot = PatchProxy.applyTwoRefs(p1, requestConfi1, requestConfi, b.class, "24");
                   if (ot != PatchProxyResult.class) {
                   }else {
                      ot = b.c(p1, requestConfi1, requestConfi);
                   }
                   if (ot == null) {
                      this.f(p1, requestConfi1, p3, "request config is not support, check your request config");
                      return;
                   }else {
                      ot.subscribe(new o(this, p1, requestConfi1, p3), new p(this, p1, requestConfi1, p3));
                   }
                }
             }
          }catch(java.lang.Exception e8){
             this = e8;
             this.e(p1, null, p3, this, "KrnNetworkService.request exception="+this.getMessage());
          }
          return;
       }
    }
    public final void o(RequestConfig p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "4")) {
          return;
       }
       a.D().z("ReactNative", "KRN网络请求异常，请求配置为：\n"+p0.toString(), p1);
       return;
    }
    public final void p(Request p0,RequestConfig p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "20")) {
          return;
       }
       if (p0 != null) {
          p1.setHttpReportUrl(p0.url().url().getProtocol()+"://"+p0.url().url().getAuthority()+p0.url().url().getPath());
       }
       return;
    }
}
