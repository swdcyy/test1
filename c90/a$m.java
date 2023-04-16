package c90.a$m;
import erd.o;
import kotlin.jvm.internal.Ref$IntRef;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qrd.l1;

public final class a$m implements o	// class@000cf1
{
    public final Ref$IntRef b;

    public void a$m(Ref$IntRef p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$m.class, "1")) {
       }else {
          a.p(p0, "it");
          this.b.element = p0.intValue();
       }
       return l1.a;
    }
}
