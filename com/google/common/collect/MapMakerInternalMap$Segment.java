package com.google.common.collect.MapMakerInternalMap$Segment;
import java.util.concurrent.locks.ReentrantLock;
import com.google.common.collect.MapMakerInternalMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import com.google.common.collect.MapMakerInternalMap$f;
import java.lang.Object;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.Reference;
import com.google.common.collect.MapMakerInternalMap$o;
import com.google.common.base.Equivalence;
import com.google.common.collect.MapMakerInternalMap$n;
import com.google.common.collect.MapMakerInternalMap$g;
import java.lang.AssertionError;

public abstract class MapMakerInternalMap$Segment extends ReentrantLock	// class@001825
{
    public int count;
    public final MapMakerInternalMap map;
    public final int maxSegmentSize;
    public int modCount;
    public final AtomicInteger readCount;
    public AtomicReferenceArray table;
    public int threshold;

    public void MapMakerInternalMap$Segment(MapMakerInternalMap p0,int p1,int p2){
       super();
       this.readCount = new AtomicInteger();
       this.map = p0;
       this.maxSegmentSize = p2;
       this.initTable(this.newEntryArray(p1));
    }
    public static boolean isCollected(MapMakerInternalMap$f p0){
       boolean b = (p0.getValue() == null)? true: false;
       return b;
    }
    public abstract MapMakerInternalMap$f castForTesting(MapMakerInternalMap$f p0);
    public void clear(){
       if (this.count != null) {
          this.lock();
          MapMakerInternalMap$Segment ttable = this.table;
          for (int i = 0; i < ttable.length(); i = i + 1) {
             ttable.set(i, null);
          }
          this.maybeClearReferenceQueues();
          this.readCount.set(0);
          this.modCount = this.modCount + 1;
          this.count = 0;
          this.unlock();
       }
       return;
    }
    public void clearReferenceQueue(ReferenceQueue p0){
       do {
       } while (p0.poll() != null);
       return;
    }
    public boolean clearValueForTesting(Object p0,int p1,MapMakerInternalMap$o p2){
       this.lock();
       MapMakerInternalMap$Segment ttable = this.table;
       int i = (ttable.length() - 1) & p1;
       MapMakerInternalMap$f uof = ttable.get(i);
       MapMakerInternalMap$f uof1 = uof;
       while (true) {
          if (uof1 != null) {
             Object key = uof1.getKey();
             if (uof1.getHash() == p1 && (key != null && this.map.keyEquivalence.equivalent(p0, key))) {
                if (uof1.getValueReference() == p2) {
                   break ;
                }else {
                   this.unlock();
                   return false;
                }
             }else {
                uof1 = uof1.getNext();
             }
          }else {
             this.unlock();
             return false;
          }
       }
       ttable.set(i, this.removeFromChain(uof, uof1));
       this.unlock();
       return 1;
    }
    public boolean containsKey(Object p0,int p1){
       boolean b = false;
       if (this.count != null) {
          p0 = this.getLiveEntry(p0, p1);
          if (p0 != null && p0.getValue() != null) {
             b = true;
          }
          this.postReadCleanup();
          return b;
       }else {
          this.postReadCleanup();
          return b;
       }
    }
    public boolean containsValue(Object p0){
       if (this.count != null) {
          MapMakerInternalMap$Segment ttable = this.table;
          int i = ttable.length();
          int i1 = 0;
          while (i1 < i) {
             MapMakerInternalMap$f uof = ttable.get(i1);
             while (true) {
                if (uof != null) {
                   Object liveValue = this.getLiveValue(uof);
                   if (liveValue != null && this.map.valueEquivalence().equivalent(p0, liveValue)) {
                      this.postReadCleanup();
                      return true;
                   }else {
                      uof = uof.getNext();
                   }
                }else {
                   i1 = i1 + 1;
                }
             }
          }
       }
       this.postReadCleanup();
       return false;
    }
    public MapMakerInternalMap$f copyEntry(MapMakerInternalMap$f p0,MapMakerInternalMap$f p1){
       return this.map.entryHelper.b(this.self(), p0, p1);
    }
    public MapMakerInternalMap$f copyForTesting(MapMakerInternalMap$f p0,MapMakerInternalMap$f p1){
       return this.map.entryHelper.b(this.self(), this.castForTesting(p0), this.castForTesting(p1));
    }
    public void drainKeyReferenceQueue(ReferenceQueue p0){
       int i = 0;
       Reference reference = p0.poll();
       while (reference != null) {
          this.map.reclaimKey(reference);
          i = i + 1;
          if (i == 16) {
             break ;
          }
       }
       return;
    }
    public void drainValueReferenceQueue(ReferenceQueue p0){
       int i = 0;
       Reference reference = p0.poll();
       while (reference != null) {
          this.map.reclaimValue(reference);
          i = i + 1;
          if (i == 16) {
             break ;
          }
       }
       return;
    }
    public void expand(){
       MapMakerInternalMap$Segment ttable = this.table;
       int i = ttable.length();
       if (i >= 0x40000000) {
          return;
       }
       MapMakerInternalMap$Segment tcount = this.count;
       AtomicReferenceArray uAtomicRefer = this.newEntryArray((i << 1));
       this.threshold = (uAtomicRefer.length() * 3) / 4;
       int i1 = uAtomicRefer.length() - 1;
       int i2 = 0;
       while (i2 < i) {
          MapMakerInternalMap$f uof = ttable.get(i2);
          if (uof != null) {
             MapMakerInternalMap$f next = uof.getNext();
             int i3 = uof.getHash() & i1;
             if (next == null) {
                uAtomicRefer.set(i3, uof);
             }else {
                MapMakerInternalMap$f uof1 = uof;
                for (; next != null; next = next.getNext()) {
                   int i4 = next.getHash() & i1;
                   if (i4 != i3) {
                      uof1 = next;
                      i3 = i4;
                   }
                }
                uAtomicRefer.set(i3, uof1);
                for (; uof != uof1; uof = uof.getNext()) {
                   int i5 = uof.getHash() & i1;
                   MapMakerInternalMap$f uof2 = this.copyEntry(uof, uAtomicRefer.get(i5));
                   if (uof2 != null) {
                      uAtomicRefer.set(i5, uof2);
                   }else {
                      tcount = tcount - 1;
                   }
                }
             }
          }
          i2 = i2 + 1;
       }
       this.table = uAtomicRefer;
       this.count = tcount;
       return;
    }
    public Object get(Object p0,int p1){
       p0 = this.getLiveEntry(p0, p1);
       if (p0 == null) {
          this.postReadCleanup();
          return null;
       }else {
          p0 = p0.getValue();
          if (p0 == null) {
             this.tryDrainReferenceQueues();
          }
          this.postReadCleanup();
          return p0;
       }
    }
    public MapMakerInternalMap$f getEntry(Object p0,int p1){
       if (this.count != null) {
          for (MapMakerInternalMap$f first = this.getFirst(p1); first != null; first = first.getNext()) {
             if (first.getHash() == p1) {
                Object key = first.getKey();
                if (key == null) {
                   this.tryDrainReferenceQueues();
                }else if(this.map.keyEquivalence.equivalent(p0, key)){
                   return first;
                }
             }
          }
       }
       return null;
    }
    public MapMakerInternalMap$f getFirst(int p0){
       MapMakerInternalMap$Segment ttable = this.table;
       return ttable.get((p0 & (ttable.length() - 1)));
    }
    public ReferenceQueue getKeyReferenceQueueForTesting(){
       throw new AssertionError();
    }
    public MapMakerInternalMap$f getLiveEntry(Object p0,int p1){
       return this.getEntry(p0, p1);
    }
    public Object getLiveValue(MapMakerInternalMap$f p0){
       if (p0.getKey() == null) {
          this.tryDrainReferenceQueues();
          return null;
       }else {
          p0 = p0.getValue();
          if (p0 != null) {
             return p0;
          }
          this.tryDrainReferenceQueues();
          return null;
       }
    }
    public Object getLiveValueForTesting(MapMakerInternalMap$f p0){
       return this.getLiveValue(this.castForTesting(p0));
    }
    public ReferenceQueue getValueReferenceQueueForTesting(){
       throw new AssertionError();
    }
    public MapMakerInternalMap$o getWeakValueReferenceForTesting(MapMakerInternalMap$f p0){
       throw new AssertionError();
    }
    public void initTable(AtomicReferenceArray p0){
       int i = (p0.length() * 3) / 4;
       this.threshold = i;
       if (i == this.maxSegmentSize) {
          this.threshold = i + 1;
       }
       this.table = p0;
       return;
    }
    public void maybeClearReferenceQueues(){
    }
    public void maybeDrainReferenceQueues(){
    }
    public AtomicReferenceArray newEntryArray(int p0){
       return new AtomicReferenceArray(p0);
    }
    public MapMakerInternalMap$f newEntryForTesting(Object p0,int p1,MapMakerInternalMap$f p2){
       return this.map.entryHelper.f(this.self(), p0, p1, this.castForTesting(p2));
    }
    public MapMakerInternalMap$o newWeakValueReferenceForTesting(MapMakerInternalMap$f p0,Object p1){
       throw new AssertionError();
    }
    public void postReadCleanup(){
       if (!(this.readCount.incrementAndGet() & 0x3f)) {
          this.runCleanup();
       }
       return;
    }
    public void preWriteCleanup(){
       this.runLockedCleanup();
    }
    public Object put(Object p0,int p1,Object p2,boolean p3){
       this.lock();
       this.preWriteCleanup();
       int i = this.count + 1;
       if (i > this.threshold) {
          this.expand();
          i = this.count + 1;
       }
       MapMakerInternalMap$Segment ttable = this.table;
       int i1 = (ttable.length() - 1) & p1;
       MapMakerInternalMap$f uof = ttable.get(i1);
       MapMakerInternalMap$f uof1 = uof;
       while (true) {
          if (uof1 != null) {
             Object key = uof1.getKey();
             if (uof1.getHash() == p1 && (key != null && this.map.keyEquivalence.equivalent(p0, key))) {
                p0 = uof1.getValue();
                if (p0 == null) {
                   break ;
                }else if(p3){
                   this.unlock();
                   return p0;
                }else {
                   this.modCount = this.modCount + 1;
                   this.setValue(uof1, p2);
                   this.unlock();
                   return p0;
                }
             }else {
                uof1 = uof1.getNext();
             }
          }else {
             this.modCount = this.modCount + 1;
             p0 = this.map.entryHelper.f(this.self(), p0, p1, uof);
             this.setValue(p0, p2);
             ttable.set(i1, p0);
             this.count = i;
             this.unlock();
             return null;
          }
       }
       this.modCount = this.modCount + 1;
       this.setValue(uof1, p2);
       this.count = this.count;
       this.unlock();
       return null;
    }
    public boolean reclaimKey(MapMakerInternalMap$f p0,int p1){
       this.lock();
       MapMakerInternalMap$Segment ttable = this.table;
       p1 = p1 & (ttable.length() - 1);
       MapMakerInternalMap$f uof = ttable.get(p1);
       MapMakerInternalMap$f uof1 = uof;
       while (true) {
          if (uof1 != null) {
             if (uof1 == p0) {
                break ;
             }else {
                uof1 = uof1.getNext();
             }
          }else {
             this.unlock();
             return false;
          }
       }
       this.modCount = this.modCount + 1;
       ttable.set(p1, this.removeFromChain(uof, uof1));
       this.count = this.count - 1;
       this.unlock();
       return 1;
    }
    public boolean reclaimValue(Object p0,int p1,MapMakerInternalMap$o p2){
       this.lock();
       MapMakerInternalMap$Segment ttable = this.table;
       int i = (ttable.length() - 1) & p1;
       MapMakerInternalMap$f uof = ttable.get(i);
       MapMakerInternalMap$f uof1 = uof;
       while (true) {
          if (uof1 != null) {
             Object key = uof1.getKey();
             if (uof1.getHash() == p1 && (key != null && this.map.keyEquivalence.equivalent(p0, key))) {
                if (uof1.getValueReference() == p2) {
                   break ;
                }else {
                   this.unlock();
                   return false;
                }
             }else {
                uof1 = uof1.getNext();
             }
          }else {
             this.unlock();
             return false;
          }
       }
       this.modCount = this.modCount + 1;
       ttable.set(i, this.removeFromChain(uof, uof1));
       this.count = this.count - 1;
       this.unlock();
       return 1;
    }
    public Object remove(Object p0,int p1){
       this.lock();
       this.preWriteCleanup();
       MapMakerInternalMap$Segment ttable = this.table;
       int i = (ttable.length() - 1) & p1;
       MapMakerInternalMap$f uof = ttable.get(i);
       MapMakerInternalMap$f uof1 = uof;
       while (true) {
          if (uof1 != null) {
             Object key = uof1.getKey();
             if (uof1.getHash() == p1 && (key != null && this.map.keyEquivalence.equivalent(p0, key))) {
                p0 = uof1.getValue();
                if (p0 != null || MapMakerInternalMap$Segment.isCollected(uof1)) {
                   break ;
                }else {
                   this.unlock();
                   return null;
                }
             }else {
                uof1 = uof1.getNext();
             }
          }else {
             this.unlock();
             return null;
          }
       }
       this.modCount = this.modCount + 1;
       ttable.set(i, this.removeFromChain(uof, uof1));
       this.count = this.count - 1;
       this.unlock();
       return p0;
    }
    public boolean remove(Object p0,int p1,Object p2){
       boolean b;
       this.lock();
       this.preWriteCleanup();
       MapMakerInternalMap$Segment ttable = this.table;
       int i = (ttable.length() - 1) & p1;
       MapMakerInternalMap$f uof = ttable.get(i);
       MapMakerInternalMap$f uof1 = uof;
       while (true) {
          b = false;
          if (uof1 != null) {
             Object key = uof1.getKey();
             if (uof1.getHash() == p1 && (key != null && this.map.keyEquivalence.equivalent(p0, key))) {
                if (this.map.valueEquivalence().equivalent(p2, uof1.getValue())) {
                   b = true;
                   break ;
                }else if(MapMakerInternalMap$Segment.isCollected(uof1)){
                   this.unlock();
                   return b;
                }
                break ;
             }else {
                uof1 = uof1.getNext();
             }
          }else {
             this.unlock();
             return b;
          }
       }
       this.modCount = this.modCount + 1;
       ttable.set(i, this.removeFromChain(uof, uof1));
       this.count = this.count - 1;
       this.unlock();
       return b;
    }
    public boolean removeEntryForTesting(MapMakerInternalMap$f p0){
       MapMakerInternalMap$Segment ttable = this.table;
       int i = p0.getHash() & (ttable.length() - 1);
       MapMakerInternalMap$f uof = ttable.get(i);
       MapMakerInternalMap$f uof1 = uof;
       while (true) {
          if (uof1 == null) {
             return false;
          }
          if (uof1 == p0) {
             break ;
          }else {
             uof1 = uof1.getNext();
          }
       }
       this.modCount = this.modCount + 1;
       ttable.set(i, this.removeFromChain(uof, uof1));
       this.count = this.count - 1;
       return 1;
    }
    public MapMakerInternalMap$f removeFromChain(MapMakerInternalMap$f p0,MapMakerInternalMap$f p1){
       MapMakerInternalMap$Segment tcount = this.count;
       MapMakerInternalMap$f next = p1.getNext();
       for (; p0 != p1; p0 = p0.getNext()) {
          MapMakerInternalMap$f uof = this.copyEntry(p0, next);
          if (uof != null) {
             next = uof;
          }else {
             tcount = tcount - 1;
          }
       }
       this.count = tcount;
       return next;
    }
    public MapMakerInternalMap$f removeFromChainForTesting(MapMakerInternalMap$f p0,MapMakerInternalMap$f p1){
       return this.removeFromChain(this.castForTesting(p0), this.castForTesting(p1));
    }
    public boolean removeTableEntryForTesting(MapMakerInternalMap$f p0){
       return this.removeEntryForTesting(this.castForTesting(p0));
    }
    public Object replace(Object p0,int p1,Object p2){
       this.lock();
       this.preWriteCleanup();
       MapMakerInternalMap$Segment ttable = this.table;
       int i = (ttable.length() - 1) & p1;
       MapMakerInternalMap$f uof = ttable.get(i);
       MapMakerInternalMap$f uof1 = uof;
       while (true) {
          if (uof1 != null) {
             Object key = uof1.getKey();
             if (uof1.getHash() == p1 && (key != null && this.map.keyEquivalence.equivalent(p0, key))) {
                p0 = uof1.getValue();
                if (p0 == null) {
                   if (MapMakerInternalMap$Segment.isCollected(uof1)) {
                      this.modCount = this.modCount + 1;
                      ttable.set(i, this.removeFromChain(uof, uof1));
                      this.count = this.count - 1;
                      break ;
                   }
                   break ;
                }else {
                   this.modCount = this.modCount + 1;
                   this.setValue(uof1, p2);
                   this.unlock();
                   return p0;
                }
             }else {
                uof1 = uof1.getNext();
             }
          }else {
             this.unlock();
             return null;
          }
       }
       this.unlock();
       return null;
    }
    public boolean replace(Object p0,int p1,Object p2,Object p3){
       this.lock();
       this.preWriteCleanup();
       MapMakerInternalMap$Segment ttable = this.table;
       int i = (ttable.length() - 1) & p1;
       MapMakerInternalMap$f uof = ttable.get(i);
       MapMakerInternalMap$f uof1 = uof;
       while (true) {
          if (uof1 != null) {
             Object key = uof1.getKey();
             if (uof1.getHash() == p1 && (key != null && this.map.keyEquivalence.equivalent(p0, key))) {
                p0 = uof1.getValue();
                if (p0 == null) {
                   if (MapMakerInternalMap$Segment.isCollected(uof1)) {
                      this.modCount = this.modCount + 1;
                      ttable.set(i, this.removeFromChain(uof, uof1));
                      this.count = this.count - 1;
                      break ;
                   }
                   break ;
                }else if(this.map.valueEquivalence().equivalent(p2, p0)){
                   this.modCount = this.modCount + 1;
                   this.setValue(uof1, p3);
                   this.unlock();
                   return 1;
                }else {
                   this.unlock();
                   return false;
                }
             }else {
                uof1 = uof1.getNext();
             }
          }else {
             this.unlock();
             return false;
          }
       }
       this.unlock();
       return false;
    }
    public void runCleanup(){
       this.runLockedCleanup();
    }
    public void runLockedCleanup(){
       if (this.tryLock()) {
          this.maybeDrainReferenceQueues();
          this.readCount.set(0);
          this.unlock();
       }
       return;
    }
    public abstract MapMakerInternalMap$Segment self();
    public void setTableEntryForTesting(int p0,MapMakerInternalMap$f p1){
       this.table.set(p0, this.castForTesting(p1));
    }
    public void setValue(MapMakerInternalMap$f p0,Object p1){
       this.map.entryHelper.e(this.self(), p0, p1);
    }
    public void setValueForTesting(MapMakerInternalMap$f p0,Object p1){
       this.map.entryHelper.e(this.self(), this.castForTesting(p0), p1);
    }
    public void setWeakValueReferenceForTesting(MapMakerInternalMap$f p0,MapMakerInternalMap$o p1){
       throw new AssertionError();
    }
    public void tryDrainReferenceQueues(){
       if (this.tryLock()) {
          this.maybeDrainReferenceQueues();
          this.unlock();
       }
       return;
    }
}
