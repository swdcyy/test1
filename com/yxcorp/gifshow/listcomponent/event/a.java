package com.yxcorp.gifshow.listcomponent.event.a;
import y0b.n;
import java.lang.Object;
import y0b.j;
import java.util.ArrayList;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import y0b.u;
import y0b.h;
import java.lang.Long;
import y0b.t;
import y0b.i;
import java.util.Collection;
import java.util.List;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.listcomponent.event.KsRxBusHolder;
import brd.t;
import com.yxcorp.gifshow.listcomponent.event.KsRxBusHolder$ThreadMode;
import java.lang.Integer;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import u0b.d;
import java.util.TreeMap;
import com.yxcorp.gifshow.listcomponent.event.b;
import java.util.Comparator;
import dn.b;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import com.jakewharton.rxrelay2.PublishRelay;
import com.yxcorp.gifshow.listcomponent.event.KsRxBusHolder$a;
import java.lang.Enum;
import brd.z;
import t45.d;
import u0b.c;
import u0b.a;
import m24.t0;
import java.util.Map;
import java.lang.Boolean;
import java.util.HashSet;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import i1b.d;
import java.lang.StringBuilder;
import q87.c;
import u0b.b;
import java.util.Iterator;
import java.util.Set;
import java.lang.IllegalArgumentException;
import y0b.s;

public final class a	// class@001a6b
{
    public final n a;
    public final KsRxBusHolder b;
    public final long c;

