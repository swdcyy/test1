package kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import jtd.e;
import jtd.d;
import msd.a;
import msd.q;
import asd.c;
import java.lang.Object;
import ftd.k0;
import qrd.l1;
import csd.b;
import kotlin.jvm.internal.Ref$IntRef;
import java.lang.Boolean;
import htd.y;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Integer;
import dsd.a;
import java.lang.Number;
import kotlinx.coroutines.flow.internal.CombineKt;
import otd.b;
import kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$invokeSuspend$$inlined$select$lambda$1;
import otd.d;
import kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$invokeSuspend$$inlined$select$lambda$2;
import otd.a;
import java.lang.Throwable;
import dsd.e;

public final class CombineKt$combineInternal$2 extends SuspendLambda implements p	// class@001b1c
{
    public final a $arrayFactory;
    public final d[] $flows;
    public final e $this_combineInternal;
    public final q $transform;
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public int label;
    public k0 p$;

    public void CombineKt$combineInternal$2(e p0,d[] p1,a p2,q p3,c p4){
       this.$this_combineInternal = p0;
       this.$flows = p1;
       this.$arrayFactory = p2;
       this.$transform = p3;
       super(2, p4);
    }
    public final c create(Object p0,c p1){
       CombineKt$combineInternal$2 uocombineInt = new CombineKt$combineInternal$2(this.$this_combineInternal, this.$flows, this.$arrayFactory, this.$transform, p1);
       v6.p$ = p0;
       return v6;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       boolean b;
       CombineKt$combineInternal$2 uocombineInt1;
       CombineKt$combineInternal$2 uocombineInt2;
       CombineKt$combineInternal$2 uocombineInt3;
       CombineKt$combineInternal$2 uocombineInt4;
       CombineKt$combineInternal$2 uocombineInt5;
       Object obj1;
       CombineKt$combineInternal$2 uocombineInt6;
       CombineKt$combineInternal$2 uocombineInt7;
       CombineKt$combineInternal$2 uocombineInt8;
       b uob1;
       CombineKt$combineInternal$2 uocombineInt9;
       CombineKt$combineInternal$2 uocombineInt10;
       CombineKt$combineInternal$2 uocombineInt11;
       CombineKt$combineInternal$2 uocombineInt12;
       CombineKt$combineInternal$2 uocombineInt13;
       CombineKt$combineInternal$2 uocombineInt14;
       CombineKt$combineInternal$2 uocombineInt15;
       CombineKt$combineInternal$2 uocombineInt17;
       CombineKt$combineInternal$2$invokeSuspend$$inlined$select$lambda$2 uocombineInt18;
       CombineKt$combineInternal$2 uocombineInt = this;
       Object obj = b.h();
       CombineKt$combineInternal$2 label = uocombineInt.label;
       b = false;
       int i = 1;
       if (label != null) {
          if (label == i) {
             j0.n(p0);
             uocombineInt1 = uocombineInt.L$5;
             uocombineInt2 = uocombineInt.L$4;
             uocombineInt3 = uocombineInt.L$3;
             uocombineInt4 = uocombineInt.L$2;
             uocombineInt5 = uocombineInt.L$1;
             obj1 = obj;
             uocombineInt6 = uocombineInt;
             uocombineInt7 = uocombineInt.I$0;
             uocombineInt8 = uocombineInt.L$0;
          label_0164 :
             i = 1;
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          label = uocombineInt.p$;
          int len = uocombineInt.$flows.length;
          y[] oyArray = new y[len];
          for (int i2 = 0; i2 < len; i2 = i2 + 1) {
             oyArray[i2] = CombineKt.b(label, uocombineInt.$flows[a.f(i2).intValue()]);
          }
          Object[] objArray = new Object[len];
          Boolean[] uBooleanArra = new Boolean[len];
          for (int i3 = 0; i3 < len; i3 = i3 + 1) {
             a.f(i3).intValue();
             uBooleanArra[i3] = a.a(b);
          }
          Ref$IntRef intRef = new Ref$IntRef();
          intRef.element = len;
          Ref$IntRef intRef1 = new Ref$IntRef();
          intRef1.element = len;
          uocombineInt5 = oyArray;
          uocombineInt4 = objArray;
          uocombineInt3 = uBooleanArra;
          uocombineInt2 = intRef;
          uocombineInt1 = intRef1;
          uocombineInt6 = uocombineInt;
          uocombineInt8 = label;
          uocombineInt7 = len;
          obj1 = obj;
       }
       if (uocombineInt2.element != null) {
          uocombineInt6.L$0 = uocombineInt8;
          uocombineInt6.I$0 = uocombineInt7;
          uocombineInt6.L$1 = uocombineInt5;
          uocombineInt6.L$2 = uocombineInt4;
          uocombineInt6.L$3 = uocombineInt3;
          uocombineInt6.L$4 = uocombineInt2;
          uocombineInt6.L$5 = uocombineInt1;
          uocombineInt6.L$6 = uocombineInt6;
          uocombineInt6.label = i;
          b uob = new b(uocombineInt6);
          int i1 = 0;
          while (i1 < uocombineInt7) {
             object oobject = uocombineInt5[i1];
             uob1 = uob;
             uocombineInt9 = uocombineInt6;
             uocombineInt10 = uocombineInt8;
             uocombineInt11 = uocombineInt7;
             uocombineInt12 = uocombineInt5;
             uocombineInt13 = uocombineInt4;
             uocombineInt14 = uocombineInt3;
             uocombineInt15 = uocombineInt2;
             CombineKt$combineInternal$2$invokeSuspend$$inlined$select$lambda$1 uocombineInt16 = new CombineKt$combineInternal$2$invokeSuspend$$inlined$select$lambda$1(i1, null, uocombineInt6, uocombineInt7, uocombineInt3, uocombineInt5, uocombineInt4, uocombineInt1, uocombineInt2);
             if (uocombineInt3[i1].booleanValue()) {
                uocombineInt17 = uocombineInt1;
             }else {
                CombineKt$combineInternal$2$invokeSuspend$$inlined$select$lambda$2 uocombineInt19 = uocombineInt3;
                uocombineInt18 = uocombineInt3;
                uocombineInt17 = uocombineInt1;
                uocombineInt19 = new CombineKt$combineInternal$2$invokeSuspend$$inlined$select$lambda$2(v18, null, i1, uocombineInt9, uocombineInt11, uocombineInt14, uocombineInt12, uocombineInt13, uocombineInt1, uocombineInt15);
                uob1.f(oobject.B(), uocombineInt18);
             }
             i1 = i1 + 1;
             uob = uob1;
             uocombineInt1 = uocombineInt17;
             uocombineInt6 = uocombineInt9;
             uocombineInt8 = uocombineInt10;
             uocombineInt7 = uocombineInt11;
             uocombineInt5 = uocombineInt12;
             uocombineInt4 = uocombineInt13;
             uocombineInt3 = uocombineInt14;
             uocombineInt2 = uocombineInt15;
             uocombineInt18 = 1;
          }
          uob1 = uob;
          uocombineInt9 = uocombineInt6;
          uocombineInt10 = uocombineInt8;
          uocombineInt11 = uocombineInt7;
          uocombineInt12 = uocombineInt5;
          uocombineInt13 = uocombineInt4;
          uocombineInt14 = uocombineInt3;
          uocombineInt15 = uocombineInt2;
          uocombineInt17 = uocombineInt1;
          obj = uob1.h0();
          if (obj == b.h()) {
             e.c(uocombineInt9);
          }
          if (obj == obj1) {
             return obj1;
          }else {
             uocombineInt1 = uocombineInt17;
             uocombineInt6 = uocombineInt9;
             uocombineInt8 = uocombineInt10;
             uocombineInt7 = uocombineInt11;
             uocombineInt5 = uocombineInt12;
             uocombineInt4 = uocombineInt13;
             uocombineInt3 = uocombineInt14;
             uocombineInt2 = uocombineInt15;
             goto label_0164 ;
          }
       }else {
          return l1.a;
       }
    }
}
