package kotlinx.coroutines.flow.FlowKt__MergeKt$map$$inlined$unsafeTransform$2$2;
import jtd.e;
import kotlinx.coroutines.flow.FlowKt__MergeKt$map$$inlined$unsafeTransform$2;
import java.lang.Object;
import asd.c;
import nsd.c0;
import kotlinx.coroutines.flow.FlowKt__MergeKt$map$$inlined$unsafeTransform$2$2$1;
import msd.p;
import csd.b;
import qrd.l1;

public final class FlowKt__MergeKt$map$$inlined$unsafeTransform$2$2 implements e	// class@001a3b
{
    public final e b;
    public final FlowKt__MergeKt$map$$inlined$unsafeTransform$2 c;

    public void FlowKt__MergeKt$map$$inlined$unsafeTransform$2$2(e p0,FlowKt__MergeKt$map$$inlined$unsafeTransform$2 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object a(Object p0,c p1){
       c0.e(4);
       FlowKt__MergeKt$map$$inlined$unsafeTransform$2$2$1 omap$$inline = new FlowKt__MergeKt$map$$inlined$unsafeTransform$2$2$1(this, p1);
       c0.e(5);
       c0.e(0);
       c0.e(2);
       c0.e(1);
       return this.b.emit(this.c.b.invoke(p0, p1), p1);
    }
    public Object emit(Object p0,c p1){
       p0 = this.b.emit(this.c.b.invoke(p0, p1), p1);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
}
