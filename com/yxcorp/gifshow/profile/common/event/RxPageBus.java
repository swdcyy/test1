package com.yxcorp.gifshow.profile.common.event.RxPageBus;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import java.util.Collections;
import u2c.a;
import java.util.HashMap;
import u2c.f;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.Collection;
import java.util.TreeMap;
import java.util.Iterator;
import dn.b;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.common.event.RxPageBus$ThreadMode;
import java.lang.Boolean;
import java.lang.Integer;
import com.yxcorp.gifshow.profile.common.event.b;
import java.util.Comparator;
import com.jakewharton.rxrelay2.PublishRelay;
import u2c.c;
import brd.w;
import com.yxcorp.gifshow.profile.common.event.RxPageBus$a;
import java.lang.Enum;
import t45.d;
import brd.z;
import eoc.e;
import com.yxcorp.gifshow.profile.common.event.a;
import erd.o;

public class RxPageBus	// class@0012d3
{
    public final ConcurrentHashMap a;
    public final ConcurrentHashMap b;

    public void RxPageBus(){
       super();
       this.b = new ConcurrentHashMap();
       this.a = new ConcurrentHashMap();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RxPageBus.class, "1")) {
          return;
       }
       this.c(p0, Collections.emptyMap());
       return;
    }
    public void b(String p0,String p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, RxPageBus.class, "2")) {
          return;
       }
       a uoa = new a();
       HashMap hashMap = new HashMap(2);
       uoa.a = hashMap;
       hashMap.put(p1, p2);
       this.d(p0, uoa);
       return;
    }
    public void c(String p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RxPageBus.class, "3")) {
          return;
       }
       a uoa = new a();
       uoa.a = p1;
       this.d(p0, uoa);
       return;
    }
    public void d(String p0,a p1){
       RxPageBus rxPageBus = RxPageBus.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, rxPageBus, "9")) {
          return;
       }
       f uof = this.a.get(p0);
       if (uof == null) {
          return;
       }
       if (!PatchProxy.applyVoidTwoRefs(p1, uof, this, rxPageBus, "10") && uof.b != null) {
          uof.a.readLock().lock();
          Iterator iterator = uof.b.values().iterator();
          while (iterator.hasNext()) {
             b uob = iterator.next();
             if (uob != null) {
                uob.accept(p1);
             }
          }
          uof.a.readLock().unlock();
       }
       return;
    }
    public void e(String p0,String p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, RxPageBus.class, "5")) {
          return;
       }
       a uoa = new a();
       HashMap hashMap = new HashMap(2);
       uoa.a = hashMap;
       hashMap.put(p1, p2);
       if (!PatchProxy.applyVoidTwoRefs(p0, uoa, this, RxPageBus.class, "8")) {
          this.b.put(p0, uoa);
          this.d(p0, uoa);
       }
       return;
    }
    public t f(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RxPageBus.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h(p0, RxPageBus$ThreadMode.POSTING, false, false);
    }
    public t g(String p0,RxPageBus$ThreadMode p1,boolean p2){
       if (PatchProxy.isSupport(RxPageBus.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, RxPageBus.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.h(p0, p1, p2, 0);
    }
    public t h(String p0,RxPageBus$ThreadMode p1,boolean p2,int p3){
       f obj;
       b uob1;
       if (PatchProxy.isSupport(RxPageBus.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), Integer.valueOf(p3), this, RxPageBus.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (PatchProxy.isSupport(RxPageBus.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), Integer.valueOf(p3), this, RxPageBus.class, "17");
          if (obj != PatchProxyResult.class) {
          }else {
          label_0041 :
             obj = this.a.get(p0);
             if (obj == null) {
                obj = new f(new TreeMap(b.b));
                this.a.put(p0, obj);
             }
             b uob = obj.b.get(Integer.valueOf(p3));
             if (uob == null) {
                obj.a.writeLock().lock();
                uob = PublishRelay.d();
                obj.b.put(Integer.valueOf(p3), uob);
                obj.a.writeLock().unlock();
             }
             if (p2) {
                uob = uob.startWith(new c(this, p0));
             }
             p0 = PatchProxy.applyTwoRefs(uob, p1, this, RxPageBus.class, "20");
             if (p0 != PatchProxyResult.class) {
                uob1 = p0;
             }else {
                p0 = PatchProxy.applyTwoRefs(uob, p1, this, RxPageBus.class, "21");
                if (p0 != PatchProxyResult.class) {
                   uob = p0;
                }else {
                   int i = RxPageBus$a.a[p1.ordinal()];
                   if (i != 1) {
                      if (i != 2) {
                         if (i == 3) {
                            uob = uob.observeOn(d.c);
                         }
                      }else {
                         uob = uob.observeOn(d.a);
                      }
                   }else {
                      uob = uob.observeOn(e.c);
                   }
                }
                uob1 = uob;
             }
          }
       }else {
          goto label_0041 ;
       }
       return obj.map(a.b);
    }
}
