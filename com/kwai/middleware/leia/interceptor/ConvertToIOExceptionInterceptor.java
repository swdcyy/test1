package com.kwai.middleware.leia.interceptor.ConvertToIOExceptionInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import java.lang.String;
import kotlin.jvm.internal.a;
import okhttp3.Request;
import com.kwai.middleware.leia.response.LeiaRequestException;
import java.lang.Throwable;

public final class ConvertToIOExceptionInterceptor implements Interceptor	// class@000f27
{

    public void ConvertToIOExceptionInterceptor(){
       super();
    }
    public Response intercept(Interceptor$Chain p0){
       a.q(p0, "chain");
       Response response = p0.proceed(p0.request());
       a.h(response, "response");
       return response;
    }
}
