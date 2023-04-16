package com.kwai.sdk.eve.internal.common.scheduler.internal.SimpleLabeledBlockingQueue;
import dn7.b;
import java.util.concurrent.BlockingQueue;
import dn7.a;
import java.lang.Object;
import dn7.g;
import nsd.u;
import com.kwai.sdk.eve.internal.common.scheduler.internal.SimpleLabeledBlockingQueue$a;
import com.kwai.sdk.eve.internal.common.scheduler.internal.SimpleLabeledBlockingQueue$1;
import en7.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Set;
import java.util.LinkedHashMap;
import cn7.c;
import java.util.Collection;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import java.lang.UnsupportedOperationException;
import qrd.l1;
import java.lang.Number;
import java.lang.Integer;
import java.util.NoSuchElementException;
import java.lang.IllegalStateException;
import java.util.concurrent.TimeUnit;
import java.lang.Long;
import java.lang.System;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.util.Map;
import nsd.t;

public final class SimpleLabeledBlockingQueue implements b, BlockingQueue, a	// class@001493
{
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final g f;
    public final SimpleLabeledBlockingQueue$a g;
    public final SimpleLabeledBlockingQueue$a h;
    public final SimpleLabeledBlockingQueue$a i;
    public int j;
    public String k;
    public Map l;
    public final l m;

