package cg4.b$a0;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lf4.a0;

public final class b$a0 implements a	// class@00050d
{
    public static final b$a0 a;

    static {
       b$a0.a = new b$a0();
    }
    public void b$a0(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, b$a0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a0();
    }
}
