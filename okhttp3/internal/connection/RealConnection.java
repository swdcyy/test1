package okhttp3.internal.connection.RealConnection;
import okhttp3.Connection;
import okhttp3.internal.http2.Http2Connection$Listener;
import okhttp3.ConnectionPool;
import okhttp3.Route;
import java.util.ArrayList;
import java.net.Socket;
import okhttp3.internal.Util;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Address;
import java.util.List;
import okhttp3.internal.connection.ConnectionSpecSelector;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.ConnectionSpec;
import java.lang.Object;
import okhttp3.HttpUrl;
import java.lang.String;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.connection.RouteException;
import java.net.UnknownServiceException;
import java.lang.StringBuilder;
import java.io.IOException;
import okhttp3.Protocol;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProtocolException;
import okhttp3.internal.http2.Http2Connection;
import java.lang.IllegalStateException;
import java.net.Proxy$Type;
import javax.net.SocketFactory;
import okio.n;
import okio.l;
import okio.d;
import okio.m;
import okio.c;
import java.lang.NullPointerException;
import java.lang.Throwable;
import java.net.ConnectException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSession;
import okhttp3.Handshake;
import javax.net.ssl.HostnameVerifier;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.security.cert.Certificate;
import okhttp3.CertificatePinner;
import java.security.Principal;
import okhttp3.internal.tls.OkHostnameVerifier;
import java.lang.AssertionError;
import okhttp3.Request;
import okhttp3.internal.http1.Http1Codec;
import okhttp3.OkHttpClient;
import okhttp3.internal.connection.StreamAllocation;
import okio.o;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.Response$Builder;
import okhttp3.Response;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.Authenticator;
import okio.b;
import okhttp3.Request$Builder;
import okhttp3.RequestBody;
import okhttp3.internal.Version;
import okhttp3.ResponseBody;
import okhttp3.internal.Internal;
import java.lang.System;
import okhttp3.Interceptor$Chain;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http2.Http2Codec;
import okhttp3.internal.ws.RealWebSocket$Streams;
import okhttp3.internal.connection.RealConnection$1;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection$Builder;
import okhttp3.CipherSuite;

public final class RealConnection extends Http2Connection$Listener implements Connection	// class@0020ab
{
    public int allocationLimit;
    public final List allocations;
    public final ConnectionPool connectionPool;
    public Handshake handshake;
    public Http2Connection http2Connection;
    public long idleAtNanos;
    public boolean noNewStreams;
    public Protocol protocol;
    public Socket rawSocket;
    public final Route route;
    public c sink;
    public Socket socket;
    public d source;
    public int successCount;

