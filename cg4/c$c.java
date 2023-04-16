package cg4.c$c;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import vg4.r;

public final class c$c implements a	// class@00052f
{
    public static final c$c a;

    static {
       c$c.a = new c$c();
    }
    public void c$c(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, c$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new r();
    }
}
