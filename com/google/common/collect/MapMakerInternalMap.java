package com.google.common.collect.MapMakerInternalMap;
import java.util.concurrent.ConcurrentMap;
import java.io.Serializable;
import java.util.AbstractMap;
import com.google.common.collect.MapMakerInternalMap$a;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import com.google.common.collect.Iterators;
import com.google.common.collect.MapMakerInternalMap$o;
import com.google.common.collect.MapMakerInternalMap$Segment;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReferenceArray;
import com.google.common.collect.MapMakerInternalMap$f;
import com.google.common.base.Equivalence;
import com.google.common.collect.MapMakerInternalMap$g;
import java.util.Set;
import com.google.common.collect.MapMakerInternalMap$d;
import com.google.common.collect.MapMakerInternalMap$i;
import com.google.common.collect.MapMakerInternalMap$Strength;
import ok.n;
import java.util.Map;
import java.util.Map$Entry;
import com.google.common.primitives.Ints;
import com.google.common.collect.MapMakerInternalMap$m;
import com.google.common.collect.MapMakerInternalMap$SerializationProxy;

public class MapMakerInternalMap extends AbstractMap implements ConcurrentMap, Serializable	// class@00183a
{
    public final int concurrencyLevel;
    public final MapMakerInternalMap$g entryHelper;
    public Set entrySet;
    public final Equivalence keyEquivalence;
    public Set keySet;
    public final int segmentMask;
    public final int segmentShift;
    public final MapMakerInternalMap$Segment[] segments;
    public Collection values;
    public static final MapMakerInternalMap$o UNSET_WEAK_VALUE_REFERENCE;
    public static final long serialVersionUID;

