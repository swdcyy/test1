package com.kuaishou.aegon.okhttp.CronetInterceptor;
import okhttp3.Interceptor;
import java.lang.String;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import com.kuaishou.aegon.okhttp.CronetInterceptorConfig;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.lang.Boolean;
import com.kuaishou.aegon.okhttp.impl.c;
import go.b;
import okhttp3.RequestBody;
import okhttp3.internal.http.UnrepeatableRequestBody;
import aegon.chrome.net.NetworkException;
import java.lang.StringBuilder;
import bo.t;
import okhttp3.Request$Builder;
import okhttp3.Headers;
import okhttp3.Headers$Builder;

public class CronetInterceptor implements Interceptor	// class@0005e8
{
    public b a;
    public String b;

    public void CronetInterceptor(){
       super("");
    }
    public void CronetInterceptor(String p0){
       super();
       this.b = "";
       this.b = p0;
    }
    public Response intercept(Interceptor$Chain p0){
       Request request;
       CronetInterceptor a;
       c uoc;
       CronetInterceptor uCronetInter2;
       boolean b5;
       boolean b6;
       Response response;
       int i;
       Object obj = this;
       Object obj1 = p0;
       CronetInterceptor uCronetInter = CronetInterceptor.class;
       CronetInterceptorConfig uCronetInter1 = CronetInterceptorConfig.class;
       Request obj2 = PatchProxy.applyOneRefs(obj1, obj, uCronetInter, "1");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       obj2 = p0.request();
       if (obj2 == null || obj2.url() == null) {
          t.a("CronetInterceptor", "can\'t intercept request. request or request.url is null");
          return obj1.proceed(obj2);
       }else {
          String str = obj2.url().encodedPath();
          Object obj3 = null;
          String obj4 = PatchProxy.applyOneRefs(str, obj3, uCronetInter1, "5");
          boolean b = true;
          boolean b1 = (obj4 != PatchProxyResult.class)? obj4.booleanValue(): CronetInterceptorConfig.a(str, CronetInterceptorConfig.a, b);
          int b2 = false;
          if (b1) {
             str = obj2.url().encodedPath();
             obj4 = PatchProxy.applyOneRefs(str, obj3, uCronetInter1, "6");
             b1 = (obj4 != PatchProxyResult.class)? obj4.booleanValue(): CronetInterceptorConfig.a(str, CronetInterceptorConfig.b, b);
             if (!b1) {
                uCronetInter = obj.b;
                Object obj5 = PatchProxy.applyOneRefs(uCronetInter, obj3, uCronetInter1, "10");
                boolean b3 = (obj5 != PatchProxyResult.class)? obj5.booleanValue(): CronetInterceptorConfig.a(uCronetInter, CronetInterceptorConfig.d, b2);
                try{
                   boolean b4 = b3;
                   boolean e = CronetInterceptorConfig.e;
                   a = obj.a;
                   uoc = c.class;
                   if (PatchProxy.isSupport(uoc)) {
                      uCronetInter2 = a;
                      b5 = e;
                      b6 = b4;
                      response = PatchProxy.applyFourRefs(p0, Boolean.valueOf(b4), Boolean.valueOf(e), a, null, c.class, "4");
                      if (response != PatchProxyResult.class) {
                      label_00c1 :
                         return response;
                      }
                   }else {
                      uCronetInter2 = a;
                      b5 = e;
                      b6 = b4;
                   }
                   response = null;
                   i = 0;
                label_00ba :
                   if (i < 3) {
                      response = c.a(obj1, b6, b5, i, uCronetInter2);
                      goto label_00c1 ;
                   }else {
                      throw response;
                   }
                }catch(java.io.IOException e0){
                   Object obj6 = e0;
                   Object obj7 = PatchProxy.applyTwoRefs(obj1, obj6, null, uoc, "2");
                   if (obj7 != PatchProxyResult.class) {
                      b3 = obj7.booleanValue();
                   }else if(!p0.request().body() instanceof UnrepeatableRequestBody && (!obj6 instanceof NetworkException || obj6.getErrorCode() != 3)){
                      b3 = false;
                   }else {
                      b3 = true;
                   }
                   if (b3) {
                      t.a("CronetInterceptor", "interceptor meet a exception. just retry"+obj6);
                      i = i + 1;
                      response = obj6;
                      goto label_00ba ;
                   }else {
                      throw obj6;
                   }
                }
             }
          }
          t.a("CronetInterceptor", "can\'t intercept request. request mismatch the rules. url: "+obj2.url());
          request = PatchProxy.applyOneRefs(obj2, this, uCronetInter, "2");
          if (request != PatchProxyResult.class) {
          }else {
             Request$Builder uBuilder = obj2.newBuilder();
             Headers headers = obj2.headers();
             if (headers != null) {
                Headers$Builder uBuilder1 = new Headers$Builder();
                b2 = 0;
                while (b2 < headers.size()) {
                   str = headers.name(b2);
                   obj4 = headers.value(b2);
                   if (str != null && !str.startsWith("x-aegon-")) {
                      uBuilder1.add(str, obj4);
                   }
                   b2 = b2 + 1;
                }
                uBuilder.headers(uBuilder1.build());
             }
             request = uBuilder.build();
          }
          return obj1.proceed(request);
       }
    }
}
