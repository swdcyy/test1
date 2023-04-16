package com.kwai.chat.kwailink.client.c0;
import java.util.concurrent.CopyOnWriteArraySet;
import com.kwai.chat.kwailink.client.f;
import com.kwai.chat.kwailink.client.g;
import p75.c;
import p75.b;
import p75.e;
import p75.g;
import java.lang.Object;
import o75.c0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.StringBuilder;
import com.kwai.chat.kwailink.log.a;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import com.kwai.chat.kwailink.base.b;
import p75.f;
import java.lang.Runnable;
import com.kwai.chat.kwailink.i;
import o75.u;
import com.kwai.chat.kwailink.client.c0$c;
import o75.d;
import o75.t;
import o75.e;
import java.lang.Boolean;
import o75.q;
import com.kwai.chat.kwailink.client.o;
import com.kwai.chat.kwailink.client.c0$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Exception;
import java.lang.SecurityException;
import android.os.RemoteException;
import p75.l;
import android.content.Context;
import o75.y;
import o75.z;
import v75.d;
import com.kwai.chat.kwailink.client.v;
import ca7.v;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle$State;
import m75.h;
import o75.k;
import o75.f;
import com.kwai.chat.kwailink.client.r;
import o75.c;
import o75.e0;
import o75.f0;
import java.util.Map;
import f85.a;
import f85.f;
import f85.c;
import com.kwai.chat.kwailink.data.PacketData;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.IllegalArgumentException;
import com.kwai.chat.kwailink.client.t;
import java.lang.Number;
import java.lang.Integer;
import com.kwai.chat.kwailink.client.x;
import com.kwai.chat.kwailink.client.b;
import com.kwai.chat.kwailink.client.y;
import com.kwai.chat.kwailink.client.z;
import q75.b;
import android.os.SystemClock;
import java.lang.System;
import com.kwai.chat.kwailink.client.i;
import com.kwai.chat.kwailink.client.w;
import o75.j0;
import o75.l;
import com.kwai.chat.kwailink.client.c0$a;
import com.kwai.chat.kwailink.client.e0;
import java.util.concurrent.TimeUnit;
import com.kwai.chat.kwailink.client.l;
import java.util.concurrent.CancellationException;
import java.lang.Throwable;
import java.util.concurrent.ExecutionException;
import com.kwai.chat.kwailink.base.KwaiLinkException;
import java.lang.InterruptedException;
import o75.b0;
import com.kwai.chat.kwailink.client.d0;
import com.kwai.chat.kwailink.client.p;

public class c0	// class@000a2b
{
    public static String A;
    public static c0 a;
    public static final Set b;
    public static boolean c;
    public static final y d;
    public static final Set e;
    public static boolean f;
    public static int g;
    public static final z h;
    public static final Set i;
    public static l j;
    public static final c k;
    public static final b l;
    public static final e m;
    public static final g n;
    public static boolean o;
    public static boolean p;
    public static boolean q;
    public static boolean r;
    public static boolean s;
    public static boolean t;
    public static String u;
    public static String v;
    public static String w;
    public static boolean x;
    public static Boolean y;
    public static boolean z;

