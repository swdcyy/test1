package com.kwai.robust2.patchmanager.DownloadHelper$RetryInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import okhttp3.Request;
import java.util.Random;
import java.lang.Thread;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl$Builder;
import java.lang.String;
import okhttp3.Request$Builder;

public class DownloadHelper$RetryInterceptor implements Interceptor	// class@001417
{
    public final int a;

    public void DownloadHelper$RetryInterceptor(int p0){
       super();
       this.a = p0;
    }
    public Response intercept(Interceptor$Chain p0){
       Request request = p0.request();
       Response response = p0.proceed(request);
       int i = 0;
       while (!response.isSuccessful() && i < this.a) {
          int i1 = i * 2;
          i1 = i1 * 1000;
          Thread.sleep((long)new Random().nextInt(i1));
          i = i + 1;
          HttpUrl$Builder uBuilder = request.url().newBuilder();
          uBuilder.removeAllQueryParameters("retryCount");
          uBuilder.addQueryParameter("retryCount", String.valueOf(i));
          response = p0.proceed(request.newBuilder().url(uBuilder.build()).build());
       }
       return response;
    }
}
