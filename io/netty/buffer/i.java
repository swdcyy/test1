package io.netty.buffer.i;
import java.lang.Class;
import ard.b;
import ard.c;
import io.netty.buffer.PoolArena;
import java.lang.Object;
import java.lang.Thread;
import io.netty.buffer.i$a;
import io.netty.buffer.PoolArena$SizeClass;
import io.netty.buffer.i$c;
import wqd.q;
import java.lang.String;
import java.util.Objects;
import java.lang.Runnable;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Math;
import io.netty.buffer.i$d;
import io.netty.buffer.i$e;
import kqd.q;
import java.util.Queue;
import io.netty.buffer.i$c$b;
import kqd.k;
import java.lang.Integer;

public final class i	// class@001063
{
    public final PoolArena a;
    public final PoolArena b;
    public final i$c[] c;
    public final i$c[] d;
    public final i$c[] e;
    public final i$c[] f;
    public final i$c[] g;
    public final i$c[] h;
    public final int i;
    public final int j;
    public final int k;
    public int l;
    public final Thread m;
    public final Runnable n;
    public static final b o;

    static {
       i.o = c.a(i.class);
    }
    public void i(PoolArena p0,PoolArena p1,int p2,int p3,int p4,int p5,int p6){
       super();
       Thread thread = Thread.currentThread();
       this.m = thread;
       i$a uoa = new i$a(this);
       this.n = uoa;
       if (p5 < 0) {
          throw new IllegalArgumentException("maxCachedBufferCapacity: "+p5+" \(expected: >= 0\)");
       }
       if (p6 < 1) {
          throw new IllegalArgumentException("freeSweepAllocationThreshold: "+p5+" \(expected: > 0\)");
       }
       this.k = p6;
       this.a = p0;
       this.b = p1;
       if (p1 != null) {
          this.e = i.g(p2, 32, PoolArena$SizeClass.Tiny);
          this.f = i.g(p3, p1.g, PoolArena$SizeClass.Small);
          this.i = i.j(p1.c);
          this.h = i.f(p4, p5, p1);
       }else {
          this.e = null;
          this.f = null;
          this.h = null;
          this.i = -1;
       }
       if (p0 != null) {
          this.c = i.g(p2, 32, PoolArena$SizeClass.Tiny);
          this.d = i.g(p3, p0.g, PoolArena$SizeClass.Small);
          this.j = i.j(p0.c);
          this.g = i.f(p4, p5, p0);
       }else {
          this.c = null;
          this.d = null;
          this.g = null;
          this.j = -1;
       }
       Objects.requireNonNull(thread, "thread");
       Objects.requireNonNull(uoa, "task");
       if (thread.isAlive()) {
          q.a(thread, uoa, 1);
          return;
       }else {
          throw new IllegalArgumentException("thread must be alive.");
       }
    }
    public static i$c b(i$c[] p0,int p1){
       if (p0 == null || p1 > (p0.length - 1)) {
          return null;
       }
       return p0[p1];
    }
    public static i$c[] f(int p0,int p1,PoolArena p2){
       int i;
       if (p0 <= 0) {
          return null;
       }
       p1 = Math.max(1, (i.j((Math.min(p2.e, p1) / p2.c)) + 1));
       i$c[] uocArray = new i$c[p1];
       for (i = 0; i < p1; i = i + 1) {
          uocArray[i] = new i$d(p0);
       }
       return uocArray;
    }
    public static i$c[] g(int p0,int p1,PoolArena$SizeClass p2){
       if (p0 <= 0) {
          return null;
       }
       i$c[] uocArray = new i$c[p1];
       for (int i = 0; i < p1; i = i + 1) {
          uocArray[i] = new i$e(p0, p2);
       }
       return uocArray;
    }
    public static int h(i$c[] p0){
       if (p0 == null) {
          return 0;
       }
       int len = p0.length;
       int i1 = 0;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p0[i];
          int i2 = (oobject == null)? 0: oobject.a(Integer.MAX_VALUE);
          i1 = i1 + i2;
       }
       return i1;
    }
    public static int j(int p0){
       int i = 0;
       while (p0 > 1) {
          p0 = p0 >> 1;
          i = i + 1;
       }
       return i;
    }
    public static void k(i$c[] p0){
       if (p0 == null) {
          return;
       }
       int len = p0.length;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          if (oobject != null) {
             int i1 = oobject.a - oobject.d;
             oobject.d = 0;
             if (i1 > 0) {
                oobject.a(i1);
             }
          }
          i = i + 1;
       }
       return;
    }
    public final boolean a(i$c p0,q p1,int p2){
       boolean b;
       if (p0 == null) {
          return false;
       }
       i$c$b uoc$b = p0.b.poll();
       if (uoc$b == null) {
          b = false;
       }else {
          p0.b(uoc$b.b, uoc$b.c, p1, p2);
          uoc$b.a();
          p0.d = p0.d + 1;
          b = true;
       }
       int i = this.l + 1;
       this.l = i;
       if (i >= this.k) {
          this.l = 0;
          i.k(this.e);
          i.k(this.f);
          i.k(this.h);
          i.k(this.c);
          i.k(this.d);
          i.k(this.g);
       }
       return b;
    }
    public final i$c c(PoolArena p0,int p1){
       if (p0.C()) {
          return i.b(this.h, i.j((p1 >> this.i)));
       }
       return i.b(this.g, i.j((p1 >> this.j)));
    }
    public final i$c d(PoolArena p0,int p1){
       p1 = PoolArena.L(p1);
       if (p0.C()) {
          return i.b(this.f, p1);
       }
       return i.b(this.d, p1);
    }
    public final i$c e(PoolArena p0,int p1){
       p1 = PoolArena.N(p1);
       if (p0.C()) {
          return i.b(this.e, p1);
       }
       return i.b(this.c, p1);
    }
    public void i(){
       int i = ((((i.h(this.e) + i.h(this.f)) + i.h(this.h)) + i.h(this.c)) + i.h(this.d)) + i.h(this.g);
       if (i > 0) {
          b o = i.o;
          if (o.isDebugEnabled()) {
             o.debug("Freed {} thread-local buffer\(s\) from thread: {}", Integer.valueOf(i), this.m.getName());
          }
       }
       return;
    }
}
