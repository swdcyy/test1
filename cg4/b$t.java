package cg4.b$t;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lf4.v;

public final class b$t implements a	// class@000525
{
    public static final b$t a;

    static {
       b$t.a = new b$t();
    }
    public void b$t(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, b$t.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new v();
    }
}
