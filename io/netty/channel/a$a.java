package io.netty.channel.a$a;
import io.netty.channel.d$a;
import io.netty.channel.a;
import java.lang.Object;
import io.netty.channel.m;
import java.net.SocketAddress;
import io.netty.channel.r;
import io.netty.util.concurrent.l;
import io.netty.channel.d;
import io.netty.channel.a$a$c;
import java.lang.Runnable;
import java.lang.Throwable;
import java.lang.Boolean;
import lqd.b;
import lqd.h;
import java.net.InetSocketAddress;
import java.net.InetAddress;
import io.netty.util.internal.PlatformDependent;
import java.lang.StringBuilder;
import java.lang.String;
import ard.b;
import io.netty.channel.a$a$b;
import wqd.m;
import io.netty.channel.b0$a;
import io.netty.buffer.d;
import io.netty.channel.a0;
import kqd.f;
import io.netty.channel.m$d;
import io.netty.util.Recycler;
import java.net.ConnectException;
import java.lang.StackTraceElement;
import java.net.NoRouteToHostException;
import java.net.SocketException;
import io.netty.channel.g0;
import io.netty.channel.a$a$d;
import io.netty.util.concurrent.g;
import io.netty.channel.w;
import io.netty.util.concurrent.DefaultPromise;
import java.util.concurrent.Executor;
import io.netty.channel.a$a$e;
import java.nio.channels.ClosedChannelException;
import io.netty.channel.a$a$f;
import kqd.v;
import io.netty.channel.a$a$g;
import lqd.f;
import lqd.m;
import io.netty.channel.a$b;
import io.netty.channel.d0$a;
import io.netty.channel.d0;
import java.util.Objects;
import java.lang.IllegalStateException;
import java.lang.Class;
import yqd.e;
import io.netty.channel.a$a$a;
import java.util.concurrent.ScheduledExecutorService;
import java.io.IOException;
import io.netty.channel.a$a$h;
import java.lang.Exception;
import lqd.i;

public abstract class a$a implements d$a	// class@001082
{
    public m a;
    public d0$a b;
    public boolean c;
    public boolean d;
    public final a e;

