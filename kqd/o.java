package kqd.o;
import kqd.p;
import java.lang.Object;
import kqd.k;
import java.lang.String;
import java.lang.StringBuilder;

public final class o implements p	// class@001b5f
{
    public final k a;
    public final int b;
    public final int c;
    public final int d;
    public final long[] e;
    public o f;
    public o g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public static final boolean n;

    public void o(int p0){
       super();
       this.a = null;
       this.b = -1;
       this.c = -1;
       this.i = -1;
       this.d = p0;
       this.e = null;
    }
    public void o(o p0,k p1,int p2,int p3,int p4,int p5){
       super();
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       long[] olongArray = new long[(p4 >> 10)];
       this.e = olongArray;
       this.g(p0, p5);
    }
    public int a(){
       return this.i;
    }
    public int b(){
       return this.d;
    }
    public int c(){
       return this.j;
    }
    public int d(){
       return this.m;
    }
    public final void e(o p0){
       this.f = p0;
       o g = p0.g;
       this.g = g;
       g.f = this;
       p0.g = this;
    }
    public long f(){
       o te;
       int i = 0;
       if (this.i == null) {
          return this.i(i);
       }
       if (this.m == null || this.h == null) {
          return -1;
       }
       o tl = this.l;
       int i1 = -1;
       if (tl >= null) {
          this.l = i1;
       }else {
          tl = this.e;
          te = this.k;
          int i2 = 0;
          while (true) {
             if (i2 < te) {
                long l = tl[i2];
                long l1 = ~ l;
                if (l1) {
                   tl = this.j;
                   int i3 = i2 << 6;
                   while (true) {
                      if (i < 64) {
                         l1 = l & 1;
                         if (!l1) {
                            i = i | i3;
                            if (i < tl) {
                               tl = i;
                               break ;
                            }else {
                            label_0048 :
                               tl = -1;
                               break ;
                            }
                         }else {
                            l = l >> 1;
                            i = i + 1;
                         }
                      }else {
                         goto label_0048 ;
                      }
                   }
                }else {
                   i2 = i2 + 1;
                }
             }else {
                goto label_0048 ;
             }
          }
       }
       i = tl >> 6;
       te = this.e;
       te[i] = (1 << (tl & 0x3f)) | te[i];
       i = this.m - 1;
       this.m = i;
       if (!i) {
          this.h();
       }
       return this.i(tl);
    }
    public void g(o p0,int p1){
       boolean b = true;
       this.h = b;
       this.i = p1;
       if (p1) {
          int i = this.d / p1;
          this.m = i;
          this.j = i;
          p1 = 0;
          this.l = p1;
          int i1 = i >> 6;
          this.k = i1;
          i = i & 0x3f;
          if (i) {
             this.k = i1 + b;
          }
          while (p1 < this.k) {
             this.e[p1] = 0;
             p1++;
          }
       }
       this.e(p0);
       return;
    }
    public final void h(){
       o tf = this.f;
       tf.g = this.g;
       this.g.f = tf;
       this.g = null;
       this.f = null;
    }
    public final long i(int p0){
       return ((((long)p0 << 32) | 0x4000000000000000) | (long)this.b);
    }
    public String toString(){
       if (this.h == null) {
          return "\("+this.b+": not in use\)";
       }
       return String.valueOf('(')+this.b+": "+(this.j - this.m)+'/'+this.j+", offset: "+this.c+", length: "+this.d+", elemSize: "+this.i+')';
    }
}
