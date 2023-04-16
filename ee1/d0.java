package ee1.d0;
import z1.a;
import java.lang.Object;
import wv4.d1;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import wv4.f1;

public final class d0 implements a	// class@002100
{
    public final long a;

    public void d0(long p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       d0 ta = this.a;
       Objects.requireNonNull(p0);
       d1 uod1 = d1.class;
       if (!PatchProxy.isSupport(uod1) || !PatchProxy.applyVoidOneRefs(Long.valueOf(ta), p0, uod1, "24")) {
          p0 = p0.h;
          Objects.requireNonNull(p0);
          if (ta > 0) {
             p0.f = ta;
          }
       }
       return;
    }
}
