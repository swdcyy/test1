package kotlinx.coroutines.debug.internal.DebugProbesImpl;
import java.text.SimpleDateFormat;
import java.lang.String;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import itd.b;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import msd.l;
import java.lang.Class;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.lang.Object;
import ftd.z1;
import java.lang.Throwable;
import java.util.List;
import java.lang.StackTraceElement;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import ltd.d0;
import java.util.Collection;
import java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock;
import kotlinx.coroutines.debug.a;
import java.lang.Boolean;
import qrd.l1;
import java.lang.IllegalStateException;
import dsd.c;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfo;
import kotlinx.coroutines.debug.internal.DebugProbesImpl$c;
import asd.c;
import kotlin.TypeCastException;
import qrd.n;
import java.lang.StringBuilder;
import ltd.a0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import wsd.m;
import java.util.Iterator;
import kotlin.coroutines.CoroutineContext;
import java.io.PrintStream;
import java.lang.Iterable;
import kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfo$1$2;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.debug.internal.DebugProbesImpl$a;
import java.util.Comparator;
import java.lang.System;
import java.lang.Long;
import kotlinx.coroutines.debug.internal.DebugProbesImpl$b;
import trd.u;
import kotlinx.coroutines.debug.internal.DebuggerInfo;
import kotlin.Result;
import java.lang.Thread;
import qrd.j0;
import kotlin.Pair;
import java.lang.Number;
import java.lang.Integer;
import qrd.r0;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlinx.coroutines.JobSupport;
import java.lang.reflect.Constructor;
import nsd.s0;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext$a;
import trd.s0;
import usd.q;
import java.util.LinkedHashMap;
import zsd.u;
import java.lang.Exception;
import java.util.ListIterator;
import kotlinx.coroutines.debug.internal.DebugProbesImpl$d;

public final class DebugProbesImpl	// class@0019af
{
    public static final SimpleDateFormat a;
    public static final Set b;
    public static final b c;
    public static final AtomicLongFieldUpdater d;
    public static final ReentrantReadWriteLock e;
    public static boolean f;
    public static boolean g;
    public static final l h;
    public static final ConcurrentHashMap i;
    public static int installations;
    public static final DebugProbesImpl j;

