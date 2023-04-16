package kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1;
import msd.p;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import wsd.m;
import msd.l;
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

public final class SequencesKt__SequencesKt$flatMapIndexed$1 extends RestrictedSuspendLambda implements p	// class@0018bc
{
    public final l $iterator;
    public final m $source;
    public final p $transform;
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public o p$;

    public void SequencesKt__SequencesKt$flatMapIndexed$1(m p0,p p1,l p2,c p3){
       this.$source = p0;
       this.$transform = p1;
       this.$iterator = p2;
       super(2, p3);
    }
    public final c create(Object p0,c p1){
       a.p(p1, "completion");
       SequencesKt__SequencesKt$flatMapIndexed$1 uoflatMapInd = new SequencesKt__SequencesKt$flatMapIndexed$1(this.$source, this.$transform, this.$iterator, p1);
       uoflatMapInd.p$ = p0;
       return uoflatMapInd;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       SequencesKt__SequencesKt$flatMapIndexed$1 tL$0;
       int i1;
       Object obj = b.h();
       SequencesKt__SequencesKt$flatMapIndexed$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             tlabel = this.L$2;
             tL$0 = this.L$0;
             j0.n(p0);
             p0 = this.I$0;
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          tL$0 = this.p$;
          Iterator iterator = this.$source.iterator();
          i1 = 0;
       }
       SequencesKt__SequencesKt$flatMapIndexed$1 uoflatMapInd = this;
       while (true) {
          if (!tlabel.hasNext()) {
             return l1.a;
          }
          Object obj1 = tlabel.next();
          SequencesKt__SequencesKt$flatMapIndexed$1 $transform = uoflatMapInd.$transform;
          int i = p0 + 1;
          if (p0 < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          p0 = $transform.invoke(a.f(p0), obj1);
          uoflatMapInd.L$0 = tL$0;
          uoflatMapInd.I$0 = i;
          uoflatMapInd.L$1 = obj1;
          uoflatMapInd.L$2 = tlabel;
          uoflatMapInd.L$3 = p0;
          uoflatMapInd.label = 1;
          if (tL$0.e(uoflatMapInd.$iterator.invoke(p0), uoflatMapInd) == obj) {
             break ;
          }else {
             i1 = i;
          }
       }
       return obj;
    }
}
