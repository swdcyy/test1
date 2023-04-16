package okhttp3.logging.LoggingEventListener;
import okhttp3.EventListener;
import okhttp3.logging.HttpLoggingInterceptor$Logger;
import okhttp3.logging.LoggingEventListener$1;
import okhttp3.Call;
import java.lang.String;
import java.io.IOException;
import java.lang.StringBuilder;
import java.lang.Object;
import java.lang.System;
import okhttp3.Request;
import java.net.InetSocketAddress;
import java.net.Proxy;
import okhttp3.Protocol;
import okhttp3.Connection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Response;
import okhttp3.Handshake;

public final class LoggingEventListener extends EventListener	// class@001fe8
{
    public final HttpLoggingInterceptor$Logger logger;
    public long startNs;

    public void LoggingEventListener(HttpLoggingInterceptor$Logger p0){
       super();
       this.logger = p0;
    }
    public void LoggingEventListener(HttpLoggingInterceptor$Logger p0,LoggingEventListener$1 p1){
       super(p0);
    }
    public void callEnd(Call p0){
       this.logWithTime("callEnd");
    }
    public void callFailed(Call p0,IOException p1){
       this.logWithTime("callFailed: "+p1);
    }
    public void callStart(Call p0){
       this.startNs = System.nanoTime();
       this.logWithTime("callStart: "+p0.request());
    }
    public void connectEnd(Call p0,InetSocketAddress p1,Proxy p2,Protocol p3){
       this.logWithTime("connectEnd: "+p3);
    }
    public void connectFailed(Call p0,InetSocketAddress p1,Proxy p2,Protocol p3,IOException p4){
       this.logWithTime("connectFailed: "+p3+" "+p4);
    }
    public void connectStart(Call p0,InetSocketAddress p1,Proxy p2){
       this.logWithTime("connectStart: "+p1+" "+p2);
    }
    public void connectionAcquired(Call p0,Connection p1){
       this.logWithTime("connectionAcquired: "+p1);
    }
    public void connectionReleased(Call p0,Connection p1){
       this.logWithTime("connectionReleased");
    }
    public void dnsEnd(Call p0,String p1,List p2){
       this.logWithTime("dnsEnd: "+p2);
    }
    public void dnsStart(Call p0,String p1){
       this.logWithTime("dnsStart: "+p1);
    }
    public final void logWithTime(String p0){
       this.logger.log("["+TimeUnit.NANOSECONDS.toMillis((System.nanoTime() - this.startNs))+" ms] "+p0);
    }
    public void requestBodyEnd(Call p0,long p1){
       this.logWithTime("requestBodyEnd: byteCount="+p1);
    }
    public void requestBodyStart(Call p0){
       this.logWithTime("requestBodyStart");
    }
    public void requestHeadersEnd(Call p0,Request p1){
       this.logWithTime("requestHeadersEnd");
    }
    public void requestHeadersStart(Call p0){
       this.logWithTime("requestHeadersStart");
    }
    public void responseBodyEnd(Call p0,long p1){
       this.logWithTime("responseBodyEnd: byteCount="+p1);
    }
    public void responseBodyStart(Call p0){
       this.logWithTime("responseBodyStart");
    }
    public void responseHeadersEnd(Call p0,Response p1){
       this.logWithTime("responseHeadersEnd: "+p1);
    }
    public void responseHeadersStart(Call p0){
       this.logWithTime("responseHeadersStart");
    }
    public void secureConnectEnd(Call p0,Handshake p1){
       this.logWithTime("secureConnectEnd");
    }
    public void secureConnectStart(Call p0){
       this.logWithTime("secureConnectStart");
    }
}
