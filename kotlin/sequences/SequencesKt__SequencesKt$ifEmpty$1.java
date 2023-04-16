package kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1;
import msd.p;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import wsd.m;
import msd.a;
import asd.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import wsd.o;
import qrd.l1;
import csd.b;
import java.lang.IllegalStateException;
import java.util.Iterator;
import qrd.j0;

public final class SequencesKt__SequencesKt$ifEmpty$1 extends RestrictedSuspendLambda implements p	// class@0018c2
{
    public final a $defaultValue;
    public final m $this_ifEmpty;
    public Object L$0;
    public Object L$1;
    public int label;
    public o p$;

    public void SequencesKt__SequencesKt$ifEmpty$1(m p0,a p1,c p2){
       this.$this_ifEmpty = p0;
       this.$defaultValue = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       a.p(p1, "completion");
       SequencesKt__SequencesKt$ifEmpty$1 oifEmpty$1 = new SequencesKt__SequencesKt$ifEmpty$1(this.$this_ifEmpty, this.$defaultValue, p1);
       oifEmpty$1.p$ = p0;
       return oifEmpty$1;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       SequencesKt__SequencesKt$ifEmpty$1 tlabel = this.label;
       int i = 1;
       if (tlabel != null) {
          if (tlabel == i || tlabel == 2) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          Iterator iterator = this.$this_ifEmpty.iterator();
          if (iterator.hasNext()) {
             this.L$0 = p0;
             this.L$1 = iterator;
             this.label = i;
             if (p0.e(iterator, this) == obj) {
                return obj;
             }
          }else {
             this.L$0 = p0;
             this.L$1 = iterator;
             this.label = 2;
             if (p0.f(this.$defaultValue.invoke(), this) == obj) {
                return obj;
             }
          }
       }
       return l1.a;
    }
}
