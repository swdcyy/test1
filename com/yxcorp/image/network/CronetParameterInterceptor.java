package com.yxcorp.image.network.CronetParameterInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import okhttp3.Request;
import okhttp3.Request$Builder;
import java.lang.StringBuilder;
import okhttp3.HttpUrl;
import uk.a;

public class CronetParameterInterceptor implements Interceptor	// class@001a19
{
    public final AtomicInteger a;

    public void CronetParameterInterceptor(){
       super();
       this.a = new AtomicInteger();
    }
    public Response intercept(Interceptor$Chain p0){
       Request obj = PatchProxy.applyOneRefs(p0, this, CronetParameterInterceptor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.request();
       Request$Builder uBuilder = obj.newBuilder();
       uBuilder.addHeader("x-aegon-request-id", "img_"+this.a.incrementAndGet());
       if (!a.c(obj.url().host())) {
          uBuilder.addHeader("x-aegon-enable-preresolver", "1");
       }
       return p0.proceed(uBuilder.build());
    }
}
