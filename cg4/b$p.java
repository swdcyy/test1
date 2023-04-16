package cg4.b$p;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lf4.e0;

public final class b$p implements a	// class@000521
{
    public static final b$p a;

    static {
       b$p.a = new b$p();
    }
    public void b$p(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, b$p.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new e0();
    }
}
