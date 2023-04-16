package e82.a;
import e82.a$a;
import java.lang.reflect.Type;
import el.a;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.System;
import java.lang.Boolean;
import pm8.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;

public class a	// class@0026a1
{
    public boolean a;
    public static final Type b;
    public static List c;

    static {
       a.b = new a$a().getType();
       a.c = new ArrayList();
    }
    public void a(){
       super();
    }
    public static long a(){
       Object obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return System.currentTimeMillis();
    }
    public static boolean b(){
       Object obj = PatchProxy.apply(null, null, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a.getBoolean(b.d("user")+"liveAudienceNebulaGoldCoinDialogAutoCheck", false);
    }
}
