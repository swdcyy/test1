package cg4.b$e;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lf4.b;

public final class b$e implements a	// class@000516
{
    public static final b$e a;

    static {
       b$e.a = new b$e();
    }
    public void b$e(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, b$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b();
    }
}
