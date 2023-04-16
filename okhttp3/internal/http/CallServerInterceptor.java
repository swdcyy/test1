package okhttp3.internal.http.CallServerInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.Connection;
import okhttp3.internal.connection.RealConnection;
import okhttp3.Request;
import java.lang.System;
import okhttp3.EventListener;
import okhttp3.Call;
import java.lang.String;
import okhttp3.internal.http.HttpMethod;
import okhttp3.RequestBody;
import okhttp3.Response$Builder;
import okhttp3.internal.http.CallServerInterceptor$CountingSink;
import okio.m;
import okio.c;
import okio.l;
import cud.j;
import okhttp3.Handshake;
import okhttp3.internal.Util;
import okhttp3.ResponseBody;
import java.net.ProtocolException;
import java.lang.StringBuilder;

public final class CallServerInterceptor implements Interceptor	// class@0020b4
{
    public final boolean forWebSocket;

    public void CallServerInterceptor(boolean p0){
       super();
       this.forWebSocket = p0;
    }
    public Response intercept(Interceptor$Chain p0){
       HttpCodec httpCodec = p0.httpStream();
       StreamAllocation streamAlloca = p0.streamAllocation();
       RealConnection realConnecti = p0.connection();
       Request request = p0.request();
       long l = System.currentTimeMillis();
       p0.eventListener().requestHeadersStart(p0.call());
       httpCodec.writeRequestHeaders(request);
       p0.eventListener().requestHeadersEnd(p0.call(), request);
       Call uCall = null;
       if (HttpMethod.permitsRequestBody(request.method()) && request.body() != null) {
          if (("100-continue").equalsIgnoreCase(request.header("Expect"))) {
             httpCodec.flushRequest();
             p0.eventListener().responseHeadersStart(p0.call());
             uCall = httpCodec.readResponseHeaders(true);
          }
          if (uCall == null) {
             p0.eventListener().requestBodyStart(p0.call());
             CallServerInterceptor$CountingSink uCountingSin = new CallServerInterceptor$CountingSink(httpCodec.createRequestBody(request, request.body().contentLength()));
             c uoc = l.c(uCountingSin);
             request.body().writeTo(uoc);
             uoc.close();
             p0.eventListener().requestBodyEnd(p0.call(), uCountingSin.successfulCount);
          }else if(!realConnecti.isMultiplexed()){
             streamAlloca.noNewStreams();
          }
       }
    label_00a8 :
       httpCodec.finishRequest();
       boolean b = false;
       if (uCall == null) {
          p0.eventListener().responseHeadersStart(p0.call());
          uCall = httpCodec.readResponseHeaders(b);
       }
       Response response = uCall.request(request).handshake(streamAlloca.connection().handshake()).sentRequestAtMillis(l).receivedResponseAtMillis(System.currentTimeMillis()).build();
       int i = response.code();
       if (i == 100) {
          response = httpCodec.readResponseHeaders(b).request(request).handshake(streamAlloca.connection().handshake()).sentRequestAtMillis(l).receivedResponseAtMillis(System.currentTimeMillis()).build();
          i = response.code();
       }
       p0.eventListener().responseHeadersEnd(p0.call(), response);
       Response response1 = (this.forWebSocket != null && i == 101)? response.newBuilder().body(Util.EMPTY_RESPONSE).build(): response.newBuilder().body(httpCodec.openResponseBody(response)).build();
       String str = "Connection";
       if (("close").equalsIgnoreCase(response1.request().header(str)) || "close".equalsIgnoreCase(response1.header(str))) {
          streamAlloca.noNewStreams();
       }
       if (i == 204 || (i != 205 || response1.body().contentLength() - null <= 0)) {
          return response1;
       }else {
          throw new ProtocolException("HTTP "+i+" had non-zero Content-Length: "+response1.body().contentLength());
       }
    }
}
