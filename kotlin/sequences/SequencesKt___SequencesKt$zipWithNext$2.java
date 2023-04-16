package kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2;
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

public final class SequencesKt___SequencesKt$zipWithNext$2 extends RestrictedSuspendLambda implements p	// class@0018e6
{
    public final m $this_zipWithNext;
    public final p $transform;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public o p$;

    public void SequencesKt___SequencesKt$zipWithNext$2(m p0,p p1,c p2){
       this.$this_zipWithNext = p0;
       this.$transform = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       a.p(p1, "completion");
       SequencesKt___SequencesKt$zipWithNext$2 ozipWithNext = new SequencesKt___SequencesKt$zipWithNext$2(this.$this_zipWithNext, this.$transform, p1);
       ozipWithNext.p$ = p0;
       return ozipWithNext;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       SequencesKt___SequencesKt$zipWithNext$2 tL$1;
       SequencesKt___SequencesKt$zipWithNext$2 tL$0;
       Object obj = b.h();
       SequencesKt___SequencesKt$zipWithNext$2 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             tL$1 = this.L$1;
             tL$0 = this.L$0;
             j0.n(p0);
             p0 = this.L$3;
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          Iterator iterator = this.$this_zipWithNext.iterator();
          if (!iterator.hasNext()) {
             return l1.a;
          }else {
             tL$0 = p0;
             p0 = iterator.next();
             tL$1 = iterator;
          }
       }
       tlabel = this;
       while (true) {
          if (!tL$1.hasNext()) {
             return l1.a;
          }
          Object obj1 = tL$1.next();
          tlabel.L$0 = tL$0;
          tlabel.L$1 = tL$1;
          tlabel.L$2 = p0;
          tlabel.L$3 = obj1;
          tlabel.label = 1;
          if (tL$0.b(tlabel.$transform.invoke(p0, obj1), tlabel) == obj) {
             break ;
          }else {
             p0 = obj1;
          }
       }
       return obj;
    }
}
