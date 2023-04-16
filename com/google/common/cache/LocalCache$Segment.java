package com.google.common.cache.LocalCache$Segment;
import java.util.concurrent.locks.ReentrantLock;
import com.google.common.cache.LocalCache;
import pk.b;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import ok.n;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Queue;
import com.google.common.cache.LocalCache$c0;
import com.google.common.cache.LocalCache$e;
import ok.y;
import com.google.common.cache.d;
import com.google.common.cache.LocalCache$s;
import com.google.common.cache.RemovalCause;
import java.lang.ref.Reference;
import com.google.common.base.Equivalence;
import com.google.common.cache.LocalCache$EntryFactory;
import java.util.Objects;
import com.google.common.cache.RemovalNotification;
import java.lang.AssertionError;
import com.google.common.cache.CacheLoader;
import java.lang.Throwable;
import java.util.concurrent.ExecutionException;
import java.lang.Error;
import java.lang.RuntimeException;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.google.common.util.concurrent.ExecutionError;
import com.google.common.cache.LocalCache$k;
import xk.d;
import java.util.concurrent.Future;
import com.google.common.util.concurrent.h;
import com.google.common.cache.CacheLoader$InvalidCacheLoadException;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.Iterator;
import com.google.common.cache.LocalCache$Segment$a;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.MoreExecutors;
import java.lang.Runnable;
import pk.e;
import java.util.logging.Level;
import java.util.logging.Logger;
import pk.f;
import com.google.common.cache.LocalCache$Strength;
import java.lang.Thread;

public class LocalCache$Segment extends ReentrantLock	// class@00174d
{
    public final Queue accessQueue;
    public int count;
    public final ReferenceQueue keyReferenceQueue;
    public final LocalCache map;
    public final long maxSegmentWeight;
    public int modCount;
    public final AtomicInteger readCount;
    public final Queue recencyQueue;
    public final b statsCounter;
    public AtomicReferenceArray table;
    public int threshold;
    public long totalWeight;
    public final ReferenceQueue valueReferenceQueue;
    public final Queue writeQueue;

