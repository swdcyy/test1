package ai5.d;
import dkd.i;
import com.kwai.component.upgrade.UpgradeApkInitModule;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.retrofit.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import ia0.g;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;

public class d implements i	// class@0000a8
{
    public final UpgradeApkInitModule a;

    public void d(UpgradeApkInitModule p0){
       this.a = p0;
       super();
    }
    public String a(){
       return "n/android/ksCn/checkUpdate";
    }
    public a b(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(-1961311520).a(RouteType.API, d.b);
    }
}
