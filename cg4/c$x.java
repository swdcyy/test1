package cg4.c$x;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ug4.d;

public final class c$x implements a	// class@000544
{
    public static final c$x a;

    static {
       c$x.a = new c$x();
    }
    public void c$x(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, c$x.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d();
    }
}
