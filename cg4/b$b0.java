package cg4.b$b0;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lf4.r;

public final class b$b0 implements a	// class@00050f
{
    public static final b$b0 a;

    static {
       b$b0.a = new b$b0();
    }
    public void b$b0(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, b$b0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new r();
    }
}
