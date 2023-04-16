package bi9.e;
import erd.g;
import java.lang.Object;
import bi9.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;

public final class e implements g	// class@0004af
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void accept(Object p0){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoid(null, p0, b.class, "4")) {
       }else {
          p0.c.clear();
       }
       return;
    }
}
