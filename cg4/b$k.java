package cg4.b$k;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lf4.a;

public final class b$k implements a	// class@00051c
{
    public static final b$k a;

    static {
       b$k.a = new b$k();
    }
    public void b$k(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, b$k.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
}
