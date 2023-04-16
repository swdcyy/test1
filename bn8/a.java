package bn8.a;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import com.yxcorp.gifshow.model.config.ShowAlbum;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class a	// class@000435
{
    public static final SharedPreferences a;

    static {
       a.a = b.b("DefaultPreferenceHelper");
    }
    public static String a(){
       return a.a.getString("beautify_configs_v2", "");
    }
    public static int b(){
       return a.a.getInt("camera_tab_margin_bottom", 0);
    }
    public static String c(){
       return a.a.getString("last_beautify_config_v2", "");
    }
    public static String d(){
       return a.a.getString("last_beautify_config_v3", "");
    }
    public static int e(){
       return a.a.getInt("live_entry_camera_take_picture_guide_shown_count", 0);
    }
    public static boolean f(){
       return a.a.getBoolean("magic_auto_apply_music_bubble_shown", false);
    }
    public static boolean g(){
       return a.a.getBoolean("post_permission_opt_auto_shown", false);
    }
    public static ShowAlbum h(Type p0){
       String str = a.a.getString("show_album", "");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static boolean i(){
       return a.a.getBoolean("whats_up_beautify_off", false);
    }
    public static boolean j(){
       return a.a.getBoolean("whats_up_multi_camera_off", false);
    }
    public static void k(String p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString("last_beautify_config_v3", p0);
       g.a(uEditor);
    }
    public static void l(int p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putInt("live_entry_camera_take_picture_guide_shown_count", p0);
       g.a(uEditor);
    }
    public static void m(boolean p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("post_permission_opt_auto_shown", p0);
       g.a(uEditor);
    }
    public static void n(boolean p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("record_beauty_new_version_enabled", p0);
       g.a(uEditor);
    }
    public static void o(boolean p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("record_beauty_new_version_ever_used", p0);
       g.a(uEditor);
    }
    public static void p(boolean p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("whats_up_beautify_off", p0);
       g.a(uEditor);
    }
}
