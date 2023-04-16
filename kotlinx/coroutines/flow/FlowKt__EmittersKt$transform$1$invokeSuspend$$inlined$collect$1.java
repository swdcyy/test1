package kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$invokeSuspend$$inlined$collect$1;
import jtd.e;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1;
import java.lang.Object;
import asd.c;
import nsd.c0;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$invokeSuspend$$inlined$collect$1$1;
import msd.q;

public final class FlowKt__EmittersKt$transform$1$invokeSuspend$$inlined$collect$1 implements e	// class@001a09
{
    public final FlowKt__EmittersKt$transform$1 b;
    public final e c;

    public void FlowKt__EmittersKt$transform$1$invokeSuspend$$inlined$collect$1(FlowKt__EmittersKt$transform$1 p0,e p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object a(Object p0,c p1){
       c0.e(4);
       FlowKt__EmittersKt$transform$1$invokeSuspend$$inlined$collect$1$1 otransform$1 = new FlowKt__EmittersKt$transform$1$invokeSuspend$$inlined$collect$1$1(this, p1);
       c0.e(5);
       return this.b.$transform.invoke(this.c, p0, p1);
    }
    public Object emit(Object p0,c p1){
       return this.b.$transform.invoke(this.c, p0, p1);
    }
}
