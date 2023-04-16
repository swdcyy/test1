package kotlinx.coroutines.flow.internal.CombineKt$asFairChannel$1$a;
import jtd.e;
import htd.m;
import java.lang.Object;
import asd.c;
import ktd.j;
import csd.b;
import qrd.l1;

public final class CombineKt$asFairChannel$1$a implements e	// class@001b18
{
    public final m b;

    public void CombineKt$asFairChannel$1$a(m p0){
       this.b = p0;
       super();
    }
    public Object emit(Object p0,c p1){
       CombineKt$asFairChannel$1$a tb = this.b;
       if (p0 != null) {
       }else {
          p0 = j.a;
       }
       p0 = tb.x1(p0, p1);
       if (p0 == b.h()) {
          return p0;
       }else {
          return l1.a;
       }
    }
}
