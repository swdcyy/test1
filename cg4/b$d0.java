package cg4.b$d0;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lf4.w;

public final class b$d0 implements a	// class@000513
{
    public static final b$d0 a;

    static {
       b$d0.a = new b$d0();
    }
    public void b$d0(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, b$d0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new w();
    }
}
