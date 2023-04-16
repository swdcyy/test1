package okhttp3.internal.huc.OkHttpURLConnection;
import okhttp3.Callback;
import java.net.HttpURLConnection;
import java.lang.StringBuilder;
import okhttp3.internal.platform.Platform;
import java.lang.String;
import java.util.LinkedHashSet;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.net.URL;
import okhttp3.OkHttpClient;
import okhttp3.internal.huc.OkHttpURLConnection$NetworkInterceptor;
import okhttp3.Headers$Builder;
import okhttp3.internal.URLFilter;
import java.lang.Throwable;
import java.io.IOException;
import java.lang.Error;
import java.lang.RuntimeException;
import java.lang.AssertionError;
import okhttp3.Response;
import java.lang.Character;
import okio.b;
import java.util.Objects;
import java.lang.IllegalStateException;
import okhttp3.Call;
import okhttp3.internal.http.HttpMethod;
import java.net.ProtocolException;
import java.lang.Long;
import okhttp3.internal.huc.StreamedRequestBody;
import okhttp3.internal.huc.BufferedRequestBody;
import okio.o;
import okhttp3.internal.huc.OutputStreamRequestBody;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import okhttp3.Request$Builder;
import okhttp3.Headers;
import okhttp3.RequestBody;
import okhttp3.Request;
import okhttp3.OkHttpClient$Builder;
import okhttp3.internal.huc.OkHttpURLConnection$UnexpectedException;
import okhttp3.Dispatcher;
import java.util.concurrent.ExecutorService;
import okhttp3.Cache;
import okhttp3.internal.Internal;
import java.lang.IllegalArgumentException;
import java.net.UnknownHostException;
import java.net.MalformedURLException;
import java.lang.Thread;
import java.io.InterruptedIOException;
import java.lang.System;
import okhttp3.internal.Version;
import java.io.InputStream;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.ResponseBody;
import okhttp3.internal.http.StatusLine;
import java.util.Map;
import okhttp3.internal.JavaNetHeaders;
import java.util.Collections;
import okhttp3.Protocol;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.security.Permission;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.net.SocketPermission;
import okhttp3.Handshake;
import java.lang.Math;
import java.net.URLConnection;
import java.util.Date;
import okhttp3.internal.http.HttpDate;
import java.util.Set;
import java.net.Proxy$Type;

public final class OkHttpURLConnection extends HttpURLConnection implements Callback	// class@001fc3
{
    public Call call;
    public Throwable callFailure;
    public OkHttpClient client;
    public boolean connectPending;
    public boolean executed;
    public long fixedContentLength;
    public Handshake handshake;
    public final Object lock;
    public final OkHttpURLConnection$NetworkInterceptor networkInterceptor;
    public Response networkResponse;
    public Proxy proxy;
    public Headers$Builder requestHeaders;
    public Response response;
    public Headers responseHeaders;
    public URLFilter urlFilter;
    public static final Set METHODS;
    public static final String RESPONSE_SOURCE;
    public static final String SELECTED_PROTOCOL;

