package okhttp3.RealCall;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import java.lang.Object;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.RealCall$1;
import java.util.concurrent.TimeUnit;
import okio.o;
import okhttp3.EventListener$Factory;
import okhttp3.EventListener;
import okhttp3.internal.platform.Platform;
import java.lang.String;
import okhttp3.Callback;
import okhttp3.Dispatcher;
import okhttp3.RealCall$AsyncCall;
import java.lang.IllegalStateException;
import okhttp3.Response;
import okio.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.CookieJar;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.cache.InternalCache;
import okhttp3.internal.connection.ConnectInterceptor;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.connection.RealConnection;
import okhttp3.Interceptor$Chain;
import java.io.Closeable;
import okhttp3.internal.Util;
import okhttp3.HttpUrl;
import java.io.InterruptedIOException;
import java.lang.Throwable;
import java.lang.StringBuilder;

public final class RealCall implements Call	// class@00208b
{
    public final OkHttpClient client;
    public EventListener eventListener;
    public boolean executed;
    public final boolean forWebSocket;
    public final Request originalRequest;
    public final RetryAndFollowUpInterceptor retryAndFollowUpInterceptor;
    public final a timeout;

    public void RealCall(OkHttpClient p0,Request p1,boolean p2){
       super();
       this.client = p0;
       this.originalRequest = p1;
       this.forWebSocket = p2;
       this.retryAndFollowUpInterceptor = new RetryAndFollowUpInterceptor(p0, p2);
       RealCall$1 u1 = new RealCall$1(this);
       this.timeout = u1;
       u1.timeout((long)p0.callTimeoutMillis(), TimeUnit.MILLISECONDS);
    }
    public static RealCall newRealCall(OkHttpClient p0,Request p1,boolean p2){
       RealCall realCall = new RealCall(p0, p1, p2);
       realCall.eventListener = p0.eventListenerFactory().create(realCall);
       return realCall;
    }
    public void cancel(){
       this.retryAndFollowUpInterceptor.cancel();
    }
    public final void captureCallStackTrace(){
       this.retryAndFollowUpInterceptor.setCallStackTrace(Platform.get().getStackTraceForCloseable("response.body\(\).close\(\)"));
    }
    public Object clone(){
       return this.clone();
    }
    public Call clone(){
       return this.clone();
    }
    public RealCall clone(){
       return RealCall.newRealCall(this.client, this.originalRequest, this.forWebSocket);
    }
    public void enqueue(Callback p0){
       _monitor_enter(this);
       if (this.executed != null) {
          throw new IllegalStateException("Already Executed");
       }
       this.executed = true;
       _monitor_exit(this);
       this.captureCallStackTrace();
       this.eventListener.callStart(this);
       this.client.dispatcher().enqueue(new RealCall$AsyncCall(this, p0));
       return;
    }
    public Response execute(){
       _monitor_enter(this);
       if (this.executed != null) {
          throw new IllegalStateException("Already Executed");
       }
       this.executed = true;
       _monitor_exit(this);
       this.captureCallStackTrace();
       this.timeout.enter();
       RealCall teventListen = this.eventListener;
       try{
          teventListen.callStart(this);
          this.client.dispatcher().executed(this);
          Response responseWith = this.getResponseWithInterceptorChain();
          if (responseWith == null) {
             throw new IOException("Canceled");
          }
          this.client.dispatcher().finished(this);
          return responseWith;
       }catch(java.io.IOException e0){
          IOException iOException = this.timeoutExit(e0);
          this.eventListener.callFailed(this, iOException);
          throw iOException;
       }
    }
    public Response getResponseWithInterceptorChain(){
       ArrayList uArrayList = new ArrayList();
       uArrayList.addAll(this.client.interceptors());
       uArrayList.add(this.retryAndFollowUpInterceptor);
       uArrayList.add(new BridgeInterceptor(this.client.cookieJar()));
       uArrayList.add(new CacheInterceptor(this.client.internalCache()));
       uArrayList.add(new ConnectInterceptor(this.client));
       if (this.forWebSocket == null) {
          uArrayList.addAll(this.client.networkInterceptors());
       }
       uArrayList.add(new CallServerInterceptor(this.forWebSocket));
       RealInterceptorChain realIntercep = new RealInterceptorChain(uArrayList, null, null, null, 0, this.originalRequest, this, this.eventListener, this.client.connectTimeoutMillis(), this.client.readTimeoutMillis(), this.client.writeTimeoutMillis());
       Response response = v12.proceed(this.originalRequest);
       if (!this.retryAndFollowUpInterceptor.isCanceled()) {
          return response;
       }else {
          Util.closeQuietly(response);
          throw new IOException("Canceled");
       }
    }
    public boolean isCanceled(){
       return this.retryAndFollowUpInterceptor.isCanceled();
    }
    public synchronized boolean isExecuted(){
       return this.executed;
    }
    public String redactedUrl(){
       return this.originalRequest.url().redact();
    }
    public Request request(){
       return this.originalRequest;
    }
    public StreamAllocation streamAllocation(){
       return this.retryAndFollowUpInterceptor.streamAllocation();
    }
    public o timeout(){
       return this.timeout;
    }
    public IOException timeoutExit(IOException p0){
       if (!this.timeout.exit()) {
          return p0;
       }
       InterruptedIOException interruptedI = new InterruptedIOException("timeout");
       if (p0 != null) {
          interruptedI.initCause(p0);
       }
       return interruptedI;
    }
    public String toLoggableString(){
       StringBuilder str = "";
       String str1 = (this.isCanceled())? "canceled ": "";
       str = str+str1;
       str1 = (this.forWebSocket != null)? "web socket": "call";
       return str+str1+" to "+this.redactedUrl();
    }
}
