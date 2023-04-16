package com.kuaishou.liveclient.resourcemanager.apiservices.CommonInterceptor;
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
import okhttp3.HttpUrl$Builder;
import okhttp3.Request$Builder;
import okhttp3.RequestBody;

public class CommonInterceptor implements Interceptor	// class@001055
{

    public void CommonInterceptor(){
       super();
    }
    public Response intercept(Interceptor$Chain p0){
       Request obj = PatchProxy.applyOneRefs(p0, this, CommonInterceptor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.request();
       Request$Builder uBuilder = obj.newBuilder();
       String str = obj.method();
       return p0.proceed(uBuilder.method(str, obj.body()).url(obj.url().newBuilder().scheme(obj.url().scheme()).host(obj.url().host()).addQueryParameter("inshion_debug", "true").addQueryParameter("livewhitepackagename", "com.kuaishou.live.simplelive").build()).build());
    }
}
