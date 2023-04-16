package cg4.c$n;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lf4.b0;

public final class c$n implements a	// class@00053a
{
    public static final c$n a;

    static {
       c$n.a = new c$n();
    }
    public void c$n(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, c$n.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b0();
    }
}
