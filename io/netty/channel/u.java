package io.netty.channel.u;
import lqd.i;
import java.lang.Class;
import ard.b;
import ard.c;
import io.netty.channel.u$a;
import io.netty.channel.a;
import java.lang.Object;
import io.netty.util.ResourceLeakDetector$Level;
import io.netty.util.ResourceLeakDetector;
import java.lang.Enum;
import java.lang.String;
import java.util.Objects;
import io.netty.channel.u$i;
import io.netty.channel.u$h;
import io.netty.channel.b;
import java.lang.StringBuilder;
import zqd.w;
import java.util.concurrent.Future;
import java.lang.Thread;
import java.lang.Throwable;
import java.util.concurrent.ExecutionException;
import io.netty.util.internal.PlatformDependent;
import lqd.e;
import io.netty.channel.g;
import io.netty.channel.h;
import io.netty.channel.ChannelPipelineException;
import yqd.f;
import lqd.l;
import lqd.f;
import java.util.IdentityHashMap;
import java.util.Map;
import yqd.e;
import lqd.m;
import io.netty.channel.t;
import lqd.b;
import io.netty.channel.d;
import io.netty.util.concurrent.e;
import java.util.NoSuchElementException;
import io.netty.channel.r;
import io.netty.channel.e;
import java.net.SocketAddress;
import io.netty.channel.u$b;
import java.lang.Runnable;
import io.netty.util.concurrent.f;
import java.util.LinkedHashMap;
import io.netty.channel.u$c;
import wqd.m;
import wqd.n;
import java.util.Iterator;
import java.util.Set;
import io.netty.channel.u$d;
import java.util.concurrent.ScheduledExecutorService;
import java.util.List;
import java.util.ArrayList;
import io.netty.channel.u$e;
import io.netty.channel.u$g;
import io.netty.channel.u$f;
import java.lang.IllegalArgumentException;

public final class u implements i	// class@0010cc
{
    public final a b;
    public final b c;
    public final b d;
    public final boolean e;
    public Map f;
    public static final b g;
    public static final e h;
    public static final boolean i;

