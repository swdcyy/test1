package zb6.d;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import pkd.a;

public class d	// class@002917
{
    public static String a = "";
    public static SharedPreferences b;
    public static final Map c;
    public static final Map d;

    static {
       d.b = b.c("se_config", 0);
       d.c = new HashMap();
       d.d = new HashMap();
    }
    public void d(){
       super();
    }
    public static String a(){
       return d.a;
    }
    public static String b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0+a.e;
    }
}
