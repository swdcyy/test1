package kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1;
import msd.p;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import wsd.m;
import msd.q;
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
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Integer;
import dsd.a;

public final class SequencesKt___SequencesKt$runningReduceIndexed$1 extends RestrictedSuspendLambda implements p	// class@0018e3
{
    public final q $operation;
    public final m $this_runningReduceIndexed;
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public o p$;

    public void SequencesKt___SequencesKt$runningReduceIndexed$1(m p0,q p1,c p2){
       this.$this_runningReduceIndexed = p0;
       this.$operation = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       a.p(p1, "completion");
       SequencesKt___SequencesKt$runningReduceIndexed$1 orunningRedu = new SequencesKt___SequencesKt$runningReduceIndexed$1(this.$this_runningReduceIndexed, this.$operation, p1);
       orunningRedu.p$ = p0;
       return orunningRedu;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       SequencesKt___SequencesKt$runningReduceIndexed$1 tL$1;
       SequencesKt___SequencesKt$runningReduceIndexed$1 tL$0;
       Object obj = b.h();
       SequencesKt___SequencesKt$runningReduceIndexed$1 tlabel = this.label;
       SequencesKt___SequencesKt$runningReduceIndexed$1 orunningRedu = 1;
       if (tlabel != null) {
          if (tlabel != orunningRedu) {
             if (tlabel == 2) {
                tL$1 = this.L$1;
                tL$0 = this.L$0;
                j0.n(p0);
                p0 = this;
                orunningRedu = this.I$0;
                tlabel = this.L$2;
                while (tL$1.hasNext()) {
                   SequencesKt___SequencesKt$runningReduceIndexed$1 $operation = p0.$operation;
                   int i = orunningRedu + 1;
                   if (orunningRedu < 0) {
                      CollectionsKt__CollectionsKt.W();
                   }
                   Object obj1 = $operation.invoke(a.f(orunningRedu), tlabel, tL$1.next());
                   p0.L$0 = tL$0;
                   p0.L$1 = tL$1;
                   p0.L$2 = obj1;
                   p0.I$0 = i;
                   p0.label = 2;
                   if (tL$0.b(obj1, p0) == obj) {
                      return obj;
                   }
                   tlabel = obj1;
                   orunningRedu = i;
                }
                return l1.a;
             }else {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
             }
          }else {
             tlabel = this.L$2;
             tL$1 = this.L$1;
             tL$0 = this.L$0;
             j0.n(p0);
          }
       }else {
          j0.n(p0);
          tL$0 = this.p$;
          tL$1 = this.$this_runningReduceIndexed.iterator();
          if (tL$1.hasNext()) {
             tlabel = tL$1.next();
             this.L$0 = tL$0;
             this.L$1 = tL$1;
             this.L$2 = tlabel;
             this.label = orunningRedu;
             if (tL$0.b(tlabel, this) == obj) {
                return obj;
             }
          }else {
             goto label_008c ;
          }
       }
       p0 = this;
       goto label_005d ;
    }
}
