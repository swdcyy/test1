package com.frog.engine.network.interceptor.RedirectInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import okhttp3.Request;
import okhttp3.Headers;
import okhttp3.Request$Builder;

public class RedirectInterceptor implements Interceptor	// class@00154d
{

    public void RedirectInterceptor(){
       super();
    }
    public Response intercept(Interceptor$Chain p0){
       Request obj = PatchProxy.applyOneRefs(p0, this, RedirectInterceptor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.request();
       Response response = p0.proceed(obj);
       if (response.code() == 307) {
          response = p0.proceed(obj.newBuilder().url(response.headers().get("Location")).build());
       }
       return response;
    }
}
