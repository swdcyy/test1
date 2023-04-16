package kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1;
import msd.p;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import wsd.m;
import java.lang.Object;
import msd.q;
import asd.c;
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

public final class SequencesKt___SequencesKt$runningFoldIndexed$1 extends RestrictedSuspendLambda implements p	// class@0018e1
{
    public final Object $initial;
    public final q $operation;
    public final m $this_runningFoldIndexed;
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public o p$;

    public void SequencesKt___SequencesKt$runningFoldIndexed$1(m p0,Object p1,q p2,c p3){
       this.$this_runningFoldIndexed = p0;
       this.$initial = p1;
       this.$operation = p2;
       super(2, p3);
    }
    public final c create(Object p0,c p1){
       a.p(p1, "completion");
       SequencesKt___SequencesKt$runningFoldIndexed$1 orunningFold = new SequencesKt___SequencesKt$runningFoldIndexed$1(this.$this_runningFoldIndexed, this.$initial, this.$operation, p1);
       orunningFold.p$ = p0;
       return orunningFold;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       SequencesKt___SequencesKt$runningFoldIndexed$1 tL$0;
       int i1;
       Object obj = b.h();
       SequencesKt___SequencesKt$runningFoldIndexed$1 tlabel = this.label;
       SequencesKt___SequencesKt$runningFoldIndexed$1 orunningFold = 1;
       if (tlabel != null) {
          if (tlabel != orunningFold) {
             if (tlabel == 2) {
                tlabel = this.L$3;
                orunningFold = this.L$1;
                tL$0 = this.L$0;
                j0.n(p0);
                p0 = this.I$0;
             label_004c :
                Object obj1 = this;
                while (true) {
                   if (!tlabel.hasNext()) {
                      return l1.a;
                   }
                   Object obj2 = tlabel.next();
                   SequencesKt___SequencesKt$runningFoldIndexed$1 $operation = obj1.$operation;
                   int i = p0 + 1;
                   if (p0 < 0) {
                      CollectionsKt__CollectionsKt.W();
                   }
                   Object obj3 = $operation.invoke(a.f(p0), orunningFold, obj2);
                   obj1.L$0 = tL$0;
                   obj1.I$0 = i;
                   obj1.L$1 = obj3;
                   obj1.L$2 = obj2;
                   obj1.L$3 = tlabel;
                   obj1.label = 2;
                   if (tL$0.b(obj3, obj1) == obj) {
                      break ;
                   }else {
                      i1 = i;
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
       i1 = 0;
       orunningFold = this.$initial;
       tL$0 = tlabel;
       Iterator iterator = this.$this_runningFoldIndexed.iterator();
       goto label_004c ;
    }
}
