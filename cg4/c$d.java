package cg4.c$d;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zh4.e;

public final class c$d implements a	// class@000530
{
    public static final c$d a;

    static {
       c$d.a = new c$d();
    }
    public void c$d(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, c$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new e();
    }
}
