package com.android.kwai.foundation.network.core.intercaptors.LogInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import com.android.kwai.foundation.network.core.utils.NetLog;
import java.lang.String;
import okhttp3.Request;
import okhttp3.Request$Builder;
import okhttp3.RequestBody;
import okio.b;
import okio.c;
import java.lang.StringBuilder;
import java.io.IOException;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import okhttp3.FormBody;
import java.lang.System;
import java.lang.StringBuffer;
import java.util.Locale;
import okhttp3.HttpUrl;
import okhttp3.Headers;
import java.lang.reflect.Field;
import java.lang.Class;
import java.util.List;
import com.google.gson.JsonObject;
import java.net.URLDecoder;
import okhttp3.MediaType;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import okhttp3.ResponseBody;
import okhttp3.Response$Builder;
import java.nio.charset.Charset;

public class LogInterceptor implements Interceptor	// class@000ef0
{
    public String mTag;

    public void LogInterceptor(){
       super();
       this.mTag = "RpcNet";
       NetLog.isDebug = true;
    }
    public void LogInterceptor(boolean p0){
       super();
       this.mTag = "RpcNet";
       NetLog.isDebug = p0;
    }
    public void LogInterceptor(boolean p0,String p1){
       super();
       this.mTag = "RpcNet";
       NetLog.isDebug = p0;
       this.mTag = p1;
    }
    public static String stringifyRequestBody(Request p0){
       try{
          p0 = p0.newBuilder().build();
          if (p0 == null) {
             return "copy request is null";
          }
          RequestBody requestBody = p0.body();
          if (requestBody == null) {
             return "request body is null";
          }
          b uob = new b();
          requestBody.writeTo(uob);
          return uob.readUtf8();
       }catch(java.io.IOException e2){
          return "stringfy request has error:"+e2.getMessage();
       }
    }
    public Response intercept(Interceptor$Chain p0){
       Response response;
       StringBuffer str1;
       ResponseBody responseBody;
       MediaType mediaType;
       LogInterceptor logIntercept = this;
       FormBody uFormBody = FormBody.class;
       long l = System.currentTimeMillis();
       Request request = p0.request();
       Object[] objArray = new Object[]{request.url(),request.headers()};
       StringBuffer str = String.format(Locale.ENGLISH, "<====  Request for %s %n%s", objArray);
       if (!(request.method()).equalsIgnoreCase("get") && !(request.method()).equalsIgnoreCase("head")) {
          RequestBody requestBody = request.body();
          if (requestBody instanceof FormBody) {
             try{
                Field declaredFiel = uFormBody.getDeclaredField("encodedNames");
                Field declaredFiel1 = uFormBody.getDeclaredField("encodedValues");
                declaredFiel.setAccessible(1);
                declaredFiel1.setAccessible(1);
                List list = declaredFiel.get(requestBody);
                List list1 = declaredFiel1.get(requestBody);
                JsonObject jsonObject = new JsonObject();
                int i = 0;
                while (i < list.size() && i < list1.size()) {
                   jsonObject.c0(URLDecoder.decode(list.get(i)), URLDecoder.decode(list1.get(i)));
                   i = i + 1;
                   Request request1 = 2;
                }
                str = str+"Request ContentType: "+requestBody.contentType()+System.getProperty("line.separator")+"Request Body: "+new Gson().p(jsonObject);
             }catch(java.lang.Exception e0){
             }
             if ((mediaType.subtype()).equalsIgnoreCase("plain")) {
                byte[] uobyteArray = responseBody.bytes();
                response = response.newBuilder().body(ResponseBody.create(mediaType, uobyteArray)).build();
                str1 = str1+new String(uobyteArray, mediaType.charset(Charset.forName("UTF-8")));
             }else {
                str1 = str1+"Response body not support to print. The media type is \("+mediaType.subtype()+"\) response code is \("+response.code()+"\) byte count is "+response.header("Content-Length");
             }
          }else {
             MediaType mediaType1 = requestBody.contentType();
             str = str+"Request ContentType: "+requestBody.contentType()+System.getProperty("line.separator");
             str = (mediaType1 != null && (mediaType1.type()).equals("multipart"))? str+"Request Body: we not support multipart body": str+"Request Body: "+LogInterceptor.stringifyRequestBody(request);
          }
       }
       NetLog.i(e0.mTag, str);
       response = p0.proceed(p0.request());
       try{
          Object[] objArray1 = new Object[]{response.request().url(),((float)(System.currentTimeMillis() - l) / 1000.00f)+"",response.headers()};
          str1 = String.format(Locale.ENGLISH, "====>  Response for %s in %s s %n%s", objArray1)+System.getProperty("line.separator");
          responseBody = response.body();
          mediaType = responseBody.contentType();
          if ((mediaType.subtype()).equalsIgnoreCase("json") || (mediaType.subtype()).equalsIgnoreCase("plain")) {
             goto label_01ca ;
          }else {
             goto label_0197 ;
          }
          NetLog.i(e0.mTag, str1);
          return response;
       }catch(java.lang.Exception e0){
       }
    }
}