    static {
       u.g = c.a(u.class);
       u.h = new u$a();
    }
    public void u(a p0){
       super();
       boolean b = (ResourceLeakDetector.a().ordinal() > ResourceLeakDetector$Level.DISABLED.ordinal())? true: false;
       this.e = b;
       Objects.requireNonNull(p0, "channel");
       this.b = p0;
       u$i oi = new u$i(this);
       this.d = oi;
       u$h oh = new u$h(this);
       this.c = oh;
       oh.b = oi;
       oi.c = oh;
       return;
    }
    public static String E(Class p0){
       return w.a(p0)+"#0";
    }
    public static void g0(Future p0){
       try{
          p0.get();
       }catch(java.util.concurrent.ExecutionException e0){
          PlatformDependent.H(e0.getCause());
       }catch(java.lang.InterruptedException e0){
          Thread.currentThread().interrupt();
       }
       return;
    }
    public static void s(e p0){
       g og = p0.n0();
       if (og instanceof h) {
          if (og.i() || og.b == null) {
             og.b = true;
          }else {
             throw new ChannelPipelineException(og.getClass().getName()+" is not a @Sharable handler, so can\'t be added or removed multiple times.");
          }
       }
       return;
    }
    public i A(Throwable p0){
       this.c.A(p0);
       return this;
    }
    public synchronized i A0(f p0,String p1,String p2,g p3){
       this.d(this.H(p1), new l(this, this.B(p0), this.w(p2, p3), p3));
       return this;
    }
    public final f B(f p0){
       if (p0 == null) {
          return null;
       }
       u tf = this.f;
       if (tf == null) {
          tf = new IdentityHashMap(4);
          this.f = tf;
       }
       f uof = tf.get(p0);
       if (uof == null) {
          e uoe = p0.next();
          uof = (uoe instanceof m)? uoe.Y3(): new t(uoe);
          tf.put(p0, uof);
       }
       return uof;
    }
    public i C(){
       this.c.C();
       if (this.b.N().l0()) {
          this.read();
       }
       return this;
    }
    public synchronized i C2(f p0,String p1,g p2){
       this.l(new l(this, this.B(p0), this.w(p1, p2), p2));
       return this;
    }
    public final String D(g p0){
       Map map = u.h.b();
       Class class = p0.getClass();
       String str = map.get(class);
       if (str == null) {
          str = u.E(class);
          map.put(class, str);
       }
       _monitor_enter(this);
       if (this.t(str) != null) {
          int i = 1;
          String str1 = str.substring(0, (str.length() - i));
          str = str1+i;
          while (this.t(str) != null) {
             i = i + 1;
          }
       }
       _monitor_exit(this);
       return str;
    }
    public synchronized i D1(f p0,String p1,String p2,g p3){
       this.b(this.H(p1), new l(this, p0, this.w(p2, p3), p3));
       return this;
    }
    public final b F(g p0){
       b uob = this.Z2(p0);
       if (uob != null) {
          return uob;
       }
       throw new NoSuchElementException(p0.getClass().getName());
    }
    public final b G(Class p0){
       b uob = this.k1(p0);
       if (uob != null) {
          return uob;
       }
       throw new NoSuchElementException(p0.getName());
    }
    public i G0(g[] p0){
       Objects.requireNonNull(p0, "handlers");
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p0[i];
          if (oobject == null) {
             break ;
          }else {
             this.s3(null, null, oobject);
          }
       }
       return this;
    }
    public final b H(String p0){
       b uob = this.a4(p0);
       if (uob != null) {
          return uob;
       }
       throw new NoSuchElementException(p0);
    }
    public e I(r p0){
       return this.d.I(p0);
    }
    public synchronized i I2(f p0,String p1,String p2,g p3){
       this.d(this.H(p1), new l(this, p0, this.w(p2, p3), p3));
       return this;
    }
    public e K(SocketAddress p0,r p1){
       this.d.K(p0, p1);
       return p1;
    }
    public e L(Object p0,r p1){
       this.d.L(p0, p1);
       return p1;
    }
    public e M(r p0){
       this.d.M(p0);
       return p0;
    }
    public i M1(f p0,String p1,g p2){
       this.l(new l(this, p0, this.w(p1, p2), p2));
       return this;
    }
    public final b N(b p0){
       _monitor_enter(this);
       if (!p0.o().e0() || p0.i0().q0()) {
          this.a0(p0);
          _monitor_exit(this);
          return p0;
       }else {
          _monitor_exit(this);
          u.g0(p0.i0().submit(new u$b(this, p0)));
          return p0;
       }
    }
    public i N1(f p0,g[] p1){
       Objects.requireNonNull(p1, "handlers");
       int len = p1.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p1[i];
          if (oobject == null) {
             break ;
          }else {
             _monitor_enter(this);
             this.m(new l(this, this.B(p0), this.w(this.D(oobject), oobject), oobject));
             _monitor_exit(this);
          }
       }
       return this;
    }
    public Map N3(){
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       b b = this.c.b;
       while (b != this.d) {
          linkedHashMa.put(b.name(), b.n0());
          b = b.b;
       }
       return linkedHashMa;
    }
    public e O(SocketAddress p0,SocketAddress p1,r p2){
       this.d.O(p0, p1, p2);
       return p2;
    }
    public synchronized i O0(f p0,String p1,g p2){
       this.m(new l(this, this.B(p0), this.w(p1, p2), p2));
       return this;
    }
    public e P(){
       u td = this.d;
       r or = td.Z();
       td.S(or);
       return or;
    }
    public e Q(Object p0){
       u td = this.d;
       r or = td.Z();
       td.T(p0, or);
       return or;
    }
    public e R(Object p0){
       u td = this.d;
       r or = td.Z();
       td.L(p0, or);
       return or;
    }
    public i R1(g[] p0){
       Objects.requireNonNull(p0, "handlers");
       if (p0.length && p0[0] != null) {
          int i = 1;
          int i1 = 1;
          while (i1 < p0.length && p0[i1] != null) {
             i1 = i1 + 1;
          }
          for (i1 = i1 - i; i1 >= 0; i1 = i1 - 1) {
             this.M1(null, null, p0[i1]);
          }
       }
       return this;
    }
    public e S(r p0){
       this.d.S(p0);
       return p0;
    }
    public e T(Object p0,r p1){
       this.d.T(p0, p1);
       return p1;
    }
    public i T2(g p0){
       this.N(this.F(p0));
       return this;
    }
    public e U(SocketAddress p0,SocketAddress p1){
       u td = this.d;
       r or = td.Z();
       td.O(p0, p1, or);
       return or;
    }
    public e V(SocketAddress p0,r p1){
       this.d.V(p0, p1);
       return p1;
    }
    public e Y(SocketAddress p0){
       u td = this.d;
       r or = td.Z();
       td.V(p0, or);
       return or;
    }
    public synchronized i Y2(f p0,String p1,String p2,g p3){
       this.b(this.H(p1), new l(this, this.B(p0), this.w(p2, p3), p3));
       return this;
    }
    public e Z0(){
       b c = this.d.c;
       if (c == this.c) {
          c = null;
       }
       return c;
    }
    public e Z2(g p0){
       Objects.requireNonNull(p0, "handler");
       b b = this.c.b;
       while (true) {
          if (b == null) {
             return null;
          }
          if (b.n0() == p0) {
             break ;
          }else {
             b = b.b;
          }
       }
       return b;
    }
    public g a(Class p0){
       e uoe = this.k1(p0);
       if (uoe == null) {
          return null;
       }
       return uoe.n0();
    }
    public void a0(b p0){
       b c = p0.c;
       b b = p0.b;
       c.b = b;
       b.c = c;
       this.q(p0);
    }
    public e a4(String p0){
       Objects.requireNonNull(p0, "name");
       return this.t(p0);
    }
    public final void b(b p0,b p1){
       u.s(p1);
       p1.c = p0;
       p1.b = p0.b;
       p0.b.c = p1;
       p0.b = p1;
       this.n(p1);
    }
    public e b0(SocketAddress p0){
       u td = this.d;
       r or = td.Z();
       td.K(p0, or);
       return or;
    }
    public i b1(String p0,String p1,g p2){
       _monitor_enter(this);
       this.d(this.H(p0), new l(this, null, this.w(p1, p2), p2));
       _monitor_exit(this);
       return this;
    }
    public final g c0(b p0,String p1,g p2){
       _monitor_enter(this);
       if (p1 == null) {
          p1 = p0.name();
       }else if(!(p0.name()).equals(p1)){
          p1 = this.w(p1, p2);
       }
       l ol = new l(this, p0.i, p1, p2);
       if (!ol.o().e0() || ol.i0().q0()) {
          this.d0(p0, ol);
          _monitor_exit(this);
          return p0.n0();
       }else {
          _monitor_exit(this);
          u.g0(ol.i0().submit(new u$c(this, p0, ol)));
          return p0.n0();
       }
    }
    public e close(){
       return this.d.close();
    }
    public final void d(b p0,b p1){
       u.s(p1);
       p1.c = p0.c;
       p1.b = p0;
       p0.c.b = p1;
       p0.c = p1;
       this.n(p1);
    }
    public void d0(b p0,b p1){
       u.s(p1);
       b c = p0.c;
       b b = p0.b;
       p1.c = c;
       p1.b = b;
       c.b = p1;
       b.c = p1;
       p0.c = p1;
       p0.b = p1;
       this.n(p1);
       this.q(p0);
    }
    public e disconnect(){
       u td = this.d;
       return td.I(td.Z());
    }
    public Object e0(Object p0,b p1){
       if (this.e != null && p0 instanceof n) {
          p0 = p0.d(p1);
       }
       return p0;
    }
    public i e1(String p0,String p1,g p2){
       _monitor_enter(this);
       this.b(this.H(p0), new l(this, null, this.w(p1, p2), p2));
       _monitor_exit(this);
       return this;
    }
    public i f0(){
       this.c.f0();
       if (this.b.N().l0()) {
          this.b.read();
       }
       return this;
    }
    public i f3(String p0,g p1){
       this.s3(null, p0, p1);
       return this;
    }
    public g first(){
       e uoe = (this.c.b == this.d)? null: this.c.b;
       if (uoe == null) {
          return null;
       }else {
          return uoe.n0();
       }
    }
    public i flush(){
       this.d.flush();
       return this;
    }
    public g get(String p0){
       e uoe = this.a4(p0);
       if (uoe == null) {
          return null;
       }
       return uoe.n0();
    }
    public i h0(Object p0){
       this.c.h0(p0);
       return this;
    }
    public i i2(g p0,String p1,g p2){
       this.c0(this.F(p0), p1, p2);
       return this;
    }
    public e i3(){
       if (this.c.b == this.d) {
          return null;
       }
       return this.c.b;
    }
    public i i4(f p0,g[] p1){
       Objects.requireNonNull(p1, "handlers");
       int len = p1.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p1[i];
          if (oobject == null) {
             break ;
          }else {
             this.s3(p0, null, oobject);
          }
       }
       return this;
    }
    public Iterator iterator(){
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       b b = this.c.b;
       while (b != this.d) {
          linkedHashMa.put(b.name(), b.n0());
          b = b.b;
       }
       return linkedHashMa.entrySet().iterator();
    }
    public i j0(){
       this.c.j0();
       return this;
    }
    public i j1(String p0,g p1){
       this.M1(null, p0, p1);
       return this;
    }
    public i k0(){
       this.c.k0();
       if (!this.b.isOpen()) {
          this.v(this.c.b, false);
       }
       return this;
    }
    public e k1(Class p0){
       Objects.requireNonNull(p0, "handlerType");
       b b = this.c.b;
       while (true) {
          if (b == null) {
             return null;
          }
          if (p0.isAssignableFrom(b.n0().getClass())) {
             break ;
          }else {
             b = b.b;
          }
       }
       return b;
    }
    public final void l(b p0){
       u.s(p0);
       b b = this.c.b;
       p0.c = this.c;
       p0.b = b;
       this.c.b = p0;
       b.c = p0;
       this.n(p0);
    }
    public i l0(){
       this.c.l0();
       return this;
    }
    public g last(){
       b c = this.d.c;
       if (c == this.c) {
          return null;
       }
       return c.n0();
    }
    public final void m(b p0){
       u.s(p0);
       b c = this.d.c;
       p0.c = c;
       p0.b = this.d;
       c.b = p0;
       this.d.c = p0;
       this.n(p0);
    }
    public final void n(b p0){
       if (p0.o().e0() && !p0.i0().q0()) {
          p0.i0().execute(new u$d(this, p0));
          return;
       }else {
          this.p(p0);
          return;
       }
    }
    public g n0(Class p0){
       b uob = this.G(p0);
       this.N(uob);
       return uob.n0();
    }
    public List names(){
       ArrayList uArrayList = new ArrayList();
       b b = this.c.b;
       while (b != null) {
          uArrayList.add(b.name());
          b = b.b;
       }
       return uArrayList;
    }
    public d o(){
       return this.b;
    }
    public void p(b p0){
       p0.n0().f(p0);
       return;
    }
    public i p2(f p0,g[] p1){
       Objects.requireNonNull(p1, "handlers");
       if (p1.length && p1[0] != null) {
          int i = 1;
          int i1 = 1;
          while (i1 < p1.length && p1[i1] != null) {
             i1 = i1 + 1;
          }
          for (i1 = i1 - i; i1 >= 0; i1 = i1 - 1) {
             this.M1(p0, null, p1[i1]);
          }
       }
       return this;
    }
    public final void q(b p0){
       if (p0.o().e0() && !p0.i0().q0()) {
          p0.i0().execute(new u$e(this, p0));
          return;
       }else {
          this.r(p0);
          return;
       }
    }
    public void r(b p0){
       p0.n0().m(p0);
       p0.h = true;
       return;
    }
    public i read(){
       this.d.read();
       return this;
    }
    public g remove(String p0){
       b uob = this.H(p0);
       this.N(uob);
       return uob.n0();
    }
    public g removeFirst(){
       if (this.c.b == this.d) {
          throw new NoSuchElementException();
       }
       b b = this.c.b;
       this.N(b);
       return b.n0();
    }
    public g removeLast(){
       u td = this.d;
       if (this.c.b == td) {
          throw new NoSuchElementException();
       }
       b c = td.c;
       this.N(c);
       return c.n0();
    }
    public synchronized i s3(f p0,String p1,g p2){
       this.m(new l(this, p0, this.w(p1, p2), p2));
       return this;
    }
    public final b t(String p0){
       b b = this.c.b;
       while (true) {
          if (b == this.d) {
             return null;
          }
          if ((b.name()).equals(p0)) {
             break ;
          }else {
             b = b.b;
          }
       }
       return b;
    }
    public String toString(){
       StringBuilder str = w.b(this)+'{';
       b b = this.c.b;
       while (b != this.d) {
          str = str+'('+b.name()+" = "+b.n0().getClass().getName()+')';
          b = b.b;
          if (b == this.d) {
             break ;
          }else {
             str = str+", ";
          }
       }
       return str+'}';
    }
    public void u(Thread p0,b p1,boolean p2){
       u tc = this.c;
       while (p1 != tc) {
          e uoe = p1.i0();
          if (p2 || uoe.U3(p0)) {
             _monitor_enter(this);
             this.a0(p1);
             _monitor_exit(this);
             p1 = p1.c;
             p2 = false;
          }else {
             uoe.execute(new u$g(this, p1));
             break ;
          }
       }
       return;
    }
    public void v(b p0,boolean p1){
       Thread thread = Thread.currentThread();
       u td = this.d;
       while (true) {
          if (p0 == td) {
             this.u(thread, td.c, p1);
             break ;
          }else {
             e uoe = p0.i0();
             if (!p1 && !uoe.U3(thread)) {
                uoe.execute(new u$f(this, p0));
                break ;
             }else {
                p0 = p0.b;
                p1 = false;
             }
          }
       }
       return;
    }
    public final String w(String p0,g p1){
       if (p0 == null) {
          return this.D(p1);
       }
       if (this.t(p0) == null) {
          return p0;
       }
       throw new IllegalArgumentException("Duplicate handler name: "+p0);
    }
    public i x(){
       this.c.x();
       return this;
    }
    public g x0(Class p0,String p1,g p2){
       return this.c0(this.G(p0), p1, p2);
    }
    public i y(Object p0){
       this.c.y(p0);
       return this;
    }
    public g y0(String p0,String p1,g p2){
       return this.c0(this.H(p0), p1, p2);
    }
    public i z2(f p0,g[] p1){
       Objects.requireNonNull(p1, "handlers");
       if (p1.length && p1[0] != null) {
          int i = 1;
          int i1 = 1;
          while (i1 < p1.length && p1[i1] != null) {
             i1 = i1 + 1;
          }
          for (i1 = i1 - i; i1 >= 0; i1 = i1 - 1) {
             object oobject = p1[i1];
             _monitor_enter(this);
             this.l(new l(this, this.B(p0), this.w(this.D(oobject), oobject), oobject));
             _monitor_exit(this);
          }
       }
       return this;
    }
}
