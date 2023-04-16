package cg4.b$w;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tf4.d;

public final class b$w implements a	// class@000528
{
    public static final b$w a;

    static {
       b$w.a = new b$w();
    }
    public void b$w(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, b$w.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d();
    }
}
