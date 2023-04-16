package com.android.kwai.foundation.network.core.intercaptors.GzipInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import okhttp3.RequestBody;
import okio.b;
import okio.c;
import com.android.kwai.foundation.network.core.intercaptors.GzipInterceptor$1;
import com.android.kwai.foundation.network.core.intercaptors.GzipInterceptor$2;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import okhttp3.Request;
import java.lang.String;
import okhttp3.Request$Builder;
import okhttp3.Response$Builder;
import okhttp3.internal.http.HttpHeaders;
import okio.j;
import okhttp3.ResponseBody;
import okio.d;
import okio.n;
import okhttp3.internal.http.RealResponseBody;
import okio.l;

public class GzipInterceptor implements Interceptor	// class@000eef
{

    public void GzipInterceptor(){
       super();
    }
    public final RequestBody forceContentLength(RequestBody p0){
       b uob = new b();
       p0.writeTo(uob);
       return new GzipInterceptor$1(this, p0, uob);
    }
    public final RequestBody gzip(RequestBody p0){
       return new GzipInterceptor$2(this, p0);
    }
    public Response intercept(Interceptor$Chain p0){
       Request request = p0.request();
       if (request.body() != null) {
          String str = "Accept-Encoding";
          if (request.header(str) == null) {
             String str1 = "gzip";
             Response response = p0.proceed(request.newBuilder().header(str, str1).method(request.method(), this.forceContentLength(this.gzip(request.body()))).build());
             Response$Builder uBuilder = response.newBuilder();
             if (str1.equalsIgnoreCase(response.header("Content-Encoding")) && HttpHeaders.hasBody(response)) {
                uBuilder.body(new RealResponseBody(response.header("Content-Type"), HttpHeaders.contentLength(response), l.d(new j(response.body().source()))));
                response = uBuilder.build();
             }
             return response;
          }
       }
       return p0.proceed(request);
    }
}
