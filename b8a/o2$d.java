package b8a.o2$d;
import erd.g;
import b8a.o2;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class o2$d implements g	// class@0003d4
{
    public final o2 b;

    public void o2$d(o2 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o2$d.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.X8(p0.intValue());
       }
       return;
    }
}
