package b58.h;
import erd.g;
import b58.p;
import java.lang.Object;
import crd.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b58.p$b;
import b58.p$a;

public final class h implements g	// class@000302
{
    public final p b;

    public void h(p p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, p.class, "4")) {
       }else {
          p.a(new p$b("begin", tb.a, "", null));
       }
       return;
    }
}
