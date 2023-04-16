package com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$5$1;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$5;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$5$1$1;
import msd.a;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$1;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.task.EveTaskLifecycle;
import zn7.a;
import java.lang.Throwable;
import sm7.l;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$3;
import msd.l;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$2;
import java.util.Objects;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager;
import com.kwai.sdk.eve.internal.inference.a;
import wn7.a;
import vm7.a;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$buildInference$1;
import kotlin.jvm.internal.Ref$ObjectRef;
import rk.u;
import rk.a0;
import ao7.a;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.eve.packageinfo.model.TypedExecutable;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$buildInference$$inlined$mapIndexed$lambda$1;
import jn7.b;
import com.kwai.sdk.eve.internal.inference.EveExecutableAtomic;
import com.kuaishou.eve.packageinfo.model.InPackExecutableInfo;
import com.kuaishou.eve.packageinfo.ExecutableCode;
import jn7.a;
import java.lang.Enum;
import com.kwai.sdk.eve.internal.inference.internal.DelegateExecutableAtomic;
import ym7.f;
import sm7.h;
import java.lang.Exception;
import ym7.e;
import com.kuaishou.eve.packageinfo.model.InlineExecutableInfo;
import com.kuaishou.eve.packageinfo.model.ExecutableInfo;
import com.kuaishou.eve.packageinfo.model.ModelExecutableInfo;
import jn7.c;
import com.kwai.sdk.eve.internal.inference.ExecutableAtomicType;
import rk.j;
import qrd.l1;
import com.kuaishou.eve.utils.UnreachableException;
import rk.r;
import java.util.Set;
import brd.t;
import in7.b;
import ml5.a;
import io.reactivex.g;
import in7.c;
import erd.o;
import in7.d;
import erd.a;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$5$1$a;
import erd.g;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$5$1$b;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$5$1$c;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$5$1$d;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$5$1$e;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$5$1$f;
import crd.b;

public final class EveInferenceManager$directInferAsync$5$1 implements Runnable	// class@00155a
{
    public final EveInferenceManager$directInferAsync$5 b;