    public void a(n p0,long p1){
       super();
       this.a = p0;
       this.b = p0.s;
       this.c = p1;
    }
    public final ArrayList a(j p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j obj = PatchProxy.applyOneRefs(p0, this, a.class, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       Objects.requireNonNull(p0);
       obj = PatchProxy.apply(null, p0, j.class, "4");
       if (obj != patchProxyRe) {
       }else if(p0.t == null){
          p0.H();
       }else if(p0.u == null){
          p0.H();
       }
       obj = p0.t;
       return obj;
    }
    public final ArrayList b(u p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(Long.valueOf(p0.g()));
       if (p0.p().D() != null) {
          obj.addAll(this.a(p0.p().D().H()));
       }
       if (p0.p().C() != null) {
          obj.addAll(this.a(p0.p().C().H()));
       }
       int i1 = p0.p().B().size();
       for (int i = 0; i < i1; i = i + 1) {
          obj.addAll(this.a(p0.p().A(i).H()));
       }
       return obj;
    }
    public b c(String p0,g p1){
       PublishRelay publishRelay;
       Object obj = this;
       Object obj1 = p0;
       Object obj2 = p1;
       b obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, a.class, "14");
       if (obj3 != PatchProxyResult.class) {
          return obj3;
       }
       a b = obj.b;
       a c = obj.c;
       Objects.requireNonNull(b);
       if (PatchProxy.isSupport(KsRxBusHolder.class)) {
          obj3 = PatchProxy.applyTwoRefs(Long.valueOf(c), obj1, b, KsRxBusHolder.class, "3");
          if (obj3 != PatchProxyResult.class) {
          }else {
          label_0034 :
             KsRxBusHolder$ThreadMode pOSTING = KsRxBusHolder$ThreadMode.POSTING;
             if (PatchProxy.isSupport(KsRxBusHolder.class)) {
                obj3 = PatchProxy.applyThreeRefs(Long.valueOf(c), p0, pOSTING, b, KsRxBusHolder.class, "5");
                if (obj3 != PatchProxyResult.class) {
                }
             }
             if (PatchProxy.isSupport(KsRxBusHolder.class)) {
                obj3 = PatchProxy.applyFourRefs(Long.valueOf(c), p0, pOSTING, Integer.valueOf(0), b, KsRxBusHolder.class, "6");
                if (obj3 != PatchProxyResult.class) {
                }
             }
             ConcurrentHashMap uConcurrentH = b.b.get(obj1);
             if (uConcurrentH == null) {
                uConcurrentH = new ConcurrentHashMap();
                b.b.put(obj1, uConcurrentH);
                b.c.put(obj1, uConcurrentH);
             }
             d uod = uConcurrentH.get(Long.valueOf(c));
             if (uod == null) {
                uod = new d(new TreeMap(b.b));
                uConcurrentH.put(Long.valueOf(c), uod);
             }
             obj3 = uod.b.get(Integer.valueOf(0));
             if (obj3 == null) {
                uod.a.writeLock().lock();
                publishRelay = PublishRelay.d();
                uod.b.put(Integer.valueOf(0), publishRelay);
                uod.a.writeLock().unlock();
             }
             Object obj4 = PatchProxy.applyTwoRefs(publishRelay, pOSTING, b, KsRxBusHolder.class, "8");
             if (obj4 != PatchProxyResult.class) {
                publishRelay = obj4;
             }else {
                obj4 = PatchProxy.applyTwoRefs(publishRelay, pOSTING, b, KsRxBusHolder.class, "9");
                if (obj4 != PatchProxyResult.class) {
                   publishRelay = obj4;
                }else {
                   int i = KsRxBusHolder$a.a[pOSTING.ordinal()];
                   if (i != 1) {
                      if (i != 2) {
                         if (i != 3) {
                            if (i == 4) {
                               publishRelay = publishRelay.observeOn(b.d);
                            }
                         }else {
                            publishRelay = publishRelay.observeOn(d.c);
                         }
                      }else {
                         publishRelay = publishRelay.observeOn(d.a);
                      }
                   }else {
                      publishRelay = publishRelay.observeOn(c.c);
                   }
                }
             }
          }
       }else {
          goto label_0034 ;
       }
       return obj3.observeOn(c.c).subscribe(new a(obj2), t0.b);
    }
    public void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.e(p0, new HashMap());
       return;
    }
    public void e(String p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "3")) {
          return;
       }
       this.f(p0, p1, true);
       return;
    }
    public void f(String p0,Map p1,boolean p2){
       ConcurrentHashMap obj;
       Iterator iterator;
       int i1;
       a uoa = this;
       a uoa1 = a.class;
       if (PatchProxy.isSupport(uoa1) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, a.class, "4")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(uoa1)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p2), this, uoa1, "5");
          if (obj != patchProxyRe) {
          label_0032 :
             Object obj1 = obj;
             b uob = new b();
             uob.a = p1;
             a b = uoa.b;
             Objects.requireNonNull(b);
             if (!PatchProxy.applyVoidThreeRefs(uob, p0, obj1, b, KsRxBusHolder.class, "1")) {
                obj = b.b.get(p0);
                if (obj != null) {
                   if (obj.size() >= obj1.size()) {
                      iterator = obj1.iterator();
                      while (iterator.hasNext()) {
                         b.a(uob, obj, iterator.next());
                      }
                   }else {
                      iterator = obj.keySet().iterator();
                      while (iterator.hasNext()) {
                         Long longx = iterator.next();
                         if (obj1.contains(longx)) {
                            b.a(uob, obj, longx);
                         }
                      }
                   }
                }
             }
             return;
          }
       }
       String[] stringArray = p0.split("\\.");
       if (stringArray.length == 6) {
          object oobject = stringArray[2];
          Object obj2 = PatchProxy.applyOneRefs(oobject, this, uoa1, "6");
          int i = 0;
          if (obj2 != patchProxyRe) {
             i1 = obj2.intValue();
          }else if(TextUtils.n(oobject.toLowerCase(), "page")){
             i1 = 3;
          }else if(TextUtils.n(oobject.toLowerCase(), "section")){
             i1 = 2;
          }else if(TextUtils.n(oobject.toLowerCase(), "component")){
             i1 = 1;
          }else if(TextUtils.n(oobject.toLowerCase(), "item")){
             i1 = 0;
          }else {
             i1 = -1;
          }
          Long longx1 = Long.valueOf(uoa.c);
          if (PatchProxy.isSupport(uoa1)) {
             obj = PatchProxy.applyThreeRefs(longx1, Integer.valueOf(i1), Boolean.valueOf(p2), this, a.class, "7");
             if (obj != patchProxyRe) {
             }else {
             label_00b2 :
                h oh = uoa.a.H().get(longx1);
                if (oh == null) {
                   obj = new HashSet();
                }else if(i1 >= oh.h()){
                   obj = this.g(longx1, i1, p2, new HashSet());
                }else {
                   throw new IllegalArgumentException("Wrong rxbus module level");
                }
             }
          }else {
             goto label_00b2 ;
          }
          Object[] objArray = new Object[i];
          d.C().s("KsBus", "获取到节点数量:"+obj.size(), objArray);
          goto label_0032 ;
       }else {
          throw new IllegalArgumentException("key参数格式错误");
       }
    }
    public final HashSet g(Long p0,int p1,boolean p2,HashSet p3){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), p3, this, a.class, "8");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       h oh = this.a.H().get(p0);
       if (p1 == oh.h()) {
          if (p2) {
             if (oh.h() == 1) {
                p3.addAll(this.a(oh));
             }else if(oh.h() == 2){
                p3.addAll(this.b(oh));
             }else if(oh.h() == 3){
                ArrayList uArrayList = PatchProxy.applyOneRefs(oh, this, uoa, "9");
                if (uArrayList != patchProxyRe) {
                }else {
                   uArrayList = new ArrayList();
                   uArrayList.add(Long.valueOf(oh.g()));
                   int i1 = oh.f().L();
                   for (int i = 0; i < i1; i++) {
                      uArrayList.addAll(this.b(oh.f().K(i).F()));
                   }
                }
                p3.addAll(uArrayList);
             }else if(!oh.h()){
                p3.add(Long.valueOf(oh.g()));
             }
             return p3;
          }else {
             HashSet hashSet = new HashSet();
             hashSet.add(Long.valueOf(oh.g()));
             return hashSet;
          }
       }else {
          return this.g(oh.l(), p1, p2, p3);
       }
    }
}
