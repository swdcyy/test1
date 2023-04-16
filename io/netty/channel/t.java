package io.netty.channel.t;
import lqd.f;
import yqd.e;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import lqd.e;
import io.netty.channel.i;
import io.netty.channel.t$n;
import java.lang.Runnable;
import io.netty.channel.b;
import io.netty.channel.t$g;
import java.util.concurrent.ScheduledExecutorService;
import java.net.SocketAddress;
import io.netty.channel.r;
import io.netty.channel.t$a;
import io.netty.channel.t$i;
import io.netty.channel.t$f;
import io.netty.channel.t$j;
import io.netty.channel.t$d;
import io.netty.channel.t$p;
import io.netty.channel.t$h;
import java.lang.Throwable;
import io.netty.channel.t$l;
import io.netty.channel.u;
import ard.b;
import io.netty.channel.t$k;
import io.netty.channel.t$e;
import io.netty.channel.t$b;
import io.netty.channel.t$m;
import wqd.m;
import io.netty.channel.t$q;
import io.netty.util.Recycler;
import io.netty.channel.d;
import io.netty.channel.d$a;
import io.netty.channel.m;
import io.netty.channel.a;
import io.netty.channel.b0$a;
import io.netty.channel.t$c;
import io.netty.channel.t$o;

public class t implements f	// class@0010c2
{
    public final e a;

    public void t(e p0){
       super();
       Objects.requireNonNull(p0, "executor");
       this.a = p0;
    }
    public void a(e p0,Object p1){
       Objects.requireNonNull(p1, "msg");
       if (this.a.q0()) {
          i.e(p0, p1);
       }else {
          this.r(new t$n(this, p0, p1), p1);
       }
       return;
    }
    public void b(e p0){
       if (this.a.q0()) {
          i.n(p0);
       }else {
          b uob = p0;
          b n = uob.n;
          if (n == null) {
             n = new t$g(this, p0);
             uob.n = n;
          }
          this.a.execute(n);
       }
       return;
    }
    public void c(e p0,SocketAddress p1,r p2){
       Objects.requireNonNull(p1, "localAddress");
       if (!i.t(p0, p2, false)) {
          return;
       }
       if (this.a.q0()) {
          i.a(p0, p1, p2);
       }else {
          this.s(new t$a(this, p0, p1, p2), p2);
       }
       return;
    }
    public void d(e p0){
       if (this.a.q0()) {
          i.g(p0);
       }else {
          this.a.execute(new t$i(this, p0));
       }
       return;
    }
    public void e(e p0){
       if (this.a.q0()) {
          i.o(p0);
       }else {
          b uob = p0;
          b l = uob.l;
          if (l == null) {
             l = new t$f(this, p0);
             uob.l = l;
          }
          this.a.execute(l);
       }
       return;
    }
    public void f(e p0){
       if (this.a.q0()) {
          i.b(p0);
       }else {
          this.a.execute(new t$j(this, p0));
       }
       return;
    }
    public void g(e p0,r p1){
       if (!i.t(p0, p1, false)) {
          return;
       }
       if (this.a.q0()) {
          i.i(p0, p1);
       }else {
          this.s(new t$d(this, p0, p1), p1);
       }
       return;
    }
    public void h(e p0){
       if (this.a.q0()) {
          i.h(p0);
       }else {
          b uob = p0;
          b m = uob.m;
          if (m == null) {
             m = new t$p(this, p0);
             uob.m = m;
          }
          this.a.execute(m);
       }
       return;
    }
    public void i(e p0){
       if (this.a.q0()) {
          i.f(p0);
       }else {
          this.a.execute(new t$h(this, p0));
       }
       return;
    }
    public e i0(){
       return this.a;
    }
    public void j(e p0,Throwable p1){
       Objects.requireNonNull(p1, "cause");
       if (this.a.q0()) {
          i.m(p0, p1);
       }else {
          this.a.execute(new t$l(this, p0, p1));
       }
       return;
    }
    public void k(e p0){
       if (this.a.q0()) {
          i.c(p0);
       }else {
          this.a.execute(new t$k(this, p0));
       }
       return;
    }
    public void l(e p0,r p1){
       if (!i.t(p0, p1, false)) {
          return;
       }
       if (this.a.q0()) {
          i.k(p0, p1);
       }else {
          this.s(new t$e(this, p0, p1), p1);
       }
       return;
    }
    public void m(e p0,SocketAddress p1,SocketAddress p2,r p3){
       Objects.requireNonNull(p1, "remoteAddress");
       if (!i.t(p0, p3, false)) {
          return;
       }
       if (this.a.q0()) {
          i.j(p0, p1, p2, p3);
       }else {
          t$b uob = new t$b(this, p0, p1, p2, p3);
          this.s(v0, p3);
       }
       return;
    }
    public void n(e p0,Object p1){
       Objects.requireNonNull(p1, "event");
       if (this.a.q0()) {
          i.p(p0, p1);
       }else {
          this.r(new t$m(this, p0, p1), p1);
       }
       return;
    }
    public void o(e p0,Object p1,r p2){
       int i;
       Objects.requireNonNull(p1, "msg");
       if (!i.t(p0, p2, true)) {
          m.a(p1);
          return;
       }else if(this.a.q0()){
          i.q(p0, p1, p2);
       }else {
          t$q oq = t$q.k.a();
          oq.e = p0;
          oq.f = p1;
          oq.g = p2;
          i = 0;
          if (t$q.i) {
             m om = p0.o().W3().j0();
             if (om != null) {
                int i1 = p0.o().j().a(p1) + t$q.j;
                oq.h = i1;
                om.g((long)i1, true);
             }else {
                oq.h = i;
             }
          }else {
             oq.h = i;
          }
          this.a.execute(oq);
       }
       return;
    }
    public void p(e p0,r p1){
       if (!i.t(p0, p1, false)) {
          return;
       }
       if (this.a.q0()) {
          i.l(p0, p1);
       }else {
          this.s(new t$c(this, p0, p1), p1);
       }
       return;
    }
    public void q(e p0){
       if (this.a.q0()) {
          i.d(p0);
       }else {
          b uob = p0;
          b k = uob.k;
          if (k == null) {
             k = new t$o(this, p0);
             uob.k = k;
          }
          this.a.execute(k);
       }
       return;
    }
    public final void r(Runnable p0,Object p1){
       this.a.execute(p0);
    }
    public final void s(Runnable p0,r p1){
       this.a.execute(p0);
       return;
    }
}