    static {
       OkHttpURLConnection.SELECTED_PROTOCOL = Platform.get().getPrefix()+"-Selected-Protocol";
       OkHttpURLConnection.RESPONSE_SOURCE = Platform.get().getPrefix()+"-Response-Source";
       String[] stringArray = new String[]{"OPTIONS","GET","HEAD","POST","PUT","DELETE","TRACE","PATCH"};
       OkHttpURLConnection.METHODS = new LinkedHashSet(Arrays.asList(stringArray));
    }
    public void OkHttpURLConnection(URL p0,OkHttpClient p1){
       super(p0);
       this.networkInterceptor = new OkHttpURLConnection$NetworkInterceptor(this);
       this.requestHeaders = new Headers$Builder();
       this.fixedContentLength = -1;
       this.lock = new Object();
       this.connectPending = true;
       this.client = p1;
    }
    public void OkHttpURLConnection(URL p0,OkHttpClient p1,URLFilter p2){
       super(p0, p1);
       this.urlFilter = p2;
    }
    public static URL access$102(OkHttpURLConnection p0,URL p1){
       p0.url = p1;
       return p1;
    }
    public static IOException propagate(Throwable p0){
       if (p0 instanceof IOException) {
          throw p0;
       }
       if (p0 instanceof Error) {
          throw p0;
       }
       if (p0 instanceof RuntimeException) {
          throw p0;
       }
       throw new AssertionError();
    }
    public static String responseSourceHeader(Response p0){
       if (p0.networkResponse() == null) {
          if (p0.cacheResponse() == null) {
             return "NONE";
          }
          return "CACHE "+p0.code();
       }else if(p0.cacheResponse() == null){
          return "NETWORK "+p0.code();
       }else {
          return "CONDITIONAL_CACHE "+p0.networkResponse().code();
       }
    }
    public static String toHumanReadableAscii(String p0){
       int i = p0.length();
       int i1 = 0;
       for (int i2 = 0; i2 < i; i2 = i2 + Character.charCount(i3)) {
          int i3 = p0.codePointAt(i2);
          if (i3 > 31 && i3 < 127) {
          }else {
             b uob = new b();
             uob.Q(p0, i1, i2);
             uob.R(63);
             i2 = i2 + Character.charCount(i3);
             while (i2 < i) {
                i3 = p0.codePointAt(i2);
                int i4 = (i3 > 31 && i3 < 127)? i3: 63;
                uob.R(i4);
             }
             p0 = uob.readUtf8();
          }
       }
       return p0;
    }
    public void addRequestProperty(String p0,String p1){
       if (this.connected != null) {
          throw new IllegalStateException("Cannot add request property after connection is made");
       }
       Objects.requireNonNull(p0, "field == null");
       if (p1 == null) {
          Platform.get().log(5, "Ignoring header "+p0+" because its value was null.", null);
          return;
       }else {
          this.requestHeaders.add(p0, p1);
          return;
       }
    }
    public final Call buildCall(){
       StreamedRequestBody streamedRequ;
       OkHttpURLConnection tcall = this.call;
       if (tcall != null) {
          return tcall;
       }
       boolean b = true;
       this.connected = b;
       if (this.doOutput != null) {
          if ((this.method).equals("GET")) {
             this.method = "POST";
          }else if(HttpMethod.permitsRequestBody(this.method)){
             throw new ProtocolException(this.method+" does not support writing");
          }
       }
       String str = "User-Agent";
       if (this.requestHeaders.get(str) == null) {
          this.requestHeaders.add(str, this.defaultUserAgent());
       }
       if (HttpMethod.permitsRequestBody(this.method)) {
          String str1 = "Content-Type";
          if (this.requestHeaders.get(str1) == null) {
             this.requestHeaders.add(str1, "application/x-www-form-urlencoded");
          }
          long l = -1;
          if (!this.fixedContentLength - l && this.chunkLength <= null) {
             b = false;
          }
          String str2 = this.requestHeaders.get("Content-Length");
          OkHttpURLConnection tfixedConten = this.fixedContentLength;
          if (tfixedConten - l) {
             l = tfixedConten;
          }else if(str2 != null){
             l = Long.parseLong(str2);
          }
          streamedRequ = (b)? new StreamedRequestBody(l): new BufferedRequestBody(l);
          streamedRequ.timeout().timeout((long)this.client.writeTimeoutMillis(), TimeUnit.MILLISECONDS);
       }else {
          streamedRequ = null;
       }
       try{
          Request request = new Request$Builder().url(HttpUrl.get(this.getURL().toString())).headers(this.requestHeaders.build()).method(this.method, streamedRequ).build();
          OkHttpURLConnection turlFilter = this.urlFilter;
          if (turlFilter != null) {
             turlFilter.checkURLPermitted(request.url().url());
          }
          OkHttpClient$Builder uBuilder = this.client.newBuilder();
          uBuilder.interceptors().clear();
          uBuilder.interceptors().add(OkHttpURLConnection$UnexpectedException.INTERCEPTOR);
          uBuilder.networkInterceptors().clear();
          uBuilder.networkInterceptors().add(this.networkInterceptor);
          uBuilder.dispatcher(new Dispatcher(this.client.dispatcher().executorService()));
          if (!this.getUseCaches()) {
             uBuilder.cache(null);
          }
          Call uCall = uBuilder.build().newCall(request);
          this.call = uCall;
          return uCall;
       }catch(java.lang.IllegalArgumentException e0){
          if (Internal.instance.isInvalidHttpUrlHost(e0)) {
             UnknownHostException unknownHostE = new UnknownHostException();
             unknownHostE.initCause(e0);
             throw unknownHostE;
          }else {
             MalformedURLException malformedURL = new MalformedURLException();
             malformedURL.initCause(e0);
             throw malformedURL;
          }
       }
    }
    public void connect(){
       if (this.executed != null) {
          return;
       }
       this.executed = true;
       this.buildCall().enqueue(this);
       OkHttpURLConnection tlock = this.lock;
       _monitor_enter(tlock);
       try{
          while (this.connectPending != null && (this.response == null && this.callFailure == null)) {
             this.lock.wait();
          }
          OkHttpURLConnection tcallFailure = this.callFailure;
          if (tcallFailure != null) {
             throw OkHttpURLConnection.propagate(tcallFailure);
          }
          _monitor_exit(tlock);
          return;
       }catch(java.lang.InterruptedException e0){
          Thread.currentThread().interrupt();
          throw new InterruptedIOException();
       }
    }
    public final String defaultUserAgent(){
       String property = System.getProperty("http.agent");
       property = (property != null)? OkHttpURLConnection.toHumanReadableAscii(property): Version.userAgent();
       return property;
    }
    public void disconnect(){
       if (this.call == null) {
          return;
       }
       this.networkInterceptor.proceed();
       this.call.cancel();
       return;
    }
    public int getConnectTimeout(){
       return this.client.connectTimeoutMillis();
    }
    public InputStream getErrorStream(){
       boolean b = true;
       InputStream inputStream = null;
       try{
          Response response = this.getResponse(b);
          if (HttpHeaders.hasBody(response) && response.code() >= 400) {
             return response.body().byteStream();
          }
          return inputStream;
       }catch(java.io.IOException e0){
       }
    }
    public String getHeaderField(int p0){
       String str = null;
       try{
          Headers headers = this.getHeaders();
          if (p0 < 0 || p0 >= headers.size()) {
             return e0;
          }
          return headers.value(p0);
       }catch(java.io.IOException e0){
       }
    }
    public String getHeaderField(String p0){
       boolean b;
       try{
          if (p0 == null) {
             b = true;
             b = StatusLine.get(this.getResponse(b)).toString();
          }else {
             p0 = this.getHeaders().get(p0);
          }
          return b;
       }catch(java.io.IOException e0){
          return null;
       }
    }
    public String getHeaderFieldKey(int p0){
       String str = null;
       try{
          Headers headers = this.getHeaders();
          if (p0 < 0 || p0 >= headers.size()) {
             return e0;
          }
          return headers.name(p0);
       }catch(java.io.IOException e0){
       }
    }
    public Map getHeaderFields(){
       try{
          return JavaNetHeaders.toMultimap(this.getHeaders(), StatusLine.get(this.getResponse(true)).toString());
       }catch(java.io.IOException e0){
          return Collections.emptyMap();
       }
    }
    public final Headers getHeaders(){
       if (this.responseHeaders == null) {
          Response response = this.getResponse(true);
          this.responseHeaders = response.headers().newBuilder().add(OkHttpURLConnection.SELECTED_PROTOCOL, response.protocol().toString()).add(OkHttpURLConnection.RESPONSE_SOURCE, OkHttpURLConnection.responseSourceHeader(response)).build();
       }
       return this.responseHeaders;
    }
    public InputStream getInputStream(){
       if (this.doInput == null) {
          throw new ProtocolException("This protocol does not support input");
       }
       Response response = this.getResponse(false);
       if (response.code() < 400) {
          return response.body().byteStream();
       }
       throw new FileNotFoundException(this.url.toString());
    }
    public boolean getInstanceFollowRedirects(){
       return this.client.followRedirects();
    }
    public OutputStream getOutputStream(){
       OutputStreamRequestBody outputStream = this.buildCall().request().body();
       if (outputStream == null) {
          throw new ProtocolException("method does not support a request body: "+this.method);
       }
       if (outputStream instanceof StreamedRequestBody) {
          this.connect();
          this.networkInterceptor.proceed();
       }
       if (!outputStream.isClosed()) {
          return outputStream.outputStream();
       }else {
          throw new ProtocolException("cannot write request body after response has been read");
       }
    }
    public Permission getPermission(){
       URL uRL = this.getURL();
       String host = uRL.getHost();
       int port = (uRL.getPort() != -1)? uRL.getPort(): HttpUrl.defaultPort(uRL.getProtocol());
       if (this.usingProxy()) {
          InetSocketAddress inetSocketAd = this.client.proxy().address();
          host = inetSocketAd.getHostName();
          port = inetSocketAd.getPort();
       }
       return new SocketPermission(host+":"+port, "connect, resolve");
    }
    public int getReadTimeout(){
       return this.client.readTimeoutMillis();
    }
    public Map getRequestProperties(){
       if (this.connected == null) {
          return JavaNetHeaders.toMultimap(this.requestHeaders.build(), null);
       }
       throw new IllegalStateException("Cannot access request header fields after connection is set");
    }
    public String getRequestProperty(String p0){
       if (p0 == null) {
          return null;
       }
       return this.requestHeaders.get(p0);
    }
    public final Response getResponse(boolean p0){
       OkHttpURLConnection tlock = this.lock;
       _monitor_enter(tlock);
       OkHttpURLConnection tresponse = this.response;
       if (tresponse != null) {
          _monitor_exit(tlock);
          return tresponse;
       }else {
          tresponse = this.callFailure;
          if (tresponse != null) {
             if (p0) {
                OkHttpURLConnection tnetworkResp = this.networkResponse;
                if (tnetworkResp != null) {
                   _monitor_exit(tlock);
                   return tnetworkResp;
                }
             }
             throw OkHttpURLConnection.propagate(tresponse);
          }else {
             _monitor_exit(tlock);
             Call uCall = this.buildCall();
             this.networkInterceptor.proceed();
             OutputStreamRequestBody outputStream = uCall.request().body();
             if (outputStream != null) {
                outputStream.outputStream().close();
             }
             if (this.executed != null) {
                tlock = this.lock;
                _monitor_enter(tlock);
                try{
                   while (this.response == null && this.callFailure == null) {
                      this.lock.wait();
                   }
                   _monitor_exit(tlock);
                }catch(java.lang.InterruptedException e0){
                   Thread.currentThread().interrupt();
                   throw new InterruptedIOException();
                }
             }else {
                this.executed = true;
                try{
                   this.onResponse(uCall, uCall.execute());
                }catch(java.io.IOException e0){
                   this.onFailure(uCall, e0);
                }
             }
          }
       }
    }
    public int getResponseCode(){
       return this.getResponse(true).code();
    }
    public String getResponseMessage(){
       return this.getResponse(true).message();
    }
    public void onFailure(Call p0,IOException p1){
       Throwable cause;
       OkHttpURLConnection tlock = this.lock;
       _monitor_enter(tlock);
       if (p1 instanceof OkHttpURLConnection$UnexpectedException) {
          cause = p1.getCause();
       }
       this.callFailure = cause;
       this.lock.notifyAll();
       _monitor_exit(tlock);
       return;
    }
    public void onResponse(Call p0,Response p1){
       OkHttpURLConnection tlock = this.lock;
       _monitor_enter(tlock);
       this.response = p1;
       this.handshake = p1.handshake();
       this.url = p1.request().url().url();
       this.lock.notifyAll();
       _monitor_exit(tlock);
    }
    public void setConnectTimeout(int p0){
       this.client = this.client.newBuilder().connectTimeout((long)p0, TimeUnit.MILLISECONDS).build();
    }
    public void setFixedLengthStreamingMode(int p0){
       this.setFixedLengthStreamingMode((long)p0);
    }
    public void setFixedLengthStreamingMode(long p0){
       if (this.connected != null) {
          throw new IllegalStateException("Already connected");
       }
       if (this.chunkLength > null) {
          throw new IllegalStateException("Already in chunked mode");
       }
       if (p0 < 0) {
          throw new IllegalArgumentException("contentLength < 0");
       }
       this.fixedContentLength = p0;
       this.fixedContentLength = (int)Math.min(p0, 0x7fffffff);
       return;
    }
    public void setIfModifiedSince(long p0){
       super.setIfModifiedSince(p0);
       if (this.ifModifiedSince - null) {
          this.requestHeaders.set("If-Modified-Since", HttpDate.format(new Date(this.ifModifiedSince)));
       }else {
          this.requestHeaders.removeAll("If-Modified-Since");
       }
       return;
    }
    public void setInstanceFollowRedirects(boolean p0){
       this.client = this.client.newBuilder().followRedirects(p0).build();
    }
    public void setReadTimeout(int p0){
       this.client = this.client.newBuilder().readTimeout((long)p0, TimeUnit.MILLISECONDS).build();
    }
    public void setRequestMethod(String p0){
       Set mETHODS = OkHttpURLConnection.METHODS;
       if (!mETHODS.contains(p0)) {
          throw new ProtocolException("Expected one of "+mETHODS+" but was "+p0);
       }
       this.method = p0;
       return;
    }
    public void setRequestProperty(String p0,String p1){
       if (this.connected != null) {
          throw new IllegalStateException("Cannot set request property after connection is made");
       }
       Objects.requireNonNull(p0, "field == null");
       if (p1 == null) {
          Platform.get().log(5, "Ignoring header "+p0+" because its value was null.", null);
          return;
       }else {
          this.requestHeaders.set(p0, p1);
          return;
       }
    }
    public boolean usingProxy(){
       boolean b = true;
       if (this.proxy != null) {
          return b;
       }
       Proxy proxy = this.client.proxy();
       if (proxy == null || proxy.type() == Proxy$Type.DIRECT) {
          b = false;
       }
       return b;
    }
}
