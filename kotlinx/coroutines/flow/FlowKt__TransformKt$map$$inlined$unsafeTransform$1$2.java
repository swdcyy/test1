package kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2;
import jtd.e;
import kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1;
import java.lang.Object;
import asd.c;
import nsd.c0;
import kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1;
import msd.p;
import csd.b;
import qrd.l1;

public final class FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2 implements e	// class@001a9e
{
    public final e b;
    public final FlowKt__TransformKt$map$$inlined$unsafeTransform$1 c;

    public void FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2(e p0,FlowKt__TransformKt$map$$inlined$unsafeTransform$1 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object a(Object p0,c p1){
       c0.e(4);
       FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1 omap$$inline = new FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1(this, p1);
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
