package com.kwai.middleware.leia.interceptor.RetryInterceptor;
import okhttp3.Interceptor;
import com.kwai.middleware.leia.interceptor.RetryInterceptor$a;
import nsd.u;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import java.lang.String;
import kotlin.jvm.internal.a;
import okhttp3.Request;
import usd.n;
import ssd.e;
import usd.q;
import java.lang.Thread;
import wb7.a;
import java.lang.Throwable;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl$Builder;
import okhttp3.Request$Builder;

public final class RetryInterceptor implements Interceptor	// class@000f2e
{
    public final int a;
    public static final RetryInterceptor$a b;

    static {
       RetryInterceptor.b = new RetryInterceptor$a(null);
    }
    public void RetryInterceptor(int p0){
       super();
       this.a = p0;
    }
    public Response intercept(Interceptor$Chain p0){
       a.q(p0, "chain");
       Request request = p0.request();
       Response response = p0.proceed(request);
       int i = 0;
       a.h(response, "response");
       while (!response.isSuccessful() && i < this.a) {
          int i1 = i * 2;
          long l = (long)i1 * 1000;
          Thread.sleep(q.C0(new n(0, l), e.b));
          i = i + 1;
          HttpUrl$Builder uBuilder = request.url().newBuilder();
          uBuilder.removeAllQueryParameters("retryCount");
          uBuilder.addQueryParameter("retryCount", String.valueOf(i));
          response = p0.proceed(request.newBuilder().url(uBuilder.build()).build());
       }
       return response;
    }
}
