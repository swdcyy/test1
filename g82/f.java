package g82.f;
import erd.g;
import g82.v;
import java.lang.Object;
import lj1.f;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class f implements g	// class@002a9d
{
    public final v b;

    public void f(v p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, v.class, "11")) {
       }else {
          tb.S8();
       }
       return;
    }
}
