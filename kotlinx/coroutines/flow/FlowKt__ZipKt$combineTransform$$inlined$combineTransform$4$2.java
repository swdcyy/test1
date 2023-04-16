package kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransform$4$2;
import msd.q;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransform$4;
import asd.c;
import jtd.e;
import java.lang.Object;
import qrd.l1;
import csd.b;
import qrd.j0;
import msd.u;
import java.lang.IllegalStateException;
import java.lang.String;

public final class FlowKt__ZipKt$combineTransform$$inlined$combineTransform$4$2 extends SuspendLambda implements q	// class@001af7
{
    public Object L$0;
    public Object L$1;
    public int label;
    public e p$;
    public Object[] p$0;
    public final FlowKt__ZipKt$combineTransform$$inlined$combineTransform$4 this$0;

    public void FlowKt__ZipKt$combineTransform$$inlined$combineTransform$4$2(FlowKt__ZipKt$combineTransform$$inlined$combineTransform$4 p0,c p1){
       this.this$0 = p0;
       super(3, p1);
    }
    public final c create(e p0,Object[] p1,c p2){
       FlowKt__ZipKt$combineTransform$$inlined$combineTransform$4$2 uocombineTra = new FlowKt__ZipKt$combineTransform$$inlined$combineTransform$4$2(this.this$0, p2);
       uocombineTra.p$ = p0;
       uocombineTra.p$0 = p1;
       return uocombineTra;
    }
    public final Object invoke(Object p0,Object p1,Object p2){
       return this.create(p0, p1, p2).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       p0 = this.p$0;
       this.this$0.$transform$inlined.invoke(this.p$, p0[0], p0[1], p0[2], p0[3], p0[4], this);
       return l1.a;
    }
    public final Object invokeSuspend$$forInline(Object p0){
       p0 = this.p$0;
       this.this$0.$transform$inlined.invoke(this.p$, p0[0], p0[1], p0[2], p0[3], p0[4], this);
       return l1.a;
    }
}