    static {
       c0.b = new CopyOnWriteArraySet();
       c0.c = false;
       c0.d = f.a;
       c0.e = new CopyOnWriteArraySet();
       c0.f = false;
       c0.g = 0;
       c0.h = g.a;
       c0.i = new CopyOnWriteArraySet();
       c0.k = new c();
       c0.l = new b();
       c0.m = new e();
       c0.n = new g();
       c0.o = true;
       c0.p = false;
       c0.q = false;
       c0.r = false;
       c0.s = false;
       c0.t = false;
       c0.x = false;
       c0.z = false;
    }
    public void c0(){
       super();
    }
    public static void A(c0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, c0.class, "42")) {
          return;
       }
       g n = c0.n;
       Objects.requireNonNull(n);
       if (!PatchProxy.applyVoidOneRefs(p0, n, g.class, "5")) {
          a.e("ClientSelfCallback", "setLinkPushTokenListener, listener="+p0+", linkPushToken="+g.d);
          g.e.add(p0);
          b.c().execute(new f(p0));
       }
       return;
    }
    public static void B(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, c0.class, "17")) {
          return;
       }
       if (c0.p) {
          return;
       }
       c0.t("setPacketReceiveCallBack", new u(p0));
       return;
    }
    public static void D(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, c0.class, "19")) {
          return;
       }
       if (c0.r) {
          return;
       }
       c0.t("setPushNotifierCallBack", new d(p0));
       return;
    }
    public static void E(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, c0.class, "22")) {
          return;
       }
       if (!c0.z && c0.A != null) {
          c0.t("setTraceConfig", new t(p0));
       }
       return;
    }
    public static void F(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, c0.class, "21")) {
          return;
       }
       if (!c0.x && c0.y != null) {
          c0.t("syncRuntimeState", new e(p0));
       }
       return;
    }
    public static void G(boolean p0){
       c0 uoc0 = c0.class;
       if (PatchProxy.isSupport(uoc0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, uoc0, "2")) {
          return;
       }
       b.c().execute(new q(p0));
       return;
    }
    public static void I(){
       if (PatchProxy.applyVoid(null, null, c0.class, "35")) {
          return;
       }
       b.c().execute(o.b);
       return;
    }
    public static void a(boolean p0,String p1,String p2,String p3){
       c0.s = false;
       c0.t = p0;
       c0.u = p1;
       c0.v = p2;
       c0.w = p3;
    }
    public static Object b(String p0,Object p1,c0$b p2){
       String obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, c0.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0+" start";
       try{
          a.e("KwaiLinkClient", obj);
          p2 = p2.call();
       }catch(android.os.RemoteException e0){
          a.b("KwaiLinkClient", p0+" failed, RemoteException="+e0.getMessage());
          p2.onException(e0);
       }catch(java.lang.SecurityException e0){
          a.b("KwaiLinkClient", p0+" failed, SecurityException="+e0.getMessage());
          p2.onException(e0);
       }catch(java.lang.Exception e0){
          a.b("KwaiLinkClient", p0+" failed, Exception="+e0);
          p2.onException(e0);
       }
       if (p2 != null) {
          p1 = p2;
       }
       a.e("KwaiLinkClient", p0+", value="+p1);
       return p1;
    }
    public static c0 e(){
       c0 uoc0 = c0.class;
       Object obj = PatchProxy.apply(null, null, uoc0, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (c0.a == null) {
          _monitor_enter(uoc0);
          if (c0.a == null) {
             c0.a = new c0();
          }
          _monitor_exit(uoc0);
       }
       return c0.a;
    }
    public static String i(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g obj = PatchProxy.apply(null, null, c0.class, "44");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = c0.n;
       Objects.requireNonNull(obj);
       String str = PatchProxy.apply(null, obj, g.class, "4");
       if (str != patchProxyRe) {
       }else {
          a.e("ClientSelfCallback", "getLinkPushToken, linkPushToken="+g.d);
          str = g.d;
       }
       return str;
    }
    public static i k(){
       c0 uoc0 = c0.class;
       Object[] objArray = null;
       i obj = PatchProxy.apply(objArray, objArray, uoc0, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!b.g()) {
          a.b("KwaiLinkClient", "getRemoteService, KwaiLinkGlobal not inited!!!");
          return objArray;
       }else if(!PatchProxy.applyVoid(objArray, objArray, uoc0, "5") && c0.j == null){
          l ol = l.class;
          _monitor_enter(ol);
          if (c0.j == null) {
             c0.j = new l(b.b(), c0.d, c0.h);
             d.a();
             if (!PatchProxy.applyVoid(objArray, objArray, uoc0, "1") && !b.i()) {
                v.e(v.b);
                c0.G((ProcessLifecycleOwner.get().getLifecycle().getCurrentState().isAtLeast(Lifecycle$State.STARTED) ^ 0x01));
             }
             if (b.h()) {
                h.i();
             }
          }
          _monitor_exit(ol);
       }
       obj = c0.j.a();
       if (obj == null) {
          c0.r();
       }else if(!c0.o || PatchProxy.applyVoidOneRefs(obj, objArray, uoc0, "14")){
          b.c().execute(new k(obj));
       }
       return obj;
    }
    public static l l(){
       return c0.j;
    }
    public static Set m(){
       return c0.i;
    }
    public static boolean n(int p0){
       boolean b = (p0 == 2)? true: false;
       return b;
    }
    public static boolean o(int p0){
       int i = 1;
       if (p0 == i) {
       }else {
          i = false;
       }
       return i;
    }
    public static void p(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, c0.class, "20")) {
          return;
       }
       if (!c0.s && c0.u != null) {
          c0.t("login", new f(p0));
       }
       return;
    }
    public static void r(){
       if (PatchProxy.applyVoid(null, null, c0.class, "13")) {
          return;
       }
       b.c().execute(r.b);
       return;
    }
    public static void t(String p0,c0$c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c0.class, "15")) {
          return;
       }
       String str = p0+" start";
       try{
          a.e("KwaiLinkClient", str);
          p1.run();
       }catch(android.os.RemoteException e0){
          a.b("KwaiLinkClient", p0+" failed, RemoteException="+e0.getMessage());
          p1.onException(e0);
       }catch(java.lang.SecurityException e0){
          a.b("KwaiLinkClient", p0+" failed, SecurityException="+e0.getMessage());
          p1.onException(e0);
       }catch(java.lang.Exception e0){
          a.b("KwaiLinkClient", p0+" failed, Exception="+e0);
          p1.onException(e0);
       }
       return;
    }
    public static void y(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, c0.class, "18")) {
          return;
       }
       if (c0.q) {
          return;
       }
       c0.t("setLinkEventCallBack", new c(p0));
       return;
    }
    public void C(e0 p0,Set p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c0.class, "29")) {
          return;
       }
       a.e("KwaiLinkClient", "setPacketReceiveListener, listener="+p0+", commands="+p1);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, null, f0.class, "9") && !PatchProxy.applyVoidThreeRefs(p0, "$", p1, null, f0.class, "1")) {
          f0.h(p1);
          f0.g(p0, "$", p1, f0.a);
       }
       c0.I();
       return;
    }
    public void H(String p0,Set p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c0.class, "73")) {
          return;
       }
       if (!PatchProxy.applyVoidFourRefs(p0, p1, p2, this, null, f.class, "2")) {
          f.a().execute(new c(p0, p1, p2, this));
       }
       return;
    }
    public final void J(PacketData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "88")) {
          return;
       }
       if (p0 == null) {
          throw new IllegalArgumentException("PacketData is null");
       }
       if (!TextUtils.isEmpty(p0.a())) {
          return;
       }
       throw new IllegalArgumentException("PacketData\'s command is null");
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, c0.class, "50")) {
          return;
       }
       b.c().execute(t.b);
       return;
    }
    public int d(){
       Object obj = PatchProxy.apply(null, this, c0.class, "65");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return c0.b("getAppId", Integer.valueOf(0), x.a).intValue();
    }
    public int f(){
       Object obj = PatchProxy.apply(null, this, c0.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return c0.b("getKwaiLinkConnectState", Integer.valueOf(0), b.a).intValue();
    }
    public String g(){
       Object obj = PatchProxy.apply(null, this, c0.class, "69");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c0.b("getLastConnectMessage", "", y.a);
    }
    public int h(){
       Object obj = PatchProxy.apply(null, this, c0.class, "70");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return c0.b("getLastConnectState", Integer.valueOf(-1), z.a).intValue();
    }
    public long j(){
       long l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       g obj = PatchProxy.apply(objArray, this, c0.class, "63");
       if (obj != patchProxyRe) {
          return obj.longValue();
       }
       obj = c0.n;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, g.class, "2");
       if (obj1 != patchProxyRe) {
          l = obj1.longValue();
       }else {
          Object a = g.a;
          _monitor_enter(a);
          long l1 = 0;
          if (!g.b - l1 || !g.c - l1) {
             g.c = SystemClock.elapsedRealtime();
             g.b = System.currentTimeMillis() + b.f();
          }
          long l2 = g.b + (SystemClock.elapsedRealtime() - g.c);
          l1 = System.currentTimeMillis();
          long l3 = l2 - l1;
          StringBuilder str = "getNtpSynchronizedTime, serverNow["+l2+"] = client_time["+l1;
          a.e("ClientSelfCallback", str+"] + offset["+l3+"]");
          _monitor_exit(a);
          l = l2;
       }
       return l;
    }
    public void q(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "52")) {
          return;
       }
       b.c().execute(new i(this, p0));
       return;
    }
    public void s(){
       if (PatchProxy.applyVoid(null, this, c0.class, "51")) {
          return;
       }
       b.c().execute(w.b);
       return;
    }
    public void u(PacketData p0,int p1,int p2,j0 p3,boolean p4){
       c0 uoc0 = c0.class;
       if (PatchProxy.isSupport(uoc0)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoc0, "82")) {
             return;
          }
       }
       this.J(p0);
       l ol = new l(this, p0, p1, p2, p3, p4);
       b.c().execute(v8);
       return;
    }
    public PacketData v(PacketData p0,int p1){
       c0 uoc0 = c0.class;
       if (PatchProxy.isSupport(uoc0)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc0, "85");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.x(p0, p1, 0, true);
    }
    public PacketData w(PacketData p0,int p1,int p2){
       if (PatchProxy.isSupport(c0.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, c0.class, "86");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.x(p0, p1, p2, true);
    }
    public PacketData x(PacketData p0,int p1,int p2,boolean p3){
       c0$a obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(c0.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3), this, c0.class, "87");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       this.J(p0);
       c0$a uoa = new c0$a(this, p0, p1, p2, p3);
       Object obj1 = PatchProxy.apply(null, obj, e0.class, "1");
       if (obj1 != patchProxyRe) {
          obj = obj1;
       }else {
          obj.m();
       }
       long l = (long)p1;
       try{
          return obj.q(l, TimeUnit.MILLISECONDS);
       }catch(java.lang.InterruptedException e12){
          a.b(v2, "task InterruptedException "+e12.getMessage());
       }catch(java.util.concurrent.ExecutionException e12){
          Throwable cause = e12.getCause();
          if (cause != null && cause instanceof KwaiLinkException) {
             a.b(v2, e12.getMessage());
          }else {
             a.b(v2, "task ExecutionException "+e12.getMessage());
          }
       }catch(java.util.concurrent.CancellationException e12){
          a.b(v2, "task CancellationException "+e12.getMessage());
       }catch(java.util.concurrent.TimeoutException e0){
          a.b(v2, "task TimeoutException, seq="+p0.j()+", cmd="+p0.a());
          if (!PatchProxy.applyVoidOneRefs(p0, this, v1, "89")) {
             b.c().execute(new l(p0));
          }
       }
       return p3;
    }
    public void z(b0 p0){
       c0 uoc0 = c0.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc0, "36")) {
          return;
       }
       a.e("KwaiLinkClient", "setLinkEventListener, listener="+p0);
       d0.g(p0);
       if (!PatchProxy.applyVoid(null, null, uoc0, "38")) {
          b.c().execute(p.b);
       }
       return;
    }
}
