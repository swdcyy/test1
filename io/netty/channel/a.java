package io.netty.channel.a;
import io.netty.channel.d;
import io.netty.util.DefaultAttributeMap;
import java.lang.Class;
import ard.b;
import ard.c;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.NotYetConnectedException;
import zqd.b;
import java.lang.StackTraceElement;
import lqd.s;
import yqd.e;
import io.netty.channel.g0;
import io.netty.channel.a$b;
import io.netty.channel.ChannelId;
import io.netty.channel.DefaultChannelId;
import io.netty.channel.a$a;
import io.netty.channel.u;
import java.net.SocketAddress;
import io.netty.channel.d$a;
import lqd.m;
import java.lang.IllegalStateException;
import java.lang.String;
import io.netty.channel.r;
import io.netty.channel.e;
import lqd.i;
import java.lang.Object;
import io.netty.channel.m;
import io.netty.channel.q;
import io.netty.channel.v;
import java.lang.Throwable;
import io.netty.channel.z;
import io.netty.channel.w;
import java.lang.Comparable;
import lqd.b;
import io.netty.channel.b0$a;
import io.netty.channel.b0;
import kqd.e;
import java.lang.StringBuilder;

public abstract class a extends DefaultAttributeMap implements d	// class@001085
{
    public b0$a d;
    public final d e;
    public final ChannelId f;
    public final d$a g;
    public final i h;
    public final e i;
    public final g0 j;
    public final g0 k;
    public final a$b l;
    public SocketAddress m;
    public SocketAddress n;
    public m o;
    public boolean p;
    public boolean q;
    public String r;
    public static final b s;
    public static final ClosedChannelException t;
    public static final NotYetConnectedException u;

    static {
       a.s = c.a(a.class);
       ClosedChannelException uClosedChann = new ClosedChannelException();
       a.t = uClosedChann;
       NotYetConnectedException notYetConnec = new NotYetConnectedException();
       a.u = notYetConnec;
       StackTraceElement[] l = b.l;
       uClosedChann.setStackTrace(l);
       notYetConnec.setStackTrace(l);
    }
    public void a(d p0){
       super();
       this.i = new s(this, null);
       this.j = new g0(this, true);
       this.k = new g0(this, false);
       this.l = new a$b(this);
       this.e = p0;
       this.f = DefaultChannelId.newInstance();
       this.g = this.n();
       this.h = new u(this);
    }
    public SocketAddress F(){
       a tn = this.n;
       if (tn == null) {
          tn = this.W3().F();
          this.n = tn;
       }
       return tn;
    }
    public m F3(){
       a to = this.o;
       if (to != null) {
          return to;
       }
       throw new IllegalStateException("channel not registered to an event loop");
    }
    public SocketAddress G(){
       a tm = this.m;
       if (tm == null) {
          tm = this.W3().G();
          this.m = tm;
       }
       return tm;
    }
    public e I(r p0){
       return this.h.I(p0);
    }
    public d J(){
       return this.e;
    }
    public e K(SocketAddress p0,r p1){
       return this.h.K(p0, p1);
    }
    public e L(Object p0,r p1){
       return this.h.L(p0, p1);
    }
    public e M(r p0){
       return this.h.M(p0);
    }
    public e O(SocketAddress p0,SocketAddress p1,r p2){
       return this.h.O(p0, p1, p2);
    }
    public e P(){
       return this.h.P();
    }
    public e Q(Object p0){
       return this.h.Q(p0);
    }
    public e R(Object p0){
       return this.h.R(p0);
    }
    public e S(r p0){
       return this.h.S(p0);
    }
    public e T(Object p0,r p1){
       return this.h.T(p0, p1);
    }
    public e U(SocketAddress p0,SocketAddress p1){
       return this.h.U(p0, p1);
    }
    public e V(SocketAddress p0,r p1){
       return this.h.V(p0, p1);
    }
    public boolean V2(){
       m om = this.g.j0();
       boolean b = (om != null && om.i())? true: false;
       return b;
    }
    public q W(){
       return new v(this);
    }
    public d$a W3(){
       return this.g;
    }
    public e X(Throwable p0){
       return new z(this, null, p0);
    }
    public e Y(SocketAddress p0){
       return this.h.Y(p0);
    }
    public r Z(){
       return new w(this);
    }
    public final r a0(){
       return this.j;
    }
    public abstract void b();
    public e b0(SocketAddress p0){
       return this.h.b0(p0);
    }
    public abstract void c(SocketAddress p0);
    public e c0(){
       return this.i;
    }
    public e close(){
       return this.h.close();
    }
    public int compareTo(Object p0){
       int i = (this == p0)? 0: this.id().compareTo(p0.id());
       return i;
    }
    public abstract void d();
    public i d0(){
       return this.h;
    }
    public e disconnect(){
       return this.h.disconnect();
    }
    public void e(){
    }
    public boolean e0(){
       return this.p;
    }
    public final boolean equals(Object p0){
       boolean b = (this == p0)? true: false;
       return b;
    }
    public abstract void f();
    public d flush(){
       this.h.flush();
       return this;
    }
    public void g(){
    }
    public abstract void h(m p0);
    public final int hashCode(){
       return this.f.hashCode();
    }
    public long i1(){
       m om = this.g.j0();
       long l = 0;
       if (om != null) {
          long l1 = (long)om.a.N().m0() - om.i;
          if (l1 - l > 0 && om.i()) {
             l = l1;
          }
       }
       return l;
    }
    public final ChannelId id(){
       return this.f;
    }
    public final b0$a j(){
       if (this.d == null) {
          this.d = this.N().i0().a();
       }
       return this.d;
    }
    public Object k(Object p0){
       return p0;
    }
    public long k3(){
       long l1;
       m om = this.g.j0();
       if (om != null) {
          long l = om.i - (long)om.a.N().b0();
          l1 = 0;
          if (l - l1 > 0) {
             if (om.i()) {
                l = l1;
             }
             l1 = l;
          }
       }else {
          l1 = Long.MAX_VALUE;
       }
       return l1;
    }
    public abstract boolean l(m p0);
    public abstract SocketAddress m();
    public e m0(){
       return this.N().h0();
    }
    public abstract a$a n();
    public abstract SocketAddress p();
    public e r1(){
       return this.l;
    }
    public d read(){
       this.h.read();
       return this;
    }
    public String toString(){
       boolean b = this.E();
       if (this.q == b) {
          a tr = this.r;
          if (tr != null) {
             return tr;
          }
       }
       SocketAddress socketAddres = this.F();
       SocketAddress socketAddres1 = this.G();
       String str = "[id: 0x";
       if (socketAddres != null) {
          if (this.e == null) {
             socketAddres1 = socketAddres;
             socketAddres = socketAddres1;
          }
          StringBuilder str1 = new StringBuilder(96)+str+this.f.asShortText()+", "+socketAddres;
          String str2 = (b)? " => ": " :> ";
          this.r = str1+str2+socketAddres1+']';
       }else if(socketAddres1 != null){
          this.r = new StringBuilder(64)+str+this.f.asShortText()+", "+socketAddres1+']';
       }else {
          this.r = new StringBuilder(16)+str+this.f.asShortText()+']';
       }
       this.q = b;
       return this.r;
    }
}
