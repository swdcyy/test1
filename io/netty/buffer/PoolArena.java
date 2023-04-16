package io.netty.buffer.PoolArena;
import kqd.j;
import io.netty.util.internal.PlatformDependent;
import io.netty.buffer.j;
import java.lang.Object;
import zqd.e;
import kqd.o;
import kqd.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import kqd.k;
import io.netty.buffer.i;
import io.netty.buffer.PoolArena$SizeClass;
import io.netty.buffer.i$b;
import java.lang.Enum;
import io.netty.buffer.i$c;
import java.lang.Error;
import io.netty.util.Recycler;
import io.netty.buffer.i$c$b;
import java.util.Queue;
import io.netty.buffer.PoolArena$a;
import kqd.q;
import java.lang.String;
import java.lang.StringBuilder;
import zqd.w;
import java.lang.IllegalArgumentException;

public abstract class PoolArena implements j	// class@001041
{
    public final j a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final o[] h;
    public final o[] i;
    public final l j;
    public final l k;
    public final l l;
    public final l m;
    public final l n;
    public final l o;
    public final List p;
    public long q;
    public long r;
    public long s;
    public final e t;
    public long u;
    public long v;
    public long w;
    public final e x;
    public static final boolean y;
    public static final boolean z;

    static {
       PoolArena.y = PlatformDependent.q();
    }
    public void PoolArena(j p0,int p1,int p2,int p3,int p4){
       super();
       this.t = PlatformDependent.x();
       this.x = PlatformDependent.x();
       this.a = p0;
       this.c = p1;
       this.b = p2;
       this.d = p3;
       this.e = p4;
       this.f = ~ (p1 - 1);
       this.h = this.I(32);
       int i = 0;
       p2 = 0;
       PoolArena th = this.h;
       while (p2 < th.length) {
          th[p2] = this.J(p1);
          p2++;
       }
       p3 = p3 - 9;
       this.g = p3;
       this.i = this.I(p3);
       PoolArena ti = this.i;
       while (i < ti.length) {
          ti[i] = this.J(p1);
          i++;
       }
       l ol = new l(null, 100, Integer.MAX_VALUE);
       this.o = ol;
       l ol1 = new l(ol, 75, 100);
       this.n = ol1;
       l ol2 = new l(ol1, 50, 100);
       this.j = ol2;
       l ol3 = new l(ol2, 25, 75);
       this.k = ol3;
       l ol4 = new l(ol3, 1, 50);
       this.l = ol4;
       l ol5 = new l(ol4, Integer.MIN_VALUE, 25);
       this.m = ol5;
       ol.m(ol1);
       ol1.m(ol2);
       ol2.m(ol3);
       ol3.m(ol4);
       ol4.m(null);
       ol5.m(ol5);
       ArrayList uArrayList = new ArrayList(6);
       uArrayList.add(ol5);
       uArrayList.add(ol4);
       uArrayList.add(ol3);
       uArrayList.add(ol2);
       uArrayList.add(ol1);
       uArrayList.add(ol);
       this.p = Collections.unmodifiableList(uArrayList);
       return;
    }
    public static boolean D(int p0){
       boolean b = (!(p0 & 0xfe00))? true: false;
       return b;
    }
    public static int L(int p0){
       p0 = p0 >> 10;
       int i = 0;
       while (p0) {
          p0 = p0 >> 1;
          i = i + 1;
       }
       return i;
    }
    public static List M(o[] p0){
       ArrayList uArrayList = new ArrayList();
       int i = 1;
       while (i < p0.length) {
          object oobject = p0[i];
          o g = oobject.g;
          if (g != oobject) {
             do {
                uArrayList.add(g);
             } while (g.g == oobject);
          }
          i = i + 1;
       }
       return uArrayList;
    }
    public static int N(int p0){
       return (p0 >> 4);
    }
    public void A(k p0,long p1,int p2,i p3){
       PoolArena$SizeClass normal;
       i$c uoc;
       if (p0.c != null) {
          this.t.decrement();
          this.y(p0);
       }else if(!this.E(p2)){
          normal = PoolArena$SizeClass.Normal;
       }else if(PoolArena.D(p2)){
          normal = PoolArena$SizeClass.Tiny;
       }else {
          normal = PoolArena$SizeClass.Small;
       }
       if (p3 != null) {
          int i = i$b.a[normal.ordinal()];
          if (i != 1) {
             if (i != 2) {
                if (i == 3) {
                   uoc = p3.e(this, p2);
                }else {
                   throw new Error();
                }
             }else {
                uoc = p3.d(this, p2);
             }
          }else {
             uoc = p3.c(this, p2);
          }
          if (uoc == null) {
             uoc = 0;
          }else {
             i$c$b uoc$b = i$c.e.a();
             uoc$b.b = p0;
             uoc$b.c = p1;
             boolean b = uoc.b.offer(uoc$b);
             if (!b) {
                uoc$b.a();
             }
          }
          if (uoc) {
             return;
          }
       }
       this.B(p0, p1, normal);
       return;
    }
    public void B(k p0,long p1,PoolArena$SizeClass p2){
       _monitor_enter(this);
       int i = PoolArena$a.a[p2.ordinal()];
       int i1 = 1;
       if (i != i1) {
          if (i != 2) {
             if (i == 3) {
                this.u = this.u + 1;
             }else {
                throw new Error();
             }
          }else {
             this.v = this.v + 1;
          }
       }else {
          this.w = this.w + 1;
       }
       if (p0.p.l(p0, p1)) {
          i1 = 0;
       }
       _monitor_exit(this);
       if (i1) {
          this.y(p0);
       }
       return;
    }
    public abstract boolean C();
    public boolean E(int p0){
       boolean b = (!(p0 & this.f))? true: false;
       return b;
    }
    public abstract void F(Object p0,int p1,Object p2,int p3,int p4);
    public abstract q G(int p0);
    public abstract k H(int p0,int p1,int p2,int p3);
    public final o[] I(int p0){
       o[] ooArray = new o[p0];
       return ooArray;
    }
    public final o J(int p0){
       o oo = new o(p0);
       oo.f = oo;
       oo.g = oo;
       return oo;
    }
    public abstract k K(int p0);
    public long a(){
       return this.r;
    }
    public int b(){
       return this.p.size();
    }
    public int c(){
       return this.h.length;
    }
    public List d(){
       return PoolArena.M(this.h);
    }
    public long e(){
       long l = (((this.q + this.r) + this.s) + this.t.value()) - (((this.u + this.v) + this.s) + this.x.value());
       if (l >= 0) {
       }else {
          l = 0;
       }
       return l;
    }
    public long f(){
       long l = this.t.value() - this.x.value();
       if (l >= 0) {
       }else {
          l = 0;
       }
       return l;
    }
    public long g(){
       long l = this.s - this.w;
       if (l >= 0) {
       }else {
          l = 0;
       }
       return l;
    }
    public long h(){
       return (((this.q + this.r) + this.s) + this.t.value());
    }
    public long i(){
       long l = this.r - this.v;
       if (l >= 0) {
       }else {
          l = 0;
       }
       return l;
    }
    public long j(){
       long l = this.q - this.u;
       if (l >= 0) {
       }else {
          l = 0;
       }
       return l;
    }
    public int k(){
       return this.i.length;
    }
    public long l(){
       return this.w;
    }
    public long m(){
       return this.v;
    }
    public long n(){
       return (((this.u + this.v) + this.s) + this.x.value());
    }
    public List o(){
       return PoolArena.M(this.i);
    }
    public long p(){
       return this.t.value();
    }
    public List q(){
       return this.p;
    }
    public long r(){
       return this.s;
    }
    public long s(){
       return this.x.value();
    }
    public long t(){
       return this.q;
    }
    public synchronized String toString(){
       String a = w.a;
       StringBuilder str = "Chunk\(s\) at 0~25%:"+a+this.m+a+"Chunk\(s\) at 0~50%:"+a+this.l+a+"Chunk\(s\) at 25~75%:"+a+this.k+a+"Chunk\(s\) at 50~100%:"+a+this.j+a+"Chunk\(s\) at 75~100%:"+a+this.n+a+"Chunk\(s\) at 100%:"+a+this.o+a;
       str = str+"tiny subpages:";
       int i = 1;
       int i1 = 1;
       PoolArena th = this.h;
       while (i1 < th.length) {
          object oobject = th[i1];
          if (oobject.g != oobject) {
             str = str+w.a+i1+": ";
             o g = oobject.g;
             do {
                str = str+g;
             } while (g.g == oobject);
          }
          i1 = i1 + 1;
       }
       str = str+w.a+"small subpages:";
       PoolArena ti = this.i;
       while (i < ti.length) {
          object oobject1 = ti[i];
          if (oobject1.g != oobject1) {
             str = str+w.a+i+": ";
             o g1 = oobject1.g;
             do {
                str = str+g1;
             } while (g1.g == oobject1);
          }
          i = i + 1;
       }
       return str+w.a;
    }
    public long u(){
       return this.u;
    }
    public q v(i p0,int p1,int p2){
       q oq = this.G(p2);
       this.w(p0, oq, p1);
       return oq;
    }
    public final void w(i p0,q p1,int p2){
       int i;
       int i1;
       PoolArena th;
       if (p2 < 0) {
          throw new IllegalArgumentException("capacity: "+p2+" \(expected: 0+\)");
       }
       if (p2 >= this.e) {
       label_0006 :
          i = p2;
       }else if(!PoolArena.D(p2)){
          i = p2 - 1;
          i = i | (i >> 1);
          i = i | (i >> 2);
          i = i | (i >> 4);
          i = i | (i >> 8);
          i = (i | (i >> 16)) + 1;
          if (i < 0) {
             i = i >> 1;
          }
       }else if(!(p2 & 0x0f)){
          goto label_0006 ;
       }else {
          i = (p2 & 0xf0) + 16;
       }
       if (this.E(i)) {
          boolean b = PoolArena.D(i);
          if (b) {
             if (p0.a(p0.e(this, i), p1, p2)) {
                return;
             }else {
                i1 = PoolArena.N(i);
                th = this.h;
             }
          }else if(p0.a(p0.d(this, i), p1, p2)){
             return;
          }else {
             i1 = PoolArena.L(i);
             th = this.i;
          }
          object oobject = th[i1];
          _monitor_enter(oobject);
          o g = oobject.g;
          if (g != oobject) {
             g.a.h(p1, g.f(), p2);
             this.q = (b)? this.q + 1: this.r + 1;
             _monitor_exit(oobject);
             return;
          }else {
             _monitor_exit(oobject);
             this.x(p1, p2, i);
             return;
          }
       }else if(i <= this.e){
          if (p0.a(p0.c(this, i), p1, p2)) {
             return;
          }else {
             this.x(p1, p2, i);
          }
       }else {
          this.t.increment();
          p1.G7(this.K(p2), p2);
       }
       return;
    }
    public synchronized final void x(q p0,int p1,int p2){
       this.s = this.s + 1;
       if (!this.j.d(p0, p1, p2) && (!this.k.d(p0, p1, p2) && (!this.l.d(p0, p1, p2) && (!this.m.d(p0, p1, p2) && (this.n.d(p0, p1, p2) || this.o.d(p0, p1, p2)))))) {
          return;
       }
       k ok = this.H(this.c, this.b, this.d, this.e);
       ok.g(p0, ok.d(p2), p1);
       this.m.b(ok);
       return;
    }
    public abstract void y(k p0);
    public o z(int p0){
       PoolArena th;
       if (PoolArena.D(p0)) {
          p0 = p0 >> 4;
          th = this.h;
       }else {
          int i = 0;
          p0 = p0 >> 10;
          while (p0) {
             p0 = p0 >> 1;
             i = i + 1;
          }
          th = this.i;
          p0 = i;
       }
       return th[p0];
    }
}
