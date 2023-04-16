package bg8.e;
import java.lang.Runnable;
import com.mini.packagemanager.PackageUpdateManagerImpl;
import oh8.a;
import com.mini.pms.packagemanager.model.MiniAppInfo;
import java.lang.Object;
import java.util.Objects;
import java.lang.String;
import com.mini.packagemanager.PackageManagerImpl;
import nh8.b;

public final class e implements Runnable	// class@000350
{
    public final PackageUpdateManagerImpl b;
    public final a c;
    public final MiniAppInfo d;

    public void e(PackageUpdateManagerImpl p0,a p1,MiniAppInfo p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       e tb = this.b;
       e tc = this.c;
       Objects.requireNonNull(tb);
       tc.c.e(tb.c.getMaxMiniAppInfo(tc.a));
       tc.c.d(0, "", this.d);
    }
}
