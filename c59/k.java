package c59.k;
import c59.k$a;
import nsd.u;
import java.lang.Object;
import android.app.Application;
import o56.a;
import android.content.Context;
import android.view.ViewConfiguration;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class k	// class@0004ec
{
    public View a;
    public float b;
    public float c;
    public final int d;
    public float e;
    public AdtkHalfFrameLayout f;
    public e g;
    public int h;
    public static final k$a i;

    static {
       k.i = new k$a(null);
    }
    public void k(){
       super();
       ViewConfiguration viewConfigur = ViewConfiguration.get(a.b());
       a.o(viewConfigur, "ViewConfiguration.get\(AppEnv.getAppContext\(\)\)");
       this.d = viewConfigur.getScaledTouchSlop();
    }
    public final boolean a(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null)? p0.canScrollVertically(-1): false;
       return b;
    }
}
