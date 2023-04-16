package com.kwai.middleware.leia.interceptor.RouterInterceptor;
import okhttp3.Interceptor;
import ua7.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import okhttp3.Request;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl$Builder;
import okhttp3.Request$Builder;
import java.util.Objects;

public final class RouterInterceptor implements Interceptor	// class@000f2f
{
    public final b a;

    public void RouterInterceptor(b p0){
       a.q(p0, "router");
       super();
       this.a = p0;
    }
    public Response intercept(Interceptor$Chain p0){
       a.q(p0, "chain");
       Request request = p0.request();
       a.h(request, "originRequest");
       HttpUrl httpUrl = HttpUrl.parse(this.a.a(request));
       String str = (httpUrl != null)? httpUrl.host(): null;
       HttpUrl$Builder uBuilder = request.url().newBuilder();
       if (str != null) {
          uBuilder.host(str);
       }
       Response response = p0.proceed(request.newBuilder().url(uBuilder.build()).build());
       a.h(response, "response");
       Objects.requireNonNull(this.a);
       a.q(response, "response");
       if (response.isSuccessful() ^ 0x01) {
          this.a.b(response);
       }
       return response;
    }
}
