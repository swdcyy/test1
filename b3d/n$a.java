package b3d.n$a;
import java.lang.Object;
import android.hardware.biometrics.BiometricManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.Context;

public class n$a	// class@000338
{

    public void n$a(){
       super();
    }
    public static int a(BiometricManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, n$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return p0.canAuthenticate();
    }
    public static BiometricManager b(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, n$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.getSystemService(BiometricManager.class);
    }
}
