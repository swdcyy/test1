package k59.r2$a;
import erd.g;
import java.lang.Object;
import vq4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import vq4.d;

public final class r2$a implements g	// class@002b0b
{
    public static final r2$a b;

    static {
       r2$a.b = new r2$a();
    }
    public void r2$a(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r2$a.class, "1")) {
       }else {
          a.p(p0, "clientAdLog");
          p0.D1 = 2;
       }
       return;
    }
}
