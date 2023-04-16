package ee1.b;
import z1.a;
import java.lang.Object;
import wv4.d1;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import wv4.f1;

public final class b implements a	// class@0020fd
{
    public final int a;

    public void b(int p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       b ta = this.a;
       Objects.requireNonNull(p0);
       d1 uod1 = d1.class;
       if (!PatchProxy.isSupport(uod1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(ta), p0, uod1, "13")) {
          p0.h.F2(ta);
       }
       return;
    }
}
