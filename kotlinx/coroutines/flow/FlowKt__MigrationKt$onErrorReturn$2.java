package kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2;
import msd.q;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import msd.l;
import java.lang.Object;
import asd.c;
import jtd.e;
import java.lang.Throwable;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Boolean;

public final class FlowKt__MigrationKt$onErrorReturn$2 extends SuspendLambda implements q	// class@001a6e
{
    public final Object $fallback;
    public final l $predicate;
    public Object L$0;
    public Object L$1;
    public int label;
    public e p$;
    public Throwable p$0;

    public void FlowKt__MigrationKt$onErrorReturn$2(l p0,Object p1,c p2){
       this.$predicate = p0;
       this.$fallback = p1;
       super(3, p2);
    }
    public final c create(e p0,Throwable p1,c p2){
       FlowKt__MigrationKt$onErrorReturn$2 oonErrorRetu = new FlowKt__MigrationKt$onErrorReturn$2(this.$predicate, this.$fallback, p2);
       oonErrorRetu.p$ = p0;
       oonErrorRetu.p$0 = p1;
       return oonErrorRetu;
    }
    public final Object invoke(Object p0,Object p1,Object p2){
       return this.create(p0, p1, p2).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       FlowKt__MigrationKt$onErrorReturn$2 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          tlabel = this.p$0;
          if (this.$predicate.invoke(tlabel).booleanValue()) {
             this.L$0 = p0;
             this.L$1 = tlabel;
             this.label = 1;
             if (p0.emit(this.$fallback, this) == obj) {
                return obj;
             }
          }else {
             throw tlabel;
          }
       }
       return l1.a;
    }
}