    public void a$a(a p0){
       this.e = p0;
       super();
       this.a = new m(p0);
       this.d = true;
    }
    public final SocketAddress F(){
       return this.e.p();
    }
    public final SocketAddress G(){
       return this.e.m();
    }
    public final void I(r p0){
       if (!p0.k0()) {
          return;
       }
       this.e.f();
       if (this.e.E() && !this.e.E()) {
          this.l(new a$a$c(this));
       }
       this.p(p0);
       this.f();
       return;
    }
    public final void K(SocketAddress p0,r p1){
       if (!p1.k0() || !this.i(p1)) {
          return;
       }
       if (Boolean.TRUE.equals(this.e.N().n0(h.r)) && (p0 instanceof InetSocketAddress && (!p0.getAddress().isAnyLocalAddress() && !PlatformDependent.u()))) {
          if (PlatformDependent.e == null) {
             PlatformDependent platformDepe = PlatformDependent.class;
             _monitor_enter(platformDepe);
             if (PlatformDependent.e == null) {
                PlatformDependent.e = Boolean.valueOf(PlatformDependent.s());
             }
             _monitor_exit(platformDepe);
          }
          if (!PlatformDependent.e.booleanValue()) {
             a.s.warn("A non-root user can\'t receive a broadcast packet if the socket is not bound to a wildcard address; binding to a non-wildcard address \("+p0+"\) anyway as requested.");
          }
       }
    label_0076 :
       this.e.c(p0);
       if (!this.e.E() && this.e.E()) {
          this.l(new a$a$b(this));
       }
       this.p(p1);
       return;
    }
    public final void L(Object p0,r p1){
       int i1;
       long l;
       a$a ta = this.a;
       if (ta == null) {
          this.o(p1, a.t);
          m.a(p0);
          return;
       }else {
          p0 = this.e.k(p0);
          int i = this.e.j().a(p0);
          if (i < 0) {
             i = 0;
          }
          if (p0 instanceof d) {
             i1 = p0.L5();
          label_0048 :
             l = (long)i1;
          }else if(p0 instanceof a0){
             l = p0.s0();
          }else if(p0 instanceof f){
             i1 = p0.m().L5();
             goto label_0048 ;
          }else {
             l = -1;
          }
          m$d uod = m$d.l.a();
          uod.c = p0;
          uod.i = i;
          uod.h = l;
          uod.f = p1;
          p0 = ta.d;
          if (p0 == null) {
             ta.b = null;
             ta.d = uod;
          }else {
             p0.b = uod;
             ta.d = uod;
          }
          if (ta.c == null) {
             ta.c = uod;
          }
          ta.g((long)i, false);
          return;
       }
    }
    public final void M(r p0){
       this.e(p0, a.t, false);
    }
    public final void S(r p0){
       this.g(p0, false);
    }
    public final r a0(){
       return this.e.k;
    }
    public final Throwable d(Throwable p0,SocketAddress p1){
       ConnectException uConnectExce;
       ConnectException uConnectExce1;
       if (p0 instanceof ConnectException) {
          uConnectExce = new ConnectException(p0.getMessage()+": "+p1);
          uConnectExce.setStackTrace(p0.getStackTrace());
       }else if(p0 instanceof NoRouteToHostException){
          uConnectExce = new NoRouteToHostException(p0.getMessage()+": "+p1);
          uConnectExce.setStackTrace(p0.getStackTrace());
       }else if(p0 instanceof SocketException){
          uConnectExce = new SocketException(p0.getMessage()+": "+p1);
          uConnectExce.setStackTrace(p0.getStackTrace());
       }else {
       label_0078 :
          return uConnectExce1;
       }
       uConnectExce1 = uConnectExce;
       goto label_0078 ;
    }
    public final void e(r p0,Throwable p1,boolean p2){
       if (!p0.k0()) {
          return;
       }
       a$a ta = this.a;
       if (ta == null) {
          if (!p0 instanceof g0) {
             this.e.l.f(new a$a$d(this, p0));
          }
          return;
       }else if(this.e.l.isDone()){
          this.p(p0);
          return;
       }else {
          boolean b = this.e.E();
          this.a = null;
          Executor uExecutor = this.m();
          if (uExecutor != null) {
             a$a$e uoa$e = new a$a$e(this, p0, ta, p1, p2, b);
             uExecutor.execute(v8);
          }else {
             this.h(p0);
             ta.e(p1, p2);
             ta.b(a.t);
             if (this.c != null) {
                this.l(new a$a$f(this, b));
             }else {
                this.j(b);
             }
          }
          return;
       }
    }
    public final void f(){
       if (this.e.isOpen()) {
          return;
       }
       this.M(this.a0());
       return;
    }
    public final void flush(){
       m$d i1;
       a$a ta = this.a;
       if (ta == null) {
          return;
       }
       m c = ta.c;
       if (c != null) {
          if (ta.b == null) {
             ta.b = c;
          }
          do {
             int i = ta.e + 1;
             ta.e = i;
             if (!c.f.k0()) {
                if (c.k == null) {
                   c.k = true;
                   i1 = c.i;
                   m.b(c.c);
                   c.c = v.d;
                   c.i = 0;
                   long l = 0;
                   c.h = l;
                   c.g = l;
                   c.d = null;
                   c.e = null;
                }else {
                   i = 0;
                }
                ta.d((long)i1, 0, 1);
             }
             c = c.b;
          } while (c == null);
          ta.c = null;
       }
       this.k();
       return;
    }
    public final void g(r p0,boolean p1){
       if (!p0.k0()) {
          return;
       }
       if (this.e.p == null) {
          this.p(p0);
          return;
       }else {
          this.l(new a$a$g(this, p1, p0));
          return;
       }
    }
    public final f g0(){
       return this.e.F3().Y3();
    }
    public void h(r p0){
       this.e.d();
       this.e.l.N0();
       this.p(p0);
       return;
    }
    public d0$a h0(){
       if (this.b == null) {
          this.b = this.e.N().j0().a();
       }
       return this.b;
    }
    public final boolean i(r p0){
       if (this.e.isOpen()) {
          return true;
       }
       this.o(p0, a.t);
       return false;
    }
    public final void i0(m p0,r p1){
       Objects.requireNonNull(p0, "eventLoop");
       if (this.e.e0()) {
          p1.a(new IllegalStateException("registered to an event loop already"));
          return;
       }else if(!this.e.l(p0)){
          p1.a(new IllegalStateException("incompatible event loop type: "+p0.getClass().getName()));
          return;
       }else {
          this.e.o = p0;
          if (p0.q0()) {
             this.n(p1);
          }else {
             p0.execute(new a$a$a(this, p1));
          }
          return;
       }
    }
    public void j(boolean p0){
       r or = this.a0();
       p0 = (p0 && !this.e.E())? true: false;
       this.g(or, p0);
       return;
    }
    public final m j0(){
       return this.a;
    }
    public void k(){
       if (this.c != null) {
          return;
       }
       a$a ta = this.a;
       if (ta == null || ta.h()) {
          return;
       }
       boolean b = true;
       this.c = b;
       if (!this.e.E()) {
          if (this.e.isOpen()) {
             ta.e(a.u, b);
          }else {
             ta.e(a.t, false);
          }
          this.c = false;
          return;
       }else {
          this.e.h(ta);
          this.c = false;
          return;
       }
    }
    public final void k0(){
       try{
          this.e.d();
       }catch(java.lang.Exception e0){
          a.s.warn("Failed to close a channel.", e0);
       }
       return;
    }
    public void l(Runnable p0){
       try{
          this.e.F3().execute(p0);
       }catch(java.util.concurrent.RejectedExecutionException e3){
          a.s.warn("Can\'t invoke task later as EventLoop rejected it", e3);
       }
       return;
    }
    public final void l0(){
       if (!this.e.E()) {
          return;
       }
       try{
          this.e.b();
       }catch(java.lang.Exception e0){
          this.l(new a$a$h(this, e0));
          this.M(this.a0());
       }
       return;
    }
    public Executor m(){
       return null;
    }
    public void n(r p0){
       if (!p0.k0() || !this.i(p0)) {
          return;
       }
       a$a td = this.d;
       this.e.g();
       this.d = false;
       this.e.p = true;
       this.p(p0);
       this.e.h.x();
       if (td != null && this.e.E()) {
          this.e.h.f0();
       }
    label_0047 :
       return;
    }
    public final void o(r p0,Throwable p1){
       if (!p0 instanceof g0 && !p0.y(p1)) {
          a.s.warn("Failed to mark a promise as failure because it\'s done already: {}", p0, p1);
       }
       return;
    }
    public final void p(r p0){
       if (!p0 instanceof g0 && !p0.i0()) {
          a.s.warn("Failed to mark a promise as success because it is done already: {}", p0);
       }
       return;
    }
}
