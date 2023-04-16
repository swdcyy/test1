package kotlinx.coroutines.flow.FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1;
import msd.q;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import msd.p;
import asd.c;
import jtd.e;
import java.lang.Object;
import qrd.l1;
import csd.b;
import jtd.d;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;

public final class FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 extends SuspendLambda implements q	// class@001a6f
{
    public final p $transform;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public e p$;
    public Object p$0;

    public void FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(p p0,c p1){
       this.$transform = p0;
       super(3, p1);
    }
    public final c create(e p0,Object p1,c p2){
       FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 oswitchMap$$ = new FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(this.$transform, p2);
       oswitchMap$$.p$ = p0;
       oswitchMap$$.p$0 = p1;
       return oswitchMap$$;
    }
    public final Object invoke(Object p0,Object p1,Object p2){
       return this.create(p0, p1, p2).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 tL$0;
       Object obj = b.h();
       FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 tlabel = this.label;
       FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 oswitchMap$$ = 1;
       if (tlabel != null) {
          if (tlabel != oswitchMap$$) {
             if (tlabel == 2) {
                j0.n(p0);
             label_0063 :
                return l1.a;
             }else {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
             }
          }else {
             tlabel = this.L$2;
             oswitchMap$$ = this.L$1;
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
          this.label = oswitchMap$$;
          Object obj1 = this.$transform.invoke(p0, this);
          if (obj1 == obj) {
             return obj;
          }else {
             tL$0 = tlabel;
             oswitchMap$$ = p0;
             p0 = obj1;
          }
       }
       this.L$0 = tL$0;
       this.L$1 = oswitchMap$$;
       this.L$2 = tlabel;
       this.L$3 = p0;
       this.label = 2;
       if (p0.b(tlabel, this) == obj) {
          return obj;
       }else {
          goto label_0063 ;
       }
    }
}
