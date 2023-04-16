package p56.b;
import com.kwai.framework.app.huaweisuperapp.HuaweiSuperAppPrelaunchStage;
import android.os.Build;
import java.lang.String;
import java.lang.CharSequence;
import java.lang.Object;
import com.huawei.emui.hiexperience.hwperf.prelaunch.HwPerfPrelaunch;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;

public final class b	// class@002163
{
    public static HwPerfPrelaunch a;
    public static boolean b;
    public static HuaweiSuperAppPrelaunchStage c;
    public static final boolean d;

    static {
       b.c = HuaweiSuperAppPrelaunchStage.UNDEFINE;
       b.d = ((Build.BRAND).toLowerCase()).contains("huawei");
    }
    public void b(){
       super();
    }
    public static HwPerfPrelaunch a(){
       return b.a;
    }
    public static boolean b(){
       return b.b;
    }
    public static HuaweiSuperAppPrelaunchStage c(){
       return b.c;
    }
    public static void d(HuaweiSuperAppPrelaunchStage p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "2")) {
          return;
       }
       "setIsHuaweiSuperAppPrelaunchStage£º"+p0;
       b.c = p0;
       return;
    }
}
