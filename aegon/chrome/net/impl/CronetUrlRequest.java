package aegon.chrome.net.impl.CronetUrlRequest;
import j0.m;
import aegon.chrome.net.impl.CronetUrlRequestContext;
import java.lang.String;
import aegon.chrome.net.q$b;
import java.util.concurrent.Executor;
import java.util.Collection;
import aegon.chrome.net.n$a;
import java.lang.Object;
import java.util.ArrayList;
import aegon.chrome.net.impl.CronetUrlRequest$HeadersList;
import aegon.chrome.net.impl.CronetUrlRequest$b;
import java.util.Objects;
import aegon.chrome.net.impl.m;
import j0.t;
import aegon.chrome.net.impl.CronetUrlRequest$k;
import aegon.chrome.net.impl.h;
import K.S;
import java.lang.IllegalStateException;
import aegon.chrome.net.q$c;
import aegon.chrome.net.impl.VersionSafeCallbacks$UrlRequestStatusListener;
import aegon.chrome.net.impl.CronetUrlRequest$c;
import java.lang.Runnable;
import java.nio.ByteBuffer;
import j0.k;
import java.lang.IllegalArgumentException;
import j0.d;
import aegon.chrome.net.impl.j$a;
import aegon.chrome.net.impl.j;
import java.lang.Long;
import java.lang.StringBuilder;
import java.util.Iterator;
import java.util.Map$Entry;
import aegon.chrome.net.impl.CronetUploadDataStream;
import java.util.AbstractMap$SimpleImmutableEntry;
import aegon.chrome.net.o;
import java.lang.Thread;
import aegon.chrome.net.InlineExecutionProhibitedException;
import aegon.chrome.net.CronetException;
import a0.n;
import j0.l;
import aegon.chrome.net.n$b;
import aegon.chrome.net.r;
import aegon.chrome.net.n;
import aegon.chrome.net.impl.CronetUrlRequest$j;
import aegon.chrome.net.impl.CronetUrlRequest$a;
import aegon.chrome.net.impl.CronetUrlRequest$g;
import aegon.chrome.net.impl.k;
import aegon.chrome.net.impl.NetworkExceptionImpl;
import aegon.chrome.net.impl.QuicExceptionImpl;
import j0.c;
import aegon.chrome.net.impl.CronetUrlRequest$i;
import aegon.chrome.net.impl.CronetUrlRequest$l;
import java.nio.Buffer;
import aegon.chrome.net.impl.CronetExceptionImpl;
import java.lang.Throwable;
import java.util.List;
import aegon.chrome.net.impl.CronetUrlRequest$d;
import aegon.chrome.net.impl.CronetUrlRequest$e;
import aegon.chrome.net.impl.CronetUrlRequest$h;
import aegon.chrome.net.impl.CronetUrlRequest$f;
import java.lang.Exception;
import aegon.chrome.net.impl.CallbackExceptionImpl;

public final class CronetUrlRequest extends m	// class@0000b6
{
    public int A;
    public CronetException B;
    public c C;
    public CronetUrlRequest$l D;
    public Runnable E;
    public final boolean b;
    public long c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final Object g;
    public final CronetUrlRequestContext h;
    public final Executor i;
    public final List j;
    public final m k;
    public final String l;
    public final int m;
    public final int n;
    public String o;
    public final CronetUrlRequest$HeadersList p;
    public final Collection q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final int u;
    public final boolean v;
    public final int w;
    public final t x;
    public CronetUploadDataStream y;
    public k z;
    public static final boolean F;

