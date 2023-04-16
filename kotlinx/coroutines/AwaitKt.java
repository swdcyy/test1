package kotlinx.coroutines.AwaitKt;
import java.util.Collection;
import asd.c;
import java.lang.Object;
import kotlinx.coroutines.AwaitKt$awaitAll$2;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import ftd.r0;
import ftd.c;
import kotlin.TypeCastException;
import kotlinx.coroutines.AwaitKt$awaitAll$1;
import kotlinx.coroutines.AwaitKt$joinAll$3;
import ftd.z1;
import java.util.Iterator;
import java.lang.Iterable;
import qrd.l1;
import kotlinx.coroutines.AwaitKt$joinAll$1;

public final class AwaitKt	// class@001916
{

    public static final Object a(Collection p0,c p1){
       AwaitKt$awaitAll$2 uoawaitAll$2;
       AwaitKt$awaitAll$2 uoawaitAll$21;
       if (p1 instanceof AwaitKt$awaitAll$2) {
          uoawaitAll$2 = p1;
          AwaitKt$awaitAll$2 label = uoawaitAll$2.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uoawaitAll$2.label = label - i;
          label_0018 :
             AwaitKt$awaitAll$2 result = uoawaitAll$2.result;
             Object obj = b.h();
             AwaitKt$awaitAll$2 label1 = uoawaitAll$2.label;
             if (label1 != null) {
                if (label1 == 1) {
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                if (p0.isEmpty()) {
                   uoawaitAll$21 = CollectionsKt__CollectionsKt.E();
                label_0061 :
                   return uoawaitAll$21;
                }else {
                   r0[] or0Array = new r0[0];
                   Object[] objArray = p0.toArray(or0Array);
                   if (objArray != null) {
                      uoawaitAll$2.L$0 = p0;
                      uoawaitAll$2.label = 1;
                      result = new c(objArray).a(uoawaitAll$2);
                      if (result == obj) {
                         return obj;
                      }
                   }else {
                      throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                   }
                }
             }
             uoawaitAll$21 = result;
             goto label_0061 ;
          }
       }
       uoawaitAll$2 = new AwaitKt$awaitAll$2(p1);
       goto label_0018 ;
    }
    public static final Object b(r0[] p0,c p1){
       AwaitKt$awaitAll$1 uoawaitAll$1;
       AwaitKt$awaitAll$1 uoawaitAll$11;
       if (p1 instanceof AwaitKt$awaitAll$1) {
          uoawaitAll$1 = p1;
          AwaitKt$awaitAll$1 label = uoawaitAll$1.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uoawaitAll$1.label = label - i;
          label_0018 :
             AwaitKt$awaitAll$1 result = uoawaitAll$1.result;
             Object obj = b.h();
             AwaitKt$awaitAll$1 label1 = uoawaitAll$1.label;
             if (label1 != null) {
                if (label1 == 1) {
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                result = (!p0.length)? 1: null;
                if (result) {
                   uoawaitAll$11 = CollectionsKt__CollectionsKt.E();
                label_0058 :
                   return uoawaitAll$11;
                }else {
                   uoawaitAll$1.L$0 = p0;
                   uoawaitAll$1.label = 1;
                   result = new c(p0).a(uoawaitAll$1);
                   if (result == obj) {
                      return obj;
                   }
                }
             }
             uoawaitAll$11 = result;
             goto label_0058 ;
          }
       }
       uoawaitAll$1 = new AwaitKt$awaitAll$1(p1);
       goto label_0018 ;
    }
    public static final Object c(Collection p0,c p1){
       AwaitKt$joinAll$3 ojoinAll$3;
       AwaitKt$joinAll$3 l$2;
       Object obj1;
       if (p1 instanceof AwaitKt$joinAll$3) {
          ojoinAll$3 = p1;
          AwaitKt$joinAll$3 label = ojoinAll$3.label;
          int i = Integer.MIN_VALUE;
          int i1 = label & i;
          if (i1) {
             int i2 = label - i;
             ojoinAll$3.label = i2;
          label_0018 :
             AwaitKt$joinAll$3 result = ojoinAll$3.result;
             Object obj = b.h();
             AwaitKt$joinAll$3 label1 = ojoinAll$3.label;
             if (label1 != null) {
                if (label1 == 1) {
                   l$2 = ojoinAll$3.L$2;
                   j0.n(result);
                   result = ojoinAll$3.L$0;
                   label = ojoinAll$3;
                   ojoinAll$3 = ojoinAll$3.L$1;
                   obj1 = obj;
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                obj1 = obj;
                label = ojoinAll$3;
                ojoinAll$3 = p0;
                l$2 = p0.iterator();
                result = ojoinAll$3;
             }
             while (true) {
                if (!l$2.hasNext()) {
                   return l1.a;
                }
                Object obj2 = l$2.next();
                Object obj3 = obj2;
                label.L$0 = result;
                label.L$1 = ojoinAll$3;
                label.L$2 = l$2;
                label.L$3 = obj2;
                label.L$4 = obj3;
                label.label = 1;
                if (obj3.p(label) == obj1) {
                   break ;
                }
             }
             return obj1;
          }
       }
       ojoinAll$3 = new AwaitKt$joinAll$3(p1);
       goto label_0018 ;
    }
    public static final Object d(z1[] p0,c p1){
       AwaitKt$joinAll$1 ojoinAll$1;
       Object obj1;
       AwaitKt$joinAll$1 ojoinAll$11;
       int i3;
       if (p1 instanceof AwaitKt$joinAll$1) {
          ojoinAll$1 = p1;
          AwaitKt$joinAll$1 label = ojoinAll$1.label;
          int i = Integer.MIN_VALUE;
          int i1 = label & i;
          if (i1) {
             int i2 = label - i;
             ojoinAll$1.label = i2;
          label_0018 :
             AwaitKt$joinAll$1 result = ojoinAll$1.result;
             Object obj = b.h();
             AwaitKt$joinAll$1 label1 = ojoinAll$1.label;
             if (label1 != null) {
                if (label1 == 1) {
                   AwaitKt$joinAll$1 i$1 = ojoinAll$1.I$1;
                   j0.n(result);
                   result = ojoinAll$1.L$2;
                   obj1 = obj;
                   label = ojoinAll$1.L$1;
                   ojoinAll$11 = ojoinAll$1.I$0;
                   label1 = ojoinAll$1;
                   ojoinAll$1 = ojoinAll$1.L$0;
                label_0076 :
                   i3 = i$1 + 1;
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                ojoinAll$11 = p0.length;
                label1 = ojoinAll$1;
                obj1 = obj;
                result = p0;
                ojoinAll$1 = result;
                label = ojoinAll$1;
                i3 = 0;
             }
             if (i3 < ojoinAll$11) {
                object oobject = result[i3];
                label1.L$0 = ojoinAll$1;
                label1.L$1 = label;
                label1.L$2 = result;
                label1.I$0 = ojoinAll$11;
                label1.I$1 = i3;
                label1.L$3 = oobject;
                label1.L$4 = oobject;
                label1.label = 1;
                if (oobject.p(label1) == obj1) {
                   return obj1;
                }else {
                   goto label_0076 ;
                }
             }else {
                return l1.a;
             }
          }
       }
       ojoinAll$1 = new AwaitKt$joinAll$1(p1);
       goto label_0018 ;
    }
}
