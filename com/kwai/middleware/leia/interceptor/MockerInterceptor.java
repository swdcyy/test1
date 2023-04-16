package com.kwai.middleware.leia.interceptor.MockerInterceptor;
import okhttp3.Interceptor;
import wa7.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import okhttp3.Request;

public final class MockerInterceptor implements Interceptor	// class@000f29
{
    public final a a;

    public void MockerInterceptor(a p0){
       a.q(p0, "mocker");
       super();
       this.a = p0;
    }
    public Response intercept(Interceptor$Chain p0){
       Response response;
       a.q(p0, "chain");
       Request request = p0.request();
       a.h(request, "request");
       if (this.a.a(request)) {
          response = this.a.b(request);
       }else {
          response = p0.proceed(request);
          a.h(response, "chain.proceed\(request\)");
       }
       return response;
    }
}
