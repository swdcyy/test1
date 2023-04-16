package com.kuaishou.dfp.c.a.a;
import okhttp3.Interceptor;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.net.URI;
import java.lang.CharSequence;
import java.lang.System;
import m30.a;
import okhttp3.ResponseBody;
import org.json.JSONObject;
import com.middleware.security.MXSec;
import com.middleware.security.wrapper.IKSecurityBase;
import i30.a;
import okhttp3.Request$Builder;
import m30.b;
import java.lang.Exception;

public class a implements Interceptor	// class@0016e3
{
    public static String a = "ChallengeIntercepter";

    public void a(){
       super();
    }
    public Response intercept(Interceptor$Chain p0){
       int i1;
       long l3;
       long l4;
       Response response2;
       long l5;
       Response response3;
       int i3;
       long l6;
       Object obj = p0;
       String str = "";
       Request obj1 = PatchProxy.applyOneRefs(obj, this, a.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = p0.request();
       Response response = obj.proceed(obj1);
       String rawPath = obj1.url().uri().getRawPath();
       if (response.code() == 501 && (rawPath.contains("rest/infra/gdfp/report/kuaishou/android") || rawPath.contains("rest/infra/gdfp/report/android"))) {
          long l = System.currentTimeMillis();
          a uoa = new a();
          ResponseBody responseBody = response.body();
          if (responseBody != null) {
             String str1 = responseBody.string();
             try{
                long l1 = System.currentTimeMillis();
                int intx = new JSONObject(str1).getInt("result");
                long l2 = System.currentTimeMillis();
                int i = 1;
                Response response1 = response;
                i1 = 0;
                if (intx == 0x61a87) {
                   try{
                      l3 = System.currentTimeMillis();
                      l4 = System.currentTimeMillis();
                      response2 = obj.proceed(obj1.newBuilder().addHeader("KS-APP-LCR", MXSec.get().getWrapper().localChallenge("ztdfp", "7e46b28a-8c93-4940-8238-4c60e64e3c81", i1, a.a().r())).build());
                      try{
                         l5 = System.currentTimeMillis();
                         response3 = response2;
                         try{
                            l6 = (long)intx;
                            uoa.a = l6;
                            uoa.b = l1 - l;
                            uoa.c = l2 - l1;
                            uoa.d = l3 - l2;
                            uoa.e = l4 - l3;
                            uoa.f = l5 - l4;
                            uoa.g = l5 - l;
                         }catch(java.lang.Exception e0){
                         }
                         response = i3;
                      }catch(java.lang.Exception e0){
                         i3 = response2;
                         goto label_00ca ;
                      }
                   }catch(java.lang.Exception e0){
                      response = response1;
                   }
                label_012e :
                   e0.printStackTrace();
                }else if(intx == 0x61a88){
                   MXSec.get().getWrapper().challenge("ztdfp", "7e46b28a-8c93-4940-8238-4c60e64e3c81", i1, str);
                   l3 = System.currentTimeMillis();
                   l4 = System.currentTimeMillis();
                   response2 = obj.proceed(obj1.newBuilder().addHeader("KS-APP-RCR", str).build());
                   l5 = System.currentTimeMillis();
                   response3 = response2;
                   l6 = (long)intx;
                   uoa.a = l6;
                   uoa.b = l1 - l;
                   uoa.c = l2 - l1;
                   uoa.d = l3 - l2;
                   uoa.e = l4 - l3;
                   uoa.f = l5 - l4;
                   uoa.g = l5 - l;
                }else {
                   response = response1;
                   i = 0;
                label_0123 :
                   if (i) {
                      try{
                         b.a(uoa);
                      }catch(java.lang.Exception e0){
                         goto label_012e ;
                      }
                   }
                }
                response = response3;
                goto label_0123 ;
             }catch(java.lang.Exception e0){
                int i2 = i1;
                goto label_012e ;
             }catch(java.lang.Exception e0){
             }catch(java.lang.Exception e0){
             }
          }else {
          label_0132 :
             response = response;
          }
       }else {
          goto label_0132 ;
       }
       return i1;
    }
}
