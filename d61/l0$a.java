package d61.l0$a;
import d61.l0;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class l0$a extends l0	// class@001f2b
{

    public void l0$a(String p0){
       super(p0);
    }
    public Object b(Object p0){
       Boolean uBoolean = PatchProxy.applyOneRefs(p0, this, l0$a.class, "2");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          uBoolean = Boolean.valueOf(l0.b.getBoolean(this.a, p0.booleanValue()));
       }
       return uBoolean;
    }
    public void i(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l0$a.class, "1")) {
       }else {
          g.a(l0.b.edit().putBoolean(this.a, p0.booleanValue()));
       }
       return;
    }
}
