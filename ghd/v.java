package ghd.v;
import com.kwai.framework.model.user.QCurrentUser;
import lu7.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import yfd.c;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import oe6.b;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class v	// class@000f41
{

    static {
       boolean b = (v.a())? f.k(QCurrentUser.ME): v.a();
       v.b(b);
    }
    public void v(){
       super();
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, v.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (!c.a.getBoolean(b.d("user")+"isAllowComment", b) && b.b()) {
          b = false;
       }
       return b;
    }
    public static void b(boolean p0){
       v ov = v.class;
       if (PatchProxy.isSupport(ov) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, ov, "2")) {
          return;
       }
       SharedPreferences$Editor uEditor = c.a.edit();
       uEditor.putBoolean(b.d("user")+"isAllowComment", p0);
       g.a(uEditor);
       return;
    }
}
