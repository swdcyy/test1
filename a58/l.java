package a58.l;
import java.lang.Runnable;
import com.mini.app.installer.f;
import com.mini.pms.packagemanager.model.MiniAppInfo;
import java.lang.Object;
import com.mini.app.runtime.f;
import com.mini.pms.packagemanagerproxy.PackageManagerProxy;
import n88.b;
import java.lang.String;

public final class l implements Runnable	// class@000038
{
    public final f b;
    public final MiniAppInfo c;
    public final long d;

    public void l(f p0,MiniAppInfo p1,long p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       this.b.k.a.W().deleteInvalidPackage(this.c, this.d, "framework");
    }
}
