package cg4.c$s;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bg4.b;

public final class c$s implements a	// class@00053f
{
    public static final c$s a;

    static {
       c$s.a = new c$s();
    }
    public void c$s(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, c$s.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b();
    }
}
