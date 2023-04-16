package com.kwai.middleware.azeroth.network.interceptor.ConvertToIOExceptionInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import okhttp3.Request;
import java.lang.Throwable;
import com.kwai.middleware.azeroth.network.interceptor.a;

public class ConvertToIOExceptionInterceptor implements Interceptor	// class@000d5e
{

    public void ConvertToIOExceptionInterceptor(){
       super();
    }
    public Response intercept(Interceptor$Chain p0){
       return p0.proceed(p0.request());
    }
}
