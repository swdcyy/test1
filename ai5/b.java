package ai5.b;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class b	// class@0000a6
{
    public static final SharedPreferences a;

    static {
       b.a = b.b("DefaultPreferenceHelper");
    }
    public static void a(int p0){
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putInt("currentInstallVersionCode", p0);
       g.a(uEditor);
    }
    public static void b(int p0){
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putInt("LatestVersionCode", p0);
       g.a(uEditor);
    }
    public static void c(long p0){
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putLong("upgrade_install_hint_dialog_show_time", p0);
       g.a(uEditor);
    }
    public static void d(boolean p0){
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putBoolean("upgrade_install_notification_bar_should_show", p0);
       g.a(uEditor);
    }
    public static void e(int p0){
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putInt("willInstallVersionCode", p0);
       g.a(uEditor);
    }
}
