package okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import java.lang.Object;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.HttpUrl;
import okhttp3.Address;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.HostnameVerifier;
import okhttp3.CertificatePinner;
import java.lang.String;
import okhttp3.Dns;
import javax.net.SocketFactory;
import okhttp3.Authenticator;
import java.net.Proxy;
import java.util.List;
import java.net.ProxySelector;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.internal.http.UnrepeatableRequestBody;
import java.net.Proxy$Type;
import java.net.ProtocolException;
import okhttp3.Request$Builder;
import okhttp3.internal.http.HttpMethod;
import java.lang.IllegalStateException;
import okhttp3.Interceptor$Chain;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.ConnectionPool;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.connection.RealConnection;
import okhttp3.Response$Builder;
import okhttp3.ResponseBody;
import java.io.Closeable;
import okhttp3.internal.Util;
import java.lang.StringBuilder;
import java.net.HttpRetryException;
import okhttp3.internal.http2.ConnectionShutdownException;
import java.io.IOException;
import okhttp3.internal.connection.RouteException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import javax.net.ssl.SSLHandshakeException;
import java.lang.Throwable;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.io.FileNotFoundException;
import java.lang.Integer;

public final class RetryAndFollowUpInterceptor implements Interceptor	// class@0020bc
{
    public Object callStackTrace;
    public boolean canceled;
    public final OkHttpClient client;
    public final boolean forWebSocket;
    public StreamAllocation streamAllocation;

