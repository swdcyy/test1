package fia.e$c;
import erd.g;
import fia.e;
import java.lang.Object;
import ge5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class e$c implements g	// class@0028f8
{
    public final e b;

    public void e$c(e p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$c.class, "1")) {
       }else {
          a.p(p0, "event");
          if (p0.a == 1) {
             this.b.V8();
          }
       }
       return;
    }
}
