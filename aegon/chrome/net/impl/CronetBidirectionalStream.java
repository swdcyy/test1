package aegon.chrome.net.impl.CronetBidirectionalStream;
import aegon.chrome.net.f;
import aegon.chrome.net.impl.CronetUrlRequestContext;
import java.lang.String;
import aegon.chrome.net.b$b;
import java.util.concurrent.Executor;
import java.util.List;
import java.util.Collection;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import j0.p;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.AbstractMap$SimpleImmutableEntry;
import aegon.chrome.net.impl.CronetBidirectionalStream$f;
import aegon.chrome.net.impl.a;
import K.S;
import java.nio.ByteBuffer;
import j0.k;
import aegon.chrome.net.impl.CronetBidirectionalStream$g;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import a0.n;
import java.lang.Runnable;
import aegon.chrome.net.CronetException;
import aegon.chrome.net.impl.CronetBidirectionalStream$e;
import aegon.chrome.net.b;
import aegon.chrome.net.r;
import java.lang.Exception;
import aegon.chrome.net.impl.CallbackExceptionImpl;
import java.lang.Throwable;
import aegon.chrome.net.impl.CronetBidirectionalStream$d;
import aegon.chrome.net.impl.k;
import aegon.chrome.net.impl.BidirectionalStreamNetworkException;
import aegon.chrome.net.impl.QuicExceptionImpl;
import j0.c;
import j0.l;
import aegon.chrome.net.n$b;
import aegon.chrome.net.n;
import java.nio.Buffer;
import aegon.chrome.net.impl.CronetExceptionImpl;
import java.util.Arrays;
import aegon.chrome.net.impl.CronetBidirectionalStream$b;
import aegon.chrome.net.impl.k$a;
import aegon.chrome.net.impl.CronetBidirectionalStream$c;
import aegon.chrome.net.r$a;
import aegon.chrome.net.impl.CronetBidirectionalStream$a;
import aegon.chrome.net.impl.CronetBidirectionalStream$h;

public class CronetBidirectionalStream extends f	// class@0001c3
{
    public final CronetUrlRequestContext a;
    public final Executor b;
    public final p c;
    public final String d;
    public final int e;
    public final String f;
    public final String[] g;
    public final boolean h;
    public final Collection i;
    public final boolean j;
    public final int k;
    public final boolean l;
    public final int m;
    public CronetException n;
    public final Object o;
    public LinkedList p;
    public LinkedList q;
    public boolean r;
    public boolean s;
    public n$b t;
    public long u;
    public int v;
    public int w;
    public k x;
    public CronetBidirectionalStream$g y;
    public Runnable z;
    public static final boolean A;

