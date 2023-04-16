package cg4.c$i;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import gg4.c;

public final class c$i implements a	// class@000535
{
    public static final c$i a;

    static {
       c$i.a = new c$i();
    }
    public void c$i(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, c$i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c();
    }
}
