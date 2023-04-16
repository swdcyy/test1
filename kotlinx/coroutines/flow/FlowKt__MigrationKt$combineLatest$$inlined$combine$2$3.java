package kotlinx.coroutines.flow.FlowKt__MigrationKt$combineLatest$$inlined$combine$2$3;
import msd.q;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import asd.c;
import kotlinx.coroutines.flow.FlowKt__MigrationKt$combineLatest$$inlined$combine$2;
import jtd.e;
import java.lang.Object;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import msd.s;
import nsd.c0;

public final class FlowKt__MigrationKt$combineLatest$$inlined$combine$2$3 extends SuspendLambda implements q	// class@001a65
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public e p$;
    public Object[] p$0;
    public final FlowKt__MigrationKt$combineLatest$$inlined$combine$2 this$0;

    public void FlowKt__MigrationKt$combineLatest$$inlined$combine$2$3(c p0,FlowKt__MigrationKt$combineLatest$$inlined$combine$2 p1){
       this.this$0 = p1;
       super(3, p0);
    }
    public final c create(e p0,Object[] p1,c p2){
       FlowKt__MigrationKt$combineLatest$$inlined$combine$2$3 uocombineLat = new FlowKt__MigrationKt$combineLatest$$inlined$combine$2$3(p2, this.this$0);
       uocombineLat.p$ = p0;
       uocombineLat.p$0 = p1;
       return uocombineLat;
    }
    public final Object invoke(Object p0,Object p1,Object p2){
       return this.create(p0, p1, p2).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       FlowKt__MigrationKt$combineLatest$$inlined$combine$2$3 tL$0;
       Object obj = b.h();
       FlowKt__MigrationKt$combineLatest$$inlined$combine$2$3 tlabel = this.label;
       FlowKt__MigrationKt$combineLatest$$inlined$combine$2$3 uocombineLat = 1;
       if (tlabel != null) {
          if (tlabel != uocombineLat) {
             if (tlabel == 2) {
                j0.n(p0);
             label_0074 :
                return l1.a;
             }else {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
             }
          }else {
             tlabel = this.L$4;
             uocombineLat = this.L$1;
             tL$0 = this.L$0;
             j0.n(p0);
          }
       }else {
          j0.n(p0);
          tlabel = this.p$;
          p0 = this.p$0;
          this.L$0 = tlabel;
          this.L$1 = p0;
          this.L$2 = this;
          this.L$3 = p0;
          this.L$4 = tlabel;
          this.label = uocombineLat;
          Object obj1 = this.this$0.b.invoke(p0[0], p0[uocombineLat], p0[2], p0[3], this);
          if (obj1 == obj) {
             return obj;
          }else {
             tL$0 = tlabel;
             uocombineLat = p0;
             p0 = obj1;
          }
       }
       this.L$0 = tL$0;
       this.L$1 = uocombineLat;
       this.label = 2;
       if (tlabel.emit(p0, this) == obj) {
          return obj;
       }else {
          goto label_0074 ;
       }
    }
    public final Object invokeSuspend$$forInline(Object p0){
       FlowKt__MigrationKt$combineLatest$$inlined$combine$2$3 tp$0 = this.p$0;
       c0.e(0);
       c0.e(1);
       c0.e(0);
       this.p$.emit(this.this$0.b.invoke(tp$0[0], tp$0[1], tp$0[2], tp$0[3], this), this);
       c0.e(2);
       c0.e(1);
       return l1.a;
    }
}
