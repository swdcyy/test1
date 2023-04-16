package cg4.b$e0;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lf4.i;

public final class b$e0 implements a	// class@000515
{
    public static final b$e0 a;

    static {
       b$e0.a = new b$e0();
    }
    public void b$e0(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, b$e0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new i();
    }
}
