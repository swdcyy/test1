package com.kwai.middleware.leia.interceptor.ParamInterceptor;
import okhttp3.Interceptor;
import ua7.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.util.LinkedHashMap;
import java.util.Map;
import zsd.u;
import java.util.Set;
import java.util.Iterator;
import java.net.URL;
import okhttp3.Request$Builder;
import okhttp3.RequestBody;
import okhttp3.FormBody$Builder;
import java.util.Map$Entry;
import okhttp3.FormBody;
import okhttp3.MultipartBody;
import okhttp3.MultipartBody$Builder;
import java.util.List;
import java.lang.Iterable;
import okhttp3.MultipartBody$Part;
import okhttp3.Headers$Builder;
import okhttp3.Headers;
import okhttp3.HttpUrl$Builder;

public final class ParamInterceptor implements Interceptor	// class@000f2a
{
    public final c a;

    public void ParamInterceptor(c p0){
       a.q(p0, "paramProcessor");
       super();
       this.a = p0;
    }
    public Response intercept(Interceptor$Chain p0){
       String str1;
       Iterator iterator1;
       Map$Entry uEntry;
       FormBody$Builder uBuilder4;
       String key1;
       a.q(p0, "chain");
       Request request = p0.request();
       HttpUrl httpUrl = p0.request().url();
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       linkedHashMa.putAll(this.a.d());
       String str = "post";
       int b = true;
       if (!u.I1(request.method(), str, b)) {
          linkedHashMa.putAll(this.a.c());
       }
       Set set = httpUrl.queryParameterNames();
       if (set != null && !set.isEmpty()) {
          Iterator iterator = set.iterator();
          while (iterator.hasNext()) {
             str1 = iterator.next();
             linkedHashMa.put(str1, httpUrl.queryParameter(str1));
          }
       }
       URL uRL = request.url().url();
       a.h(uRL, "originRequest.url\(\).url\(\)");
       str1 = uRL.getPath();
       a.h(str1, "originRequest.url\(\).url\(\).path");
       this.a.g(str1, linkedHashMa);
       Request$Builder uBuilder = p0.request().newBuilder();
       str1 = request.method();
       a.h(request, "originRequest");
       RequestBody requestBody = request.body();
       Map map = this.a.c();
       if (u.I1(request.method(), str, b) && !map.isEmpty()) {
          if (requestBody == null) {
             uBuilder4 = new FormBody$Builder();
             iterator1 = map.entrySet().iterator();
             while (iterator1.hasNext()) {
                uEntry = iterator1.next();
                key1 = uEntry.getKey();
                uBuilder4.add(key1, uEntry.getValue());
             }
             requestBody = uBuilder4.build();
          }else if(requestBody instanceof FormBody){
             uBuilder4 = new FormBody$Builder();
             b = requestBody.size();
             for (int i = 0; i < b; i = i + 1) {
                uBuilder4.add(requestBody.name(i), requestBody.value(i));
             }
             iterator1 = map.entrySet().iterator();
             while (iterator1.hasNext()) {
                uEntry = iterator1.next();
                key1 = uEntry.getKey();
                uBuilder4.add(key1, uEntry.getValue());
             }
             requestBody = uBuilder4.build();
          }else if(requestBody instanceof MultipartBody){
             MultipartBody$Builder uBuilder5 = new MultipartBody$Builder();
             List list = requestBody.parts();
             a.h(list, "originBody.parts\(\)");
             iterator1 = list.iterator();
             while (iterator1.hasNext()) {
                uBuilder5.addPart(iterator1.next());
             }
             iterator1 = map.entrySet().iterator();
             while (iterator1.hasNext()) {
                uEntry = iterator1.next();
                key1 = uEntry.getKey();
                uBuilder5.addFormDataPart(key1, uEntry.getValue());
             }
             requestBody = uBuilder5.build();
          }
       }
       Request$Builder uBuilder1 = uBuilder.method(str1, requestBody);
       Headers$Builder uBuilder2 = new Headers$Builder();
       iterator1 = this.a.b().entrySet().iterator();
       while (iterator1.hasNext()) {
          uEntry = iterator1.next();
          str1 = uEntry.getKey();
          uBuilder2.add(str1, uEntry.getValue());
       }
       Headers headers = uBuilder2.build();
       a.h(headers, "builder.build\(\)");
       uBuilder1 = uBuilder1.headers(headers);
       a.h(httpUrl, "originUrl");
       if (!linkedHashMa.isEmpty()) {
          HttpUrl$Builder uBuilder3 = httpUrl.newBuilder();
          Iterator iterator2 = linkedHashMa.entrySet().iterator();
          while (iterator2.hasNext()) {
             Map$Entry uEntry1 = iterator2.next();
             String key = uEntry1.getKey();
             str = uEntry1.getValue();
             if (key == null) {
                continue ;
             }else if(httpUrl.queryParameter(key) == null){
                uBuilder3.addQueryParameter(key, str);
             }else {
                uBuilder3.setQueryParameter(key, str);
             }
          }
          httpUrl = uBuilder3.build();
       }
       Response response = p0.proceed(uBuilder1.url(httpUrl).build());
       a.h(response, "chain.proceed\(newRequest\)");
       return response;
    }
}
