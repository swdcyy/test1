package c89.a;
import java.lang.Object;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.os.Build$VERSION;
import android.hardware.biometrics.BiometricManager;
import r1.a;
import java.lang.Boolean;

public class a	// class@0004fa
{

    public void a(){
       super();
    }
    public static int a(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (Build$VERSION.SDK_INT >= 29) {
          return p0.getSystemService(BiometricManager.class).canAuthenticate();
       }
       a uoa = a.b(p0);
       if (!uoa.e()) {
          return 12;
       }
       if (!uoa.d()) {
          return 11;
       }
       return 0;
    }
    public static boolean b(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean i = a.a(p0);
       i = (Build$VERSION.SDK_INT >= 24 && (!i || i == 11))? true: false;
       return i;
    }
}
