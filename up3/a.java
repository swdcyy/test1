package up3.a;
import up3.b;
import java.lang.Object;
import up3.b$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$MarginLayoutParams;
import com.kwai.robust.PatchProxyResult;

public abstract class a implements b	// class@004192
{
    public b$a a;

    public void a(){
       super();
    }
    public final void a(b$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "callback");
       this.a = p0;
       return;
    }
    public ViewGroup$MarginLayoutParams b(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ViewGroup$MarginLayoutParams(-2, -2);
    }
    public void destroy(){
       this.a = null;
    }
}
