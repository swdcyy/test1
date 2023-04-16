package com.yxcorp.retrofit.interceptor.ConvertToIOExceptionInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import okhttp3.Request;
import java.io.IOException;
import java.lang.Throwable;

public class ConvertToIOExceptionInterceptor implements Interceptor	// class@0013da
{

    public void ConvertToIOExceptionInterceptor(){
       super();
    }
    public Response intercept(Interceptor$Chain p0){
       try{
          return p0.proceed(p0.request());
       }catch(java.lang.Exception e2){
          if (e2 instanceof IOException) {
             throw e2;
          }
          throw new IOException(e2);
       }
    }
}
