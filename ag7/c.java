package ag7.c;
import java.lang.Object;
import msd.l;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class c	// class@0000c2
{
    public static SharedPreferences a;
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void a(l p0){
       a.q(p0, "sharedPreferencesInvoker");
       c.a = p0.invoke("performance");
    }
    public final boolean b(){
       SharedPreferences a = c.a;
       if (a == null) {
          a.S("mPreferences");
       }
       return a.getBoolean("cpuMonitorSupport", true);
    }
    public final boolean c(){
       SharedPreferences a = c.a;
       if (a == null) {
          a.S("mPreferences");
       }
       return a.getBoolean("gpuInfoCollected", false);
    }
    public final void d(boolean p0){
       SharedPreferences a = c.a;
       if (a == null) {
          a.S("mPreferences");
       }
       g.a(a.edit().putBoolean("cpuMonitorEnableNew", p0));
       return;
    }
    public final void e(boolean p0){
       SharedPreferences a = c.a;
       if (a == null) {
          a.S("mPreferences");
       }
       g.a(a.edit().putBoolean("cpuMonitorSupport", p0));
       return;
    }
}
