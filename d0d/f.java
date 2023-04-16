package d0d.f;
import d0d.b;
import com.google.gson.c;
import d0d.g$b;
import d0d.a;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$ApiCostDetailStatEvent;
import java.util.ArrayList;
import okhttp3.Call;
import aegon.chrome.net.n$b;
import java.lang.String;
import java.util.Date;
import java.lang.Long;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.io.IOException;
import com.yxcorp.retrofit.model.RetrofitException;
import java.lang.Throwable;
import retrofit2.HttpException;
import java.lang.StringBuilder;
import java.lang.Exception;
import com.google.common.base.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.os.SystemClock;
import com.yxcorp.retrofit.e;
import com.google.gson.JsonObject;
import java.net.InetSocketAddress;
import java.net.Proxy;
import okhttp3.Protocol;
import okhttp3.Connection;
import okhttp3.Route;
import java.net.InetAddress;
import java.net.Inet6Address;
import com.yxcorp.utility.Log;
import tjd.a;
import java.lang.Object;
import java.util.List;
import d0d.e;
import java.util.Comparator;
import java.util.Collections;
import java.lang.Number;
import java.lang.Integer;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import com.yxcorp.retrofit.model.Region;
import java.lang.Class;
import com.yxcorp.retrofit.f;
import java.lang.System;
import d0d.i;
import okhttp3.Response;
import android.text.TextUtils;
import java.lang.Double;
import d0d.j;

public class f extends b	// class@00145d
{
    public final a a;
    public boolean b;
    public ClientStat$ApiCostDetailStatEvent c;
    public final g$b d;
    public final List e;
    public static final c f;

