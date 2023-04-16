package cg4.b$f;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lf4.j;

public final class b$f implements a	// class@000517
{
    public static final b$f a;

    static {
       b$f.a = new b$f();
    }
    public void b$f(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, b$f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new j();
    }
}
