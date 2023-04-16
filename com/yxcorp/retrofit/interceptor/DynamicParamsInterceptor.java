package com.yxcorp.retrofit.interceptor.DynamicParamsInterceptor;
import okhttp3.Interceptor;
import com.yxcorp.retrofit.c$a;
import android.content.Context;
import java.lang.Object;
import okhttp3.Request;
import m3d.a;
import okhttp3.RequestBody;
import okhttp3.FormBody;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import okhttp3.HttpUrl;
import com.yxcorp.retrofit.e;
import java.lang.String;
import java.lang.StringBuilder;
import mjd.a;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
import okhttp3.Request$Builder;
import java.util.Map;
import okhttp3.MultipartBody;
import okhttp3.MultipartBody$Part;
import ojd.g;
import okhttp3.Headers;
import okio.b;
import okio.c;
import java.nio.charset.Charset;
import java.io.Closeable;
import ekd.p;
import vk7.g0;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Class;
import com.google.common.base.Optional;
import java.lang.Enum;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Exception;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import java.net.URL;
import com.yxcorp.retrofit.d;
import com.yxcorp.retrofit.model.LocationConfigModel;
import com.kwai.sdk.switchconfig.a;
import ujd.a;
import java.lang.reflect.Type;
import el.a;
import java.util.ArrayList;
import java.util.List;
import com.kuaishou.aegon.Aegon;
import ujd.b;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import ujd.c;
import com.google.common.collect.o$f;
import com.google.common.collect.o;
import java.util.Collection;
import com.google.common.collect.ImmutableSet;
import pkd.a;
import java.lang.RuntimeException;
import java.lang.Iterable;
import okhttp3.HttpUrl$Builder;
import java.util.Map$Entry;
import okhttp3.MultipartBody$Builder;
import okhttp3.MediaType;
import okhttp3.FormBody$Builder;
import yid.k;
import yid.j;
import ujd.d;
import com.yxcorp.retrofit.dryrun.CommonParamsCompareManager$Type;
import com.yxcorp.retrofit.dryrun.a;

public class DynamicParamsInterceptor implements Interceptor	// class@000971
{
    public final c$a a;
    public final Context b;
    public final boolean c;
    public final boolean d;

