package cg4.c$p;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lh4.g;

public final class c$p implements a	// class@00053c
{
    public static final c$p a;

    static {
       c$p.a = new c$p();
    }
    public void c$p(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, c$p.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new g();
    }
}
