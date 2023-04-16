package kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2;
import jtd.e;
import msd.q;
import java.lang.Object;
import asd.c;
import nsd.c0;
import kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2$emit$1;
import java.lang.Integer;
import java.lang.ArithmeticException;
import java.lang.String;
import dsd.a;

public final class FlowKt__CollectKt$collectIndexed$2 implements e	// class@0019d3
{
    public int b;
    public final q c;

    public void FlowKt__CollectKt$collectIndexed$2(q p0){
       this.c = p0;
       super();
    }
    public Object a(Object p0,c p1){
       c0.e(4);
       FlowKt__CollectKt$collectIndexed$2$emit$1 uocollectInd = new FlowKt__CollectKt$collectIndexed$2$emit$1(this, p1);
       c0.e(5);
       FlowKt__CollectKt$collectIndexed$2 tc = this.c;
       FlowKt__CollectKt$collectIndexed$2 tb = this.b;
       this.b = tb + 1;
       if (tb >= null) {
          return tc.invoke(Integer.valueOf(tb), p0, p1);
       }
       throw new ArithmeticException("Index overflow has happened");
    }
    public Object emit(Object p0,c p1){
       FlowKt__CollectKt$collectIndexed$2 tc = this.c;
       FlowKt__CollectKt$collectIndexed$2 tb = this.b;
       this.b = tb + 1;
       if (tb >= null) {
          return tc.invoke(a.f(tb), p0, p1);
       }
       throw new ArithmeticException("Index overflow has happened");
    }
}