    public void CronetBidirectionalStream(CronetUrlRequestContext p0,String p1,int p2,b$b p3,Executor p4,String p5,List p6,boolean p7,Collection p8,boolean p9,int p10,boolean p11,int p12){
       super();
       this.o = new Object();
       int i = 0;
       this.v = i;
       this.w = i;
       this.a = p0;
       this.d = p1;
       int i1 = 4;
       int i2 = 1;
       if (p2) {
          if (p2 != i2) {
             i2 = 3;
             if (p2 != 2) {
                if (p2 != i2) {
                   if (p2 == i1) {
                      i1 = 5;
                   }else {
                      throw new IllegalArgumentException("Invalid stream priority.");
                   }
                }
             }else {
                i1 = 3;
             }
          }else {
             i1 = 2;
          }
       }else {
          i1 = 1;
       }
       this.e = i1;
       this.c = new p(p3);
       this.b = p4;
       this.f = p5;
       String[] stringArray = new String[(p6.size() * 2)];
       Iterator iterator = p6.iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          int i3 = i + 1;
          stringArray[i] = uEntry.getKey();
          i = i3 + 1;
          stringArray[i3] = uEntry.getValue();
       }
       this.g = stringArray;
       this.h = p7;
       this.p = new LinkedList();
       this.q = new LinkedList();
       this.i = p8;
       this.j = p9;
       this.k = p10;
       this.l = p11;
       this.m = p12;
       return;
    }
    public static boolean h(String p0){
       boolean b = (!p0.equals("GET") && !p0.equals("HEAD"))? true: false;
       return b;
    }
    public static ArrayList k(String[] p0){
       ArrayList uArrayList = new ArrayList((p0.length / 2));
       for (int i = 0; i < p0.length; i = i + 2) {
          int i1 = i + 1;
          uArrayList.add(new AbstractMap$SimpleImmutableEntry(p0[i], p0[i1]));
       }
       return uArrayList;
    }
    public void a(){
       CronetBidirectionalStream to = this.o;
       _monitor_enter(to);
       if (this.l() || this.v == null) {
          _monitor_exit(to);
          return;
       }else {
          this.w = 5;
          this.v = 5;
          this.g(true);
          _monitor_exit(to);
          return;
       }
    }
    public void b(){
       CronetBidirectionalStream to = this.o;
       _monitor_enter(to);
       if (!this.l()) {
          CronetBidirectionalStream tw = this.w;
          if (tw == 8 || tw == 9) {
             if (this.p.isEmpty() && this.q.isEmpty()) {
                if (this.s == null) {
                   this.s = true;
                   a.g();
                   S.MGLIR7Sc(this.u, this);
                   if (!CronetBidirectionalStream.h(this.f)) {
                      this.w = 10;
                   }
                }
                _monitor_exit(to);
                return;
             }else if(!this.p.isEmpty()){
                this.q.addAll(this.p);
                this.p.clear();
             }
             if (this.w == 9) {
                _monitor_exit(to);
                return;
             }else {
                this.p();
                _monitor_exit(to);
                return;
             }
          }
       }
       _monitor_exit(to);
       return;
    }
    public boolean c(){
       CronetBidirectionalStream to = this.o;
       _monitor_enter(to);
       _monitor_exit(to);
       return this.l();
    }
    public void d(ByteBuffer p0){
       CronetBidirectionalStream to = this.o;
       _monitor_enter(to);
       k.b(p0);
       k.a(p0);
       if (this.v != 2) {
          throw new IllegalStateException("Unexpected read attempt.");
       }
       if (this.l()) {
          _monitor_exit(to);
          return;
       }else if(this.y == null){
          this.y = new CronetBidirectionalStream$g(this);
       }
       this.v = 3;
       a.g();
       if (S.Md_rPmgC(this.u, this, p0, p0.position(), p0.limit())) {
          _monitor_exit(to);
          return;
       }else {
          this.v = 2;
          throw new IllegalArgumentException("Unable to call native read");
       }
    }
    public void e(){
       CronetBidirectionalStream this;
       CronetBidirectionalStream to = this.o;
       _monitor_enter(to);
       if (this.v != null) {
          throw new IllegalStateException("Stream is already started.");
       }
       int i = 0;
       try{
          a.g();
          long l = this.a.o();
          boolean b = (this.h == null)? true: false;
          this.u = S.MqTDYvZd(this, l, b, this.a.p(), this.j, this.k, this.l, this.m);
          this.a.s();
          a.g();
          this = this.u;
          CronetBidirectionalStream td = this.d;
          CronetBidirectionalStream te = this.e;
          CronetBidirectionalStream tf = this.f;
          CronetBidirectionalStream tg = this.g;
          boolean b1 = (!CronetBidirectionalStream.h(tf))? true: false;
          int i1 = S.McDUim_I(this, this, td, te, tf, tg, b1);
          if (i1 != -1) {
             if (i1 <= 0) {
                this.w = 1;
                this.v = 1;
                _monitor_exit(to);
                return;
             }else {
                i1 = i1 - 1;
                throw new IllegalArgumentException("Invalid header "+this.g[i1]+"="+this.g[(i1 + 1)]);
             }
          }else {
             throw new IllegalArgumentException("Invalid http method "+this.f);
          }
       }catch(java.lang.RuntimeException e2){
          this.g(i);
          throw e2;
       }
    }
    public void f(ByteBuffer p0,boolean p1){
       CronetBidirectionalStream to = this.o;
       _monitor_enter(to);
       k.a(p0);
       if (!p0.hasRemaining() && !p1) {
          throw new IllegalArgumentException("Empty buffer before end of stream.");
       }
       if (this.r != null) {
          throw new IllegalArgumentException("Write after writing end of stream.");
       }
       if (this.l()) {
          _monitor_exit(to);
          return;
       }else {
          this.p.add(p0);
          if (p1) {
             this.r = true;
          }
          _monitor_exit(to);
          return;
       }
    }
    public final void g(boolean p0){
       Object[] objArray = new Object[0];
       n.e(CronetUrlRequestContext.t, "destroyNativeStreamLocked "+this.toString(), objArray);
       if (!this.u) {
          return;
       }
       a.g();
       S.MS2l1kNx(this.u, this, p0);
       this.a.r();
       this.u = 0;
       CronetBidirectionalStream tz = this.z;
       if (tz != null) {
          tz.run();
       }
       return;
    }
    public final void i(CronetException p0){
       this.o(new CronetBidirectionalStream$e(this, p0));
    }
    public void j(CronetException p0){
       this.n = p0;
       CronetBidirectionalStream to = this.o;
       _monitor_enter(to);
       if (this.l()) {
          _monitor_exit(to);
          return;
       }else {
          this.w = 6;
          this.v = 6;
          this.g(false);
          try{
             _monitor_exit(to);
             this.c.b(this, this.x, p0);
          }catch(java.lang.Exception e5){
             Object[] objArray = new Object[]{e5};
             n.a(CronetUrlRequestContext.t, "Exception notifying of failed request", objArray);
          }
          return;
       }
    }
    public boolean l(){
       boolean b = (this.v != null && !this.u)? true: false;
       return b;
    }
    public void m(){
       CronetBidirectionalStream to = this.o;
       _monitor_enter(to);
       if (this.l()) {
          _monitor_exit(to);
          return;
       }else if(this.w != 10 || this.v != 4){
          _monitor_exit(to);
          return;
       }else {
          this.w = 7;
          this.v = 7;
          this.g(false);
          try{
             _monitor_exit(to);
             this.c.g(this, this.x);
          }catch(java.lang.Exception e0){
             Object[] objArray = new Object[]{e0};
             n.a(CronetUrlRequestContext.t, "Exception in onSucceeded method", objArray);
          }
          return;
       }
    }
    public void n(Exception p0){
       Object[] objArray = new Object[]{p0};
       n.a(CronetUrlRequestContext.t, "Exception in CalledByNative method", objArray);
       this.j(new CallbackExceptionImpl("CalledByNative method has thrown an exception", p0));
    }
    public final void o(Runnable p0){
       CronetBidirectionalStream to;
       try{
          this.b.execute(p0);
       }catch(java.util.concurrent.RejectedExecutionException e5){
          Object[] objArray = new Object[]{e5};
          n.a(CronetUrlRequestContext.t, "Exception posting task to executor", objArray);
          to = this.o;
          _monitor_enter(to);
          this.w = 6;
          this.v = 6;
          this.g(0);
          _monitor_exit(to);
       }
       return;
    }
    public final void onCanceled(){
       this.o(new CronetBidirectionalStream$d(this));
    }
    public final void onError(int p0,int p1,int p2,String p3,long p4){
       CronetBidirectionalStream tx = this.x;
       if (tx != null) {
          tx.k(p4);
       }
       if (p0 == 10 || p0 == 3) {
          this.i(new QuicExceptionImpl("Exception in BidirectionalStream: "+p3, p0, p1, p2));
       }else {
          this.i(new BidirectionalStreamNetworkException("Exception in BidirectionalStream: "+p3, p0, p1));
       }
       return;
    }
    public final void onMetricsCollected(long p0,long p1,long p2,long p3,long p4,long p5,long p6,long p7,long p8,long p9,long p10,long p11,long p12,boolean p13,long p14,long p15){
       CronetBidirectionalStream uCronetBidir = this;
       CronetBidirectionalStream o = uCronetBidir.o;
       _monitor_enter(o);
       if (uCronetBidir.t != null) {
          throw new IllegalStateException("Metrics collection should only happen once.");
       }
       c uoc = new c(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15);
       uCronetBidir.t = v0;
       CronetBidirectionalStream v = uCronetBidir.v;
       if (v == 7) {
          v = 0;
       }else if(v == 5){
          v = 2;
       }else {
          v = 1;
       }
       l ol = new l(uCronetBidir.d, uCronetBidir.i, v0, v, uCronetBidir.x, uCronetBidir.n);
       uCronetBidir.a.u(v4);
       _monitor_exit(o);
       return;
    }
    public final void onReadCompleted(ByteBuffer p0,int p1,int p2,int p3,long p4){
       this.x.k(p4);
       if (p0.position() != p2 || p0.limit() != p3) {
          this.i(new CronetExceptionImpl("ByteBuffer modified externally during read", null));
          return;
       }else if(p1 >= 0){
          p2 = p2 + p1;
          if (p2 <= p3) {
             p0.position(p2);
             CronetBidirectionalStream ty = this.y;
             ty.b = p0;
             boolean b = (!p1)? true: false;
             ty.c = b;
             this.o(ty);
             return;
          }
       }
       this.i(new CronetExceptionImpl("Invalid number of bytes read", null));
       return;
    }
    public final void onResponseHeadersReceived(int p0,String p1,String[] p2,long p3){
       CronetBidirectionalStream uCronetBidir = this;
       try{
          String[] stringArray = new String[]{uCronetBidir.d};
          k ok = new k(Arrays.asList(stringArray), p0, "", CronetBidirectionalStream.k(p2), false, p1, null, p3);
          uCronetBidir.x = v11;
          this.o(new CronetBidirectionalStream$b(this));
          return;
       }catch(java.lang.Exception e0){
          this.i(new CronetExceptionImpl("Cannot prepare ResponseInfo", null));
          return;
       }
    }
    public final void onResponseTrailersReceived(String[] p0){
       this.o(new CronetBidirectionalStream$c(this, new k$a(CronetBidirectionalStream.k(p0))));
    }
    public final void onStreamReady(boolean p0){
       this.o(new CronetBidirectionalStream$a(this, p0));
    }
    public final void onWritevCompleted(ByteBuffer[] p0,int[] p1,int[] p2,boolean p3){
       CronetBidirectionalStream to = this.o;
       _monitor_enter(to);
       if (this.l()) {
          _monitor_exit(to);
          return;
       }else {
          this.w = 8;
          if (!this.q.isEmpty()) {
             this.p();
          }
          _monitor_exit(to);
          for (int i = 0; i < p0.length; i = i + 1) {
             object oobject = p0[i];
             if (oobject.position() != p1[i] || oobject.limit() != p2[i]) {
                this.i(new CronetExceptionImpl("ByteBuffer modified externally during write", null));
                break ;
             }else {
                oobject.position(oobject.limit());
                int i1 = 1;
                if (p3) {
                   int i2 = p0.length - i1;
                   if (i == i2) {
                   label_0045 :
                      this.o(new CronetBidirectionalStream$h(this, oobject, i1));
                   }
                }
                i1 = false;
                goto label_0045 ;
             }
          }
          return;
       }
    }
    public final void p(){
       int i = this.q.size();
       ByteBuffer[] uByteBufferA = new ByteBuffer[i];
       int[] ointArray = new int[i];
       int[] ointArray1 = new int[i];
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          ByteBuffer uByteBuffer = this.q.poll();
          uByteBufferA[i1] = uByteBuffer;
          ointArray[i1] = uByteBuffer.position();
          ointArray1[i1] = uByteBuffer.limit();
       }
       this.w = 9;
       this.s = true;
       a.g();
       CronetBidirectionalStream tu = this.u;
       boolean b = (this.r != null && this.p.isEmpty())? true: false;
       if (S.MwJCBTMQ(tu, this, uByteBufferA, ointArray, ointArray1, b)) {
          return;
       }else {
          this.w = 8;
          throw new IllegalArgumentException("Unable to call native writev.");
       }
    }
}
