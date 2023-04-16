package com.kwai.framework.azeroth.RequestTimingInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import okhttp3.Request;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl$Builder;
import com.kwai.middleware.leia.degrade.ApiRequestTiming;
import com.google.common.base.Optional;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Enum;
import java.lang.Exception;
import okhttp3.Request$Builder;

public class RequestTimingInterceptor implements Interceptor	// class@000b13
{

    public void RequestTimingInterceptor(){
       super();
    }
    public Response intercept(Interceptor$Chain p0){
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RequestTimingInterceptor requestTimin = RequestTimingInterceptor.class;
       Request obj = PatchProxy.applyOneRefs(p0, this, requestTimin, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = p0.request();
       HttpUrl$Builder uBuilder = obj.url().newBuilder();
       ApiRequestTiming uApiRequestT = Optional.fromNullable(obj.tag(ApiRequestTiming.class)).or(ApiRequestTiming.DEFAULT);
       RequestTiming requestTimin1 = PatchProxy.applyOneRefs(uApiRequestT, this, requestTimin, "2");
       if (requestTimin1 != patchProxyRe) {
       }else {
          try{
             requestTimin1 = RequestTiming.valueOf(uApiRequestT.toString());
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
             requestTimin1 = RequestTiming.DEFAULT;
          }
       }
    }
}
