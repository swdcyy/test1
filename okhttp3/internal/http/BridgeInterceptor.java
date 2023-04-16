package okhttp3.internal.http.BridgeInterceptor;
import okhttp3.Interceptor;
import okhttp3.CookieJar;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.lang.StringBuilder;
import okhttp3.Cookie;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import okhttp3.Request;
import okhttp3.Request$Builder;
import okhttp3.RequestBody;
import okhttp3.MediaType;
import java.lang.Long;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.Version;
import okhttp3.Headers;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.Response$Builder;
import okio.j;
import okhttp3.ResponseBody;
import okio.d;
import okio.n;
import okhttp3.Headers$Builder;
import okhttp3.internal.http.RealResponseBody;
import okio.l;

public final class BridgeInterceptor implements Interceptor	// class@0020b2
{
    public final CookieJar cookieJar;

    public void BridgeInterceptor(CookieJar p0){
       super();
       this.cookieJar = p0;
    }
    public final String cookieHeader(List p0){
       StringBuilder str = "";
       int i = p0.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          if (i1 > 0) {
             str = str+"; ";
          }
          Cookie uCookie = p0.get(i1);
          str = str+uCookie.name()+'='+uCookie.value();
       }
       return str;
    }
    public Response intercept(Interceptor$Chain p0){
       long l;
       String str;
       Request request = p0.request();
       Request$Builder uBuilder = request.newBuilder();
       RequestBody requestBody = request.body();
       if (requestBody != null) {
          MediaType mediaType = requestBody.contentType();
          if (mediaType != null) {
             uBuilder.header("Content-Type", mediaType.toString());
          }
          l = requestBody.contentLength();
          str = "Transfer-Encoding";
          if (l - -1) {
             uBuilder.header("Content-Length", Long.toString(l));
             uBuilder.removeHeader(str);
          }else {
             uBuilder.header(str, "chunked");
             uBuilder.removeHeader("Content-Length");
          }
       }
       str = "Host";
       boolean b = false;
       if (request.header(str) == null) {
          uBuilder.header(str, Util.hostHeader(request.url(), b));
       }
       str = "Connection";
       if (request.header(str) == null) {
          uBuilder.header(str, "Keep-Alive");
       }
       str = "Accept-Encoding";
       if (request.header(str) == null && request.header("Range") == null) {
          b = true;
          uBuilder.header(str, "gzip");
       }
       List list = this.cookieJar.loadForRequest(request.url());
       if (!list.isEmpty()) {
          uBuilder.header("Cookie", this.cookieHeader(list));
       }
       str = "User-Agent";
       if (request.header(str) == null) {
          uBuilder.header(str, Version.userAgent());
       }
       Response response = p0.proceed(uBuilder.build());
       HttpHeaders.receiveHeaders(this.cookieJar, request.url(), response.headers());
       Response$Builder uBuilder1 = response.newBuilder().request(request);
       if (b) {
          String str1 = "Content-Encoding";
          if ("gzip".equalsIgnoreCase(response.header(str1)) && HttpHeaders.hasBody(response)) {
             uBuilder1.headers(response.headers().newBuilder().removeAll(str1).removeAll("Content-Length").build());
             uBuilder1.body(new RealResponseBody(response.header("Content-Type"), -1, l.d(new j(response.body().source()))));
          }
       }
       return uBuilder1.build();
    }
}