    public void DynamicParamsInterceptor(c$a p0,Context p1,boolean p2,boolean p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final boolean a(Request p0){
       boolean b = (a.c(p0) || p0.body() instanceof FormBody)? true: false;
       return b;
    }
    public Response intercept(Interceptor$Chain p0){
       boolean b2;
       ArrayList uArrayList;
       String str6;
       String str7;
       String str8;
       String str9;
       DynamicParamsInterceptor a;
       String str10;
       boolean b4;
       Iterator iterator1;
       HttpUrl httpUrl1;
       Iterator iterator2;
       Map$Entry uEntry;
       HashMap hashMap7;
       int i1;
       String str11;
       String key;
       int i3;
       MultipartBody multipartBod1;
       DynamicParamsInterceptor uDynamicPara = this;
       Request request = p0.request();
       HttpUrl httpUrl = request.url();
       boolean b = (uDynamicPara.d == null && e.h().c(httpUrl.encodedPath()))? true: false;
       String str = "DynamicParamsInterceptor";
       a.a(str, "enableNewCommonParams:"+uDynamicPara.c+" enableDryRun:"+b);
       if (!b && uDynamicPara.c != null) {
          return p0.proceed(request);
       }else {
          Set set = httpUrl.queryParameterNames();
          HashMap hashMap = new HashMap();
          HashMap hashMap1 = new HashMap();
          String str1 = "GET";
          boolean b1 = str1.equalsIgnoreCase(request.method());
          if (b1) {
             Iterator iterator = set.iterator();
             while (iterator.hasNext()) {
                String str2 = iterator.next();
                hashMap.put(str2, httpUrl.queryParameter(str2));
             }
             b2 = b;
             uArrayList = null;
          }else if(request.body() != null){
             if (uDynamicPara.a(request)) {
                hashMap.putAll(a.b(request.newBuilder().build()));
             }else if(request.body() instanceof MultipartBody){
                MultipartBody multipartBod = request.body();
                hashMap7 = new HashMap();
                i1 = multipartBod.size();
                int i2 = 0;
                while (i2 < i1) {
                   MultipartBody$Part part1 = multipartBod.part(i2);
                   if (!part1.body() instanceof g && part1.headers() != null) {
                      i3 = i1;
                      str6 = part1.headers().get(part1.headers().name(0));
                      int i4 = str6.indexOf("name=\"") + 6;
                      i1 = str6.length() - 1;
                      str6 = str6.substring(i4, i1);
                      b uob = new b();
                      b2 = b;
                      byte[] uobyteArray = new byte[(int)part1.body().contentLength()];
                      part1.body().writeTo(uob);
                      uob.readFully(uobyteArray);
                      multipartBod1 = multipartBod;
                      hashMap7.put(str6, new String(uobyteArray, Charset.forName("UTF-8")));
                      p.b(uob);
                   }else {
                      i3 = i1;
                      b2 = b;
                      multipartBod1 = multipartBod;
                   }
                   i2 = i2 + 1;
                   b = b2;
                   i1 = i3;
                   multipartBod = multipartBod1;
                }
                b2 = b;
                hashMap.putAll(hashMap7);
             label_013d :
                iterator1 = set.iterator();
                while (iterator1.hasNext()) {
                   String str12 = iterator1.next();
                   hashMap1.put(str12, httpUrl.queryParameter(str12));
                }
             }
          }
          b2 = b;
          uArrayList = null;
          goto label_013d ;
          HashMap hashMap2 = new HashMap(hashMap);
          HashMap hashMap3 = new HashMap(hashMap1);
          HashMap hashMap4 = new HashMap();
          if (b1) {
             hashMap3.putAll(hashMap);
          }else {
             hashMap4.putAll(hashMap);
          }
          DynamicParamsInterceptor b3 = uDynamicPara.b;
          int i = (b3 != null && !g0.a(b3, "android.permission.READ_PHONE_STATE"))? 1: 0;
          String str3 = "imei";
          String str4 = "imeis";
          if (hashMap4.containsKey(str3) || (hashMap4.containsKey(str4) && !i)) {
             hashMap4.remove(str3);
             hashMap4.remove(str4);
          }
          RequestTiming dEFAULT = RequestTiming.DEFAULT;
          RequestTiming requestTimin = Optional.fromNullable(request.tag(RequestTiming.class)).or(dEFAULT);
          String str5 = "看到这个日志，请联系Android网络库同学，网络库公参和业务公参冲突，有相同的key = ";
          HashMap hashMap5 = hashMap2;
          str6 = "  业务中value = ";
          if (requestTimin != dEFAULT) {
             str7 = requestTimin.toString();
             str8 = str4;
             str4 = "apiInvokeTiming";
             if (hashMap3.containsKey(str4)) {
                str9 = str3;
                if (!TextUtils.equals(str7, hashMap3.get(str4))) {
                   Log.c(str, str5+str4+" 不同的value，网络库中value = "+str7+str6+hashMap3.get(str4), new Exception());
                }
             }else {
                str9 = str3;
             }
             hashMap3.put(str4, requestTimin.toString());
          }else {
             str9 = str3;
             str8 = str4;
          }
          str3 = p0.request().url().url().getPath();
          a = uDynamicPara.a;
          LocationConfigModel locationConf = e.h().g().E();
          a.d(hashMap3);
          HashMap hashMap6 = uArrayList;
          RequestBody requestBody = request.body();
          str = "ParamsUtils";
          if (a.t().getValue("enableParamWithIPv6PathList", new a().getType(), new ArrayList()).contains(request.url().url().getPath())) {
             str10 = "supportIPv6";
             str7 = (Aegon.e())? "true": "false";
             if (hashMap3.containsKey(str10) && !TextUtils.equals(str7, hashMap3.get(str10))) {
                b4 = b1;
                Log.c(str, str5+str10+" 不同的value，网络库中value = "+str7+str6+hashMap3.get(str10), new Exception());
             }else {
                b4 = b1;
             }
             hashMap3.put(str10, str7);
          }else {
             b4 = b1;
          }
          if (a.t().getValue("requestWithStidPathList", new b().getType(), new ArrayList()).contains(request.url().url().getPath())) {
             str10 = "common_log_ctx";
             str7 = b.a(0x4b316083).g();
             if (hashMap4.containsKey(str10) && !TextUtils.equals(str7, hashMap4.get(str10))) {
                Log.c(str, str5+str10+" 不同的value，网络库中value = "+str7+str6+hashMap4.get(str10), new Exception());
             }
             if (!TextUtils.isEmpty(str7)) {
                hashMap4.put(str10, str7);
             }
          }
          c.b(hashMap3, str3, locationConf);
          a.b(hashMap4);
          if (a.d(request) || a.e(request)) {
             hashMap3.putAll(hashMap4);
             hashMap4.clear();
          }
          str10 = "";
          ImmutableSet immutableSet = ImmutableSet.copyOf(o.f(hashMap3.keySet(), hashMap4.keySet()));
          if (!a.a || immutableSet.isEmpty()) {
             hashMap3.keySet().removeAll(immutableSet);
             iterator1 = hashMap3.keySet().iterator();
             while (iterator1.hasNext()) {
                str3 = iterator1.next();
                if (hashMap3.get(str3) == null) {
                   hashMap3.put(str3, str10);
                }
             }
             iterator1 = hashMap4.keySet().iterator();
             while (iterator1.hasNext()) {
                str3 = iterator1.next();
                if (hashMap4.get(str3) == null) {
                   hashMap4.put(str3, str10);
                }
             }
             if (str1.equalsIgnoreCase(request.method())) {
                hashMap3.putAll(hashMap4);
                hashMap4.clear();
             }
             str10 = "client_salt";
             str6 = hashMap3.remove(str10);
             if (TextUtils.isEmpty(str6)) {
                str6 = hashMap4.remove(str10);
             }
             if (hashMap3.isEmpty()) {
                httpUrl1 = httpUrl;
             }else {
                HttpUrl$Builder uBuilder5 = httpUrl.newBuilder();
                Iterator iterator5 = hashMap3.entrySet().iterator();
                while (iterator5.hasNext()) {
                   Map$Entry uEntry1 = iterator5.next();
                   if (httpUrl.queryParameter(uEntry1.getKey()) == null) {
                      uBuilder5.addQueryParameter(uEntry1.getKey(), uEntry1.getValue());
                   }else {
                      uBuilder5.setQueryParameter(uEntry1.getKey(), uEntry1.getValue());
                   }
                }
                httpUrl1 = uBuilder5.build();
             }
             Request$Builder uBuilder = request.newBuilder().url(httpUrl1);
             if (!b4) {
                RequestBody requestBody1 = requestBody;
                if (requestBody1 instanceof MultipartBody) {
                   MultipartBody$Builder uBuilder1 = new MultipartBody$Builder(requestBody1.boundary());
                   uBuilder1.setType(requestBody1.type());
                   iterator2 = new ArrayList(requestBody1.parts()).iterator();
                   while (iterator2.hasNext()) {
                      MultipartBody$Part part = iterator2.next();
                      Headers headers = part.headers();
                      uBuilder1.addPart(headers, part.body());
                   }
                   if (!hashMap4.isEmpty()) {
                      iterator2 = hashMap4.entrySet().iterator();
                      while (iterator2.hasNext()) {
                         uEntry = iterator2.next();
                         if (hashMap6 != null) {
                            hashMap7 = hashMap6;
                            if (hashMap7.containsKey(uEntry.getKey())) {
                            label_04c6 :
                               hashMap6 = hashMap7;
                            }
                         }else {
                            hashMap7 = hashMap6;
                         }
                         uBuilder1.addFormDataPart(uEntry.getKey(), uEntry.getValue());
                         goto label_04c6 ;
                      }
                   }
                   uBuilder.method(request.method(), uBuilder1.build());
                   a = this;
                }else {
                   a = this;
                   if (!a.a(request) && (requestBody1 == null || !requestBody1.contentLength() - false)) {
                      FormBody$Builder uBuilder3 = new FormBody$Builder();
                      if (requestBody1 instanceof FormBody) {
                         i1 = 0;
                         while (i1 < requestBody1.size()) {
                            str4 = requestBody1.name(i1);
                            str7 = requestBody1.value(i1);
                            if (hashMap4.containsKey(str4) && TextUtils.equals(str7, hashMap4.get(str4))) {
                               hashMap4.remove(str4);
                            }
                            if (!str10.equals(str4)) {
                               str11 = str9;
                               if (!str11.equals(str4)) {
                                  str1 = str8;
                                  if (!str1.equals(str4)) {
                                  label_056a :
                                     uBuilder3.add(str4, str7);
                                  }
                               }else {
                                  str1 = str8;
                               }
                               if (i) {
                               }
                            }else {
                               str1 = str8;
                               str11 = str9;
                            }
                            i1 = i1 + 1;
                            str9 = str11;
                            str8 = str1;
                         }
                      }
                      Iterator iterator4 = hashMap4.entrySet().iterator();
                      while (iterator4.hasNext()) {
                         uEntry = iterator4.next();
                         key = uEntry.getKey();
                         uBuilder3.add(key, uEntry.getValue());
                      }
                      uBuilder.method(request.method(), uBuilder3.build());
                   }else {
                      HttpUrl$Builder uBuilder4 = httpUrl.newBuilder();
                      iterator2 = hashMap3.keySet().iterator();
                      while (iterator2.hasNext()) {
                         key = iterator2.next();
                         uBuilder4.setQueryParameter(key, hashMap3.get(key));
                      }
                      uBuilder.method(request.method(), requestBody1);
                      uBuilder.url(uBuilder4.build());
                   }
                }
             }else {
                a = this;
                uBuilder.method(request.method(), request.body());
             }
             Request request1 = uBuilder.build();
             k ok = e.h().g().H();
             Set set1 = (ok != null)? ok.a(request1.newBuilder().build(), str6): null;
             httpUrl = request1.url();
             HttpUrl$Builder uBuilder2 = request1.url().newBuilder();
             if (set1 != null && !set1.isEmpty()) {
                Iterator iterator3 = set1.iterator();
                while (iterator3.hasNext()) {
                   j oj = iterator3.next();
                   if (httpUrl.queryParameter(oj.a()) == null) {
                      uBuilder2.addQueryParameter(oj.a(), oj.b());
                   }else {
                      uBuilder2.setQueryParameter(oj.a(), oj.b());
                   }
                }
             }
             return a.b(p0, request, d.b(d.b(request1.newBuilder().url(uBuilder2.build()).build(), "origin_method", request.method()), "origin_params", hashMap5), b2, a.c, CommonParamsCompareManager$Type.REQUEST_PARAMS);
          }else {
             throw new RuntimeException("urlParams和bodyParams有重复字段 （"+TextUtils.join(",", immutableSet)+"），请务必移除，否则server验签可能失败");
          }
       }
    }
}
