package com.yxcorp.retrofit.interceptor.CommonParamsInterceptor;
import okhttp3.Interceptor;
import yid.e;
import java.lang.Object;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.lang.String;
import okhttp3.Request;
import m3d.a;
import okhttp3.RequestBody;
import okhttp3.FormBody;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import com.yxcorp.retrofit.e;
import okhttp3.HttpUrl;
import java.lang.StringBuilder;
import mjd.a;
import ujd.d;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.retrofit.dryrun.CommonParamsCompareManager;
import java.util.HashMap;
import okhttp3.Request$Builder;
import okhttp3.MultipartBody;
import okhttp3.MultipartBody$Part;
import ojd.g;
import okhttp3.Headers;
import okio.b;
import okio.c;
import java.nio.charset.Charset;
import java.io.Closeable;
import ekd.p;
import android.content.Context;
import vk7.g0;
import com.google.common.collect.o$f;
import com.google.common.collect.o;
import java.util.Collection;
import com.google.common.collect.ImmutableSet;
import okhttp3.HttpUrl$Builder;
import java.util.Map$Entry;
import okhttp3.MultipartBody$Builder;
import okhttp3.MediaType;
import java.util.ArrayList;
import java.util.List;
import okhttp3.FormBody$Builder;
import com.yxcorp.retrofit.dryrun.CommonParamsCompareManager$Type;
import com.yxcorp.retrofit.dryrun.a;

public class CommonParamsInterceptor implements Interceptor	// class@000970
{
    public final e a;
    public final boolean b;
    public final boolean c;

