package b58.g;
import erd.g;
import b58.p;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b58.p$b;
import b58.p$a;

public final class g implements g	// class@000301
{
    public final p b;

    public void g(p p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, p.class, "6")) {
       }else {
          p.a(new p$b("fail", tb.a, p0.getLocalizedMessage(), null));
       }
       return;
    }
}
