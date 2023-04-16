package kqd.k;
import kqd.n;
import io.netty.buffer.PoolArena;
import java.lang.Object;
import kqd.o;
import java.lang.Integer;
import kqd.q;
import io.netty.buffer.i;
import io.netty.buffer.j;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.System;

public final class k implements n	// class@001b5b
{
    public final PoolArena a;
    public final Object b;
    public final boolean c;
    public final byte[] d;
    public final byte[] e;
    public final o[] f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final byte n;
    public int o;
    public l p;
    public k q;
    public k r;
    public static final boolean s;

    public void k(PoolArena p0,Object p1,int p2){
       super();
       this.c = true;
       this.a = p0;
       this.b = p1;
       this.d = null;
       this.e = null;
       this.f = null;
       this.g = 0;
       this.h = 0;
       this.i = 0;
       this.j = 0;
       this.n = (byte)true;
       this.k = p2;
       this.l = k.j(p2);
       this.m = 0;
    }
    public void k(PoolArena p0,Object p1,int p2,int p3,int p4,int p5){
       super();
       this.c = false;
       this.a = p0;
       this.b = p1;
       this.h = p2;
       this.i = p4;
       this.j = p3;
       this.k = p5;
       this.n = (byte)(p3 + 1);
       this.l = k.j(p5);
       int i = 1;
       this.g = ~ (p2 - i);
       this.o = p5;
       int i1 = i << p3;
       this.m = i1;
       i1 = i1 << i;
       byte[] uobyteArray = new byte[i1];
       this.d = uobyteArray;
       i1 = new byte[i1];
       this.e = i1;
       i1 = 0;
       uobyteArray = 1;
       while (i1 <= p3) {
          p4 = i << i1;
          for (p5 = 0; p5 < p4; p5++) {
             byte b = (byte)i1;
             this.d[uobyteArray] = b;
             this.e[uobyteArray] = b;
             uobyteArray++;
          }
          i1++;
       }
       o[] ooArray = new o[this.m];
       this.f = ooArray;
       return;
    }
    public static int j(int p0){
       return (Integer.numberOfLeadingZeros(p0) - 31);
    }
    public int a(){
       k to = this.o;
       int i = 100;
       if (to == null) {
          return i;
       }
       int i1 = (int)(((long)to * 100) / (long)this.k);
       if (!i1) {
          return 99;
       }
       return (i - i1);
    }
    public int b(){
       return this.k;
    }
    public int c(){
       return this.o;
    }
    public long d(int p0){
       long l;
       o oo1;
       if (this.g & p0) {
          p0 = this.e((this.j - (k.j(p0) - this.i)));
          if (p0 >= 0) {
             this.o = this.o - this.k(p0);
          }
          return (long)p0;
       }else {
          o oo = this.a.z(p0);
          _monitor_enter(oo);
          int i = this.e(this.j);
          if (i < 0) {
             l = (long)i;
             _monitor_exit(oo);
          }else {
             k tf = this.f;
             k th = this.h;
             this.o = this.o - th;
             int i1 = this.n(i);
             object oobject = tf[i1];
             if (oobject == null) {
                oo1 = new o(oo, this, i, this.l(i), th, p0);
                tf[i1] = v10;
                oo1 = v10;
             }else {
                oobject.g(oo, p0);
             }
             l = oo1.f();
             _monitor_exit(oo);
          }
          return l;
       }
    }
    public final int e(int p0){
       int i = - (1 << p0);
       byte b = this.o(1);
       if (b > p0) {
          return -1;
       }
       int i1 = 1;
       while (true) {
          if (b >= p0) {
             b = i1 & i;
             if (!b) {
             label_0035 :
                i1 = i1 << 1;
                b = this.o(i1);
                if (b > p0) {
                   i1 = i1 ^ 0x01;
                   b = this.o(i1);
                }
             }else {
                this.o(i1);
                this.m(i1, this.n);
                p0 = i1;
                while (p0 > 1) {
                   i = p0 >> 1;
                   b = this.o(p0);
                   p0 = p0 ^ 0x01;
                   byte b1 = this.o(p0);
                   if (b >= b1) {
                      b = b1;
                   }
                   this.m(i, b);
                   b1 = i;
                }
                return i1;
             }
          }else {
             goto label_0035 ;
          }
       }
    }
    public final byte f(int p0){
       return this.e[p0];
    }
    public void g(q p0,long p1,int p2){
       int i = (int)p1;
       int i1 = (int)(p1 >> 32);
       if (!i1) {
          this.o(i);
          p0.F7(this, p1, this.l(i), p2, this.k(i), this.a.a.z());
       }else {
          this.i(p0, p1, i1, p2);
       }
       return;
    }
    public void h(q p0,long p1,int p2){
       this.i(p0, p1, (int)(p1 >> 32), p2);
    }
    public final void i(q p0,long p1,int p2,int p3){
       int i = (int)p1;
       o i1 = this.f[this.n(i)].i;
       p0.F7(this, p1, (this.l(i) + ((p2 & 0x3fffffff) * i1)), p3, i1, this.a.a.z());
    }
    public final int k(int p0){
       return (1 << (this.l - this.f(p0)));
    }
    public final int l(int p0){
       return (((1 << this.f(p0)) ^ p0) * this.k(p0));
    }
    public final void m(int p0,byte p1){
       this.d[p0] = p1;
    }
    public final int n(int p0){
       return (p0 ^ this.m);
    }
    public final byte o(int p0){
       return this.d[p0];
    }
    public String toString(){
       return "Chunk\("+Integer.toHexString(System.identityHashCode(this))+": "+this.a()+"%, "+(this.k - this.o)+'/'+this.k+')';
    }
}
