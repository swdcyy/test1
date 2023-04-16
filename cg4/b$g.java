package cg4.b$g;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lf4.f0;

public final class b$g implements a	// class@000518
{
    public static final b$g a;

    static {
       b$g.a = new b$g();
    }
    public void b$g(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, b$g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f0();
    }
}
