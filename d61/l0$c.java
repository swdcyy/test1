package d61.l0$c;
import d61.l0;
import java.lang.String;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class l0$c extends l0	// class@001f2d
{

    public void l0$c(String p0){
       super(p0);
    }
    public Object b(Object p0){
       Long longx = PatchProxy.applyOneRefs(p0, this, l0$c.class, "2");
       if (longx != PatchProxyResult.class) {
       }else {
          longx = Long.valueOf(l0.b.getLong(this.a, p0.longValue()));
       }
       return longx;
    }
    public void i(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l0$c.class, "1")) {
       }else {
          g.a(l0.b.edit().putLong(this.a, p0.longValue()));
       }
       return;
    }
}
