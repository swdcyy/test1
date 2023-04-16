package okhttp3.Response;
import java.io.Closeable;
import okhttp3.Response$Builder;
import java.lang.Object;
import okhttp3.Headers;
import okhttp3.Headers$Builder;
import okhttp3.ResponseBody;
import okhttp3.CacheControl;
import java.util.List;
import java.lang.String;
import okhttp3.internal.http.HttpHeaders;
import java.util.Collections;
import java.lang.IllegalStateException;
import okhttp3.Handshake;
import okio.d;
import okio.b;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import java.lang.StringBuilder;
import okhttp3.HttpUrl;

public final class Response implements Closeable	// class@002093
{
    public final ResponseBody body;
    public CacheControl cacheControl;
    public final Response cacheResponse;
    public final int code;
    public final Handshake handshake;
    public final Headers headers;
    public final String message;
    public final Response networkResponse;
    public final Response priorResponse;
    public final Protocol protocol;
    public final long receivedResponseAtMillis;
    public final Request request;
    public final long sentRequestAtMillis;

    public void Response(Response$Builder p0){
       super();
       this.request = p0.request;
       this.protocol = p0.protocol;
       this.code = p0.code;
       this.message = p0.message;
       this.handshake = p0.handshake;
       this.headers = p0.headers.build();
       this.body = p0.body;
       this.networkResponse = p0.networkResponse;
       this.cacheResponse = p0.cacheResponse;
       this.priorResponse = p0.priorResponse;
       this.sentRequestAtMillis = p0.sentRequestAtMillis;
       this.receivedResponseAtMillis = p0.receivedResponseAtMillis;
    }
    public ResponseBody body(){
       return this.body;
    }
    public CacheControl cacheControl(){
       Response tcacheContro = this.cacheControl;
       if (tcacheContro != null) {
       }else {
          tcacheContro = CacheControl.parse(this.headers);
          this.cacheControl = tcacheContro;
       }
       return tcacheContro;
    }
    public Response cacheResponse(){
       return this.cacheResponse;
    }
    public List challenges(){
       String str;
       Response tcode = this.code;
       if (tcode == 401) {
          str = "WWW-Authenticate";
       }else if(tcode == 407){
          str = "Proxy-Authenticate";
       }else {
          return Collections.emptyList();
       }
       return HttpHeaders.parseChallenges(this.headers(), str);
    }
    public void close(){
       Response tbody = this.body;
       if (tbody == null) {
          throw new IllegalStateException("response is not eligible for a body and must not be closed");
       }
       tbody.close();
       return;
    }
    public int code(){
       return this.code;
    }
    public Handshake handshake(){
       return this.handshake;
    }
    public String header(String p0){
       return this.header(p0, null);
    }
    public String header(String p0,String p1){
       p0 = this.headers.get(p0);
       if (p0 != null) {
          p1 = p0;
       }
       return p1;
    }
    public List headers(String p0){
       return this.headers.values(p0);
    }
    public Headers headers(){
       return this.headers;
    }
    public boolean isRedirect(){
       Response tcode = this.code;
       if (tcode != 307 && tcode != 308) {
          switch (tcode){
              case 300:
              case 302:
              case 303:
              case 301:
              default:
                return false;
          }
       }
       return true;
    }
    public boolean isSuccessful(){
       Response tcode = this.code;
       boolean b = (tcode >= 200 && tcode < 300)? true: false;
       return b;
    }
    public String message(){
       return this.message;
    }
    public Response networkResponse(){
       return this.networkResponse;
    }
    public Response$Builder newBuilder(){
       return new Response$Builder(this);
    }
    public ResponseBody peekBody(long p0){
       d uod = this.body.source();
       uod.request(p0);
       b uob = uod.buffer().c();
       if (uob.p() - p0 > 0) {
          b uob1 = new b();
          uob1.write(uob, p0);
          uob.a();
          uob = uob1;
       }
       return ResponseBody.create(this.body.contentType(), uob.p(), uob);
    }
    public Response priorResponse(){
       return this.priorResponse;
    }
    public Protocol protocol(){
       return this.protocol;
    }
    public long receivedResponseAtMillis(){
       return this.receivedResponseAtMillis;
    }
    public Request request(){
       return this.request;
    }
    public long sentRequestAtMillis(){
       return this.sentRequestAtMillis;
    }
    public String toString(){
       return "Response{protocol="+this.protocol+", code="+this.code+", message="+this.message+", url="+this.request.url()+'}';
    }
}
