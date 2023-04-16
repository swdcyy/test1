package okhttp3.internal.http.RealInterceptorChain;
import okhttp3.Interceptor$Chain;
import java.util.List;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.connection.RealConnection;
import okhttp3.Request;
import okhttp3.Call;
import okhttp3.EventListener;
import java.lang.Object;
import okhttp3.Connection;
import okhttp3.Response;
import okhttp3.HttpUrl;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;
import okhttp3.Interceptor;
import okhttp3.ResponseBody;
import java.lang.NullPointerException;
import java.lang.AssertionError;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;

public final class RealInterceptorChain implements Interceptor$Chain	// class@0020b9
{
    public final Call call;
    public int calls;
    public final int connectTimeout;
    public final RealConnection connection;
    public final EventListener eventListener;
    public final HttpCodec httpCodec;
    public final int index;
    public final List interceptors;
    public final int readTimeout;
    public final Request request;
    public final StreamAllocation streamAllocation;
    public final int writeTimeout;

    public void RealInterceptorChain(List p0,StreamAllocation p1,HttpCodec p2,RealConnection p3,int p4,Request p5,Call p6,EventListener p7,int p8,int p9,int p10){
       super();
       this.interceptors = p0;
       this.connection = p3;
       this.streamAllocation = p1;
       this.httpCodec = p2;
       this.index = p4;
       this.request = p5;
       this.call = p6;
       this.eventListener = p7;
       this.connectTimeout = p8;
       this.readTimeout = p9;
       this.writeTimeout = p10;
    }
    public Call call(){
       return this.call;
    }
    public int connectTimeoutMillis(){
       return this.connectTimeout;
    }
    public Connection connection(){
       return this.connection;
    }
    public EventListener eventListener(){
       return this.eventListener;
    }
    public HttpCodec httpStream(){
       return this.httpCodec;
    }
    public Response proceed(Request p0){
       return this.proceed(p0, this.streamAllocation, this.httpCodec, this.connection);
    }
    public Response proceed(Request p0,StreamAllocation p1,HttpCodec p2,RealConnection p3){
       Interceptor interceptor;
       RealInterceptorChain realIntercep = this;
       if (realIntercep.index >= realIntercep.interceptors.size()) {
          throw new AssertionError();
       }
       int i = 1;
       realIntercep.calls = realIntercep.calls + i;
       String str = "network interceptor ";
       if (realIntercep.httpCodec != null && !realIntercep.connection.supportsUrl(p0.url())) {
          throw new IllegalStateException(str+realIntercep.interceptors.get((realIntercep.index - i))+" must retain the same host and port");
       }
       if (realIntercep.httpCodec != null && realIntercep.calls > i) {
          throw new IllegalStateException(str+realIntercep.interceptors.get((realIntercep.index - i))+" must call proceed\(\) exactly once");
       }
       RealInterceptorChain realIntercep1 = new RealInterceptorChain(realIntercep.interceptors, p1, p2, p3, (realIntercep.index + 1), p0, realIntercep.call, realIntercep.eventListener, realIntercep.connectTimeout, realIntercep.readTimeout, realIntercep.writeTimeout);
       interceptor = realIntercep.interceptors.get(realIntercep.index);
       Response response = interceptor.intercept(v1);
       if (p2 == null || ((realIntercep.index + i) < realIntercep.interceptors.size() && v1.calls != i)) {
          throw new IllegalStateException(str+interceptor+" must call proceed\(\) exactly once");
       }
       String str1 = "interceptor ";
       if (response == null) {
          throw new NullPointerException(str1+interceptor+" returned null");
       }
       if (response.body() != null) {
          return response;
       }
       throw new IllegalStateException(str1+interceptor+" returned a response with no body");
    }
    public int readTimeoutMillis(){
       return this.readTimeout;
    }
    public Request request(){
       return this.request;
    }
    public StreamAllocation streamAllocation(){
       return this.streamAllocation;
    }
    public Interceptor$Chain withConnectTimeout(int p0,TimeUnit p1){
       RealInterceptorChain realIntercep = this;
       RealInterceptorChain realIntercep1 = new RealInterceptorChain(realIntercep.interceptors, realIntercep.streamAllocation, realIntercep.httpCodec, realIntercep.connection, realIntercep.index, realIntercep.request, realIntercep.call, realIntercep.eventListener, Util.checkDuration("timeout", (long)p0, p1), realIntercep.readTimeout, realIntercep.writeTimeout);
       return v1;
    }
    public Interceptor$Chain withReadTimeout(int p0,TimeUnit p1){
       RealInterceptorChain realIntercep = this;
       RealInterceptorChain realIntercep1 = new RealInterceptorChain(realIntercep.interceptors, realIntercep.streamAllocation, realIntercep.httpCodec, realIntercep.connection, realIntercep.index, realIntercep.request, realIntercep.call, realIntercep.eventListener, realIntercep.connectTimeout, Util.checkDuration("timeout", (long)p0, p1), realIntercep.writeTimeout);
       return v1;
    }
    public Interceptor$Chain withWriteTimeout(int p0,TimeUnit p1){
       RealInterceptorChain realIntercep = this;
       RealInterceptorChain realIntercep1 = new RealInterceptorChain(realIntercep.interceptors, realIntercep.streamAllocation, realIntercep.httpCodec, realIntercep.connection, realIntercep.index, realIntercep.request, realIntercep.call, realIntercep.eventListener, realIntercep.connectTimeout, realIntercep.readTimeout, Util.checkDuration("timeout", (long)p0, p1));
       return v1;
    }
    public int writeTimeoutMillis(){
       return this.writeTimeout;
    }
}
