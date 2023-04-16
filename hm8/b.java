package hm8.b;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import com.kwai.feature.api.social.reminder.push.BarConfig;
import java.lang.StringBuilder;
import sx5.a;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class b	// class@0025a5
{
    public static final SharedPreferences a;

    static {
       b.a = b.b("PushSocialData");
    }
    public static BarConfig a(Type p0){
       String str = b.a.getString(b.d("user")+"barConfig", "");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static a b(Type p0){
       String str = b.a.getString(b.d("user")+"barState", "");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static void c(){
       g.a(b.a.edit().remove(b.d("user")+"barConfig"));
    }
    public static void d(){
       g.a(b.a.edit().remove(b.d("user")+"barState"));
    }
    public static void e(){
       g.a(b.a.edit().remove(b.d("user")+"popConfig"));
    }
    public static void f(){
       g.a(b.a.edit().remove(b.d("user")+"popState"));
    }
}
