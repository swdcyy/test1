package com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheBuilder$a;
import java.lang.Object;
import ok.x;
import com.google.common.base.Suppliers;
import pk.c;
import com.google.common.cache.CacheBuilder$b;
import com.google.common.cache.CacheBuilder$c;
import java.lang.String;
import java.lang.Class;
import java.util.logging.Logger;
import com.google.common.cache.a;
import ok.n;
import java.util.logging.Level;
import com.google.common.cache.LocalCache$LocalManualCache;
import java.util.concurrent.TimeUnit;
import com.google.common.cache.LocalCache$Strength;
import ok.j;
import ok.j$b;
import java.lang.StringBuilder;
import java.lang.Enum;
import ok.a;

public final class CacheBuilder	// class@00173c
{
    public boolean a;
    public int b;
    public int c;
    public long d;
    public long e;
    public f f;
    public LocalCache$Strength g;
    public LocalCache$Strength h;
    public long i;
    public long j;
    public long k;
    public Equivalence l;
    public Equivalence m;
    public e n;
    public y o;
    public x p;
    public static final x q;
    public static final c r;
    public static final x s;
    public static final y t;
    public static final Logger u;

    static {
       CacheBuilder.q = Suppliers.b(new CacheBuilder$a());
       c uoc = new c(0, 0, 0, 0, 0, 0);
       CacheBuilder.r = v0;
       CacheBuilder.s = new CacheBuilder$b();
       CacheBuilder.t = new CacheBuilder$c();
       CacheBuilder.u = Logger.getLogger(CacheBuilder.class.getName());
    }
    public void CacheBuilder(){
       super();
       this.a = true;
       this.b = -1;
       this.c = -1;
       this.d = -1;
       this.e = -1;
       this.i = -1;
       this.j = -1;
       this.k = -1;
       this.p = CacheBuilder.q;
    }
    public static CacheBuilder h(){
       return new CacheBuilder();
    }
    public a a(){
       boolean b1;
       boolean b = true;
       if (this.f == null) {
          b1 = (!this.e - -1)? true: false;
          n.o(b1, "maximumWeight requires weigher");
       }else if(this.a != null){
          b1 = (this.e - -1)? true: false;
          n.o(b1, "weigher requires maximumWeight");
       }else if(!this.e - -1){
          CacheBuilder.u.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
       }
       if (this.k - -1) {
          b = false;
       }
       n.o(b, "refreshAfterWrite requires a LoadingCache");
       return new LocalCache$LocalManualCache(this);
    }
    public CacheBuilder b(long p0,TimeUnit p1){
       CacheBuilder tj = this.j;
       boolean b = true;
       boolean b1 = (!tj - -1)? true: false;
       n.q(b1, "expireAfterAccess was already set to %s ns", tj);
       if (p0 - null < 0) {
          b = false;
       }
       n.f(b, "duration cannot be negative: %s %s", p0, p1);
       this.j = p1.toNanos(p0);
       return this;
    }
    public CacheBuilder c(long p0,TimeUnit p1){
       CacheBuilder ti = this.i;
       boolean b = true;
       boolean b1 = (!ti - -1)? true: false;
       n.q(b1, "expireAfterWrite was already set to %s ns", ti);
       if (p0 - null < 0) {
          b = false;
       }
       n.f(b, "duration cannot be negative: %s %s", p0, p1);
       this.i = p1.toNanos(p0);
       return this;
    }
    public LocalCache$Strength d(){
       return j.a(this.g, LocalCache$Strength.STRONG);
    }
    public x e(){
       return this.p;
    }
    public LocalCache$Strength f(){
       return j.a(this.h, LocalCache$Strength.STRONG);
    }
    public CacheBuilder g(long p0){
       CacheBuilder td = this.d;
       boolean i = -1;
       boolean b = true;
       boolean b1 = (!td - i)? true: false;
       n.q(b1, "maximum size was already set to %s", td);
       td = this.e;
       i = (!td - i)? true: false;
       n.q(i, "maximum weight was already set to %s", td);
       boolean b2 = (this.f == null)? true: false;
       n.o(b2, "maximum size can not be combined with weigher");
       if (p0 - null < 0) {
          b = false;
       }
       n.c(b, "maximum size must not be negative");
       this.d = p0;
       return this;
    }
    public CacheBuilder i(){
       this.p = CacheBuilder.s;
       return this;
    }
    public String toString(){
       j$b uob = j.b(this);
       CacheBuilder tb = this.b;
       String str = -1;
       if (tb != str) {
          uob.a("initialCapacity", tb);
       }
       tb = this.c;
       if (tb != str) {
          uob.a("concurrencyLevel", tb);
       }
       tb = this.d;
       if (tb - -1) {
          uob.b("maximumSize", tb);
       }
       tb = this.e;
       if (tb - -1) {
          uob.b("maximumWeight", tb);
       }
       if (this.i - -1) {
          uob.c("expireAfterWrite", this.i+"ns");
       }
       if (this.j - -1) {
          uob.c("expireAfterAccess", this.j+"ns");
       }
       tb = this.g;
       if (tb != null) {
          uob.c("keyStrength", a.c(tb.toString()));
       }
       tb = this.h;
       if (tb != null) {
          uob.c("valueStrength", a.c(tb.toString()));
       }
       if (this.l != null) {
          uob.i("keyEquivalence");
       }
       if (this.m != null) {
          uob.i("valueEquivalence");
       }
       if (this.n != null) {
          uob.i("removalListener");
       }
       return uob.toString();
    }
}
