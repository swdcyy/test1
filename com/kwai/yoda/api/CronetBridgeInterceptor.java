package com.kwai.yoda.api.CronetBridgeInterceptor;
import okhttp3.Interceptor;
import com.kwai.yoda.api.CronetBridgeInterceptor$a;
import nsd.u;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import okhttp3.Request;
import okhttp3.Request$Builder;
import java.lang.StringBuilder;
import java.lang.System;
import java.lang.Throwable;
import com.kwai.yoda.api.CronetFollowException;
import okhttp3.Response$Builder;
import kotlin.TypeCastException;

public final class CronetBridgeInterceptor implements Interceptor	// class@001169
{
    public static final AtomicLong a;
    public static final CronetBridgeInterceptor$a b;

    static {
       CronetBridgeInterceptor.b = new CronetBridgeInterceptor$a(null);
       CronetBridgeInterceptor.a = new AtomicLong(0);
    }
    public void CronetBridgeInterceptor(){
       super();
    }
    public Response intercept(Interceptor$Chain p0){
       Request$Builder obj = PatchProxy.applyOneRefs(p0, this, CronetBridgeInterceptor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "chain");
       obj = p0.request().newBuilder();
       obj.header("x-aegon-request-id", "yoda-"+CronetBridgeInterceptor.a.incrementAndGet());
       long l = System.currentTimeMillis();
       Response response = p0.proceed(obj.build());
       Response$Builder uBuilder = response.newBuilder().removeHeader("Content-Encoding");
       response = response.networkResponse();
       if (response != null) {
          Response$Builder uBuilder1 = response.newBuilder();
          if (uBuilder1 != null) {
             uBuilder1 = uBuilder1.removeHeader("Content-Encoding");
             if (uBuilder1 != null) {
                response = uBuilder1.build();
             label_008c :
                response = uBuilder.networkResponse(response).build();
                a.h(response, "response.newBuilder\(\)\n  ¡­build\(\)\)\n        .build\(\)");
                return response;
             }
          }
       }
       response = null;
       goto label_008c ;
    }
}
