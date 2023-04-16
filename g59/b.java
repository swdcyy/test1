package g59.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import o56.a;
import android.content.Context;
import android.net.NetworkInfo;
import ekd.p0;
import com.kwai.sdk.switchconfig.a;
import java.lang.StringBuilder;
import yx.j0;

public final class b	// class@0023f6
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public static final int a(){
       NetworkInfo obj = PatchProxy.apply(null, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = p0.e(a.B);
       int i = 1;
       int type = (obj != null)? obj.getType(): 1;
       type = (type == i)? a.t().a("adHodorMaxSpeedKbpsInWifi", 0x9c40): a.t().a("adHodorMaxSpeedKbpsIn4G", 0x4e20);
       Object[] objArray = new Object[0];
       j0.a("AdDownloadSpeedUtils", "max speed is "+type, objArray);
       return type;
    }
}
