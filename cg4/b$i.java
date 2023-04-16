package cg4.b$i;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lf4.u;

public final class b$i implements a	// class@00051a
{
    public static final b$i a;

    static {
       b$i.a = new b$i();
    }
    public void b$i(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, b$i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new u();
    }
}
