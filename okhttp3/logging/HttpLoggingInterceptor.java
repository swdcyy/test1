package okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.Interceptor;
import java.lang.String;
import java.nio.charset.Charset;
import okhttp3.logging.HttpLoggingInterceptor$Logger;
import java.lang.Object;
import java.util.Set;
import java.util.Collections;
import okhttp3.logging.HttpLoggingInterceptor$Level;
import okhttp3.Headers;
import okio.b;
import java.lang.Character;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Connection;
import java.lang.StringBuilder;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.MediaType;
import okio.c;
import java.lang.System;
import java.util.concurrent.TimeUnit;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okio.d;
import java.lang.Long;
import okio.j;
import okio.n;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.Collection;
import java.util.Objects;

public final class HttpLoggingInterceptor implements Interceptor	// class@001fe5
{
    public Set headersToRedact;
    public HttpLoggingInterceptor$Level level;
    public final HttpLoggingInterceptor$Logger logger;
    public static final Charset UTF8;

    static {
       HttpLoggingInterceptor.UTF8 = Charset.forName("UTF-8");
    }
    public void HttpLoggingInterceptor(){
       super(HttpLoggingInterceptor$Logger.DEFAULT);
    }
    public void HttpLoggingInterceptor(HttpLoggingInterceptor$Logger p0){
       super();
       this.headersToRedact = Collections.emptySet();
       this.level = HttpLoggingInterceptor$Level.NONE;
       this.logger = p0;
    }
    public static boolean bodyHasUnknownEncoding(Headers p0){
       String str = p0.get("Content-Encoding");
       boolean b = (str != null && (!str.equalsIgnoreCase("identity") && !str.equalsIgnoreCase("gzip")))? true: false;
       return b;
    }
    public static boolean isPlaintext(b p0){
       boolean b = false;
       try{
          b uob = new b();
          int i = 64;
          long l = (p0.p() - i < 0)? p0.p(): i;
          p0.f(uob, 0, l);
          int i1 = 0;
          while (true) {
             if (i1 >= 16 || uob.exhausted()) {
                return true;
             }
             int i2 = uob.readUtf8CodePoint();
             if (Character.isISOControl(i2) && !Character.isWhitespace(i2)) {
                break ;
             }else {
                i1++;
             }
          }
          return b;
       }catch(java.io.EOFException e0){
          return e0;
       }
    }
    public HttpLoggingInterceptor$Level getLevel(){
       return this.level;
    }
    public Response intercept(Interceptor$Chain p0){
       Charset obj;
       long l2;
       char c;
       Long longx;
       HttpLoggingInterceptor httpLoggingI = this;
       Interceptor$Chain uChain = p0;
       HttpLoggingInterceptor level = httpLoggingI.level;
       Request request = p0.request();
       if (level == HttpLoggingInterceptor$Level.NONE) {
          return uChain.proceed(request);
       }
       HttpLoggingInterceptor httpLoggingI1 = 1;
       boolean b = (level == HttpLoggingInterceptor$Level.BODY)? true: false;
       Headers headers = (b || level == HttpLoggingInterceptor$Level.HEADERS)? 1: null;
       RequestBody requestBody = request.body();
       if (requestBody == null) {
          httpLoggingI1 = null;
       }
       Connection uConnection = p0.connection();
       String str = "--> "+request.method()+' '+request.url();
       String str1 = (uConnection != null)? " "+uConnection.protocol(): "";
       str1 = str+str1;
       str = "-byte body\)";
       if (!headers && httpLoggingI1) {
          str1 = str1+" \("+requestBody.contentLength()+str;
       }
       httpLoggingI.logger.log(str1);
       long l = -1;
       if (headers) {
          if (httpLoggingI1) {
             if (requestBody.contentType() != null) {
                httpLoggingI.logger.log("Content-Type: "+requestBody.contentType());
             }
             if (requestBody.contentLength() - l) {
                httpLoggingI.logger.log("Content-Length: "+requestBody.contentLength());
             }
          }
          Headers headers1 = request.headers();
          int i = headers1.size();
          int i1 = 0;
          while (i1 < i) {
             String str2 = headers1.name(i1);
             if (!("Content-Type").equalsIgnoreCase(str2) && !("Content-Length").equalsIgnoreCase(str2)) {
                httpLoggingI.logHeader(headers1, i1);
             }
             i1 = i1 + 1;
          }
          String str3 = "--> END ";
          if (!b || !httpLoggingI1) {
             httpLoggingI.logger.log(str3+request.method());
          }else if(HttpLoggingInterceptor.bodyHasUnknownEncoding(request.headers())){
             httpLoggingI.logger.log(str3+request.method()+" \(encoded body omitted\)");
          }else {
             b uob1 = new b();
             requestBody.writeTo(uob1);
             Charset uTF8 = HttpLoggingInterceptor.UTF8;
             MediaType mediaType1 = requestBody.contentType();
             if (mediaType1 != null) {
                uTF8 = mediaType1.charset(uTF8);
             }
             httpLoggingI.logger.log("");
             if (HttpLoggingInterceptor.isPlaintext(uob1)) {
                httpLoggingI.logger.log(uob1.readString(uTF8));
                httpLoggingI.logger.log(str3+request.method()+" \("+requestBody.contentLength()+str);
             }else {
                httpLoggingI.logger.log(str3+request.method()+" \(binary "+requestBody.contentLength()+"-byte body omitted\)");
             }
          }
       }
       long l1 = System.nanoTime();
       try{
          Response response = uChain.proceed(request);
          l1 = TimeUnit.NANOSECONDS.toMillis((System.nanoTime() - l1));
          ResponseBody responseBody = response.body();
          l = responseBody.contentLength();
          String str4 = (l - -1)? l+"-byte": "unknown-length";
          HttpLoggingInterceptor logger = httpLoggingI.logger;
          String str5 = str;
          StringBuilder str6 = "<-- "+response.code();
          if ((response.message()).isEmpty()) {
             str = "";
             l2 = l;
             c = ' ';
          }else {
             l2 = l;
             c = ' ';
             str = c+response.message();
          }
          str6 = str6+str+c+response.request().url()+" \("+l1+"ms";
          String str7 = (!headers)? ", "+str4+" body": "";
          logger.log(str6+str7+')');
          if (headers) {
             headers = response.headers();
             int i2 = headers.size();
             for (int i3 = 0; i3 < i2; i3 = i3 + 1) {
                httpLoggingI.logHeader(headers, i3);
             }
             if (!b || !HttpHeaders.hasBody(response)) {
                httpLoggingI.logger.log("<-- END HTTP");
             }else if(HttpLoggingInterceptor.bodyHasUnknownEncoding(response.headers())){
                httpLoggingI.logger.log("<-- END HTTP \(encoded body omitted\)");
             }else {
                d uod = responseBody.source();
                uod.request(Long.MAX_VALUE);
                b uob = uod.buffer();
                str7 = null;
                if (("gzip").equalsIgnoreCase(headers.get("Content-Encoding"))) {
                   j oj = new j(uob.c());
                   uob = new b();
                   uob.x1(oj);
                   oj.close();
                   longx = Long.valueOf(uob.p());
                }
                obj = HttpLoggingInterceptor.UTF8;
                MediaType mediaType = responseBody.contentType();
                if (mediaType != null) {
                   obj = mediaType.charset(obj);
                }
                if (!HttpLoggingInterceptor.isPlaintext(uob)) {
                   httpLoggingI.logger.log("");
                   httpLoggingI.logger.log("<-- END HTTP \(binary "+uob.p()+"-byte body omitted\)");
                   return response;
                }else if(l2 - null){
                   httpLoggingI.logger.log("");
                   httpLoggingI.logger.log(uob.c().readString(obj));
                }
                String str8 = "<-- END HTTP \(";
                if (longx != null) {
                   httpLoggingI.logger.log(str8+uob.p()+"-byte, "+longx+"-gzipped-byte body\)");
                }else {
                   httpLoggingI.logger.log(str8+uob.p()+str5);
                }
             }
          }
          return response;
       }catch(java.lang.Exception e0){
          obj = e0;
          httpLoggingI.logger.log("<-- HTTP FAILED: "+obj);
          throw obj;
       }
    }
    public final void logHeader(Headers p0,int p1){
       String str = (this.headersToRedact.contains(p0.name(p1)))? "¨€¨€": p0.value(p1);
       this.logger.log(p0.name(p1)+": "+str);
       return;
    }
    public void redactHeader(String p0){
       TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
       treeSet.addAll(this.headersToRedact);
       treeSet.add(p0);
       this.headersToRedact = treeSet;
    }
    public HttpLoggingInterceptor setLevel(HttpLoggingInterceptor$Level p0){
       Objects.requireNonNull(p0, "level == null. Use Level.NONE instead.");
       this.level = p0;
       return this;
    }
}