    public void CommonParamsInterceptor(e p0){
       super(p0, false, false);
    }
    public void CommonParamsInterceptor(e p0,boolean p1,boolean p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void a(Map p0){
       Iterator iterator = p0.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (p0.get(str) == null) {
             p0.put(str, "");
          }
       }
       return;
    }
    public final boolean b(Request p0){
       boolean b = (a.c(p0) || p0.body() instanceof FormBody)? true: false;
       return b;
    }
    public Response intercept(Interceptor$Chain p0){
       Request request1;
       String obj;
       Request request2;
       boolean b2;
       HttpUrl httpUrl1;
       String str2;
       HashMap hashMap4;
       int i5;
       CommonParamsInterceptor uCommonParam = this;
       Interceptor$Chain uChain = p0;
       Request request = p0.request();
       int b = (uCommonParam.c == null && e.h().c(request.url().encodedPath()))? true: false;
       String str = "CommonParamsInterceptor";
       a.a(str, "enableNewCommonParams:"+uCommonParam.b+" enableDryRun:"+b);
       if (!b && uCommonParam.b == null) {
          a.c(str, "CommonParamsInterceptor return originRequest");
          return uChain.proceed(request);
       }else if(uCommonParam.a == null){
          a.b(str, "mParams is null, CommonParamsInterceptor return originRequest");
          return uChain.proceed(request);
       }else if(b){
          String str1 = d.a(request, "dry_run_tag");
          if (TextUtils.isEmpty(str1)) {
             a.b(str, "uuid is empty");
          }
          if (uCommonParam.b == null) {
             request1 = CommonParamsCompareManager.c().g(str1);
             if (request1 != null) {
             label_0084 :
                HttpUrl httpUrl = request1.url();
                RequestBody requestBody = request1.body();
                HashMap hashMap = new HashMap();
                HashMap hashMap1 = new HashMap();
                boolean b1 = ("GET").equalsIgnoreCase(request1.method());
                Map map = uCommonParam.a.n(request1);
                Map map1 = uCommonParam.a.l(request1);
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                Iterator iterator = httpUrl.queryParameterNames().iterator();
                while (iterator.hasNext()) {
                   obj = iterator.next();
                   hashMap2.put(obj, httpUrl.queryParameter(obj));
                   int i = p0;
                }
                if (!b1 && requestBody != null) {
                   if (uCommonParam.b(request1)) {
                      hashMap3.putAll(a.b(request1.newBuilder().build()));
                   }else if(requestBody instanceof MultipartBody){
                      MultipartBody multipartBod = request1.body();
                      HashMap hashMap5 = new HashMap();
                      int i3 = multipartBod.size();
                      int i4 = 0;
                      while (i4 < i3) {
                         MultipartBody$Part part1 = multipartBod.part(i4);
                         MultipartBody multipartBod1 = multipartBod;
                         if (!part1.body() instanceof g && part1.headers() != null) {
                            i5 = i3;
                            b2 = b;
                            str2 = part1.headers().get(part1.headers().name(0));
                            i3 = str2.indexOf("name=\"") + 6;
                            b = str2.length() - 1;
                            str2 = str2.substring(i3, b);
                            b uob = new b();
                            httpUrl1 = httpUrl;
                            byte[] uobyteArray = new byte[(int)part1.body().contentLength()];
                            part1.body().writeTo(uob);
                            uob.readFully(uobyteArray);
                            request2 = request;
                            hashMap5.put(str2, new String(uobyteArray, Charset.forName("UTF-8")));
                            p.b(uob);
                         }else {
                            request2 = request;
                            b2 = b;
                            httpUrl1 = httpUrl;
                            i5 = i3;
                         }
                         i4 = i4 + 1;
                         httpUrl = httpUrl1;
                         multipartBod = multipartBod1;
                         i3 = i5;
                         b = b2;
                         request = request2;
                      }
                      request2 = request;
                      b2 = b;
                      httpUrl1 = httpUrl;
                      hashMap3.putAll(hashMap5);
                   label_0198 :
                      int i1 = (e.h().f() != null && !g0.a(e.h().f(), "android.permission.READ_PHONE_STATE"))? 1: 0;
                      str2 = "imei";
                      obj = "imeis";
                      if (hashMap3.containsKey(str2) || (hashMap3.containsKey(obj) && !i1)) {
                         hashMap3.remove(str2);
                         hashMap3.remove(obj);
                      }
                      hashMap.putAll(hashMap2);
                      hashMap1.putAll(hashMap3);
                      hashMap.putAll(map);
                      hashMap1.putAll(map1);
                      if (!b1 && (a.d(request1) || a.e(request1))) {
                         hashMap.putAll(hashMap1);
                         hashMap1.clear();
                      }
                      String str3 = "client_salt";
                      String str4 = hashMap.remove(str3);
                      if (TextUtils.isEmpty(str4)) {
                         str4 = hashMap1.remove(str3);
                      }
                      if (!hashMap.isEmpty() && !hashMap1.isEmpty()) {
                         hashMap.keySet().removeAll(ImmutableSet.copyOf(o.f(hashMap.keySet(), hashMap1.keySet())));
                      }
                      uCommonParam.a(hashMap);
                      uCommonParam.a(hashMap1);
                      if (hashMap.isEmpty()) {
                         httpUrl = httpUrl1;
                      }else {
                         HttpUrl$Builder uBuilder4 = httpUrl1.newBuilder();
                         iterator = hashMap.entrySet().iterator();
                         while (iterator.hasNext()) {
                            Map$Entry uEntry2 = iterator.next();
                            HttpUrl httpUrl3 = httpUrl1;
                            if (httpUrl3.queryParameter(uEntry2.getKey()) == null) {
                               uBuilder4.addQueryParameter(uEntry2.getKey(), uEntry2.getValue());
                            }else {
                               uBuilder4.setQueryParameter(uEntry2.getKey(), uEntry2.getValue());
                            }
                            httpUrl1 = httpUrl3;
                         }
                         httpUrl = uBuilder4.build();
                      }
                      Request$Builder uBuilder = request1.newBuilder().url(httpUrl);
                      if (!b1) {
                         RequestBody requestBody1 = request1.body();
                         if (requestBody1 instanceof MultipartBody) {
                            MultipartBody$Builder uBuilder1 = new MultipartBody$Builder(requestBody1.boundary());
                            uBuilder1.setType(requestBody1.type());
                            Iterator iterator1 = new ArrayList(requestBody1.parts()).iterator();
                            while (iterator1.hasNext()) {
                               MultipartBody$Part part = iterator1.next();
                               Headers headers = part.headers();
                               uBuilder1.addPart(headers, part.body());
                            }
                            if (!hashMap1.isEmpty()) {
                               iterator1 = hashMap1.entrySet().iterator();
                               while (iterator1.hasNext()) {
                                  Map$Entry uEntry = iterator1.next();
                                  if (!hashMap3.containsKey(uEntry.getKey())) {
                                     uBuilder1.addFormDataPart(uEntry.getKey(), uEntry.getValue());
                                  }
                               }
                            }
                            uBuilder.method(request1.method(), uBuilder1.build());
                         }else if(!uCommonParam.b(request1) && (requestBody1 == null || !requestBody1.contentLength())){
                            FormBody$Builder uBuilder3 = new FormBody$Builder();
                            if (requestBody1 instanceof FormBody) {
                               int i2 = 0;
                               while (i2 < requestBody1.size()) {
                                  String str5 = requestBody1.name(i2);
                                  String str6 = requestBody1.value(i2);
                                  if (hashMap1.containsKey(str5)) {
                                     hashMap4 = hashMap3;
                                     if (TextUtils.equals(str6, hashMap1.get(str5))) {
                                        hashMap1.remove(str5);
                                     }
                                  }else {
                                     hashMap4 = hashMap3;
                                  }
                                  if (!str3.equals(str5) && (!str2.equals(str5) && (!obj.equals(str5) || i1))) {
                                     uBuilder3.add(str5, str6);
                                  }
                                  i2 = i2 + 1;
                                  hashMap3 = hashMap4;
                               }
                            }
                            hashMap4 = hashMap3;
                            Iterator iterator3 = hashMap1.entrySet().iterator();
                            while (iterator3.hasNext()) {
                               Map$Entry uEntry1 = iterator3.next();
                               String key = uEntry1.getKey();
                               uBuilder3.add(key, uEntry1.getValue());
                            }
                            uBuilder.method(request1.method(), uBuilder3.build());
                         label_03a5 :
                            Request request3 = uBuilder.build();
                            Map map2 = uCommonParam.a.o(request3, str4);
                            HttpUrl httpUrl2 = request3.url();
                            HttpUrl$Builder uBuilder2 = httpUrl2.newBuilder();
                            Iterator iterator2 = map2.keySet().iterator();
                            while (iterator2.hasNext()) {
                               str = iterator2.next();
                               if (httpUrl2.queryParameter(str) == null) {
                                  uBuilder2.addQueryParameter(str, map2.get(str));
                               }else {
                                  uBuilder2.setQueryParameter(str, map2.get(str));
                               }
                            }
                            request3 = d.b(request3.newBuilder().url(uBuilder2.build()).build(), "origin_method", request1.method());
                            if (!b1) {
                               hashMap2 = hashMap4;
                            }
                            return a.a(p0, request2, d.b(request3, "origin_params", hashMap2), b2, uCommonParam.b, CommonParamsCompareManager$Type.REQUEST_PARAMS);
                         }
                      }
                      hashMap4 = hashMap3;
                      goto label_03a5 ;
                   }
                }
                request2 = request;
                b2 = b;
                httpUrl1 = httpUrl;
                goto label_0198 ;
             }
          }
       }
    label_0083 :
       request1 = request;
       goto label_0084 ;
    }
}
