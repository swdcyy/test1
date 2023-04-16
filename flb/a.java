package flb.a;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import fg6.a;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import flb.a$a;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import java.util.Collections;
import kotlin.jvm.internal.a;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class a	// class@002964
{
    public static final SharedPreferences a;
    public static final Gson b;
    public static List c;
    public static final Object d;
    public static final a e;

    static {
       a.e = new a();
       a.a = b.b("DefaultPreferenceHelper");
       a.b = a.a;
       a.d = new Object();
    }
    public void a(){
       super();
    }
    public final List a(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.d;
       _monitor_enter(obj);
       List c = a.c;
       if (c == null) {
          c = a.e.c();
          a.c = c;
       }
       _monitor_exit(obj);
       return c;
    }
    public final String b(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a.getString("activityInfoListVersion", null);
    }
    public final List c(){
       String obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a.getString("ActivityInfoList", "");
       if (obj != null) {
          Gson gson = (obj.length() > 0)? 1: null;
          if (gson) {
             try{
                List list = a.b.i(obj, new a$a().getType());
                if (list == null) {
                   list = Collections.emptyList();
                   a.o(list, "emptyList\(\)");
                }
                list.size();
                return list;
             }catch(java.lang.Exception e0){
                g.a(a.a.edit().putString("activityInfoListVersion", ""));
             }
          }
       }
    }
}
