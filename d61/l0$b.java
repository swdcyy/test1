package d61.l0$b;
import d61.l0;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class l0$b extends l0	// class@001f2c
{

    public void l0$b(String p0){
       super(p0);
    }
    public Object b(Object p0){
       Integer integer = PatchProxy.applyOneRefs(p0, this, l0$b.class, "2");
       if (integer != PatchProxyResult.class) {
       }else {
          integer = Integer.valueOf(l0.b.getInt(this.a, p0.intValue()));
       }
       return integer;
    }
    public void i(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l0$b.class, "1")) {
       }else {
          g.a(l0.b.edit().putInt(this.a, p0.intValue()));
       }
       return;
    }
}
