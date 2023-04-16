package com.yxcorp.gifshow.listcomponent.event.KsRxBusHolder;
import y0b.n;
import java.lang.Object;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.String;
import java.util.concurrent.ExecutorService;
import t45.c;
import java.util.concurrent.Executor;
import brd.z;
import lrd.b;
import u0b.b;
import java.lang.Long;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import u0b.d;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.Collection;
import java.util.TreeMap;
import java.util.Iterator;
import dn.b;

public class KsRxBusHolder	// class@001a6a
{
    public n a;
    public final HashMap b;
    public final ConcurrentHashMap c;
    public final z d;

    public void KsRxBusHolder(n p0){
       super();
       this.a = p0;
       this.b = new HashMap();
       this.c = new ConcurrentHashMap();
       this.d = b.b(c.f("kspagerxbus-background-scheduler-thread"));
    }
    public final void a(b p0,ConcurrentHashMap p1,Long p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KsRxBusHolder.class, "2")) {
          return;
       }
       d uod = p1.get(p2);
       if (uod != null && uod.b != null) {
          uod.a.readLock().lock();
          Iterator iterator = uod.b.values().iterator();
          while (iterator.hasNext()) {
             b uob = iterator.next();
             if (uob != null) {
                uob.accept(p0);
             }
          }
          uod.a.readLock().unlock();
       }
       return;
    }
}
