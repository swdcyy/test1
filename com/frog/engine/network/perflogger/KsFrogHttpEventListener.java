package com.frog.engine.network.perflogger.KsFrogHttpEventListener;
import okhttp3.EventListener;
import com.frog.engine.network.perflogger.KsFrogHttpEventListener$a;
import okhttp3.Request;
import com.frog.engine.network.perflogger.KsFrogPerfReportManager;
import com.frog.engine.jsobject.FrogLoggerObject;
import java.lang.StringBuilder;
import okhttp3.HttpUrl;
import java.lang.String;
import java.net.URL;
import java.io.IOException;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.net.SocketTimeoutException;
import org.apache.http.conn.ConnectTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import java.lang.Long;
import java.util.Map;
import okhttp3.Call;
import android.os.SystemClock;
import java.net.InetSocketAddress;
import java.net.Proxy;
import okhttp3.Protocol;
import okhttp3.Connection;
import java.util.List;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.Handshake;

public class KsFrogHttpEventListener extends EventListener	// class@00154f
{
    public long mDnsTs;
    public final FrogLoggerObject mObject;
    public long mReqTs;
    public long mRspTs;
    public long mStartTs;
    public long mTcpTs;
    public long mTlsTs;
    public long mWaitTs;
    public static final EventListener$Factory FACTORY;

