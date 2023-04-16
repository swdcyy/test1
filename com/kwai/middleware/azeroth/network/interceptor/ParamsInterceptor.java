package com.kwai.middleware.azeroth.network.interceptor.ParamsInterceptor;
import okhttp3.Interceptor;
import x97.d;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.util.Set;
import java.util.HashMap;
import java.lang.String;
import java.util.Iterator;
import okhttp3.RequestBody;
import okhttp3.FormBody;
import okhttp3.MultipartBody;
import okhttp3.MultipartBody$Part;
import okhttp3.Headers;
import java.lang.CharSequence;
import yb7.o;
import okio.b;
import okio.c;
import ca7.d;
import java.nio.charset.Charset;
import java.io.Closeable;
import ca7.e;
import java.util.Map;
import c97.d;
import h97.i;
import x97.n;
import java.net.URL;
import okhttp3.HttpUrl$Builder;
import java.util.Map$Entry;
import okhttp3.Request$Builder;
import okhttp3.MultipartBody$Builder;
import okhttp3.MediaType;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import okhttp3.FormBody$Builder;
import x97.o;

public class ParamsInterceptor implements Interceptor	// class@000d60
{
    public final d a;

    public void ParamsInterceptor(d p0){
       super();
       this.a = p0;
    }
    public Response intercept(Interceptor$Chain p0){
       Iterator iterator;
       String str3;
       HttpUrl httpUrl1;
       Iterator iterator3;
       Map$Entry uEntry;
       int i;
       int i1;
       int i2;
       String str5;
       MultipartBody multipartBod1;
       int i4;
       ParamsInterceptor paramsInterc = this;
       Request request = p0.request();
       HttpUrl httpUrl = request.url();
       Set set = httpUrl.queryParameterNames();
       HashMap hashMap = new HashMap();
       HashMap hashMap1 = new HashMap();
       String str = "GET";
       boolean b = str.equalsIgnoreCase(request.method());
       Map map = null;
       if (b) {
          if (set != null && !set.isEmpty()) {
             iterator = set.iterator();
             while (iterator.hasNext()) {
                String str1 = iterator.next();
                hashMap.put(str1, httpUrl.queryParameter(str1));
             }
          }
       }else if(request.body() != null){
          if (request.body() instanceof FormBody) {
             FormBody uFormBody = request.body();
             i1 = uFormBody.size();
             i2 = 0;
             while (i2 < i1) {
                if (!hashMap.containsKey(uFormBody.name(i2))) {
                   hashMap.put(uFormBody.name(i2), uFormBody.value(i2));
                }
                i2 = i2 + 1;
             }
          }else if(request.body() instanceof MultipartBody){
             map = new HashMap();
             if (request.body() instanceof MultipartBody) {
                MultipartBody multipartBod = request.body();
                i1 = multipartBod.size();
                for (i2 = 0; i2 < i1; i1 = i4) {
                   MultipartBody$Part part1 = multipartBod.part(i2);
                   if (part1.headers() != null) {
                      String str6 = part1.headers().get("Content-Disposition");
                      if (!o.c(str6) && !str6.contains("; filename=")) {
                         int i3 = str6.indexOf("form-data; name=\"");
                         if (i3 >= 0) {
                            i3 = i3 + 17;
                            i = str6.length() - 1;
                            str5 = str6.substring(i3, i);
                            b uob = new b();
                            multipartBod1 = multipartBod;
                            i4 = i1;
                            byte[] uobyteArray = new byte[(int)part1.body().contentLength()];
                            part1.body().writeTo(uob);
                            uob.readFully(uobyteArray);
                            map.put(str5, new String(uobyteArray, d.c));
                            e.a(uob);
                         label_0103 :
                            i2 = i2 + 1;
                            multipartBod = multipartBod1;
                         }
                      }
                   }
                   multipartBod1 = multipartBod;
                   i4 = i1;
                   goto label_0103 ;
                }
             }
             hashMap.putAll(map);
          }
       }
       if (set != null && !set.isEmpty()) {
          iterator = set.iterator();
          while (iterator.hasNext()) {
             str5 = iterator.next();
             hashMap1.put(str5, httpUrl.queryParameter(str5));
          }
       }
       HashMap hashMap2 = new HashMap(hashMap);
       Map map1 = paramsInterc.a.b();
       map1.putAll(hashMap1);
       Map map2 = paramsInterc.a.e();
       if (b) {
          map1.putAll(hashMap);
       }else {
          map2.putAll(hashMap);
       }
       String str2 = "";
       Iterator iterator1 = map1.keySet().iterator();
       while (iterator1.hasNext()) {
          str3 = iterator1.next();
          if (map1.get(str3) == null) {
             map1.put(str3, str2);
          }
       }
       if (map2 != null) {
          iterator1 = map2.keySet().iterator();
          while (iterator1.hasNext()) {
             str3 = iterator1.next();
             if (map2.get(str3) == null) {
                map2.put(str3, str2);
             }
          }
       }
       d.a().e().b().f(httpUrl.url().getPath(), map1);
       paramsInterc.a.c(request, map1, map2);
       if (str.equalsIgnoreCase(request.method())) {
          map1.putAll(map2);
          map2.clear();
       }
       if (map1.isEmpty()) {
          httpUrl1 = httpUrl;
       }else {
          HttpUrl$Builder uBuilder4 = httpUrl.newBuilder();
          Iterator iterator4 = map1.entrySet().iterator();
          while (iterator4.hasNext()) {
             Map$Entry uEntry1 = iterator4.next();
             if (httpUrl.queryParameter(uEntry1.getKey()) == null) {
                uBuilder4.addQueryParameter(uEntry1.getKey(), uEntry1.getValue());
             }else {
                uBuilder4.setQueryParameter(uEntry1.getKey(), uEntry1.getValue());
             }
          }
          httpUrl1 = uBuilder4.build();
       }
       Headers headers = request.headers();
       Request$Builder uBuilder = new Request$Builder().url(httpUrl1).tag(request.tag());
       if (headers != null && headers.size() > 0) {
          iterator1 = headers.names().iterator();
          while (iterator1.hasNext()) {
             str3 = iterator1.next();
             uBuilder.addHeader(str3, headers.get(str3));
          }
       }
       if (!b) {
          RequestBody requestBody = request.body();
          if (requestBody instanceof MultipartBody) {
             MultipartBody$Builder uBuilder1 = new MultipartBody$Builder(requestBody.boundary());
             uBuilder1.setType(requestBody.type());
             Iterator iterator2 = new ArrayList(requestBody.parts()).iterator();
             while (iterator2.hasNext()) {
                MultipartBody$Part part = iterator2.next();
                Headers headers1 = part.headers();
                uBuilder1.addPart(headers1, part.body());
             }
             if (!map2.isEmpty()) {
                iterator3 = map2.entrySet().iterator();
                while (iterator3.hasNext()) {
                   uEntry = iterator3.next();
                   if (map != null && map.containsKey(uEntry.getKey())) {
                      continue ;
                   }
                   uBuilder1.addFormDataPart(uEntry.getKey(), uEntry.getValue());
                }
             }
             uBuilder.method(request.method(), uBuilder1.build());
          }else {
             v7 = requestBody instanceof FormBody;
             if (!headers && (requestBody == null || !requestBody.contentLength())) {
                FormBody$Builder uBuilder2 = new FormBody$Builder();
                if (headers) {
                   for (i = 0; i < requestBody.size(); i = i + 1) {
                      str = requestBody.name(i);
                      String str4 = requestBody.value(i);
                      if (map2.containsKey(str) && o.b(str4, map2.get(str))) {
                         map2.remove(str);
                      }
                      uBuilder2.add(o.a(str), o.a(str4));
                   }
                }
                iterator3 = map2.entrySet().iterator();
                while (iterator3.hasNext()) {
                   uEntry = iterator3.next();
                   uBuilder2.add(o.a(uEntry.getKey()), o.a(uEntry.getValue()));
                }
                uBuilder.method(request.method(), uBuilder2.build());
             }else {
                HttpUrl$Builder uBuilder3 = httpUrl.newBuilder();
                iterator3 = map1.keySet().iterator();
                while (iterator3.hasNext()) {
                   str = iterator3.next();
                   uBuilder3.setQueryParameter(str, map1.get(str));
                }
                uBuilder.method(request.method(), requestBody);
                uBuilder.url(uBuilder3.build());
             }
          }
       }else {
          uBuilder.method(request.method(), request.body());
       }
       return p0.proceed(o.a(o.a(uBuilder.build(), "origin_method", request.method()), "origin_params", hashMap2));
    }
}
