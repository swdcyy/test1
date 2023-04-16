package com.kwai.sdk.eve.internal.common.scheduler.internal.a;
import java.util.concurrent.BlockingQueue;
import dn7.b;
import dn7.a;
import msd.a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
import com.kwai.sdk.eve.internal.common.scheduler.internal.PriorityBlockingQueue2$cost$1;
import java.util.Queue;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.concurrent.ConcurrentLinkedQueue;
import com.kwai.sdk.eve.internal.common.scheduler.internal.a$a;
import cn7.c;
import java.lang.Integer;
import java.lang.Long;
import msd.q;
import java.lang.Boolean;
import qrd.l1;
import java.util.Objects;
import usd.q;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import java.util.NoSuchElementException;
import java.lang.UnsupportedOperationException;
import java.util.concurrent.TimeUnit;
import java.util.Map;
import nsd.t;

public final class a implements BlockingQueue, b, a	// class@001496
{
    public final AtomicReference b;
    public final AtomicInteger c;
    public final LinkedHashMap d;
    public final ReentrantLock e;
    public final Condition f;
    public final ReentrantLock g;
    public final Condition h;
    public final q i;
    public final a j;
    public final int k;
    public final int l;

    public void a(a p0,int p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = 2;
       }
       if (p3 & 0x04) {
          p2 = Integer.MAX_VALUE;
       }
       a.p(p0, "ticker");
       super();
       this.j = p0;
       this.k = p1;
       this.l = p2;
       this.b = new AtomicReference("");
       this.c = new AtomicInteger();
       this.d = new LinkedHashMap();
       ReentrantLock reentrantLoc = new ReentrantLock();
       this.e = reentrantLoc;
       this.f = reentrantLoc.newCondition();
       reentrantLoc = new ReentrantLock();
       this.g = reentrantLoc;
       this.h = reentrantLoc.newCondition();
       this.i = PriorityBlockingQueue2$cost$1.INSTANCE;
       return;
    }
    public final Queue B(){
       long l1;
       long l2;
       Object obj = this;
       Object[] objArray = null;
       String obj1 = PatchProxy.apply(objArray, obj, a.class, "26");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       long l = obj.j.invoke().longValue();
       obj1 = this.d();
       a d = obj.d;
       _monitor_enter(d);
       Collection uCollection = obj.d.values();
       a.o(uCollection, "label2Queue.values");
       Iterator iterator = uCollection.iterator();
       if (iterator.hasNext()) {
          objArray = iterator.next();
          if (iterator.hasNext()) {
             a$a uoa = objArray.peek();
             if (uoa != null) {
                a i = obj.i;
                int i1 = (a.g(uoa.b().m(), obj1))? this.l(): 1;
                l1 = i.invoke(uoa, Integer.valueOf(i1), Long.valueOf(l)).longValue();
             }else {
                l1 = Long.MIN_VALUE;
             }
             do {
                Object obj2 = iterator.next();
                a$a uoa1 = obj2.peek();
                if (uoa1 != null) {
                   a i2 = obj.i;
                   int i3 = (a.g(uoa1.b().m(), obj1))? this.l(): 1;
                   l2 = i2.invoke(uoa1, Integer.valueOf(i3), Long.valueOf(l)).longValue();
                }else {
                   l2 = Long.MIN_VALUE;
                }
                if (l1 - l2 < 0) {
                   objArray = obj2;
                   l1 = l2;
                }
             } while (!iterator.hasNext());
          }
       }
       _monitor_exit(d);
       return objArray;
    }
    public final void D(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       a te = this.e;
       te.lock();
       this.f.signal();
       te.unlock();
       return;
    }
    public final void E(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       a tg = this.g;
       tg.lock();
       this.h.signal();
       tg.unlock();
       return;
    }
    public boolean add(Object p0){
       return this.m(p0);
    }
    public boolean addAll(Collection p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "elements");
       this.q();
       int i = 0;
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          i = i | this.m(iterator.next());
       }
       this.r();
       return i;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a.p(p0, "value");
       this.b.set(p0);
       return;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, a.class, "19")) {
          return;
       }
       this.q();
       a td = this.d;
       _monitor_enter(td);
       Collection uCollection = this.d.values();
       a.o(uCollection, "label2Queue.values");
       Iterator iterator = uCollection.iterator();
       while (iterator.hasNext()) {
          iterator.next().clear();
       }
       this.d.clear();
       _monitor_exit(td);
       if (this.c.getAndSet(0) == this.l) {
          this.h.signal();
       }
       this.r();
       return;
    }
    public final boolean contains(Object p0){
       a uoa;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "18");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = true;
       v2 = (p0 != null)? p0 instanceof c: 1;
       if (v2) {
          ConcurrentLinkedQueue obj1 = PatchProxy.applyOneRefs(p0, this, a.class, "17");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(p0 == null){
             this.q();
             a td = this.d;
             _monitor_enter(td);
             obj1 = this.d.get(p0.m());
             if (obj1 != null) {
                _monitor_exit(td);
                Iterator iterator = obj1.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      if (a.g(iterator.next().b(), p0)) {
                         this.r();
                         break ;
                      }
                   }
                }
             }else {
                _monitor_exit(td);
             }
             this.r();
          }
          b = false;
          return b;
       }else {
          return false;
       }
    }
    public boolean containsAll(Collection p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "elements");
       this.q();
       boolean b = true;
       if (!p0.isEmpty()) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             if (!this.contains(iterator.next())) {
                b = false;
                break ;
             }
          }
       }
       this.r();
       return b;
    }
    public String d(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.get();
       a.o(obj, "atomicHighLabel.get\(\)");
       return obj;
    }
    public int drainTo(Collection p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.drainTo(p0, Integer.MAX_VALUE);
    }
    public int drainTo(Collection p0,int p1){
       Object obj2;
       Queue queue;
       Object obj = this;
       Object obj1 = p0;
       int i = p1;
       if (PatchProxy.isSupport(a.class)) {
          obj2 = PatchProxy.applyTwoRefs(obj1, Integer.valueOf(p1), obj, a.class, "21");
          if (obj2 != PatchProxyResult.class) {
             return obj2.intValue();
          }
       }
       Objects.requireNonNull(p0);
       obj2 = 1;
       int i1 = 0;
       a uoa = (obj1 != obj)? 1: null;
       if (uoa) {
          if (i <= 0) {
             return i1;
          }else if(obj.c.get() <= 0){
             return i1;
          }else {
             this.q();
             int i2 = q.u(i, obj.c.get());
             a d = obj.d;
             _monitor_enter(d);
             int i3 = 0;
             while (true) {
                if (i3 < i2) {
                   Collection uCollection = obj.d.values();
                   a.o(uCollection, "label2Queue.values");
                   Iterator iterator = uCollection.iterator();
                   if (!iterator.hasNext()) {
                      queue = null;
                   }else {
                      Object obj3 = iterator.next();
                      if (iterator.hasNext()) {
                         a$a uoa2 = obj3.peek();
                         long l = (uoa2 != null)? uoa2.a(): Long.MAX_VALUE;
                         while (true) {
                            Object obj4 = iterator.next();
                            a$a uoa3 = obj4.peek();
                            long l1 = (uoa3 != null)? uoa3.a(): Long.MAX_VALUE;
                            if (l - l1 > 0) {
                               obj3 = obj4;
                               l = l1;
                            }
                            if (iterator.hasNext()) {
                               continue ;
                            }
                         }
                      }
                      queue = obj3;
                   }
                   if (queue != null) {
                      a$a uoa1 = queue.poll();
                      if (uoa1 != null) {
                         obj1.add(uoa1.b());
                         i3 = i3 + 1;
                      }else {
                         throw new IllegalStateException("drain to "+i+" count="+obj.c.get()+" encounter error");
                      }
                   }else {
                      continue ;
                   }
                }else {
                   _monitor_exit(d);
                   if (i3 > 0) {
                      if (obj.c.getAndAdd((- i3)) != obj.l) {
                         obj2 = 0;
                      }
                      i1 = obj2;
                   }
                   this.r();
                   if (i1) {
                      this.E();
                      break ;
                   }
                   break ;
                }
             }
             return i2;
          }
       }else {
          throw new IllegalArgumentException("Failed requirement.".toString());
       }
    }
    public Object element(){
       c uoc = PatchProxy.apply(null, this, a.class, "31");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = this.v();
          if (uoc == null) {
             throw new NoSuchElementException();
          }
       }
       return uoc;
    }
    public boolean isEmpty(){
       Object obj = PatchProxy.apply(null, this, a.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.size())? true: false;
       return b;
    }
    public Iterator iterator(){
       Object obj = PatchProxy.apply(null, this, a.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       throw new UnsupportedOperationException();
    }
    public int l(){
       return this.k;
    }
    public boolean m(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "element");
       return this.u(p0);
    }
    public final c n(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       _monitor_enter(obj);
       Queue queue = this.B();
       if (queue != null) {
          a$a uoa = queue.poll();
          if (uoa != null) {
             objArray = uoa.b();
          }
       }
       _monitor_exit(obj);
       return objArray;
    }
    public boolean offer(Object p0){
       return this.u(p0);
    }
    public boolean offer(Object p0,long p1,TimeUnit p2){
       boolean b;
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Long.valueOf(p1), p2, this, a.class, "9");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          label_0031 :
             return b;
          }
       }
       a.p(p2, "unit");
       b = this.s(p0, Long.valueOf(p1), p2);
       goto label_0031 ;
    }
    public final void p(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "24")) {
          return;
       }
       a td = this.d;
       _monitor_enter(td);
       a td1 = this.d;
       String str = p0.b().m();
       ConcurrentLinkedQueue uConcurrentL = td1.get(str);
       if (uConcurrentL == null) {
          uConcurrentL = new ConcurrentLinkedQueue();
          td1.put(str, uConcurrentL);
       }
       _monitor_exit(td);
       uConcurrentL.offer(p0);
       return;
    }
    public Object peek(){
       return this.v();
    }
    public Object poll(){
       return this.w();
    }
    public Object poll(long p0,TimeUnit p1){
       c uoc;
       if (PatchProxy.isSupport(a.class)) {
          uoc = PatchProxy.applyTwoRefs(Long.valueOf(p0), p1, this, a.class, "13");
          if (uoc != PatchProxyResult.class) {
          label_0028 :
             return uoc;
          }
       }
       a.p(p1, "unit");
       uoc = this.t(Long.valueOf(p0), p1);
       goto label_0028 ;
    }
    public void put(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "8")) {
       }else {
          this.s(p0, null, null);
       }
       return;
    }
    public final void q(){
       if (PatchProxy.applyVoid(null, this, a.class, "22")) {
          return;
       }
       this.g.lock();
       this.e.lock();
       return;
    }
    public final void r(){
       if (PatchProxy.applyVoid(null, this, a.class, "23")) {
          return;
       }
       this.e.unlock();
       this.g.unlock();
       return;
    }
    public int remainingCapacity(){
       Object obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.l - this.c.get());
    }
    public Object remove(){
       c uoc = PatchProxy.apply(null, this, a.class, "29");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = this.w();
          if (uoc == null) {
             throw new NoSuchElementException();
          }
       }
       return uoc;
    }
    public final boolean remove(Object p0){
       a uoa;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "16");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = true;
       v2 = (p0 != null)? p0 instanceof c: 1;
       if (v2) {
          ConcurrentLinkedQueue obj1 = PatchProxy.applyOneRefs(p0, this, a.class, "15");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(p0 == null){
             this.q();
             a td = this.d;
             _monitor_enter(td);
             obj1 = this.d.get(p0.m());
             if (obj1 != null) {
                _monitor_exit(td);
                Iterator iterator = obj1.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      if (a.g(iterator.next().b(), p0)) {
                         iterator.remove();
                         if (this.c.getAndDecrement() == this.l) {
                            this.h.signal();
                         }
                         this.r();
                         break ;
                      }
                   }
                }
             }else {
                _monitor_exit(td);
             }
             this.r();
          }
          b = false;
          return b;
       }else {
          return false;
       }
    }
    public boolean removeAll(Collection p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "elements");
       this.q();
       int i = 0;
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          i = i | this.remove(iterator.next());
       }
       this.r();
       return i;
    }
    public boolean retainAll(Collection p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "elements");
       return this.removeAll(p0);
    }
    public final boolean s(c p0,Long p1,TimeUnit p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Objects.requireNonNull(p0);
       p1 = (p1 != null && p2 != null)? Long.valueOf(p2.toNanos(p1.longValue())): null;
       a tc = this.c;
       this.q();
       while (true) {
          if (tc.get() == this.l) {
             if (p1 != null) {
                if (p1.longValue() <= 0) {
                   this.r();
                   return false;
                }else {
                   p1 = Long.valueOf(this.h.awaitNanos(p1.longValue()));
                }
             }else {
                this.h.await();
             }
          }else {
             this.p(new a$a(p0, this.j.invoke().longValue()));
             int andIncrement = tc.getAndIncrement();
             if ((andIncrement + 1) < this.l) {
                this.h.signal();
             }
             this.r();
             if (!andIncrement) {
                this.D();
                break ;
             }
             break ;
          }
       }
       return true;
    }
    public final int size(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = PatchProxy.apply(null, this, a.class, "3");
       int i = (obj != patchProxyRe)? obj.intValue(): this.c.get();
       return i;
    }
    public final c t(Long p0,TimeUnit p1){
       c uoc;
       c obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       p0 = (p0 != null && p1 != null)? Long.valueOf(p1.toNanos(p0.longValue())): obj;
       a tc = this.c;
       this.q();
       while (true) {
          if (!tc.get()) {
             if (p0 != null) {
                if (p0.longValue() <= 0) {
                   this.r();
                   return obj;
                }else {
                   p0 = Long.valueOf(this.f.awaitNanos(p0.longValue()));
                }
             }else {
                this.f.await();
             }
          }else {
             uoc = this.n();
             int andDecrement = tc.getAndDecrement();
             if (andDecrement > 1) {
                this.f.signal();
             }
             this.r();
             if (andDecrement == this.l) {
                this.E();
                break ;
             }
             break ;
          }
       }
       return uoc;
    }
    public Object take(){
       c uoc = PatchProxy.apply(null, this, a.class, "11");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = this.t(null, null);
       }
       return uoc;
    }
    public Object[] toArray(){
       Object obj = PatchProxy.apply(null, this, a.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.a(this);
    }
    public Object[] toArray(Object[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.b(this, p0);
    }
    public boolean u(c p0){
       int andIncrement;
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Objects.requireNonNull(p0);
       obj = this.c;
       boolean b = false;
       if (obj.get() == this.l) {
          return b;
       }
       a$a uoa = new a$a(p0, this.j.invoke().longValue());
       this.q();
       if (obj.get() < this.l) {
          this.p(uoa);
          andIncrement = obj.getAndIncrement();
          if ((andIncrement + 1) < this.l) {
             this.h.signal();
          }
       }else {
          andIncrement = -1;
       }
       this.r();
       if (!andIncrement) {
          this.D();
       }
       if (andIncrement >= 0) {
          b = true;
       }
       return b;
    }
    public c v(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.c.get()) {
          return objArray;
       }
       this.q();
       if (this.c.get() > 0) {
          obj = this.d;
          _monitor_enter(obj);
          Queue queue = this.B();
          if (queue != null) {
             a$a uoa = queue.peek();
             if (uoa != null) {
                objArray = uoa.b();
             }
          }
          _monitor_exit(obj);
       }
       this.r();
       return objArray;
    }
    public c w(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (!obj.get()) {
          return objArray;
       }
       int i = -1;
       this.q();
       if (obj.get() > 0) {
          objArray = this.n();
          i = obj.getAndDecrement();
          if (i > 1) {
             this.f.signal();
          }
       }
       this.r();
       if (i == this.l) {
          this.E();
       }
       return objArray;
    }
}
