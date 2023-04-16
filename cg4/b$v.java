package cg4.b$v;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lf4.l;

public final class b$v implements a	// class@000527
{
    public static final b$v a;

    static {
       b$v.a = new b$v();
    }
    public void b$v(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, b$v.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new l();
    }
}
