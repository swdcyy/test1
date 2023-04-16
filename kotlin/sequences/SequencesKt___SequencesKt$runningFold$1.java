package kotlin.sequences.SequencesKt___SequencesKt$runningFold$1;
import msd.p;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import wsd.m;
import java.lang.Object;
import asd.c;
import java.lang.String;
import kotlin.jvm.internal.a;
import wsd.o;
import qrd.l1;
import csd.b;
import java.util.Iterator;
import qrd.j0;
import java.lang.IllegalStateException;

public final class SequencesKt___SequencesKt$runningFold$1 extends RestrictedSuspendLambda implements p	// class@0018e0
{
    public final Object $initial;
    public final p $operation;
    public final m $this_runningFold;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public o p$;

    public void SequencesKt___SequencesKt$runningFold$1(m p0,Object p1,p p2,c p3){
       this.$this_runningFold = p0;
       this.$initial = p1;
       this.$operation = p2;
       super(2, p3);
    }
    public final c create(Object p0,c p1){
       a.p(p1, "completion");
       SequencesKt___SequencesKt$runningFold$1 orunningFold = new SequencesKt___SequencesKt$runningFold$1(this.$this_runningFold, this.$initial, this.$operation, p1);
       orunningFold.p$ = p0;
       return orunningFold;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       SequencesKt___SequencesKt$runningFold$1 tL$0;
       Object obj = b.h();
       SequencesKt___SequencesKt$runningFold$1 tlabel = this.label;
       SequencesKt___SequencesKt$runningFold$1 orunningFold = 1;
       if (tlabel != null) {
          if (tlabel != orunningFold) {
             if (tlabel == 2) {
                tlabel = this.L$3;
                tL$0 = this.L$0;
                j0.n(p0);
                p0 = this.L$1;
             label_0049 :
                Object obj1 = this;
                while (true) {
                   if (!tlabel.hasNext()) {
                      return l1.a;
                   }
                   Object obj2 = tlabel.next();
                   p0 = obj1.$operation.invoke(p0, obj2);
                   obj1.L$0 = tL$0;
                   obj1.L$1 = p0;
                   obj1.L$2 = obj2;
                   obj1.L$3 = tlabel;
                   obj1.label = 2;
                   if (tL$0.b(p0, obj1) == obj) {
                      break ;
                   }
                }
                return obj;
             }else {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
             }
          }else {
             tlabel = this.L$0;
             j0.n(p0);
          }
       }else {
          j0.n(p0);
          tlabel = this.p$;
          this.L$0 = tlabel;
          this.label = orunningFold;
          if (tlabel.b(this.$initial, this) == obj) {
             return obj;
          }
       }
       p0 = this.$initial;
       tL$0 = tlabel;
       Iterator iterator = this.$this_runningFold.iterator();
       goto label_0049 ;
    }
}
