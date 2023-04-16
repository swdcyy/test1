package aegon.chrome.net.impl.CronetUrlRequestContext;
import j0.b;
import java.util.HashSet;
import aegon.chrome.net.impl.b;
import java.lang.Object;
import android.os.ConditionVariable;
import java.util.concurrent.atomic.AtomicInteger;
import aegon.chrome.base.e;
import java.util.HashMap;
import android.content.Context;
import aegon.chrome.net.impl.CronetLibraryLoader;
import j0.f;
import java.lang.Runnable;
import aegon.chrome.net.impl.j;
import java.lang.String;
import java.lang.IllegalStateException;
import j0.e;
import aegon.chrome.net.impl.j$a;
import java.lang.Long;
import aegon.chrome.net.impl.CronetUrlRequestContext$a;
import java.lang.NullPointerException;
import java.util.concurrent.Executor;
import a0.n;
import java.net.URLStreamHandlerFactory;
import l0.h;
import aegon.chrome.net.g;
import aegon.chrome.net.impl.CronetUrlRequestContext$e;
import aegon.chrome.net.impl.g;
import K.S;
import aegon.chrome.net.q$b;
import aegon.chrome.net.q$a;
import aegon.chrome.net.h$a;
import java.net.URL;
import java.net.URLConnection;
import java.net.Proxy;
import java.lang.Thread;
import java.lang.IllegalThreadStateException;
import java.lang.RuntimeException;
import aegon.chrome.net.b$b;
import aegon.chrome.net.f$a;
import j0.a;
import java.net.Proxy$Type;
import java.lang.UnsupportedOperationException;
import java.lang.StringBuilder;
import l0.d;
import aegon.chrome.net.d;
import java.util.List;
import java.util.Collection;
import aegon.chrome.net.f;
import aegon.chrome.net.impl.CronetBidirectionalStream;
import aegon.chrome.net.n$a;
import j0.m;
import aegon.chrome.net.impl.CronetUrlRequest;
import java.util.Iterator;
import aegon.chrome.base.e$a;
import j0.r;
import aegon.chrome.net.impl.CronetUrlRequestContext$b;
import j0.s;
import aegon.chrome.net.impl.CronetUrlRequestContext$c;
import java.util.Map;
import aegon.chrome.net.n;
import java.util.ArrayList;
import j0.t;
import aegon.chrome.net.impl.CronetUrlRequestContext$d;

public class CronetUrlRequestContext extends b	// class@0000bc
{
    public final Object b;
    public final ConditionVariable c;
    public final AtomicInteger d;
    public long e;
    public Thread f;
    public final boolean g;
    public final Object h;
    public final Object i;
    public int j;
    public int k;
    public int l;
    public int m;
    public final e n;
    public final e o;
    public final Map p;
    public ConditionVariable q;
    public final String r;
    public boolean s;
    public static final String t = "CronetUrlRequestContext";
    public static final HashSet u;

