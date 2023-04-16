package b0d.a;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class a	// class@000312
{
    public static final SharedPreferences a;

    static {
       a.a = b.b("DefaultPreferenceHelper");
    }
    public static boolean a(){
       return a.a.getBoolean(b.d("user")+"reminder_mix_is_has_show_news_guide_bubble", false);
    }
    public static void b(boolean p0){
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean(b.d("user")+"reminder_moment_tab_to_slide_bar_guide_pop_has_show", p0);
       g.a(uEditor);
    }
}
