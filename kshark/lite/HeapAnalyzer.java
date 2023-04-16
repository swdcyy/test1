package kshark.lite.HeapAnalyzer;
import kshark.lite.OnAnalysisProgressListener;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import kshark.lite.HeapAnalyzer$b;
import kshark.lite.HeapObject;
import kshark.lite.HeapObject$HeapClass;
import kshark.lite.LeakTraceObject$ObjectType;
import kshark.lite.HeapObject$c;
import kshark.lite.HeapObject$d;
import java.lang.Long;
import kotlin.Pair;
import kshark.lite.LeakTraceObject;
import java.lang.Integer;
import java.util.Set;
import kshark.lite.LeakTraceObject$LeakingStatus;
import java.util.Collection;
import kshark.lite.HeapAnalyzer$a;
import kshark.lite.OnAnalysisProgressListener$Step;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kshark.lite.HeapAnalyzer$d;
import std.n$a;
import kshark.lite.LeakTraceReference;
import kshark.lite.LeakTraceReference$ReferenceType;
import kshark.lite.b;
import kshark.lite.LeakTrace;
import kshark.lite.LeakTrace$GcRootType;
import std.n$c;
import rtd.e;
import java.util.Objects;
import rtd.e$e;
import rtd.e$f;
import rtd.e$d;
import rtd.e$i;
import rtd.e$k;
import rtd.e$l;
import rtd.e$h;
import rtd.e$m;
import rtd.e$g;
import kotlin.collections.CollectionsKt___CollectionsKt;
import std.n$b;
import rtd.r;
import kshark.lite.ReferencePattern;
import std.o;
import qrd.r0;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.util.Map$Entry;
import kshark.lite.ApplicationLeak;
import kshark.lite.LibraryLeak;
import kshark.lite.HeapAnalyzer$c;
import std.j;
import rtd.l$a$a$a$a;
import kshark.lite.HprofHeapGraph;
import kshark.lite.PrimitiveType;
import kshark.lite.PrimitiveType$a;
import trd.t0;
import java.lang.Number;
import usd.q;
import std.j$c;
import utd.g;
import nsd.u;
import kshark.lite.internal.PathFinder$sortedGcRoots$rootClassName$1;
import std.k;
import msd.l;
import java.util.Comparator;
import kshark.lite.HeapObject$b;
import std.n$c$b;
import std.n;
import kshark.lite.internal.PathFinder$enqueueGcRoots$$inlined$forEach$lambda$1;
import msd.a;
import rtd.z;
import rtd.n;
import std.n$a$a;
import std.n$a$b;
import std.n$c$a;
import kotlin.NoWhenBranchMatchedException;
import java.util.Deque;
import wsd.m;
import kshark.lite.HeapObject$HeapClass$readStaticFields$1;
import kotlin.sequences.SequencesKt___SequencesKt;
import rtd.h;
import rtd.i;
import rtd.d0$i;
import std.d;
import rtd.l$a$a$b;
import std.j$a;
import std.l;
import trd.x;
import rtd.l$a$a$c;
import std.j$b;
import trd.e1;
import rtd.t;
import rtd.g;
import java.lang.Enum;
import java.util.LinkedHashSet;
import kshark.lite.HeapAnalyzer$e$b;
import rtd.a0;
import rtd.a0$a;
import trd.t;
import kotlin.jvm.internal.Ref$IntRef;
import kshark.lite.HeapAnalyzer$computeLeakStatuses$nextNotLeakingIndex$1;
import kotlin.sequences.SequencesKt__SequencesKt;
import java.util.NoSuchElementException;
import kshark.lite.HeapAnalyzer$computeLeakStatuses$previousLeakingIndex$1;
import kshark.lite.HeapAnalyzer$e;
import kshark.lite.HeapAnalyzer$e$a;
import java.lang.CharSequence;
import kshark.lite.HeapAnalyzer$updateTrie$childNode$1;

public final class HeapAnalyzer	// class@001b88
{
    public final OnAnalysisProgressListener a;

