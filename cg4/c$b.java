package cg4.c$b;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import vg4.i;

public final class c$b implements a	// class@00052e
{
    public static final c$b a;

    static {
       c$b.a = new c$b();
    }
    public void c$b(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, c$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new i();
    }
}
