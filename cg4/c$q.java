package cg4.c$q;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yg4.i;

public final class c$q implements a	// class@00053d
{
    public static final c$q a;

    static {
       c$q.a = new c$q();
    }
    public void c$q(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, c$q.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new i();
    }
}
