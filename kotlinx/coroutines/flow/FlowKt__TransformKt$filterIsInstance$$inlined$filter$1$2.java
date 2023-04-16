package kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2;
import jtd.e;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1;
import java.lang.Object;
import asd.c;
import nsd.c0;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1;
import java.lang.String;
import kotlin.jvm.internal.a;
import qrd.l1;
import java.lang.Boolean;
import dsd.a;
import csd.b;

public final class FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2 implements e	// class@001a96
{
    public final e b;
    public final FlowKt__TransformKt$filterIsInstance$$inlined$filter$1 c;

    public void FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2(e p0,FlowKt__TransformKt$filterIsInstance$$inlined$filter$1 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object a(Object p0,c p1){
       c0.e(4);
       FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1 uofilterIsIn = new FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1(this, p1);
       c0.e(5);
       FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2 tb = this.b;
       a.y(3, "R");
       if (p0 instanceof Object) {
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
       FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2 tb = this.b;
       a.y(3, "R");
       if (a.a(p0 instanceof Object).booleanValue()) {
          p0 = tb.emit(p0, p1);
          if (p0 == b.h()) {
             return p0;
          }else {
             p0 = l1.a;
          }
       }else {
          p0 = l1.a;
       }
       return p0;
    }
}
