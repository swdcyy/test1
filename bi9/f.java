package bi9.f;
import erd.g;
import java.lang.Object;
import bi9.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;

public final class f implements g	// class@0004b0
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public final void accept(Object p0){
       b b;
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoid(null, p0, b.class, "5")) {
       }else {
          b = p0.b;
          if (b != null) {
             p0.c.add(b);
             p0.b = null;
             p0.a = null;
          }
       }
       return;
    }
}
