package cg4.b$q;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lf4.s;

public final class b$q implements a	// class@000522
{
    public static final b$q a;

    static {
       b$q.a = new b$q();
    }
    public void b$q(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, b$q.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new s();
    }
}
