package wwb.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ny5.a;
import android.content.SharedPreferences;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import android.text.TextUtils;
import wwb.o;
import android.content.SharedPreferences$Editor;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;

public class f	// class@00279c
{

    public void f(){
       super();
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, f.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a.getBoolean("has_view_setting", false);
    }
    public static boolean b(){
       String obj = PatchProxy.apply(null, null, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = QCurrentUser.me().getId();
       if (QCurrentUser.me().isLogined() && !TextUtils.isEmpty(obj)) {
          return o.c(obj);
       }
       return false;
    }
    public static void c(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, uof, "3")) {
          return;
       }
       String id = QCurrentUser.me().getId();
       if (QCurrentUser.me().isLogined() && !TextUtils.isEmpty(id)) {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putBoolean(b.d("user")+"allow_read_contact", p0);
          g.a(uEditor);
       }
       return;
    }
    public static void d(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, uof, "6")) {
          return;
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("has_view_setting", p0);
       g.a(uEditor);
       return;
    }
}
