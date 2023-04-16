package cg4.c$e;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wh4.i;

public final class c$e implements a	// class@000531
{
    public static final c$e a;

    static {
       c$e.a = new c$e();
    }
    public void c$e(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, c$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new i();
    }
}
