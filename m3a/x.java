package m3a.x;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.utility.RomUtils;
import kotlin.jvm.internal.a;
import uw9.o;
import q87.c;
import java.lang.Throwable;
import android.os.Build$VERSION;
import android.app.Application;
import o56.a;
import android.content.pm.PackageManager;

public final class x	// class@002f28
{
    public static final boolean a;
    public static final x b;

    static {
       x.b = new x();
       x.a = a.t().d("pip_mode_black_list", false);
    }
    public void x(){
       super();
    }
    public final boolean a(){
       Object[] objArray;
       String str = "SmallWindowUtils";
       Object obj = PatchProxy.apply(null, this, x.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       try{
          if (RomUtils.n() && a.g("EmotionUI_10.0.0", RomUtils.i())) {
             objArray = new Object[i];
             o.C().w(str, "hit EmotionUI_10.0.0.", objArray);
             return true;
          }else if(x.a){
             objArray = new Object[i];
             o.C().w(str, "hit switch black list.", objArray);
             return true;
          }
       }catch(java.lang.Exception e2){
          o.C().e(str, "", e2);
       }
       return i;
    }
    public final boolean b(){
       boolean b;
       Application obj = PatchProxy.apply(null, this, x.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (Build$VERSION.SDK_INT >= 26) {
          obj = a.b();
          a.o(obj, "AppEnv.getAppContext\(\)");
          if (obj.getPackageManager().hasSystemFeature("android.software.picture_in_picture") && !this.a()) {
             b = true;
          label_0038 :
             return b;
          }
       }
       b = false;
       goto label_0038 ;
    }
}
