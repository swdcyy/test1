package com.kwai.feature.api.corona.api.fast.CoronaParamsNetInterceptors;
import okhttp3.Interceptor;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import okhttp3.Request;
import okhttp3.ResponseBody;
import okhttp3.Response$Builder;
import sl5.c;
import okhttp3.HttpUrl;

public final class CoronaParamsNetInterceptors implements Interceptor	// class@000de0
{

    public void CoronaParamsNetInterceptors(){
       super();
    }
    public Response intercept(Interceptor$Chain p0){
       Request obj = PatchProxy.applyOneRefs(p0, this, CoronaParamsNetInterceptors.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "chain");
       obj = p0.request();
       Response response = p0.proceed(obj);
       ResponseBody responseBody = response.body();
       HttpUrl httpUrl = obj.url();
       a.o(httpUrl, "request.url\(\)");
       response = response.newBuilder().body(new c(httpUrl, responseBody)).build();
       a.o(response, "response\n      .newBuild¡­iginBody\)\)\n      .build\(\)");
       return response;
    }
}
