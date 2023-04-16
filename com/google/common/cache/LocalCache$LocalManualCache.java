package com.google.common.cache.LocalCache$LocalManualCache;
import com.google.common.cache.a;
import java.io.Serializable;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LocalCache;
import com.google.common.cache.CacheLoader;
import java.lang.Object;
import com.google.common.cache.LocalCache$a;
import java.util.concurrent.ConcurrentMap;
import com.google.common.cache.LocalCache$Segment;
import java.util.concurrent.Callable;
import ok.n;
import com.google.common.cache.LocalCache$LocalManualCache$a;
import java.util.Objects;
import java.lang.Iterable;
import com.google.common.collect.ImmutableMap;
import java.util.LinkedHashMap;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import pk.b;
import pk.c;
import pk.a;
import com.google.common.cache.LocalCache$ManualSerializationProxy;

public class LocalCache$LocalManualCache implements a, Serializable	// class@001749
{
    public final LocalCache localCache;
    public static final long serialVersionUID = 0x1;

    public void LocalCache$LocalManualCache(CacheBuilder p0){
       super(new LocalCache(p0, null));
    }
    public void LocalCache$LocalManualCache(LocalCache p0){
       super();
       this.localCache = p0;
    }
    public void LocalCache$LocalManualCache(LocalCache p0,LocalCache$a p1){
       super(p0);
    }
    public ConcurrentMap asMap(){
       return this.localCache;
    }
    public void cleanUp(){
       LocalCache d = this.localCache.d;
       int len = d.length;
       for (int i = 0; i < len; i = i + 1) {
          d[i].cleanUp();
       }
       return;
    }
    public Object get(Object p0,Callable p1){
       n.j(p1);
       LocalCache$LocalManualCache tlocalCache = this.localCache;
       Objects.requireNonNull(tlocalCache);
       n.j(p0);
       int i = tlocalCache.k(p0);
       return tlocalCache.z(i).get(p0, i, new LocalCache$LocalManualCache$a(this, p1));
    }
    public ImmutableMap getAllPresent(Iterable p0){
       LocalCache$LocalManualCache tlocalCache = this.localCache;
       Objects.requireNonNull(tlocalCache);
       LinkedHashMap linkedHashMa = Maps.u();
       Iterator iterator = p0.iterator();
       int i = 0;
       int i1 = 0;
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          Object obj1 = tlocalCache.get(obj);
          if (obj1 == null) {
             i1 = i1 + 1;
          }else {
             linkedHashMa.put(obj, obj1);
             i = i + 1;
          }
       }
       tlocalCache.s.a(i);
       tlocalCache.s.d(i1);
       return ImmutableMap.copyOf(linkedHashMa);
    }
    public Object getIfPresent(Object p0){
       LocalCache$LocalManualCache tlocalCache = this.localCache;
       Objects.requireNonNull(tlocalCache);
       n.j(p0);
       int i = tlocalCache.k(p0);
       p0 = tlocalCache.z(i).get(p0, i);
       if (p0 == null) {
          tlocalCache.s.d(1);
       }else {
          tlocalCache.s.a(1);
       }
       return p0;
    }
    public void invalidate(Object p0){
       n.j(p0);
       this.localCache.remove(p0);
    }
    public void invalidateAll(){
       this.localCache.clear();
    }
    public void invalidateAll(Iterable p0){
       LocalCache$LocalManualCache tlocalCache = this.localCache;
       Objects.requireNonNull(tlocalCache);
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          tlocalCache.remove(iterator.next());
       }
       return;
    }
    public void put(Object p0,Object p1){
       this.localCache.put(p0, p1);
    }
    public void putAll(Map p0){
       this.localCache.putAll(p0);
    }
    public long size(){
       return this.localCache.n();
    }
    public c stats(){
       a uoa = new a();
       uoa.f(this.localCache.s);
       LocalCache d = this.localCache.d;
       int len = d.length;
       for (int i = 0; i < len; i = i + 1) {
          uoa.f(d[i].statsCounter);
       }
       return uoa.l();
    }
    public Object writeReplace(){
       return new LocalCache$ManualSerializationProxy(this.localCache);
    }
}