    static {
       f.f = new c();
    }
    public void f(g$b p0){
       super();
       this.a = new a();
       this.b = false;
       this.c = new ClientStat$ApiCostDetailStatEvent();
       this.e = new ArrayList();
       this.d = p0;
    }
    public void c(Call p0,n$b p1,String p2){
       p0.t = p2;
       if (p1.i() == null) {
          return;
       }
       long time = p1.i().getTime();
       if (p1.d() != null) {
          p0.c = (p1.d().getTime() - time) + this.a.a;
       }
       if (p1.c() != null) {
          p0.d = (p1.c().getTime() - time) + this.a.a;
       }
       if (p1.b() != null) {
          p0.e = (p1.b().getTime() - time) + this.a.a;
       }
       if (p1.a() != null) {
          p0.f = (p1.a().getTime() - time) + this.a.a;
       }
       if (p1.l() != null) {
          p0.g = (p1.l().getTime() - time) + this.a.a;
       }
       if (p1.k() != null) {
          p0.h = (p1.k().getTime() - time) + this.a.a;
       }
       if (p1.j() != null) {
          p0.i = (p1.j().getTime() - time) + this.a.a;
       }
       if (p1.h() != null) {
          p0.j = (p1.h().getTime() - time) + this.a.a;
       }
       if (p1.g() != null) {
          p0.n = p1.g().longValue();
       }
       if (p1.m() != null) {
          p0.m = p1.m().longValue();
       }
       return;
    }
    public void callEnd(Call p0){
       Request request = p0.request();
       if (request != null) {
          this.a.s = request.url().queryParameter("retryTimes");
       }
       a w = this.a.w;
       if (w == null) {
          w = p0.request();
       }
       this.h(w);
       w = this.a.o;
       if (w) {
          p0.httpCode = (int)w;
       }
       if (this.b == null) {
          this.g();
       }
       return;
    }
    public void callFailed(Call p0,IOException p1){
       a o;
       Request request = p0.request();
       if (p1 instanceof RetrofitException) {
          request = p1.mRequest;
       }else {
          o = this.a.w;
          if (o != null) {
             request = o;
          }
       }
       this.h(request);
       if (request != null) {
          this.a.s = request.url().queryParameter("retryTimes");
       }
       o = this.a.o;
       if (o - null) {
          request.httpCode = (int)o;
       }else if(p1.getCause() instanceof HttpException){
          request.httpCode = p1.getCause().code();
       }else {
          request.httpCode = 0;
       }
       f tc = this.c;
       StringBuilder str = p1.toString();
       try{
          str+"\n";
          Throwable throwable = b.c(p1);
          if (throwable != p1) {
             str = str+"Root cause: "+throwable.toString()+"\n";
          }
          tc.errorMessage = e0;
          if (TextUtils.x(this.c.errorMessage)) {
             tc.errorMessage = TextUtils.k(p1.toString());
          }
          if (TextUtils.x(this.c.errorMessage)) {
             tc.errorMessage = "callFailed with empty exception";
          }
          this.g();
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public void callStart(Call p0){
       p0.a = SystemClock.elapsedRealtime();
       this.a.u.c0("enableNewCommonParams", e.h().e());
       this.a.u.c0("enableInterceptorUpgrade", e.h().d());
    }
    public void connectEnd(Call p0,InetSocketAddress p1,Proxy p2,Protocol p3){
       p0.f = SystemClock.elapsedRealtime();
    }
    public void connectFailed(Call p0,InetSocketAddress p1,Proxy p2,Protocol p3,IOException p4){
       p0.r = p1.getHostString();
       p0.f = SystemClock.elapsedRealtime();
    }
    public void connectStart(Call p0,InetSocketAddress p1,Proxy p2){
       p0.e = SystemClock.elapsedRealtime();
    }
    public void connectionAcquired(Call p0,Connection p1){
       try{
          p0.v = p1.route().socketAddress().getAddress() instanceof Inet6Address;
       }catch(java.lang.Exception e2){
          Log.e("HttpEventListener", "connectionAcquired getAddress error", e2);
       }
       return;
    }
    public void d(Call p0,a p1){
       try{
          this.e.add(p1);
       }catch(java.lang.Exception e2){
          Log.d("HttpEventListener", "Can\'t add interceptor metrics. "+e2);
       }
       return;
    }
    public void dnsEnd(Call p0,String p1,List p2){
       p0.d = SystemClock.elapsedRealtime();
    }
    public void dnsStart(Call p0,String p1){
       p0.c = SystemClock.elapsedRealtime();
    }
    public final void e(){
       Collections.sort(this.e, e.b);
       JsonObject jsonObject = new JsonObject();
       boolean b = false;
       boolean i = 0;
       int i1 = 1;
       while (i < this.e.size()) {
          a uoa = this.e.get(i);
          a c = uoa.c;
          int i2 = this.e.size() - i1;
          if (i < i2) {
             i2 = i + 1;
             c = c - this.e.get(i2).c;
          }
          jsonObject.a0(uoa.a, Long.valueOf(c));
          i = i + 1;
       }
       if (jsonObject.size() > 0) {
          i = (this.c.httpCode == 200)? true: false;
          if (this.a.s != null) {
             b = true;
          }
          JsonObject jsonObject1 = new JsonObject();
          jsonObject1.c0("url", this.c.url);
          jsonObject1.c0("host", this.c.host);
          jsonObject1.a0("http_code", Integer.valueOf(this.c.httpCode));
          jsonObject1.a0("error_code", Integer.valueOf(this.c.errorCode));
          jsonObject1.a0("result_code", Integer.valueOf(this.c.resultCode));
          jsonObject1.c0("request_id", this.c.requestId);
          jsonObject1.a0("api_request_id", Long.valueOf(this.c.apiRequestId));
          jsonObject1.G("metrics", jsonObject);
          this.d.a(jsonObject1.toString(), i, b);
       }
       return;
    }
    public void f(){
       this.a.b = SystemClock.elapsedRealtime();
    }
    public final void g(){
       ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
       f tc = this.c;
       statPackage.apiCostDetailStatEvent = tc;
       f td = this.d;
       boolean b = true;
       boolean b1 = (tc.httpCode == 200)? true: false;
       if (this.a.s == null) {
          b = false;
       }
       td.b(statPackage, b1, b);
       return;
    }
    public final void h(Request p0){
       f tc2;
       String str1;
       String str4;
       f ta = this.a;
       a b = ta.b;
       a a = ta.a;
       a uoa = null;
       if (b - a > 0 && a - uoa > 0) {
          this.c.buildRequestCost = b - a;
       }
       f tc = this.c;
       a c = ta.c;
       tc.dnsStart = c;
       a d = ta.d;
       if (d - c > 0 && c - uoa > 0) {
          tc.dnsCost = d - c;
       }
       c = ta.e;
       tc.connectEstablishStart = c;
       d = ta.f;
       if (d - c > 0 && c - uoa > 0) {
          tc.connectEstablishCost = d - c;
       }
       c = ta.h;
       d = ta.g;
       if (c - d > 0 && d - uoa > 0) {
          tc.requestCost = c - d;
       }
       a i = ta.i;
       if (i - c > 0 && c - uoa > 0) {
          tc.waitingResponseCost = i - c;
       }
       c = ta.j;
       if (c - i > 0 && i - uoa > 0) {
          tc.responseCost = c - i;
       }
       tc.isIpv6 = ta.v;
       tc.taskStart = a;
       tc.requestStart = d;
       tc.responseStart = i;
       tc.requestSize = ta.l;
       tc.responseSize = ta.k;
       tc.bytesSent = (int)ta.m;
       tc.bytesReceived = (int)ta.n;
       long l = SystemClock.elapsedRealtime();
       ta.p = l;
       f tc1 = this.c;
       tc1.totalCost = l - ta.a;
       tc1.responseSummary = "statistics_event_listener";
       b = ta.t;
       if (b != null) {
          tc1.connectionDetails = b;
       }
       tc1.extraMessage = ta.u.toString();
       if (p0 != null) {
          this.c.requestId = p0.header("X-REQUESTID");
          HttpUrl httpUrl = p0.url();
          if (httpUrl != null) {
             this.c.url = httpUrl.toString();
             this.c.host = httpUrl.host();
             if (!TextUtils.x(ta.r)) {
                tc2 = this.c;
                tc2.url = (tc2.url).replace(tc2.host, ta.r);
             }
             tc2 = this.c;
             ClientStat$ApiCostDetailStatEvent host = tc2.host;
             String str = p0.header("Host");
             int i1 = httpUrl.port();
             if (i1 != 80 && (i1 && i1 != 443)) {
                str1 = ":";
                StringBuilder str2 = host+str1+i1;
                if (!TextUtils.x(str)) {
                   str2 = str2+str1+str;
                }
                str1 = str2;
             }
          label_010c :
             tc2.host = str1;
          }
          Region region = p0.tag(Region.class);
          String str3 = "NONE";
          str4 = (region == null)? str3: region.a();
          tc2 = this.c;
          if (!TextUtils.x(str4)) {
             str3 = str4;
          }
          tc2.region = str3;
       }
       if (TextUtils.x(this.c.requestId)) {
          str4.requestId = f.f();
       }
       str4.apiRequestId = System.currentTimeMillis();
       a x = ta.x;
       if (x != null) {
          ta = this.c;
          ta.serverTotalTiming = x.a;
          ta.serverCost = x.b;
          ta.serverApiCost = x.c;
          ta.serverApiRecoCost = x.d;
       }
       return;
    }
    public void requestBodyEnd(Call p0,long p1){
       p0.h = SystemClock.elapsedRealtime();
       p0.l = p1;
    }
    public void requestHeadersEnd(Call p0,Request p1){
       f ta = this.a;
       ta.w = p1;
       ta.h = SystemClock.elapsedRealtime();
    }
    public void requestHeadersStart(Call p0){
       p0.g = SystemClock.elapsedRealtime();
    }
    public void responseBodyEnd(Call p0,long p1){
       p0.j = SystemClock.elapsedRealtime();
       p0.k = p1;
    }
    public void responseHeadersEnd(Call p0,Response p1){
       i oi;
       String str = p1.header("Server-Timing", "");
       f ta = this.a;
       Log.g("ServerTimingHeaderParser", "ServerTiming header parse start, data = "+str);
       if (TextUtils.isEmpty(str)) {
          Log.g("ServerTimingHeaderParser", "ServerTiming header parse return, data is empty");
          oi = null;
       }else {
          i oi1 = new i();
          String[] stringArray = str.split(",");
          int len = stringArray.length;
          int i = 0;
          while (i < len) {
             object oobject = stringArray[i];
             try{
                String[] stringArray1 = (oobject.trim()).split(";");
                String str1 = 2;
                if (stringArray1.length < str1) {
                   Log.g("ServerTimingHeaderParser", "ServerTiming header parse error, subInfoList length = "+stringArray1.length);
                }else {
                   object oobject1 = stringArray1[0];
                   int i1 = 1;
                   String[] stringArray2 = (stringArray1[i1]).split("=");
                   if (stringArray2.length != str1) {
                      Log.g("ServerTimingHeaderParser", "ServerTiming header parse error, kvInfo length = "+stringArray2.length);
                   }else if(!(stringArray2[0]).equals("dur")){
                      Log.g("ServerTimingHeaderParser", "ServerTiming header parse error, kvInfo[0] = "+stringArray2[0]);
                   }else {
                      double d = Double.parseDouble(stringArray2[i1]);
                      if (stringArray1.length >= 3 && (stringArray1[str1]).equals("unit=sec")) {
                         d = d * 0x408f400000000000;
                      }
                      j.a(oi1, oobject1, (int)d);
                   }
                }
             }catch(java.lang.Exception e6){
                Log.d("ServerTimingHeaderParser", "ServerTiming header parse error, e = "+e6.toString());
             }
             i = i + 1;
          }
          Log.g("ServerTimingHeaderParser", "ServerTiming header parse complete, result = "+oi1.toString());
          oi = oi1;
       }
       ta.x = oi;
       oi.o = (long)p1.code();
       oi.i = SystemClock.elapsedRealtime();
       return;
    }
    public void responseHeadersStart(Call p0){
       p0.i = SystemClock.elapsedRealtime();
    }
}
