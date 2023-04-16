package com.google.common.collect.l;
import java.lang.Object;
import java.util.Arrays;
import java.lang.Integer;
import java.lang.Math;
import com.google.common.collect.k$a;
import ok.n;
import com.google.common.collect.l$a;
import qk.w;
import ok.k;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public class l	// class@0018bf
{
    public Object[] a;
    public int[] b;
    public int c;
    public int d;
    public int[] e;
    public long[] f;
    public float g;
    public int h;

    public void l(){
       super();
       this.k(3, 0x3f800000);
    }
    public void l(int p0){
       super();
       this.k(p0, 0x3f800000);
    }
    public void l(l p0){
       super();
       this.k(p0.t(), 0x3f800000);
       for (int i = p0.b(); i != -1; i = p0.m(i)) {
          this.n(p0.f(i), p0.h(i));
       }
       return;
    }
    public static int e(long p0){
       return (int)(p0 >> 32);
    }
    public static int g(long p0){
       return (int)p0;
    }
    public static int[] l(int p0){
       int[] ointArray = new int[p0];
       Arrays.fill(ointArray, -1);
       return ointArray;
    }
    public static long u(long p0,int p1){
       return ((p0 & 0xffffffff00000000) | ((long)p1 & 0xffffffff));
    }
    public void a(int p0){
       if (p0 > this.f.length) {
          this.q(p0);
       }
       if (p0 >= this.h) {
          p0--;
          this.r(Math.max(2, (Integer.highestOneBit(p0) << 1)));
       }
       return;
    }
    public int b(){
       int i = (this.c == null)? -1: 0;
       return i;
    }
    public int c(Object p0){
       int i = this.j(p0);
       i = (i == -1)? 0: this.b[i];
       return i;
    }
    public k$a d(int p0){
       n.i(p0, this.c);
       return new l$a(this, p0);
    }
    public Object f(int p0){
       n.i(p0, this.c);
       return this.a[p0];
    }
    public int h(int p0){
       n.i(p0, this.c);
       return this.b[p0];
    }
    public final int i(){
       return (this.e.length - 1);
    }
    public int j(Object p0){
       int i = w.c(p0);
       int i1 = this.e[(this.i() & i)];
       while (true) {
          l ol = -1;
          if (i1 == ol) {
             return ol;
          }
          long l = this.f[i1];
          if (l.e(l) == i && k.a(p0, this.a[i1])) {
             break ;
          }else {
             i1 = l.g(l);
          }
       }
       return i1;
    }
    public void k(int p0,float p1){
       int b = false;
       boolean b1 = (p0 >= 0)? true: false;
       n.c(b1, "Initial capacity must be non-negative");
       if (p1 > 0) {
          b = true;
       }
       n.c(b, "Illegal load factor");
       b = w.a(p0, (double)p1);
       this.e = l.l(b);
       this.g = p1;
       Object[] objArray = new Object[p0];
       this.a = objArray;
       int[] ointArray = new int[p0];
       this.b = ointArray;
       long[] olongArray = new long[p0];
       Arrays.fill(olongArray, -1);
       this.f = olongArray;
       this.h = Math.max(1, (int)((float)b * p1));
       return;
    }
    public int m(int p0){
       p0++;
       if (p0 < this.c) {
       }else {
          p0 = -1;
       }
       return p0;
    }
    public int n(Object p0,int p1){
       if (p1 <= 0) {
          throw new IllegalArgumentException("count"+" must be positive but was: "+p1);
       }
       l tf = this.f;
       l ta = this.a;
       l tb = this.b;
       int i = w.c(p0);
       int i1 = this.i() & i;
       l tc = this.c;
       l te = this.e;
       int i2 = te[i1];
       if (i2 == -1) {
          te[i1] = tc;
       }else {
          while (true) {
             long l = tf[i2];
             if (l.e(l) == i && k.a(p0, ta[i2])) {
                int i6 = tb[i2];
                tb[i2] = p1;
                return i6;
             }else {
                i1 = l.g(l);
                if (i1 == -1) {
                   tf[i2] = l.u(l, tc);
                }else {
                   i2 = i1;
                }
             }
          }
       }
       int i3 = Integer.MAX_VALUE;
       if (tc != i3) {
          int i4 = tc + 1;
          int len = this.f.length;
          if (i4 > len) {
             int i5 = Math.max(1, (len >> 1)) + len;
             if (i5 >= 0) {
                i3 = i5;
             }
             if (i3 != len) {
                this.q(i3);
             }
          }
          this.f[tc] = ((long)i << 32) | 0xffffffff;
          this.a[tc] = p0;
          p0[tc] = p1;
          this.c = i4;
          if (tc >= this.h) {
             this.r((this.e.length * 2));
          }
          this.d = this.d + 1;
          return 0;
       }else {
          throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
       }
    }
    public final int o(Object p0,int p1){
       int i4;
       long l;
       int i = this.i() & p1;
       int i1 = this.e[i];
       int i2 = 0;
       int i3 = -1;
       if (i1 == i3) {
          return i2;
       }
       l ol = -1;
       while (true) {
          if (l.e(this.f[i1]) == p1 && k.a(p0, this.a[i1])) {
             i4 = this.b[i1];
             if (ol == i3) {
                p1[i] = l.g(this.f[i1]);
             }else {
                l tf1 = this.f;
                tf1[ol] = l.u(tf1[ol], l.g(tf1[i1]));
             }
             p1 = this.t() + i3;
             l = -1;
             object oobject = null;
             if (i1 < p1) {
                l ta = this.a;
                ta[i1] = ta[p1];
                l tb = this.b;
                tb[i1] = tb[p1];
                ta[p1] = oobject;
                tb[p1] = i2;
                l tf = this.f;
                long l1 = tf[p1];
                tf[i1] = l1;
                tf[p1] = l;
                i = l.e(l1) & this.i();
                l te = this.e;
                i3 = te[i];
                if (i3 == p1) {
                   te[i] = i1;
                   break ;
                }else {
                   long l2 = this.f[i3];
                   i = l.g(l2);
                   while (i != p1) {
                      i3 = i;
                   }
                   p1[i3] = l.u(l2, i1);
                }
             }else {
                p1[i1] = oobject;
                p1[i1] = i2;
                p1[i1] = l;
                break ;
             }
             break ;
          }else {
             int i5 = l.g(this.f[i1]);
             if (i5 == i3) {
                return i2;
             }
             i5 = i1;
             i1 = i5;
          }
       }
       this.c = this.c - 1;
       this.d = this.d + 1;
       return i4;
    }
    public int p(int p0){
       return this.o(this.a[p0], l.e(this.f[p0]));
    }
    public void q(int p0){
       this.a = Arrays.copyOf(this.a, p0);
       this.b = Arrays.copyOf(this.b, p0);
       l tf = this.f;
       int len = tf.length;
       long[] olongArray = Arrays.copyOf(tf, p0);
       if (p0 > len) {
          Arrays.fill(olongArray, len, p0, -1);
       }
       this.f = olongArray;
       return;
    }
    public final void r(int p0){
       long l;
       if (this.e.length >= 0x40000000) {
          this.h = Integer.MAX_VALUE;
          return;
       }else {
          int i = (int)((float)p0 * this.g) + 1;
          int[] ointArray = l.l(p0);
          l tf = this.f;
          int i1 = ointArray.length - 1;
          for (int i2 = 0; i2 < this.c; i2 = i2 + 1) {
             int i3 = l.e(tf[i2]);
             int i4 = i3 & i1;
             int i5 = ointArray[i4];
             ointArray[i4] = i2;
             l = (long)i3 << 32;
             long l1 = (long)i5 & 0xffffffff;
             l = l | l1;
             tf[i2] = l;
          }
          this.h = i;
          this.e = ointArray;
          return;
       }
    }
    public void s(int p0,int p1){
       n.i(p0, this.c);
       this.b[p0] = p1;
    }
    public int t(){
       return this.c;
    }
}