    static {
       MapMakerInternalMap.UNSET_WEAK_VALUE_REFERENCE = new MapMakerInternalMap$a();
    }
    public static int rehash(int p0){
       p0 = p0 + ((p0 << 15) ^ 0xcd7d);
       p0 = p0 ^ (p0 >> 10);
       p0 = p0 + (p0 << 3);
       p0 = p0 ^ (p0 >> 6);
       p0 = p0 + ((p0 << 2) + (p0 << 14));
       return (p0 ^ (p0 >> 16));
    }
    public static ArrayList toArrayList(Collection p0){
       ArrayList uArrayList = new ArrayList(p0.size());
       Iterators.a(uArrayList, p0.iterator());
       return uArrayList;
    }
    public static MapMakerInternalMap$o unsetWeakValueReference(){
       return MapMakerInternalMap.UNSET_WEAK_VALUE_REFERENCE;
    }
    public void clear(){
       MapMakerInternalMap tsegments = this.segments;
       int len = tsegments.length;
       for (int i = 0; i < len; i = i + 1) {
          tsegments[i].clear();
       }
       return;
    }
    public boolean containsKey(Object p0){
       if (p0 == null) {
          return false;
       }
       int i = this.hash(p0);
       return this.segmentFor(i).containsKey(p0, i);
    }
    public boolean containsValue(Object p0){
       Equivalence uEquivalence;
       Object obj = p0;
       boolean b = false;
       if (!obj) {
          return b;
       }
       MapMakerInternalMap segments = this.segments;
       int i = -1;
       int i1 = 0;
       while (i1 < 3) {
          long l = 0;
          int len = segments.length;
          int i2 = 0;
          while (true) {
             if (i2 < len) {
                object oobject = segments[i2];
                MapMakerInternalMap$Segment table = oobject.table;
                int i3 = 0;
                while (true) {
                   if (i3 < table.length()) {
                      MapMakerInternalMap$f uof = table.get(i3);
                      while (true) {
                         if (uof != null) {
                            Object liveValue = oobject.getLiveValue(uof);
                            if (liveValue != null && this.valueEquivalence().equivalent(obj, liveValue)) {
                               return true;
                            }
                            uof = uof.getNext();
                            uEquivalence = null;
                         }else {
                            i3 = i3 + 1;
                            uEquivalence = null;
                         }
                      }
                      return false;
                   }else {
                      l = l + (long)oobject.modCount;
                      i2 = i2 + 1;
                      uEquivalence = null;
                   }
                }
             }else if(!l - i){
                goto label_0059 ;
             }else {
                i1 = i1 + 1;
                i = l;
                uEquivalence = null;
             }
          }
       }
    }
    public MapMakerInternalMap$f copyEntry(MapMakerInternalMap$f p0,MapMakerInternalMap$f p1){
       return this.segmentFor(p0.getHash()).copyEntry(p0, p1);
    }
    public MapMakerInternalMap$Segment createSegment(int p0,int p1){
       return this.entryHelper.d(this, p0, p1);
    }
    public Set entrySet(){
       MapMakerInternalMap tentrySet = this.entrySet;
       if (tentrySet != null) {
       }else {
          tentrySet = new MapMakerInternalMap$d(this);
          this.entrySet = tentrySet;
       }
       return tentrySet;
    }
    public Object get(Object p0){
       if (p0 == null) {
          return null;
       }
       int i = this.hash(p0);
       return this.segmentFor(i).get(p0, i);
    }
    public MapMakerInternalMap$f getEntry(Object p0){
       if (p0 == null) {
          return null;
       }
       int i = this.hash(p0);
       return this.segmentFor(i).getEntry(p0, i);
    }
    public Object getLiveValue(MapMakerInternalMap$f p0){
       if (p0.getKey() == null) {
          return null;
       }
       p0 = p0.getValue();
       if (p0 == null) {
          return null;
       }
       return p0;
    }
    public int hash(Object p0){
       return MapMakerInternalMap.rehash(this.keyEquivalence.hash(p0));
    }
    public boolean isEmpty(){
       MapMakerInternalMap tsegments = this.segments;
       long l = 0;
       int i = 0;
       while (true) {
          if (i < tsegments.length) {
             if (tsegments[i].count != null) {
                return false;
             }else {
                l = l + (long)tsegments[i].modCount;
                i = i + 1;
             }
          }else if(l){
             i = 0;
             while (true) {
                if (i < tsegments.length) {
                   if (tsegments[i].count != null) {
                      return false;
                   }else {
                      l = l - (long)tsegments[i].modCount;
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
    public boolean isLiveForTesting(MapMakerInternalMap$f p0){
       boolean b = (this.segmentFor(p0.getHash()).getLiveValueForTesting(p0) != null)? true: false;
       return b;
    }
    public Set keySet(){
       MapMakerInternalMap tkeySet = this.keySet;
       if (tkeySet != null) {
       }else {
          tkeySet = new MapMakerInternalMap$i(this);
          this.keySet = tkeySet;
       }
       return tkeySet;
    }
    public MapMakerInternalMap$Strength keyStrength(){
       return this.entryHelper.a();
    }
    public final MapMakerInternalMap$Segment[] newSegmentArray(int p0){
       MapMakerInternalMap$Segment[] segmentArray = new MapMakerInternalMap$Segment[p0];
       return segmentArray;
    }
    public Object put(Object p0,Object p1){
       n.j(p0);
       n.j(p1);
       int i = this.hash(p0);
       return this.segmentFor(i).put(p0, i, p1, false);
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
       int i = this.hash(p0);
       return this.segmentFor(i).put(p0, i, p1, true);
    }
    public void reclaimKey(MapMakerInternalMap$f p0){
       int hash = p0.getHash();
       this.segmentFor(hash).reclaimKey(p0, hash);
    }
    public void reclaimValue(MapMakerInternalMap$o p0){
       MapMakerInternalMap$f uof = p0.a();
       int hash = uof.getHash();
       this.segmentFor(hash).reclaimValue(uof.getKey(), hash, p0);
    }
    public Object remove(Object p0){
       if (p0 == null) {
          return null;
       }
       int i = this.hash(p0);
       return this.segmentFor(i).remove(p0, i);
    }
    public boolean remove(Object p0,Object p1){
       if (p0 == null || p1 == null) {
          return false;
       }
       int i = this.hash(p0);
       return this.segmentFor(i).remove(p0, i, p1);
    }
    public Object replace(Object p0,Object p1){
       n.j(p0);
       n.j(p1);
       int i = this.hash(p0);
       return this.segmentFor(i).replace(p0, i, p1);
    }
    public boolean replace(Object p0,Object p1,Object p2){
       n.j(p0);
       n.j(p2);
       if (p1 == null) {
          return false;
       }
       int i = this.hash(p0);
       return this.segmentFor(i).replace(p0, i, p1, p2);
    }
    public MapMakerInternalMap$Segment segmentFor(int p0){
       return this.segments[((p0 >> this.segmentShift) & this.segmentMask)];
    }
    public int size(){
       MapMakerInternalMap tsegments = this.segments;
       long l = 0;
       for (int i = 0; i < tsegments.length; i = i + 1) {
          l = l + (long)tsegments[i].count;
       }
       return Ints.d(l);
    }
    public Equivalence valueEquivalence(){
       return this.entryHelper.c().defaultEquivalence();
    }
    public MapMakerInternalMap$Strength valueStrength(){
       return this.entryHelper.c();
    }
    public Collection values(){
       MapMakerInternalMap tvalues = this.values;
       if (tvalues != null) {
       }else {
          tvalues = new MapMakerInternalMap$m(this);
          this.values = tvalues;
       }
       return tvalues;
    }
    public Object writeReplace(){
       MapMakerInternalMap$SerializationProxy serializatio = new MapMakerInternalMap$SerializationProxy(this.entryHelper.a(), this.entryHelper.c(), this.keyEquivalence, this.entryHelper.c().defaultEquivalence(), this.concurrencyLevel, this);
       return v7;
    }
}
