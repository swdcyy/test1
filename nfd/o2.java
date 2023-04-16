package nfd.o2;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import s7.b;

public class o2	// class@001dea
{

    public void o2(){
       super();
    }
    public static boolean a(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, o2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (PermissionUtils.a(p0, "android.permission.WRITE_CALENDAR") && PermissionUtils.a(p0, "android.permission.READ_CALENDAR"))? true: false;
       return b;
    }
    public static boolean b(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, o2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a(p0);
    }
}
