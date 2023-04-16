package mwb.b;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class b	// class@001ee7
{
    public static final SharedPreferences a;

    static {
       b.a = b.b("MonitorOnlinePreference");
    }
    public static boolean a(){
       return b.a.getBoolean("BatteryMonitorOpen", false);
    }
    public static boolean b(){
       return b.a.getBoolean("FpsMonitorOpen", false);
    }
    public static String c(){
       return b.a.getString("FpsSceneConfig", "");
    }
    public static int d(){
       return b.a.getInt("LaunchCount", 0);
    }
    public static long e(){
       return b.a.getLong("MonitorBeginTime", -1);
    }
    public static String f(){
       return b.a.getString("MonitorDir", "");
    }
    public static String g(){
       return b.a.getString("MonitorDirParent", "");
    }
    public static int h(){
       return b.a.getInt("MonitorIntervelDays", 7);
    }
    public static boolean i(){
       return b.a.getBoolean("PageConfigWithKeep", false);
    }
    public static boolean j(){
       return b.a.getBoolean("PageMonitorInitOnExecute", true);
    }
    public static void k(String p0){
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putString("BatteryMonitorConfig", p0);
       g.a(uEditor);
    }
    public static void l(boolean p0){
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putBoolean("BatteryMonitorOpen", p0);
       g.a(uEditor);
    }
    public static void m(boolean p0){
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putBoolean("DiskMonitoring", p0);
       g.a(uEditor);
    }
    public static void n(int p0){
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putInt("LaunchCount", p0);
       g.a(uEditor);
    }
    public static void o(String p0){
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putString("MonitorDirParent", p0);
       g.a(uEditor);
    }
    public static void p(String p0){
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putString("PageMonitorConfig", p0);
       g.a(uEditor);
    }
    public static void q(String p0){
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putString("SpecifiedPageConfig", p0);
       g.a(uEditor);
    }
}
