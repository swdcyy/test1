package kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3;
import jtd.e;
import msd.p;
import java.lang.Object;
import asd.c;
import nsd.c0;
import kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3$emit$1;

public final class FlowKt__CollectKt$collect$3 implements e	// class@0019d1
{
    public final p b;

    public void FlowKt__CollectKt$collect$3(p p0){
       this.b = p0;
       super();
    }
    public Object a(Object p0,c p1){
       c0.e(4);
       FlowKt__CollectKt$collect$3$emit$1 uocollect$3$ = new FlowKt__CollectKt$collect$3$emit$1(this, p1);
       c0.e(5);
       return this.b.invoke(p0, p1);
    }
    public Object emit(Object p0,c p1){
       return this.b.invoke(p0, p1);
    }
}
