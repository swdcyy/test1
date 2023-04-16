package kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1;
import msd.q;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import msd.p;
import asd.c;
import jtd.e;
import java.lang.Object;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;

public final class FlowKt__MergeKt$mapLatest$1 extends SuspendLambda implements q	// class@001a3d
{
    public final p $transform;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public e p$;
    public Object p$0;

    public void FlowKt__MergeKt$mapLatest$1(p p0,c p1){
       this.$transform = p0;
       super(3, p1);
    }
    public final c create(e p0,Object p1,c p2){
       FlowKt__MergeKt$mapLatest$1 omapLatest$1 = new FlowKt__MergeKt$mapLatest$1(this.$transform, p2);
       omapLatest$1.p$ = p0;
       omapLatest$1.p$0 = p1;
       return omapLatest$1;
    }
    public final Object invoke(Object p0,Object p1,Object p2){
       return this.create(p0, p1, p2).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       FlowKt__MergeKt$mapLatest$1 tL$0;
       Object obj = b.h();
       FlowKt__MergeKt$mapLatest$1 tlabel = this.label;
       FlowKt__MergeKt$mapLatest$1 omapLatest$1 = 1;
       if (tlabel != null) {
          if (tlabel != omapLatest$1) {
             if (tlabel == 2) {
                j0.n(p0);
             label_0055 :
                return l1.a;
             }else {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
             }
          }else {
             tlabel = this.L$2;
             omapLatest$1 = this.L$1;
             tL$0 = this.L$0;
             j0.n(p0);
          }
       }else {
          j0.n(p0);
          tlabel = this.p$;
          p0 = this.p$0;
          this.L$0 = tlabel;
          this.L$1 = p0;
          this.L$2 = tlabel;
          this.label = omapLatest$1;
          Object obj1 = this.$transform.invoke(p0, this);
          if (obj1 == obj) {
             return obj;
          }else {
             tL$0 = tlabel;
             omapLatest$1 = p0;
             p0 = obj1;
          }
       }
       this.L$0 = tL$0;
       this.L$1 = omapLatest$1;
       this.label = 2;
       if (tlabel.emit(p0, this) == obj) {
          return obj;
       }else {
          goto label_0055 ;
       }
    }
}
