package ekd.x0;
import android.net.Uri;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import java.util.Set;
import java.util.List;
import java.io.File;

public class x0	// class@000d83
{

    public static String a(Uri p0,String p1){
       return x0.b(p0, p1, null);
    }
    public static String b(Uri p0,String p1,String p2){
       String queryParamet = p0.getQueryParameter(p1);
       if (TextUtils.x(queryParamet)) {
       }else {
          p2 = queryParamet;
       }
       return p2;
    }
    public static Set c(Uri p0){
       return p0.getQueryParameterNames();
    }
    public static List d(Uri p0,String p1){
       return p0.getQueryParameters(p1);
    }
    public static Uri e(File p0){
       return Uri.fromFile(p0);
    }
    public static Uri f(String p0){
       return Uri.parse(p0);
    }
}
