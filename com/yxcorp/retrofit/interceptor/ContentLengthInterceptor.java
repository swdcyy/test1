package com.yxcorp.retrofit.interceptor.ContentLengthInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import okhttp3.Request;
import okhttp3.ResponseBody;
import okhttp3.Response$Builder;
import ojd.d;

public class ContentLengthInterceptor implements Interceptor	// class@0013d9
{

    public void ContentLengthInterceptor(){
       super();
    }
    public Response intercept(Interceptor$Chain p0){
       Response response = p0.proceed(p0.request());
       if (response != null && (response.body() != null && !response.body().contentLength() - -1)) {
          Response$Builder uBuilder = response.newBuilder();
          uBuilder.body(new d(response.body()));
          response = uBuilder.build();
       }
    label_0032 :
       return response;
    }
}
