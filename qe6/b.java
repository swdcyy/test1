package qe6.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import oe6.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import oe6.b;
import android.content.SharedPreferences;

public class b	// class@002269
{

    public void b(){
       super();
    }
    public static boolean a(){
       boolean b;
       Object obj = PatchProxy.apply(null, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = true;
       boolean b1 = (QCurrentUser.ME != null && QCurrentUser.ME.isLogined())? true: false;
       int i = (!TextUtils.x(a.s()) && a.o())? 1: 0;
       if (b1 || i) {
          a.a0(false);
          a.S(b);
       }
       if (a.v() && !a.a()) {
          b = false;
       }
       return b;
    }
    public static boolean b(){
       boolean b;
       Object obj = PatchProxy.apply(null, null, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = false;
       if (QCurrentUser.ME.isLogined() || b.a.getBoolean("GuestShotEnabled", b)) {
          b = true;
       }
       return b;
    }
}
