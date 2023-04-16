package okhttp3.internal.cache.CacheInterceptor;
import okhttp3.Interceptor;
import okhttp3.internal.cache.InternalCache;
import java.lang.Object;
import okhttp3.Headers;
import okhttp3.Headers$Builder;
import java.lang.String;
import okhttp3.internal.Internal;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.Response$Builder;
import okhttp3.internal.cache.CacheRequest;
import okio.m;
import okio.d;
import okio.c;
import okio.l;
import okhttp3.internal.cache.CacheInterceptor$1;
import okhttp3.internal.http.RealResponseBody;
import okio.n;
import okhttp3.Interceptor$Chain;
import okhttp3.Request;
import java.lang.System;
import okhttp3.internal.cache.CacheStrategy$Factory;
import okhttp3.internal.cache.CacheStrategy;
import java.io.Closeable;
import okhttp3.internal.Util;
import okhttp3.Protocol;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;

public final class CacheInterceptor implements Interceptor	// class@0020a3
{
    public final InternalCache cache;

    public void CacheInterceptor(InternalCache p0){
       super();
       this.cache = p0;
    }
    public static Headers combine(Headers p0,Headers p1){
       Headers$Builder uBuilder = new Headers$Builder();
       int i = p0.size();
       int i1 = 0;
       int i2 = 0;
       while (i2 < i) {
          String str = p0.name(i2);
          String str1 = p0.value(i2);
          if (("Warning").equalsIgnoreCase(str) && (!str1.startsWith("1") && (!CacheInterceptor.isContentSpecificHeader(str) && (!CacheInterceptor.isEndToEnd(str) || p1.get(str) == null)))) {
             Internal.instance.addLenient(uBuilder, str, str1);
          }
          i2 = i2 + 1;
       }
       int i3 = p1.size();
       while (i1 < i3) {
          String str2 = p1.name(i1);
          if (!CacheInterceptor.isContentSpecificHeader(str2) && CacheInterceptor.isEndToEnd(str2)) {
             Internal.instance.addLenient(uBuilder, str2, p1.value(i1));
          }
          i1 = i1 + 1;
       }
       return uBuilder.build();
    }
    public static boolean isContentSpecificHeader(String p0){
       boolean b = (!("Content-Length").equalsIgnoreCase(p0) && (("Content-Encoding").equalsIgnoreCase(p0) || ("Content-Type").equalsIgnoreCase(p0)))? true: false;
       return b;
    }
    public static boolean isEndToEnd(String p0){
       boolean b = (!("Connection").equalsIgnoreCase(p0) && (!("Keep-Alive").equalsIgnoreCase(p0) && (!("Proxy-Authenticate").equalsIgnoreCase(p0) && (!("Proxy-Authorization").equalsIgnoreCase(p0) && (!("TE").equalsIgnoreCase(p0) && (!("Trailers").equalsIgnoreCase(p0) && (!("Transfer-Encoding").equalsIgnoreCase(p0) && !("Upgrade").equalsIgnoreCase(p0))))))))? true: false;
       return b;
    }
    public static Response stripBody(Response p0){
       if (p0 != null && p0.body() != null) {
          p0 = p0.newBuilder().body(null).build();
       }
       return p0;
    }
    public final Response cacheWritingResponse(CacheRequest p0,Response p1){
       if (p0 == null) {
          return p1;
       }
       m om = p0.body();
       if (om == null) {
          return p1;
       }
       return p1.newBuilder().body(new RealResponseBody(p1.header("Content-Type"), p1.body().contentLength(), l.d(new CacheInterceptor$1(this, p1.body().source(), p0, l.c(om))))).build();
    }
    public Response intercept(Interceptor$Chain p0){
       CacheInterceptor tcache = this.cache;
       Response response = (tcache != null)? tcache.get(p0.request()): null;
       CacheStrategy uCacheStrate = new CacheStrategy$Factory(System.currentTimeMillis(), p0.request(), response).get();
       CacheStrategy networkReque = uCacheStrate.networkRequest;
       CacheStrategy cacheRespons = uCacheStrate.cacheResponse;
       CacheInterceptor tcache1 = this.cache;
       if (tcache1 != null) {
          tcache1.trackResponse(uCacheStrate);
       }
       if (response != null && cacheRespons == null) {
          Util.closeQuietly(response.body());
       }
       if (networkReque == null && cacheRespons == null) {
          return new Response$Builder().request(p0.request()).protocol(Protocol.HTTP_1_1).code(504).message("Unsatisfiable Request \(only-if-cached\)").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1).receivedResponseAtMillis(System.currentTimeMillis()).build();
       }else if(networkReque == null){
          return cacheRespons.newBuilder().cacheResponse(CacheInterceptor.stripBody(cacheRespons)).build();
       }else {
          Response response1 = p0.proceed(networkReque);
          if (response1 == null && response != null) {
             Util.closeQuietly(response.body());
          }
          if (cacheRespons != null) {
             if (response1.code() == 304) {
                response = cacheRespons.newBuilder().headers(CacheInterceptor.combine(cacheRespons.headers(), response1.headers())).sentRequestAtMillis(response1.sentRequestAtMillis()).receivedResponseAtMillis(response1.receivedResponseAtMillis()).cacheResponse(CacheInterceptor.stripBody(cacheRespons)).networkResponse(CacheInterceptor.stripBody(response1)).build();
                response1.body().close();
                this.cache.trackConditionalCacheHit();
                this.cache.update(cacheRespons, response);
                return response;
             }else {
                Util.closeQuietly(cacheRespons.body());
             }
          }
          try{
             response1 = response1.newBuilder().cacheResponse(CacheInterceptor.stripBody(cacheRespons)).networkResponse(CacheInterceptor.stripBody(response1)).build();
             if (this.cache != null) {
                if (HttpHeaders.hasBody(response1) && CacheStrategy.isCacheable(response1, networkReque)) {
                   return this.cacheWritingResponse(this.cache.put(response1), response1);
                }else if(HttpMethod.invalidatesCache(networkReque.method())){
                   this.cache.remove(networkReque);
                }
             }
             return response1;
          }catch(java.io.IOException e0){
          }
       }
    }
}
