package kotlinx.coroutines.flow.internal.CombineKt$combineTransformInternal$2$invokeSuspend$$inlined$select$lambda$4;
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

public final class CombineKt$combineTransformInternal$2$invokeSuspend$$inlined$select$lambda$4 extends SuspendLambda implements p	// class@001b20
{
    public final y $firstChannel$inlined;
    public final Ref$BooleanRef $firstIsClosed$inlined;
    public final Ref$ObjectRef $firstValue$inlined;
    public final p $onReceive;
    public final y $secondChannel$inlined;
    public final Ref$BooleanRef $secondIsClosed$inlined;
    public final Ref$ObjectRef $secondValue$inlined;
    public Object L$0;
    public int label;
    public Object p$0;
    public final CombineKt$combineTransformInternal$2 this$0;

    public void CombineKt$combineTransformInternal$2$invokeSuspend$$inlined$select$lambda$4(p p0,c p1,CombineKt$combineTransformInternal$2 p2,Ref$BooleanRef p3,y p4,Ref$ObjectRef p5,Ref$ObjectRef p6,Ref$BooleanRef p7,y p8){
       this.$onReceive = p0;
       this.this$0 = p2;
       this.$firstIsClosed$inlined = p3;
       this.$firstChannel$inlined = p4;
       this.$firstValue$inlined = p5;
       this.$secondValue$inlined = p6;
       this.$secondIsClosed$inlined = p7;
       this.$secondChannel$inlined = p8;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       CombineKt$combineTransformInternal$2$invokeSuspend$$inlined$select$lambda$4 uocombineTra = new CombineKt$combineTransformInternal$2$invokeSuspend$$inlined$select$lambda$4(this.$onReceive, p1, this.this$0, this.$firstIsClosed$inlined, this.$firstChannel$inlined, this.$firstValue$inlined, this.$secondValue$inlined, this.$secondIsClosed$inlined, this.$secondChannel$inlined);
       v10.p$0 = p0;
       return v10;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       CombineKt$combineTransformInternal$2$invokeSuspend$$inlined$select$lambda$4 tlabel = this.label;
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
             p0.element = true;
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
