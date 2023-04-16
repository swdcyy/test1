package b3d.n;
import android.content.Context;
import java.lang.Object;
import android.os.Build$VERSION;
import android.hardware.biometrics.BiometricManager;
import b3d.n$a;
import r1.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class n	// class@00033a
{
    public final a a;
    public final BiometricManager b;

    public void n(Context p0){
       super();
       if (Build$VERSION.SDK_INT >= 29) {
          this.b = n$a.b(p0);
          this.a = null;
       }else {
          this.b = null;
          this.a = a.b(p0);
       }
       return;
    }
    public void n(BiometricManager p0){
       super();
       this.b = p0;
       this.a = null;
    }
    public static n b(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, n.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new n(p0);
    }
    public int a(){
       Object obj = PatchProxy.apply(null, this, n.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (Build$VERSION.SDK_INT >= 29) {
          return n$a.a(this.b);
       }
       if (!this.a.e()) {
          return 12;
       }
       if (!this.a.d()) {
          return 11;
       }
       return 0;
    }
}