    static {
       CronetUrlRequestContext.u = new HashSet();
    }
    public void CronetUrlRequestContext(b p0){
       super();
       Object obj = new Object();
       this.b = obj;
       this.c = new ConditionVariable(false);
       this.d = new AtomicInteger(false);
       this.h = new Object();
       this.i = new Object();
       this.j = 0;
       this.k = -1;
       this.l = -1;
       this.m = -1;
       e uoe = new e();
       this.n = uoe;
       e uoe1 = new e();
       this.o = uoe1;
       this.p = new HashMap();
       uoe.l();
       uoe1.l();
       this.g = p0.w();
       CronetLibraryLoader.a(p0.a, p0);
       j.a(new f(this));
       if (p0.u() == 1) {
          String str = p0.B();
          this.r = str;
          HashSet u = CronetUrlRequestContext.u;
          _monitor_enter(u);
          if (u.add(str)) {
             _monitor_exit(u);
          }else {
             throw new IllegalStateException("Disk cache storage path already in use");
          }
       }else {
          this.r = null;
       }
       _monitor_enter(obj);
       long l = j.b(new e(p0)).longValue();
       this.e = l;
       if (l) {
          _monitor_exit(obj);
          CronetLibraryLoader.c(new CronetUrlRequestContext$a(this));
          return;
       }else {
          throw new NullPointerException("Context Adapter creation failed.");
       }
    }
    public static void t(Executor p0,Runnable p1){
       try{
          p0.execute(p1);
       }catch(java.util.concurrent.RejectedExecutionException e2){
          Object[] objArray = new Object[]{e2};
          n.a(CronetUrlRequestContext.t, "Exception posting task to executor", objArray);
       }
       return;
    }
    public URLStreamHandlerFactory a(){
       return new h(this);
    }
    public byte[] b(){
       g.o();
       return S.M7CZ_Klr();
    }
    public String c(){
       return "Cronet/95.0.4638.74fb";
    }
    public q$a d(String p0,q$b p1,Executor p2){
       return super.j(p0, p1, p2);
    }
    public URLConnection e(URL p0){
       return this.k(p0, Proxy.NO_PROXY);
    }
    public void f(){
       if (this.r != null) {
          HashSet u = CronetUrlRequestContext.u;
          _monitor_enter(u);
          u.remove(this.r);
          _monitor_exit(u);
       }
       CronetUrlRequestContext tb = this.b;
       _monitor_enter(tb);
       this.n();
       if (!this.d.get()) {
          if (Thread.currentThread() != this.f) {
             _monitor_exit(tb);
             this.c.block();
             this.h();
             CronetUrlRequestContext tb1 = this.b;
             _monitor_enter(tb1);
             if (!this.q()) {
                _monitor_exit(tb1);
                return;
             }else {
                g.o();
                S.MeBvNXm5(this.e, this);
                this.e = 0;
                _monitor_exit(tb1);
                return;
             }
          }else {
             throw new IllegalThreadStateException("Cannot shutdown from network thread.");
          }
       }else {
          throw new IllegalStateException("Cannot shutdown with active requests.");
       }
    }
    public void g(String p0,boolean p1){
       CronetUrlRequestContext tb = this.b;
       _monitor_enter(tb);
       this.n();
       g.o();
       if (!S.MgwJQAH1(this.e, this, p0, p1)) {
          throw new RuntimeException("Unable to start NetLog");
       }
       this.s = true;
       _monitor_exit(tb);
       return;
    }
    public void h(){
       CronetUrlRequestContext tb = this.b;
       _monitor_enter(tb);
       if (this.s == null) {
          _monitor_exit(tb);
          return;
       }else {
          this.n();
          this.q = new ConditionVariable();
          g.o();
          S.MKFm_qQ7(this.e, this);
          this.s = false;
          _monitor_exit(tb);
          this.q.block();
          return;
       }
    }
    public f$a i(String p0,b$b p1,Executor p2){
       return new a(p0, p1, p2, this);
    }
    public final void initNetworkThread(){
       this.f = Thread.currentThread();
       this.c.open();
       Thread.currentThread().setName("ChromiumNet");
    }
    public URLConnection k(URL p0,Proxy p1){
       if (p1.type() != Proxy$Type.DIRECT) {
          throw new UnsupportedOperationException();
       }
       String protocol = p0.getProtocol();
       if (("http").equals(protocol) || ("https").equals(protocol)) {
          return new d(p0, this);
       }
       throw new UnsupportedOperationException("Unexpected protocol:"+protocol);
    }
    public f l(String p0,b$b p1,Executor p2,String p3,List p4,int p5,boolean p6,Collection p7,boolean p8,int p9,boolean p10,int p11){
       CronetUrlRequestContext b = this.b;
       _monitor_enter(b);
       this.n();
       CronetUrlRequestContext uCronetUrlRe = b;
       CronetBidirectionalStream uCronetBidir = new CronetBidirectionalStream(this, p0, p5, p1, p2, p3, p4, p6, p7, p8, p9, p10, p11);
       _monitor_exit(uCronetUrlRe);
       return v0;
    }
    public m m(String p0,q$b p1,Executor p2,int p3,Collection p4,boolean p5,boolean p6,boolean p7,boolean p8,int p9,boolean p10,int p11,n$a p12,int p13){
       CronetUrlRequestContext b = this.b;
       _monitor_enter(b);
       this.n();
       CronetUrlRequestContext uCronetUrlRe = b;
       CronetUrlRequest uCronetUrlRe1 = new CronetUrlRequest(this, p0, p3, p1, p2, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13);
       _monitor_exit(uCronetUrlRe);
       return v0;
    }
    public final void n(){
       if (this.q()) {
          return;
       }
       throw new IllegalStateException("Engine is shut down.");
    }
    public long o(){
       CronetUrlRequestContext tb = this.b;
       _monitor_enter(tb);
       this.n();
       _monitor_exit(tb);
       return this.e;
    }
    public final void onEffectiveConnectionTypeChanged(int p0){
       CronetUrlRequestContext th = this.h;
       _monitor_enter(th);
       this.j = p0;
       _monitor_exit(th);
    }
    public final void onRTTOrThroughputEstimatesComputed(int p0,int p1,int p2){
       CronetUrlRequestContext th = this.h;
       _monitor_enter(th);
       this.k = p0;
       this.l = p1;
       this.m = p2;
       _monitor_exit(th);
    }
    public final void onRttObservation(int p0,long p1,int p2){
       CronetUrlRequestContext th = this.h;
       _monitor_enter(th);
       Iterator iterator = this.n.iterator();
       Iterator iterator1 = iterator;
       while (iterator1.hasNext()) {
          r or = iterator1.next();
          CronetUrlRequestContext$b uob = new CronetUrlRequestContext$b(this, or, p0, p1, p2);
          CronetUrlRequestContext.t(or.a(), v10);
       }
       _monitor_exit(th);
       return;
    }
    public final void onThroughputObservation(int p0,long p1,int p2){
       CronetUrlRequestContext th = this.h;
       _monitor_enter(th);
       Iterator iterator = this.o.iterator();
       Iterator iterator1 = iterator;
       while (iterator1.hasNext()) {
          s os = iterator1.next();
          CronetUrlRequestContext$c uoc = new CronetUrlRequestContext$c(this, os, p0, p1, p2);
          CronetUrlRequestContext.t(os.a(), v10);
       }
       _monitor_exit(th);
       return;
    }
    public boolean p(){
       CronetUrlRequestContext ti = this.i;
       _monitor_enter(ti);
       boolean b = (!this.p.isEmpty())? true: false;
       _monitor_exit(ti);
       return b;
    }
    public final boolean q(){
       boolean b = (this.e)? true: false;
       return b;
    }
    public void r(){
       this.d.decrementAndGet();
    }
    public void s(){
       this.d.incrementAndGet();
    }
    public void stopNetLogCompleted(){
       this.q.open();
    }
    public void u(n p0){
       CronetUrlRequestContext ti = this.i;
       _monitor_enter(ti);
       if (this.p.isEmpty()) {
          _monitor_exit(ti);
          return;
       }else {
          _monitor_exit(ti);
          Iterator iterator = new ArrayList(this.p.values()).iterator();
          while (iterator.hasNext()) {
             t ot = iterator.next();
             CronetUrlRequestContext$d uod = new CronetUrlRequestContext$d(this, ot, p0);
             CronetUrlRequestContext.t(ot.a(), uod);
          }
          return;
       }
    }
}
