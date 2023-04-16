package j8a.d1$c;
import w4.j;
import j8a.d1;
import msd.l;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qrd.l1;

public final class d1$c implements j	// class@002949
{
    public final d1 a;
    public final l b;

    public void d1$c(d1 p0,l p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onResult(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d1$c.class, "1")) {
       }else {
          this.a.e = false;
          d1$c tb = this.b;
          if (tb != null) {
             a.o(p0, "it");
             tb.invoke(p0);
          }
       }
       return;
    }
}
