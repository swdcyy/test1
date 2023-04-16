package go2.i$a;
import erd.g;
import go2.i;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import go2.k;

public final class i$a implements g	// class@002b5f
{
    public final i b;

    public void i$a(i p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "1")) {
       }else {
          i k = this.b.k;
          if (k == null) {
             a.S("bgManager");
          }
          a.o(p0, "it");
          k.c(p0.booleanValue());
       }
       return;
    }
}
