package com.kwai.soc.arch.rubas.base.internal.BusImpl;
import dt7.d;
import dt7.e;
import com.kwai.soc.arch.rubas.base.internal.BusImpl$a;
import nsd.u;
import java.lang.Object;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.ArrayList;
import com.kwai.soc.arch.rubas.base.struct.LruMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Map;
import kotlin.jvm.internal.a;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import dt7.d$a;
import java.util.Iterator;
import java.lang.Iterable;
import dt7.h;
import java.util.LinkedHashMap;
import qrd.l1;
import java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock;
import com.kwai.soc.arch.rubas.base.internal.BusImpl$subscribeOnEventForever$1$1;
import msd.a;
import com.kwai.soc.arch.rubas.base.util.LogUtil;
import jt7.a;
import java.util.Objects;
import dt7.h$a;
import com.kwai.soc.arch.rubas.base.internal.BusImpl$publishInternal$1;
import com.kwai.soc.arch.rubas.base.internal.BusImpl$publishInternal$$inlined$synchronized$lambda$1;
import java.lang.StringBuilder;

public final class BusImpl implements d, e	// class@001898
{
    public final ReentrantReadWriteLock a;
    public final ArrayList b;
    public final Object c;
    public final LruMap d;
    public static final BusImpl$a e;

    static {
       BusImpl.e = new BusImpl$a(null);
    }
    public void BusImpl(){
       super();
       this.a = new ReentrantReadWriteLock();
       this.b = new ArrayList();
       this.c = new Object();
       this.d = new LruMap(16, 0x3f400000, 1000);
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, BusImpl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.d.isEmpty() ^ 0x01);
    }
    public void b(String p0,Object p1,Object p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, BusImpl.class, "4")) {
          return;
       }
       a.p(p0, "event");
       this.i(p0, p1, p2, p3);
       return;
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, BusImpl.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.b.isEmpty() ^ 0x01);
    }
    public void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BusImpl.class, "3")) {
          return;
       }
       a.p(p0, "event");
       this.i(p0, null, null, null);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, BusImpl.class, "1")) {
          return;
       }
       BusImpl tc = this.c;
       _monitor_enter(tc);
       d$a uoa = CollectionsKt___CollectionsKt.m2(this.b);
       Collection uCollection = this.d.values();
       a.o(uCollection, "pendingPool.values");
       Iterator iterator = uCollection.iterator();
       while (iterator.hasNext()) {
          h oh = iterator.next();
          a.o(oh, "it");
          uoa.onEventPublished(oh);
       }
       this.d.clear();
       _monitor_exit(tc);
       return;
    }
    public void f(d$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BusImpl.class, "7")) {
          return;
       }
       a.p(p0, "listener");
       BusImpl ta = this.a;
       ReentrantReadWriteLock$ReadLock readLock = ta.readLock();
       int i = 0;
       int readHoldCoun = (!ta.getWriteHoldCount())? ta.getReadHoldCount(): 0;
       for (int i1 = 0; i1 < readHoldCoun; i1 = i1 + 1) {
          readLock.unlock();
       }
       ReentrantReadWriteLock$WriteLock writeLock = ta.writeLock();
       writeLock.lock();
       this.b.remove(p0);
       for (; i < readHoldCoun; i = i + 1) {
          readLock.lock();
       }
       writeLock.unlock();
       return;
    }
    public void g(d$a p0){
       l1 a;
       if (PatchProxy.applyVoidOneRefs(p0, this, BusImpl.class, "6")) {
          return;
       }
       a.p(p0, "listener");
       BusImpl ta = this.a;
       ReentrantReadWriteLock$ReadLock readLock = ta.readLock();
       int i = 0;
       int readHoldCoun = (!ta.getWriteHoldCount())? ta.getReadHoldCount(): 0;
       for (int i1 = 0; i1 < readHoldCoun; i1 = i1 + 1) {
          readLock.unlock();
       }
       ReentrantReadWriteLock$WriteLock writeLock = ta.writeLock();
       writeLock.lock();
       this.b.add(p0);
       if (this.b.size() == 1) {
          LogUtil.a("BusImpl", BusImpl$subscribeOnEventForever$1$1.INSTANCE);
          this.e();
       }
       a = l1.a;
       for (; i < readHoldCoun; i = i + 1) {
          readLock.lock();
       }
       writeLock.unlock();
       return;
    }
    public final LruMap h(){
       return this.d;
    }
    public final void i(String p0,Object p1,Object p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, BusImpl.class, "5")) {
          return;
       }
       a a = a.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, a, a.class, "3")) {
          a.p(p0, "event");
       }
       p1 = h$a.a(h.h, p0, p1, p2, p3, 0, 16, null);
       LogUtil.a("BusImpl", new BusImpl$publishInternal$1(p1));
       ReentrantReadWriteLock$ReadLock readLock = this.a.readLock();
       readLock.lock();
       if (this.b.isEmpty() ^ 0x01) {
          Iterator iterator = this.b.iterator();
          while (iterator.hasNext()) {
             iterator.next().onEventPublished(p1);
          }
          readLock.unlock();
          return;
       }else {
          readLock.unlock();
          BusImpl tc = this.c;
          _monitor_enter(tc);
          LogUtil.a("BusImpl", new BusImpl$publishInternal$$inlined$synchronized$lambda$1(this, p0, p1, p2));
          BusImpl td = this.d;
          StringBuilder str = p0+'#';
          int i = (p2 != null)? p2.hashCode(): 0;
          td.put(str+i, p1);
          _monitor_exit(tc);
          return;
       }
    }
}
