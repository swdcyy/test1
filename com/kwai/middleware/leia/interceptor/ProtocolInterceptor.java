package com.kwai.middleware.leia.interceptor.ProtocolInterceptor;
import okhttp3.Interceptor;
import com.kwai.middleware.leia.interceptor.ProtocolInterceptor$a;
import nsd.u;
import ub7.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import okhttp3.Request;
import okhttp3.HttpUrl;
import zsd.u;
import kotlin.text.StringsKt__StringsKt;
import java.lang.Boolean;
import java.lang.StringBuilder;
import okhttp3.Request$Builder;

public final class ProtocolInterceptor implements Interceptor	// class@000f2c
{
    public final f a;
    public static final ProtocolInterceptor$a b;

    static {
       ProtocolInterceptor.b = new ProtocolInterceptor$a(null);
    }
    public void ProtocolInterceptor(f p0){
       a.q(p0, "useHttps");
       super();
       this.a = p0;
    }
    public Response intercept(Interceptor$Chain p0){
       a.q(p0, "chain");
       Request request = p0.request();
       String str = request.url().toString();
       a.h(str, "originRequest.url\(\).toString\(\)");
       boolean b = false;
       int i = 2;
       if (u.q2(str, "http://", b, i, null)) {
          str = StringsKt__StringsKt.b5(str, "http://", null, i, null);
       }else if(u.q2(str, "https://", b, i, null)){
          str = StringsKt__StringsKt.b5(str, "https://", null, i, null);
       }
       Object obj = this.a.get();
       a.h(obj, "useHttps.get\(\)");
       str = (obj.booleanValue())? "https://"+str: "http://"+str;
       Response response = p0.proceed(request.newBuilder().url(str).build());
       a.h(response, "chain.proceed\(newRequest\)");
       return response;
    }
}
