package b4d.t0;
import erd.g;
import b4d.v0;
import java.lang.Object;
import ky5.p;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class t0 implements g	// class@000390
{
    public final v0 b;

    public void t0(v0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       t0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, v0.class, "4")) {
       }else {
          tb.V8(false);
       }
       return;
    }
}
