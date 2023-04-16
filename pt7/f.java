package pt7.f;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import fg6.a;
import com.kwai.social.startup.reminder.model.IMConfigInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.google.gson.Gson;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class f	// class@0021f8
{
    public static SharedPreferences a;
    public static Gson b;
    public static Object c;
    public static IMConfigInfo d;
    public static String e;

    static {
       f.a = b.b("DefaultPreferenceHelper");
       f.b = a.a;
       f.c = new Object();
    }
    public void f(){
       super();
    }
    public final IMConfigInfo a(){
       String obj = PatchProxy.apply(null, this, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = f.a.getString(b.d("user")+"im_config_info", "");
       if (!TextUtils.x(obj)) {
          return f.b.h(obj, IMConfigInfo.class);
       }
    }
}
