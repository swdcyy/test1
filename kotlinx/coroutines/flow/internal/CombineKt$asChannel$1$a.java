package kotlinx.coroutines.flow.internal.CombineKt$asChannel$1$a;
import jtd.e;
import htd.w;
import java.lang.Object;
import asd.c;
import htd.c0;
import ktd.j;
import csd.b;
import qrd.l1;

public final class CombineKt$asChannel$1$a implements e	// class@001b16
{
    public final w b;

    public void CombineKt$asChannel$1$a(w p0){
       this.b = p0;
       super();
    }
    public Object emit(Object p0,c p1){
       c0 channel = this.b.getChannel();
       if (p0 != null) {
       }else {
          p0 = j.a;
       }
       p0 = channel.l(p0, p1);
       if (p0 == b.h()) {
          return p0;
       }else {
          return l1.a;
       }
    }
}
