package bf9.e;
import erd.g;
import bf9.h;
import java.lang.Object;
import lm6.j;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class e implements g	// class@00048f
{
    public final h b;

    public void e(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, h.class, "5")) {
       }else {
          p0 = p0.a;
          if (tb.A != p0) {
             h y = tb.y;
             int i = (p0 != null)? 1: -1;
             tb.y = y + i;
          }
          if (p0 != null) {
             tb.A = true;
             tb.g2();
          }else {
             tb.A = false;
             tb.i2();
          }
       }
       return;
    }
}
