package bl0.d;
import bl0.a;
import android.content.Context;
import java.lang.Object;
import java.util.LinkedList;
import kf7.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import o56.c;
import o56.a;
import bl0.b;
import java.util.concurrent.ExecutorService;
import t45.c;
import wkd.b;
import com.yxcorp.gifshow.w;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import rf7.a;
import java.util.Objects;
import android.os.Looper;
import com.kwai.performance.fluency.startup.scheduler.task.base.DependencyTask;
import tf7.b;
import com.kwai.performance.fluency.startup.scheduler.task.base.BarrierTask;
import java.lang.Boolean;
import bl0.c;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import java.util.Iterator;
import qf7.b;
import java.util.concurrent.CopyOnWriteArrayList;
import com.kwai.performance.fluency.startup.scheduler.analyser.TaskDependenciesAnalyser;
import java.io.File;
import kotlin.io.FilesKt__UtilsKt;
import java.lang.Iterable;
import java.nio.charset.Charset;
import kotlin.io.FilesKt__FileReadWriteKt;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.Result;
import qrd.l1;
import java.lang.Throwable;
import qrd.j0;
import nsd.s0;
import trd.u;
import trd.s0;
import usd.q;
import java.util.LinkedHashMap;
import java.util.Map;
import trd.t0;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.util.concurrent.atomic.AtomicInteger;
import mf7.e;
import lf7.b;
import com.kwai.performance.fluency.startup.scheduler.analyser.TaskCostAnalyser$readAnalysisResult$1;
import msd.a;
import java.util.ArrayList;
import com.google.gson.Gson;
import lf7.c;
import java.lang.reflect.Type;
import el.a;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Set;
import java.lang.Integer;
import java.util.Map$Entry;
import java.lang.Number;
import sf7.c;
import lf7.d;
import lf7.e;
import com.kwai.performance.fluency.startup.scheduler.analyser.TaskDependenciesAnalyser$initTasks$6;
import java.util.NoSuchElementException;

public class d implements a	// class@000305
{
    public final List a;

