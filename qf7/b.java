package qf7.b;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
import java.util.ArrayList;
import java.lang.Object;
import com.kwai.performance.fluency.startup.scheduler.task.base.DependencyTask;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.List;
import kf7.a;
import java.lang.Class;
import java.util.Map;
import java.util.Collection;
import java.util.Iterator;
import trd.t0;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.util.concurrent.atomic.AtomicInteger;
import com.kwai.performance.fluency.startup.scheduler.task.base.BarrierTask;
import qf7.a;
import qrd.l1;
import java.lang.Long;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.ListIterator;

public final class b	// class@002272
{
    public static List a;
    public static Map b;
    public static final LinkedList c;
    public static final LinkedList d;
    public static final ReentrantLock e;
    public static final Condition f;
    public static BarrierTask g;
    public static List h;
    public static final b i;

    static {
       b.i = new b();
       b.c = new LinkedList();
       b.d = new LinkedList();
       ReentrantLock reentrantLoc = new ReentrantLock();
       b.e = reentrantLoc;
       b.f = reentrantLoc.newCondition();
       b.h = new ArrayList();
    }
    public void b(){
       super();
    }
    public static void a(DependencyTask p0,boolean p1,int p2,Object p3){
       List a;
       Map b;
       Iterator iterator;
       List list;
       int i = 2;
       int i1 = 1;
       if (p2 & i) {
          p1 = true;
       }
       a.q(p0, "task");
       CountDownLatch uCountDownLa = (p1)? new CountDownLatch(i1): null;
       ReentrantLock e = b.e;
       e.lock();
       a = b.a;
       if (a == null) {
          a.S("mTasks");
       }
       a.add(p0);
       if (a.h) {
          b = b.b;
          if (b == null) {
             a.S("mClass2TaskMap");
          }
          b.put(p0.getClass(), p0);
          if (i1 ^ p0.s().isEmpty()) {
             iterator = p0.s().iterator();
             while (iterator.hasNext()) {
                Class uClass = iterator.next();
                list = p0.u();
                Map b1 = b.b;
                if (b1 == null) {
                   a.S("mClass2TaskMap");
                }
                list.add(t0.K(b1, uClass));
             }
             p0.s().clear();
          }
       }
       iterator = p0.u().iterator();
       while (true) {
          if (iterator.hasNext()) {
             DependencyTask uDependencyT = iterator.next();
             if (a.e) {
                list = b.a;
                if (list == null) {
                   a.S("mTasks");
                }
                if (!list.contains(uDependencyT)) {
                   throw new IllegalArgumentException("fatal: exists missed instance on the "+p0.name()+"#dependencyTask\(\): "+uDependencyT);
                }
             }
             if (uDependencyT.r() == i) {
                continue ;
             }else {
                p0.h.getAndIncrement();
                uDependencyT.i.add(p0);
             }
          }else {
             i = p0.o().iterator();
             while (i.hasNext()) {
                BarrierTask uBarrierTask = i.next();
                uBarrierTask.u().add(p0);
                p0.i.add(uBarrierTask);
                uBarrierTask.h();
             }
             if (!p0.h.get()) {
                b.g(p0);
             }
             if (p1) {
                i = new a(p0, p1, uCountDownLa);
                a.q(i, "listener");
                DependencyTask m = p0.m;
                _monitor_enter(m);
                p0.m.add(i);
                _monitor_exit(m);
             }
             e.unlock();
             a.d();
             if (uCountDownLa != null) {
                uCountDownLa.await();
             }
          }
       }
       return;
    }
    public static final void c(Map p0){
       List a;
       a.q(p0, "taskTimeCostMap");
       a = b.a;
       if (a == null) {
          a.S("mTasks");
       }
       Iterator iterator = a.iterator();
       while (iterator.hasNext()) {
          DependencyTask uDependencyT = iterator.next();
          if (uDependencyT.H7()) {
             continue ;
          }else {
             Long longx = p0.get(uDependencyT.getClass().getName());
             long l = (longx != null)? longx.longValue(): 0;
             uDependencyT.e = l;
          }
       }
       ReentrantLock e = b.e;
       e.lock();
       CollectionsKt___CollectionsKt.a5(b.c);
       e.unlock();
       return;
    }
    public static final boolean e(boolean p0){
       return b.i.b(p0).isEmpty();
    }
    public static final DependencyTask f(boolean p0){
       ReentrantLock e = b.e;
       e.lock();
       LinkedList linkedList = b.i.b(p0);
       DependencyTask uDependencyT = (linkedList.isEmpty())? null: linkedList.removeFirst();
       e.unlock();
       return uDependencyT;
    }
    public static final void g(DependencyTask p0){
       int b;
       l1 a;
       a.q(p0, "newTask");
       ReentrantLock e = b.e;
       e.lock();
       b i = b.i;
       b = (p0.H7() || a.i)? true: false;
       LinkedList linkedList = i.b(b);
       if (linkedList.isEmpty()) {
          linkedList.addFirst(p0);
       }else if(p0.m(CollectionsKt___CollectionsKt.Y2(linkedList)) <= 0){
          linkedList.addLast(p0);
       }else {
          ListIterator listIterator = linkedList.listIterator(linkedList.size());
          while (true) {
             if (listIterator.hasPrevious()) {
                boolean b1 = (p0.m(listIterator.previous()) <= 0)? true: false;
                if (b1) {
                   b = listIterator.nextIndex();
                }
             }else {
                b = -1;
             }
             b = b + 1;
             if (b < 0) {
                linkedList.addFirst(p0);
             }else {
                linkedList.add(b, p0);
             }
          }
       }
       BarrierTask g = b.g;
       if (g != null) {
          if (p0.H7()) {
             b.h.add(0, p0);
          }else if(b.i.d(p0, g)){
             b.h.add(p0);
          }
          b.f.signal();
          a = l1.a;
       }
       e.unlock();
       return;
    }
    public final LinkedList b(boolean p0){
       LinkedList d = (p0)? b.d: b.c;
       return d;
    }
    public final boolean d(DependencyTask p0,DependencyTask p1){
       if (p0.i.isEmpty()) {
          return false;
       }
       Iterator iterator = p0.i.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          DependencyTask uDependencyT = iterator.next();
          if (a.g(uDependencyT, p1) || this.d(uDependencyT, p1)) {
             break ;
          }
       }
       return true;
    }
}
