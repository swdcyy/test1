package gy9.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import java.lang.Boolean;
import com.yxcorp.utility.SystemUtil;
import tkd.b;
import tkd.d;
import ayb.i;
import kotlin.jvm.internal.a;
import java.util.Date;
import uw9.q3;
import android.content.SharedPreferences;

public final class f	// class@00250d
{

    public static final int a(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       Object[] objArray = null;
       Date obj = PatchProxy.apply(objArray, objArray, uof, "2");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       SharedPreferences obj1 = PatchProxy.apply(objArray, objArray, uof, "1");
       int i = 0;
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(SystemUtil.K()){
          Object obj2 = d.a(0x4f878389).qB("KEY_INTENSIFY_DISABLE_SHOW_COUNT", Boolean.FALSE);
          a.o(obj2, "PluginManager.get\(Growth¡­SABLE_SHOW_COUNT\", false\)");
          if (obj2.booleanValue()) {
             b = true;
          }
       }
       b = false;
       if (b) {
          return i;
       }else {
          obj1 = q3.a;
          Date uDate = new Date(obj1.getLong("pyml_limit_date", 0));
          uDate.setMinutes(i);
          uDate.setHours(i);
          uDate.setSeconds(i);
          obj = new Date();
          obj.setMinutes(i);
          obj.setHours(i);
          obj.setSeconds(i);
          long l = (long)1000;
          if (!(obj.getTime() / l) - (uDate.getTime() / l)) {
             i = obj1.getInt("pyml_show_count", i);
          }
          return i;
       }
    }
}
