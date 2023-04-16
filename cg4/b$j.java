package cg4.b$j;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lf4.t;

public final class b$j implements a	// class@00051b
{
    public static final b$j a;

    static {
       b$j.a = new b$j();
    }
    public void b$j(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, b$j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new t();
    }
}
