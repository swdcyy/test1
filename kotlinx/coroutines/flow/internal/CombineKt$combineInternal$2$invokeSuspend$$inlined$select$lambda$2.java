package kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$invokeSuspend$$inlined$select$lambda$2;
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
import dsd.a;

public final class CombineKt$combineInternal$2$invokeSuspend$$inlined$select$lambda$2 extends SuspendLambda implements p	// class@001b1b
{
    public final y[] $channels$inlined;
    public final int $i$inlined;
    public final Boolean[] $isClosed$inlined;
    public final Object[] $latestValues$inlined;
    public final Ref$IntRef $nonClosed$inlined;
    public final p $onReceive;
    public final Ref$IntRef $remainingNulls$inlined;
    public final int $size$inlined;
    public Object L$0;
    public int label;
    public Object p$0;
    public final CombineKt$combineInternal$2 this$0;

    public void CombineKt$combineInternal$2$invokeSuspend$$inlined$select$lambda$2(p p0,c p1,int p2,CombineKt$combineInternal$2 p3,int p4,Boolean[] p5,y[] p6,Object[] p7,Ref$IntRef p8,Ref$IntRef p9){
       this.$onReceive = p0;
       this.$i$inlined = p2;
       this.this$0 = p3;
       this.$size$inlined = p4;
       this.$isClosed$inlined = p5;
       this.$channels$inlined = p6;
       this.$latestValues$inlined = p7;
       this.$remainingNulls$inlined = p8;
       this.$nonClosed$inlined = p9;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       CombineKt$combineInternal$2$invokeSuspend$$inlined$select$lambda$2 uocombineInt = new CombineKt$combineInternal$2$invokeSuspend$$inlined$select$lambda$2(this.$onReceive, p1, this.$i$inlined, this.this$0, this.$size$inlined, this.$isClosed$inlined, this.$channels$inlined, this.$latestValues$inlined, this.$remainingNulls$inlined, this.$nonClosed$inlined);
       v11.p$0 = p0;
       return v11;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       CombineKt$combineInternal$2$invokeSuspend$$inlined$select$lambda$2 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == true) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$0;
          if (p0 == null) {
             p0[this.$i$inlined] = a.a(true);
             p0 = this.$nonClosed$inlined;
             p0.element = p0.element - 1;
          }else {
             this.L$0 = p0;
             this.label = 1;
             if (this.$onReceive.invoke(p0, this) == obj) {
                return obj;
             }
          }
       }
       return l1.a;
    }
}