    public void RetryAndFollowUpInterceptor(OkHttpClient p0,boolean p1){
       super();
       this.client = p0;
       this.forWebSocket = p1;
    }
    public void cancel(){
       this.canceled = true;
       RetryAndFollowUpInterceptor tstreamAlloc = this.streamAllocation;
       if (tstreamAlloc != null) {
          tstreamAlloc.cancel();
       }
       return;
    }
    public final Address createAddress(HttpUrl p0){
       HostnameVerifier hostnameVeri;
       SSLSocketFactory sSLSocketFac1;
       CertificatePinner uCertificate;
       RetryAndFollowUpInterceptor retryAndFoll = this;
       SSLSocketFactory sSLSocketFac = null;
       if (p0.isHttps()) {
          hostnameVeri = retryAndFoll.client.hostnameVerifier();
          sSLSocketFac1 = retryAndFoll.client.sslSocketFactory();
          uCertificate = retryAndFoll.client.certificatePinner();
       }else {
          sSLSocketFac1 = sSLSocketFac;
          hostnameVeri = sSLSocketFac1;
          uCertificate = hostnameVeri;
       }
       Address uAddress = new Address(p0.host(), p0.port(), retryAndFoll.client.dns(), retryAndFoll.client.socketFactory(), sSLSocketFac1, hostnameVeri, uCertificate, retryAndFoll.client.proxyAuthenticator(), retryAndFoll.client.proxy(), retryAndFoll.client.protocols(), retryAndFoll.client.connectionSpecs(), retryAndFoll.client.proxySelector());
       return v1;
    }
    public final Request followUpRequest(Response p0,Route p1){
       boolean i1;
       if (p0 == null) {
          throw new IllegalStateException();
       }
       int i = p0.code();
       String str = p0.request().method();
       String str1 = "GET";
       Request request = null;
       if (i != 307 && i != 308) {
          if (i != 401) {
             i1 = 503;
             if (i != i1) {
                if (i != 407) {
                   RetryAndFollowUpInterceptor retryAndFoll = 408;
                   if (i != retryAndFoll) {
                      switch (i){
                          case 300:
                          case 302:
                          case 303:
                          case 301:
                            break;
                          default:
                            return request;
                      }
                   }else if(!this.client.retryOnConnectionFailure()){
                      return request;
                   }else if(p0.request().body() instanceof UnrepeatableRequestBody){
                      return request;
                   }else if(p0.priorResponse() != null && p0.priorResponse().code() == retryAndFoll){
                      return request;
                   }else if(this.retryAfter(p0, 0) > 0){
                      return request;
                   }else {
                      return p0.request();
                   }
                }else if(p1.proxy().type() == Proxy$Type.HTTP){
                   return this.client.proxyAuthenticator().authenticate(p1, p0);
                }else {
                   throw new ProtocolException("Received HTTP_PROXY_AUTH \(407\) code while not using proxy");
                }
             }else if(p0.priorResponse() != null && p0.priorResponse().code() == i1){
                return request;
             }else if(!this.retryAfter(p0, Integer.MAX_VALUE)){
                return p0.request();
             }else {
                return request;
             }
          }else {
             return this.client.authenticator().authenticate(p1, p0);
          }
       }else if(!str.equals(str1) && !str.equals("HEAD")){
          return request;
       }
       if (!this.client.followRedirects()) {
          return request;
       }else {
          String str2 = p0.header("Location");
          if (str2 == null) {
             return request;
          }else {
             HttpUrl httpUrl = p0.request().url().resolve(str2);
             if (httpUrl == null) {
                return request;
             }else if(!(httpUrl.scheme()).equals(p0.request().url().scheme()) && !this.client.followSslRedirects()){
                return request;
             }else {
                Request$Builder uBuilder = p0.request().newBuilder();
                if (HttpMethod.permitsRequestBody(str)) {
                   i1 = HttpMethod.redirectsWithBody(str);
                   if (HttpMethod.redirectsToGet(str)) {
                      uBuilder.method(str1, request);
                   }else if(i1){
                      request = p0.request().body();
                   }
                   uBuilder.method(str, request);
                   if (!i1) {
                      uBuilder.removeHeader("Transfer-Encoding");
                      uBuilder.removeHeader("Content-Length");
                      uBuilder.removeHeader("Content-Type");
                   }
                }
                if (!this.sameConnection(p0, httpUrl)) {
                   uBuilder.removeHeader("Authorization");
                }
                return uBuilder.url(httpUrl).build();
             }
          }
       }
    }
    public Response intercept(Interceptor$Chain p0){
       Response response1;
       RealInterceptorChain realIntercep = p0.request();
       Call uCall = p0.call();
       EventListener uEventListen = p0.eventListener();
       StreamAllocation streamAlloca = new StreamAllocation(this.client.connectionPool(), this.createAddress(realIntercep.url()), uCall, uEventListen, this.callStackTrace);
       this.streamAllocation = v9;
       Response response = null;
       int i = 0;
       while (true) {
          if (this.canceled == null) {
             try{
                response1 = p0.proceed(realIntercep, v9, null, null);
                if (response != null) {
                   response1 = response1.newBuilder().priorResponse(response.newBuilder().body(null).build()).build();
                }
                try{
                   Request request = this.followUpRequest(response1, v9.route());
                   if (request == null) {
                      break ;
                   }else {
                      Util.closeQuietly(response1.body());
                      int i1 = i + 1;
                      if (i1 <= 20) {
                         if (!request.body() instanceof UnrepeatableRequestBody) {
                            if (!this.sameConnection(response1, request.url())) {
                               v9.release();
                               streamAlloca = new StreamAllocation(this.client.connectionPool(), this.createAddress(request.url()), uCall, uEventListen, this.callStackTrace);
                               this.streamAllocation = v9;
                            }else if(v9.codec() == null){
                               throw new IllegalStateException("Closing the body of "+response1+" didn\'t close its backing stream. Bad interceptor?");
                            }
                            response = response1;
                            realIntercep = request;
                            i = i1;
                         }else {
                            v9.release();
                            throw new HttpRetryException("Cannot retry streamed HTTP body", response1.code());
                         }
                      }else {
                         v9.release();
                         throw new ProtocolException("Too many follow-up requests: "+i1);
                      }
                   }
                }catch(java.io.IOException e15){
                   v9.release();
                   throw e15;
                }
             }catch(okhttp3.internal.connection.RouteException e3){
                if (this.recover(e3.getLastConnectException(), v9, 0, response1)) {
                   goto label_002c ;
                }else {
                   throw e3.getFirstConnectException();
                }
             }catch(java.io.IOException e3){
                boolean b = (!e3 instanceof ConnectionShutdownException)? true: false;
                if (this.recover(e3, v9, b, response1)) {
                   goto label_002c ;
                }else {
                   throw e3;
                }
             }
          }else {
             v9.release();
             throw new IOException("Canceled");
          }
       }
       v9.release();
       return response1;
    }
    public boolean isCanceled(){
       return this.canceled;
    }
    public final boolean isRecoverable(IOException p0,boolean p1){
       boolean b = false;
       if (p0 instanceof ProtocolException) {
          return b;
       }
       if (p0 instanceof InterruptedIOException) {
          if (p0 instanceof SocketTimeoutException && !p1) {
             b = true;
          }
          return b;
       }else if(p0 instanceof SSLHandshakeException && p0.getCause() instanceof CertificateException){
          return b;
       }else if(p0 instanceof SSLPeerUnverifiedException){
          return b;
       }else {
          return true;
       }
    }
    public final boolean recover(IOException p0,StreamAllocation p1,boolean p2,Request p3){
       p1.streamFailed(p0);
       if (!this.client.retryOnConnectionFailure()) {
          return false;
       }
       if (p2 && this.requestIsUnrepeatable(p0, p3)) {
          return false;
       }
       if (!this.isRecoverable(p0, p2)) {
          return false;
       }
       if (!p1.hasMoreRoutes()) {
          return false;
       }
       return true;
    }
    public final boolean requestIsUnrepeatable(IOException p0,Request p1){
       boolean b = (p1.body() instanceof UnrepeatableRequestBody || p0 instanceof FileNotFoundException)? true: false;
       return b;
    }
    public final int retryAfter(Response p0,int p1){
       String str = p0.header("Retry-After");
       if (str == null) {
          return p1;
       }
       if (str.matches("\\d+")) {
          return Integer.valueOf(str).intValue();
       }
       return Integer.MAX_VALUE;
    }
    public final boolean sameConnection(Response p0,HttpUrl p1){
       HttpUrl httpUrl = p0.request().url();
       boolean b = ((httpUrl.host()).equals(p1.host()) && (httpUrl.port() == p1.port() && (httpUrl.scheme()).equals(p1.scheme())))? true: false;
       return b;
    }
    public void setCallStackTrace(Object p0){
       this.callStackTrace = p0;
    }
    public StreamAllocation streamAllocation(){
       return this.streamAllocation;
    }
}
