package cg4.b$d;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lf4.n;

public final class b$d implements a	// class@000514
{
    public static final b$d a;

    static {
       b$d.a = new b$d();
    }
    public void b$d(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, b$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new n();
    }
}
