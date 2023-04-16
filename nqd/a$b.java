package nqd.a$b;
import nqd.b$a;
import nqd.a;
import nqd.b;
import lqd.b;
import io.netty.channel.d;
import lqd.i;
import io.netty.channel.a;
import kqd.e;
import io.netty.channel.d0$a;
import io.netty.channel.a$a;
import io.netty.buffer.d;
import wqd.n;
import java.lang.Object;
import java.lang.Throwable;
import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.lang.Boolean;
import lqd.h;
import pqd.a;
import io.netty.channel.r;

public class a$b extends b$a	// class@001eaa
{
    public final a h;

    public void a$b(a p0){
       this.h = p0;
       super(p0);
    }
    public final void read(){
       b uob = this.h.N();
       if (!uob.l0() && !this.h.v()) {
          this.r();
          return;
       }else {
          i oi = this.h.d0();
          e uoe = uob.h0();
          d0$a uoa = this.h0();
          uoa.f(uob);
          a$b uob1 = 1;
          do {
             d uod = uoa.e(uoe);
             uoa.b(this.h.u0(uod));
             if (uoa.d() <= 0) {
                uod.release();
                break ;
             }else {
                uoa.a(1);
                if (uob1) {
                   this.h.r0(false);
                   uob1 = 0;
                }
             }
             oi.y(uod);
          } while (!uoa.j());
          uoa.i();
          oi.C();
          if (uoa.d() < 0) {
             this.s(oi);
          }
          if (!uob.l0() && !this.h.v()) {
             this.r();
          }
       label_00b9 :
          return;
       }
    }
    public final void s(i p0){
       SelectionKey selectionKey = this.h.q0();
       this.h.y = true;
       if (this.h.isOpen()) {
          if (Boolean.TRUE.equals(this.h.N().n0(h.o))) {
             selectionKey.interestOps((selectionKey.interestOps() & (~ this.h.w)));
             p0.h0(a.a);
          }else {
             this.M(this.a0());
          }
       }
       return;
    }
}
