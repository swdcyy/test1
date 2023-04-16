package k59.s2$b$d;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;

public final class s2$b$d implements g	// class@002b16
{
    public static final s2$b$d b;

    static {
       s2$b$d.b = new s2$b$d();
    }
    public void s2$b$d(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s2$b$d.class, "1")) {
       }else {
          p0 = new Object[0];
          j0.c("WebViewHeadPresenter", "captureBitmap error", p0);
       }
       return;
    }
}
