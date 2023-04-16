package nqd.b$a;
import nqd.b$b;
import io.netty.channel.a$a;
import nqd.b;
import io.netty.channel.a;
import java.net.SocketAddress;
import io.netty.channel.r;
import io.netty.util.concurrent.l;
import io.netty.channel.d;
import lqd.b;
import nqd.c;
import nqd.b$a$a;
import java.util.concurrent.TimeUnit;
import java.lang.Runnable;
import yqd.m;
import yqd.b;
import nqd.b$a$b;
import io.netty.util.concurrent.g;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Throwable;
import java.nio.channels.SelectableChannel;
import java.util.concurrent.ScheduledFuture;
import java.nio.channels.SelectionKey;
import lqd.i;

public abstract class b$a extends a$a implements b$b	// class@001eae
{
    public final b f;
    public static final boolean g;

    static {
    }
    public void b$a(b p0){
       this.f = p0;
       super(p0);
    }
    public final void O(SocketAddress p0,SocketAddress p1,r p2){
       if (p2.k0() && this.i(p2)) {
          b$a tf = this.f;
          if (tf.A == null) {
             boolean b = tf.E();
             if (this.f.r(p0, p1)) {
                this.q(p2, b);
             }else {
                b$a tf1 = this.f;
                tf1.A = p2;
                tf1.C = p0;
                int i = tf1.N().f0();
                if (i > 0) {
                   tf = this.f;
                   tf.B = tf.u().schedule(new b$a$a(this, p0), (long)i, TimeUnit.MILLISECONDS);
                }
                p2.f(new b$a$b(this));
             }
          }else {
             throw new IllegalStateException("connection attempt already made");
          }
       }
       return;
    }
    public final void a(){
       super.k();
    }
    public final SelectableChannel b(){
       return this.f.z();
    }
    public final void c(){
       boolean b = false;
       this.f.s();
       this.q(this.f.A, this.f.E());
       b b1 = this.f.B;
       if (b1 != null) {
          b1.cancel(b);
       }
       this.f.A = null;
       return;
    }
    public final void k(){
       SelectionKey selectionKey = this.f.q0();
       selectionKey = (selectionKey.isValid() && (selectionKey.interestOps() & 0x04))? 1: 0;
       if (selectionKey) {
          return;
       }else {
          super.k();
          return;
       }
    }
    public final void q(r p0,boolean p1){
       if (p0 == null) {
          return;
       }
       boolean b = p0.i0();
       if (!p1 && this.f.E()) {
          this.f.d0().f0();
       }
       if (!b) {
          this.M(this.a0());
       }
       return;
    }
    public final void r(){
       SelectionKey selectionKey = this.f.q0();
       if (!selectionKey.isValid()) {
          return;
       }
       int i = selectionKey.interestOps();
       b w = this.f.w;
       if (i & w) {
          selectionKey.interestOps((i & (~ w)));
       }
       return;
    }
}
