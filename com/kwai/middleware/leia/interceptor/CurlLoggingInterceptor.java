package com.kwai.middleware.leia.interceptor.CurlLoggingInterceptor;
import okhttp3.Interceptor;
import va7.a;
import java.lang.Object;
import okhttp3.Headers;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Throwable;
import va7.a$a;
import okhttp3.Request;
import kotlin.jvm.internal.a;
import zsd.u;
import okhttp3.RequestBody;
import okio.b;
import okio.c;
import zsd.d;
import okhttp3.MediaType;
import java.nio.charset.Charset;
import okhttp3.HttpUrl;
import okhttp3.Connection;
import okhttp3.Protocol;
import okhttp3.Response;
import java.util.concurrent.TimeUnit;
import java.lang.System;
import okhttp3.ResponseBody;
import java.lang.CharSequence;
import okio.d;
import okhttp3.Interceptor$Chain;
import okhttp3.Response$Builder;

public final class CurlLoggingInterceptor implements Interceptor	// class@000f28
{
    public String a;
    public final a b;

    public void CurlLoggingInterceptor(){
       super(null);
    }
    public void CurlLoggingInterceptor(a p0){
       super();
       this.b = p0;
    }
    public final void a(Headers p0,int p1){
       String str = p0.value(p1);
       CurlLoggingInterceptor tb = this.b;
       if (tb != null) {
          a$a.a(tb, p0.name(p1)+": "+str, null, 2, null);
       }
       return;
    }
    public final void b(Request p0){
       String str2;
       Charset a;
       String str = "curl";
       String str1 = " ";
       if (this.a != null) {
          str = str+str1+this.a;
       }
       str = str+" -X "+p0.method();
       Headers headers = p0.headers();
       int i = headers.size();
       int i1 = 0;
       int i3 = 0;
       for (int i2 = 0; i2 < i; i2 = i2 + 1) {
          str2 = headers.name(i2);
          String str3 = headers.value(i2);
          int i4 = 1;
          int i5 = str3.length() - i4;
          String str4 = 34;
          if (str3.charAt(i1) == str4 && str3.charAt(i5) == str4) {
             str4 = "\\\"";
             a.h(str3, "value");
             str3 = str3.substring(i4, i5);
             a.h(str3, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
             str3 = str4+str3+str4;
          }
          if (u.I1("Accept-Encoding", str2, i4) && u.I1("gzip", str3, i4)) {
             i3 = 1;
          }
          String str5 = "\"";
          str = str+" -H "+str5+str2+": "+str3+str5;
       }
       RequestBody requestBody = p0.body();
       if (requestBody != null) {
          b uob = new b();
          requestBody.writeTo(uob);
          a = d.a;
          MediaType mediaType = requestBody.contentType();
          if (mediaType != null) {
             Charset uCharset = mediaType.charset(a);
             if (uCharset != null) {
                a = uCharset;
             }
          }
          String str6 = (mediaType != null)? mediaType.type(): null;
          if (a.g(str6, "text")) {
             str2 = uob.readString(a);
             a.h(str2, "buffer.readString\(charset\)");
             str = str+" --data $\'"+u.g2(str2, "\n", "\\n", false, 4, null)+"\'";
          }
       }
       if (i3) {
          str1 = " --compressed ";
       }
       str = str+str1+p0.url();
       CurlLoggingInterceptor tb = this.b;
       if (tb != null) {
          a$a.a(tb, "¨q--- cURL \("+p0.url()+"\)", null, 2, null);
       }
       CurlLoggingInterceptor tb1 = this.b;
       if (tb1 != null) {
          str = str;
          a.h(str, "curlCmdBuilder.toString\(\)");
          a$a.a(tb1, str, null, 2, null);
       }
       tb1 = this.b;
       if (tb1 != null) {
          a$a.a(tb1, "¨t--- \(copy and paste the above line to a terminal\)", null, 2, null);
       }
       return;
    }
    public final void c(Request p0,Connection p1){
       CurlLoggingInterceptor tb1;
       RequestBody requestBody = p0.body();
       int i = 0;
       boolean b = true;
       StringBuilder str = (requestBody != null)? 1: null;
       String str1 = "--> "+p0.method()+' '+p0.url();
       String str2 = (p1 != null)? " "+p1.protocol(): "";
       str2 = str1+str2;
       CurlLoggingInterceptor tb = this.b;
       if (tb != null) {
          a$a.a(tb, str2, null, 2, null);
       }
       if (str) {
          if (requestBody == null) {
             a.L();
          }
          if (requestBody.contentType() != null) {
             tb1 = this.b;
             if (tb1 != null) {
                a$a.a(tb1, "Content-Type: "+requestBody.contentType(), null, 2, null);
             }
          }
          if (requestBody.contentLength() - -1) {
             tb1 = this.b;
             if (tb1 != null) {
                a$a.a(tb1, "Content-Length: "+requestBody.contentLength(), null, 2, null);
             }
          }
          Headers headers = p0.headers();
          int i1 = headers.size();
          while (i < i1) {
             str1 = headers.name(i);
             if (!u.I1("Content-Type", str1, b) && !u.I1("Content-Length", str1, b)) {
                a.h(headers, "headers");
                this.a(headers, i);
             }
             i = i + 1;
          }
          tb1 = this.b;
          if (tb1 != null) {
             a$a.a(tb1, "", null, 2, null);
          }
          tb1 = this.b;
          if (tb1 != null) {
             a$a.a(tb1, requestBody.toString(), null, 2, null);
          }
          tb1 = this.b;
          if (tb1 != null) {
             a$a.a(tb1, "--> END "+p0.method()+" \("+requestBody.contentLength()+"-byte body\)", null, 2, null);
          }
       }
       return;
    }
    public final void d(Response p0,long p1){
       CurlLoggingInterceptor tb2;
       p1 = TimeUnit.NANOSECONDS.toMillis((System.nanoTime() - p1));
       ResponseBody responseBody = p0.body();
       if (responseBody != null) {
          a.h(responseBody, "response.body\(\) ?: return");
          long l = responseBody.contentLength();
          String str = (l - -1)? l+"-byte": "unknown-length";
          CurlLoggingInterceptor tb = this.b;
          int i = 0;
          if (tb != null) {
             StringBuilder str1 = "<-- "+p0.code();
             String str2 = p0.message();
             a.h(str2, "response.message\(\)");
             str2 = (!str2.length())? 1: null;
             str2 = (str2)? "": " "+p0.message();
             a$a.a(tb, str1+str2+' '+p0.request().url()+" \("+p1+"ms"+", "+str+" body"+')', null, 2, null);
          }
          Headers headers = p0.headers();
          int i1 = headers.size();
          for (; i < i1; i = i + 1) {
             a.h(headers, "headers");
             this.a(headers, i);
          }
          CurlLoggingInterceptor tb1 = this.b;
          if (tb1 != null) {
             a$a.a(tb1, "", null, 2, null);
          }
          d uod = responseBody.source();
          uod.request(Long.MAX_VALUE);
          b uob = uod.buffer();
          if (l - null) {
             tb2 = this.b;
             if (tb2 != null) {
                a$a.a(tb2, "", null, 2, null);
             }
             tb2 = this.b;
             if (tb2 != null) {
                String str3 = uob.c().readString(d.a);
                a.h(str3, "buffer.clone\(\).readString\(Charsets.UTF_8\)");
                a$a.a(tb2, str3, null, 2, null);
             }
          }
          tb2 = this.b;
          if (tb2 != null) {
             a$a.a(tb2, "<-- END HTTP \("+uob.p()+"-byte body\)", null, 2, null);
          }
       }
       return;
    }
    public Response intercept(Interceptor$Chain p0){
       a.q(p0, "chain");
       Request request = p0.request();
       a.h(request, "request");
       this.c(request, p0.connection());
       this.b(request);
       long l = System.nanoTime();
       try{
          Response response = p0.proceed(request);
          a.h(response, "chain.proceed\(request\)");
          this.d(response, l);
          response = response.newBuilder().build();
          a.h(response, "response.newBuilder\(\).build\(\)");
          return response;
       }catch(java.lang.Exception e5){
          CurlLoggingInterceptor tb = this.b;
          if (tb != null) {
             a$a.a(tb, "<-- HTTP FAILED: "+e5, null, 2, null);
          }
          throw e5;
       }
    }
}
