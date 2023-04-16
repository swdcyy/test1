package psb.r;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.Build$VERSION;
import o56.a;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;

public class r	// class@0021f6
{

    public void r(){
       super();
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, r.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (Build$VERSION.SDK_INT < 31) {
          return PermissionUtils.a(a.B, "android.permission.ACCESS_FINE_LOCATION");
       }
       boolean b = (PermissionUtils.a(a.B, "android.permission.ACCESS_COARSE_LOCATION") || PermissionUtils.a(a.B, "android.permission.ACCESS_FINE_LOCATION"))? true: false;
       return b;
    }
}
