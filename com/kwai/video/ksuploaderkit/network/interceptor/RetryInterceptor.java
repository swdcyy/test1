package com.kwai.video.ksuploaderkit.network.interceptor.RetryInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import okhttp3.Request;
import java.lang.StringBuilder;
import com.kwai.video.ksuploaderkit.KSUploaderKitLog;
import c97.d;
import h97.d;
import com.kwai.video.ksuploaderkit.config.PublishConfig;
import java.lang.reflect.Type;
import com.kwai.video.ksuploaderkit.config.PublishConfig$HTTPConfig;
import java.lang.Thread;
import okhttp3.Response$Builder;
import okhttp3.Protocol;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$ERRORCODE;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

public class RetryInterceptor implements Interceptor	// class@0009b6
{

    public void RetryInterceptor(){
       super();
    }
    public Response intercept(Interceptor$Chain p0){
       int i;
       Response response;
       String str = "KSUploaderKit-RetryInterceptor";
       Request obj = PatchProxy.applyOneRefs(p0, this, RetryInterceptor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.request();
       try{
          i = 0;
          response = p0.proceed(obj);
       }catch(java.lang.Exception e3){
          KSUploaderKitLog.e(str, "exception : "+e3);
          response = i;
       }
       int i1 = 0;
       PublishConfig publishConfi = d.a().c().a("ksuploaderkit", PublishConfig.class);
       PublishConfig$HTTPConfig maxRetryNumP = (publishConfi != null && (publishConfi.getHTTPConfig() != null && publishConfi.getHTTPConfig().maxRetryNumPerRequest > null))? publishConfi.getHTTPConfig().maxRetryNumPerRequest: 3;
       while (response == null && i1 < maxRetryNumP) {
          long l = 1000;
          try{
             Thread.sleep(l);
             i1 = i1 + 1;
             KSUploaderKitLog.e(str, "retry count : "+i1+", max retry num : "+3);
             response = p0.proceed(obj);
          }catch(java.lang.Exception e0){
             goto label_005d ;
          }
       }
       if (response == null) {
          response = new Response$Builder().request(obj).protocol(Protocol.HTTP_2).code(KSUploaderKitCommon$ERRORCODE.UNKNOWN_ERROR.value()).message("response is null").body(ResponseBody.create(i, "NULL")).build();
       }
       return response;
    }
}
