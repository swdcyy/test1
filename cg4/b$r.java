package cg4.b$r;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lf4.c0;

public final class b$r implements a	// class@000523
{
    public static final b$r a;

    static {
       b$r.a = new b$r();
    }
    public void b$r(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, b$r.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c0();
    }
}