    public void RealConnection(ConnectionPool p0,Route p1){
       super();
       this.allocationLimit = 1;
       this.allocations = new ArrayList();
       this.idleAtNanos = Long.MAX_VALUE;
       this.connectionPool = p0;
       this.route = p1;
    }
    public static RealConnection testConnection(ConnectionPool p0,Route p1,Socket p2,long p3){
       RealConnection realConnecti = new RealConnection(p0, p1);
       realConnecti.socket = p2;
       realConnecti.idleAtNanos = p3;
       return realConnecti;
    }
    public void cancel(){
       Util.closeQuietly(this.rawSocket);
    }
    public void connect(int p0,int p1,int p2,int p3,boolean p4,Call p5,EventListener p6){
       int i1;
       RouteException routeExcepti;
       RealConnection this;
       RealConnection realConnecti = this;
       Call uCall = p5;
       EventListener uEventListen = p6;
       if (realConnecti.protocol != null) {
          throw new IllegalStateException("already connected");
       }
       List list = realConnecti.route.address().connectionSpecs();
       ConnectionSpecSelector uConnectionS = new ConnectionSpecSelector(list);
       if (realConnecti.route.address().sslSocketFactory() == null) {
          if (list.contains(ConnectionSpec.CLEARTEXT)) {
             String str = realConnecti.route.address().url().host();
             if (!Platform.get().isCleartextTrafficPermitted(str)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication to "+str+" not permitted by network security policy"));
             }
          }else {
             throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
          }
       }else if(!realConnecti.route.address().protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE)){
          throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
       }
       int i = 0;
       try{
       label_0088 :
          if (realConnecti.route.requiresTunnel()) {
             this.connectTunnel(p0, p1, p2, p5, p6);
             if (realConnecti.rawSocket == null) {
             label_00c6 :
                if (!realConnecti.route.requiresTunnel() || realConnecti.rawSocket != null) {
                   if (realConnecti.http2Connection != null) {
                      this = realConnecti.connectionPool;
                      _monitor_enter(this);
                      realConnecti.allocationLimit = realConnecti.http2Connection.maxConcurrentStreams();
                      _monitor_exit(this);
                   }
                   return;
                }else {
                   throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
                }
             }else {
                i1 = p1;
             }
          }else {
             int i3 = p0;
             i1 = p1;
             realConnecti.connectSocket(i3, i1, uCall, uEventListen);
          }
          int i2 = p3;
          realConnecti.establishProtocol(uConnectionS, i2, uCall, uEventListen);
          uEventListen.connectEnd(uCall, realConnecti.route.socketAddress(), realConnecti.route.proxy(), realConnecti.protocol);
          goto label_00c6 ;
       }catch(java.io.IOException e0){
          i1 = p1;
       }catch(java.io.IOException e0){
       }catch(java.io.IOException e0){
       }
       Util.closeQuietly(realConnecti.socket);
       Util.closeQuietly(realConnecti.rawSocket);
       realConnecti.socket = null;
       realConnecti.rawSocket = null;
       realConnecti.source = null;
       realConnecti.sink = null;
       realConnecti.handshake = null;
       realConnecti.protocol = null;
       realConnecti.http2Connection = null;
       p6.connectFailed(p5, realConnecti.route.socketAddress(), realConnecti.route.proxy(), null, e0);
       if (!i) {
          routeExcepti = new RouteException(e0);
       }else {
          i.addConnectException(e0);
       }
       if (p4 && uConnectionS.connectionFailed(e0)) {
          goto label_0088 ;
       }else {
          throw routeExcepti;
       }
    }
    public final void connectSocket(int p0,int p1,Call p2,EventListener p3){
       Proxy proxy = this.route.proxy();
       Address uAddress = this.route.address();
       Socket socket = (proxy.type() == Proxy$Type.DIRECT || proxy.type() == Proxy$Type.HTTP)? uAddress.socketFactory().createSocket(): new Socket(proxy);
       this.rawSocket = socket;
       p3.connectStart(p2, this.route.socketAddress(), proxy);
       RealConnection trawSocket = this.rawSocket;
       try{
          trawSocket.setSoTimeout(p1);
          Platform platform = Platform.get();
          trawSocket = this.rawSocket;
          InetSocketAddress inetSocketAd = this.route.socketAddress();
          try{
             platform.connectSocket(trawSocket, inetSocketAd, p0);
             this.source = l.d(l.l(this.rawSocket));
             this.sink = l.c(l.h(this.rawSocket));
          }catch(java.lang.NullPointerException e5){
             if (!("throw with null exception").equals(e5.getMessage())) {
             }else {
                throw new IOException(e5);
             }
          }
          return;
       }catch(java.net.ConnectException e5){
          ConnectException uConnectExce = new ConnectException("Failed to connect to "+this.route.socketAddress());
          uConnectExce.initCause(e5);
          throw uConnectExce;
       }
    }
    public final void connectTls(ConnectionSpecSelector p0){
       String selectedProt;
       Address uAddress = this.route.address();
       SSLSocketFactory sSLSocketFac = uAddress.sslSocketFactory();
       try{
          int i = 0;
          SSLSocket sSLSocket = sSLSocketFac.createSocket(this.rawSocket, uAddress.url().host(), uAddress.url().port(), true);
          try{
             ConnectionSpec uConnectionS = p0.configureSecureSocket(sSLSocket);
             if (uConnectionS.supportsTlsExtensions()) {
                Platform.get().configureTlsExtensions(sSLSocket, uAddress.url().host(), uAddress.protocols());
             }
             sSLSocket.startHandshake();
             SSLSession session = sSLSocket.getSession();
             Handshake handshake = Handshake.get(session);
             if (!uAddress.hostnameVerifier().verify(uAddress.url().host(), session)) {
                List list = handshake.peerCertificates();
                if (!list.isEmpty()) {
                   X509Certificate x509Certific = list.get(0);
                   throw new SSLPeerUnverifiedException("Hostname "+uAddress.url().host()+" not verified:\n    certificate: "+CertificatePinner.pin(x509Certific)+"\n    DN: "+x509Certific.getSubjectDN().getName()+"\n    subjectAltNames: "+OkHostnameVerifier.allSubjectAltNames(x509Certific));
                }else {
                   throw new SSLPeerUnverifiedException("Hostname "+uAddress.url().host()+" not verified \(no certificates\)");
                }
             }else {
                uAddress.certificatePinner().check(uAddress.url().host(), handshake.peerCertificates());
                if (uConnectionS.supportsTlsExtensions()) {
                   selectedProt = Platform.get().getSelectedProtocol(sSLSocket);
                }
                this.socket = sSLSocket;
                this.source = l.d(l.l(sSLSocket));
                this.sink = l.c(l.h(this.socket));
                this.handshake = handshake;
                Protocol protocol = (selectedProt != null)? Protocol.get(selectedProt): Protocol.HTTP_1_1;
                this.protocol = protocol;
                Platform.get().afterHandshake(sSLSocket);
                return;
             }
          }catch(java.lang.AssertionError e8){
             i = sSLSocket;
          }
          if (Util.isAndroidGetsocknameError(e8)) {
             throw new IOException(e8);
          }else {
             throw e8;
          }
       }catch(java.lang.AssertionError e8){
          goto label_012f ;
       }
    }
    public final void connectTunnel(int p0,int p1,int p2,Call p3,EventListener p4){
       Request request = this.createTunnelRequest();
       HttpUrl httpUrl = request.url();
       for (int i = 0; i < 21; i = i + 1) {
          this.connectSocket(p0, p1, p3, p4);
          if (this.createTunnel(p1, p2, request, httpUrl) == null) {
             break ;
          }else {
             Util.closeQuietly(this.rawSocket);
             Socket socket = null;
             this.rawSocket = socket;
             this.sink = socket;
             this.source = socket;
             p4.connectEnd(p3, this.route.socketAddress(), this.route.proxy(), socket);
          }
       }
       return;
    }
    public final Request createTunnel(int p0,int p1,Request p2,HttpUrl p3){
       Request request;
       String str = "CONNECT "+Util.hostHeader(p3, true)+" HTTP/1.1";
       Http1Codec http1Codec = new Http1Codec(null, null, this.source, this.sink);
       TimeUnit mILLISECONDS = TimeUnit.MILLISECONDS;
       this.source.timeout().timeout((long)p0, mILLISECONDS);
       this.sink.timeout().timeout((long)p1, mILLISECONDS);
       http1Codec.writeRequest(p2.headers(), str);
       http1Codec.finishRequest();
       Response response = http1Codec.readResponseHeaders(false).request(p2).build();
       long l = HttpHeaders.contentLength(response);
       while (!l - -1) {
          l = 0;
          break ;
          response = request;
       }
       n on = http1Codec.newFixedLengthSource(l);
       Util.skipAll(on, Integer.MAX_VALUE, mILLISECONDS);
       on.close();
       int i = response.code();
       if (i != 200) {
          if (i != 407) {
             throw new IOException("Unexpected response code for CONNECT: "+response.code());
          }
          request = this.route.address().proxyAuthenticator().authenticate(this.route, response);
          if (request == null) {
             throw new IOException("Failed to authenticate with proxy");
          }
          if (("close").equalsIgnoreCase(response.header("Connection"))) {
             return request;
          }
       }else if(this.source.buffer().exhausted() && this.sink.buffer().exhausted()){
          return null;
       }else {
          throw new IOException("TLS tunnel buffered too many bytes!");
       }
    }
    public final Request createTunnelRequest(){
       Request request = new Request$Builder().url(this.route.address().url()).method("CONNECT", null).header("Host", Util.hostHeader(this.route.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header("User-Agent", Version.userAgent()).build();
       Request request1 = this.route.address().proxyAuthenticator().authenticate(this.route, new Response$Builder().request(request).protocol(Protocol.HTTP_1_1).code(407).message("Preemptive Authenticate").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1).receivedResponseAtMillis(-1).header("Proxy-Authenticate", "OkHttp-Preemptive").build());
       if (request1 != null) {
          request = request1;
       }
       return request;
    }
    public final void establishProtocol(ConnectionSpecSelector p0,int p1,Call p2,EventListener p3){
       if (this.route.address().sslSocketFactory() == null) {
          Protocol h2_PRIOR_KNO = Protocol.H2_PRIOR_KNOWLEDGE;
          if (this.route.address().protocols().contains(h2_PRIOR_KNO)) {
             this.socket = this.rawSocket;
             this.protocol = h2_PRIOR_KNO;
             this.startHttp2(p1);
             return;
          }else {
             this.socket = this.rawSocket;
             this.protocol = Protocol.HTTP_1_1;
             return;
          }
       }else {
          p3.secureConnectStart(p2);
          this.connectTls(p0);
          p3.secureConnectEnd(p2, this.handshake);
          if (this.protocol == Protocol.HTTP_2) {
             this.startHttp2(p1);
          }
          return;
       }
    }
    public Handshake handshake(){
       return this.handshake;
    }
    public boolean isEligible(Address p0,Route p1){
       if (this.allocations.size() >= this.allocationLimit || this.noNewStreams != null) {
          return false;
       }
       if (!Internal.instance.equalsNonHost(this.route.address(), p0)) {
          return false;
       }
       if ((p0.url().host()).equals(this.route().address().url().host())) {
          return true;
       }
       if (this.http2Connection == null) {
          return false;
       }
       if (p1 == null) {
          return false;
       }
       if (p1.proxy().type() != Proxy$Type.DIRECT) {
          return false;
       }
       if (this.route.proxy().type() != Proxy$Type.DIRECT) {
          return false;
       }
       if (!this.route.socketAddress().equals(p1.socketAddress())) {
          return false;
       }
       if (p1.address().hostnameVerifier() != OkHostnameVerifier.INSTANCE) {
          return false;
       }
       if (!this.supportsUrl(p0.url())) {
          return false;
       }
       try{
          p0.certificatePinner().check(p0.url().host(), this.handshake().peerCertificates());
          return true;
       }catch(javax.net.ssl.SSLPeerUnverifiedException e0){
       }
    }
    public boolean isHealthy(boolean p0){
       boolean b = false;
       if (!this.socket.isClosed() && (this.socket.isInputShutdown() || this.socket.isOutputShutdown())) {
          return b;
       }
       RealConnection thttp2Connec = this.http2Connection;
       if (thttp2Connec != null) {
          return thttp2Connec.isHealthy(System.nanoTime());
       }
       if (!p0) {
          return e0;
       }
       try{
          int soTimeout = this.socket.getSoTimeout();
          this.socket.setSoTimeout(1);
          if (this.source.exhausted()) {
             this.socket.setSoTimeout(soTimeout);
             return b;
          }else {
             this.socket.setSoTimeout(soTimeout);
             return 1;
          }
       }catch(java.net.SocketTimeoutException e0){
       }catch(java.io.IOException e0){
          return b;
       }
    }
    public boolean isMultiplexed(){
       boolean b = (this.http2Connection != null)? true: false;
       return b;
    }
    public HttpCodec newCodec(OkHttpClient p0,Interceptor$Chain p1,StreamAllocation p2){
       if (this.http2Connection != null) {
          return new Http2Codec(p0, p1, p2, this.http2Connection);
       }
       this.socket.setSoTimeout(p1.readTimeoutMillis());
       TimeUnit mILLISECONDS = TimeUnit.MILLISECONDS;
       this.source.timeout().timeout((long)p1.readTimeoutMillis(), mILLISECONDS);
       this.sink.timeout().timeout((long)p1.writeTimeoutMillis(), mILLISECONDS);
       return new Http1Codec(p0, p2, this.source, this.sink);
    }
    public RealWebSocket$Streams newWebSocketStreams(StreamAllocation p0){
       RealConnection$1 u1 = new RealConnection$1(this, true, this.source, this.sink, p0);
       return v6;
    }
    public void onSettings(Http2Connection p0){
       RealConnection tconnectionP = this.connectionPool;
       _monitor_enter(tconnectionP);
       this.allocationLimit = p0.maxConcurrentStreams();
       _monitor_exit(tconnectionP);
    }
    public void onStream(Http2Stream p0){
       p0.close(ErrorCode.REFUSED_STREAM);
    }
    public Protocol protocol(){
       return this.protocol;
    }
    public Route route(){
       return this.route;
    }
    public Socket socket(){
       return this.socket;
    }
    public final void startHttp2(int p0){
       this.socket.setSoTimeout(0);
       Http2Connection http2Connect = new Http2Connection$Builder(true).socket(this.socket, this.route.address().url().host(), this.source, this.sink).listener(this).pingIntervalMillis(p0).build();
       this.http2Connection = http2Connect;
       http2Connect.start();
    }
    public boolean supportsUrl(HttpUrl p0){
       boolean b = false;
       if (p0.port() != this.route.address().url().port()) {
          return b;
       }
       if ((p0.host()).equals(this.route.address().url().host())) {
          return true;
       }
       if (this.handshake != null && OkHostnameVerifier.INSTANCE.verify(p0.host(), this.handshake.peerCertificates().get(b))) {
          b = true;
       }
       return b;
    }
    public String toString(){
       StringBuilder str = "Connection{"+this.route.address().url().host()+":"+this.route.address().url().port()+", proxy="+this.route.proxy()+" hostAddress="+this.route.socketAddress()+" cipherSuite=";
       RealConnection thandshake = this.handshake;
       CipherSuite uCipherSuite = (thandshake != null)? thandshake.cipherSuite(): "none";
       return str+uCipherSuite+" protocol="+this.protocol+'}';
    }
}
