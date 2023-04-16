package com.google.common.cache.LocalCache;
import java.util.concurrent.ConcurrentMap;
import java.util.AbstractMap;
import java.lang.String;
import java.lang.Class;
import java.util.logging.Logger;
import com.google.common.cache.LocalCache$a;
import com.google.common.cache.LocalCache$b;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import java.lang.Math;
import com.google.common.cache.LocalCache$Strength;
import com.google.common.base.Equivalence;
import java.lang.Object;
import ok.j;
import com.google.common.cache.CacheBuilder$OneWeigher;
import pk.f;
import com.google.common.cache.CacheBuilder$NullListener;
import pk.e;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import ok.y;
import com.google.common.cache.LocalCache$EntryFactory;
import ok.x;
import pk.b;
import com.google.common.cache.LocalCache$Segment;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import com.google.common.collect.Iterators;
import com.google.common.cache.LocalCache$s;
import com.google.common.cache.d;
import com.google.common.cache.LocalCache$NullEntry;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.Set;
import com.google.common.cache.LocalCache$g;
import com.google.common.cache.LocalCache$j;
import ok.n;
import java.util.Map;
import java.util.Map$Entry;
import com.google.common.primitives.Ints;
import com.google.common.cache.LocalCache$t;

public class LocalCache extends AbstractMap implements ConcurrentMap	// class@001775
{
    public final int b;
    public final int c;
    public final LocalCache$Segment[] d;
    public final int e;
    public final Equivalence f;
    public final Equivalence g;
    public final LocalCache$Strength h;
    public final LocalCache$Strength i;
    public final long j;
    public final f k;
    public final long l;
    public final long m;
    public final long n;
    public final Queue o;
    public final e p;
    public final y q;
    public final LocalCache$EntryFactory r;
    public final b s;
    public final CacheLoader t;
    public Set u;
    public Collection v;
    public Set w;
    public static final Logger x;
    public static final LocalCache$s y;
    public static final Queue z;

