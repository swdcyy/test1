package com.kwai.framework.network.etag.ETagInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import fg6.a;
import com.kwai.framework.network.etag.ETagInterceptor$a;
import java.lang.reflect.Type;
import el.a;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.net.URL;
import ekd.a0;
import com.kwai.framework.network.etag.KsETagPolicy;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import com.kwai.framework.network.etag.ETagResult;
import okhttp3.Request$Builder;
import okhttp3.HttpUrl$Builder;
import okhttp3.ResponseBody;
import okhttp3.MediaType;
import java.lang.Boolean;
import okhttp3.MediaTypes;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.google.gson.Gson;
import njd.a;
import okhttp3.Response$Builder;
import java.lang.System;
import java.util.concurrent.TimeUnit;

public class ETagInterceptor implements Interceptor	// class@000c06
{
    public final Gson a;
    public final Type b;

    public void ETagInterceptor(){
       super();
       this.a = a.a;
       this.b = new ETagInterceptor$a(this).getType();
    }
    public Response intercept(Interceptor$Chain p0){
       ETagResult uETagResult;
       boolean b;
       a uoa;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ETagInterceptor uETagInterce = ETagInterceptor.class;
       Request obj = PatchProxy.applyOneRefs(p0, this, uETagInterce, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = p0.request();
       String str = a0.c(obj.url().url().getPath());
       int i = 0x5f2ddeb4;
       int i1 = 0;
       if (obj.tag(KsETagPolicy.class) != KsETagPolicy.Disable) {
          uETagResult = PatchProxy.applyOneRefs(str, this, uETagInterce, "2");
          if (uETagResult == patchProxyRe) {
             uETagResult = b.a(i).g(str, ETagResult.class);
          }
       }else {
          uETagResult = i1;
       }
       b = false;
       int i2 = 1;
       int i3 = (uETagResult != null && uETagResult.isValid())? 1: 0;
       if (i3) {
          obj = obj.newBuilder().url(obj.url().newBuilder().addQueryParameter("__NS_ksETag", uETagResult.eTag()).build()).build();
       }
       Response response = p0.proceed(obj);
       if (!response.isSuccessful()) {
          return response;
       }else {
          ResponseBody responseBody = response.body();
          if (responseBody != null) {
             MediaType mediaType = responseBody.contentType();
             Object obj1 = PatchProxy.applyOneRefs(mediaType, this, uETagInterce, "4");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else if(mediaType == null){
                MediaType jSON_UTF_8 = MediaTypes.JSON_UTF_8;
                if ((jSON_UTF_8.type()).equals(mediaType.type()) && (jSON_UTF_8.subtype()).equals(mediaType.subtype())) {
                   b = true;
                }
             }
             if (b) {
                String str1 = "X-KsETag";
                if (!(TextUtils.x(response.header(str1)) ^ i2) && !i3) {
                   return response;
                }else {
                   String str2 = responseBody.string();
                   try{
                      uoa = this.a.i(str2, this.b);
                   }catch(java.lang.Exception e0){
                   }
                   if (uoa == null) {
                      return response.newBuilder().body(ResponseBody.create(responseBody.contentType(), str2)).build();
                   }else if(uoa.b() == i2){
                      str1 = response.header(e0);
                      if (!TextUtils.x(str1) && !TextUtils.x(str2)) {
                         ETagResult uETagResult1 = ETagResult.create(str1, str2);
                         if (!PatchProxy.applyVoidTwoRefs(str, uETagResult1, this, uETagInterce, "3")) {
                            b.a(i).c(str, uETagResult1, ETagResult.class, (System.currentTimeMillis() + TimeUnit.DAYS.toMillis(90)));
                         }
                      }
                   }else if(uoa.b() == 0x22ab0 && i3){
                      return response.newBuilder().body(ResponseBody.create(responseBody.contentType(), uETagResult.entity())).header("FROM_E_TAG_CACHE", String.valueOf(i2)).header("SERVER_TIMESTAMP", String.valueOf(uoa.k())).build();
                   }
                   response = response.newBuilder().body(ResponseBody.create(responseBody.contentType(), str2)).build();
                }
             }
          }
          return response;
       }
    }
}
