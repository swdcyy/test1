package cg4.c$r;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import id4.c;

public final class c$r implements a	// class@00053e
{
    public static final c$r a;

    static {
       c$r.a = new c$r();
    }
    public void c$r(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, c$r.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c();
    }
}
