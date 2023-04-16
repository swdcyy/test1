package cg4.c$t;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lg4.e;

public final class c$t implements a	// class@000540
{
    public static final c$t a;

    static {
       c$t.a = new c$t();
    }
    public void c$t(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, c$t.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new e();
    }
}
