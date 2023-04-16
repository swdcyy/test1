package com.kwai.middleware.leia.interceptor.SignatureInterceptor;
import okhttp3.Interceptor;
import com.kwai.middleware.leia.interceptor.SignatureInterceptor$a;
import nsd.u;
import ua7.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.HttpUrl;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.MultipartBody;
import java.util.List;
import okhttp3.MultipartBody$Part;
import okhttp3.Headers;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import okio.b;
import okio.c;
import zsd.d;
import java.nio.charset.Charset;
import qrd.l1;
import java.io.Closeable;
import java.lang.Throwable;
import isd.b;
import zsd.u;
import okhttp3.HttpUrl$Builder;
import okhttp3.FormBody$Builder;
import java.util.Map$Entry;
import okhttp3.MultipartBody$Builder;
import okhttp3.Request$Builder;

public final class SignatureInterceptor implements Interceptor	// class@000f31
{
    public final c a;
    public static final SignatureInterceptor$a b;

    static {
       SignatureInterceptor.b = new SignatureInterceptor$a(null);
    }
    public void SignatureInterceptor(c p0){
       a.q(p0, "paramProcessor");
       super();
       this.a = p0;
    }
    public Response intercept(Interceptor$Chain p0){
       String str1;
       String str2;
       Iterator iterator1;
       Map$Entry uEntry;
       int i2;
       Map$Entry uEntry1;
       int i3;
       Response obj = p0;
       a.q(obj, "chain");
       Request request = p0.request();
       RequestBody requestBody = request.body();
       HttpUrl httpUrl = request.url();
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Set set = httpUrl.queryParameterNames();
       a.h(set, "originUrl.queryParameterNames\(\)");
       Iterator iterator = set.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          a.h(str, "it");
          str1 = httpUrl.queryParameter(str);
          if (str1 == null) {
             str1 = "";
          }
          linkedHashMa.put(str, str1);
       }
       boolean b = false;
       boolean b1 = true;
       if (requestBody instanceof FormBody) {
          int i = requestBody.size();
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             str2 = requestBody.name(i1);
             a.h(str2, "body.name\(i\)");
             String str3 = requestBody.value(i1);
             a.h(str3, "body.value\(i\)");
             linkedHashMa.put(str2, str3);
          }
       }else if(requestBody instanceof MultipartBody){
          Iterator iterator3 = requestBody.parts().iterator();
          while (iterator3.hasNext()) {
             MultipartBody$Part part = iterator3.next();
             Headers headers = part.headers();
             if (headers == null || headers.size() <= 0) {
                continue ;
             }else {
                str1 = headers.get("Content-Disposition");
                if (str1 != null) {
                   a.h(str1, "headers[MULTIPART_CONTENT_DISPOSITION] ?: break");
                   i3 = (!str1.length())? 1: 0;
                   if (i3 || StringsKt__StringsKt.O2(str1, "filename", b, 2, null)) {
                      continue ;
                   }else {
                      i3 = StringsKt__StringsKt.i3(str1, "name=\"", 0, false, 6, null);
                      if (i3 < 0) {
                         continue ;
                      }
                   }
                }
             }
             i3 = i3 + 6;
             i2 = str1.length() - b1;
             str1 = str1.substring(i3, i2);
             a.h(str1, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
             b uob = new b();
             byte[] uobyteArray = new byte[(int)part.body().contentLength()];
             part.body().writeTo(uob);
             uob.readFully(uobyteArray);
             linkedHashMa.put(str1, new String(uobyteArray, d.a));
             b.a(uob, null);
          }
       }
       a.h(request, "originRequest");
       Map map = this.a.h(request, linkedHashMa);
       if (u.I1(request.method(), "post", b1)) {
          RequestBody requestBody1 = request.body();
          HttpUrl$Builder uBuilder = request.url().newBuilder();
          if (requestBody1 == null) {
             FormBody$Builder uBuilder1 = new FormBody$Builder();
             iterator1 = map.entrySet().iterator();
             while (iterator1.hasNext()) {
                uEntry = iterator1.next();
                str2 = uEntry.getKey();
                uBuilder1.add(str2, uEntry.getValue());
             }
             requestBody1 = uBuilder1.build();
          }else if(requestBody1 instanceof FormBody){
             FormBody$Builder uBuilder3 = new FormBody$Builder();
             i2 = requestBody1.size();
             for (; b < i2; b = b + 1) {
                uBuilder3.add(requestBody1.name(b), requestBody1.value(b));
             }
             iterator1 = map.entrySet().iterator();
             while (iterator1.hasNext()) {
                uEntry1 = iterator1.next();
                String key = uEntry1.getKey();
                uBuilder3.add(key, uEntry1.getValue());
             }
             requestBody1 = uBuilder3.build();
          }else if(requestBody1 instanceof MultipartBody){
             MultipartBody$Builder uBuilder4 = new MultipartBody$Builder();
             List list = requestBody1.parts();
             a.h(list, "originBody.parts\(\)");
             Iterator iterator2 = list.iterator();
             while (iterator2.hasNext()) {
                uBuilder4.addPart(iterator2.next());
             }
             iterator1 = map.entrySet().iterator();
             while (iterator1.hasNext()) {
                uEntry1 = iterator1.next();
                str2 = uEntry1.getKey();
                uBuilder4.addFormDataPart(str2, uEntry1.getValue());
             }
             requestBody1 = uBuilder4.build();
          }else {
             iterator1 = map.entrySet().iterator();
             while (iterator1.hasNext()) {
                uEntry = iterator1.next();
                str2 = uEntry.getKey();
                uBuilder.removeAllQueryParameters(str2);
                uBuilder.addQueryParameter(str2, uEntry.getValue());
             }
          }
          Request$Builder uBuilder2 = request.newBuilder();
          uBuilder2.method(request.method(), requestBody1);
          uBuilder2.url(uBuilder.build());
          request = uBuilder2.build();
          a.h(request, "newRequestBuilder.build\(\)");
       }else {
          HttpUrl$Builder uBuilder5 = request.url().newBuilder();
          iterator1 = map.entrySet().iterator();
          while (iterator1.hasNext()) {
             uEntry = iterator1.next();
             str1 = uEntry.getKey();
             uBuilder5.removeAllQueryParameters(str1);
             uBuilder5.addQueryParameter(str1, uEntry.getValue());
          }
          Request$Builder uBuilder6 = request.newBuilder();
          uBuilder6.url(uBuilder5.build());
          request = uBuilder6.build();
          a.h(request, "newRequestBuilder.build\(\)");
       }
       obj = obj.proceed(request);
       a.h(obj, "chain.proceed\(newRequest\)");
       return obj;
    }
}
