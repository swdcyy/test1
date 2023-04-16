package c09.b$b$a;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;

public final class b$b$a implements g	// class@0004b4
{
    public static final b$b$a b;

    static {
       b$b$a.b = new b$b$a();
    }
    public void b$b$a(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b$a.class, "1")) {
       }else {
          p0 = new Object[0];
          j0.c("ClickToShareBridge", "shareWeb response error", p0);
       }
       return;
    }
}
