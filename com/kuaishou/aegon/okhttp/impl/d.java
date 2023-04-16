package com.kuaishou.aegon.okhttp.impl.d;
import aegon.chrome.net.q$b;
import okhttp3.Interceptor$Chain;
import okhttp3.EventListener;
import java.lang.String;
import okio.b;
import okhttp3.Response$Builder;
import com.kuaishou.aegon.okhttp.impl.d$a;
import okhttp3.Request;
import okhttp3.RequestBody;
import java.lang.System;
import aegon.chrome.net.q;
import aegon.chrome.net.r;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import bo.t;
import com.kuaishou.aegon.okhttp.impl.CronetExceptionCanceled;
import java.lang.Throwable;
import aegon.chrome.net.CronetException;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import go.b;
import java.net.Proxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.net.Proxy$Type;
import java.lang.Integer;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import okhttp3.Protocol;
import okhttp3.HttpUrl;
import java.util.List;
import java.util.Iterator;
import java.util.Map$Entry;
import okhttp3.MediaType;
import java.net.InetAddress;
import com.kuaishou.aegon.okhttp.impl.d$b;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.Response;
import okio.d;
import okhttp3.ResponseBody;
import com.kwai.robust.PatchProxyResult;

public class d extends q$b	// class@0005f1
{
    public final String a;
    public b b;
    public Response$Builder c;
    public boolean d;
    public CronetException e;
    public Interceptor$Chain f;
    public MediaType g;
    public RequestBody h;
    public d$b i;
    public EventListener j;
    public b k;

    public void d(Interceptor$Chain p0,EventListener p1,String p2){
       super();
       this.b = new b();
       this.c = new Response$Builder();
       this.d = false;
       this.e = null;
       this.f = null;
       this.g = null;
       this.h = null;
       this.i = null;
       this.j = new d$a(this);
       this.f = p0;
       this.h = p0.request().body();
       if (p1 != null) {
          this.j = p1;
       }
       this.a = p2;
       this.c.request(p0.request()).sentRequestAtMillis(System.currentTimeMillis());
       return;
    }
    public void a(q p0,r p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "7")) {
          return;
       }
       t.d("CronetInterceptor", "onCanceled. requestId: "+this.a);
       this.e = new CronetExceptionCanceled("Request has been canceled.", null);
       _monitor_enter(this);
       this.d = true;
       this.notifyAll();
       _monitor_exit(this);
       return;
    }
    public void b(q p0,r p1,CronetException p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, d.class, "6")) {
          return;
       }
       t.b("CronetInterceptor", "onFailed. "+p2+", requestId: "+this.a);
       this.e = p2;
       _monitor_enter(this);
       this.d = true;
       this.notifyAll();
       _monitor_exit(this);
       return;
    }
    public void c(q p0,r p1,ByteBuffer p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, d.class, "4")) {
          return;
       }
       try{
          p2.flip();
          this.b.write(p2);
       }catch(java.io.IOException e8){
          t.d("CronetInterceptor", "Exception during reading. "+e8);
       }
       p2.clear();
       p0.e(p2);
       return;
    }
    public void d(q p0,r p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, d.class, "2")) {
          return;
       }
       t.a("CronetInterceptor", "onRedirectReceived: "+p2+", requestId: "+this.a);
       d tk = this.k;
       if (tk != null && tk.a(p0, p1, p2)) {
          t.a("CronetInterceptor", "onRedirectReceived_handleByDelegate: "+p2+", requestId: "+this.a);
          return;
       }else {
          p0.b();
          return;
       }
    }
    public void e(q p0,r p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "3")) {
          return;
       }
       t.a("CronetInterceptor", "onResponseStarted, requestId: "+this.a);
       Proxy nO_PROXY = Proxy.NO_PROXY;
       int i = 0;
       if (!TextUtils.isEmpty(p1.f())) {
          String[] stringArray = (p1.f()).split(":", 2);
          Proxy$Type hTTP = Proxy$Type.HTTP;
          object oobject = stringArray[i];
          int i1 = 1;
          int i2 = (stringArray.length > i1)? Integer.parseInt(stringArray[i1]): 0;
          nO_PROXY = new Proxy(hTTP, InetSocketAddress.createUnresolved(oobject, i2));
       }
       Protocol protocol = this.g(p1.e());
       InetSocketAddress inetSocketAd = InetSocketAddress.createUnresolved(this.f.request().url().host(), i);
       this.c.code(p1.c());
       this.c.message(p1.d());
       Iterator iterator = p1.b().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (!(uEntry.getKey()).equalsIgnoreCase("Content-Encoding")) {
             this.c.addHeader(uEntry.getKey(), uEntry.getValue());
          }
          if (("content-type").equalsIgnoreCase(uEntry.getKey())) {
             this.g = MediaType.parse(uEntry.getValue());
          }
          if (("x-aegon-remote-ip").equalsIgnoreCase(uEntry.getKey()) && !TextUtils.isEmpty(uEntry.getValue())) {
             inetSocketAd = new InetSocketAddress(InetAddress.getByName(uEntry.getValue()), i);
          }
       }
       this.c.protocol(protocol);
       this.i = new d$b(this.f.call().request(), nO_PROXY, protocol, inetSocketAd);
       this.j.connectStart(this.f.call(), inetSocketAd, nO_PROXY);
       this.j.connectEnd(this.f.call(), inetSocketAd, nO_PROXY, protocol);
       this.j.connectionAcquired(this.f.call(), this.i);
       this.j.requestHeadersStart(this.f.call());
       this.j.requestHeadersEnd(this.f.call(), this.f.request());
       d th = this.h;
       if (th != null && th.contentLength() > 0) {
          this.j.requestBodyStart(this.f.call());
          this.j.requestBodyEnd(this.f.call(), this.h.contentLength());
       }
       this.j.responseHeadersStart(this.f.call());
       this.j.responseHeadersEnd(this.f.call(), this.c.build());
       this.j.responseBodyStart(this.f.call());
       p0.e(ByteBuffer.allocateDirect(0x8000));
       return;
    }
    public void f(q p0,r p1){
       d tc;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "5")) {
          return;
       }
       t.a("CronetInterceptor", "onSucceeded. requestId: "+this.a);
       this.j.responseBodyEnd(this.f.call(), this.b.p());
       if (this.i != null) {
          this.j.connectionReleased(this.f.call(), this.i);
       }
       this.c.receivedResponseAtMillis(System.currentTimeMillis());
       if (p1.j()) {
          tc = this.c;
          tc.cacheResponse(tc.build());
          this.c.networkResponse(new Response$Builder().request(this.f.request()).protocol(this.g(p1.e())).code(304).message("Not Modified").build());
       }else {
          tc = this.c;
          tc.networkResponse(tc.build());
       }
       this.c.body(ResponseBody.create(this.g, this.b.p(), this.b));
       _monitor_enter(this);
       this.d = true;
       this.notifyAll();
       _monitor_exit(this);
       return;
    }
    public final Protocol g(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0.toLowerCase();
       if (p0.contains("quic") || p0.contains("h3")) {
          return Protocol.QUIC;
       }
       if (p0.contains("h2")) {
          return Protocol.HTTP_2;
       }
       if (p0.contains("http/1.1")) {
          return Protocol.HTTP_1_1;
       }
       return Protocol.HTTP_1_0;
    }
}
