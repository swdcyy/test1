package com.kwai.framework.network.access.okhttp.interceptor.DegradeConfigBlockingInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.net.URL;
import wkd.b;
import pb6.h;

public final class DegradeConfigBlockingInterceptor implements Interceptor	// class@001797
{
    public static final DegradeConfigBlockingInterceptor a;

    static {
       DegradeConfigBlockingInterceptor.a = new DegradeConfigBlockingInterceptor();
    }
    public void DegradeConfigBlockingInterceptor(){
       super();
    }
    public Response intercept(Interceptor$Chain p0){
       Request obj = PatchProxy.applyOneRefs(p0, this, DegradeConfigBlockingInterceptor.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "chain");
       obj = p0.request();
       URL uRL = obj.url().url();
       a.o(uRL, "request.url\(\).url\(\)");
       String path = uRL.getPath();
       a.o(path, "path");
       b.a(0x214d4cb6).a(path);
       Response response = p0.proceed(obj);
       a.o(response, "chain.proceed\(request\)");
       return response;
    }
}
