package kotlin.sequences.SequencesKt__SequencesKt$shuffled$1;
import msd.p;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import wsd.m;
import ssd.e;
import asd.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import wsd.o;
import qrd.l1;
import csd.b;
import java.util.List;
import qrd.j0;
import java.lang.IllegalStateException;
import kotlin.sequences.SequencesKt___SequencesKt;
import java.util.Collection;
import trd.y;

public final class SequencesKt__SequencesKt$shuffled$1 extends RestrictedSuspendLambda implements p	// class@0018c3
{
    public final e $random;
    public final m $this_shuffled;
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public o p$;

    public void SequencesKt__SequencesKt$shuffled$1(m p0,e p1,c p2){
       this.$this_shuffled = p0;
       this.$random = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       a.p(p1, "completion");
       SequencesKt__SequencesKt$shuffled$1 oshuffled$1 = new SequencesKt__SequencesKt$shuffled$1(this.$this_shuffled, this.$random, p1);
       oshuffled$1.p$ = p0;
       return oshuffled$1;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       SequencesKt__SequencesKt$shuffled$1 tL$0;
       Object obj = b.h();
       SequencesKt__SequencesKt$shuffled$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             tlabel = this.L$1;
             tL$0 = this.L$0;
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          List list = SequencesKt___SequencesKt.W2(this.$this_shuffled);
          tL$0 = this.p$;
       }
       p0 = this;
       while (true) {
          int i = tlabel.isEmpty() ^ 1;
          if (!i) {
             return l1.a;
          }
          i = p0.$random.l(tlabel.size());
          Object obj1 = y.N0(tlabel);
          Object obj2 = (i < tlabel.size())? tlabel.set(i, obj1): obj1;
          p0.L$0 = tL$0;
          p0.L$1 = tlabel;
          p0.I$0 = i;
          p0.L$2 = obj1;
          p0.L$3 = obj2;
          p0.label = 1;
          if (tL$0.b(obj2, p0) == obj) {
             break ;
          }
       }
       return obj;
    }
}
