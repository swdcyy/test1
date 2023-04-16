package eob.a;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import com.yxcorp.gifshow.moment_downloader.startup.MomentConfig;
import java.lang.StringBuilder;

public final class a	// class@002789
{
    public static final SharedPreferences a;

    static {
       a.a = b.b("DefaultPreferenceHelper");
    }
    public static MomentConfig a(Type p0){
       String str = a.a.getString(b.d("user")+"momentConfig", "");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
}
