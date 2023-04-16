package akd.b0;
import java.lang.Object;
import android.content.SharedPreferences;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zjd.d;
import akd.p;
import android.app.Application;
import java.lang.StringBuilder;
import android.content.Context;
import oe6.o;

public class b0	// class@000049
{
    public static SharedPreferences a;

    public void b0(){
       super();
    }
    public static synchronized SharedPreferences a(){
       _monitor_enter(b0.class);
       Application obj = PatchProxy.apply(null, null, b0.class, "1");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(b0.class);
          return obj;
       }else if(b0.a == null){
          obj = p.c().getApplication();
          b0.a = o.c(obj, obj.getPackageName()+"."+"UPGRADE_PREFERENCE_FILE", 0);
       }
       _monitor_exit(b0.class);
       return b0.a;
    }
}
