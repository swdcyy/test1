package io.netty.channel.b;
import lqd.e;
import wqd.p;
import io.netty.channel.u;
import lqd.f;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import java.lang.Throwable;
import io.netty.channel.r;
import io.netty.channel.e;
import io.netty.channel.d;
import lqd.g;
import java.net.SocketAddress;
import io.netty.channel.q;
import io.netty.channel.v;
import yqd.e;
import io.netty.channel.z;
import io.netty.channel.w;
import io.netty.channel.a;
import lqd.s;
import lqd.i;
import io.netty.channel.d$a;
import wqd.e;
import wqd.d;
import io.netty.util.DefaultAttributeMap;
import kqd.e;
import lqd.b;
import java.util.concurrent.atomic.AtomicReferenceArray;
import io.netty.util.DefaultAttributeMap$DefaultAttribute;
import java.lang.StringBuilder;
import java.lang.Class;
import zqd.w;

public abstract class b implements e, p	// class@001088
{
    public b b;
    public b c;
    public final boolean d;
    public final boolean e;
    public final u f;
    public final String g;
    public boolean h;
    public final f i;
    public e j;
    public Runnable k;
    public Runnable l;
    public Runnable m;
    public Runnable n;

    public void b(u p0,f p1,String p2,boolean p3,boolean p4){
       super();
       Objects.requireNonNull(p2, "name");
       this.f = p0;
       this.g = p2;
       this.i = p1;
       this.d = p3;
       this.e = p4;
    }
    public e A(Throwable p0){
       b tb = this.b;
       tb.g0().j(tb, p0);
       return this;
    }
    public e C(){
       b uob = this.H();
       uob.g0().q(uob);
       return this;
    }
    public final b H(){
       b uob = this;
       do {
          uob = uob.b;
       } while (uob.d != null);
       return uob;
    }
    public e I(r p0){
       if (this.o().W2().a == null) {
          this.M(p0);
          return p0;
       }else {
          b uob = this.q0();
          uob.g0().p(uob, p0);
          return p0;
       }
    }
    public e K(SocketAddress p0,r p1){
       b uob = this.q0();
       uob.g0().c(uob, p0, p1);
       return p1;
    }
    public e L(Object p0,r p1){
       b uob = this.q0();
       uob.g0().o(uob, this.f.e0(p0, uob), p1);
       return p1;
    }
    public e M(r p0){
       b uob = this.q0();
       uob.g0().g(uob, p0);
       return p0;
    }
    public e O(SocketAddress p0,SocketAddress p1,r p2){
       b uob = this.q0();
       uob.g0().m(uob, p0, p1, p2);
       return p2;
    }
    public e P(){
       r or = this.Z();
       this.S(or);
       return or;
    }
    public e Q(Object p0){
       r or = this.Z();
       this.T(p0, or);
       return or;
    }
    public e R(Object p0){
       r or = this.Z();
       this.L(p0, or);
       return or;
    }
    public e S(r p0){
       b uob = this.q0();
       uob.g0().l(uob, p0);
       return p0;
    }
    public e T(Object p0,r p1){
       b uob = this.q0();
       f uof = uob.g0();
       uof.o(uob, this.f.e0(p0, uob), p1);
       uof.b(uob);
       return p1;
    }
    public e U(SocketAddress p0,SocketAddress p1){
       r or = this.Z();
       this.O(p0, p1, or);
       return or;
    }
    public e V(SocketAddress p0,r p1){
       this.O(p0, null, p1);
       return p1;
    }
    public q W(){
       return new v(this.o(), this.i0());
    }
    public e X(Throwable p0){
       return new z(this.o(), this.i0(), p0);
    }
    public e Y(SocketAddress p0){
       r or = this.Z();
       this.V(p0, or);
       return or;
    }
    public r Z(){
       return new w(this.o(), this.i0());
    }
    public r a0(){
       return this.o().j;
    }
    public e b0(SocketAddress p0){
       r or = this.Z();
       this.K(p0, or);
       return or;
    }
    public e c0(){
       b tj = this.j;
       if (tj == null) {
          tj = new s(this.o(), this.i0());
          this.j = tj;
       }
       return tj;
    }
    public e close(){
       r or = this.Z();
       this.M(or);
       return or;
    }
    public i d0(){
       return this.f;
    }
    public e disconnect(){
       return this.I(this.Z());
    }
    public e f0(){
       b uob = this.H();
       uob.g0().f(uob);
       return this;
    }
    public e flush(){
       b uob = this.q0();
       uob.g0().b(uob);
       return this;
    }
    public f g0(){
       b ti = this.i;
       if (ti == null) {
          ti = this.o().W3().g0();
       }
       return ti;
    }
    public e h0(Object p0){
       b uob = this.H();
       uob.g0().n(uob, p0);
       return this;
    }
    public d i(e p0){
       return this.o().i(p0);
    }
    public e i0(){
       return this.g0().i0();
    }
    public e j0(){
       b uob = this.H();
       uob.g0().k(uob);
       return this;
    }
    public e k0(){
       b uob = this.H();
       uob.g0().d(uob);
       return this;
    }
    public e l0(){
       b uob = this.H();
       uob.g0().h(uob);
       return this;
    }
    public e m0(){
       return this.o().N().h0();
    }
    public String name(){
       return this.g;
    }
    public d o(){
       return this.f.o();
    }
    public boolean o0(){
       return this.h;
    }
    public boolean p0(e p0){
       DefaultAttributeMap uDefaultAttr = this.o();
       Objects.requireNonNull(uDefaultAttr);
       Objects.requireNonNull(p0, "key");
       uDefaultAttr = uDefaultAttr.b;
       boolean b = false;
       if (uDefaultAttr == null) {
       }else {
          DefaultAttributeMap$DefaultAttribute uDefaultAttr1 = uDefaultAttr.get(DefaultAttributeMap.a(p0));
          if (uDefaultAttr1 != null) {
             if (uDefaultAttr1.key != p0 || uDefaultAttr1.removed != null) {
                _monitor_enter(uDefaultAttr1);
                DefaultAttributeMap$DefaultAttribute next = uDefaultAttr1.next;
                while (true) {
                   if (next != null) {
                      if (next.removed == null && next.key == p0) {
                         _monitor_exit(uDefaultAttr1);
                      }else {
                         next = next.next;
                      }
                   }else {
                      _monitor_exit(uDefaultAttr1);
                      break ;
                   }
                }
             }
             b = true;
          }
       }
       return b;
    }
    public final b q0(){
       b uob = this;
       do {
          uob = uob.c;
       } while (uob.e != null);
       return uob;
    }
    public e read(){
       b uob = this.q0();
       uob.g0().e(uob);
       return this;
    }
    public String s(){
       return '''+this.g+"\' will handle the message from this point.";
    }
    public String toString(){
       return w.a(e.class)+'('+this.g+", "+this.o()+')';
    }
    public e x(){
       b uob = this.H();
       uob.g0().i(uob);
       return this;
    }
    public e y(Object p0){
       b uob = this.H();
       uob.g0().a(uob, this.f.e0(p0, uob));
       return this;
    }
}
