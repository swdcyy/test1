package of6.f;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nf6.b;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class f	// class@00201d
{
    public String a;

    public void f(){
       super();
    }
    public static String a(){
       Object obj = PatchProxy.apply(null, null, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a.getString("promote_tag", "");
    }
    public static void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, f.class, "2")) {
          return;
       }
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putString("promote_tag", p0);
       g.a(uEditor);
       return;
    }
}