    public void CronetUrlRequest(CronetUrlRequestContext p0,String p1,int p2,q$b p3,Executor p4,Collection p5,boolean p6,boolean p7,boolean p8,boolean p9,int p10,boolean p11,int p12,n$a p13,int p14){
       int i4;
       int i = this;
       int i1 = p2;
       Executor uExecutor = p4;
       n$a uoa = p13;
       int i2 = p14;
       super();
       i.g = new Object();
       ArrayList uArrayList = new ArrayList();
       i.j = uArrayList;
       CronetUrlRequest$b uob = null;
       i.p = new CronetUrlRequest$HeadersList(uob);
       Objects.requireNonNull(p1, "URL is required");
       Objects.requireNonNull(p3, "Listener is required");
       Objects.requireNonNull(p4, "Executor is required");
       i.b = p8;
       i.h = p0;
       i.l = p1;
       uArrayList.add(p1);
       int i3 = 2;
       if (i1) {
          if (i1 != 1) {
             if (i1 != i3) {
                i4 = 4;
                if (i1 == i4) {
                   i4 = 5;
                }
             }else {
                i4 = 3;
             }
          }else {
             i4 = 2;
          }
       }else {
          i4 = 1;
       }
       i.m = i4;
       i.k = new m(p3);
       i.i = uExecutor;
       i.q = p5;
       i.r = p6;
       i.s = p7;
       i.t = p9;
       i.u = p10;
       i.v = p11;
       i.w = p12;
       if (uoa) {
          uob = new t(uoa);
       }
       i.x = uob;
       if (i2 != 1) {
          if (i2 != i3) {
             i3 = 0;
          }
       }else {
          i3 = 1;
       }
       i.n = i3;
       return;
    }
    public void a(){
       CronetUrlRequest tg = this.g;
       _monitor_enter(tg);
       if (this.n() || this.d == null) {
          _monitor_exit(tg);
          return;
       }else {
          this.l(2);
          _monitor_exit(tg);
          return;
       }
    }
    public void b(){
       CronetUrlRequest tg = this.g;
       _monitor_enter(tg);
       if (this.e == null) {
          throw new IllegalStateException("No redirect to follow.");
       }
       this.e = false;
       if (this.n()) {
          _monitor_exit(tg);
          return;
       }else {
          h.i();
          S.Mhp54Oqs(this.c, this);
          _monitor_exit(tg);
          return;
       }
    }
    public void c(q$c p0){
       VersionSafeCallbacks$UrlRequestStatusListener urlRequestSt = new VersionSafeCallbacks$UrlRequestStatusListener(p0);
       CronetUrlRequest tg = this.g;
       _monitor_enter(tg);
       if (this.c) {
          h.i();
          S.MgIIMpT9(this.c, this, urlRequestSt);
          _monitor_exit(tg);
          return;
       }else {
          _monitor_exit(tg);
          this.r(new CronetUrlRequest$c(this, urlRequestSt));
          return;
       }
    }
    public boolean d(){
       CronetUrlRequest tg = this.g;
       _monitor_enter(tg);
       _monitor_exit(tg);
       return this.n();
    }
    public void e(ByteBuffer p0){
       k.b(p0);
       k.a(p0);
       CronetUrlRequest tg = this.g;
       _monitor_enter(tg);
       if (this.f == null) {
          throw new IllegalStateException("Unexpected read attempt.");
       }
       this.f = false;
       if (this.n()) {
          _monitor_exit(tg);
          return;
       }else {
          h.i();
          if (S.MfCxA8r3(this.c, this, p0, p0.position(), p0.limit())) {
             _monitor_exit(tg);
             return;
          }else {
             this.f = true;
             throw new IllegalArgumentException("Unable to call native read");
          }
       }
    }
    public void f(){
       int i;
       Map$Entry uEntry;
       CronetUrlRequest tg = this.g;
       _monitor_enter(tg);
       this.k();
       try{
          i = 1;
          this.c = j.b(new d(this)).longValue();
          this.h.s();
          if (this.o != null) {
             h.i();
             if (!S.M51RPBJe(this.c, this, this.o)) {
                throw new IllegalArgumentException("Invalid http method "+this.o);
             }
          }
          IllegalArgumentException illegalArgum = null;
          Iterator iterator = this.p.iterator();
          do {
             if (iterator.hasNext()) {
                uEntry = iterator.next();
                if ((uEntry.getKey()).equalsIgnoreCase("Content-Type") && !(uEntry.getValue()).isEmpty()) {
                   illegalArgum = 1;
                }
             }else {
                CronetUrlRequest ty = this.y;
                if (ty != null) {
                   if (illegalArgum != null) {
                      this.d = i;
                      ty.j(new CronetUrlRequest$b(this));
                      _monitor_exit(tg);
                      return;
                   }else {
                      throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
                   }
                }else {
                   this.d = i;
                   this.t();
                   _monitor_exit(tg);
                   return;
                }
             }
             h.i();
          } while (S.MvHusd1J(this.c, this, uEntry.getKey(), uEntry.getValue()));
          throw new IllegalArgumentException("Invalid header "+uEntry.getKey()+"="+uEntry.getValue());
       }catch(java.lang.RuntimeException e2){
          this.l(i);
          throw e2;
       }
    }
    public void g(String p0,String p1){
       this.k();
       Objects.requireNonNull(p0, "Invalid header name.");
       Objects.requireNonNull(p1, "Invalid header value.");
       this.p.add(new AbstractMap$SimpleImmutableEntry(p0, p1));
    }
    public void h(String p0){
       this.k();
       Objects.requireNonNull(p0, "Method is required.");
       this.o = p0;
    }
    public void i(o p0,Executor p1){
       Objects.requireNonNull(p0, "Invalid UploadDataProvider.");
       if (this.o == null) {
          this.o = "POST";
       }
       this.y = new CronetUploadDataStream(p0, p1, this);
       return;
    }
    public void j(){
       if (this.b == null) {
          InlineExecutionProhibitedException inlineExecut = (Thread.currentThread() == this.h.f)? 1: null;
          if (inlineExecut) {
             throw new InlineExecutionProhibitedException();
          }
       }
       return;
    }
    public final void k(){
       CronetUrlRequest tg = this.g;
       _monitor_enter(tg);
       if (this.d != null || this.n()) {
          throw new IllegalStateException("Request is already started.");
       }
       _monitor_exit(tg);
       return;
    }
    public void l(int p0){
       this.A = p0;
       if (!this.c) {
          return;
       }
       this.h.r();
       h.i();
       CronetUrlRequest tc = this.c;
       boolean b = (p0 == 2)? true: false;
       S.M4znfYdB(tc, this, b);
       this.c = 0;
       return;
    }
    public final void m(CronetException p0){
       CronetUrlRequest tg = this.g;
       _monitor_enter(tg);
       if (this.n()) {
          _monitor_exit(tg);
          return;
       }else {
          this.B = p0;
          this.l(1);
          _monitor_exit(tg);
          return;
       }
    }
    public boolean n(){
       boolean b = (this.d != null && !this.c)? true: false;
       return b;
    }
    public void o(){
       if (this.C == null) {
          Object[] objArray = new Object[0];
          n.a(CronetUrlRequestContext.t, "Request metrics is null, maybe an exception occurred.", objArray);
       }
       l ol = new l(this.l, this.q, this.C, this.A, this.z, this.B);
       this.h.u(v0);
       CronetUrlRequest tx = this.x;
       if (tx != null) {
          try{
             tx.a().execute(new CronetUrlRequest$j(this, v0));
          }catch(java.util.concurrent.RejectedExecutionException e2){
             String t = CronetUrlRequestContext.t;
             Object[] objArray1 = new Object[]{e2};
             String str = "Exception posting task to executor failed on first time";
             try{
                n.a(t, str, objArray1);
                this.x.a().execute(new CronetUrlRequest$a(this, v0));
             }catch(java.util.concurrent.RejectedExecutionException e0){
                Object[] objArray2 = new Object[]{e0};
                n.a(CronetUrlRequestContext.t, "Exception posting task to executor on second time", objArray2);
             }
          }
       }
    }
    public final void onCanceled(){
       this.r(new CronetUrlRequest$g(this));
    }
    public final void onError(int p0,int p1,int p2,String p3,long p4){
       CronetUrlRequest tz = this.z;
       if (tz != null) {
          tz.k(p4);
       }
       if (p0 == 10 || p0 == 3) {
          this.m(new QuicExceptionImpl("Exception in CronetUrlRequest: "+p3, p0, p1, p2));
       }else {
          switch (p0){
              case 1:
                p0 = 1;
                break;
              case 2:
                p0 = 2;
                break;
              case 3:
                p0 = 3;
                break;
              case 4:
                p0 = 4;
                break;
              case 5:
                p0 = 5;
                break;
              case 6:
                p0 = 6;
                break;
              case 7:
                p0 = 7;
                break;
              case 8:
                p0 = 8;
                break;
              case 9:
                p0 = 9;
                break;
              case 10:
                p0 = 10;
                break;
              case 11:
                p0 = 11;
                break;
              default:
                Object[] objArray = new Object[0];
                n.a(CronetUrlRequestContext.t, "Unknown error code: "+p0, objArray);
          }
          this.m(new NetworkExceptionImpl("Exception in CronetUrlRequest: "+p3, p0, p1));
       }
       return;
    }
    public final void onMetricsCollected(long p0,long p1,long p2,long p3,long p4,long p5,long p6,long p7,long p8,long p9,long p10,long p11,long p12,boolean p13,long p14,long p15){
       CronetUrlRequest uCronetUrlRe = this;
       CronetUrlRequest g = uCronetUrlRe.g;
       _monitor_enter(g);
       if (uCronetUrlRe.C != null) {
          throw new IllegalStateException("Metrics collection should only happen once.");
       }
       c uoc = new c(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15);
       uCronetUrlRe.C = v0;
       _monitor_exit(g);
       return;
    }
    public final void onNativeAdapterDestroyed(){
       CronetUrlRequest tg = this.g;
       _monitor_enter(tg);
       CronetUrlRequest tE = this.E;
       if (tE != null) {
          tE.run();
       }
       if (this.B == null) {
          _monitor_exit(tg);
          return;
       }else {
          _monitor_exit(tg);
          try{
             CronetUrlRequest$i oi = new CronetUrlRequest$i(this);
             this.i.execute(oi);
          }catch(java.util.concurrent.RejectedExecutionException e0){
             Object[] objArray = new Object[]{e0};
             n.a(CronetUrlRequestContext.t, "Exception posting task to executor", objArray);
          }
          return;
       }
    }
    public final void onReadCompleted(ByteBuffer p0,int p1,int p2,int p3,long p4){
       this.z.k(p4);
       if (p0.position() != p2 || p0.limit() != p3) {
          this.m(new CronetExceptionImpl("ByteBuffer modified externally during read", null));
          return;
       }else if(this.D == null){
          this.D = new CronetUrlRequest$l(this);
       }
       p0.position((p2 + p1));
       CronetUrlRequest tD = this.D;
       tD.b = p0;
       this.r(tD);
       return;
    }
    public final void onRedirectReceived(String p0,int p1,String p2,String[] p3,boolean p4,String p5,String p6,long p7){
       this.j.add(p0);
       this.r(new CronetUrlRequest$d(this, this.s(p1, p2, p3, p4, p5, p6, p7), p0));
    }
    public final void onResponseStarted(int p0,String p1,String[] p2,boolean p3,String p4,String p5,long p6){
       this.z = this.s(p0, p1, p2, p3, p4, p5, p6);
       this.r(new CronetUrlRequest$e(this));
    }
    public final void onStatus(VersionSafeCallbacks$UrlRequestStatusListener p0,int p1){
       this.r(new CronetUrlRequest$h(this, p0, p1));
    }
    public final void onSucceeded(long p0){
       this.z.k(p0);
       this.r(new CronetUrlRequest$f(this));
    }
    public void p(Exception p0){
       Object[] objArray = new Object[]{p0};
       n.a(CronetUrlRequestContext.t, "Exception in CalledByNative method", objArray);
       this.m(new CallbackExceptionImpl("Exception received from UrlRequest.Callback", p0));
    }
    public void q(Throwable p0){
       Object[] objArray = new Object[]{p0};
       n.a(CronetUrlRequestContext.t, "Exception in upload method", objArray);
       this.m(new CallbackExceptionImpl("Exception received from UploadDataProvider", p0));
    }
    public final void r(Runnable p0){
       try{
          this.i.execute(p0);
       }catch(java.util.concurrent.RejectedExecutionException e4){
          Object[] objArray = new Object[]{e4};
          n.a(CronetUrlRequestContext.t, "Exception posting task to executor", objArray);
          this.m(new CronetExceptionImpl("Exception posting task to executor", e4));
       }
       return;
    }
    public final k s(int p0,String p1,String[] p2,boolean p3,String p4,String p5,long p6){
       int i = p2;
       CronetUrlRequest$HeadersList headersList = new CronetUrlRequest$HeadersList(null);
       for (int i1 = 0; i1 < i.length; i1 = i1 + 2) {
          int i2 = i1 + 1;
          headersList.add(new AbstractMap$SimpleImmutableEntry(i[i1], i[i2]));
       }
       k ok = new k(new ArrayList(this.j), p0, p1, headersList, p3, p4, p5, p6);
       return v10;
    }
    public void t(){
       h.i();
       S.MabZ5m6r(this.c, this);
    }
}
