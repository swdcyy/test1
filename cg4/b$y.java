package cg4.b$y;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lf4.d;

public final class b$y implements a	// class@00052a
{
    public static final b$y a;

    static {
       b$y.a = new b$y();
    }
    public void b$y(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, b$y.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d();
    }
}