    static {
       LocalCache.x = Logger.getLogger(LocalCache.class.getName());
       LocalCache.y = new LocalCache$a();
       LocalCache.z = new LocalCache$b();
    }
    public void LocalCache(CacheBuilder p0,CacheLoader p1){
       long l1;
       CacheBuilder j;
       long l2;
       int i3;
       int i5;
       LocalCache td;
       super();
       CacheBuilder c = p0.c;
       int i = -1;
       if (c == i) {
          c = 4;
       }
       this.e = Math.min(c, 0x10000);
       LocalCache$Strength strength = p0.d();
       this.h = strength;
       this.i = p0.f();
       this.f = j.a(p0.l, p0.d().defaultEquivalence());
       this.g = j.a(p0.m, p0.f().defaultEquivalence());
       long l = 0;
       if (!p0.i - l || !p0.j - l) {
          l1 = l;
       }else if(p0.f == null){
          l1 = p0.d;
       }else {
          l1 = p0.e;
       }
       this.j = l1;
       this.k = j.a(p0.f, CacheBuilder$OneWeigher.INSTANCE);
       j = p0.j;
       if (!j - -1) {
          j = l;
       }
       this.l = j;
       j = p0.i;
       if (!j - -1) {
          l2 = l;
       }
       this.m = l2;
       j = p0.k;
       if (j - -1) {
          l = j;
       }
       this.n = l;
       CacheBuilder$NullListener iNSTANCE = CacheBuilder$NullListener.INSTANCE;
       e uoe = j.a(p0.n, iNSTANCE);
       this.p = uoe;
       Queue queue = (uoe == iNSTANCE)? LocalCache.g(): new ConcurrentLinkedQueue();
       this.o = queue;
       int i1 = 0;
       int i2 = 1;
       boolean b = (this.x() || this.w())? true: false;
       CacheBuilder o = p0.o;
       if (o == null) {
          y oy = (b)? y.b(): CacheBuilder.t;
          o = oy;
       }
       this.q = o;
       b = (this.C() || this.w())? true: false;
       boolean b1 = (this.G() || this.x())? true: false;
       this.r = LocalCache$EntryFactory.getFactory(strength, b, b1);
       this.s = p0.e().get();
       this.t = null;
       c = p0.b;
       if (c == i) {
          i3 = 16;
       }
       i3 = Math.min(i3, 0x40000000);
       if (this.h() && !this.f()) {
          i3 = Math.min(i3, (int)l1);
       }
       int i4 = 0;
       for (i = 1; i < this.e; i = i << 1) {
          if (this.h()) {
             i5 = i * 20;
             if ((long)i5 - this.j > 0) {
                break ;
             }
          }
          i4 = i4 + 1;
       }
       i4 = i4 - 32;
       this.c = i4;
       i4 = i - 1;
       this.b = i4;
       LocalCache$Segment[] segmentArray = new LocalCache$Segment[i];
       this.d = segmentArray;
       i4 = i3 / i;
       i5 = i4 * i;
       if (i5 < i3) {
          i4 = i4 + 1;
       }
       while (i2 < i4) {
          i2 = i2 << 1;
       }
       if (this.h()) {
          LocalCache tj = this.j;
          long l3 = (long)i;
          long l4 = (tj / l3) + 1;
          l1 = tj % l3;
          td = this.d;
          while (i1 < td.length) {
             if (!(long)i1 - l1) {
                l4 = l4 - 1;
             }
             td[i1] = this.e(i2, l4, p0.e().get());
             i1 = i1 + 1;
          }
       }else {
          td = this.d;
          while (i1 < td.length) {
             td[i1] = this.e(i2, -1, p0.e().get());
             i1 = i1 + 1;
          }
       }
       return;
    }
    public static ArrayList A(Collection p0){
       ArrayList uArrayList = new ArrayList(p0.size());
       Iterators.a(uArrayList, p0.iterator());
       return uArrayList;
    }
    public static LocalCache$s B(){
       return LocalCache.y;
    }
    public static void a(d p0,d p1){
       p0.setNextInAccessQueue(p1);
       p1.setPreviousInAccessQueue(p0);
    }
    public static void c(d p0,d p1){
       p0.setNextInWriteQueue(p1);
       p1.setPreviousInWriteQueue(p0);
    }
    public static Queue g(){
       return LocalCache.z;
    }
    public static d o(){
       return LocalCache$NullEntry.INSTANCE;
    }
    public static void q(d p0){
       d uod = LocalCache.o();
       p0.setNextInAccessQueue(uod);
       p0.setPreviousInAccessQueue(uod);
    }
    public static void t(d p0){
       d uod = LocalCache.o();
       p0.setNextInWriteQueue(uod);
       p0.setPreviousInWriteQueue(uod);
    }
    public boolean C(){
       boolean b = (this.i() || this.h())? true: false;
       return b;
    }
    public boolean D(){
       boolean b = (this.h != LocalCache$Strength.STRONG)? true: false;
       return b;
    }
    public boolean F(){
       boolean b = (this.i != LocalCache$Strength.STRONG)? true: false;
       return b;
    }
    public boolean G(){
       return this.j();
    }
    public void clear(){
       LocalCache td = this.d;
       int len = td.length;
       for (int i = 0; i < len; i = i + 1) {
          td[i].clear();
       }
       return;
    }
    public boolean containsKey(Object p0){
       if (p0 == null) {
          return false;
       }
       int i = this.k(p0);
       return this.z(i).containsKey(p0, i);
    }
    public boolean containsValue(Object p0){
       LocalCache localCache1;
       long l2;
       LocalCache localCache = this;
       Object obj = p0;
       int b = false;
       if (!obj) {
          return b;
       }
       long l = localCache.q.a();
       LocalCache d = localCache.d;
       int i = -1;
       int i1 = 0;
       while (i1 < 3) {
          long l1 = 0;
          int len = d.length;
          int i2 = 0;
          while (true) {
             if (i2 < len) {
                object oobject = d[i2];
                LocalCache$Segment table = oobject.table;
                int i3 = 0;
                while (true) {
                   if (i3 < table.length()) {
                      d uod = table.get(i3);
                      while (true) {
                         if (uod != null) {
                            localCache1 = d;
                            Object liveValue = oobject.getLiveValue(uod, l);
                            l2 = l;
                            if (liveValue != null && localCache.g.equivalent(obj, liveValue)) {
                               return true;
                            }
                            uod = uod.getNext();
                            d = localCache1;
                            l = l2;
                         }else {
                            i3 = i3 + 1;
                         }
                      }
                      return false;
                   }else {
                      l1 = l1 + (long)oobject.modCount;
                      i2 = i2 + 1;
                      l = l;
                      b = 0;
                   }
                }
             }else {
                l2 = l;
                localCache1 = d;
                if (!l1 - i) {
                   goto label_0075 ;
                }else {
                   i1 = i1 + 1;
                   i = l1;
                   d = localCache1;
                   l = l2;
                   b = 0;
                }
             }
          }
       }
    }
    public LocalCache$Segment e(int p0,long p1,b p2){
       LocalCache$Segment segment = new LocalCache$Segment(this, p0, p1, p2);
       return v6;
    }
    public Set entrySet(){
       LocalCache tw = this.w;
       if (tw != null) {
       }else {
          tw = new LocalCache$g(this, this);
          this.w = tw;
       }
       return tw;
    }
    public boolean f(){
       boolean b = (this.k != CacheBuilder$OneWeigher.INSTANCE)? true: false;
       return b;
    }
    public Object get(Object p0){
       if (p0 == null) {
          return null;
       }
       int i = this.k(p0);
       return this.z(i).get(p0, i);
    }
    public Object getOrDefault(Object p0,Object p1){
       p0 = this.get(p0);
       if (p0 != null) {
          p1 = p0;
       }
       return p1;
    }
    public boolean h(){
       boolean b = (this.j >= 0)? true: false;
       return b;
    }
    public boolean i(){
       boolean b = (this.l > 0)? true: false;
       return b;
    }
    public boolean isEmpty(){
       LocalCache td = this.d;
       long l = 0;
       int i = 0;
       while (true) {
          if (i < td.length) {
             if (td[i].count != null) {
                return false;
             }else {
                l = l + (long)td[i].modCount;
                i = i + 1;
             }
          }else if(l){
             i = 0;
             while (true) {
                if (i < td.length) {
                   if (td[i].count != null) {
                      return false;
                   }else {
                      l = l - (long)td[i].modCount;
                      i = i + 1;
                   }
                }else if(l){
                   return false;
                }
             }
          }
          break ;
       }
       return true;
    }
    public boolean j(){
       boolean b = (this.m > 0)? true: false;
       return b;
    }
    public int k(Object p0){
       int i = this.f.hash(p0);
       i = i + ((i << 15) ^ 0xcd7d);
       i = i ^ (i >> 10);
       i = i + (i << 3);
       i = i ^ (i >> 6);
       i = i + ((i << 2) + (i << 14));
       return (i ^ (i >> 16));
    }
    public Set keySet(){
       LocalCache tu = this.u;
       if (tu != null) {
       }else {
          tu = new LocalCache$j(this, this);
          this.u = tu;
       }
       return tu;
    }
    public boolean m(d p0,long p1){
       n.j(p0);
       if (this.i() && (p1 - p0.getAccessTime()) - this.l >= 0) {
          return true;
       }
       if (this.j() && (p1 - p0.getWriteTime()) - this.m >= 0) {
          return true;
       }
       return false;
    }
    public long n(){
       LocalCache td = this.d;
       long l = 0;
       for (int i = 0; i < td.length; i = i + 1) {
          l = l + (long)Math.max(0, td[i].count);
       }
       return l;
    }
    public Object put(Object p0,Object p1){
       n.j(p0);
       n.j(p1);
       int i = this.k(p0);
       return this.z(i).put(p0, i, p1, false);
    }
    public void putAll(Map p0){
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Object key = uEntry.getKey();
          this.put(key, uEntry.getValue());
       }
       return;
    }
    public Object putIfAbsent(Object p0,Object p1){
       n.j(p0);
       n.j(p1);
       int i = this.k(p0);
       return this.z(i).put(p0, i, p1, true);
    }
    public Object remove(Object p0){
       if (p0 == null) {
          return null;
       }
       int i = this.k(p0);
       return this.z(i).remove(p0, i);
    }
    public boolean remove(Object p0,Object p1){
       if (p0 == null || p1 == null) {
          return false;
       }
       int i = this.k(p0);
       return this.z(i).remove(p0, i, p1);
    }
    public Object replace(Object p0,Object p1){
       n.j(p0);
       n.j(p1);
       int i = this.k(p0);
       return this.z(i).replace(p0, i, p1);
    }
    public boolean replace(Object p0,Object p1,Object p2){
       n.j(p0);
       n.j(p2);
       if (p1 == null) {
          return false;
       }
       int i = this.k(p0);
       return this.z(i).replace(p0, i, p1, p2);
    }
    public int size(){
       return Ints.d(this.n());
    }
    public Collection values(){
       LocalCache tv = this.v;
       if (tv != null) {
       }else {
          tv = new LocalCache$t(this, this);
          this.v = tv;
       }
       return tv;
    }
    public boolean w(){
       return this.i();
    }
    public boolean x(){
       boolean b = (this.j() || this.y())? true: false;
       return b;
    }
    public boolean y(){
       boolean b = (this.n > 0)? true: false;
       return b;
    }
    public LocalCache$Segment z(int p0){
       return this.d[((p0 >> this.c) & this.b)];
    }
}
