package cg4.c$h;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import oh4.d;

public final class c$h implements a	// class@000534
{
    public static final c$h a;

    static {
       c$h.a = new c$h();
    }
    public void c$h(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, c$h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d();
    }
}
