package kotlinx.coroutines.flow.internal.CombineKt$combineTransformInternal$2;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import jtd.e;
import jtd.d;
import msd.r;
import asd.c;
import java.lang.Object;
import ftd.k0;
import qrd.l1;
import csd.b;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import htd.y;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import kotlinx.coroutines.flow.internal.CombineKt;
import otd.b;
import kotlinx.coroutines.flow.internal.CombineKt$combineTransformInternal$2$invokeSuspend$$inlined$select$lambda$1;
import otd.d;
import kotlinx.coroutines.flow.internal.CombineKt$combineTransformInternal$2$invokeSuspend$$inlined$select$lambda$2;
import otd.a;
import kotlinx.coroutines.flow.internal.CombineKt$combineTransformInternal$2$invokeSuspend$$inlined$select$lambda$3;
import kotlinx.coroutines.flow.internal.CombineKt$combineTransformInternal$2$invokeSuspend$$inlined$select$lambda$4;
import java.lang.Throwable;
import dsd.e;

public final class CombineKt$combineTransformInternal$2 extends SuspendLambda implements p	// class@001b21
{
    public final d $first;
    public final d $second;
    public final e $this_combineTransformInternal;
    public final r $transform;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public int label;
    public k0 p$;

    public void CombineKt$combineTransformInternal$2(e p0,d p1,d p2,r p3,c p4){
       this.$this_combineTransformInternal = p0;
       this.$first = p1;
       this.$second = p2;
       this.$transform = p3;
       super(2, p4);
    }
    public final c create(Object p0,c p1){
       CombineKt$combineTransformInternal$2 uocombineTra = new CombineKt$combineTransformInternal$2(this.$this_combineTransformInternal, this.$first, this.$second, this.$transform, p1);
       v6.p$ = p0;
       return v6;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       CombineKt$combineTransformInternal$2 l$0;
       CombineKt$combineTransformInternal$2 uocombineTra1;
       CombineKt$combineTransformInternal$2 uocombineTra2;
       CombineKt$combineTransformInternal$2 uocombineTra3;
       CombineKt$combineTransformInternal$2 uocombineTra4;
       CombineKt$combineTransformInternal$2 uocombineTra5;
       CombineKt$combineTransformInternal$2 uocombineTra6;
       Object obj1;
       CombineKt$combineTransformInternal$2 uocombineTra7;
       CombineKt$combineTransformInternal$2 uocombineTra15;
       CombineKt$combineTransformInternal$2$invokeSuspend$$inlined$select$lambda$4 this;
       CombineKt$combineTransformInternal$2 uocombineTra = this;
       Object obj = b.h();
       CombineKt$combineTransformInternal$2 label = uocombineTra.label;
       int i = 1;
       if (label != null) {
          if (label == i) {
             l$0 = uocombineTra.L$0;
             j0.n(p0);
             uocombineTra1 = uocombineTra.L$6;
             uocombineTra2 = uocombineTra.L$5;
             uocombineTra3 = uocombineTra.L$4;
             uocombineTra4 = uocombineTra.L$3;
             uocombineTra5 = uocombineTra.L$2;
             uocombineTra6 = uocombineTra.L$1;
             obj1 = obj;
             uocombineTra7 = uocombineTra;
          label_0147 :
             i = 1;
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          label = uocombineTra.p$;
          y oy = CombineKt.b(label, uocombineTra.$first);
          Ref$ObjectRef objectRef = new Ref$ObjectRef();
          objectRef.element = null;
          Ref$ObjectRef objectRef1 = new Ref$ObjectRef();
          objectRef1.element = null;
          Ref$BooleanRef uBooleanRef = new Ref$BooleanRef();
          uBooleanRef.element = false;
          Ref$BooleanRef uBooleanRef1 = new Ref$BooleanRef();
          uBooleanRef1.element = false;
          l$0 = label;
          uocombineTra5 = CombineKt.b(label, uocombineTra.$second);
          uocombineTra4 = objectRef;
          uocombineTra2 = uBooleanRef;
          uocombineTra3 = objectRef1;
          uocombineTra1 = uBooleanRef1;
          obj1 = obj;
          uocombineTra7 = uocombineTra;
          uocombineTra6 = oy;
       }
       if (uocombineTra2.element == null || uocombineTra1.element == null) {
          uocombineTra7.L$0 = l$0;
          uocombineTra7.L$1 = uocombineTra6;
          uocombineTra7.L$2 = uocombineTra5;
          uocombineTra7.L$3 = uocombineTra4;
          uocombineTra7.L$4 = uocombineTra3;
          uocombineTra7.L$5 = uocombineTra2;
          uocombineTra7.L$6 = uocombineTra1;
          uocombineTra7.L$7 = uocombineTra7;
          uocombineTra7.label = i;
          CombineKt$combineTransformInternal$2 uocombineTra8 = uocombineTra7;
          b uob = new b(uocombineTra7);
          CombineKt$combineTransformInternal$2 uocombineTra9 = uocombineTra7;
          CombineKt$combineTransformInternal$2 uocombineTra10 = l$0;
          CombineKt$combineTransformInternal$2 uocombineTra11 = uocombineTra6;
          CombineKt$combineTransformInternal$2 uocombineTra12 = uocombineTra5;
          CombineKt$combineTransformInternal$2 uocombineTra13 = uocombineTra4;
          CombineKt$combineTransformInternal$2$invokeSuspend$$inlined$select$lambda$1 uocombineTra14 = new CombineKt$combineTransformInternal$2$invokeSuspend$$inlined$select$lambda$1(null, uocombineTra8, uocombineTra2, uocombineTra6, uocombineTra4, uocombineTra3, uocombineTra1, uocombineTra12);
          if (uocombineTra2.element != null) {
             uocombineTra15 = uocombineTra3;
          }else {
             CombineKt$combineTransformInternal$2$invokeSuspend$$inlined$select$lambda$2 uocombineTra19 = uocombineTra4;
             CombineKt$combineTransformInternal$2$invokeSuspend$$inlined$select$lambda$2 uocombineTra20 = uocombineTra4;
             uocombineTra15 = uocombineTra3;
             uocombineTra19 = new CombineKt$combineTransformInternal$2$invokeSuspend$$inlined$select$lambda$2(v16, null, uocombineTra9, uocombineTra2, uocombineTra11, uocombineTra13, uocombineTra3, uocombineTra1, uocombineTra12);
             uob.f(uocombineTra11.B(), uocombineTra20);
          }
          CombineKt$combineTransformInternal$2$invokeSuspend$$inlined$select$lambda$3 uocombineTra16 = new CombineKt$combineTransformInternal$2$invokeSuspend$$inlined$select$lambda$3(null, uocombineTra9, uocombineTra2, uocombineTra11, uocombineTra13, uocombineTra15, uocombineTra1, uocombineTra12);
          if (uocombineTra1.element == null) {
             CombineKt$combineTransformInternal$2$invokeSuspend$$inlined$select$lambda$4 uocombineTra17 = uocombineTra4;
             CombineKt$combineTransformInternal$2$invokeSuspend$$inlined$select$lambda$4 uocombineTra18 = uocombineTra4;
             this = uocombineTra18;
             uocombineTra17 = new CombineKt$combineTransformInternal$2$invokeSuspend$$inlined$select$lambda$4(uocombineTra3, null, uocombineTra9, uocombineTra2, uocombineTra11, uocombineTra13, uocombineTra15, uocombineTra1, uocombineTra12);
             uob.f(uocombineTra12.B(), this);
          }
          obj = uob.h0();
          if (obj == b.h()) {
             e.c(uocombineTra9);
          }
          if (obj == obj1) {
             return obj1;
          }else {
             uocombineTra3 = uocombineTra15;
             uocombineTra7 = uocombineTra9;
             l$0 = uocombineTra10;
             uocombineTra6 = uocombineTra11;
             uocombineTra5 = uocombineTra12;
             uocombineTra4 = uocombineTra13;
             goto label_0147 ;
          }
       }else {
          return l1.a;
       }
    }
}
