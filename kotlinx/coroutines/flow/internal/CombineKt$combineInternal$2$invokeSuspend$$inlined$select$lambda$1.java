package kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$invokeSuspend$$inlined$select$lambda$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import asd.c;
import kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2;
import java.lang.Boolean;
import htd.y;
import java.lang.Object;
import kotlin.jvm.internal.Ref$IntRef;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import msd.a;
import ktd.j;
import msd.q;
import kotlin.TypeCastException;

public final class CombineKt$combineInternal$2$invokeSuspend$$inlined$select$lambda$1 extends SuspendLambda implements p	// class@001b1a
{
    public final y[] $channels$inlined;
    public final int $i;
    public final Boolean[] $isClosed$inlined;
    public final Object[] $latestValues$inlined;
    public final Ref$IntRef $nonClosed$inlined;
    public final Ref$IntRef $remainingNulls$inlined;
    public final int $size$inlined;
    public Object L$0;
    public Object L$1;
    public int label;
    public Object p$0;
    public final CombineKt$combineInternal$2 this$0;

    public void CombineKt$combineInternal$2$invokeSuspend$$inlined$select$lambda$1(int p0,c p1,CombineKt$combineInternal$2 p2,int p3,Boolean[] p4,y[] p5,Object[] p6,Ref$IntRef p7,Ref$IntRef p8){
       this.$i = p0;
       this.this$0 = p2;
       this.$size$inlined = p3;
       this.$isClosed$inlined = p4;
       this.$channels$inlined = p5;
       this.$latestValues$inlined = p6;
       this.$remainingNulls$inlined = p7;
       this.$nonClosed$inlined = p8;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       CombineKt$combineInternal$2$invokeSuspend$$inlined$select$lambda$1 uocombineInt = new CombineKt$combineInternal$2$invokeSuspend$$inlined$select$lambda$1(this.$i, p1, this.this$0, this.$size$inlined, this.$isClosed$inlined, this.$channels$inlined, this.$latestValues$inlined, this.$remainingNulls$inlined, this.$nonClosed$inlined);
       v10.p$0 = p0;
       return v10;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       CombineKt$combineInternal$2$invokeSuspend$$inlined$select$lambda$1 t$remainingN;
       Object obj = b.h();
       CombineKt$combineInternal$2$invokeSuspend$$inlined$select$lambda$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$0;
          tlabel = this.$latestValues$inlined;
          CombineKt$combineInternal$2$invokeSuspend$$inlined$select$lambda$1 t$i = this.$i;
          if (tlabel[t$i] == null) {
             t$remainingN = this.$remainingNulls$inlined;
             t$remainingN.element = t$remainingN.element - 1;
          }
          tlabel[t$i] = p0;
          if (this.$remainingNulls$inlined.element != null) {
             return l1.a;
          }else {
             Object[] objArray = this.this$0.$arrayFactory.invoke();
             t$remainingN = this.$size$inlined;
             for (int i = 0; i < t$remainingN; i = i + 1) {
                object oobject = this.$latestValues$inlined[i];
                if (oobject == j.a) {
                   oobject = null;
                }
                objArray[i] = oobject;
             }
             t$i = this.this$0;
             CombineKt$combineInternal$2 $transform = t$i.$transform;
             CombineKt$combineInternal$2 $this_combin = t$i.$this_combineInternal;
             if (objArray != null) {
                this.L$0 = p0;
                this.L$1 = objArray;
                this.label = 1;
                if ($transform.invoke($this_combin, objArray, this) == obj) {
                   return obj;
                }
             }else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
             }
          }
       }
       return l1.a;
    }
}
