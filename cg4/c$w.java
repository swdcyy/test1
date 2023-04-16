package cg4.c$w;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import th4.o;

public final class c$w implements a	// class@000543
{
    public static final c$w a;

    static {
       c$w.a = new c$w();
    }
    public void c$w(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, c$w.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new o();
    }
}
