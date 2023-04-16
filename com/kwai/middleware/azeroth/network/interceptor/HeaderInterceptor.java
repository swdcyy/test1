package com.kwai.middleware.azeroth.network.interceptor.HeaderInterceptor;
import okhttp3.Interceptor;
import x97.d;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import java.util.Map;
import okhttp3.Request;
import okhttp3.Headers;
import okhttp3.Headers$Builder;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.String;
import okhttp3.Request$Builder;

public class HeaderInterceptor implements Interceptor	// class@000d5f
{
    public final d a;

    public void HeaderInterceptor(d p0){
       super();
       this.a = p0;
    }
    public Response intercept(Interceptor$Chain p0){
       Request request = p0.request();
       Headers$Builder uBuilder = request.headers().newBuilder();
       Iterator iterator = this.a.a().entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          uBuilder.add(key, uEntry.getValue());
       }
       return p0.proceed(request.newBuilder().headers(uBuilder.build()).build());
    }
}
