package c90.a$f;
import erd.o;
import kotlin.jvm.internal.Ref$IntRef;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Number;
import qrd.l1;

public final class a$f implements o	// class@000cea
{
    public final Ref$IntRef b;

    public void a$f(Ref$IntRef p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$f.class, "1")) {
       }else {
          a.p(p0, "it");
          this.b.element = p0.getFirst().intValue();
       }
       return l1.a;
    }
}
