package cg4.b$c;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lf4.o;

public final class b$c implements a	// class@000512
{
    public static final b$c a;

    static {
       b$c.a = new b$c();
    }
    public void b$c(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, b$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new o();
    }
}
