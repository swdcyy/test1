package d61.e;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Application;
import o56.a;
import android.content.Context;
import android.content.ComponentName;
import com.yxcorp.utility.SystemUtil;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class e	// class@001f18
{

    public void e(){
       super();
    }
    public static boolean a(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       ComponentName uComponentNa = SystemUtil.B(a.b());
       if (uComponentNa != null && TextUtils.n(uComponentNa.getClassName(), p0.getLocalClassName())) {
          b = true;
       }
       return b;
    }
}
