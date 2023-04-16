package cg4.b$a;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lf4.m;

public final class b$a implements a	// class@00050e
{
    public static final b$a a;

    static {
       b$a.a = new b$a();
    }
    public void b$a(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new m();
    }
}
