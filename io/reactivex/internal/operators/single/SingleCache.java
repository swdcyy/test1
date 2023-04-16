package io.reactivex.internal.operators.single.SingleCache;
import brd.d0;
import brd.a0;
import io.reactivex.internal.operators.single.SingleCache$CacheDisposable;
import brd.e0;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import crd.b;
import java.lang.System;
import java.lang.Throwable;

public final class SingleCache extends a0 implements d0	// class@00145a
{
    public final e0 b;
    public final AtomicInteger c;
    public final AtomicReference d;
    public Object e;
    public Throwable f;
    public static final SingleCache$CacheDisposable[] g;
    public static final SingleCache$CacheDisposable[] h;

    static {
       SingleCache$CacheDisposable[] uCacheDispos = new SingleCache$CacheDisposable[0];
       SingleCache.g = uCacheDispos;
       SingleCache$CacheDisposable[] uCacheDispos1 = new SingleCache$CacheDisposable[0];
       SingleCache.h = uCacheDispos1;
    }
    public void SingleCache(e0 p0){
       super();
       this.b = p0;
       this.c = new AtomicInteger();
       this.d = new AtomicReference(SingleCache.g);
    }
    public void S(d0 p0){
       SingleCache$CacheDisposable uCacheDispos = new SingleCache$CacheDisposable(p0, this);
       p0.onSubscribe(uCacheDispos);
       while (true) {
          SingleCache$CacheDisposable[] uCacheDispos1 = this.d.get();
          int i = 0;
          if (uCacheDispos1 != SingleCache.h) {
             int len = uCacheDispos1.length;
             int i1 = len + 1;
             SingleCache$CacheDisposable[] uCacheDispos2 = new SingleCache$CacheDisposable[i1];
             System.arraycopy(uCacheDispos1, i, uCacheDispos2, i, len);
             uCacheDispos2[len] = uCacheDispos;
             if (this.d.compareAndSet(uCacheDispos1, uCacheDispos2)) {
                i = 1;
             }
          }
          if (i) {
             if (uCacheDispos.isDisposed()) {
                this.k0(uCacheDispos);
             }
             if (!this.c.getAndIncrement()) {
                this.b.b(this);
                break ;
             }
             break ;
          }else {
             SingleCache tf = this.f;
             if (tf != null) {
                p0.onError(tf);
             }else {
                p0.onSuccess(this.e);
             }
             return;
          }
       }
       return;
    }
    public void k0(SingleCache$CacheDisposable p0){
       SingleCache$CacheDisposable[] g;
       while (true) {
          SingleCache$CacheDisposable[] uCacheDispos = this.d.get();
          int len = uCacheDispos.length;
          if (!len) {
          }else {
             SingleCache singleCache = null;
             int i = 0;
             while (true) {
                if (i < len) {
                   if (uCacheDispos[i] == p0) {
                   label_0019 :
                      if (i < 0) {
                         return;
                      }
                      object oobject = 1;
                      if (len == oobject) {
                         g = SingleCache.g;
                      }else {
                         int i1 = len - 1;
                         SingleCache$CacheDisposable[] uCacheDispos1 = new SingleCache$CacheDisposable[i1];
                         System.arraycopy(uCacheDispos, singleCache, uCacheDispos1, singleCache, i);
                         int i2 = i + 1;
                         len = len - i;
                         len = len - oobject;
                         System.arraycopy(uCacheDispos, i2, uCacheDispos1, i, len);
                         g = uCacheDispos1;
                      }
                      if (this.d.compareAndSet(uCacheDispos, g)) {
                      }
                   }else {
                      i = i + 1;
                   }
                }else {
                   i = -1;
                   goto label_0019 ;
                }
             }
             return;
          }
       }
       return;
    }
    public void onError(Throwable p0){
       this.f = p0;
       SingleCache$CacheDisposable[] andSet = this.d.getAndSet(SingleCache.h);
       int len = andSet.length;
       int i = 0;
       while (i < len) {
          object oobject = andSet[i];
          if (!oobject.isDisposed()) {
             oobject.actual.onError(p0);
          }
          i = i + 1;
       }
       return;
    }
    public void onSubscribe(b p0){
    }
    public void onSuccess(Object p0){
       this.e = p0;
       SingleCache$CacheDisposable[] andSet = this.d.getAndSet(SingleCache.h);
       int len = andSet.length;
       int i = 0;
       while (i < len) {
          object oobject = andSet[i];
          if (!oobject.isDisposed()) {
             oobject.actual.onSuccess(p0);
          }
          i = i + 1;
       }
       return;
    }
}
