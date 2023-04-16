package io.netty.buffer.j;
import kqd.a;
import java.lang.Class;
import ard.b;
import ard.c;
import java.lang.String;
import zqd.x;
import java.lang.Runtime;
import java.lang.Math;
import io.netty.util.internal.PlatformDependent;
import java.lang.Integer;
import java.lang.Object;
import io.netty.buffer.j$a;
import io.netty.buffer.PoolArena;
import java.util.ArrayList;
import io.netty.buffer.PoolArena$c;
import java.util.List;
import java.util.Collections;
import io.netty.buffer.PoolArena$b;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import io.netty.buffer.d;
import io.netty.util.concurrent.e;
import io.netty.buffer.i;
import kqd.q;
import io.netty.buffer.r;
import kqd.e;
import io.netty.buffer.p;
import io.netty.buffer.q;

public class j extends a	// class@001065
{
    public final PoolArena[] d;
    public final PoolArena[] e;
    public final int f;
    public final int g;
    public final int h;
    public final List i;
    public final List j;
    public final j$a k;
    public static final b l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;
    public static final int s;
    public static final int t;
    public static final int u;
    public static final j v;

    static {
       j.l = c.a(j.class);
       int i = 8192;
       int i1 = x.d("io.netty.allocator.pageSize", i);
       Integer integer = null;
       j.B(i1);
       Object obj = integer;
       j.o = i1;
       int i2 = x.d("io.netty.allocator.maxOrder", 11);
       j.A(i1, i2);
       int i3 = i2;
       j.p = i3;
       Runtime runtime = Runtime.getRuntime();
       int o = j.o;
       long l = (long)(runtime.availableProcessors() * 2);
       long l1 = (long)(o << i3);
       i1 = Math.max(0, x.d("io.netty.allocator.numHeapArenas", (int)Math.min(l, (((runtime.maxMemory() / l1) / 2) / 3))));
       j.m = i1;
       i2 = Math.max(0, x.d("io.netty.allocator.numDirectArenas", (int)Math.min(l, (((PlatformDependent.k / l1) / 2) / 3))));
       j.n = i2;
       int i4 = x.d("io.netty.allocator.tinyCacheSize", 512);
       j.q = i4;
       int i5 = x.d("io.netty.allocator.smallCacheSize", 256);
       j.r = i5;
       int i6 = x.d("io.netty.allocator.normalCacheSize", 64);
       j.s = i6;
       int i7 = x.d("io.netty.allocator.maxCachedBufferCapacity", 0x8000);
       j.t = i7;
       i = x.d("io.netty.allocator.cacheTrimInterval", i);
       j.u = i;
       b l2 = j.l;
       if (l2.isDebugEnabled()) {
          l2.debug("-Dio.netty.allocator.numHeapArenas: {}", Integer.valueOf(i1));
          l2.debug("-Dio.netty.allocator.numDirectArenas: {}", Integer.valueOf(i2));
          String str = "-Dio.netty.allocator.pageSize: {}";
          if (!obj) {
             l2.debug(str, Integer.valueOf(o));
          }else {
             l2.debug(str, Integer.valueOf(o), obj);
          }
          str = "-Dio.netty.allocator.maxOrder: {}";
          if (!integer) {
             l2.debug(str, Integer.valueOf(i3));
          }else {
             l2.debug(str, Integer.valueOf(i3), integer);
          }
          l2.debug("-Dio.netty.allocator.chunkSize: {}", Integer.valueOf((o << i3)));
          l2.debug("-Dio.netty.allocator.tinyCacheSize: {}", Integer.valueOf(i4));
          l2.debug("-Dio.netty.allocator.smallCacheSize: {}", Integer.valueOf(i5));
          l2.debug("-Dio.netty.allocator.normalCacheSize: {}", Integer.valueOf(i6));
          l2.debug("-Dio.netty.allocator.maxCachedBufferCapacity: {}", Integer.valueOf(i7));
          l2.debug("-Dio.netty.allocator.cacheTrimInterval: {}", Integer.valueOf(i));
       }
       j.v = new j(PlatformDependent.e());
    }
    public void j(){
       super(false);
    }
    public void j(boolean p0){
       PoolArena[] poolArenaArr;
       j oj = this;
       int m = j.m;
       int n = j.n;
       int o = j.o;
       int p = j.p;
       super(p0);
       oj.k = new j$a(oj);
       oj.f = j.q;
       oj.g = j.r;
       oj.h = j.s;
       int i = j.A(o, p);
       String str = " \(expected: >= 0\)";
       if (m < 0) {
          throw new IllegalArgumentException("nHeapArena: "+m+str);
       }
       if (n < 0) {
          throw new IllegalArgumentException("nDirectArea: "+n+str);
       }
       int i1 = j.B(o);
       PoolArena$b uob = null;
       if (m > 0) {
          poolArenaArr = j.y(m);
          oj.d = poolArenaArr;
          ArrayList uArrayList = new ArrayList(poolArenaArr.length);
          for (int i2 = 0; i2 < oj.d.length; i2 = i2 + 1) {
             PoolArena$c uoc = v5;
             PoolArena$c uoc1 = v5;
             uoc = new PoolArena$c(this, o, p, i1, i);
             oj.d[i2] = uoc1;
             uArrayList.add(uoc1);
          }
          oj.i = Collections.unmodifiableList(uArrayList);
       }else {
          oj.d = uob;
          oj.i = Collections.emptyList();
       }
       if (n > 0) {
          poolArenaArr = j.y(n);
          oj.e = poolArenaArr;
          ArrayList uArrayList1 = new ArrayList(poolArenaArr.length);
          for (int i3 = 0; i3 < oj.e.length; i3 = i3 + 1) {
             PoolArena$b uob1 = new PoolArena$b(this, o, p, i1, i);
             oj.e[i3] = uob;
             uArrayList1.add(uob);
          }
          oj.j = Collections.unmodifiableList(uArrayList1);
       }else {
          oj.e = uob;
          oj.j = Collections.emptyList();
       }
       return;
    }
    public static int A(int p0,int p1){
       if (p1 > 14) {
          throw new IllegalArgumentException("maxOrder: "+p1+" \(expected: 0-14\)");
       }
       int i = p0;
       int i1 = p1;
       while (true) {
          if (i1 <= 0) {
             return i;
          }
          if (i <= 0x20000000) {
             i = i << 1;
             i1 = i1 - 1;
          }else {
             break ;
          }
       }
       Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(0x40000000)};
       throw new IllegalArgumentException(String.format("pageSize \(%d\) << maxOrder \(%d\) must not exceed %d", objArray));
    }
    public static int B(int p0){
       int i = 4096;
       if (p0 < i) {
          throw new IllegalArgumentException("pageSize: "+p0+" \(expected: "+i+"+\)");
       }
       if (!((p0 - 1) & p0)) {
          return (Integer.numberOfLeadingZeros(p0) - 31);
       }
       throw new IllegalArgumentException("pageSize: "+p0+" \(expected: power of 2\)");
    }
    public static PoolArena[] y(int p0){
       PoolArena[] poolArenaArr = new PoolArena[p0];
       return poolArenaArr;
    }
    public boolean e(){
       boolean b = (this.e != null)? true: false;
       return b;
    }
    public d t(int p0,int p1){
       q oq;
       r or;
       i oi = this.k.b();
       i b = oi.b;
       if (b != null) {
          oq = b.v(oi, p0, p1);
       }else if(PlatformDependent.q()){
          or = new r(this, p0, p1);
       }else {
          or = new p(this, p0, p1);
       }
       oq = or;
       return a.v(oq);
    }
    public d u(int p0,int p1){
       i oi = this.k.b();
       i a = oi.a;
       q oq = (a != null)? a.v(oi, p0, p1): new q(this, p0, p1);
       return a.v(oq);
    }
    public final i z(){
       return this.k.b();
    }
}
