package kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$1$1;
import msd.r;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$1;
import asd.c;
import jtd.e;
import java.lang.Object;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;

public final class FlowKt__ZipKt$combineTransform$1$1 extends SuspendLambda implements r	// class@001af9
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public e p$;
    public Object p$0;
    public Object p$1;
    public final FlowKt__ZipKt$combineTransform$1 this$0;

    public void FlowKt__ZipKt$combineTransform$1$1(FlowKt__ZipKt$combineTransform$1 p0,c p1){
       this.this$0 = p0;
       super(4, p1);
    }
    public final c create(e p0,Object p1,Object p2,c p3){
       FlowKt__ZipKt$combineTransform$1$1 uocombineTra = new FlowKt__ZipKt$combineTransform$1$1(this.this$0, p3);
       uocombineTra.p$ = p0;
       uocombineTra.p$0 = p1;
       uocombineTra.p$1 = p2;
       return uocombineTra;
    }
    public final Object invoke(Object p0,Object p1,Object p2,Object p3){
       return this.create(p0, p1, p2, p3).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       FlowKt__ZipKt$combineTransform$1$1 tlabel = this.label;
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
          FlowKt__ZipKt$combineTransform$1$1 tp$1 = this.p$1;
          this.L$0 = p0;
          this.L$1 = tlabel;
          this.L$2 = tp$1;
          this.label = 1;
          if (this.this$0.$transform.invoke(p0, tlabel, tp$1, this) == obj) {
             return obj;
          }
       }
       return l1.a;
    }
}
