package jy8.b;
import erd.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;

public final class b implements g	// class@0029d7
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       p0 = new Object[0];
       j0.f("NeoSchemeDispatchActivity", "scheme start neo live success", p0);
       return;
    }
}
