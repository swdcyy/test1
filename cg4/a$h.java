package cg4.a$h;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import id4.c;

public final class a$h implements a	// class@00050a
{
    public static final a$h a;

    static {
       a$h.a = new a$h();
    }
    public void a$h(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, a$h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c();
    }
}
