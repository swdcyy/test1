package db6.e;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import com.kwai.sdk.switchconfig.a;
import oe6.g;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import android.app.Application;
import o56.a;
import android.content.Context;
import oe6.o;

public class e	// class@0014a5
{
    public static SharedPreferences a;

    public void e(){
       super();
    }
    public static void a(String p0,Boolean p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, e.class, "18")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          g.a(e.e().edit().putBoolean(p0, a.t().d(p0, p1.booleanValue())));
       }
       return;
    }
    public static void b(String p0,Long p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, e.class, "19")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          g.a(e.e().edit().putLong(p0, a.t().b(p0, p1.longValue())));
       }
       return;
    }
    public static void c(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, e.class, "17")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          g.a(e.e().edit().putString(p0, a.t().c(p0, p1)));
       }
       return;
    }
    public static String d(){
       Object obj = PatchProxy.apply(null, null, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.e().getString("cronetConfig", "{}");
    }
    public static SharedPreferences e(){
       e uoe = e.class;
       Object obj = PatchProxy.apply(null, null, uoe, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (e.a == null) {
          _monitor_enter(uoe);
          if (e.a == null) {
             e.a = o.c(a.b(), "SPCronetConfig", 0);
          }
          _monitor_exit(uoe);
       }
       return e.a;
    }
    public static boolean f(){
       Object obj = PatchProxy.apply(null, null, e.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.e().getBoolean("preinitCronet", false);
    }
}