    static {
       DebugProbesImpl uDebugProbes = new DebugProbesImpl();
       DebugProbesImpl.j = uDebugProbes;
       DebugProbesImpl.a = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
       DebugProbesImpl.b = Collections.newSetFromMap(new ConcurrentHashMap());
       DebugProbesImpl.c = new b(0);
       DebugProbesImpl.e = new ReentrantReadWriteLock();
       DebugProbesImpl.f = true;
       DebugProbesImpl.g = true;
       DebugProbesImpl.h = uDebugProbes.l();
       DebugProbesImpl.i = new ConcurrentHashMap();
       DebugProbesImpl.d = AtomicLongFieldUpdater.newUpdater(b.class, "sequenceNumber");
    }
    public void DebugProbesImpl(){
       super();
    }
    public static void c(z1 p0){
    }
    public final List A(Throwable p0){
       ArrayList uArrayList;
       StackTraceElement stackTraceEl;
       StackTraceElement[] stackTrace = p0.getStackTrace();
       int len = stackTrace.length;
       int i = -1;
       int i1 = stackTrace.length + i;
       while (i1 >= 0) {
          if (a.g(stackTrace[i1].getClassName(), "kotlin.coroutines.jvm.internal.DebugProbesKt")) {
             i = i1;
             break ;
          }else {
             i1 = i1 - 1;
          }
       }
       int i2 = 0;
       String str = "Coroutine creation stacktrace";
       if (!DebugProbesImpl.f) {
          len = len - i;
          uArrayList = new ArrayList(len);
          for (; i2 < len; i2 = i2 + 1) {
             if (!i2) {
                stackTraceEl = d0.c(str);
             }else {
                int i3 = i2 + i;
                stackTraceEl = stackTrace[i3];
             }
             uArrayList.add(stackTraceEl);
          }
          return uArrayList;
       }else {
          uArrayList = new ArrayList(((len - i) + 1));
          uArrayList.add(d0.c(str));
          i = i + 1;
          len = len - 1;
          str = 1;
          while (i < len) {
             object oobject = stackTrace[i];
             if (!this.r(oobject)) {
                uArrayList.add(oobject);
             label_005e :
                str = 1;
             }else if(str){
                uArrayList.add(oobject);
                str = 0;
             }else {
                int i4 = i + 1;
                if (!this.r(stackTrace[i4])) {
                   uArrayList.add(oobject);
                   goto label_005e ;
                }
             }
             i = i + 1;
          }
          uArrayList.add(stackTrace[len]);
          return uArrayList;
       }
    }
    public final void B(boolean p0){
       DebugProbesImpl.g = p0;
    }
    public final void C(boolean p0){
       DebugProbesImpl.f = p0;
    }
    public final void D(){
       l1 ol1;
       ReentrantReadWriteLock e = DebugProbesImpl.e;
       ReentrantReadWriteLock$ReadLock readLock = e.readLock();
       int i = 0;
       int readHoldCoun = (!e.getWriteHoldCount())? e.getReadHoldCount(): 0;
       for (int i1 = 0; i1 < readHoldCoun; i1 = i1 + 1) {
          readLock.unlock();
       }
       ReentrantReadWriteLock$WriteLock writeLock = e.writeLock();
       writeLock.lock();
       if (DebugProbesImpl.j.q()) {
          DebugProbesImpl.installations = DebugProbesImpl.installations - 1;
          if (DebugProbesImpl.installations) {
             for (; i < readHoldCoun; i = i + 1) {
                readLock.lock();
             }
             writeLock.unlock();
             return;
          }else {
             DebugProbesImpl.b.clear();
             DebugProbesImpl.i.clear();
             if (a.c.b()) {
                for (; i < readHoldCoun; i = i + 1) {
                   readLock.lock();
                }
                writeLock.unlock();
                return;
             }else {
                l h = DebugProbesImpl.h;
                if (h != null) {
                   ol1 = h.invoke(Boolean.FALSE);
                }
                ol1 = l1.a;
                for (; i < readHoldCoun; i = i + 1) {
                   readLock.lock();
                }
                writeLock.unlock();
                return;
             }
          }
       }else {
          throw new IllegalStateException("Agent was not installed".toString());
       }
    }
    public final void E(c p0,String p1){
       ReentrantReadWriteLock$ReadLock readLock = DebugProbesImpl.e.readLock();
       readLock.lock();
       DebugProbesImpl j = DebugProbesImpl.j;
       if (!j.q()) {
          readLock.unlock();
          return;
       }else {
          ConcurrentHashMap i = DebugProbesImpl.i;
          DebugCoroutineInfo uDebugCorout = i.remove(p0);
          if (uDebugCorout == null) {
             DebugProbesImpl$c uoc = j.t(p0);
             if (uoc != null) {
                uoc = uoc.c;
                if (uoc != null) {
                   DebugCoroutineInfo c = uoc.c;
                   c uoc1 = (c != null)? j.z(c): null;
                   if (uoc1 != null) {
                      i.remove(uoc1);
                   }
                }
             }
             readLock.unlock();
             return;
          }
          if (p0 != null) {
             uDebugCorout.h(p1, p0);
             p0 = j.z(p0);
             if (p0 != null) {
                i.put(p0, uDebugCorout);
                readLock.unlock();
                return;
             }else {
                readLock.unlock();
                return;
             }
          }else {
             throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.Continuation<*>");
          }
       }
    }
    public final void F(c p0,String p1){
       if (a.g(p1, "RUNNING") && n.f.f(1, 3, 30)) {
          if (!p0 instanceof c) {
             p0 = null;
          }
          if (p0 != null) {
             this.E(p0, p1);
          }
          return;
       }else {
          DebugProbesImpl$c uoc = this.s(p0);
          if (uoc != null) {
             this.G(uoc, p0, p1);
          }
          return;
       }
    }
    public final void G(DebugProbesImpl$c p0,c p1,String p2){
       ReentrantReadWriteLock$ReadLock readLock = DebugProbesImpl.e.readLock();
       readLock.lock();
       if (!DebugProbesImpl.j.q()) {
          readLock.unlock();
          return;
       }else {
          p0.c.h(p2, p1);
          readLock.unlock();
          return;
       }
    }
    public final void a(z1 p0,Map p1,StringBuilder p2,String p3){
       DebugCoroutineInfo uDebugCorout = p1.get(p0);
       if (uDebugCorout == null) {
          if (!p0 instanceof a0) {
             p2 = p2+p3+this.k(p0)+10;
             p3 = p3+"\t";
          }
       }else {
          p2 = p2+p3+this.k(p0)+", continuation is "+uDebugCorout.f()+" at line "+CollectionsKt___CollectionsKt.p2(uDebugCorout.g())+10;
          p3 = p3+"\t";
       }
       Iterator iterator = p0.getChildren().iterator();
       while (iterator.hasNext()) {
          this.a(iterator.next(), p1, p2, p3);
       }
       return;
    }
    public final c b(c p0,c p1){
       if (!this.q()) {
          return p0;
       }
       DebugProbesImpl$c uoc = new DebugProbesImpl$c(p0, new DebugCoroutineInfo(p0.getContext(), p1, DebugProbesImpl.d.incrementAndGet(DebugProbesImpl.c)), p1);
       Set b = DebugProbesImpl.b;
       b.add(uoc);
       if (!this.q()) {
          b.clear();
       }
       return uoc;
    }
    public final void d(PrintStream p0){
       _monitor_enter(p0);
       DebugProbesImpl.j.f(p0);
       _monitor_exit(p0);
    }
    public final List e(){
       ReentrantReadWriteLock e = DebugProbesImpl.e;
       ReentrantReadWriteLock$ReadLock readLock = e.readLock();
       int i = 0;
       int readHoldCoun = (!e.getWriteHoldCount())? e.getReadHoldCount(): 0;
       for (int i1 = 0; i1 < readHoldCoun; i1 = i1 + 1) {
          readLock.unlock();
       }
       ReentrantReadWriteLock$WriteLock writeLock = e.writeLock();
       writeLock.lock();
       if (DebugProbesImpl.j.q()) {
          List list = SequencesKt___SequencesKt.V2(SequencesKt___SequencesKt.D2(SequencesKt___SequencesKt.b1(CollectionsKt___CollectionsKt.l1(DebugProbesImpl.b), DebugProbesImpl$dumpCoroutinesInfo$1$2.INSTANCE), new DebugProbesImpl$a()));
          for (; i < readHoldCoun; i = i + 1) {
             readLock.lock();
          }
          writeLock.unlock();
          return list;
       }else {
          throw new IllegalStateException("Debug probes are not installed".toString());
       }
    }
    public final void f(PrintStream p0){
       l1 a;
       ReentrantReadWriteLock e = DebugProbesImpl.e;
       ReentrantReadWriteLock$ReadLock readLock = e.readLock();
       int i = 0;
       int readHoldCoun = (!e.getWriteHoldCount())? e.getReadHoldCount(): 0;
       for (int i1 = 0; i1 < readHoldCoun; i1 = i1 + 1) {
          readLock.unlock();
       }
       ReentrantReadWriteLock$WriteLock writeLock = e.writeLock();
       writeLock.lock();
       if (DebugProbesImpl.j.q()) {
          p0.print("Coroutines dump "+DebugProbesImpl.a.format(Long.valueOf(System.currentTimeMillis())));
          Iterator iterator = SequencesKt___SequencesKt.D2(CollectionsKt___CollectionsKt.l1(DebugProbesImpl.b), new DebugProbesImpl$b()).iterator();
          while (iterator.hasNext()) {
             DebugProbesImpl$c uoc = iterator.next();
             DebugProbesImpl$c c = uoc.c;
             List list = c.g();
             DebugProbesImpl j = DebugProbesImpl.j;
             List list1 = j.h(c, list);
             String str = (a.g(c.f(), "RUNNING") && list1 == list)? c.f()+" \(Last suspension stacktrace, not an actual stacktrace\)": c.f();
             p0.print("\n\nCoroutine "+uoc.b+", state: "+str);
             if (list.isEmpty()) {
                p0.print("\n\tat "+d0.c("Coroutine creation stacktrace"));
                j.u(p0, c.e());
             }else {
                j.u(p0, list1);
             }
          }
          a = l1.a;
          for (; i < readHoldCoun; i = i + 1) {
             readLock.lock();
          }
          writeLock.unlock();
          return;
       }else {
          throw new IllegalStateException("Debug probes are not installed".toString());
       }
    }
    public final List g(){
       List list = this.e();
       ArrayList uArrayList = new ArrayList(u.Y(list, 10));
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(new DebuggerInfo(iterator.next()));
       }
       return uArrayList;
    }
    public final List h(DebugCoroutineInfo p0,List p1){
       DebugCoroutineInfo b = p0.b;
       if (!(a.g(p0.f(), "RUNNING") ^ 1) && b != null) {
          p0 = Result.constructor-impl(b.getStackTrace());
          if (Result.isFailure-impl(p0)) {
             p0 = null;
          }
          if (p0 != null) {
             boolean len = p0.length;
             int i = 0;
             int i1 = 0;
             while (true) {
                int i2 = -1;
                if (i1 < len) {
                   object oobject = p0[i1];
                   Number number = (a.g(oobject.getClassName(), "kotlin.coroutines.jvm.internal.BaseContinuationImpl") && (a.g(oobject.getMethodName(), "resumeWith") && a.g(oobject.getFileName(), "ContinuationImpl.kt")))? 1: null;
                   if (number) {
                   label_006b :
                      Pair pair = this.i(i1, p0, p1);
                      int i3 = pair.component1().intValue();
                      len = pair.component2().booleanValue();
                      if (i3 == i2) {
                         break ;
                      }else {
                         ArrayList uArrayList = new ArrayList(((((p1.size() + i1) - i3) - 1) - len));
                         i1 = i1 - len;
                         for (; i < i1; i = i + 1) {
                            uArrayList.add(p0[i]);
                         }
                         int i4 = p1.size();
                         for (i3 = i3 + 1; i3 < i4; i3 = i3 + 1) {
                            uArrayList.add(p1.get(i3));
                         }
                         return uArrayList;
                      }
                   }else {
                      i1 = i1 + 1;
                   }
                }else {
                   i1 = -1;
                   goto label_006b ;
                }
             }
             return p1;
          }
       }
    label_00b0 :
       return p1;
    }
    public final Pair i(int p0,StackTraceElement[] p1,List p2){
       int i = this.j((p0 - 1), p1, p2);
       if (i == -1) {
          return r0.a(Integer.valueOf(this.j((p0 - 2), p1, p2)), Boolean.TRUE);
       }
       return r0.a(Integer.valueOf(i), Boolean.FALSE);
    }
    public final int j(int p0,StackTraceElement[] p1,List p2){
       StackTraceElement stackTraceEl = ArraysKt___ArraysKt.ke(p1, p0);
       int i = -1;
       if (stackTraceEl != null) {
          Iterator iterator = p2.iterator();
          int i1 = 0;
          while (iterator.hasNext()) {
             StackTraceElement stackTraceEl1 = iterator.next();
             boolean b = (a.g(stackTraceEl1.getFileName(), stackTraceEl.getFileName()) && (a.g(stackTraceEl1.getClassName(), stackTraceEl.getClassName()) && a.g(stackTraceEl1.getMethodName(), stackTraceEl.getMethodName())))? true: false;
             if (b) {
                i = i1;
                break ;
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public final String k(z1 p0){
       String str = (p0 instanceof JobSupport)? p0.e1(): p0.toString();
       return str;
    }
    public final l l(){
       Object[] objArray = new Object[0];
       l obj = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(objArray);
       if (obj == null) {
          throw new TypeCastException("null cannot be cast to non-null type \(kotlin.Boolean\) -> kotlin.Unit");
       }
       obj = Result.constructor-impl(s0.q(obj, 1));
       if (Result.isFailure-impl(obj)) {
          obj = null;
       }
       return obj;
    }
    public final boolean m(){
       return DebugProbesImpl.g;
    }
    public final boolean n(){
       return DebugProbesImpl.f;
    }
    public final String o(z1 p0){
       LinkedHashMap obj;
       CoroutineContext$a obj1;
       ReentrantReadWriteLock e = DebugProbesImpl.e;
       ReentrantReadWriteLock$ReadLock readLock = e.readLock();
       int i = 0;
       int readHoldCoun = (!e.getWriteHoldCount())? e.getReadHoldCount(): 0;
       for (int i1 = 0; i1 < readHoldCoun; i1 = i1 + 1) {
          readLock.unlock();
       }
       ReentrantReadWriteLock$WriteLock writeLock = e.writeLock();
       writeLock.lock();
       if (DebugProbesImpl.j.q()) {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = DebugProbesImpl.b.iterator();
          while (iterator.hasNext()) {
             obj = iterator.next();
             obj1 = (obj.b.getContext().get(z1.p0) != null)? 1: null;
             if (obj1) {
                uArrayList.add(obj);
             }
          }
          obj = new LinkedHashMap(q.n(s0.j(u.Y(uArrayList, 10)), 16));
          iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             Object obj2 = iterator.next();
             obj1 = obj2.b.getContext().get(z1.p0);
             if (obj1 == null) {
                a.L();
             }
             obj.put(obj1, obj2.c);
          }
          StringBuilder str = "";
          DebugProbesImpl.j.a(p0, obj, str, "");
          String str1 = str;
          a.h(str1, "StringBuilder\(\).apply\(builderAction\).toString\(\)");
          for (; i < readHoldCoun; i = i + 1) {
             readLock.lock();
          }
          writeLock.unlock();
          return str1;
       }else {
          throw new IllegalStateException("Debug probes are not installed".toString());
       }
    }
    public final void p(){
       l1 ol1;
       ReentrantReadWriteLock e = DebugProbesImpl.e;
       ReentrantReadWriteLock$ReadLock readLock = e.readLock();
       int i = 0;
       int readHoldCoun = (!e.getWriteHoldCount())? e.getReadHoldCount(): 0;
       for (int i1 = 0; i1 < readHoldCoun; i1 = i1 + 1) {
          readLock.unlock();
       }
       ReentrantReadWriteLock$WriteLock writeLock = e.writeLock();
       writeLock.lock();
       int i2 = 1;
       DebugProbesImpl.installations = DebugProbesImpl.installations + i2;
       if (DebugProbesImpl.installations > i2) {
          for (; i < readHoldCoun; i = i + 1) {
             readLock.lock();
          }
          writeLock.unlock();
          return;
       }else if(a.c.b()){
          for (; i < readHoldCoun; i = i + 1) {
             readLock.lock();
          }
          writeLock.unlock();
          return;
       }else {
          l h = DebugProbesImpl.h;
          if (h != null) {
             ol1 = h.invoke(Boolean.TRUE);
          }
          ol1 = l1.a;
          for (; i < readHoldCoun; i = i + 1) {
             readLock.lock();
          }
          writeLock.unlock();
          return;
       }
    }
    public final boolean q(){
       boolean b = (DebugProbesImpl.installations > 0)? true: false;
       return b;
    }
    public final boolean r(StackTraceElement p0){
       return u.q2(p0.getClassName(), "kotlinx.coroutines", false, 2, null);
    }
    public final DebugProbesImpl$c s(c p0){
       DebugProbesImpl$c uoc = null;
       if (!p0 instanceof c) {
          p0 = uoc;
       }
       if (p0 != null) {
          uoc = this.t(p0);
       }
       return uoc;
    }
    public final DebugProbesImpl$c t(c p0){
       while (true) {
          if (p0 instanceof DebugProbesImpl$c) {
             break ;
          }else {
             p0 = p0.getCallerFrame();
             if (p0 != null) {
                continue ;
             }else {
                p0 = null;
                break ;
             }
          }
       }
       return p0;
    }
    public final void u(PrintStream p0,List p1){
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          p0.print("\n\tat "+iterator.next());
       }
       return;
    }
    public final void v(DebugProbesImpl$c p0){
       DebugProbesImpl.b.remove(p0);
       DebugCoroutineInfo c = p0.c.c;
       if (c != null) {
          c uoc = this.z(c);
          if (uoc != null) {
             DebugProbesImpl.i.remove(uoc);
          }
       }
       return;
    }
    public final c w(c p0){
       if (!this.q()) {
          return p0;
       }
       if (this.s(p0) != null) {
          return p0;
       }
       c uoc = null;
       if (DebugProbesImpl.g) {
          List list = this.A(new Exception());
          if (!list.isEmpty()) {
             ListIterator listIterator = list.listIterator(list.size());
             while (listIterator.hasPrevious()) {
                uoc = new DebugProbesImpl$d(listIterator.previous(), uoc);
             }
          }
       }
       return this.b(p0, uoc);
    }
    public final void x(c p0){
       this.F(p0, "RUNNING");
    }
    public final void y(c p0){
       this.F(p0, "SUSPENDED");
    }
    public final c z(c p0){
       while (true) {
          p0 = p0.getCallerFrame();
          if (p0 == null) {
             return null;
          }
          if (p0.getStackTraceElement() != null) {
             break ;
          }
       }
       return p0;
    }
}
