package d4b.g;
import erd.g;
import d4b.b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import d4b.a$a;
import s5b.b;
import w46.b;

public final class g implements g	// class@00242f
{
    public final b b;

    public void g(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else {
          a.o(p0, "e");
          this.b.b.o0(p0);
          this.b.e = false;
          Object[] objArray = new Object[false];
          b.D().t("MagicLocalRepository", p0.getMessage(), objArray);
       }
       return;
    }
}
