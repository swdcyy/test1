package cg4.b$m;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lf4.q;

public final class b$m implements a	// class@00051e
{
    public static final b$m a;

    static {
       b$m.a = new b$m();
    }
    public void b$m(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, b$m.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new q();
    }
}
