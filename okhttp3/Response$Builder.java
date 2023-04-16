package okhttp3.Response$Builder;
import java.lang.Object;
import okhttp3.Headers$Builder;
import okhttp3.Response;
import okhttp3.Headers;
import java.lang.String;
import okhttp3.ResponseBody;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Request;

public class Response$Builder	// class@002092
{
    public ResponseBody body;
    public Response cacheResponse;
    public int code;
    public Handshake handshake;
    public Headers$Builder headers;
    public String message;
    public Response networkResponse;
    public Response priorResponse;
    public Protocol protocol;
    public long receivedResponseAtMillis;
    public Request request;
    public long sentRequestAtMillis;

    public void Response$Builder(){
       super();
       this.code = -1;
       this.headers = new Headers$Builder();
    }
    public void Response$Builder(Response p0){
       super();
       this.code = -1;
       this.request = p0.request;
       this.protocol = p0.protocol;
       this.code = p0.code;
       this.message = p0.message;
       this.handshake = p0.handshake;
       this.headers = p0.headers.newBuilder();
       this.body = p0.body;
       this.networkResponse = p0.networkResponse;
       this.cacheResponse = p0.cacheResponse;
       this.priorResponse = p0.priorResponse;
       this.sentRequestAtMillis = p0.sentRequestAtMillis;
       this.receivedResponseAtMillis = p0.receivedResponseAtMillis;
    }
    public Response$Builder addHeader(String p0,String p1){
       this.headers.add(p0, p1);
       return this;
    }
    public Response$Builder body(ResponseBody p0){
       this.body = p0;
       return this;
    }
    public Response build(){
       if (this.request == null) {
          throw new IllegalStateException("request == null");
       }
       if (this.protocol == null) {
          throw new IllegalStateException("protocol == null");
       }
       if (this.code < null) {
          throw new IllegalStateException("code < 0: "+this.code);
       }
       if (this.message != null) {
          return new Response(this);
       }
       throw new IllegalStateException("message == null");
    }
    public Response$Builder cacheResponse(Response p0){
       if (p0 != null) {
          this.checkSupportResponse("cacheResponse", p0);
       }
       this.cacheResponse = p0;
       return this;
    }
    public final void checkPriorResponse(Response p0){
       if (p0.body == null) {
          return;
       }
       throw new IllegalArgumentException("priorResponse.body != null");
    }
    public final void checkSupportResponse(String p0,Response p1){
       if (p1.body != null) {
          throw new IllegalArgumentException(p0+".body != null");
       }
       if (p1.networkResponse != null) {
          throw new IllegalArgumentException(p0+".networkResponse != null");
       }
       if (p1.cacheResponse != null) {
          throw new IllegalArgumentException(p0+".cacheResponse != null");
       }
       if (p1.priorResponse == null) {
          return;
       }
       throw new IllegalArgumentException(p0+".priorResponse != null");
    }
    public Response$Builder code(int p0){
       this.code = p0;
       return this;
    }
    public Response$Builder handshake(Handshake p0){
       this.handshake = p0;
       return this;
    }
    public Response$Builder header(String p0,String p1){
       this.headers.set(p0, p1);
       return this;
    }
    public Response$Builder headers(Headers p0){
       this.headers = p0.newBuilder();
       return this;
    }
    public Response$Builder message(String p0){
       this.message = p0;
       return this;
    }
    public Response$Builder networkResponse(Response p0){
       if (p0 != null) {
          this.checkSupportResponse("networkResponse", p0);
       }
       this.networkResponse = p0;
       return this;
    }
    public Response$Builder priorResponse(Response p0){
       if (p0 != null) {
          this.checkPriorResponse(p0);
       }
       this.priorResponse = p0;
       return this;
    }
    public Response$Builder protocol(Protocol p0){
       this.protocol = p0;
       return this;
    }
    public Response$Builder receivedResponseAtMillis(long p0){
       this.receivedResponseAtMillis = p0;
       return this;
    }
    public Response$Builder removeHeader(String p0){
       this.headers.removeAll(p0);
       return this;
    }
    public Response$Builder request(Request p0){
       this.request = p0;
       return this;
    }
    public Response$Builder sentRequestAtMillis(long p0){
       this.sentRequestAtMillis = p0;
       return this;
    }
}
