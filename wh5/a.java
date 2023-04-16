package wh5.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.utility.Log;
import wh5.b;
import wh5.d;
import th5.a;
import com.kwai.robust.PatchProxyResult;
import android.content.SharedPreferences;
import com.kwai.component.uiconfig.childlock.model.TeenageModeConfig;
import com.kwai.component.uiconfig.childlock.model.TeenageModeFeatureConfig;
import com.yxcorp.gifshow.util.DateUtils;
import android.content.SharedPreferences$Editor;
import oe6.g;
import wh5.c;
import com.kwai.framework.model.user.QCurrentUser;

public final class a	// class@002759
{
    public static boolean a;
    public static boolean b;

    public void a(){
       super();
    }
    public static void a(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, uoa, "6")) {
          return;
       }
       Log.g("TeenageMode", "clearTeenageConfig");
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, uob, "6")) {
          d.a("teenageModeConfig", p0);
          d.a("teenage_mode_feature_config", p0);
       }
       a.b(false);
       return;
    }
    public static boolean b(){
       Object obj = PatchProxy.apply(null, null, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a.getBoolean("last_child_lock_enable", false);
    }
    public static TeenageModeConfig c(){
       Object obj = PatchProxy.apply(null, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a();
    }
    public static TeenageModeFeatureConfig d(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, null, a.class, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, null, b.class, "5");
       if (obj != patchProxyRe) {
       }else {
          obj = d.b("teenage_mode_feature_config", TeenageModeFeatureConfig.class);
       }
       return obj;
    }
    public static boolean e(){
       Object obj = PatchProxy.apply(null, null, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       long longx = a.a.getLong("show_teenage_mode_dialog_time", 0);
       boolean b = (longx > 0 && DateUtils.H(longx))? true: false;
       return b;
    }
    public static boolean f(){
       return a.a;
    }
    public static void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "9")) {
          return;
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString("child_lock_password", p0);
       g.a(uEditor);
       return;
    }
    public static void h(boolean p0){
       a.b = p0;
    }
    public static void i(boolean p0){
       a.a = p0;
    }
    public static void j(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, uoa, "13")) {
          return;
       }
       a.b(p0);
       return;
    }
    public static void k(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, uoa, "1")) {
          return;
       }
       TeenageModeConfig teenageModeC = a.c();
       teenageModeC.mIsOpen = p0;
       b.b(teenageModeC);
       if (c.m() && QCurrentUser.me().isLogined()) {
          b.c(p0);
       }
       a.b(p0);
       return;
    }
}
