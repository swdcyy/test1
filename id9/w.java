package id9.w;
import erd.g;
import id9.z;
import java.lang.Object;
import vf9.g0;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class w implements g	// class@0027fd
{
    public final z b;

    public void w(z p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       w tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, z.class, "4")) {
       }else {
          tb.g2(p0.a);
       }
       return;
    }
}
