package cg4.b$o;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lf4.d0;

public final class b$o implements a	// class@000520
{
    public static final b$o a;

    static {
       b$o.a = new b$o();
    }
    public void b$o(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, b$o.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d0();
    }
}
