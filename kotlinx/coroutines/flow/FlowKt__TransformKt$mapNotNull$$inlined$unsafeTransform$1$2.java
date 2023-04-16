package kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2;
import jtd.e;
import kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1;
import java.lang.Object;
import asd.c;
import nsd.c0;
import kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2$1;
import msd.p;
import qrd.l1;
import csd.b;

public final class FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2 implements e	// class@001aa2
{
    public final e b;
    public final FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1 c;

    public void FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2(e p0,FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object a(Object p0,c p1){
       c0.e(4);
       FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2$1 omapNotNull$ = new FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2$1(this, p1);
       c0.e(5);
       FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2 tb = this.b;
       p0 = this.c.b.invoke(p0, p1);
       if (p0 != null) {
          c0.e(0);
          p0 = tb.emit(p0, p1);
          c0.e(2);
          c0.e(1);
       }else {
          p0 = l1.a;
       }
       return p0;
    }
    public Object emit(Object p0,c p1){
       FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2 tb = this.b;
       p0 = this.c.b.invoke(p0, p1);
       if (p0 != null) {
          p0 = tb.emit(p0, p1);
          if (p0 == b.h()) {
             return p0;
          }else {
             p0 = l1.a;
          }
       }else if(p0 == b.h()){
          return p0;
       }else {
          p0 = l1.a;
       }
       return p0;
    }
}
