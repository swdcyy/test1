package io.netty.util.concurrent.i;
import io.netty.util.concurrent.a;
import java.util.concurrent.Executor;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import io.netty.util.concurrent.DefaultPromise;
import yqd.j;
import yqd.e;
import yqd.p;
import java.util.concurrent.ThreadFactory;
import io.netty.util.concurrent.i$d;
import io.netty.util.concurrent.i$c;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Throwable;
import io.netty.util.concurrent.f;
import yqd.f;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.lang.Thread;
import io.netty.util.concurrent.i$a;
import io.netty.util.concurrent.g;
import java.util.LinkedHashSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.System;
import yqd.d;
import java.lang.Class;
import java.util.Iterator;
import io.netty.util.concurrent.i$b;

public abstract class i extends a	// class@00110d
{
    public final e[] b;
    public final Set c;
    public final AtomicInteger d;
    public final AtomicInteger e;
    public final l f;
    public final i$b g;

    public void i(int p0,Executor p1,Object[] p2){
       p op;
       super();
       this.d = new AtomicInteger();
       this.e = new AtomicInteger();
       this.f = new DefaultPromise(j.o);
       int i = 0;
       i$d uod = 1;
       if (p0 > 0) {
          if (p1 == null) {
             op = new p(this.d());
          }
          e[] uoeArray = new e[p0];
          this.b = uoeArray;
          if (((- p0) & p0) != p0) {
             uod = null;
          }
          this.g = (uod)? new i$d(this): new i$c(this);
          for (int i1 = 0; i1 < p0; i1 = i1 + 1) {
             try{
                this.b[i1] = this.b(op, p2);
             }catch(java.lang.Exception e5){
                throw new IllegalStateException("failed to create a child event loop", e5);
             }
          }
          i$a uoa = new i$a(this);
          i tb = this.b;
          int len = tb.length;
          for (; i < len; i = i + 1) {
             tb[i].w2().f(uoa);
          }
          LinkedHashSet linkedHashSe = new LinkedHashSet(this.b.length);
          Collections.addAll(linkedHashSe, this.b);
          this.c = Collections.unmodifiableSet(linkedHashSe);
          return;
       }else {
          p2 = new Object[uod];
          p2[i] = Integer.valueOf(p0);
          throw new IllegalArgumentException(String.format("nThreads: %d \(expected: > 0\)", p2));
       }
    }
    public f H3(long p0,long p1,TimeUnit p2){
       i tb = this.b;
       int len = tb.length;
       for (int i = 0; i < len; i = i + 1) {
          tb[i].H3(p0, p1, p2);
       }
       return this.w2();
    }
    public boolean Q2(){
       i tb = this.b;
       int len = tb.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return true;
          }
          if (!tb[i].Q2()) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public boolean awaitTermination(long p0,TimeUnit p1){
       long l = System.nanoTime() + p1.toNanos(p0);
       i tb = this.b;
       int len = tb.length;
       int i = 0;
       while (i < len) {
          object oobject = tb[i];
          long l1 = l - System.nanoTime();
          while (l1 - null > 0) {
             if (oobject.awaitTermination(l1, TimeUnit.NANOSECONDS)) {
                i++;
             }
          }
          return this.isTerminated();
       }
    }
    public abstract e b(Executor p0,Object[] p1);
    public final Set children(){
       return this.c;
    }
    public ThreadFactory d(){
       return new d(this.getClass());
    }
    public boolean isShutdown(){
       i tb = this.b;
       int len = tb.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return true;
          }
          if (!tb[i].isShutdown()) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public boolean isTerminated(){
       i tb = this.b;
       int len = tb.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return true;
          }
          if (!tb[i].isTerminated()) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public Iterator iterator(){
       return this.c.iterator();
    }
    public e next(){
       return this.g.next();
    }
    public void shutdown(){
       i tb = this.b;
       int len = tb.length;
       for (int i = 0; i < len; i = i + 1) {
          tb[i].shutdown();
       }
       return;
    }
    public f w2(){
       return this.f;
    }
}
