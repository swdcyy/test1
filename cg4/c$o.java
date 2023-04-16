package cg4.c$o;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kh4.g;

public final class c$o implements a	// class@00053b
{
    public static final c$o a;

    static {
       c$o.a = new c$o();
    }
    public void c$o(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, c$o.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new g();
    }
}