    public void SimpleLabeledBlockingQueue(){
       l a;
       super();
       this.b = new Object();
       this.c = new Object();
       this.d = new Object();
       this.e = new Object();
       g og = new g(null, null, 3, null);
       this.f = og;
       int i = 0;
       this.g = new SimpleLabeledBlockingQueue$a(this, og, og, i);
       this.h = new SimpleLabeledBlockingQueue$a(this, og, og, i);
       this.i = new SimpleLabeledBlockingQueue$a(this, og, og, i);
       this.j = 2;
       this.k = "";
       SimpleLabeledBlockingQueue tm = this.m;
       if (tm != null) {
          SimpleLabeledBlockingQueue$1 u1 = new SimpleLabeledBlockingQueue$1(this);
          if (!PatchProxy.applyVoidOneRefs(u1, tm, l.class, "2")) {
             a.p(u1, "onChanged");
             a = tm.a;
             _monitor_enter(a);
             tm.a.add(u1);
             _monitor_exit(a);
          }
       }
       if (this.m != null) {
          this.l = new LinkedHashMap();
       }
       return;
    }
    public boolean add(Object p0){
       return this.m(p0);
    }
    public boolean addAll(Collection p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, SimpleLabeledBlockingQueue.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "elements");
       if (p0.isEmpty()) {
          return false;
       }
       obj = new ArrayList(u.Y(p0, 10));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          obj.add(Boolean.valueOf(this.q(iterator.next())));
       }
       iterator = obj.iterator();
       if (!iterator.hasNext()) {
          throw new UnsupportedOperationException("Empty collection can\'t be reduced.");
       }
       Boolean uBoolean = iterator.next();
       while (iterator.hasNext()) {
          Boolean uBoolean1 = iterator.next().booleanValue();
          boolean b = (uBoolean.booleanValue() || uBoolean1 != null)? true: false;
          uBoolean = Boolean.valueOf(b);
       }
       return uBoolean.booleanValue();
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SimpleLabeledBlockingQueue.class, "2")) {
          return;
       }
       a.p(p0, "value");
       SimpleLabeledBlockingQueue tc = this.c;
       _monitor_enter(tc);
       if (!a.g(this.k, p0)) {
          this.k = p0;
          if (!PatchProxy.applyVoid(null, this, SimpleLabeledBlockingQueue.class, "28")) {
             SimpleLabeledBlockingQueue tb = this.b;
             _monitor_enter(tb);
             if (this.isEmpty()) {
                _monitor_exit(tb);
             }else {
                ArrayList uArrayList = new ArrayList();
                this.drainTo(uArrayList);
                this.addAll(uArrayList);
                _monitor_exit(tb);
             }
          }
       }
       _monitor_exit(tc);
       return;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, SimpleLabeledBlockingQueue.class, "14")) {
          return;
       }
       SimpleLabeledBlockingQueue tb = this.b;
       _monitor_enter(tb);
       this.g.f();
       this.h.f();
       this.i.f();
       _monitor_exit(tb);
       return;
    }
    public final boolean contains(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g obj = PatchProxy.applyOneRefs(p0, this, SimpleLabeledBlockingQueue.class, "21");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!p0 instanceof c) {
          return b;
       }
       obj = PatchProxy.applyOneRefs(p0, this, SimpleLabeledBlockingQueue.class, "20");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "element");
          SimpleLabeledBlockingQueue tb = this.b;
          _monitor_enter(tb);
          obj = this.g.c();
          a.m(obj);
          obj = obj.a();
          while (true) {
             if (obj != null) {
                if (a.g(obj.c(), p0)) {
                   b = true;
                   _monitor_exit(tb);
                   break ;
                }else {
                   obj = obj.a();
                }
             }else {
                _monitor_exit(tb);
                break ;
             }
          }
       }
       return b;
    }
    public boolean containsAll(Collection p0){
       SimpleLabeledBlockingQueue obj = PatchProxy.applyOneRefs(p0, this, SimpleLabeledBlockingQueue.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "elements");
       boolean b = true;
       if (!p0.isEmpty()) {
          obj = this.b;
          _monitor_enter(obj);
          ArrayList uArrayList = new ArrayList(u.Y(p0, 10));
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(Boolean.valueOf(this.contains(iterator.next())));
          }
          iterator = uArrayList.iterator();
          if (iterator.hasNext()) {
             Boolean uBoolean = iterator.next();
             while (iterator.hasNext()) {
                Boolean uBoolean1 = iterator.next().booleanValue();
                boolean b1 = (uBoolean.booleanValue() && uBoolean1 != null)? true: false;
                uBoolean = Boolean.valueOf(b1);
             }
             b = uBoolean.booleanValue();
             _monitor_exit(obj);
          }else {
             throw new UnsupportedOperationException("Empty collection can\'t be reduced.");
          }
       }
       return b;
    }
    public String d(){
       SimpleLabeledBlockingQueue tc = this.c;
       _monitor_enter(tc);
       _monitor_exit(tc);
       return this.k;
    }
    public int drainTo(Collection p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SimpleLabeledBlockingQueue.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "c");
       return this.drainTo(p0, Integer.MAX_VALUE);
    }
    public int drainTo(Collection p0,int p1){
       SimpleLabeledBlockingQueue obj;
       if (PatchProxy.isSupport(SimpleLabeledBlockingQueue.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, SimpleLabeledBlockingQueue.class, "25");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p0, "c");
       obj = this.b;
       _monitor_enter(obj);
       int i = 0;
       g og = this.g.c();
       a.m(og);
       for (og = og.a(); og != null && i < p1; og = og.a()) {
          p0.add(og.c());
          i = i + 1;
       }
       this.clear();
       _monitor_exit(obj);
       return i;
    }
    public Object element(){
       c uoc = PatchProxy.apply(null, this, SimpleLabeledBlockingQueue.class, "8");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = this.r();
          if (uoc == null) {
             throw new NoSuchElementException();
          }
       }
       return uoc;
    }
    public boolean isEmpty(){
       Object obj = PatchProxy.apply(null, this, SimpleLabeledBlockingQueue.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.size())? true: false;
       return b;
    }
    public Iterator iterator(){
       Object obj = PatchProxy.apply(null, this, SimpleLabeledBlockingQueue.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       throw new UnsupportedOperationException();
    }
    public int l(){
       return 1;
    }
    public boolean m(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SimpleLabeledBlockingQueue.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "element");
       if (this.q(p0)) {
          return true;
       }
       throw new IllegalStateException();
    }
    public final void n(c p0){
       SimpleLabeledBlockingQueue th;
       if (PatchProxy.applyVoidOneRefs(p0, this, SimpleLabeledBlockingQueue.class, "30")) {
          return;
       }
       g og = new g(p0);
       this.g.e(og);
       if (a.g(p0.m(), this.d())) {
          th = this.h;
          th.i(og);
          th.g((th.b() + 1));
       }else if(a.g(p0.m(), "__TOP")){
          th = this.i;
          th.i(og);
          th.g((th.b() + 1));
          this.h.h(og);
       }
       return;
    }
    public boolean offer(Object p0){
       return this.q(p0);
    }
    public boolean offer(Object p0,long p1,TimeUnit p2){
       boolean b;
       if (PatchProxy.isSupport(SimpleLabeledBlockingQueue.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Long.valueOf(p1), p2, this, SimpleLabeledBlockingQueue.class, "11");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          label_002d :
             return b;
          }
       }
       a.p(p0, "p0");
       b = this.q(p0);
       goto label_002d ;
    }
    public final g p(){
       return this.f;
    }
    public Object peek(){
       return this.r();
    }
    public Object poll(){
       return this.s();
    }
    public Object poll(long p0,TimeUnit p1){
       c uoc;
       if (PatchProxy.isSupport(SimpleLabeledBlockingQueue.class)) {
          uoc = PatchProxy.applyTwoRefs(Long.valueOf(p0), p1, this, SimpleLabeledBlockingQueue.class, "12");
          if (uoc != PatchProxyResult.class) {
          }
       }
       uoc = this.s();
       if (p1 == null) {
          p1 = TimeUnit.MILLISECONDS;
       }
       p0 = p1.toMillis(p0);
       long l = System.currentTimeMillis();
       while (uoc == null && p0 > 0) {
          SimpleLabeledBlockingQueue td = this.d;
          _monitor_enter(td);
          this.d.wait(p0);
          long l1 = System.currentTimeMillis();
          long l2 = l1 - l;
          p0 = p0 - l2;
          _monitor_exit(td);
          uoc = this.s();
          l = l1;
       }
       return uoc;
    }
    public void put(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SimpleLabeledBlockingQueue.class, "9")) {
       }else {
          a.p(p0, "element");
          this.q(p0);
       }
       return;
    }
    public boolean q(c p0){
       SimpleLabeledBlockingQueue td;
       String obj = PatchProxy.applyOneRefs(p0, this, SimpleLabeledBlockingQueue.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "element");
       obj = this.d();
       SimpleLabeledBlockingQueue tb = this.b;
       _monitor_enter(tb);
       if (this.isEmpty()) {
          this.n(p0);
          td = this.d;
          _monitor_enter(td);
          this.d.notifyAll();
          _monitor_exit(td);
          _monitor_exit(tb);
          return true;
       }else {
          g og = new g(p0);
          if (a.g(obj, p0.m())) {
             td = this.h;
             if (td.d() == this.g.d()) {
                this.g.i(og);
             }
             td.e(og);
             SimpleLabeledBlockingQueue tc = this.c;
             _monitor_enter(tc);
             _monitor_exit(tc);
             if (td.b() >= this.j) {
                td.h(this.g.d());
                td.i(this.g.d());
                td.g(0);
             }
             td = this.g;
             td.g((td.b() + true));
          }else if(a.g(p0.m(), "__TOP")){
             td = this.i;
             if (td.d() == this.g.d()) {
                this.g.i(og);
             }
             td.e(og);
             g og1 = td.d();
             og1 = (og1 != null)? og1.b(): null;
             if (og1 == this.h.c()) {
                this.h.h(td.d());
             }
             td = this.g;
             td.g((td.b() + true));
          }else {
             this.g.e(og);
          }
          td = this.d;
          _monitor_enter(td);
          this.d.notifyAll();
          _monitor_exit(td);
          _monitor_exit(tb);
          return true;
       }
    }
    public c r(){
       Object[] objArray = null;
       SimpleLabeledBlockingQueue obj = PatchProxy.apply(objArray, this, SimpleLabeledBlockingQueue.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       _monitor_enter(obj);
       g og = this.g.c();
       a.m(og);
       og = og.a();
       if (og != null) {
          objArray = og.c();
       }
       _monitor_exit(obj);
       return objArray;
    }
    public int remainingCapacity(){
       return Integer.MAX_VALUE;
    }
    public Object remove(){
       c uoc = PatchProxy.apply(null, this, SimpleLabeledBlockingQueue.class, "7");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = this.s();
          if (uoc == null) {
             throw new NoSuchElementException();
          }
       }
       return uoc;
    }
    public final boolean remove(Object p0){
       Ref$ObjectRef element;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g obj = PatchProxy.applyOneRefs(p0, this, SimpleLabeledBlockingQueue.class, "17");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!p0 instanceof c) {
          return b;
       }
       obj = PatchProxy.applyOneRefs(p0, this, SimpleLabeledBlockingQueue.class, "16");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "element");
          SimpleLabeledBlockingQueue tb = this.b;
          _monitor_enter(tb);
          if (this.isEmpty()) {
             _monitor_exit(tb);
          }else {
             obj = this.g.c();
             a.m(obj);
             obj = obj.a();
             g og = null;
             c uoc = (obj != null)? obj.c(): og;
             if (uoc == p0) {
                this.s();
                _monitor_exit(tb);
             }else {
                Ref$ObjectRef objectRef = new Ref$ObjectRef();
                g og1 = this.g.c();
                a.m(og1);
                objectRef.element = og1.a();
                og1 = 0;
                while (true) {
                   element = objectRef.element;
                   if (element != null) {
                      g og2 = this.h.c();
                      a.m(og2);
                      if (element == og2.a()) {
                         og1 = 1;
                      }else {
                         element = objectRef.element;
                         og2 = this.h.d();
                         og2 = (og2 != null)? og2.a(): og;
                         if (element == og2) {
                            og1 = 0;
                         }
                      }
                      if (a.g(objectRef.element.c(), p0)) {
                         p0 = objectRef.element.b();
                         g og3 = objectRef.element.b();
                         a.m(og3);
                         og3.d(objectRef.element.a());
                         og3 = objectRef.element.a();
                         if (og3 != null) {
                            og3.e(objectRef.element.b());
                         }
                         objectRef.element.e(og);
                         objectRef.element.d(og);
                         this.g.a(objectRef.element);
                         this.h.a(objectRef.element);
                         this.i.a(objectRef.element);
                         SimpleLabeledBlockingQueue th = this.h;
                         if (th.c() == objectRef.element) {
                            th.h(p0);
                         }
                         if (og1) {
                            p0 = this.h;
                            p0.g((p0.b() - 1));
                         }
                         p0 = this.g;
                         p0.g((p0.b() - 1));
                         _monitor_exit(tb);
                      }else {
                         objectRef.element = objectRef.element.a();
                      }
                   }else {
                      _monitor_exit(tb);
                      break ;
                   }
                }
             }
             b = true;
          }
       }
       return b;
    }
    public boolean removeAll(Collection p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, SimpleLabeledBlockingQueue.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "elements");
       boolean b = false;
       if (!p0.isEmpty()) {
          obj = new ArrayList(u.Y(p0, 10));
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             obj.add(Boolean.valueOf(this.remove(iterator.next())));
          }
          iterator = obj.iterator();
          if (iterator.hasNext()) {
             Boolean uBoolean = iterator.next();
             while (iterator.hasNext()) {
                Boolean uBoolean1 = iterator.next().booleanValue();
                boolean b1 = (uBoolean.booleanValue() || uBoolean1 != null)? true: false;
                uBoolean = Boolean.valueOf(b1);
             }
             b = uBoolean.booleanValue();
          }else {
             throw new UnsupportedOperationException("Empty collection can\'t be reduced.");
          }
       }
       return b;
    }
    public boolean retainAll(Collection p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SimpleLabeledBlockingQueue.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "elements");
       throw new UnsupportedOperationException();
    }
    public c s(){
       SimpleLabeledBlockingQueue obj = PatchProxy.apply(null, this, SimpleLabeledBlockingQueue.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       _monitor_enter(obj);
       Ref$ObjectRef objectRef = new Ref$ObjectRef();
       objectRef.element = this.t();
       while (true) {
          Ref$ObjectRef element = objectRef.element;
          if (element != null) {
             if (element.c().q() == null || this.m == null) {
                break ;
             }else {
                element = objectRef.element;
                String str = element.c().q();
                a.m(str);
                Object obj1 = this.m.a();
                _monitor_enter(obj1);
                if (this.m.a().contains(str)) {
                   SimpleLabeledBlockingQueue tl = this.l;
                   if (tl == null) {
                      a.S("runningSeqs");
                   }
                   SimpleLabeledBlockingQueue$a uoa = tl.get(str);
                   if (uoa == null) {
                      tl = this.l;
                      if (tl == null) {
                         a.S("runningSeqs");
                      }
                      tl.put(str, new SimpleLabeledBlockingQueue$a(this, element, element, 1));
                   }else {
                      uoa.e(element);
                   }
                   _monitor_exit(obj1);
                   objectRef.element = this.t();
                }else {
                   objectRef = objectRef.element;
                   a.m(objectRef);
                   _monitor_exit(obj1);
                   _monitor_exit(obj);
                   return objectRef.c();
                }
             }
          }else {
             _monitor_exit(obj);
             return null;
          }
       }
       _monitor_exit(obj);
       return objectRef.element.c();
    }
    public final int size(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, SimpleLabeledBlockingQueue.class, "27");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = PatchProxy.apply(null, this, SimpleLabeledBlockingQueue.class, "26");
       if (obj != patchProxyRe) {
          i = obj.intValue();
       }else {
          SimpleLabeledBlockingQueue tb = this.b;
          _monitor_enter(tb);
          _monitor_exit(tb);
          i = this.g.b();
       }
       return i;
    }
    public final g t(){
       Object[] objArray = null;
       g obj = PatchProxy.apply(objArray, this, SimpleLabeledBlockingQueue.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.isEmpty()) {
          return objArray;
       }
       obj = this.g.c();
       a.m(obj);
       obj = obj.a();
       if (obj == null) {
          return objArray;
       }
       SimpleLabeledBlockingQueue tg = this.g;
       obj.e(objArray);
       g og = tg.c();
       a.m(og);
       og.d(obj.a());
       obj.d(objArray);
       g og1 = tg.c();
       a.m(og1);
       og1 = og1.a();
       if (og1 != null) {
          og1.e(tg.c());
       }
       tg.g((tg.b() - 1));
       tg.a(obj);
       this.h.a(obj);
       this.i.a(obj);
       return obj;
    }
    public Object take(){
       c uoc = PatchProxy.apply(null, this, SimpleLabeledBlockingQueue.class, "10");
       if (uoc != PatchProxyResult.class) {
       }else {
          for (uoc = this.s(); uoc == null; uoc = this.s()) {
             SimpleLabeledBlockingQueue td = this.d;
             _monitor_enter(td);
             this.d.wait();
             _monitor_exit(td);
          }
       }
       return uoc;
    }
    public Object[] toArray(){
       Object obj = PatchProxy.apply(null, this, SimpleLabeledBlockingQueue.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.a(this);
    }
    public Object[] toArray(Object[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SimpleLabeledBlockingQueue.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.b(this, p0);
    }
}