    public void HeapAnalyzer(OnAnalysisProgressListener p0){
       a.p(p0, "listener");
       super();
       this.a = p0;
    }
    public final List a(List p0,Map p1){
       LeakTraceObject$ObjectType cLASS;
       Map map = p1;
       ArrayList uArrayList = new ArrayList(u.Y(p0, 10));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          HeapAnalyzer$b uob = iterator.next();
          HeapObject heapObject = uob.a();
          String str = this.e(heapObject);
          if (heapObject instanceof HeapObject$HeapClass) {
             cLASS = LeakTraceObject$ObjectType.CLASS;
          }else if(heapObject instanceof HeapObject$c || heapObject instanceof HeapObject$d){
             cLASS = LeakTraceObject$ObjectType.ARRAY;
          }else {
             cLASS = LeakTraceObject$ObjectType.INSTANCE;
          }
          LeakTraceObject$ObjectType objectType = cLASS;
          Integer integer = null;
          Pair pair = (map)? map.get(Long.valueOf(uob.a().d())): integer;
          long l = heapObject.d();
          HeapAnalyzer$b d = uob.d;
          HeapAnalyzer$b b = uob.b;
          uob = uob.c;
          Integer integer1 = (pair != null)? pair.getFirst(): integer;
          if (pair != null) {
             integer = pair.getSecond();
          }
          LeakTraceObject leakTraceObj = new LeakTraceObject(l, objectType, str, d, b, uob, integer1, integer);
          uArrayList.add(v15);
       }
       return uArrayList;
    }
    public final Pair b(HeapAnalyzer$a p0,List p1,List p2,Map p3){
       Map obj2;
       int i4;
       String str;
       e uoe;
       LeakTrace$GcRootType jNI_GLOBAL;
       n$b uob;
       r or;
       HeapAnalyzer heapAnalyzer = this;
       heapAnalyzer.a.a(OnAnalysisProgressListener$Step.BUILDING_LEAK_TRACES);
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       LinkedHashMap linkedHashMa1 = new LinkedHashMap();
       Iterator iterator = p1.iterator();
       int i = 0;
       while (true) {
          if (iterator.hasNext()) {
             Pair obj = iterator.next();
             int i1 = i + 1;
             if (i < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             List list = heapAnalyzer.a(p2.get(i), null);
             List list1 = obj.a();
             ArrayList uArrayList = new ArrayList(u.Y(list1, 10));
             Iterator iterator1 = list1.iterator();
             int i2 = 0;
             while (iterator1.hasNext()) {
                Object obj1 = iterator1.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                   CollectionsKt__CollectionsKt.W();
                }
                List list2 = list;
                obj2 = list2.get(i2);
                LeakTraceReference$ReferenceType referenceTyp = obj1.f();
                if (obj1.c()) {
                   i4 = i1;
                   HeapObject$HeapClass heapClass = p0.a().u(obj1.c()).a();
                   a.m(heapClass);
                   str = heapClass.j();
                }else {
                   i4 = i1;
                   str = list2.get(i2).getClassName();
                }
                uArrayList.add(new LeakTraceReference(obj2, referenceTyp, str, obj1.e()));
                i2 = i3;
                i1 = i4;
                obj2 = null;
             }
             i4 = i1;
             uoe = obj.b().c();
             Objects.requireNonNull(LeakTrace$GcRootType.Companion);
             a.p(uoe, "gcRoot");
             if (uoe instanceof e$e) {
                jNI_GLOBAL = LeakTrace$GcRootType.JNI_GLOBAL;
             }else if(uoe instanceof e$f){
                jNI_GLOBAL = LeakTrace$GcRootType.JNI_LOCAL;
             }else if(uoe instanceof e$d){
                jNI_GLOBAL = LeakTrace$GcRootType.JAVA_FRAME;
             }else if(uoe instanceof e$i){
                jNI_GLOBAL = LeakTrace$GcRootType.NATIVE_STACK;
             }else if(uoe instanceof e$k){
                jNI_GLOBAL = LeakTrace$GcRootType.STICKY_CLASS;
             }else if(uoe instanceof e$l){
                jNI_GLOBAL = LeakTrace$GcRootType.THREAD_BLOCK;
             }else if(uoe instanceof e$h){
                jNI_GLOBAL = LeakTrace$GcRootType.MONITOR_USED;
             }else if(uoe instanceof e$m){
                jNI_GLOBAL = LeakTrace$GcRootType.THREAD_OBJECT;
             }else if(uoe instanceof e$g){
                jNI_GLOBAL = LeakTrace$GcRootType.JNI_MONITOR;
             }else {
             }
             LeakTrace leakTrace = new LeakTrace(jNI_GLOBAL, uArrayList, CollectionsKt___CollectionsKt.Y2(list));
             if (obj.b() instanceof n$b) {
                uob = obj.b();
             }else {
                Iterator iterator2 = obj.a().iterator();
                while (true) {
                   if (iterator2.hasNext()) {
                      Object obj3 = iterator2.next();
                      if (obj3 instanceof n$b) {
                         obj2 = obj3;
                      }
                   }else {
                      obj2 = null;
                   }
                   uob = obj2;
                }
             }
             if (uob != null) {
                or = uob.a();
                String str1 = o.a(or.a().toString());
                obj = linkedHashMa1.get(str1);
                if (obj == null) {
                   obj = r0.a(or, new ArrayList());
                   linkedHashMa1.put(str1, obj);
                }
                obj.getSecond().add(leakTrace);
             }else {
                str = leakTrace.getSignature();
                ArrayList uArrayList1 = linkedHashMa.get(str);
                if (uArrayList1 == null) {
                   uArrayList1 = new ArrayList();
                   linkedHashMa.put(str, uArrayList1);
                }
                uArrayList1.add(leakTrace);
             }
             heapAnalyzer = this;
             i = i4;
          }else {
             ArrayList uArrayList2 = new ArrayList(linkedHashMa.size());
             Iterator iterator3 = linkedHashMa.entrySet().iterator();
             while (iterator3.hasNext()) {
                uArrayList2.add(new ApplicationLeak(iterator3.next().getValue()));
             }
             ArrayList uArrayList3 = new ArrayList(linkedHashMa1.size());
             Iterator iterator4 = linkedHashMa1.entrySet().iterator();
             while (iterator4.hasNext()) {
                Pair value = iterator4.next().getValue();
                or = value.component1();
                ReferencePattern referencePat = or.a();
                uArrayList3.add(new LibraryLeak(value.component2(), referencePat, or.b));
             }
             return r0.a(uArrayList2, uArrayList3);
          }
       }
       throw new IllegalStateException("Unexpected gc root "+uoe);
    }
    public final HeapAnalyzer$c c(HeapAnalyzer$a p0,Set p1){
       int i3;
       int i5;
       ArrayList uArrayList;
       n obj2;
       Pair pair;
       Map$Entry obj3;
       HeapObject$b uob;
       Iterator obj4;
       StringBuilder str;
       z oz;
       n$a$a uoa$a;
       n$a$b uoa$b;
       String str2;
       n on;
       String str3;
       n$a$b uoa$b1;
       ArrayList uArrayList3;
       j$c uoc2;
       int i8;
       Iterator iterator5;
       ArrayList obj5;
       Iterator iterator6;
       long l6;
       j$c uoc3;
       int i11;
       int i12;
       HeapObject$b uob1;
       n on1;
       int l6;
       byte[] uobyteArray1;
       Iterator iterator7;
       n$a$a uoa$a1;
       ArrayList uArrayList5;
       long l10;
       Iterator obj6;
       List this;
       ArrayList uArrayList7;
       List list1;
       int i13;
       Iterator obj7;
       Map map3;
       boolean b2;
       Pair pair2;
       LeakTraceObject$LeakingStatus leakingStatu1;
       LeakTraceObject$LeakingStatus nOT_LEAKING;
       Pair pair3;
       List list2;
       j$c obj = p0;
       z obj1 = p1;
       a.p(obj, "$this$findLeaks");
       a.p(obj1, "leakingObjectIds");
       j oj = new j(p0.a(), this.a, obj.b);
       HeapAnalyzer$a c = obj.c;
       a.p(obj1, "leakingObjectIds");
       oj.h.a(OnAnalysisProgressListener$Step.FINDING_PATHS_TO_RETAINED_OBJECTS);
       HeapObject$HeapClass heapClass = oj.g.g("java.lang.Object");
       j g = oj.g;
       int i = 2;
       int i1 = 0;
       if (heapClass != null) {
          Iterator iterator = heapClass.l().iterator();
          boolean i2 = 0;
          while (iterator.hasNext()) {
             l$a$a$a$a uoa$a$a$a = iterator.next();
             i3 = (uoa$a$a$a.a() == i)? heapClass.e.c(): t0.K(PrimitiveType.Companion.a(), Integer.valueOf(uoa$a$a$a.a())).intValue();
             i2 = i2 + i3;
          }
          int i4 = g.c() + PrimitiveType.INT.getByteSize();
          if (i2 == i4) {
             i5 = i4;
          label_0085 :
             long l = (heapClass != null)? heapClass.d(): -1;
             long l1 = l;
             int i6 = q.n((oj.g.j() / i), 4);
             g og = new g(i1, 1, null);
             og.d(p1.size());
             Iterator iterator1 = p1.iterator();
             while (iterator1.hasNext()) {
                og.a(iterator1.next().longValue());
                uArrayList = 1;
             }
             j$c uoc = new j$c(og, i5, c, l1, i6);
             PathFinder$sortedGcRoots$rootClassName$1 iNSTANCE = PathFinder$sortedGcRoots$rootClassName$1.INSTANCE;
             uArrayList = new ArrayList();
             iterator = oj.g.e().iterator();
             while (iterator.hasNext()) {
                obj2 = iterator.next();
                if (oj.g.f(obj2.a())) {
                   uArrayList.add(obj2);
                }
             }
             ArrayList uArrayList1 = new ArrayList(u.Y(uArrayList, 10));
             Iterator iterator2 = uArrayList.iterator();
             while (iterator2.hasNext()) {
                e uoe = iterator2.next();
                uArrayList1.add(r0.a(oj.g.u(uoe.a()), uoe));
             }
             LinkedHashMap linkedHashMa = new LinkedHashMap();
             LinkedHashMap linkedHashMa1 = new LinkedHashMap();
             Iterator iterator3 = CollectionsKt___CollectionsKt.f5(uArrayList1, new k(iNSTANCE)).iterator();
             while (true) {
                if (iterator3.hasNext()) {
                   pair = iterator3.next();
                   HeapObject heapObject = pair.component1();
                   obj3 = pair.component2();
                   if (obj3 instanceof e$m) {
                      uob = heapObject.b();
                      a.m(uob);
                      linkedHashMa1.put(Integer.valueOf(obj3.b), r0.a(uob, obj3));
                      oj.a(l, new n$c$b(obj3.a(), obj3));
                   }else if(obj3 instanceof e$d){
                      pair = linkedHashMa1.get(Integer.valueOf(obj3.b));
                      if (pair == null) {
                         oj.a(l, new n$c$b(obj3.a(), obj3));
                      }else {
                         uob = pair.component1();
                         obj4 = pair.component2();
                         str = linkedHashMa.get(uob);
                         if (str != null) {
                            obj2 = 1;
                         }else {
                            PathFinder$enqueueGcRoots$$inlined$forEach$lambda$1 uoenqueueGcR = new PathFinder$enqueueGcRoots$$inlined$forEach$lambda$1(uob, oj, l, linkedHashMa1, linkedHashMa);
                            str = i6.invoke();
                         }
                         oz = oj.c.get(str);
                         if (!oz instanceof n) {
                            n$c$b uoc$b = new n$c$b(obj4.a(), obj3);
                            LeakTraceReference$ReferenceType lOCAL = LeakTraceReference$ReferenceType.LOCAL;
                            String str1 = "";
                            uoa$a = (oz instanceof r)? new n$a$a(obj3.a(), uoc$b, lOCAL, str1, oz, 0, 32, null): new n$a$b(obj3.a(), uoc$b, lOCAL, str1, 0, 16, null);
                            oj.a(l, iterator2);
                         }
                      }
                   }else if(obj3 instanceof e$e){
                      if (heapObject instanceof HeapObject$HeapClass) {
                         oz = oj.d.get(heapObject.j());
                      }else if(heapObject instanceof HeapObject$b){
                         oz = oj.d.get(heapObject.k());
                      }else if(heapObject instanceof HeapObject$c){
                         oz = oj.d.get(heapObject.h());
                      }else if(heapObject instanceof HeapObject$d){
                         oz = oj.d.get(heapObject.h());
                      }else {
                         break ;
                      }
                      if (!oz instanceof n) {
                         if (oz instanceof r) {
                            oj.a(l, new n$c$a(obj3.a(), obj3, oz));
                         }else {
                            oj.a(l, new n$c$b(obj3.a(), obj3));
                         }
                      }
                   }else {
                      oj.a(l, new n$c$b(obj3.a(), obj3));
                   }
                   obj2 = 10;
                }else {
                   int i7 = 1;
                   ArrayList uArrayList2 = new ArrayList();
                   j$c uoc1 = l;
                   j oj1 = oj;
                   while (true) {
                      i3 = uoc1.a.isEmpty() ^ i7;
                      if (!i3) {
                         i3 = uoc1.b.isEmpty() ^ i7;
                         if (i3) {
                         label_02c0 :
                            str2 = 1;
                         }else {
                            str2 = null;
                         }
                      }else {
                         goto label_02c0 ;
                      }
                   }
                   if (str2) {
                      str2 = "removedNode";
                      if (!l.g() && !l.e().isEmpty()) {
                         on = l.e().poll();
                         l.f().g(on.b());
                         a.o(on, str2);
                      }else {
                         uoc1.f = i7;
                         on = l.c().poll();
                         l.d().g(on.b());
                         a.o(on, str2);
                      }
                      if (l.b().c(on.b())) {
                         uArrayList2.add(on);
                         if (uArrayList2.size() == l.b().h()) {
                            if (uoc1.i != null) {
                               oj1.h.a(OnAnalysisProgressListener$Step.FINDING_DOMINATORS);
                            }
                         }
                      }
                      HeapObject heapObject1 = oj1.g.u(on.b());
                      if (heapObject1 instanceof HeapObject$HeapClass) {
                         Map map = oj1.b.get(heapObject1.j());
                         if (map == null) {
                            map = t0.z();
                         }
                         Iterator iterator4 = SequencesKt___SequencesKt.b1(CollectionsKt___CollectionsKt.l1(heapObject1.m()), new HeapObject$HeapClass$readStaticFields$1(heapObject1)).iterator();
                         while (true) {
                            if (iterator4.hasNext()) {
                               h oh = iterator4.next();
                               i b = oh.b().b;
                               b = (b instanceof d0$i && !b.b())? 1: null;
                               if (!b) {
                                  continue ;
                               }else {
                                  str3 = oh.a();
                                  if (a.g(str3, "$staticOverhead") || a.g(str3, "$classOverhead")) {
                                     continue ;
                                  }else {
                                     i b1 = oh.b().b;
                                     Objects.requireNonNull(b1, "null cannot be cast to non-null type kshark.lite.ValueHolder.ReferenceHolder");
                                     long l2 = b1.a();
                                     z oz1 = map.get(str3);
                                     if (oz1 == null) {
                                        uoa$b = new n$a$b(l2, on, LeakTraceReference$ReferenceType.STATIC_FIELD, str3, 0, 16, null);
                                        uoa$b1 = oz1;
                                     }else if(oz1 instanceof r){
                                        uoa$a = new n$a$a(l2, on, LeakTraceReference$ReferenceType.STATIC_FIELD, str3, oz1, 0, 32, null);
                                     }else if(oz1 instanceof n){
                                        uoa$b1 = null;
                                     }else {
                                     }
                                     if (uoa$b1 != null) {
                                        oj1.a(uoc1, uoa$b1);
                                     }else {
                                        continue ;
                                     }
                                  }
                               }
                            }else {
                               obj = l;
                               uArrayList3 = uArrayList2;
                            }
                         }
                         throw new NoWhenBranchMatchedException();
                      }else if(heapObject1 instanceof HeapObject$b){
                         LinkedHashMap linkedHashMa2 = new LinkedHashMap();
                         iterator5 = heapObject1.i().i().iterator();
                         while (iterator5.hasNext()) {
                            Map map1 = oj1.a.get(iterator5.next().j());
                            if (map1 != null) {
                               iterator3 = map1.entrySet().iterator();
                               while (iterator3.hasNext()) {
                                  obj3 = iterator3.next();
                                  obj5 = obj3.getKey();
                                  z value = obj3.getValue();
                                  if (!linkedHashMa2.containsKey(obj5)) {
                                     linkedHashMa2.put(obj5, value);
                                  }else {
                                     continue ;
                                  }
                               }
                            }else {
                               continue ;
                            }
                         }
                         long l3 = l.a();
                         ArrayList uArrayList4 = new ArrayList();
                         for (HeapObject$HeapClass heapClass1 = heapObject1.i(); heapClass1 != null && heapClass1.d() - l3; heapClass1 = heapClass1.k()) {
                            uArrayList4.add(heapClass1);
                         }
                         HeapObject$b d = heapObject1.d;
                         obj5 = new ArrayList();
                         iterator5 = uArrayList4.iterator();
                         d uod = null;
                         int i9 = 0;
                         while (true) {
                            if (iterator5.hasNext()) {
                               HeapObject$HeapClass heapClass2 = iterator5.next();
                               obj4 = heapClass2.l().iterator();
                               while (true) {
                                  if (obj4.hasNext()) {
                                     obj2 = obj4.next();
                                     iterator6 = iterator5;
                                     i8 = 2;
                                     if (obj2.a() != i8) {
                                        i = obj2.a();
                                        if (i == i8) {
                                           i = d.c();
                                        }else if(i == PrimitiveType.BOOLEAN.getHprofType()){
                                           if (i != PrimitiveType.CHAR.getHprofType()) {
                                              if (i != PrimitiveType.FLOAT.getHprofType()) {
                                                 if (i != PrimitiveType.DOUBLE.getHprofType()) {
                                                    if (i != PrimitiveType.BYTE.getHprofType()) {
                                                       if (i != PrimitiveType.SHORT.getHprofType()) {
                                                          if (i != PrimitiveType.INT.getHprofType()) {
                                                             if (i != PrimitiveType.LONG.getHprofType()) {
                                                                throw new IllegalStateException("Unknown type "+obj2.a());
                                                             }
                                                          }
                                                       }
                                                    }
                                                 }
                                                 i = 8;
                                              }
                                              i = 4;
                                           }
                                           i = 2;
                                        }
                                        i = 1;
                                        i9 = i9 + i;
                                        iterator5 = iterator6;
                                        obj2 = 1;
                                     }else if(!uod){
                                        uod = new d(heapObject1.n(), d.c());
                                     }
                                     i8 = uod.a + i9;
                                     uod.a = i8;
                                     d c1 = uod.c;
                                     if (c1 != 1) {
                                        if (c1 != 2) {
                                           long l4 = 16;
                                           if (c1 != 4) {
                                              if (c1 == 8) {
                                                 byte[] uobyteArray = uod.b.a();
                                                 i9 = i8 + 1;
                                                 long l5 = 255;
                                                 l6 = (long)uobyteArray[i8] & l5;
                                                 l6 = l6 << 56;
                                                 int i10 = i9 + 1;
                                                 uoc3 = l;
                                                 long l7 = (long)uobyteArray[i9] & l5;
                                                 l7 = l7 << 48;
                                                 l6 = l6 | l7;
                                                 i11 = i10 + 1;
                                                 uArrayList3 = uArrayList2;
                                                 l = (long)uobyteArray[i10] & l5;
                                                 l = l << 40;
                                                 l6 = l6 | l;
                                                 i12 = i11 + 1;
                                                 uob1 = d;
                                                 on1 = on;
                                                 long l8 = (long)uobyteArray[i11] & l5;
                                                 l8 = l8 << 32;
                                                 l6 = l6 | l8;
                                                 i11 = i12 + 1;
                                                 l8 = (long)uobyteArray[i12] & l5;
                                                 l8 = l8 << 24;
                                                 l6 = l6 | l8;
                                                 i12 = i11 + 1;
                                                 l8 = (long)uobyteArray[i11] & l5;
                                                 l8 = l8 << l4;
                                                 l6 = l6 | l8;
                                                 i11 = i12 + 1;
                                                 l8 = (long)uobyteArray[i12] & l5;
                                                 l8 = l8 << 8;
                                                 l6 = l6 | l8;
                                                 l7 = (long)uobyteArray[i11] & l5;
                                                 l6 = l6 | l7;
                                              label_061a :
                                                 long l9 = l6;
                                                 l6 = uod.a + uod.c;
                                                 uod.a = l6;
                                                 if (l9 - null) {
                                                    a.p(obj2, "fieldRecord");
                                                    j$a uoa = new j$a(heapClass2.d(), l9, heapClass2.e.i(heapClass2.d(), obj2));
                                                    obj5.add(null);
                                                 }
                                                 on = on1;
                                                 uArrayList2 = uArrayList3;
                                                 iterator5 = iterator6;
                                                 d = uob1;
                                                 uoc2 = uoc3;
                                                 i9 = 0;
                                                 continue ;
                                              }else {
                                                 throw super("ID Length must be 1, 2, 4, or 8".toString());
                                              }
                                           }else {
                                              uoc3 = l;
                                              uArrayList3 = uArrayList2;
                                              uob1 = d;
                                              on1 = on;
                                              uobyteArray1 = uod.b.a();
                                              i11 = i8 + 1;
                                              i8 = uobyteArray1[i8] & 0x00ff;
                                              i8 = i8 << 24;
                                              i12 = i11 + 1;
                                              i11 = uobyteArray1[i11] & 0x00ff;
                                              i11 = i11 << 16;
                                              i8 = i8 | i11;
                                              i11 = i12 + 1;
                                              i12 = uobyteArray1[i12] & 0x00ff;
                                              i12 = i12 << 8;
                                              i8 = i8 | i12;
                                              l6 = uobyteArray1[i11];
                                           }
                                        }else {
                                           uoc3 = l;
                                           uArrayList3 = uArrayList2;
                                           uob1 = d;
                                           on1 = on;
                                           uobyteArray1 = uod.b.a();
                                           i11 = i8 + 1;
                                           i8 = uobyteArray1[i8] & 0x00ff;
                                           i8 = i8 << 8;
                                           l6 = uobyteArray1[i11];
                                        }
                                        l6 = l6 & 0x00ff;
                                        l6 = l6 | i8;
                                     }else {
                                        uoc3 = l;
                                        uArrayList3 = uArrayList2;
                                        uob1 = d;
                                        on1 = on;
                                        l6 = uod.b.a()[i8];
                                     }
                                     l6 = (long)l6;
                                     goto label_061a ;
                                  }else {
                                     i9 = i9;
                                     l6 = this;
                                  }
                               }
                            }else {
                               uoc3 = l;
                               uArrayList3 = uArrayList2;
                               on1 = on;
                               if (obj5.size() > 1) {
                                  x.p0(obj5, new l());
                               }
                               iterator7 = obj5.iterator();
                               while (true) {
                                  if (iterator7.hasNext()) {
                                     j$a uoa1 = iterator7.next();
                                     obj1 = linkedHashMa2.get(uoa1.b());
                                     if (obj1 == null) {
                                        uoa$b = new n$a$b(uoa1.c(), on1, LeakTraceReference$ReferenceType.INSTANCE_FIELD, uoa1.b(), uoa1.a());
                                     }else if(obj1 instanceof r){
                                        uoa$a = new n$a$a(uoa1.c(), on1, LeakTraceReference$ReferenceType.INSTANCE_FIELD, uoa1.b(), obj1, uoa1.a());
                                        uoa$a1 = l;
                                     }else if(obj1 instanceof n){
                                        uoa$a1 = null;
                                     }else {
                                        throw new NoWhenBranchMatchedException();
                                     }
                                     if (obj1 != null) {
                                        oj.a(uoc3, obj1);
                                     }else {
                                        continue ;
                                     }
                                  }else {
                                     obj = uoc3;
                                     uoc1 = obj;
                                     oj1 = oj;
                                  }
                               }
                            }
                         }
                      }else {
                         obj = l;
                         uArrayList3 = uArrayList2;
                         on1 = on;
                         if (heapObject1 instanceof HeapObject$c) {
                            l$a$a$c d1 = heapObject1.i().d;
                            uArrayList5 = new ArrayList();
                            i12 = d1.length;
                            i1 = 0;
                            while (i1 < i12) {
                               l10 = d1[i1];
                               Long longx = (l10 - null && oj1.g.f(l10))? 1: null;
                               if (longx) {
                                  uArrayList5.add(Long.valueOf(l10));
                               }
                               i1 = i1 + 1;
                            }
                            iterator7 = uArrayList5.iterator();
                            i1 = 0;
                            while (iterator7.hasNext()) {
                               obj6 = iterator7.next();
                               i12 = i1 + 1;
                               if (i1 < 0) {
                                  CollectionsKt__CollectionsKt.W();
                               }
                               uoa$b = new n$a$b(obj6.longValue(), on1, LeakTraceReference$ReferenceType.ARRAY_ENTRY, String.valueOf(i1), 0, 16, null);
                               oj1.a(uoc1, obj6);
                               i1 = i12;
                            }
                         }
                      }
                      i7 = 1;
                      uoc2 = obj;
                      uArrayList2 = uArrayList3;
                      i8 = p0;
                   }
                   super(uArrayList2);
                   List list = this.a();
                   uArrayList5 = new ArrayList(u.Y(list, 10));
                   Iterator iterator8 = list.iterator();
                   while (iterator8.hasNext()) {
                      uArrayList5.add(Long.valueOf(iterator8.next().b()));
                   }
                   Set set = e1.x(p1, CollectionsKt___CollectionsKt.L5(uArrayList5));
                   uArrayList5 = new ArrayList(u.Y(set, 10));
                   iterator8 = set.iterator();
                   while (iterator8.hasNext()) {
                      uArrayList5.add(new t(p0.a().u(iterator8.next().longValue())));
                   }
                   ArrayList uArrayList6 = new ArrayList(u.Y(uArrayList5, 10));
                   obj6 = uArrayList5.iterator();
                   while (true) {
                      str = 3;
                      if (obj6.hasNext()) {
                         t ot = obj6.next();
                         i2 = true;
                         Pair pair1 = this.f(ot, i2);
                         LeakTraceObject$LeakingStatus leakingStatu = pair1.component1();
                         String str4 = pair1.component2();
                         i1 = g.a[leakingStatu.ordinal()];
                         if (i1 != i2) {
                            if (i1 != 2) {
                               if (i1 == str) {
                                  str4 = "This is a leaking object. Conflicts with "+str4;
                               }else {
                               }
                            }else {
                               str4 = "This is a leaking object";
                            }
                         }
                         uArrayList6.add(new HeapAnalyzer$b(ot.a(), LeakTraceObject$LeakingStatus.LEAKING, str4, ot.b()));
                      }else {
                         Map map2 = null;
                         HeapAnalyzer heapAnalyzer = this;
                         list = heapAnalyzer.a(uArrayList6, map2);
                         this = this.a();
                         HeapAnalyzer$e$b uoe$b = new HeapAnalyzer$e$b(0);
                         iterator2 = this.iterator();
                         while (iterator2.hasNext()) {
                            on = iterator2.next();
                            uArrayList7 = new ArrayList();
                            n on2 = on;
                            while (on2 instanceof n$a) {
                               uArrayList7.add(0, Long.valueOf(on2.b()));
                               on2 = on2.d();
                            }
                            i7 = 0;
                            uArrayList7.add(i7, Long.valueOf(on2.b()));
                            heapAnalyzer.g(on, uArrayList7, i7, uoe$b);
                         }
                         i7 = 0;
                         uArrayList = new ArrayList();
                         heapAnalyzer.d(uoe$b, uArrayList);
                         str2 = "Found ";
                         if (uArrayList.size() != this.size()) {
                            a0$a uoa2 = a0.b.a();
                            if (uoa2 != null) {
                               uoa2.d(str2+this.size()+" paths to retained objects,"+" down to "+uArrayList.size()+" after removing duplicated paths");
                            }
                         }else {
                            a0$a uoa3 = a0.b.a();
                            if (uoa3 != null) {
                               uoa3.d(str2+uArrayList.size()+" paths to retained objects");
                            }
                         }
                         ArrayList Pair uArrayList8 = new ArrayList(u.Y(uArrayList, 10));
                         obj6 = uArrayList.iterator();
                         while (obj6.hasNext()) {
                            n on3 = obj6.next();
                            ArrayList uArrayList9 = new ArrayList();
                            while (on3 instanceof n$a) {
                               uArrayList9.add(i7, on3);
                               on3 = on3.d();
                            }
                            Objects.requireNonNull(on3, "null cannot be cast to non-null type kshark.lite.internal.ReferencePathNode.RootNode");
                            uArrayList8.add(new HeapAnalyzer$d(on3, uArrayList9));
                         }
                         heapAnalyzer.a.a(OnAnalysisProgressListener$Step.INSPECTING_OBJECTS);
                         uArrayList5 = new ArrayList(u.Y(uArrayList8, 10));
                         iterator2 = uArrayList8.iterator();
                         while (iterator2.hasNext()) {
                            HeapAnalyzer$d uod1 = iterator2.next();
                            list1 = CollectionsKt___CollectionsKt.m4(t.k(uod1.a), uod1.b);
                            uArrayList7 = new ArrayList(u.Y(list1, 10));
                            iterator5 = list1.iterator();
                            i13 = 0;
                            while (iterator5.hasNext()) {
                               obj7 = iterator5.next();
                               i5 = i13 + 1;
                               if (i13 < 0) {
                                  CollectionsKt__CollectionsKt.W();
                               }
                               t ot1 = new t(p0.a().u(obj7.b()));
                               obj2 = (i5 < list1.size())? list1.get(i5): map2;
                               if (obj2 instanceof n$b) {
                                  ot1.b().add("Library leak match: "+obj2.a().a());
                               }
                               uArrayList7.add(ot1);
                               i13 = i5;
                               l10 = 0;
                            }
                            uArrayList5.add(uArrayList7);
                            l10 = 0;
                         }
                         uArrayList = new ArrayList(u.Y(uArrayList5, 10));
                         obj6 = uArrayList5.iterator();
                         while (true) {
                            if (obj6.hasNext()) {
                               list1 = obj6.next();
                               i1 = list1.size() - 1;
                               Ref$IntRef intRef = new Ref$IntRef();
                               intRef.element = -1;
                               Ref$IntRef intRef1 = new Ref$IntRef();
                               intRef1.element = i1;
                               ArrayList uArrayList10 = new ArrayList();
                               obj7 = list1.iterator();
                               i5 = 0;
                               while (true) {
                                  if (obj7.hasNext()) {
                                     t ot2 = obj7.next();
                                     b2 = (i5 == i1)? true: false;
                                     pair2 = heapAnalyzer.f(ot2, b2);
                                     if (i5 == i1) {
                                        b2 = g.b[pair2.getFirst().ordinal()];
                                        if (b2 != 1) {
                                           if (b2 != 2) {
                                              if (b2 == str) {
                                                 pair2 = r0.a(LeakTraceObject$LeakingStatus.LEAKING, "This is the leaking object. Conflicts with "+pair2.getSecond());
                                              }else {
                                              }
                                           }else {
                                              pair2 = r0.a(LeakTraceObject$LeakingStatus.LEAKING, "This is the leaking object");
                                           }
                                        }
                                     }
                                     uArrayList10.add(pair2);
                                     leakingStatu1 = pair2.component1();
                                     if (leakingStatu1 == LeakTraceObject$LeakingStatus.NOT_LEAKING) {
                                        intRef.element = i5;
                                        intRef1.element = i1;
                                     }else if(leakingStatu1 == LeakTraceObject$LeakingStatus.LEAKING && intRef1.element == i1){
                                        intRef1.element = i5;
                                     }
                                     i5 = i5 + 1;
                                     str = 3;
                                  }else {
                                     ArrayList uArrayList11 = new ArrayList(u.Y(list1, 10));
                                     iterator1 = list1.iterator();
                                     while (iterator1.hasNext()) {
                                        uArrayList11.add(o.b(heapAnalyzer.e(iterator1.next().a()), '.'));
                                     }
                                     Ref$IntRef element = intRef.element;
                                     int i14 = 0;
                                     while (true) {
                                        str3 = "Sequence contains no element matching the predicate.";
                                        if (i14 < element) {
                                           pair2 = uArrayList10.get(i14);
                                           LeakTraceObject$LeakingStatus leakingStatu2 = pair2.component1();
                                           String str5 = pair2.component2();
                                           int i15 = i14 + 1;
                                           iterator6 = obj6;
                                           Ref$IntRef intRef2 = element;
                                           obj6 = SequencesKt__SequencesKt.o(Integer.valueOf(i15), new HeapAnalyzer$computeLeakStatuses$nextNotLeakingIndex$1(intRef)).iterator();
                                           while (true) {
                                              if (!obj6.hasNext()) {
                                                 throw new NoSuchElementException(str3);
                                              }
                                              Number number = obj6.next();
                                              Iterator iterator9 = obj6;
                                              Ref$IntRef intRef3 = intRef;
                                              nOT_LEAKING = LeakTraceObject$LeakingStatus.NOT_LEAKING;
                                              i11 = (uArrayList10.get(number.intValue()).getFirst() == nOT_LEAKING)? 1: 0;
                                              if (i11) {
                                                 String str6 = uArrayList11.get(number.intValue());
                                                 i4 = g.c[leakingStatu2.ordinal()];
                                                 if (i4 != 1) {
                                                    if (i4 != 2) {
                                                       if (i4 == 3) {
                                                          pair3 = r0.a(nOT_LEAKING, str6+"¡ý is not leaking. Conflicts with "+str5);
                                                       }else {
                                                          throw new NoWhenBranchMatchedException();
                                                       }
                                                    }else {
                                                       pair3 = r0.a(nOT_LEAKING, str6+"¡ý is not leaking and "+str5);
                                                    }
                                                 }else {
                                                    pair3 = r0.a(nOT_LEAKING, str6+"¡ý is not leaking");
                                                 }
                                                 uArrayList10.set(i14, pair3);
                                                 i14 = i15;
                                                 obj6 = iterator6;
                                                 element = intRef2;
                                                 intRef = intRef3;
                                              }else {
                                                 obj6 = iterator9;
                                                 intRef = intRef3;
                                              }
                                           }
                                           throw new NoWhenBranchMatchedException();
                                        }else {
                                           iterator6 = obj6;
                                           Ref$IntRef element1 = intRef1.element;
                                           i1 = i1 - 1;
                                           if (element1 < i1) {
                                              i11 = element1 + 1;
                                              if (i1 >= i11) {
                                                 while (true) {
                                                    pair = uArrayList10.get(i1);
                                                    nOT_LEAKING = pair.component1();
                                                    str = pair.component2();
                                                    i14 = i1 - 1;
                                                    iterator3 = SequencesKt__SequencesKt.o(Integer.valueOf(i14), new HeapAnalyzer$computeLeakStatuses$previousLeakingIndex$1(intRef1)).iterator();
                                                    break ;
                                                 }
                                                 while (true) {
                                                    if (!iterator3.hasNext()) {
                                                       throw new NoSuchElementException(str3);
                                                    }
                                                    Number number1 = iterator3.next();
                                                    Ref$IntRef intRef4 = intRef1;
                                                    int i16 = i14;
                                                    LeakTraceObject$LeakingStatus lEAKING = LeakTraceObject$LeakingStatus.LEAKING;
                                                    i13 = (uArrayList10.get(number1.intValue()).getFirst() == lEAKING)? 1: 0;
                                                    if (i13) {
                                                       String str7 = uArrayList11.get(number1.intValue());
                                                       i = g.d[nOT_LEAKING.ordinal()];
                                                       if (i != 1) {
                                                          if (i != 2) {
                                                             if (i != 3) {
                                                                throw new NoWhenBranchMatchedException();
                                                             }else {
                                                                throw new IllegalStateException("Should never happen");
                                                             }
                                                          }else {
                                                             pair = r0.a(lEAKING, str7+"¡ü is leaking and "+str);
                                                          }
                                                       }else {
                                                          pair = r0.a(lEAKING, str7+"¡ü is leaking");
                                                       }
                                                       uArrayList10.set(i1, pair);
                                                       if (i1 != i11) {
                                                          intRef1 = intRef4;
                                                          i1 = i16;
                                                       }else {
                                                          obj7 = 2;
                                                       label_0c59 :
                                                          uArrayList5 = new ArrayList(u.Y(list1, 10));
                                                          iterator1 = list1.iterator();
                                                          i1 = 0;
                                                          while (iterator1.hasNext()) {
                                                             Object obj8 = iterator1.next();
                                                             i = i1 + 1;
                                                             if (i1 < 0) {
                                                                CollectionsKt__CollectionsKt.W();
                                                             }
                                                             Pair pair4 = uArrayList10.get(i1);
                                                             LeakTraceObject$LeakingStatus leakingStatu3 = pair4.component1();
                                                             uArrayList5.add(new HeapAnalyzer$b(obj8.a(), leakingStatu3, pair4.component2(), obj8.b()));
                                                             i1 = i;
                                                             uArrayList11 = 10;
                                                          }
                                                          uArrayList.add(uArrayList5);
                                                          obj6 = iterator6;
                                                          leakingStatu1 = null;
                                                          str = 3;
                                                       }
                                                    }else {
                                                       intRef1 = intRef4;
                                                       i14 = i16;
                                                    }
                                                 }
                                              }
                                           }
                                           b2 = true;
                                           goto label_0c59 ;
                                        }
                                     }
                                  }
                               }
                            }else {
                            }
                         }
                      }
                   }
                   throw super();
                }
             }
             throw new NoWhenBranchMatchedException();
          }
       }
       i5 = 0;
       goto label_0085 ;
    }
    public final void d(HeapAnalyzer$e$b p0,List p1){
       Iterator iterator = p0.b().values().iterator();
       while (iterator.hasNext()) {
          HeapAnalyzer$e uoe = iterator.next();
          if (uoe instanceof HeapAnalyzer$e$b) {
             this.d(uoe, p1);
          }else if(uoe instanceof HeapAnalyzer$e$a){
             p1.add(uoe.b);
          }
       }
       return;
    }
    public final String e(HeapObject p0){
       String str;
       if (p0 instanceof HeapObject$HeapClass) {
          str = p0.j();
       }else if(p0 instanceof HeapObject$b){
          str = p0.k();
       }else if(p0 instanceof HeapObject$c){
          str = p0.h();
       }else if(p0 instanceof HeapObject$d){
          str = p0.h();
       }else {
          throw new NoWhenBranchMatchedException();
       }
       return str;
    }
    public final Pair f(t p0,boolean p1){
       String str;
       LeakTraceObject$LeakingStatus uNKNOWN = LeakTraceObject$LeakingStatus.UNKNOWN;
       if (p0.c().isEmpty() ^ 0x01) {
          uNKNOWN = LeakTraceObject$LeakingStatus.NOT_LEAKING;
          str = CollectionsKt___CollectionsKt.V2(p0.c(), " and ", null, null, 0, null, null, 62, null);
       }else {
          str = "";
       }
       t b = p0.b;
       if (b.isEmpty() ^ 0x01) {
          String str1 = CollectionsKt___CollectionsKt.V2(b, " and ", null, null, 0, null, null, 62, null);
          if (uNKNOWN == LeakTraceObject$LeakingStatus.NOT_LEAKING) {
             if (p1) {
                uNKNOWN = LeakTraceObject$LeakingStatus.LEAKING;
                str = str1+". Conflicts with "+str;
             }else {
                str = str+". Conflicts with "+str1;
             }
          }else {
             uNKNOWN = LeakTraceObject$LeakingStatus.LEAKING;
             str = str1;
          }
       }
       return r0.a(uNKNOWN, str);
    }
    public final void g(n p0,List p1,int p2,HeapAnalyzer$e$b p3){
       long l = p1.get(p2).longValue();
       if (p2 == CollectionsKt__CollectionsKt.G(p1)) {
          p3.b().put(Long.valueOf(l), new HeapAnalyzer$e$a(l, p0));
       }else {
          HeapAnalyzer$e uoe = p3.b().get(Long.valueOf(l));
          if (uoe == null) {
             uoe = new HeapAnalyzer$updateTrie$childNode$1(l, p3).invoke();
          }
          if (uoe instanceof HeapAnalyzer$e$b) {
             p2++;
             this.g(p0, p1, p2, uoe);
          }
       }
       return;
    }
}
