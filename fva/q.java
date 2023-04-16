package fva.q;
import java.lang.Object;
import java.util.Locale;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.app.Application;
import o56.a;
import android.content.res.Resources;
import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;

public final class q	// class@002a19
{
    public static final q a;

    static {
       q.a = new q();
    }
    public void q(){
       super();
    }
    public final String a(Locale p0,int p1){
       Application obj;
       Configuration locale;
       q oq = q.class;
       if (PatchProxy.isSupport(oq)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oq, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "locale");
       obj = a.b();
       a.o(obj, "AppEnv.getAppContext\(\)");
       Resources resources = obj.getResources();
       a.o(resources, "res");
       Configuration configuratio = resources.getConfiguration();
       locale = configuratio.locale;
       configuratio.locale = p0;
       resources.updateConfiguration(configuratio, null);
       String str = resources.getString(p1);
       a.o(str, "res.getString\(id\)");
       configuratio.locale = locale;
       resources.updateConfiguration(configuratio, null);
       return str;
    }
}