    public void EveInferenceManager$directInferAsync$5$1(EveInferenceManager$directInferAsync$5 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       EveInferenceManager$directInferAsync$5$1 b;
       EveInferenceManager$directInferAsync$5 e;
       EveInferenceManager a;
       DelegateExecutableAtomic uDelegateExe;
       boolean b3;
       Ref$ObjectRef objectRef5;
       a0 uoa02;
       Ref$ObjectRef objectRef6;
       int i3;
       EveInferenceManager$directInferAsync$5$1 obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, EveInferenceManager$directInferAsync$5$1.class, "1")) {
          return;
       }
       EveLog iNSTANCE = EveLog.INSTANCE;
       iNSTANCE.i(new EveInferenceManager$directInferAsync$5$1$1(obj));
       if (!obj.b.d.invoke()) {
          b = obj.b;
          b.e.invoke(b.f.invoke(new IllegalStateException("task lifecycle error "+obj.b.c.g())));
          return;
       }else if(!obj.b.g.invoke()){
          b = obj.b;
          e = b.e;
          EveInferenceManager$directInferAsync$5 f = b.f;
          StringBuilder str = "localGuard disable inference ";
          String str1 = obj.b.c.j();
          if (str1 == null) {
             str1 = "";
          }
          e.invoke(f.invoke(new IllegalStateException(str+str1)));
          return;
       }else {
          EveInferenceManager$directInferAsync$5$1 b1 = obj.b;
          EveInferenceManager$directInferAsync$5 b2 = b1.b;
          EveInferenceManager$directInferAsync$5 c = b1.c;
          EveInferenceManager$directInferAsync$5 h = b1.h;
          EveInferenceManager$directInferAsync$5 i = b1.i;
          Objects.requireNonNull(b2);
          a uoa = PatchProxy.applyThreeRefs(c, h, i, b2, EveInferenceManager.class, "11");
          if (uoa != patchProxyRe) {
          }else {
             uoa = new a(h, c, b2.c, b2.a, i);
             iNSTANCE.i(new EveInferenceManager$buildInference$1(c, h, i, v15));
             Ref$ObjectRef objectRef = new Ref$ObjectRef();
             objectRef.element = objArray;
             Ref$ObjectRef objectRef1 = new Ref$ObjectRef();
             objectRef1.element = objArray;
             Ref$ObjectRef objectRef2 = new Ref$ObjectRef();
             objectRef2.element = objArray;
             u ou = u.c();
             ou.a(false);
             a0 uoa0 = ou.b();
             uoa = c.h();
             a.m(uoa);
             List list = uoa.Q3(i);
             ArrayList uArrayList = new ArrayList(u.Y(list, 10));
             Iterator iterator = list.iterator();
             int i1 = 0;
             while (true) {
                if (iterator.hasNext()) {
                   EveInferenceManager$buildInference$$inlined$mapIndexed$lambda$1 obj1 = iterator.next();
                   int i2 = i1 + 1;
                   if (i1 < 0) {
                      CollectionsKt__CollectionsKt.W();
                   }
                   a = b2.a;
                   Iterator iterator1 = iterator;
                   Object obj2 = obj1;
                   ExecutableAtomicType uExecutableA = 32;
                   ArrayList uArrayList1 = uArrayList;
                   a0 uoa01 = uoa0;
                   Ref$ObjectRef objectRef3 = objectRef2;
                   Ref$ObjectRef objectRef4 = objectRef1;
                   obj1 = new EveInferenceManager$buildInference$$inlined$mapIndexed$lambda$1(b2, c, v15, objectRef1, objectRef, uoa01, objectRef3);
                   Object obj3 = PatchProxy.applyFourRefs(obj2, v15, a, iterator, null, b.class, "1");
                   if (obj3 != patchProxyRe) {
                      uDelegateExe = obj3;
                      b3 = false;
                   }else {
                      Object obj4 = obj2;
                      a.p(obj4, "info");
                      a.p(v15, "inference");
                      a.p(a, "context");
                      a.p(iterator, "processors");
                      i3 = 2;
                      EveLog.i$default("#buildProcessor "+v15.k().n()+uExecutableA+obj4, false, i3, null);
                      a uoa1 = v15.k();
                      if (obj4 instanceof InPackExecutableInfo) {
                         int i4 = a.a[obj4.b().ordinal()];
                         if (i4 != 1) {
                            if (i4 == i3) {
                               uDelegateExe = new DelegateExecutableAtomic(uoa1, v15, new f(v15, obj4), obj4);
                            }else {
                               throw new Exception("UnExpected processor type");
                            }
                         }else {
                            uDelegateExe = new DelegateExecutableAtomic(uoa1, v15, new e(uoa1, obj4), obj4);
                         }
                      }else if(obj4 instanceof InlineExecutableInfo){
                         uDelegateExe = new DelegateExecutableAtomic(uoa1, v15, iterator.invoke(obj4.e()), obj4);
                      }else if(obj4 instanceof ModelExecutableInfo){
                         uDelegateExe = new DelegateExecutableAtomic(uoa1, v15, new c(obj4), obj4);
                      }else {
                         throw new UnreachableException();
                      }
                   }
                   if (uDelegateExe.c() == ExecutableAtomicType.Pipeline) {
                      objectRef5 = objectRef4;
                      objectRef5.element = uDelegateExe;
                   }else {
                      objectRef5 = objectRef4;
                   }
                   if (!i1) {
                      objectRef.element = uDelegateExe;
                   }
                   uoa02 = uoa01;
                   uoa0 = uoa02;
                   uoa0.q(uDelegateExe);
                   objectRef6 = objectRef3;
                   Ref$ObjectRef element = objectRef6.element;
                   if (element != null) {
                      uoa0.u(element, uDelegateExe);
                   }
                   objectRef6.element = uDelegateExe;
                   ArrayList uArrayList2 = uArrayList1;
                   uArrayList2.add(l1.a);
                   objectRef2 = objectRef6;
                   uArrayList = uArrayList2;
                   uoa0 = uoa02;
                   i1 = i2;
                   objectRef1 = objectRef5;
                   iterator = iterator1;
                }else {
                   char c1 = ' ';
                   i3 = 2;
                   b3 = false;
                   uoa02 = uoa0;
                   a.o(uoa02, "graph");
                   Ref$ObjectRef objectRef7 = objectRef.element;
                   a.m(objectRef7);
                   objectRef5 = objectRef1.element;
                   if (!PatchProxy.applyVoidThreeRefs(uoa02, objectRef7, objectRef5, v15, a.class, "1")) {
                      a.p(uoa02, "pipeline");
                      a.p(objectRef7, "entry");
                      v15.f = uoa02;
                      v15.g = objectRef7;
                      v15.h = objectRef5;
                   }
                   objectRef6 = objectRef.element;
                   a.m(objectRef6);
                   EveLog.i$default("EveInferenceManager#buildInference finish "+c.n()+c1+v15.h()+c1+uoa02.f().size()+c1+objectRef6, b3, i3, null);
                   uoa = v15;
                }
             }
          }
          obj = this;
          e = obj.b.j;
          Objects.requireNonNull(uoa);
          t ot = PatchProxy.applyOneRefs(e, uoa, a.class, "2");
          if (ot != patchProxyRe) {
          }else {
             a.p(e, "data");
             ot = t.create(new b(uoa, e)).map(new c(uoa)).doFinally(new d(uoa));
             a.o(ot, "Observable.create<TypeVa\x20\x02inish?.invoke\(this\)\n    }\x00");
          }
          ot.doOnSubscribe(new EveInferenceManager$directInferAsync$5$1$a(obj, uoa)).map(new EveInferenceManager$directInferAsync$5$1$b(obj, uoa)).onErrorReturn(new EveInferenceManager$directInferAsync$5$1$c(obj)).doOnNext(new EveInferenceManager$directInferAsync$5$1$d(obj, uoa)).subscribe(new EveInferenceManager$directInferAsync$5$1$e(obj), EveInferenceManager$directInferAsync$5$1$f.b);
          return;
       }
    }
}
