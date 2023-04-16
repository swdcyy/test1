package ea1.b;
import ea1.b$a;
import nsd.u;
import java.lang.Object;
import android.view.View;
import com.kuaishou.live.common.core.basic.optimizeui.ViewElement;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class b	// class@0020c6
{
    public static final b$a a;

    static {
       b.a = new b$a(null);
    }
    public void b(){
       super();
    }
    public static final void a(View p0,ViewElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "1")) {
          return;
       }
       b.a.a(p0, p1);
       return;
    }
}
