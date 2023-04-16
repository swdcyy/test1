package kotlinx.coroutines.flow.internal.CombineKt$combineTransformInternal$2$invokeSuspend$$inlined$select$lambda$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import asd.c;
import kotlinx.coroutines.flow.internal.CombineKt$combineTransformInternal$2;
import kotlin.jvm.internal.Ref$BooleanRef;
import htd.y;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import ltd.e0;
import kotlinx.coroutines.flow.internal.CombineKt;
import msd.r;

public final class CombineKt$combineTransformInternal$2$invokeSuspend$$inlined$select$lambda$1 extends SuspendLambda implements p	// class@001b1d
{
    public final y $firstChannel$inlined;
    public final Ref$BooleanRef $firstIsClosed$inlined;
    public final Ref$ObjectRef $firstValue$inlined;
    public final y $secondChannel$inlined;
    public final Ref$BooleanRef $secondIsClosed$inlined;
    public final Ref$ObjectRef $secondValue$inlined;
    public Object L$0;
    public int label;
    public Object p$0;
    public final CombineKt$combineTransformInternal$2 this$0;

    public void CombineKt$combineTransformInternal$2$invokeSuspend$$inlined$select$lambda$1(c p0,CombineKt$combineTransformInternal$2 p1,Ref$BooleanRef p2,y p3,Ref$ObjectRef p4,Ref$ObjectRef p5,Ref$BooleanRef p6,y p7){
       this.this$0 = p1;
       this.$firstIsClosed$inlined = p2;
       this.$firstChannel$inlined = p3;
       this.$firstValue$inlined = p4;
       this.$secondValue$inlined = p5;
       this.$secondIsClosed$inlined = p6;
       this.$secondChannel$inlined = p7;
       super(2, p0);
    }
    public final c create(Object p0,c p1){
       CombineKt$combineTransformInternal$2$invokeSuspend$$inlined$select$lambda$1 uocombineTra = new CombineKt$combineTransformInternal$2$invokeSuspend$$inlined$select$lambda$1(p1, this.this$0, this.$firstIsClosed$inlined, this.$firstChannel$inlined, this.$firstValue$inlined, this.$secondValue$inlined, this.$secondIsClosed$inlined, this.$secondChannel$inlined);
       v9.p$0 = p0;
       return v9;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       CombineKt$combineTransformInternal$2$invokeSuspend$$inlined$select$lambda$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$0;
          this.$firstValue$inlined.element = p0;
          if (this.$secondValue$inlined.element != null) {
             tlabel = this.this$0;
             CombineKt$combineTransformInternal$2 $transform = tlabel.$transform;
             CombineKt$combineTransformInternal$2 $this_combin = tlabel.$this_combineTransformInternal;
             Ref$ObjectRef element = this.$firstValue$inlined.element;
             Ref$ObjectRef objectRef = null;
             if (element == CombineKt.e()) {
                element = objectRef;
             }
             Ref$ObjectRef element1 = this.$secondValue$inlined.element;
             if (element1 != CombineKt.e()) {
                objectRef = element1;
             }
             this.L$0 = p0;
             this.label = 1;
             if ($transform.invoke($this_combin, element, objectRef, this) == obj) {
                return obj;
             }
          }
       }
       return l1.a;
    }
}