    static {
       KsFrogHttpEventListener.FACTORY = new KsFrogHttpEventListener$a();
    }
    public void KsFrogHttpEventListener(Request p0,long p1){
       super();
       FrogLoggerObject logObject = KsFrogPerfReportManager.instance().getLogObject(p1);
       this.mObject = logObject;
       if (logObject == null) {
          return;
       }
       logObject.put("host", p0.url().scheme()+"://"+p0.url().url().getHost());
       logObject.put("path", p0.url().url().getPath());
       logObject.put("totalDur", 0);
       logObject.put("dnsDur", 0);
       logObject.put("tcpDur", 0);
       logObject.put("sslDur", 0);
       logObject.put("reqDur", 0);
       logObject.put("waitDur", 0);
       logObject.put("rspDur", 0);
       logObject.put("reqHeaderLen", 0);
       logObject.put("reqBodyLen", 0);
       logObject.put("rspHeaderLen", 0);
       logObject.put("rspBodyLen", 0);
       logObject.put("result", 0);
       logObject.put("code", 0);
       return;
    }
    public static void appendEx(FrogLoggerObject p0,IOException p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KsFrogHttpEventListener.class, "2")) {
          return;
       }
       if (p0 != null && p1 != null) {
          if (p1 instanceof SocketTimeoutException || p1 instanceof ConnectTimeoutException) {
             p0.put("result", -9001);
          }else if(p1 instanceof UnknownHostException){
             p0.put("result", -9002);
          }else if(p1 instanceof SSLException){
             p0.put("result", -9006);
          }else {
             p0.put("result", -9003);
          }
       }
       return;
    }
    public final void appendDur(String p0,long p1){
       KsFrogHttpEventListener ksFrogHttpEv = KsFrogHttpEventListener.class;
       if (PatchProxy.isSupport(ksFrogHttpEv) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, ksFrogHttpEv, "1")) {
          return;
       }
       ksFrogHttpEv = this.mObject;
       if (ksFrogHttpEv == null || (ksFrogHttpEv.getValues() != null && p1 - null)) {
          Object obj = this.mObject.getValues().get(p0);
          if (!obj instanceof Long) {
             return;
          }else {
             this.mObject.put(p0, (obj.longValue() + p1));
          }
       }
       return;
    }
    public void callEnd(Call p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsFrogHttpEventListener.class, "21")) {
          return;
       }
       super.callEnd(p0);
       if (this.mObject == null) {
          return;
       }
       this.appendDur("totalDur", (SystemClock.elapsedRealtime() - this.mStartTs));
       this.mObject.put("result", 1);
       return;
    }
    public void callFailed(Call p0,IOException p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KsFrogHttpEventListener.class, "22")) {
          return;
       }
       super.callFailed(p0, p1);
       if (this.mObject == null) {
          return;
       }
       this.appendDur("totalDur", (SystemClock.elapsedRealtime() - this.mStartTs));
       this.mObject.put("result", 0);
       return;
    }
    public void callStart(Call p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsFrogHttpEventListener.class, "3")) {
          return;
       }
       super.callStart(p0);
       if (this.mObject == null) {
          return;
       }
       this.mStartTs = SystemClock.elapsedRealtime();
       return;
    }
    public void connectEnd(Call p0,InetSocketAddress p1,Proxy p2,Protocol p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, KsFrogHttpEventListener.class, "9")) {
          return;
       }
       super.connectEnd(p0, p1, p2, p3);
       if (this.mObject == null) {
          return;
       }
       this.appendDur("tcpDur", (SystemClock.elapsedRealtime() - this.mTcpTs));
       return;
    }
    public void connectFailed(Call p0,InetSocketAddress p1,Proxy p2,Protocol p3,IOException p4){
       KsFrogHttpEventListener ksFrogHttpEv = KsFrogHttpEventListener.class;
       if (PatchProxy.isSupport(ksFrogHttpEv)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, ksFrogHttpEv, "10")) {
             return;
          }
       }
       super.connectFailed(p0, p1, p2, p3, p4);
       if (this.mObject == null) {
          return;
       }else {
          this.appendDur("tcpDur", (SystemClock.elapsedRealtime() - this.mTcpTs));
          return;
       }
    }
    public void connectStart(Call p0,InetSocketAddress p1,Proxy p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KsFrogHttpEventListener.class, "6")) {
          return;
       }
       super.connectStart(p0, p1, p2);
       if (this.mObject == null) {
          return;
       }
       this.mTcpTs = SystemClock.elapsedRealtime();
       return;
    }
    public void connectionAcquired(Call p0,Connection p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KsFrogHttpEventListener.class, "11")) {
          return;
       }
       super.connectionAcquired(p0, p1);
       return;
    }
    public void connectionReleased(Call p0,Connection p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KsFrogHttpEventListener.class, "12")) {
          return;
       }
       super.connectionReleased(p0, p1);
       return;
    }
    public void dnsEnd(Call p0,String p1,List p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KsFrogHttpEventListener.class, "5")) {
          return;
       }
       super.dnsEnd(p0, p1, p2);
       if (this.mObject == null) {
          return;
       }
       this.appendDur("dnsDur", (SystemClock.elapsedRealtime() - this.mDnsTs));
       return;
    }
    public void dnsStart(Call p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KsFrogHttpEventListener.class, "4")) {
          return;
       }
       super.dnsStart(p0, p1);
       if (this.mObject == null) {
          return;
       }
       this.mDnsTs = SystemClock.elapsedRealtime();
       return;
    }
    public void requestBodyEnd(Call p0,long p1){
       KsFrogHttpEventListener ksFrogHttpEv = KsFrogHttpEventListener.class;
       if (PatchProxy.isSupport(ksFrogHttpEv) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, ksFrogHttpEv, "16")) {
          return;
       }
       super.requestBodyEnd(p0, p1);
       if (this.mObject == null) {
          return;
       }
       long l = SystemClock.elapsedRealtime();
       this.mWaitTs = l;
       this.appendDur("reqDur", (l - this.mReqTs));
       this.mObject.put("reqBodyLen", p1);
       return;
    }
    public void requestBodyStart(Call p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsFrogHttpEventListener.class, "15")) {
          return;
       }
       super.requestBodyStart(p0);
       return;
    }
    public void requestHeadersEnd(Call p0,Request p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KsFrogHttpEventListener.class, "14")) {
          return;
       }
       super.requestHeadersEnd(p0, p1);
       if (this.mObject == null) {
          return;
       }
       long l = SystemClock.elapsedRealtime();
       this.mObject.put("reqHeaderLen", p1.headers().byteCount());
       this.appendDur("reqDur", (SystemClock.elapsedRealtime() - this.mReqTs));
       this.mReqTs = l;
       this.mWaitTs = l;
       return;
    }
    public void requestHeadersStart(Call p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsFrogHttpEventListener.class, "13")) {
          return;
       }
       super.requestHeadersStart(p0);
       if (this.mObject == null) {
          return;
       }
       this.mReqTs = SystemClock.elapsedRealtime();
       return;
    }
    public void responseBodyEnd(Call p0,long p1){
       KsFrogHttpEventListener ksFrogHttpEv = KsFrogHttpEventListener.class;
       if (PatchProxy.isSupport(ksFrogHttpEv) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, ksFrogHttpEv, "20")) {
          return;
       }
       super.responseBodyEnd(p0, p1);
       if (this.mObject == null) {
          return;
       }
       this.appendDur("rspDur", (SystemClock.elapsedRealtime() - this.mRspTs));
       this.appendDur("rspBodyLen", p1);
       return;
    }
    public void responseBodyStart(Call p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsFrogHttpEventListener.class, "19")) {
          return;
       }
       super.responseBodyStart(p0);
       if (this.mObject == null) {
          return;
       }
       long l = SystemClock.elapsedRealtime();
       this.appendDur("totalDur", (l - this.mStartTs));
       this.mStartTs = l;
       return;
    }
    public void responseHeadersEnd(Call p0,Response p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KsFrogHttpEventListener.class, "18")) {
          return;
       }
       super.responseHeadersEnd(p0, p1);
       if (this.mObject == null) {
          return;
       }
       long l = SystemClock.elapsedRealtime();
       this.appendDur("rspDur", (l - this.mRspTs));
       this.mRspTs = l;
       this.mObject.put("rspHeaderLen", p1.headers().byteCount());
       this.mObject.put("code", (long)p1.code());
       this.mObject.put("result", 1);
       this.appendDur("totalDur", (l - this.mStartTs));
       this.mStartTs = l;
       return;
    }
    public void responseHeadersStart(Call p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsFrogHttpEventListener.class, "17")) {
          return;
       }
       super.responseHeadersStart(p0);
       if (this.mObject == null) {
          return;
       }
       long l = SystemClock.elapsedRealtime();
       this.mRspTs = l;
       this.appendDur("waitDur", (l - this.mWaitTs));
       return;
    }
    public void secureConnectEnd(Call p0,Handshake p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KsFrogHttpEventListener.class, "8")) {
          return;
       }
       super.secureConnectEnd(p0, p1);
       if (this.mObject == null) {
          return;
       }
       this.appendDur("sslDur", (SystemClock.elapsedRealtime() - this.mTlsTs));
       return;
    }
    public void secureConnectStart(Call p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsFrogHttpEventListener.class, "7")) {
          return;
       }
       super.secureConnectStart(p0);
       if (this.mObject == null) {
          return;
       }
       this.mTlsTs = SystemClock.elapsedRealtime();
       return;
    }
}
