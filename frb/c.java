package frb.c;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import com.yxcorp.gifshow.nearby.common.model.NearbyCachePoolPastRecord;
import java.util.ArrayList;
import java.lang.StringBuilder;
import java.util.Map;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.kwai.nearby.startup.local.model.NearbyLocationTriggerConfig;
import com.kwai.nearby.startup.local.model.NearbyInnerSlideGuideParam;

public final class c	// class@0029d6
{
    public static final SharedPreferences a;

    static {
       c.a = b.b("NearbyCommonPreferenceHelper");
    }
    public static NearbyCachePoolPastRecord a(Type p0){
       String str = c.a.getString("nearby_cache_pool_past_record", "null");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static ArrayList b(Type p0){
       String str = c.a.getString(b.d("user")+"nearby_live_stream_guide_show_list", "");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static ArrayList c(Type p0){
       String str = c.a.getString(b.d("user")+"nearby_location_gudie_show_list", "");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static int d(){
       return c.a.getInt("nearby_real_action_empty_reason", 0);
    }
    public static Map e(Type p0){
       String str = c.a.getString(b.d("user")+"nearby_slide_guide_map", "");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static ArrayList f(Type p0){
       String str = c.a.getString(b.d("user")+"nearby_up_down_guide_show_list", "");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static void g(ArrayList p0){
       SharedPreferences$Editor uEditor = c.a.edit();
       uEditor.putString(b.d("user")+"nearby_live_stream_guide_show_list", b.e(p0));
       g.a(uEditor);
    }
    public static void h(long p0){
       SharedPreferences$Editor uEditor = c.a.edit();
       uEditor.putLong(b.d("user")+"nearby_live_stream_scroll_time", p0);
       g.a(uEditor);
    }
    public static void i(ArrayList p0){
       SharedPreferences$Editor uEditor = c.a.edit();
       uEditor.putString(b.d("user")+"nearby_location_gudie_show_list", b.e(p0));
       g.a(uEditor);
    }
    public static void j(NearbyLocationTriggerConfig p0){
       SharedPreferences$Editor uEditor = c.a.edit();
       uEditor.putString(b.d("user")+"nearby_location_trigger_config", b.e(p0));
       g.a(uEditor);
    }
    public static void k(int p0){
       SharedPreferences$Editor uEditor = c.a.edit();
       uEditor.putInt("nearby_real_action_empty_reason", p0);
       g.a(uEditor);
    }
    public static void l(Map p0){
       SharedPreferences$Editor uEditor = c.a.edit();
       uEditor.putString(b.d("user")+"nearby_slide_guide_map", b.e(p0));
       g.a(uEditor);
    }
    public static void m(ArrayList p0){
       SharedPreferences$Editor uEditor = c.a.edit();
       uEditor.putString(b.d("user")+"nearby_up_down_guide_show_list", b.e(p0));
       g.a(uEditor);
    }
    public static void n(NearbyInnerSlideGuideParam p0){
       SharedPreferences$Editor uEditor = c.a.edit();
       uEditor.putString(b.d("user")+"nearby_up_down_slide_guide_param", b.e(p0));
       g.a(uEditor);
    }
}
