package kqd.q;
import kqd.c;
import io.netty.util.Recycler$e;
import kqd.k;
import io.netty.buffer.i;
import io.netty.buffer.PoolArena;
import java.lang.Object;
import java.nio.ByteBuffer;
import io.netty.buffer.a;
import io.netty.buffer.d;
import java.lang.Math;
import java.util.Objects;
import io.netty.buffer.j;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import java.nio.ByteOrder;
import kqd.e;

public abstract class q extends c	// class@001b61
{
    public final Recycler$e m;
    public k n;
    public long o;
    public Object p;
    public int q;
    public int r;
    public int s;
    public i t;
    public ByteBuffer u;
    public static final boolean v;

    static {
    }
    public void q(Recycler$e p0,int p1){
       super(p1);
       this.m = p0;
    }
    public final void C7(){
       q to = this.o;
       if (to >= 0) {
          this.o = -1;
          this.p = null;
          q tn = this.n;
          tn.a.A(tn, to, this.s, this.t);
          this.m.a(this);
       }
       return;
    }
    public final int E7(int p0){
       return (this.q + p0);
    }
    public void F7(k p0,long p1,int p2,int p3,int p4,i p5){
       this.n = p0;
       this.o = p1;
       this.p = p0.b;
       this.q = p2;
       this.r = p3;
       this.s = p4;
       this.u = null;
       this.t = p5;
    }
    public void G7(k p0,int p1){
       this.n = p0;
       this.o = 0;
       this.p = p0.b;
       this.q = 0;
       this.s = p1;
       this.r = p1;
       this.u = null;
       this.t = null;
    }
    public final ByteBuffer H7(){
       q tu = this.u;
       if (tu == null) {
          tu = this.I7(this.p);
          this.u = tu;
       }
       return tu;
    }
    public abstract ByteBuffer I7(Object p0);
    public final void J7(int p0){
       this.f = p0;
       this.D7(1);
       this.B7(0, 0);
       this.e = 0;
       this.d = 0;
    }
    public final d V1(int p0){
       int i2;
       this.w7();
       q tn = this.n;
       if (tn.c != null) {
          if (p0 == this.r) {
             return this;
          }
       }else {
          q tr1 = this.r;
          if (p0 > tr1) {
             if (p0 <= this.s) {
                this.r = p0;
                return this;
             }
          }else if(p0 < tr1){
             tr1 = this.s;
             if (p0 > (tr1 >> 1)) {
                if (tr1 <= 512) {
                   if (p0 > (tr1 - 16)) {
                      this.r = p0;
                      this.f6(Math.min(this.M5(), p0), Math.min(this.U6(), p0));
                      return this;
                   }
                }else {
                   this.r = p0;
                   this.f6(Math.min(this.M5(), p0), Math.min(this.U6(), p0));
                   return this;
                }
             }
          }else {
             return this;
          }
       }
       k a = tn.a;
       Objects.requireNonNull(a);
       if (p0 >= 0 && p0 <= this.W4()) {
          q tr = this.r;
          if (tr != p0) {
             q tn1 = this.n;
             q to = this.o;
             q tp = this.p;
             q tq = this.q;
             q ts = this.s;
             int i = this.M5();
             int i1 = this.U6();
             a.w(a.a.z(), this, p0);
             if (p0 > tr) {
                a.F(tp, tq, this.p, this.q, tr);
             }else if(p0 < tr){
                if (i < p0) {
                   if (i1 <= p0) {
                      p0 = i1;
                   }
                   a.F(tp, (tq + i), this.p, (this.q + i), (p0 - i));
                label_00a6 :
                   i2 = p0;
                   p0 = i;
                label_00a8 :
                   this.f6(p0, i2);
                   a.A(tn1, to, ts, this.t);
                }else {
                   i2 = p0;
                   goto label_00a8 ;
                }
             }
             p0 = i1;
             goto label_00a6 ;
          }
          return this;
       }else {
          throw new IllegalArgumentException("newCapacity: "+p0);
       }
    }
    public final ByteOrder f5(){
       return ByteOrder.BIG_ENDIAN;
    }
    public final e m0(){
       return this.n.a.a;
    }
    public final d w6(){
       return null;
    }
    public final int y1(){
       return this.r;
    }
}
