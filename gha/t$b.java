package gha.t$b;
import gha.t;
import java.lang.String;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class t$b extends t	// class@002ae6
{

    public void t$b(String p0){
       super(p0);
    }
    public Object a(Object p0){
       Long longx = PatchProxy.applyOneRefs(p0, this, t$b.class, "2");
       if (longx != PatchProxyResult.class) {
       }else {
          longx = Long.valueOf(t.b.getLong(this.a, p0.longValue()));
       }
       return longx;
    }
    public void d(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t$b.class, "1")) {
       }else {
          g.a(t.b.edit().putLong(this.a, p0.longValue()));
       }
       return;
    }
}
