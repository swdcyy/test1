package nqd.b;
import io.netty.channel.a;
import java.lang.Class;
import ard.b;
import ard.c;
import java.nio.channels.ClosedChannelException;
import zqd.b;
import java.lang.StackTraceElement;
import io.netty.channel.d;
import java.nio.channels.SelectableChannel;
import java.lang.String;
import java.lang.Throwable;
import io.netty.channel.ChannelException;
import lqd.m;
import nqd.c;
import io.netty.channel.d$a;
import nqd.b$b;
import java.nio.channels.SelectionKey;
import io.netty.util.concurrent.l;
import java.util.concurrent.ScheduledFuture;
import java.nio.channels.Selector;
import java.lang.Object;
import java.net.SocketAddress;

public abstract class b extends a	// class@001eb0
{
    public r A;
    public ScheduledFuture B;
    public SocketAddress C;
    public final SelectableChannel v;
    public final int w;
    public SelectionKey x;
    public boolean y;
    public boolean z;
    public static final b D;
    public static final ClosedChannelException E;
    public static final boolean F;

    static {
       b.D = c.a(b.class);
       ClosedChannelException uClosedChann = new ClosedChannelException();
       b.E = uClosedChann;
       uClosedChann.setStackTrace(b.l);
    }
    public void b(d p0,SelectableChannel p1,int p2){
       super(p0);
       this.v = p1;
       this.w = p2;
       try{
          int i = 0;
          p1.configureBlocking(i);
          return;
       }catch(java.io.IOException e2){
          try{
             p1.close();
          }catch(java.io.IOException e3){
             if (b.D.isWarnEnabled()) {
                b.D.warn("Failed to close a partially initialized socket.", e3);
             }
          }
          throw new ChannelException("Failed to enter non-blocking mode.", e2);
       }
    }
    public m F3(){
       return this.u();
    }
    public d$a W3(){
       return this.s0();
    }
    public void b(){
       if (this.y != null) {
          return;
       }
       b tx = this.x;
       if (!tx.isValid()) {
          return;
       }
       this.z = true;
       int i = tx.interestOps();
       b tw = this.w;
       if (!(i & tw)) {
          tx.interestOps((i | tw));
       }
       return;
    }
    public void d(){
       b tA = this.A;
       if (tA != null) {
          tA.y(b.E);
          this.A = null;
       }
       tA = this.B;
       if (tA != null) {
          tA.cancel(false);
          this.B = null;
       }
       return;
    }
    public void e(){
       c uoc = this.u();
       this.q0().cancel();
       int i = uoc.G + 1;
       uoc.G = i;
       if (i >= 256) {
          uoc.G = 0;
          uoc.H = true;
       }
       return;
    }
    public void g(){
       int i = 0;
       try{
       label_0002 :
          this.x = this.z().register(this.u().B, 0, this);
          return;
       }catch(java.nio.channels.CancelledKeyException e2){
          if (i) {
             throw e2;
          }
          this.u().T0();
          i = 1;
          goto label_0002 ;
       }
    }
    public boolean isOpen(){
       return this.v.isOpen();
    }
    public boolean l(m p0){
       return p0 instanceof c;
    }
    public SelectionKey q0(){
       return this.x;
    }
    public abstract boolean r(SocketAddress p0,SocketAddress p1);
    public void r0(boolean p0){
       this.z = p0;
    }
    public abstract void s();
    public b$b s0(){
       return super.W3();
    }
    public c u(){
       return super.F3();
    }
    public boolean v(){
       return this.z;
    }
    public SelectableChannel z(){
       return this.v;
    }
}
