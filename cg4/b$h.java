package cg4.b$h;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lf4.y;

public final class b$h implements a	// class@000519
{
    public static final b$h a;

    static {
       b$h.a = new b$h();
    }
    public void b$h(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, b$h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new y();
    }
}
