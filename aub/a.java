package aub.a;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import com.yxcorp.gifshow.reddot.RedDotConfig;
import java.util.Map;
import java.lang.StringBuilder;

public final class a	// class@00031e
{
    public static final SharedPreferences a;

    static {
       a.a = b.b("DefaultPreferenceHelper");
    }
    public static RedDotConfig a(Type p0){
       String str = a.a.getString("redDot", "");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static Map b(Type p0){
       String str = a.a.getString(b.d("user")+"redDotPriorityMap", "{}");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
}
