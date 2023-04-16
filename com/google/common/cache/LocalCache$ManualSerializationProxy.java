package com.google.common.cache.LocalCache$ManualSerializationProxy;
import java.io.Serializable;
import com.google.common.cache.b;
import com.google.common.cache.LocalCache;
import ok.y;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.a;
import java.lang.Object;
import java.io.ObjectInputStream;
import java.lang.String;
import ok.n;
import java.util.concurrent.TimeUnit;
import com.google.common.cache.CacheBuilder$OneWeigher;

public class LocalCache$ManualSerializationProxy extends b implements Serializable	// class@00174a
{
    public final int concurrencyLevel;
    public a delegate;
    public final long expireAfterAccessNanos;
    public final long expireAfterWriteNanos;
    public final Equivalence keyEquivalence;
    public final LocalCache$Strength keyStrength;
    public final CacheLoader loader;
    public final long maxWeight;
    public final e removalListener;
    public final y ticker;
    public final Equivalence valueEquivalence;
    public final LocalCache$Strength valueStrength;
    public final f weigher;
    public static final long serialVersionUID = 0x1;

    public void LocalCache$ManualSerializationProxy(LocalCache p0){
       LocalCache q = p0.q;
       p0 = p0.t;
       super();
       this.keyStrength = p0.h;
       this.valueStrength = p0.i;
       this.keyEquivalence = p0.f;
       this.valueEquivalence = p0.g;
       this.expireAfterWriteNanos = p0.m;
       this.expireAfterAccessNanos = p0.l;
       this.maxWeight = p0.j;
       this.weigher = p0.k;
       this.concurrencyLevel = p0.e;
       this.removalListener = p0.p;
       if (q == y.b() || q == CacheBuilder.t) {
          q = null;
       }
       this.ticker = q;
       this.loader = p0;
       return;
    }
    public a delegate(){
       return this.delegate;
    }
    public Object delegate(){
       return this.delegate();
    }
    public final void readObject(ObjectInputStream p0){
       p0.defaultReadObject();
       this.delegate = this.recreateCacheBuilder().a();
    }
    public final Object readResolve(){
       return this.delegate;
    }
    public CacheBuilder recreateCacheBuilder(){
       CacheBuilder d;
       CacheBuilder uCacheBuilde = CacheBuilder.h();
       LocalCache$ManualSerializationProxy tkeyStrength = this.keyStrength;
       CacheBuilder g = uCacheBuilde.g;
       boolean b = true;
       boolean b1 = (g == null)? true: false;
       n.r(b1, "Key strength was already set to %s", g);
       n.j(tkeyStrength);
       uCacheBuilde.g = tkeyStrength;
       tkeyStrength = this.valueStrength;
       g = uCacheBuilde.h;
       b1 = (g == null)? true: false;
       n.r(b1, "Value strength was already set to %s", g);
       n.j(tkeyStrength);
       uCacheBuilde.h = tkeyStrength;
       tkeyStrength = this.keyEquivalence;
       g = uCacheBuilde.l;
       b1 = (g == null)? true: false;
       n.r(b1, "key equivalence was already set to %s", g);
       n.j(tkeyStrength);
       uCacheBuilde.l = tkeyStrength;
       tkeyStrength = this.valueEquivalence;
       g = uCacheBuilde.m;
       b1 = (g == null)? true: false;
       n.r(b1, "value equivalence was already set to %s", g);
       n.j(tkeyStrength);
       uCacheBuilde.m = tkeyStrength;
       tkeyStrength = this.concurrencyLevel;
       g = uCacheBuilde.c;
       b1 = (g == -1)? true: false;
       n.p(b1, "concurrency level was already set to %s", g);
       boolean b2 = (tkeyStrength > null)? true: false;
       n.b(b2);
       uCacheBuilde.c = tkeyStrength;
       tkeyStrength = this.removalListener;
       b2 = (uCacheBuilde.n == null)? true: false;
       n.n(b2);
       n.j(tkeyStrength);
       uCacheBuilde.n = tkeyStrength;
       uCacheBuilde.a = false;
       tkeyStrength = this.expireAfterWriteNanos;
       b1 = 0;
       if (tkeyStrength - b1 > 0) {
          uCacheBuilde.c(tkeyStrength, TimeUnit.NANOSECONDS);
       }
       tkeyStrength = this.expireAfterAccessNanos;
       if (tkeyStrength - b1 > 0) {
          uCacheBuilde.b(tkeyStrength, TimeUnit.NANOSECONDS);
       }
       tkeyStrength = this.weigher;
       boolean i = -1;
       if (tkeyStrength != CacheBuilder$OneWeigher.INSTANCE) {
          b2 = (uCacheBuilde.f == null)? true: false;
          n.n(b2);
          if (uCacheBuilde.a != null) {
             d = uCacheBuilde.d;
             b2 = (!d - i)? true: false;
             n.q(b2, "weigher can not be combined with maximum size", d);
          }
          n.j(tkeyStrength);
          uCacheBuilde.f = tkeyStrength;
          tkeyStrength = this.maxWeight;
          if (tkeyStrength - i) {
             d = uCacheBuilde.e;
             boolean b3 = (!d - i)? true: false;
             n.q(b3, "maximum weight was already set to %s", d);
             d = uCacheBuilde.d;
             i = (!d - i)? true: false;
             n.q(i, "maximum size was already set to %s", d);
             uCacheBuilde.e = tkeyStrength;
             boolean b4 = (tkeyStrength - b1 >= 0)? true: false;
             n.c(b4, "maximum weight must not be negative");
          }
       }else {
          tkeyStrength = this.maxWeight;
          if (tkeyStrength - i) {
             uCacheBuilde.g(tkeyStrength);
          }
       }
       tkeyStrength = this.ticker;
       if (tkeyStrength != null) {
          if (uCacheBuilde.o != null) {
             b = false;
          }
          n.n(b);
          n.j(tkeyStrength);
          uCacheBuilde.o = tkeyStrength;
       }
       return uCacheBuilde;
    }
}
