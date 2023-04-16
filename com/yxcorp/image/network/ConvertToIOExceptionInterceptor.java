package com.yxcorp.image.network.ConvertToIOExceptionInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import okhttp3.Request;
import java.io.IOException;
import java.lang.Throwable;

public class ConvertToIOExceptionInterceptor implements Interceptor	// class@001a17
{

    public void ConvertToIOExceptionInterceptor(){
       super();
    }
    public Response intercept(Interceptor$Chain p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ConvertToIOExceptionInterceptor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return p0.proceed(p0.request());
       }catch(java.lang.Exception e3){
          if (e3 instanceof IOException) {
             throw e3;
          }
          throw new IOException(e3);
       }
    }
}
