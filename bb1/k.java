package bb1.k;
import erd.g;
import bb1.n;
import java.lang.Object;
import kb1.e;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;

public final class k implements g	// class@000337
{
    public final n b;

    public void k(n p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, n.class, "5")) {
       }else {
          tb.d.remove(p0.a);
       }
       return;
    }
}
