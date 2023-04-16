package bm5.e$a;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ql5.b;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class e$a	// class@0004e8
{

    public void e$a(){
       super();
    }
    public void e$a(u p0){
       super();
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, e$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a.getBoolean("enableGravityAccessLandscape", false);
    }
    public final void b(boolean p0){
       e$a uoa = e$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "2")) {
          return;
       }
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putBoolean("enableGravityAccessLandscape", p0);
       g.a(uEditor);
       return;
    }
}
