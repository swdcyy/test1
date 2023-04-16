package cg4.b$n;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lf4.p;

public final class b$n implements a	// class@00051f
{
    public static final b$n a;

    static {
       b$n.a = new b$n();
    }
    public void b$n(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, b$n.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new p();
    }
}
