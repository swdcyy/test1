package k59.v2$a$a;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;

public final class v2$a$a implements g	// class@002b29
{
    public static final v2$a$a b;

    static {
       v2$a$a.b = new v2$a$a();
    }
    public void v2$a$a(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v2$a$a.class, "1")) {
       }else {
          p0 = new Object[0];
          j0.c("WebViewShareHeadPresenter", "shareWeb response error", p0);
       }
       return;
    }
}
