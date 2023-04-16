package ef1.d;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.util.Locale;
import android.graphics.Color;
import java.lang.Boolean;
import va1.n0;
import lnc.a1;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class d	// class@002145
{

    public void d(){
       super();
    }
    public static String a(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uod, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[]{Integer.valueOf(Color.alpha(p0)),Integer.valueOf(Color.red(p0)),Integer.valueOf(Color.green(p0)),Integer.valueOf(Color.blue(p0))};
       return (String.format(Locale.US, "#%02x%02x%02x%02x", objArray)).toUpperCase();
    }
    public static boolean b(){
       Object obj = PatchProxy.apply(null, null, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (n0.f() >= a1.e(360.00f))? true: false;
       b.c0(LiveLogTag.LIVE_HIGH_FLUENCY_FEEDS, "HighFluencyStrongStyleView.isLargeScreen", "isLargeScreen", Boolean.valueOf(b));
       return b;
    }
}
