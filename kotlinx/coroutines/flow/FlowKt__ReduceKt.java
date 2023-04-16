package kotlinx.coroutines.flow.FlowKt__ReduceKt;
import jtd.d;
import asd.c;
import java.lang.Object;
import kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1;
import csd.b;
import kotlin.jvm.internal.Ref$ObjectRef;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import ktd.j;
import kotlinx.coroutines.flow.FlowKt__ReduceKt$a;
import jtd.e;
import java.util.NoSuchElementException;
import msd.p;
import kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3;
import kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collect$2;
import java.lang.StringBuilder;
import kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1;
import kotlinx.coroutines.flow.FlowKt__ReduceKt$b;
import kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3;
import kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collect$2;
import msd.q;
import kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$1;
import kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$$inlined$collect$1;
import nsd.c0;
import kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$1;
import kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$$inlined$collect$1;
import kotlinx.coroutines.flow.FlowKt__ReduceKt$single$1;
import kotlinx.coroutines.flow.FlowKt__ReduceKt$c;
import kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$1;
import kotlinx.coroutines.flow.FlowKt__ReduceKt$d;

public final class FlowKt__ReduceKt	// class@001a87
{

    public static final Object a(d p0,c p1){
       FlowKt__ReduceKt$first$1 uofirst$1;
       if (p1 instanceof FlowKt__ReduceKt$first$1) {
          uofirst$1 = p1;
          FlowKt__ReduceKt$first$1 label = uofirst$1.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uofirst$1.label = label - i;
          label_0018 :
             FlowKt__ReduceKt$first$1 result = uofirst$1.result;
             Object obj = b.h();
             FlowKt__ReduceKt$first$1 label1 = uofirst$1.label;
             if (label1 != null) {
                if (label1 == 1) {
                   FlowKt__ReduceKt$first$1 l$1 = uofirst$1.L$1;
                   try{
                      j0.n(result);
                   }catch(kotlinx.coroutines.flow.internal.AbortFlowException e0){
                   }
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                Ref$ObjectRef objectRef = new Ref$ObjectRef();
                e0 a = j.a;
                try{
                   objectRef.element = a;
                   uofirst$1.L$0 = p0;
                   uofirst$1.L$1 = objectRef;
                   uofirst$1.L$2 = p0;
                   uofirst$1.label = 1;
                   if (p0.b(new FlowKt__ReduceKt$a(objectRef), uofirst$1) == obj) {
                      return obj;
                   }else {
                      Ref$ObjectRef element = objectRef;
                   }
                }catch(kotlinx.coroutines.flow.internal.AbortFlowException e0){
                }
             }
          }
       }
       uofirst$1 = new FlowKt__ReduceKt$first$1(p1);
       goto label_0018 ;
    }
    public static final Object b(d p0,p p1,c p2){
       FlowKt__ReduceKt$first$3 uofirst$3;
       if (p2 instanceof FlowKt__ReduceKt$first$3) {
          uofirst$3 = p2;
          FlowKt__ReduceKt$first$3 label = uofirst$3.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uofirst$3.label = label - i;
          label_0018 :
             FlowKt__ReduceKt$first$3 result = uofirst$3.result;
             Object obj = b.h();
             FlowKt__ReduceKt$first$3 label1 = uofirst$3.label;
             if (label1 != null) {
                if (label1 == 1) {
                   FlowKt__ReduceKt$first$3 l$2 = uofirst$3.L$2;
                   FlowKt__ReduceKt$first$3 l$1 = uofirst$3.L$1;
                   try{
                      j0.n(result);
                   }catch(kotlinx.coroutines.flow.internal.AbortFlowException e0){
                   }
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                Ref$ObjectRef objectRef = new Ref$ObjectRef();
                e0 a = j.a;
                try{
                   objectRef.element = a;
                   uofirst$3.L$0 = p0;
                   uofirst$3.L$1 = p1;
                   uofirst$3.L$2 = objectRef;
                   uofirst$3.L$3 = p0;
                   uofirst$3.label = 1;
                   if (p0.b(new FlowKt__ReduceKt$first$$inlined$collect$2(p1, objectRef), uofirst$3) == obj) {
                      return obj;
                   }else {
                      Ref$ObjectRef element = objectRef;
                   }
                }catch(kotlinx.coroutines.flow.internal.AbortFlowException e0){
                }
             }
          }
       }
       uofirst$3 = new FlowKt__ReduceKt$first$3(p2);
       goto label_0018 ;
    }
    public static final Object c(d p0,c p1){
       FlowKt__ReduceKt$firstOrNull$1 uofirstOrNul;
       FlowKt__ReduceKt$firstOrNull$1 l$1;
       if (p1 instanceof FlowKt__ReduceKt$firstOrNull$1) {
          uofirstOrNul = p1;
          FlowKt__ReduceKt$firstOrNull$1 label = uofirstOrNul.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uofirstOrNul.label = label - i;
          label_0018 :
             FlowKt__ReduceKt$firstOrNull$1 result = uofirstOrNul.result;
             Object obj = b.h();
             FlowKt__ReduceKt$firstOrNull$1 label1 = uofirstOrNul.label;
             if (label1 != null) {
                if (label1 == 1) {
                   l$1 = uofirstOrNul.L$1;
                   try{
                      j0.n(result);
                   }catch(kotlinx.coroutines.flow.internal.AbortFlowException e0){
                   }
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                Ref$ObjectRef objectRef = new Ref$ObjectRef();
                Object obj1 = null;
                try{
                   objectRef.element = obj1;
                   uofirstOrNul.L$0 = p0;
                   uofirstOrNul.L$1 = objectRef;
                   uofirstOrNul.L$2 = p0;
                   uofirstOrNul.label = 1;
                   if (p0.b(new FlowKt__ReduceKt$b(objectRef), uofirstOrNul) == obj) {
                      return obj;
                   }else {
                      l$1 = objectRef;
                   }
                }catch(kotlinx.coroutines.flow.internal.AbortFlowException e0){
                }
             }
          }
       }
       uofirstOrNul = new FlowKt__ReduceKt$firstOrNull$1(p1);
       goto label_0018 ;
    }
    public static final Object d(d p0,p p1,c p2){
       FlowKt__ReduceKt$firstOrNull$3 uofirstOrNul;
       FlowKt__ReduceKt$firstOrNull$3 l$2;
       if (p2 instanceof FlowKt__ReduceKt$firstOrNull$3) {
          uofirstOrNul = p2;
          FlowKt__ReduceKt$firstOrNull$3 label = uofirstOrNul.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uofirstOrNul.label = label - i;
          label_0018 :
             FlowKt__ReduceKt$firstOrNull$3 result = uofirstOrNul.result;
             Object obj = b.h();
             FlowKt__ReduceKt$firstOrNull$3 label1 = uofirstOrNul.label;
             if (label1 != null) {
                if (label1 == 1) {
                   l$2 = uofirstOrNul.L$2;
                   try{
                      j0.n(result);
                   }catch(kotlinx.coroutines.flow.internal.AbortFlowException e0){
                   }
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                Ref$ObjectRef objectRef = new Ref$ObjectRef();
                Object obj1 = null;
                try{
                   objectRef.element = obj1;
                   uofirstOrNul.L$0 = p0;
                   uofirstOrNul.L$1 = p1;
                   uofirstOrNul.L$2 = objectRef;
                   uofirstOrNul.L$3 = p0;
                   uofirstOrNul.label = 1;
                   if (p0.b(new FlowKt__ReduceKt$firstOrNull$$inlined$collect$2(p1, objectRef), uofirstOrNul) == obj) {
                      return obj;
                   }else {
                      l$2 = objectRef;
                   }
                }catch(kotlinx.coroutines.flow.internal.AbortFlowException e0){
                }
             }
          }
       }
       uofirstOrNul = new FlowKt__ReduceKt$firstOrNull$3(p2);
       goto label_0018 ;
    }
    public static final Object e(d p0,Object p1,q p2,c p3){
       FlowKt__ReduceKt$fold$1 uofold$1;
       FlowKt__ReduceKt$fold$1 l$3;
       if (p3 instanceof FlowKt__ReduceKt$fold$1) {
          uofold$1 = p3;
          FlowKt__ReduceKt$fold$1 label = uofold$1.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             uofold$1.label = label - i;
          label_0018 :
             FlowKt__ReduceKt$fold$1 result = uofold$1.result;
             Object obj = b.h();
             FlowKt__ReduceKt$fold$1 label1 = uofold$1.label;
             if (label1 != null) {
                if (label1 == 1) {
                   l$3 = uofold$1.L$3;
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                Ref$ObjectRef objectRef = new Ref$ObjectRef();
                objectRef.element = p1;
                uofold$1.L$0 = p0;
                uofold$1.L$1 = p1;
                uofold$1.L$2 = p2;
                uofold$1.L$3 = objectRef;
                uofold$1.L$4 = p0;
                uofold$1.label = 1;
                if (p0.b(new FlowKt__ReduceKt$fold$$inlined$collect$1(objectRef, p2), uofold$1) == obj) {
                   return obj;
                }else {
                   l$3 = objectRef;
                }
             }
             return l$3.element;
          }
       }
       uofold$1 = new FlowKt__ReduceKt$fold$1(p3);
       goto label_0018 ;
    }
    public static final Object f(d p0,Object p1,q p2,c p3){
       Ref$ObjectRef objectRef = new Ref$ObjectRef();
       objectRef.element = p1;
       c0.e(0);
       p0.b(new FlowKt__ReduceKt$fold$$inlined$collect$1(objectRef, p2), p3);
       c0.e(2);
       c0.e(1);
       return objectRef.element;
    }
    public static final Object g(d p0,q p1,c p2){
       FlowKt__ReduceKt$reduce$1 oreduce$1;
       FlowKt__ReduceKt$reduce$1 l$2;
       Ref$ObjectRef element;
       if (p2 instanceof FlowKt__ReduceKt$reduce$1) {
          oreduce$1 = p2;
          FlowKt__ReduceKt$reduce$1 label = oreduce$1.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             oreduce$1.label = label - i;
          label_0018 :
             FlowKt__ReduceKt$reduce$1 result = oreduce$1.result;
             Object obj = b.h();
             FlowKt__ReduceKt$reduce$1 label1 = oreduce$1.label;
             if (label1 != null) {
                if (label1 == 1) {
                   l$2 = oreduce$1.L$2;
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                Ref$ObjectRef objectRef = new Ref$ObjectRef();
                objectRef.element = j.a;
                oreduce$1.L$0 = p0;
                oreduce$1.L$1 = p1;
                oreduce$1.L$2 = objectRef;
                oreduce$1.L$3 = p0;
                oreduce$1.label = 1;
                if (p0.b(new FlowKt__ReduceKt$reduce$$inlined$collect$1(objectRef, p1), oreduce$1) == obj) {
                   return obj;
                }else {
                   element = objectRef;
                }
             }
             element = l$2.element;
             if (element != j.a) {
                return element;
             }else {
                throw new NoSuchElementException("Empty flow can\'t be reduced");
             }
          }
       }
       oreduce$1 = new FlowKt__ReduceKt$reduce$1(p2);
       goto label_0018 ;
    }
    public static final Object h(d p0,c p1){
       FlowKt__ReduceKt$single$1 osingle$1;
       FlowKt__ReduceKt$single$1 l$1;
       Ref$ObjectRef element;
       if (p1 instanceof FlowKt__ReduceKt$single$1) {
          osingle$1 = p1;
          FlowKt__ReduceKt$single$1 label = osingle$1.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             osingle$1.label = label - i;
          label_0018 :
             FlowKt__ReduceKt$single$1 result = osingle$1.result;
             Object obj = b.h();
             FlowKt__ReduceKt$single$1 label1 = osingle$1.label;
             if (label1 != null) {
                if (label1 == 1) {
                   l$1 = osingle$1.L$1;
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                Ref$ObjectRef objectRef = new Ref$ObjectRef();
                objectRef.element = j.a;
                osingle$1.L$0 = p0;
                osingle$1.L$1 = objectRef;
                osingle$1.L$2 = p0;
                osingle$1.label = 1;
                if (p0.b(new FlowKt__ReduceKt$c(objectRef), osingle$1) == obj) {
                   return obj;
                }else {
                   element = objectRef;
                }
             }
             element = l$1.element;
             if (element != j.a) {
                return element;
             }else {
                throw new NoSuchElementException("Expected at least one element");
             }
          }
       }
       osingle$1 = new FlowKt__ReduceKt$single$1(p1);
       goto label_0018 ;
    }
    public static final Object i(d p0,c p1){
       FlowKt__ReduceKt$singleOrNull$1 osingleOrNul;
       FlowKt__ReduceKt$singleOrNull$1 l$1;
       if (p1 instanceof FlowKt__ReduceKt$singleOrNull$1) {
          osingleOrNul = p1;
          FlowKt__ReduceKt$singleOrNull$1 label = osingleOrNul.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             osingleOrNul.label = label - i;
          label_0018 :
             FlowKt__ReduceKt$singleOrNull$1 result = osingleOrNul.result;
             Object obj = b.h();
             FlowKt__ReduceKt$singleOrNull$1 label1 = osingleOrNul.label;
             if (label1 != null) {
                if (label1 == 1) {
                   l$1 = osingleOrNul.L$1;
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                Ref$ObjectRef objectRef = new Ref$ObjectRef();
                objectRef.element = null;
                osingleOrNul.L$0 = p0;
                osingleOrNul.L$1 = objectRef;
                osingleOrNul.L$2 = p0;
                osingleOrNul.label = 1;
                if (p0.b(new FlowKt__ReduceKt$d(objectRef), osingleOrNul) == obj) {
                   return obj;
                }else {
                   l$1 = objectRef;
                }
             }
             return l$1.element;
          }
       }
       osingleOrNul = new FlowKt__ReduceKt$singleOrNull$1(p1);
       goto label_0018 ;
    }
}
