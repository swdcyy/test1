package ai5.m;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import ai5.b;
import android.content.SharedPreferences;
import o56.a;
import java.lang.Math;

public class m	// class@0000b1
{

    public void m(){
       super();
    }
    public static int a(){
       Object obj = PatchProxy.apply(null, null, m.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Math.max(b.a.getInt("LatestVersionCode", 0), a.q);
    }
}
