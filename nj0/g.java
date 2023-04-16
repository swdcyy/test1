package nj0.g;
import erd.g;
import com.kuaishou.krn.delegate.k;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.kuaishou.krn.delegate.KrnDelegate;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mj0.b;
import zj0.x;
import lj0.c;
import zj0.u;

public final class g implements g	// class@003334
{
    public final k b;

    public void g(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, KrnDelegate.class, "23")) {
       }else {
          b.a();
          tb.e.k().B();
          tb.i(false);
       }
       return;
    }
}