    public void LocalCache$Segment(LocalCache p0,int p1,long p2,b p3){
       super();
       this.readCount = new AtomicInteger();
       this.map = p0;
       this.maxSegmentWeight = p2;
       n.j(p3);
       this.statsCounter = p3;
       this.initTable(this.newEntryArray(p1));
       ReferenceQueue referenceQue = null;
       ReferenceQueue referenceQue1 = (p0.D())? new ReferenceQueue(): referenceQue;
       this.keyReferenceQueue = referenceQue1;
       if (p0.F()) {
          referenceQue = new ReferenceQueue();
       }
       this.valueReferenceQueue = referenceQue;
       ConcurrentLinkedQueue uConcurrentL = (p0.C())? new ConcurrentLinkedQueue(): LocalCache.g();
       this.recencyQueue = uConcurrentL;
       LocalCache$c0 uoc0 = (p0.G())? new LocalCache$c0(): LocalCache.g();
       this.writeQueue = uoc0;
       LocalCache$e uoe = (p0.C())? new LocalCache$e(): LocalCache.g();
       this.accessQueue = uoe;
       return;
    }
    public void cleanUp(){
       this.runLockedCleanup(this.map.q.a());
       this.runUnlockedCleanup();
    }
    public void clear(){
       if (this.count != null) {
          this.lock();
          this.preWriteCleanup(this.map.q.a());
          LocalCache$Segment ttable = this.table;
          int i = 0;
          while (i < ttable.length()) {
             for (d uod = ttable.get(i); uod != null; uod = uod.getNext()) {
                if (uod.getValueReference().E()) {
                   Object key = uod.getKey();
                   Object obj = uod.getValueReference().get();
                   RemovalCause cOLLECTED = (key == null || obj == null)? RemovalCause.COLLECTED: RemovalCause.EXPLICIT;
                   this.enqueueNotification(key, uod.getHash(), obj, uod.getValueReference().c(), cOLLECTED);
                }
             }
             i = i + 1;
          }
          for (i = 0; i < ttable.length(); i = i + 1) {
             ttable.set(i, null);
          }
          this.clearReferenceQueues();
          this.writeQueue.clear();
          this.accessQueue.clear();
          this.readCount.set(0);
          this.modCount = this.modCount + 1;
          this.count = 0;
          this.unlock();
          this.postWriteCleanup();
       }
       return;
    }
    public void clearKeyReferenceQueue(){
       do {
       } while (this.keyReferenceQueue.poll() != null);
       return;
    }
    public void clearReferenceQueues(){
       if (this.map.D()) {
          this.clearKeyReferenceQueue();
       }
       if (this.map.F()) {
          this.clearValueReferenceQueue();
       }
       return;
    }
    public void clearValueReferenceQueue(){
       do {
       } while (this.valueReferenceQueue.poll() != null);
       return;
    }
    public boolean containsKey(Object p0,int p1){
       boolean b = false;
       if (this.count != null) {
          p0 = this.getLiveEntry(p0, p1, this.map.q.a());
          if (p0 == null) {
             this.postReadCleanup();
             return b;
          }else if(p0.getValueReference().get() != null){
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
          long l = this.map.q.a();
          LocalCache$Segment ttable = this.table;
          int i = ttable.length();
          int i1 = 0;
          while (i1 < i) {
             d uod = ttable.get(i1);
             while (true) {
                if (uod != null) {
                   Object liveValue = this.getLiveValue(uod, l);
                   if (liveValue != null && this.map.g.equivalent(p0, liveValue)) {
                      this.postReadCleanup();
                      return true;
                   }else {
                      uod = uod.getNext();
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
    public d copyEntry(d p0,d p1){
       d uod = null;
       if (p0.getKey() == null) {
          return uod;
       }
       LocalCache$s valueReferen = p0.getValueReference();
       Object obj = valueReferen.get();
       if (obj == null && valueReferen.E()) {
          return uod;
       }
       p0 = this.map.r.copyEntry(this, p0, p1);
       p0.setValueReference(valueReferen.e(this.valueReferenceQueue, obj, p0));
       return p0;
    }
    public void drainKeyReferenceQueue(){
       int i = 0;
       Reference reference = this.keyReferenceQueue.poll();
       while (reference != null) {
          LocalCache$Segment tmap = this.map;
          Objects.requireNonNull(tmap);
          int hash = reference.getHash();
          tmap.z(hash).reclaimKey(reference, hash);
          i = i + 1;
          if (i == 16) {
             break ;
          }
       }
       return;
    }
    public void drainRecencyQueue(){
       d uod = this.recencyQueue.poll();
       while (uod != null) {
          if (this.accessQueue.contains(uod)) {
             this.accessQueue.add(uod);
          }
       }
       return;
    }
    public void drainReferenceQueues(){
       if (this.map.D()) {
          this.drainKeyReferenceQueue();
       }
       if (this.map.F()) {
          this.drainValueReferenceQueue();
       }
       return;
    }
    public void drainValueReferenceQueue(){
       int i = 0;
       Reference reference = this.valueReferenceQueue.poll();
       while (reference != null) {
          LocalCache$Segment tmap = this.map;
          Objects.requireNonNull(tmap);
          d uod = reference.a();
          int hash = uod.getHash();
          tmap.z(hash).reclaimValue(uod.getKey(), hash, reference);
          i = i + 1;
          if (i == 16) {
             break ;
          }
       }
       return;
    }
    public void enqueueNotification(Object p0,int p1,Object p2,int p3,RemovalCause p4){
       this.totalWeight = this.totalWeight - (long)p3;
       if (p4.wasEvicted()) {
          this.statsCounter.b();
       }
       if (this.map.o != LocalCache.z) {
          this.map.o.offer(RemovalNotification.create(p0, p2, p4));
       }
       return;
    }
    public void evictEntries(d p0){
       if (!this.map.h()) {
          return;
       }
       this.drainRecencyQueue();
       if ((long)p0.getValueReference().c() - this.maxSegmentWeight > 0 && !this.removeEntry(p0, p0.getHash(), RemovalCause.SIZE)) {
       label_0028 :
          throw new AssertionError();
       }
       while (true) {
          if (this.totalWeight - this.maxSegmentWeight <= 0) {
             return;
          }
          p0 = this.getNextEvictable();
          if (this.removeEntry(p0, p0.getHash(), RemovalCause.SIZE)) {
             continue ;
          }else {
             break ;
          }
       }
       throw new AssertionError();
    }
    public void expand(){
       LocalCache$Segment ttable = this.table;
       int i = ttable.length();
       if (i >= 0x40000000) {
          return;
       }
       LocalCache$Segment tcount = this.count;
       AtomicReferenceArray uAtomicRefer = this.newEntryArray((i << 1));
       this.threshold = (uAtomicRefer.length() * 3) / 4;
       int i1 = uAtomicRefer.length() - 1;
       int i2 = 0;
       while (i2 < i) {
          d uod = ttable.get(i2);
          if (uod != null) {
             d next = uod.getNext();
             int i3 = uod.getHash() & i1;
             if (next == null) {
                uAtomicRefer.set(i3, uod);
             }else {
                d uod1 = uod;
                for (; next != null; next = next.getNext()) {
                   int i4 = next.getHash() & i1;
                   if (i4 != i3) {
                      uod1 = next;
                      i3 = i4;
                   }
                }
                uAtomicRefer.set(i3, uod1);
                for (; uod != uod1; uod = uod.getNext()) {
                   int i5 = uod.getHash() & i1;
                   d uod2 = this.copyEntry(uod, uAtomicRefer.get(i5));
                   if (uod2 != null) {
                      uAtomicRefer.set(i5, uod2);
                   }else {
                      this.removeCollectedEntry(uod);
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
    public void expireEntries(long p0){
       this.drainRecencyQueue();
       while (true) {
          d uod = this.writeQueue.peek();
          if (uod != null && this.map.m(uod, p0)) {
             if (!this.removeEntry(uod, uod.getHash(), RemovalCause.EXPIRED)) {
             label_0022 :
                throw new AssertionError();
             }
             continue ;
          }else {
             while (true) {
                uod = this.accessQueue.peek();
                if (uod != null && this.map.m(uod, p0)) {
                   if (!this.removeEntry(uod, uod.getHash(), RemovalCause.EXPIRED)) {
                   label_0047 :
                      throw new AssertionError();
                   }
                   continue ;
                }else {
                }
             }
          }
       }
       return;
    }
    public Object get(Object p0,int p1){
       if (this.count != null) {
          long l = this.map.q.a();
          d liveEntry = this.getLiveEntry(p0, p1, l);
          if (liveEntry == null) {
             this.postReadCleanup();
             return null;
          }else {
             Object obj = liveEntry.getValueReference().get();
             if (obj != null) {
                this.recordRead(liveEntry, l);
                this.postReadCleanup();
                return this.scheduleRefresh(liveEntry, liveEntry.getKey(), p1, obj, l, this.map.t);
             }else {
                this.tryDrainReferenceQueues();
             }
          }
       }
       this.postReadCleanup();
       return null;
    }
    public Object get(Object p0,int p1,CacheLoader p2){
       n.j(p0);
       try{
          n.j(p2);
          if (this.count != null) {
             d entry = this.getEntry(p0, p1);
             if (entry != null) {
                long l = this.map.q.a();
                Object liveValue = this.getLiveValue(entry, l);
                if (liveValue != null) {
                   this.recordRead(entry, l);
                   this.statsCounter.a(1);
                   this.postReadCleanup();
                   return this.scheduleRefresh(entry, p0, p1, liveValue, l, p2);
                }else {
                   LocalCache$s valueReferen = entry.getValueReference();
                   if (valueReferen.isLoading()) {
                      this.postReadCleanup();
                      return this.waitForLoadingValue(entry, p0, valueReferen);
                   }
                }
             }
          }
          this.postReadCleanup();
          return this.lockedGetOrLoad(p0, p1, p2);
       }catch(java.util.concurrent.ExecutionException e10){
          Throwable cause = e10.getCause();
          if (!cause instanceof Error) {
             if (cause instanceof RuntimeException) {
                throw new UncheckedExecutionException(cause);
             }else {
                throw e10;
             }
          }else {
             throw new ExecutionError(cause);
          }
       }
    }
    public Object getAndRecordStats(Object p0,int p1,LocalCache$k p2,d p3){
       p3 = h.a(p3);
       if (p3 == null) {
          throw new CacheLoader$InvalidCacheLoadException("CacheLoader returned null for key "+p0+".");
       }
       this.statsCounter.c(p2.f());
       this.storeLoadedValue(p0, p1, p2, p3);
       return p3;
    }
    public d getEntry(Object p0,int p1){
       d first = this.getFirst(p1);
       while (true) {
          if (first == null) {
             return null;
          }
          if (first.getHash() == p1) {
             Object key = first.getKey();
             if (key == null) {
                this.tryDrainReferenceQueues();
             }else if(this.map.f.equivalent(p0, key)){
                break ;
             }
          }
          first = first.getNext();
       }
       return first;
    }
    public d getFirst(int p0){
       LocalCache$Segment ttable = this.table;
       return ttable.get((p0 & (ttable.length() - 1)));
    }
    public d getLiveEntry(Object p0,int p1,long p2){
       p0 = this.getEntry(p0, p1);
       if (p0 == null) {
          return null;
       }
       if (!this.map.m(p0, p2)) {
          return p0;
       }
       this.tryExpireEntries(p2);
       return null;
    }
    public Object getLiveValue(d p0,long p1){
       if (p0.getKey() == null) {
          this.tryDrainReferenceQueues();
          return null;
       }else {
          Object obj = p0.getValueReference().get();
          if (obj == null) {
             this.tryDrainReferenceQueues();
             return null;
          }else if(this.map.m(p0, p1)){
             this.tryExpireEntries(p1);
             return null;
          }else {
             return obj;
          }
       }
    }
    public d getNextEvictable(){
       d uod;
       Iterator iterator = this.accessQueue.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             throw new AssertionError();
          }
          uod = iterator.next();
          if (uod.getValueReference().c() > 0) {
             break ;
          }
       }
       return uod;
    }
    public void initTable(AtomicReferenceArray p0){
       this.threshold = (p0.length() * 3) / 4;
       if (!this.map.f()) {
          LocalCache$Segment tthreshold = this.threshold;
          if (!(long)tthreshold - this.maxSegmentWeight) {
             this.threshold = tthreshold + 1;
          }
       }
       this.table = p0;
       return;
    }
    public LocalCache$k insertLoadingValueReference(Object p0,int p1,boolean p2){
       this.lock();
       long l = this.map.q.a();
       this.preWriteCleanup(l);
       LocalCache$Segment ttable = this.table;
       int i = (ttable.length() - 1) & p1;
       d uod = ttable.get(i);
       d uod1 = uod;
       while (true) {
          if (uod1 != null) {
             Object key = uod1.getKey();
             if (uod1.getHash() == p1 && (key != null && this.map.f.equivalent(p0, key))) {
                p0 = uod1.getValueReference();
                if (p0.isLoading() || (p2 && (l - uod1.getWriteTime()) - this.map.n < 0)) {
                   break ;
                }else {
                   this.modCount = this.modCount + 1;
                   LocalCache$k ok = new LocalCache$k(p0);
                   uod1.setValueReference(ok);
                   this.unlock();
                   this.postWriteCleanup();
                   return ok;
                }
             }else {
                uod1 = uod1.getNext();
             }
          }else {
             this.modCount = this.modCount + 1;
             LocalCache$k ok1 = new LocalCache$k();
             p0 = this.newEntry(p0, p1, uod);
             p0.setValueReference(ok1);
             ttable.set(i, p0);
             this.unlock();
             this.postWriteCleanup();
             return ok1;
          }
       }
       this.unlock();
       this.postWriteCleanup();
       return null;
    }
    public d loadAsync(Object p0,int p1,LocalCache$k p2,CacheLoader p3){
       d uod = p2.g(p0, p3);
       LocalCache$Segment$a segment$a = new LocalCache$Segment$a(this, p0, p1, p2, uod);
       uod.u(v6, MoreExecutors.a());
       return uod;
    }
    public Object loadSync(Object p0,int p1,LocalCache$k p2,CacheLoader p3){
       return this.getAndRecordStats(p0, p1, p2, p2.g(p0, p3));
    }
    public Object lockedGetOrLoad(Object p0,int p1,CacheLoader p2){
       LocalCache$k ok;
       LocalCache$s os;
       LocalCache$Segment segment = this;
       Object obj = p0;
       int i = p1;
       this.lock();
       long l = segment.map.q.a();
       segment.preWriteCleanup(l);
       int i1 = segment.count - 1;
       LocalCache$Segment table = segment.table;
       int i2 = i & (table.length() - 1);
       Object obj1 = table.get(i2);
       d uod = obj1;
       while (true) {
          ok = null;
          if (uod != null) {
             Object key = uod.getKey();
             if (uod.getHash() == i && (key != null && segment.map.f.equivalent(obj, key))) {
                LocalCache$s valueReferen = uod.getValueReference();
                if (valueReferen.isLoading()) {
                   l = 0;
                   os = valueReferen;
                label_00a1 :
                   if (l) {
                      ok = new LocalCache$k();
                      if (uod == null) {
                         uod = segment.newEntry(obj, i, obj1);
                         uod.setValueReference(ok);
                         table.set(i2, uod);
                      }else {
                         uod.setValueReference(ok);
                      }
                   }
                   this.unlock();
                   this.postWriteCleanup();
                   if (l) {
                      break ;
                   }else {
                      return segment.waitForLoadingValue(uod, obj, os);
                   }
                }else {
                   Object obj2 = valueReferen.get();
                   if (obj2 == null) {
                      this.enqueueNotification(key, p1, obj2, valueReferen.c(), RemovalCause.COLLECTED);
                   }else if(segment.map.m(uod, l)){
                      this.enqueueNotification(key, p1, obj2, valueReferen.c(), RemovalCause.EXPIRED);
                   }else {
                      segment.recordLockedRead(uod, l);
                      segment.statsCounter.a(1);
                      this.unlock();
                      this.postWriteCleanup();
                      return obj2;
                   }
                   segment.writeQueue.remove(uod);
                   segment.accessQueue.remove(uod);
                   segment.count = i1;
                   os = valueReferen;
                label_00a0 :
                   l = 1;
                   goto label_00a1 ;
                }
             }else {
                uod = uod.getNext();
             }
          }else {
             os = ok;
             goto label_00a0 ;
          }
       }
       _monitor_enter(uod);
       _monitor_exit(uod);
       segment.statsCounter.d(1);
       return segment.loadSync(obj, i, ok, p2);
    }
    public d newEntry(Object p0,int p1,d p2){
       n.j(p0);
       return this.map.r.newEntry(this, p0, p1, p2);
    }
    public AtomicReferenceArray newEntryArray(int p0){
       return new AtomicReferenceArray(p0);
    }
    public void postReadCleanup(){
       if (!(this.readCount.incrementAndGet() & 0x3f)) {
          this.cleanUp();
       }
       return;
    }
    public void postWriteCleanup(){
       this.runUnlockedCleanup();
    }
    public void preWriteCleanup(long p0){
       this.runLockedCleanup(p0);
    }
    public Object put(Object p0,int p1,Object p2,boolean p3){
       LocalCache$Segment count;
       LocalCache$Segment segment = this;
       int i = p1;
       this.lock();
       long l = segment.map.q.a();
       this.preWriteCleanup(l);
       if ((segment.count + 1) > segment.threshold) {
          this.expand();
       }
       LocalCache$Segment table = segment.table;
       int i1 = i & (table.length() - 1);
       d uod = table.get(i1);
       d uod1 = uod;
       while (true) {
          if (uod1 != null) {
             Object key = uod1.getKey();
             if (uod1.getHash() == i && (key != null && segment.map.f.equivalent(p0, key))) {
                LocalCache$s valueReferen = uod1.getValueReference();
                Object obj = valueReferen.get();
                if (obj == null) {
                   segment.modCount = segment.modCount + 1;
                   if (valueReferen.E()) {
                      this.enqueueNotification(p0, p1, obj, valueReferen.c(), RemovalCause.COLLECTED);
                      this.setValue(uod1, p0, p2, l);
                      count = segment.count;
                   }else {
                      this.setValue(uod1, p0, p2, l);
                      count = segment.count + 1;
                   }
                   segment.count = count;
                   this.evictEntries(uod1);
                   break ;
                }else if(p3){
                   this.recordLockedRead(uod1, l);
                }else {
                   segment.modCount = segment.modCount + 1;
                   this.enqueueNotification(p0, p1, obj, valueReferen.c(), RemovalCause.REPLACED);
                   this.setValue(uod1, p0, p2, l);
                   this.evictEntries(uod1);
                }
                this.unlock();
                this.postWriteCleanup();
                return obj;
             }else {
                uod1 = uod1.getNext();
             }
          }else {
             segment.modCount = segment.modCount + 1;
             uod1 = this.newEntry(p0, i, uod);
             this.setValue(uod1, p0, p2, l);
             table.set(i1, uod1);
             segment.count = segment.count + 1;
             this.evictEntries(uod1);
             break ;
          }
       }
       this.unlock();
       this.postWriteCleanup();
       return null;
    }
    public boolean reclaimKey(d p0,int p1){
       this.lock();
       LocalCache$Segment ttable = this.table;
       int i = (ttable.length() - 1) & p1;
       Object obj = ttable.get(i);
       d uod = obj;
       while (true) {
          if (uod != null) {
             if (uod == p0) {
                break ;
             }else {
                uod = uod.getNext();
             }
          }else {
             this.unlock();
             this.postWriteCleanup();
             return false;
          }
       }
       this.modCount = this.modCount + 1;
       ttable.set(i, this.removeValueFromChain(obj, uod, uod.getKey(), p1, uod.getValueReference().get(), uod.getValueReference(), RemovalCause.COLLECTED));
       this.count = this.count - 1;
       this.unlock();
       this.postWriteCleanup();
       return 1;
    }
    public boolean reclaimValue(Object p0,int p1,LocalCache$s p2){
       this.lock();
       LocalCache$Segment ttable = this.table;
       int i = (ttable.length() - 1) & p1;
       Object obj = ttable.get(i);
       d uod = obj;
       while (true) {
          if (uod != null) {
             Object key = uod.getKey();
             if (uod.getHash() == p1 && (key != null && this.map.f.equivalent(p0, key))) {
                if (uod.getValueReference() == p2) {
                   this.modCount = this.modCount + 1;
                   ttable.set(i, this.removeValueFromChain(obj, uod, key, p1, p2.get(), p2, RemovalCause.COLLECTED));
                   this.count = this.count - 1;
                   this.unlock();
                   if (!this.isHeldByCurrentThread()) {
                      this.postWriteCleanup();
                      break ;
                   }
                   break ;
                }else {
                   this.unlock();
                   if (!this.isHeldByCurrentThread()) {
                      this.postWriteCleanup();
                   }
                   return false;
                }
             }else {
                uod = uod.getNext();
             }
          }else {
             this.unlock();
             if (!this.isHeldByCurrentThread()) {
                this.postWriteCleanup();
             }
             return false;
          }
       }
       return 1;
    }
    public void recordLockedRead(d p0,long p1){
       if (this.map.w()) {
          p0.setAccessTime(p1);
       }
       this.accessQueue.add(p0);
       return;
    }
    public void recordRead(d p0,long p1){
       if (this.map.w()) {
          p0.setAccessTime(p1);
       }
       this.recencyQueue.add(p0);
       return;
    }
    public void recordWrite(d p0,int p1,long p2){
       this.drainRecencyQueue();
       this.totalWeight = this.totalWeight + (long)p1;
       if (this.map.w()) {
          p0.setAccessTime(p2);
       }
       if (this.map.x()) {
          p0.setWriteTime(p2);
       }
       this.accessQueue.add(p0);
       this.writeQueue.add(p0);
       return;
    }
    public Object refresh(Object p0,int p1,CacheLoader p2,boolean p3){
       LocalCache$k ok = this.insertLoadingValueReference(p0, p1, p3);
       if (ok == null) {
          return null;
       }
       p0 = this.loadAsync(p0, p1, ok, p2);
       if (p0.isDone()) {
          return h.a(p0);
       }
       return null;
    }
    public Object remove(Object p0,int p1){
       this.lock();
       this.preWriteCleanup(this.map.q.a());
       LocalCache$Segment ttable = this.table;
       int i = (ttable.length() - 1) & p1;
       Object obj = ttable.get(i);
       d uod = obj;
       RemovalCause removalCause = null;
       while (uod != null) {
          Object key = uod.getKey();
          if (uod.getHash() == p1 && (key != null && this.map.f.equivalent(p0, key))) {
             LocalCache$s valueReferen = uod.getValueReference();
             p0 = valueReferen.get();
             if (p0 != null) {
                removalCause = RemovalCause.EXPLICIT;
             }else if(valueReferen.E()){
                removalCause = RemovalCause.COLLECTED;
             }else {
                break ;
             }
             RemovalCause removalCause1 = removalCause;
             this.modCount = this.modCount + 1;
             ttable.set(i, this.removeValueFromChain(obj, uod, key, p1, p0, valueReferen, removalCause1));
             this.count = this.count - 1;
             this.unlock();
             this.postWriteCleanup();
             return p0;
          }else {
             uod = uod.getNext();
          }
       }
       this.unlock();
       this.postWriteCleanup();
       return removalCause;
    }
    public boolean remove(Object p0,int p1,Object p2){
       this.lock();
       this.preWriteCleanup(this.map.q.a());
       LocalCache$Segment ttable = this.table;
       int i = 1;
       int i1 = (ttable.length() - i) & p1;
       Object obj = ttable.get(i1);
       for (d uod = obj; uod != null; uod = uod.getNext()) {
          Object key = uod.getKey();
          if (uod.getHash() == p1 && (key != null && this.map.f.equivalent(p0, key))) {
             LocalCache$s valueReferen = uod.getValueReference();
             Object obj1 = valueReferen.get();
             if (this.map.g.equivalent(p2, obj1)) {
                p0 = RemovalCause.EXPLICIT;
             }else if(obj1 == null && valueReferen.E()){
                p0 = RemovalCause.COLLECTED;
             }else {
                break ;
             }
             this.modCount = this.modCount + i;
             ttable.set(i1, this.removeValueFromChain(obj, uod, key, p1, obj1, valueReferen, p0));
             this.count = this.count - i;
             if (p0 != RemovalCause.EXPLICIT) {
                i = false;
             }
             this.unlock();
             this.postWriteCleanup();
             return i;
          }else {
          }
       }
       this.unlock();
       this.postWriteCleanup();
       return false;
    }
    public void removeCollectedEntry(d p0){
       this.enqueueNotification(p0.getKey(), p0.getHash(), p0.getValueReference().get(), p0.getValueReference().c(), RemovalCause.COLLECTED);
       this.writeQueue.remove(p0);
       this.accessQueue.remove(p0);
    }
    public boolean removeEntry(d p0,int p1,RemovalCause p2){
       LocalCache$Segment ttable = this.table;
       int i = (ttable.length() - 1) & p1;
       Object obj = ttable.get(i);
       d uod = obj;
       while (true) {
          if (uod == null) {
             return false;
          }
          if (uod == p0) {
             break ;
          }else {
             uod = uod.getNext();
          }
       }
       this.modCount = this.modCount + 1;
       ttable.set(i, this.removeValueFromChain(obj, uod, uod.getKey(), p1, uod.getValueReference().get(), uod.getValueReference(), p2));
       this.count = this.count - 1;
       return 1;
    }
    public d removeEntryFromChain(d p0,d p1){
       LocalCache$Segment tcount = this.count;
       d next = p1.getNext();
       for (; p0 != p1; p0 = p0.getNext()) {
          d uod = this.copyEntry(p0, next);
          if (uod != null) {
             next = uod;
          }else {
             this.removeCollectedEntry(p0);
             tcount = tcount - 1;
          }
       }
       this.count = tcount;
       return next;
    }
    public boolean removeLoadingValue(Object p0,int p1,LocalCache$k p2){
       this.lock();
       LocalCache$Segment ttable = this.table;
       int i = (ttable.length() - 1) & p1;
       d uod = ttable.get(i);
       for (d uod1 = uod; uod1 != null; uod1 = uod1.getNext()) {
          Object key = uod1.getKey();
          if (uod1.getHash() == p1 && (key != null && this.map.f.equivalent(p0, key))) {
             if (uod1.getValueReference() == p2) {
                if (p2.E()) {
                   uod1.setValueReference(p2.b);
                }else {
                   ttable.set(i, this.removeEntryFromChain(uod, uod1));
                }
                this.unlock();
                this.postWriteCleanup();
                return 1;
             }else {
                break ;
             }
          }else {
          }
       }
       this.unlock();
       this.postWriteCleanup();
       return false;
    }
    public d removeValueFromChain(d p0,d p1,Object p2,int p3,Object p4,LocalCache$s p5,RemovalCause p6){
       this.enqueueNotification(p2, p3, p4, p5.c(), p6);
       this.writeQueue.remove(p1);
       this.accessQueue.remove(p1);
       if (!p5.isLoading()) {
          return this.removeEntryFromChain(p0, p1);
       }
       p5.b(null);
       return p0;
    }
    public Object replace(Object p0,int p1,Object p2){
       LocalCache$Segment segment = this;
       int i = p1;
       this.lock();
       long l = segment.map.q.a();
       segment.preWriteCleanup(l);
       LocalCache$Segment table = segment.table;
       int i1 = i & (table.length() - 1);
       Object obj = table.get(i1);
       for (d uod = obj; uod != null; uod = uod.getNext()) {
          Object key = uod.getKey();
          if (uod.getHash() == i && key != null) {
             if (segment.map.f.equivalent(p0, key)) {
                LocalCache$s valueReferen = uod.getValueReference();
                Object obj1 = valueReferen.get();
                if (obj1 == null) {
                   if (valueReferen.E()) {
                      segment.modCount = segment.modCount + 1;
                      table.set(i1, this.removeValueFromChain(obj, uod, key, p1, obj1, valueReferen, RemovalCause.COLLECTED));
                      segment.count = segment.count - 1;
                      break ;
                   }else {
                      break ;
                   }
                }else {
                   segment.modCount = segment.modCount + 1;
                   this.enqueueNotification(p0, p1, obj1, valueReferen.c(), RemovalCause.REPLACED);
                   this.setValue(uod, p0, p2, l);
                   segment.evictEntries(uod);
                   this.unlock();
                   this.postWriteCleanup();
                   return obj1;
                }
             }
          }else {
             int i2 = p0;
          }
       }
       this.unlock();
       this.postWriteCleanup();
       return null;
    }
    public boolean replace(Object p0,int p1,Object p2,Object p3){
       LocalCache$Segment segment = this;
       int i = p1;
       this.lock();
       long l = segment.map.q.a();
       segment.preWriteCleanup(l);
       LocalCache$Segment table = segment.table;
       int i1 = i & (table.length() - 1);
       Object obj = table.get(i1);
       for (d uod = obj; uod != null; uod = uod.getNext()) {
          Object key = uod.getKey();
          if (uod.getHash() == i && key != null) {
             if (segment.map.f.equivalent(p0, key)) {
                LocalCache$s valueReferen = uod.getValueReference();
                Object obj1 = valueReferen.get();
                if (obj1 == null) {
                   if (valueReferen.E()) {
                      segment.modCount = segment.modCount + 1;
                      table.set(i1, this.removeValueFromChain(obj, uod, key, p1, obj1, valueReferen, RemovalCause.COLLECTED));
                      segment.count = segment.count - 1;
                      break ;
                   }else {
                      break ;
                   }
                }else if(segment.map.g.equivalent(p2, obj1)){
                   segment.modCount = segment.modCount + 1;
                   this.enqueueNotification(p0, p1, obj1, valueReferen.c(), RemovalCause.REPLACED);
                   this.setValue(uod, p0, p3, l);
                   segment.evictEntries(uod);
                   this.unlock();
                   this.postWriteCleanup();
                   return 1;
                }else {
                   segment.recordLockedRead(uod, l);
                   break ;
                }
             }
          }else {
             int i2 = p0;
          }
       }
       this.unlock();
       this.postWriteCleanup();
       return false;
    }
    public void runLockedCleanup(long p0){
       if (this.tryLock()) {
          this.drainReferenceQueues();
          this.expireEntries(p0);
          this.readCount.set(0);
          this.unlock();
       }
       return;
    }
    public void runUnlockedCleanup(){
       if (!this.isHeldByCurrentThread()) {
          LocalCache$Segment tmap = this.map;
          RemovalNotification removalNotif = tmap.o.poll();
          while (removalNotif != null) {
             tmap.p.onRemoval(removalNotif);
          }
       }
       return;
    }
    public Object scheduleRefresh(d p0,Object p1,int p2,Object p3,long p4,CacheLoader p5){
       if (this.map.y() && ((p4 - p0.getWriteTime()) - this.map.n > 0 && !p0.getValueReference().isLoading())) {
          p0 = this.refresh(p1, p2, p5, true);
          if (p0 != null) {
             return p0;
          }
       }
       return p3;
    }
    public void setValue(d p0,Object p1,Object p2,long p3){
       LocalCache$s valueReferen = p0.getValueReference();
       int i = this.map.k.weigh(p1, p2);
       boolean b = (i >= 0)? true: false;
       n.o(b, "Weights must be non-negative");
       p0.setValueReference(this.map.i.referenceValue(this, p0, p2, i));
       this.recordWrite(p0, i, p3);
       valueReferen.b(p2);
       return;
    }
    public boolean storeLoadedValue(Object p0,int p1,LocalCache$k p2,Object p3){
       LocalCache$Segment segment = this;
       Object obj = p0;
       int i = p1;
       this.lock();
       long l = segment.map.q.a();
       this.preWriteCleanup(l);
       int i1 = segment.count + 1;
       if (i1 > segment.threshold) {
          this.expand();
          i1 = segment.count + 1;
       }
       int i2 = i1;
       LocalCache$Segment table = segment.table;
       int i3 = i & (table.length() - 1);
       d uod = table.get(i3);
       d uod1 = uod;
       while (true) {
          if (uod1 != null) {
             Object key = uod1.getKey();
             if (uod1.getHash() == i && (key != null && segment.map.f.equivalent(obj, key))) {
                LocalCache$s valueReferen = uod1.getValueReference();
                Object obj1 = valueReferen.get();
                if (p2 == valueReferen || (obj1 == null && valueReferen != LocalCache.y)) {
                   segment.modCount = segment.modCount + 1;
                   if (p2.E()) {
                      RemovalCause cOLLECTED = (obj1 == null)? RemovalCause.COLLECTED: RemovalCause.REPLACED;
                      this.enqueueNotification(p0, p1, obj1, p2.c(), cOLLECTED);
                      i2 = i2 - 1;
                   }
                   this.setValue(uod1, p0, p3, l);
                   segment.count = i2;
                   this.evictEntries(uod1);
                   break ;
                }else {
                   this.enqueueNotification(p0, p1, p3, 0, RemovalCause.REPLACED);
                   this.unlock();
                   this.postWriteCleanup();
                   return false;
                }
             }else {
                uod1 = uod1.getNext();
             }
          }else {
             segment.modCount = segment.modCount + 1;
             uod1 = this.newEntry(obj, i, uod);
             this.setValue(uod1, p0, p3, l);
             table.set(i3, uod1);
             segment.count = i2;
             this.evictEntries(uod1);
             break ;
          }
       }
       this.unlock();
       this.postWriteCleanup();
       return 1;
    }
    public void tryDrainReferenceQueues(){
       if (this.tryLock()) {
          this.drainReferenceQueues();
          this.unlock();
       }
       return;
    }
    public void tryExpireEntries(long p0){
       if (this.tryLock()) {
          this.expireEntries(p0);
          this.unlock();
       }
       return;
    }
    public Object waitForLoadingValue(d p0,Object p1,LocalCache$s p2){
       if (!p2.isLoading()) {
          throw new AssertionError();
       }
       n.r((Thread.holdsLock(p0) ^ 1), "Recursive load of: %s", p1);
       p2 = p2.d();
       if (p2 == null) {
          throw new CacheLoader$InvalidCacheLoadException("CacheLoader returned null for key "+p1+".");
       }
       this.recordRead(p0, this.map.q.a());
       this.statsCounter.d(1);
       return p2;
    }
}
