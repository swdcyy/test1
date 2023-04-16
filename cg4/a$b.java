package cg4.a$b;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lf4.f;

public final class a$b implements a	// class@000504
{
    public static final a$b a;

    static {
       a$b.a = new a$b();
    }
    public void a$b(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, a$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f();
    }
}
