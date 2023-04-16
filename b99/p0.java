package b99.p0;
import erd.g;
import b99.t0;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import java.lang.Runnable;

public final class p0 implements g	// class@0003b3
{
    public final t0 b;

    public void p0(t0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p0 tb = this.b;
       boolean b = p0.booleanValue();
       Objects.requireNonNull(tb);
       t0 ot0 = t0.class;
       if (!PatchProxy.isSupport(ot0) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, ot0, "22")) {
          tb.W = b;
          if (!b) {
             b = tb.X;
             if (b != null) {
                b.run();
                tb.X = null;
             }
          }
       }
       return;
    }
}
