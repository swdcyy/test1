package aa0.a;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Map;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class a	// class@000033
{
    public static final SharedPreferences a;

    static {
       a.a = b.b("DefaultPreferenceHelper");
    }
    public static boolean a(){
       return a.a.getBoolean(b.d("user")+"live_anchor_merchant_manager_all_tools_expandable", true);
    }
    public static boolean b(){
       return a.a.getBoolean(b.d("user")+"live_anchor_merchant_tools_expandable", true);
    }
    public static HashSet c(Type p0){
       String str = a.a.getString(b.d("user")+"live_anchor_merchant_tools_use_set", "null");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static Map d(Type p0){
       String str = a.a.getString("merchant_live_cart_conform_pop_show_timestamp", "null");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static int e(){
       return a.a.getInt("merchant_live_cart_guide_appear_times", 0);
    }
    public static Map f(Type p0){
       String str = a.a.getString("merchant_live_cart_non_conform_pop_show_timestamp", "null");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static void g(boolean p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean(b.d("user")+"live_anchor_merchant_manager_all_tools_expandable", p0);
       g.a(uEditor);
    }
    public static void h(boolean p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean(b.d("user")+"live_anchor_merchant_tools_expandable", p0);
       g.a(uEditor);
    }
    public static void i(HashSet p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString(b.d("user")+"live_anchor_merchant_tools_use_set", b.e(p0));
       g.a(uEditor);
    }
    public static void j(Map p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString("merchant_live_cart_conform_pop_show_timestamp", b.e(p0));
       g.a(uEditor);
    }
    public static void k(Map p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString("merchant_live_cart_non_conform_pop_show_timestamp", b.e(p0));
       g.a(uEditor);
    }
    public static void l(int p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putInt("merchant_marketing_anim_task_step", p0);
       g.a(uEditor);
    }
}
