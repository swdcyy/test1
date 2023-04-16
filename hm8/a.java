package hm8.a;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class a	// class@0025a4
{
    public static final SharedPreferences a;

    static {
       a.a = b.b("DefaultPreferenceHelper");
    }
    public static long a(){
       return a.a.getLong(b.d("user")+"friend_slide_play_last_show_red_dot_timestamp", 0);
    }
    public static int b(){
       return a.a.getInt(b.d("user")+"friend_slide_play_show_red_dot_counts", 0);
    }
    public static int c(){
       return a.a.getInt(b.d("user")+"friend_slide_play_unread_finish_tips_last_show_count", 0);
    }
    public static int d(){
       return a.a.getInt(b.d("user")+"hasShowNewsRedDotTimes", 0);
    }
    public static long e(){
       return a.a.getLong(b.d("user")+"lastEnterNewsSlidePlayTimeMs", 0);
    }
    public static long f(){
       return a.a.getLong(b.d("user")+"lastShowNewsRedDotTimeMs", 0);
    }
    public static void g(boolean p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean(b.d("user")+"friend_slide_play_has_show_more_action_guide_pop", p0);
       g.a(uEditor);
    }
    public static void h(long p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putLong(b.d("user")+"friend_slide_play_last_show_red_dot_timestamp", p0);
       g.a(uEditor);
    }
    public static void i(int p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putInt(b.d("user")+"friend_slide_play_show_red_dot_counts", p0);
       g.a(uEditor);
    }
    public static void j(int p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putInt(b.d("user")+"friend_slide_play_unread_finish_tips_last_show_count", p0);
       g.a(uEditor);
    }
    public static void k(boolean p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean(b.d("user")+"friend_tab_has_show_friend_manager_guide_animation", p0);
       g.a(uEditor);
    }
    public static void l(boolean p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("has_friend_guide_shown_in_follow_slide_play_v2", p0);
       g.a(uEditor);
    }
    public static void m(int p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putInt(b.d("user")+"hasShowNewsRedDotTimes", p0);
       g.a(uEditor);
    }
    public static void n(long p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putLong(b.d("user")+"lastEnterNewsSlidePlayTimeMs", p0);
       g.a(uEditor);
    }
    public static void o(boolean p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean(b.d("user")+"last_friend_second_tab_is_find_friend_tab", p0);
       g.a(uEditor);
    }
    public static void p(long p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putLong(b.d("user")+"lastShowNewsRedDotTimeMs", p0);
       g.a(uEditor);
    }
}
