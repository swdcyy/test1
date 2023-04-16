package f3b.a;
import java.lang.Object;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.accessibility.AccessibilityManager;
import java.util.List;
import java.util.Collection;
import ekd.q;

public final class a	// class@00287d
{

    public void a(){
       super();
    }
    public static boolean a(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       AccessibilityManager systemServic = p0.getApplicationContext().getSystemService("accessibility");
       boolean b = false;
       if (systemServic == null) {
          return b;
       }
       if (!q.f(systemServic.getEnabledAccessibilityServiceList(1)) && systemServic.isTouchExplorationEnabled()) {
          b = true;
       }
       return b;
    }
}
