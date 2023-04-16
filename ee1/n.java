package ee1.n;
import z1.a;
import yv4.d;
import java.lang.Object;
import wv4.d1;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import wv4.f1;

public final class n implements a	// class@002115
{
    public final boolean a;
    public final d b;

    public void n(boolean p0,d p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       n ta = this.a;
       n tb = this.b;
       Objects.requireNonNull(p0);
       d1 uod1 = d1.class;
       if (!PatchProxy.isSupport(uod1) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(ta), tb, p0, uod1, "17")) {
          p0.h.X(ta, tb);
       }
       return;
    }
}
