package i0d.e;
import java.lang.Object;
import java.lang.String;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import rg.d$d;
import rg.e;
import rg.d;
import android.os.Build$VERSION;
import android.os.Build;
import java.util.Locale;
import java.lang.CharSequence;

public class e	// class@001785
{

    public void e(){
       super();
    }
    public static void a(String p0,Context p1,String p2){
       d$d uod;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, e.class, "2")) {
          return;
       }
       e uoe = d.b(null);
       if (Build$VERSION.SDK_INT < 23 && !((Build.MANUFACTURER).toLowerCase(Locale.US)).contains("gionee")) {
          uoe.c();
          uod = null;
       }
       uoe.i(p1, p0, uod);
       return;
    }
}
