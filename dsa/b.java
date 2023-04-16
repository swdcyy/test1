package dsa.b;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class b	// class@002510
{
    public static final SharedPreferences a;

    static {
       b.a = b.b("DefaultPreferenceHelper");
    }
    public static void a(boolean p0){
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putBoolean("enableRecommendedPopupShow", p0);
       g.a(uEditor);
    }
    public static void b(int p0){
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putInt("recommendedFeedTotalSize", p0);
       g.a(uEditor);
    }
    public static void c(int p0){
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putInt("recommendedPopupContinuousShowNumber", p0);
       g.a(uEditor);
    }
    public static void d(long p0){
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putLong("recommendedPopupRuleEffectTime", p0);
       g.a(uEditor);
    }
}
