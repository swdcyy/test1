package com.kwai.video.ksuploaderkit.network.HttpRequester;
import zk.d;
import com.google.gson.Gson;
import java.lang.Object;
import retrofit2.a;
import java.lang.Class;
import com.kwai.video.ksuploaderkit.network.HttpRequester$ICallback;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.ksuploaderkit.network.HttpRequestInfo;
import java.lang.System;
import com.kwai.video.ksuploaderkit.network.HttpRequester$1;
import byd.a;
import com.kwai.video.ksuploaderkit.KSUploaderKitLog;
import retrofit2.p;
import java.lang.Exception;
import com.kwai.video.ksuploaderkit.network.NetworkUtils$NetErrorCode;
import java.lang.StringBuilder;
import com.kwai.video.ksuploaderkit.apicenter.IApiService;
import retrofit2.q$b;
import okhttp3.OkHttpClient;
import retrofit2.q;
import c97.d;
import h97.d;
import com.kwai.video.ksuploaderkit.config.PublishConfig;
import java.lang.reflect.Type;
import com.kwai.video.ksuploaderkit.config.PublishConfig$HTTPConfig;
import okhttp3.OkHttpClient$Builder;
import java.util.concurrent.TimeUnit;
import com.kwai.video.ksuploaderkit.network.interceptor.RetryInterceptor;
import okhttp3.Interceptor;
import com.kwai.video.ksuploaderkit.apicenter.ServerAddress;
import javax.net.ssl.SSLSocketFactory;
import com.kwai.video.ksuploaderkit.utils.SSLSocketFactoryUtils;
import okhttp3.ResponseBody;

public class HttpRequester	// class@0009b2
{
    public static Gson gson;

    static {
       HttpRequester.gson = new d().b();
    }
    public void HttpRequester(){
       super();
    }
    public Object doRequestAsync(a p0,Class p1,HttpRequester$ICallback p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, HttpRequester.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       HttpRequester$1 u1 = new HttpRequester$1(this, new HttpRequestInfo(), System.currentTimeMillis(), p1, p2);
       p0.h4(obj);
       return null;
    }
    public Object doRequestSync(a p0,Class p1,HttpRequestInfo p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, HttpRequester.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p2 == null) {
          KSUploaderKitLog.e("KSUploaderKit-NetRequester", "input param error, httpRequestInfo should not null");
          return null;
       }else {
          long l = System.currentTimeMillis();
          try{
             p2.setTimeCost((System.currentTimeMillis() - l));
             return this.parseResponse(p0.execute(), p1, p2);
          }catch(java.lang.Exception e7){
             p2.setMessage(e7.toString());
             p2.setNetErrorCode(NetworkUtils$NetErrorCode.CONNECT_SERVER_FAILED);
             KSUploaderKitLog.e(v1, "connect server failed : "+e7);
             return obj;
          }
       }
    }
    public IApiService getApiService(String p0){
       q$b obj = PatchProxy.applyOneRefs(p0, this, HttpRequester.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new q$b();
       obj.c(p0);
       obj.e(this.getOKHttpClient());
       q oq = obj.d();
       return oq.a(IApiService.class);
    }
    public final OkHttpClient getOKHttpClient(){
       TimeUnit obj = PatchProxy.apply(null, this, HttpRequester.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0x4e20;
       PublishConfig publishConfi = d.a().c().a("ksuploaderkit", PublishConfig.class);
       if (publishConfi != null) {
          PublishConfig$HTTPConfig hTTPConfig = publishConfi.getHTTPConfig();
          if (hTTPConfig != null) {
             hTTPConfig = hTTPConfig.timeoutMS;
             if (hTTPConfig > null) {
                i = hTTPConfig;
             }
          }
       }
       long l = (long)i;
       obj = TimeUnit.MILLISECONDS;
       OkHttpClient$Builder uBuilder = new OkHttpClient$Builder().connectTimeout(l, obj).readTimeout(l, obj).writeTimeout(l, obj).addInterceptor(new RetryInterceptor());
       try{
          if (ServerAddress.getUseSSLCertCheck()) {
             uBuilder.sslSocketFactory(SSLSocketFactoryUtils.getStandardSocketFactory());
          }else {
             uBuilder.sslSocketFactory(SSLSocketFactoryUtils.getIgnoreAllSocketFactory());
          }
          return e0.build();
       }catch(java.lang.Exception e0){
       }
    }
    public Object parseResponse(p p0,Class p1,HttpRequestInfo p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, HttpRequester.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          int i = p0.b();
          p2.setHttpCode(i);
          KSUploaderKitLog.e("KSUploaderKit-NetRequester", "response http code is : "+i);
          if (i < 200 || i >= 300) {
             NetworkUtils$NetErrorCode netErrorCode = 400;
             if (i >= 300 && i < netErrorCode) {
                p2.setNetErrorCode(NetworkUtils$NetErrorCode.HTTP_CODE_3XX);
             }else if(i >= netErrorCode && i < 500){
                p2.setNetErrorCode(NetworkUtils$NetErrorCode.HTTP_CODE_4XX);
             }else if(i >= 500 && i < 600){
                p2.setNetErrorCode(NetworkUtils$NetErrorCode.HTTP_CODE_5XX);
             }else {
                p2.setNetErrorCode(NetworkUtils$NetErrorCode.NOT2XX_HTTP_CODE);
             }
             p2.setHttpCode(i);
             if (p0.f() != null) {
                p2.setMessage(p0.f());
             }
             if (p0.a() != null) {
                p2.setResponseBody(p0.a().toString());
             }
          }else {
             String str = p0.a().string();
             p2.setResponseBody(str);
             KSUploaderKitLog.e("KSUploaderKit-NetRequester", "response body is : "+str);
             return HttpRequester.gson.h(str, p1);
          }
       }catch(java.lang.Exception e8){
          p2.setMessage(e8.toString());
          p2.setNetErrorCode(NetworkUtils$NetErrorCode.RESPONSE_ERROR);
          KSUploaderKitLog.e("KSUploaderKit-NetRequester", "parse response body info exception : "+e8);
       }
       return null;
    }
}
