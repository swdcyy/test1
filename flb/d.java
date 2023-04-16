package flb.d;
import erd.g;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import flb.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import oe6.g;

public final class d implements g	// class@002967
{
    public final String b;

    public void d(String p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          p0 = a.a.edit().putString("ActivityInfoList", a.b.q(p0));
          d tb = this.b;
          if (tb == null) {
             tb = "";
          }
          g.a(p0.putString("activityInfoListVersion", tb));
       }
       return;
    }
}
