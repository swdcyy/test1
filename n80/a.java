package n80.a;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class a	// class@0026c9
{
    public static final SharedPreferences a;

    static {
       a.a = b.b("DefaultPreferenceHelper");
    }
    public static boolean a(){
       return a.a.getBoolean("is_need_show_reedit_music_red_dot", true);
    }
    public static int b(){
       return a.a.getInt(b.d("user")+"maxShowShareListCount", 7);
    }
    public static int c(){
       return a.a.getInt("privacy_dialog_show_count", 0);
    }
    public static int d(){
       return a.a.getInt("ScreenShotShareDays", 0);
    }
    public static int e(){
       return a.a.getInt("ScreenShotShareShowSeconds", 0);
    }
    public static int f(){
       return a.a.getInt("ScreenShotShareTimes", 0);
    }
    public static int g(){
       return a.a.getInt("sharePopGuideShowCount", 0);
    }
    public static String h(){
       return a.a.getString("TagShareDomain", "");
    }
    public static void i(boolean p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("hasSharePopGuideHide", p0);
       g.a(uEditor);
    }
    public static void j(boolean p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("is_need_show_reedit_music_red_dot", p0);
       g.a(uEditor);
    }
    public static void k(int p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putInt("screenShotCloseTimes", p0);
       g.a(uEditor);
    }
    public static void l(long p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putLong("screenShotCloseTimestamp", p0);
       g.a(uEditor);
    }
    public static void m(int p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putInt("sharePopGuideShowCount", p0);
       g.a(uEditor);
    }
}
