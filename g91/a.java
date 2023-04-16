package g91.a;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import java.util.List;

public final class a	// class@00243c
{
    public static final SharedPreferences a;

    static {
       a.a = b.b("DefaultPreferenceHelper");
    }
    public static List a(Type p0){
       String str = a.a.getString("hasClickedUserRightsIds", "null");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
}
