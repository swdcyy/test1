package bg8.m;
import java.lang.Runnable;
import com.mini.packagemanager.PackageUpdateManagerImpl;
import com.mini.packagemanager.model.MiniAppPackageInfo;
import java.lang.Object;
import com.mini.packagemanager.PackageManagerImpl;
import com.mini.packagemanager.model.MiniAppDetailInfo;
import cg8.e;

public final class m implements Runnable	// class@000358
{
    public final PackageUpdateManagerImpl b;
    public final MiniAppPackageInfo c;

    public void m(PackageUpdateManagerImpl p0,MiniAppPackageInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       m tb = this.b;
       m tc = this.c;
       tb.c.updateMiniAppDetailInfo(tc);
       tb.o.q(tc.appDetailInfo);
    }
}
