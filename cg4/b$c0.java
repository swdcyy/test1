package cg4.b$c0;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lf4.k;

public final class b$c0 implements a	// class@000511
{
    public static final b$c0 a;

    static {
       b$c0.a = new b$c0();
    }
    public void b$c0(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, b$c0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new k();
    }
}
