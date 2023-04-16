package cg4.b$u;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lf4.h;

public final class b$u implements a	// class@000526
{
    public static final b$u a;

    static {
       b$u.a = new b$u();
    }
    public void b$u(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, b$u.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new h();
    }
}
