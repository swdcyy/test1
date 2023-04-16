package jqd.c;
import jqd.a;
import java.lang.Class;
import ard.b;
import ard.c;
import vqd.e;
import java.net.SocketAddress;
import io.netty.channel.e;
import io.netty.channel.r;
import java.util.concurrent.Future;
import jqd.c$a;
import io.netty.util.concurrent.g;
import io.netty.channel.d;
import lqd.m;
import jqd.c$b;
import java.lang.Runnable;
import java.util.concurrent.ScheduledExecutorService;
import lqd.i;
import io.netty.channel.g;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.lang.Object;
import java.util.Map$Entry;
import lqd.b;
import lqd.h;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Throwable;
import wqd.e;
import wqd.d;
import wqd.f;
import java.net.InetSocketAddress;
import java.util.Objects;
import jqd.d;
import lqd.n;
import io.netty.util.concurrent.f;
import io.netty.channel.d$a;
import io.netty.channel.w;
import yqd.j;
import yqd.e;
import yqd.f;
import vqd.d;
import vqd.b;
import vqd.c;
import java.lang.IllegalStateException;
import jqd.b;

public class c extends a	// class@00172d
{
    public d h;
    public SocketAddress i;
    public static final b j;
    public static final d k;

    static {
       c.j = c.a(c.class);
       c.k = e.d;
    }
    public void c(){
       super();
       this.h = c.k;
    }
    public void c(c p0){
       super(p0);
       this.h = c.k;
       this.h = p0.h;
       this.i = p0.i;
    }
    public static e g(SocketAddress p0,SocketAddress p1,e p2,r p3){
       if (p2.isDone()) {
          c.h(p0, p1, p2, p3);
       }else {
          p2.f(new c$a(p0, p1, p2, p3));
       }
       return p3;
    }
    public static void h(SocketAddress p0,SocketAddress p1,e p2,r p3){
       d uod = p3.o();
       c$b uob = new c$b(p2, p1, uod, p0, p3);
       uod.F3().execute(v7);
    }
    public a a(){
       return this.e();
    }
    public void c(d p0){
       Map$Entry uEntry;
       g[] ogArray = new g[]{this.b()};
       p0.d0().G0(ogArray);
       a te = this.e;
       _monitor_enter(te);
       Iterator iterator = te.entrySet().iterator();
       while (iterator.hasNext()) {
          uEntry = iterator.next();
          if (!p0.N().e0(uEntry.getKey(), uEntry.getValue())) {
             c.j.warn("Unknown channel option: "+uEntry);
          }
       }
       _monitor_exit(te);
       a tf = this.f;
       _monitor_enter(tf);
       Iterator iterator1 = tf.entrySet().iterator();
       while (iterator1.hasNext()) {
          uEntry = iterator1.next();
          p0.i(uEntry.getKey()).set(uEntry.getValue());
       }
       _monitor_exit(tf);
       return;
    }
    public Object clone(){
       return this.e();
    }
    public c e(){
       return new c(this);
    }
    public e f(String p0,int p1){
       r or;
       InetSocketAddress inetSocketAd = InetSocketAddress.createUnresolved(p0, p1);
       Objects.requireNonNull(inetSocketAd, "remoteAddress");
       if (this.b == null) {
          throw new IllegalStateException("group not set");
       }
       if (this.c == null) {
          throw new IllegalStateException("channel or channelFactory not set");
       }
       if (this.b() == null) {
          throw new IllegalStateException("handler not set");
       }
       a td = this.d;
       d uod = this.c.a();
       this.c(uod);
       e uoe = this.b.O3(uod);
       if (uoe.z() != null) {
          if (uod.e0()) {
             uod.close();
          }else {
             uod.W3().k0();
          }
       }
       e uoe1 = uoe;
       if (uoe1.z() == null) {
          d uod1 = uoe1.o();
          m om = uod1.F3();
          c th = this.h;
          Objects.requireNonNull(th);
          Objects.requireNonNull(om, "executor");
          if (!om.Q2()) {
             d b = th.b;
             _monitor_enter(b);
             b uob = th.b.get(om);
             if (uob == null) {
                try{
                   uob = th.a(om);
                   th.b.put(om, uob);
                   om.w2().f(new c(th, om, uob));
                }catch(java.lang.Exception e9){
                   throw new IllegalStateException("failed to create a new resolver", e9);
                }
             }
             _monitor_exit(b);
             if (!uob.V2(inetSocketAd) || uob.Z1(inetSocketAd)) {
                or = uod1.Z();
                c.g(inetSocketAd, td, uoe1, or);
             }else {
                f uof = uob.X1(inetSocketAd);
                Throwable throwable = uof.z();
                if (throwable != null) {
                   uod1.close();
                   uoe1 = uod1.X(throwable);
                }else if(uof.isDone()){
                   or = uod1.Z();
                   c.g(uof.A(), td, uoe1, or);
                }else {
                   or = uod1.Z();
                   b uob1 = new b(this, uod1, or, td, uoe1);
                   uof.f(v6);
                }
             }
             uoe1 = or;
          }else {
             throw new IllegalStateException("executor not accepting a task");
          }
       }
       return uoe1;
    }
    public String toString(){
       if (this.i == null) {
          return super.toString();
       }
       String str = super.toString();
       str.setLength((str.length() - 1));
       return str+", remoteAddress: "+this.i+')';
    }
}
