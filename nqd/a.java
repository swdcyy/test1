package nqd.a;
import nqd.b;
import java.lang.StringBuilder;
import java.lang.String;
import io.netty.buffer.d;
import java.lang.Class;
import zqd.w;
import io.netty.channel.a0;
import io.netty.channel.d;
import java.nio.channels.SelectableChannel;
import io.netty.channel.m;
import java.lang.Object;
import lqd.b;
import java.lang.Error;
import wqd.m;
import kqd.v;
import kqd.e;
import io.netty.buffer.f;
import io.netty.util.internal.PlatformDependent;
import io.netty.buffer.f$d;
import io.netty.util.Recycler;
import kqd.c;
import io.netty.buffer.f$c;
import io.netty.buffer.a;
import java.lang.UnsupportedOperationException;
import io.netty.channel.a$a;
import nqd.b$a;
import java.nio.channels.SelectionKey;
import nqd.a$a;
import nqd.c;
import java.lang.Runnable;
import io.netty.util.concurrent.m;
import nqd.a$b;

public abstract class a extends b	// class@001eab
{
    public Runnable G;
    public static final String H;

    static {
       a.H = " \(expected: "+w.a(d.class)+", "+w.a(a0.class)+')';
    }
    public void a(d p0,SelectableChannel p1){
       super(p0, p1, 1);
    }
    public void h(m p0){
       int i1;
       int i2;
       a uoa = this;
       m om = p0;
       b uob = -1;
       boolean b = false;
       while (true) {
          Object obj = p0.c();
          if (obj == null) {
             this.t0();
             return;
          }else {
             long l = 0;
             int i = 1;
             if (obj instanceof d) {
                if (!obj.L5()) {
                   p0.k();
                }else if(uob == -1){
                   uob = this.N().k0();
                }
                i1 = uob - 1;
                while (true) {
                   if (i1 >= 0) {
                      i2 = uoa.v0(obj);
                      if (!i2) {
                         b = true;
                      label_0047 :
                         i = 0;
                      }else {
                         l = l + (long)i2;
                         if (!obj.R4()) {
                         }else {
                            i1 = i1 - 1;
                         }
                      }
                   }else {
                      goto label_0047 ;
                   }
                }
                om.j(l);
                if (i) {
                   p0.k();
                }
             }else if(obj instanceof a0){
                i1 = (obj.s() - obj.s0() >= 0)? 1: 0;
                if (!i1) {
                   if (uob == -1) {
                      uob = this.N().k0();
                   }
                   i2 = uob - 1;
                   long l1 = l;
                   while (true) {
                      if (i2 >= 0) {
                         long l2 = uoa.w0(obj);
                         if (!l2 - l) {
                            i = i1;
                            b = true;
                         label_0094 :
                            om.j(l1);
                            i1 = i;
                         }else {
                            l1 = l1 + l2;
                            if (obj.s() - obj.s0() >= 0) {
                               goto label_0094 ;
                            }else {
                               i2 = i2 - 1;
                            }
                         }
                      }else {
                         i = i1;
                         goto label_0094 ;
                      }
                   }
                }
                if (i1) {
                   p0.k();
                }
             }else {
                throw new Error();
             }
             break ;
          }
       }
       uoa.x0(b);
       return;
    }
    public final Object k(Object p0){
       d uod1;
       if (p0 instanceof d) {
          d uod = p0;
          if (uod.Q4()) {
             return p0;
          }
          int i = uod.L5();
          if (!i) {
             m.b(uod);
             uod = v.d;
          }else {
             e uoe = this.N().h0();
             if (uoe.e()) {
                uod1 = uoe.r(i);
                uod1.E6(uod, uod.M5(), i);
                m.b(uod);
             }else if(f.d <= 0){
                uod1 = null;
             }else {
                int i1 = 1;
                if (PlatformDependent.q()) {
                   uod1 = f$d.t.a();
                   uod1.D7(i1);
                }else {
                   uod1 = f$c.s.a();
                   uod1.D7(i1);
                }
             }
             if (uod1 != null) {
                uod1.E6(uod, uod.M5(), i);
                m.b(uod);
             }
             uod = uod1;
          }
          return uod;
       }else if(p0 instanceof a0){
          return p0;
       }else {
          throw new UnsupportedOperationException("unsupported message type: "+w.b(p0)+a.H);
       }
    }
    public a$a n(){
       return this.y0();
    }
    public final void t0(){
       SelectionKey selectionKey = this.q0();
       if (!selectionKey.isValid()) {
          return;
       }
       int i = selectionKey.interestOps();
       if (i & 0x04) {
          selectionKey.interestOps((i & 0xfb));
       }
       return;
    }
    public abstract int u0(d p0);
    public abstract int v0(d p0);
    public abstract long w0(a0 p0);
    public final void x0(boolean p0){
       if (p0) {
          SelectionKey selectionKey = this.q0();
          if (selectionKey.isValid()) {
             int i = selectionKey.interestOps();
             if (!(i & 0x04)) {
                selectionKey.interestOps((i | 0x04));
             }
          }
       }else {
          a tG = this.G;
          if (tG == null) {
             tG = new a$a(this);
             this.G = tG;
          }
          this.u().execute(tG);
       }
       return;
    }
    public b$a y0(){
       return new a$b(this);
    }
}
