package b0d.b;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import java.lang.StringBuilder;
import oe6.g;

public final class b	// class@000313
{
    public static final SharedPreferences a;

    static {
       b.a = b.b("ReminderTabHostMomentPreference");
    }
    public static void a(boolean p0){
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putBoolean(b.d("user")+"hasShowMomentTips", p0);
       g.a(uEditor);
    }
}
