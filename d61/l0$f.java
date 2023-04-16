package d61.l0$f;
import d61.l0;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class l0$f extends l0	// class@001f30
{

    public void l0$f(String p0){
       super(p0);
    }
    public Object b(Object p0){
       String str = PatchProxy.applyOneRefs(p0, this, l0$f.class, "2");
       if (str != PatchProxyResult.class) {
       }else {
          str = l0.b.getString(this.a, p0);
       }
       return str;
    }
    public void i(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l0$f.class, "1")) {
       }else {
          g.a(l0.b.edit().putString(this.a, p0));
       }
       return;
    }
}
