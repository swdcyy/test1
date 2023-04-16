package cg4.b$l;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lf4.x;

public final class b$l implements a	// class@00051d
{
    public static final b$l a;

    static {
       b$l.a = new b$l();
    }
    public void b$l(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, b$l.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new x();
    }
}
