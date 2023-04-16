package cg4.a$f;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import id4.c;

public final class a$f implements a	// class@000508
{
    public static final a$f a;

    static {
       a$f.a = new a$f();
    }
    public void a$f(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, a$f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c();
    }
}
