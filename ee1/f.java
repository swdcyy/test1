package ee1.f;
import z1.a;
import java.lang.String;
import java.lang.Object;
import wv4.d1;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import wv4.f1;

public final class f implements a	// class@002105
{
    public final String a;
    public final boolean b;

    public void f(String p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       f ta = this.a;
       f tb = this.b;
       Objects.requireNonNull(p0);
       d1 uod1 = d1.class;
       if (!PatchProxy.isSupport(uod1) || !PatchProxy.applyVoidTwoRefs(ta, Boolean.valueOf(tb), p0, uod1, "21")) {
          p0.h.k5(ta, tb);
       }
       return;
    }
}
