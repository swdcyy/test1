package com.kwai.middleware.azeroth.network.interceptor.RetryInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import okhttp3.Request;
import okhttp3.Request$Builder;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl$Builder;
import java.lang.String;
import java.lang.Throwable;
import com.kwai.middleware.azeroth.network.interceptor.a;

public class RetryInterceptor implements Interceptor	// class@000d61
{
    public int a;

    public void RetryInterceptor(int p0){
       super();
       this.a = 0;
       this.a = p0;
    }
    public Response intercept(Interceptor$Chain p0){
       Request request = p0.request();
       int i = 0;
       Throwable throwable = null;
       Response response = throwable;
       while (!throwable && (response == null || (!response.isSuccessful() && i <= this.a))) {
          if (i > 0) {
             request = request.newBuilder().url(request.url().newBuilder().setQueryParameter("retryTimes", String.valueOf(i)).build()).build();
          }
          response = p0.proceed(request);
          i = i + 1;
       }
       if (!throwable) {
          return response;
       }
       a.a(throwable, request, response);
       throw null;
    }
}
