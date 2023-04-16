package okhttp3.internal.cache.CacheStrategy$Factory;
import okhttp3.Request;
import okhttp3.Response;
import java.lang.Object;
import okhttp3.Headers;
import java.lang.String;
import java.util.Date;
import okhttp3.internal.http.HttpDate;
import okhttp3.internal.http.HttpHeaders;
import java.lang.Math;
import java.util.concurrent.TimeUnit;
import okhttp3.CacheControl;
import okhttp3.HttpUrl;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.Handshake;
import okhttp3.Response$Builder;
import okhttp3.Headers$Builder;
import okhttp3.internal.Internal;
import okhttp3.Request$Builder;

public class CacheStrategy$Factory	// class@0020a5
{
    public int ageSeconds;
    public final Response cacheResponse;
    public String etag;
    public Date expires;
    public Date lastModified;
    public String lastModifiedString;
    public final long nowMillis;
    public long receivedResponseMillis;
    public final Request request;
    public long sentRequestMillis;
    public Date servedDate;
    public String servedDateString;

    public void CacheStrategy$Factory(long p0,Request p1,Response p2){
       super();
       this.ageSeconds = -1;
       this.nowMillis = p0;
       this.request = p1;
       this.cacheResponse = p2;
       if (p2 != null) {
          this.sentRequestMillis = p2.sentRequestAtMillis();
          this.receivedResponseMillis = p2.receivedResponseAtMillis();
          Headers headers = p2.headers();
          int i = 0;
          int i1 = headers.size();
          while (i < i1) {
             String str = headers.name(i);
             String str1 = headers.value(i);
             if (("Date").equalsIgnoreCase(str)) {
                this.servedDate = HttpDate.parse(str1);
                this.servedDateString = str1;
             }else if(("Expires").equalsIgnoreCase(str)){
                this.expires = HttpDate.parse(str1);
             }else if(("Last-Modified").equalsIgnoreCase(str)){
                this.lastModified = HttpDate.parse(str1);
                this.lastModifiedString = str1;
             }else if(("ETag").equalsIgnoreCase(str)){
                this.etag = str1;
             }else if(("Age").equalsIgnoreCase(str)){
                this.ageSeconds = HttpHeaders.parseSeconds(str1, -1);
             }
             i = i + 1;
          }
       }
       return;
    }
    public static boolean hasConditions(Request p0){
       boolean b = (p0.header("If-Modified-Since") != null || p0.header("If-None-Match") != null)? true: false;
       return b;
    }
    public final long cacheResponseAge(){
       CacheStrategy$Factory tservedDate = this.servedDate;
       long l = 0;
       if (tservedDate != null) {
          l = Math.max(l, (this.receivedResponseMillis - tservedDate.getTime()));
       }
       tservedDate = this.ageSeconds;
       if (tservedDate != -1) {
          l = Math.max(l, TimeUnit.SECONDS.toMillis((long)tservedDate));
       }
       CacheStrategy$Factory treceivedRes = this.receivedResponseMillis;
       return ((l + (treceivedRes - this.sentRequestMillis)) + (this.nowMillis - treceivedRes));
    }
    public final long computeFreshnessLifetime(){
       CacheStrategy$Factory tservedDate;
       long time;
       CacheStrategy$Factory tsentRequest;
       CacheControl uCacheContro = this.cacheResponse.cacheControl();
       if (uCacheContro.maxAgeSeconds() != -1) {
          return TimeUnit.SECONDS.toMillis((long)uCacheContro.maxAgeSeconds());
       }
       long l = 0;
       if (this.expires != null) {
          tservedDate = this.servedDate;
          time = (tservedDate != null)? tservedDate.getTime(): this.receivedResponseMillis;
          long l1 = this.expires.getTime() - time;
          if (l1 - l > 0) {
             l = l1;
          }
          return l;
       }else if(this.lastModified != null && this.cacheResponse.request().url().query() == null){
          tservedDate = this.servedDate;
          time = (tservedDate != null)? tservedDate.getTime(): this.sentRequestMillis;
          time = time - this.lastModified.getTime();
          if (time - l > 0) {
             l = time / 10;
          }
       }
    label_0065 :
       return l;
    }
    public CacheStrategy get(){
       CacheStrategy candidate = this.getCandidate();
       if (candidate.networkRequest != null && this.request.cacheControl().onlyIfCached()) {
          candidate = new CacheStrategy(null, null);
       }
       return candidate;
    }
    public final CacheStrategy getCandidate(){
       String str;
       Response response = null;
       if (this.cacheResponse == null) {
          return new CacheStrategy(this.request, response);
       }
       if (this.request.isHttps() && this.cacheResponse.handshake() == null) {
          return new CacheStrategy(this.request, response);
       }
       if (!CacheStrategy.isCacheable(this.cacheResponse, this.request)) {
          return new CacheStrategy(this.request, response);
       }
       CacheControl uCacheContro = this.request.cacheControl();
       if (uCacheContro.noCache() || CacheStrategy$Factory.hasConditions(this.request)) {
          return new CacheStrategy(this.request, response);
       }
       CacheControl uCacheContro1 = this.cacheResponse.cacheControl();
       long l = this.cacheResponseAge();
       long l1 = this.computeFreshnessLifetime();
       long l2 = -1;
       if (uCacheContro.maxAgeSeconds() != l2) {
          l1 = Math.min(l1, TimeUnit.SECONDS.toMillis((long)uCacheContro.maxAgeSeconds()));
       }
       long l3 = 0;
       long l4 = (uCacheContro.minFreshSeconds() != l2)? TimeUnit.SECONDS.toMillis((long)uCacheContro.minFreshSeconds()): l3;
       if (!uCacheContro1.mustRevalidate() && uCacheContro.maxStaleSeconds() != l2) {
          l3 = TimeUnit.SECONDS.toMillis((long)uCacheContro.maxStaleSeconds());
       }
       if (!uCacheContro1.noCache()) {
          l4 = l4 + l;
          if (l4 - (l3 + l1) < 0) {
             Response$Builder uBuilder = this.cacheResponse.newBuilder();
             str = "Warning";
             if (l4 - l1 >= 0) {
                uBuilder.addHeader(str, "110 HttpURLConnection \"Response is stale\"");
             }
             if (l - 0x5265c00 > 0 && this.isFreshnessLifetimeHeuristic()) {
                uBuilder.addHeader(str, "113 HttpURLConnection \"Heuristic expiration\"");
             }
             return new CacheStrategy(response, uBuilder.build());
          }
       }
       CacheStrategy$Factory tetag = this.etag;
       str = "If-Modified-Since";
       if (tetag != null) {
          str = "If-None-Match";
       }else if(this.lastModified != null){
          tetag = this.lastModifiedString;
       }else if(this.servedDate != null){
          tetag = this.servedDateString;
       }else {
          return new CacheStrategy(this.request, response);
       }
       Headers$Builder uBuilder1 = this.request.headers().newBuilder();
       Internal.instance.addLenient(uBuilder1, str, tetag);
       return new CacheStrategy(this.request.newBuilder().headers(uBuilder1.build()).build(), this.cacheResponse);
    }
    public final boolean isFreshnessLifetimeHeuristic(){
       boolean b = (this.cacheResponse.cacheControl().maxAgeSeconds() == -1 && this.expires == null)? true: false;
       return b;
    }
}
