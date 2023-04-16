package f66.c;
import java.lang.Object;
import com.kwai.framework.debuglog.DiagnosisClientLogLevel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import f66.g;
import android.content.SharedPreferences;

public class c	// class@0015d4
{
    public int a;

    public void c(){
       super();
    }
    public static DiagnosisClientLogLevel a(){
       Object obj = PatchProxy.apply(null, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DiagnosisClientLogLevel.valueOfInt(g.a.getInt("diagnosis_log_level", 0));
    }
}
