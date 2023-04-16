package d61.l0$d;
import d61.l0;
import java.lang.String;
import java.lang.reflect.Type;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.SharedPreferences;
import java.lang.CharSequence;
import android.text.TextUtils;
import km8.b;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class l0$d extends l0	// class@001f2e
{
    public final Type d;

    public void l0$d(String p0,Type p1){
       super(p0);
       this.d = p1;
    }
    public Object b(Object p0){
       String obj = PatchProxy.applyOneRefs(p0, this, l0$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = l0.b.getString(this.a, "");
       if (TextUtils.isEmpty(obj)) {
          return p0;
       }
       return b.a(obj, this.d);
    }
    public void i(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l0$d.class, "1")) {
          return;
       }
       p0 = (p0 == null)? "": b.e(p0);
       g.a(l0.b.edit().putString(this.a, p0));
       return;
    }
}
