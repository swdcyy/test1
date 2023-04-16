package cg4.a$i;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import id4.c;

public final class a$i implements a	// class@00050b
{
    public static final a$i a;

    static {
       a$i.a = new a$i();
    }
    public void a$i(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, a$i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c();
    }
}
