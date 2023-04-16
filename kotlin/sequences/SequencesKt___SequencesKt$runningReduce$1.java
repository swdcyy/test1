package kotlin.sequences.SequencesKt___SequencesKt$runningReduce$1;
import msd.p;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import wsd.m;
import asd.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import wsd.o;
import qrd.l1;
import csd.b;
import java.util.Iterator;
import qrd.j0;
import java.lang.IllegalStateException;

public final class SequencesKt___SequencesKt$runningReduce$1 extends RestrictedSuspendLambda implements p	// class@0018e2
{
    public final p $operation;
    public final m $this_runningReduce;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public o p$;

    public void SequencesKt___SequencesKt$runningReduce$1(m p0,p p1,c p2){
       this.$this_runningReduce = p0;
       this.$operation = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       a.p(p1, "completion");
       SequencesKt___SequencesKt$runningReduce$1 orunningRedu = new SequencesKt___SequencesKt$runningReduce$1(this.$this_runningReduce, this.$operation, p1);
       orunningRedu.p$ = p0;
       return orunningRedu;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       SequencesKt___SequencesKt$runningReduce$1 tL$0;
       Object obj = b.h();
       SequencesKt___SequencesKt$runningReduce$1 tlabel = this.label;
       SequencesKt___SequencesKt$runningReduce$1 orunningRedu = 1;
       if (tlabel != null) {
          if (tlabel == orunningRedu || tlabel == 2) {
             tlabel = this.L$2;
             orunningRedu = this.L$1;
             tL$0 = this.L$0;
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          tL$0 = this.p$;
          p0 = this.$this_runningReduce.iterator();
          if (p0.hasNext()) {
             tlabel = p0.next();
             this.L$0 = tL$0;
             this.L$1 = p0;
             this.L$2 = tlabel;
             this.label = orunningRedu;
             if (tL$0.b(tlabel, this) == obj) {
                return obj;
             }else {
                Iterator iterator = p0;
             }
          }else {
          }
       }
       p0 = this;
       while (orunningRedu.hasNext()) {
          Object obj1 = p0.$operation.invoke(tlabel, orunningRedu.next());
          p0.L$0 = tL$0;
          p0.L$1 = orunningRedu;
          p0.L$2 = obj1;
          p0.label = 2;
          if (tL$0.b(obj1, p0) == obj) {
             return obj;
          }
       }
       return l1.a;
    }
}
