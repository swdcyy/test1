package cj4.a$a;
import su.a;
import java.lang.Object;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cj4.a;

public final class a$a implements a	// class@000478
{
    public static final a$a a;

    static {
       a$a.a = new a$a();
    }
    public void a$a(){
       super();
    }
    public final NativeComponent a(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
}