    public void d(Context p0){
       ExecutorService a;
       super();
       this.a = new LinkedList();
       a.q(p0, "context");
       a.d = p0;
       a.e = a.a().c();
       a.g = a.a().c();
       a.h = true;
       a = b.a;
       a.q(a, "executorService");
       a.b = a;
       a = c.c();
       a.q(a, "realTimeExecutorService");
       a.c = a;
       a.f = b.a(-1343064608).v("smart_analysis");
    }
    public List a(){
       return this.a;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       a t = a.t;
       Objects.requireNonNull(t);
       t.A((a.g(Looper.myLooper(), Looper.getMainLooper()) ^ 0x01));
       t.name();
       new b(t.r, 0).a();
       return;
    }
    public void d(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "5")) {
          return;
       }
       a.i = p0 ^ 0x01;
       return;
    }
    public a m(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          this.a.add(p0);
          a.a(p0);
       }
       return this;
    }
    public void n(Collection p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "4")) {
          return;
       }
       boolean b = false;
       int i = 0;
       while (i < p0.size()) {
          if (p0.get(i) == null) {
             p0.remove(i);
             i = i - 1;
          }
          i = i + 1;
       }
       this.a.addAll(p0);
       a.q(p0, "tasks");
       if (a.j) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             b.a(iterator.next(), b, 2, null);
          }
       }else {
          a.a.addAll(p0);
       }
       return;
    }
    public void start(){
       CopyOnWriteArrayList a;
       Iterator iterator;
       Iterator obj;
       DependencyTask uDependencyT;
       int i1;
       b e;
       Iterator iterator2;
       String str2;
       Iterator iterator3;
       DependencyTask obj1;
       Object[] objArray2;
       List list3;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "1")) {
          return;
       }
       if (!a.j) {
          boolean b = true;
          a.j = b;
          TaskDependenciesAnalyser b1 = TaskDependenciesAnalyser.b;
          a = a.a;
          Objects.requireNonNull(b1);
          String str = "tasks";
          a.q(a, str);
          if (a.g) {
             if (!b1.j()) {
                a.g = false;
             }else if(!b1.k()){
                File uFile1 = b1.f();
                String str3 = (uFile1 != null)? FilesKt__UtilsKt.a0(uFile1): objArray;
                iterator3 = a.iterator();
                while (true) {
                   if (iterator3.hasNext()) {
                      objArray2 = iterator3.next();
                      if (!a.g(objArray2.getClass().getName(), str3)) {
                         continue ;
                      }
                   }else {
                      objArray2 = objArray;
                   }
                   if (objArray2 != null) {
                      uFile1 = TaskDependenciesAnalyser.b.f();
                      if (uFile1 != null && uFile1.exists()) {
                         String[] stringArray = new String[]{";"};
                         list3 = StringsKt__StringsKt.H4(FilesKt__FileReadWriteKt.z(uFile1, objArray, b, objArray), stringArray, false, 0, 6, null);
                      }else {
                         list3 = CollectionsKt__CollectionsKt.E();
                      }
                      iterator = list3.iterator();
                      while (true) {
                         if (iterator.hasNext()) {
                            Class uClass1 = Class.forName(iterator.next());
                            if (DependencyTask.class.isAssignableFrom(uClass1)) {
                               objArray2.c(uClass1);
                            }
                            Throwable obj2 = Result.constructor-impl(l1.a);
                            obj2 = Result.exceptionOrNull-impl(obj2);
                            if (obj2 != null && a.e) {
                            label_00ce :
                               throw obj2;
                            }
                            continue ;
                         }
                      }
                   }
                }
             }
          }
          a = a.a;
          Objects.requireNonNull(b.i);
          a.q(a, str);
          b.a = s0.g(a);
          int i = 10;
          if (a.h) {
             LinkedHashMap linkedHashMa = new LinkedHashMap(q.n(s0.j(u.Y(a, i)), 16));
             iterator = a.iterator();
             while (iterator.hasNext()) {
                obj = iterator.next();
                linkedHashMa.put(obj.getClass(), obj);
             }
             b.b = s0.k(linkedHashMa);
             iterator = a.iterator();
             while (iterator.hasNext()) {
                uDependencyT = iterator.next();
                i1 = uDependencyT.s().isEmpty() ^ b;
                if (i1) {
                   obj = uDependencyT.s().iterator();
                   while (obj.hasNext()) {
                      Class uClass = obj.next();
                      List list = uDependencyT.u();
                      Map b2 = b.b;
                      if (b2 == null) {
                         a.S("mClass2TaskMap");
                      }
                      list.add(t0.K(b2, uClass));
                   }
                   uDependencyT.s().clear();
                }else {
                   continue ;
                }
             }
          }
          iterator = a.iterator();
          while (iterator.hasNext()) {
             DependencyTask uDependencyT1 = iterator.next();
             Iterator iterator1 = uDependencyT1.u().iterator();
             while (iterator1.hasNext()) {
                iterator1.next().i.add(uDependencyT1);
             }
             iterator1 = uDependencyT1.o().iterator();
             while (iterator1.hasNext()) {
                BarrierTask uBarrierTask = iterator1.next();
                uBarrierTask.u().add(uDependencyT1);
                uDependencyT1.i.add(uBarrierTask);
             }
             int i2 = uDependencyT1.u().size();
             if (i2 > 0) {
                uDependencyT1.h.set(i2);
             }else {
                b.g(uDependencyT1);
                continue ;
             }
          }
          if (a.e) {
             Objects.requireNonNull(e.a);
          }
          if (a.f) {
             e = b.e;
             a = a.a;
             Objects.requireNonNull(e);
             a.q(a, str);
             if (a.f) {
                AtomicInteger c = b.c;
                if (a instanceof Collection && a.isEmpty()) {
                   i1 = 0;
                }else {
                   iterator3 = a.iterator();
                   i1 = 0;
                   while (iterator3.hasNext()) {
                      int i6 = iterator3.next().H7() ^ b;
                      if (i6) {
                         i1 = i1 + 1;
                         if (i1 < 0) {
                            CollectionsKt__CollectionsKt.V();
                         }else {
                            continue ;
                         }
                      }else {
                         continue ;
                      }
                   }
                }
                c.set(i1);
                e.c(TaskCostAnalyser$readAnalysisResult$1.INSTANCE);
             }
          }
          if (a.g) {
             b1 = TaskDependenciesAnalyser.b;
             a = a.a;
             Objects.requireNonNull(b1);
             a.q(a, str);
             if (a.g) {
                if (!b1.j()) {
                   a.g = false;
                }else if(!b1.k()){
                   str = (b1.h().exists())? FilesKt__FileReadWriteKt.z(b1.h(), objArray, b, objArray): objArray;
                   String str1 = (b1.g().exists())? FilesKt__FileReadWriteKt.z(b1.g(), objArray, b, objArray): objArray;
                   ArrayList uArrayList = (!(FilesKt__FileReadWriteKt.z(b1.d(), objArray, b, objArray)).length())? 1: null;
                   if (uArrayList) {
                      uArrayList = new ArrayList(u.Y(a, i));
                      iterator2 = a.iterator();
                      while (iterator2.hasNext()) {
                         uArrayList.add(iterator2.next().getClass().getName());
                      }
                      str2 = new Gson().q(uArrayList);
                      a.h(str2, "it");
                      FilesKt__FileReadWriteKt.G(TaskDependenciesAnalyser.b.d(), str2, objArray, 2, objArray);
                   }
                   List list1 = new Gson().i(FilesKt__FileReadWriteKt.z(b1.d(), objArray, b, objArray), new c().getType());
                   if ((a.g(str1, str) ^ b) && str != null) {
                      TaskDependenciesAnalyser.b.l(str, false);
                   }
                   File uFile = (str == null || !str.length())? 1: null;
                   if (uFile) {
                      a.h(list1, "allTaskNames");
                      str = CollectionsKt___CollectionsKt.p2(list1);
                   }else {
                      int i5 = list1.indexOf(str);
                      Object[] objArray1 = (i5 >= (list1.size() - b))? objArray: list1.get((i5 + b));
                   }
                   uFile = b1.h();
                   str2 = (str != null)? str: "";
                   FilesKt__FileReadWriteKt.G(uFile, str2, objArray, 2, objArray);
                   if (str != null) {
                      iterator3 = a.iterator();
                      while (true) {
                         if (!iterator3.hasNext()) {
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                         }
                         uDependencyT = iterator3.next();
                         if (a.g(uDependencyT.getClass().getName(), str)) {
                            LinkedHashMap linkedHashMa1 = new LinkedHashMap();
                            iterator3 = b1.a(uDependencyT).iterator();
                            while (iterator3.hasNext()) {
                               DependencyTask uDependencyT2 = iterator3.next();
                               linkedHashMa1.put(uDependencyT2, Integer.valueOf(uDependencyT2.u().size()));
                            }
                            LinkedHashMap linkedHashMa2 = new LinkedHashMap();
                            iterator2 = linkedHashMa1.entrySet().iterator();
                            while (iterator2.hasNext()) {
                               Map$Entry uEntry = iterator2.next();
                               obj1 = (!uEntry.getValue().intValue())? 1: null;
                               if (obj1) {
                                  linkedHashMa2.put(uEntry.getKey(), uEntry.getValue());
                               }else {
                                  continue ;
                               }
                            }
                            LinkedList linkedList = new LinkedList();
                            iterator3 = linkedHashMa2.entrySet().iterator();
                            while (iterator3.hasNext()) {
                               linkedList.add(iterator3.next().getKey());
                            }
                            LinkedList linkedList1 = new LinkedList();
                            int i3 = linkedList.isEmpty() ^ b;
                            while (i3) {
                               DependencyTask uDependencyT3 = linkedList.removeFirst();
                               linkedList1.add(uDependencyT3);
                               Iterator iterator4 = uDependencyT3.i.iterator();
                               while (iterator4.hasNext()) {
                                  obj1 = iterator4.next();
                                  Integer integer = linkedHashMa1.get(obj1);
                                  if (integer != null) {
                                     int i4 = integer.intValue() - b;
                                     linkedHashMa1.put(obj1, Integer.valueOf(i4));
                                     integer = linkedHashMa1.get(obj1);
                                     if (integer != null && !integer.intValue()) {
                                        linkedList.add(obj1);
                                     }else {
                                        continue ;
                                     }
                                  }else {
                                     continue ;
                                  }
                               }
                            }
                            uArrayList = new ArrayList(u.Y(linkedList1, i));
                            iterator2 = linkedList1.iterator();
                            while (iterator2.hasNext()) {
                               uArrayList.add(iterator2.next().name());
                            }
                            uArrayList.toString();
                            str2 = FilesKt__FileReadWriteKt.z(b1.i(), objArray, b, objArray);
                            Gson gson = new Gson();
                            ArrayList uArrayList1 = new ArrayList(u.Y(linkedList1, i));
                            Iterator iterator5 = linkedList1.iterator();
                            while (iterator5.hasNext()) {
                               uArrayList1.add(iterator5.next().name());
                            }
                            List list2 = gson.i(uArrayList1.toString(), new d().getType());
                            Map map = new Gson().i(str2, new e().getType());
                            if (map != null) {
                               map = t0.J0(map);
                               if (map != null) {
                               label_04b3 :
                                  a.h(list2, "allAncestorList");
                                  map.put(uDependencyT.name(), list2);
                                  str2 = new Gson().q(map);
                                  a.h(str2, "Gson\(\).toJson\(resultMap\)");
                                  FilesKt__FileReadWriteKt.G(b1.i(), str2, objArray, 2, objArray);
                                  if (uDependencyT instanceof BarrierTask) {
                                     b1.c(uDependencyT);
                                     b1.l(str, b);
                                     a.g = false;
                                  }else {
                                     b1.b(linkedList1, new TaskDependenciesAnalyser$initTasks$6(uDependencyT, str));
                                  }
                               }
                            }
                            linkedHashMa1 = new LinkedHashMap();
                            goto label_04b3 ;
                         }else {
                            continue ;
                         }
                      }
                   }
                }
             }
          }
          a.d();
       }
       return;
    }
}
