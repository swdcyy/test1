package a58.h;
import java.lang.Runnable;
import com.mini.app.installer.e;
import com.mini.pms.packagemanager.model.MiniAppInfo;
import java.io.File;
import java.lang.Object;
import com.mini.app.runtime.f;
import com.mini.pms.packagemanagerproxy.PackageManagerProxy;
import n88.b;
import java.lang.String;

public final class h implements Runnable	// class@000034
{
    public final e b;
    public final MiniAppInfo c;
    public final File d;

    public void h(e p0,MiniAppInfo p1,File p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       this.b.d.a.W().deleteInvalidPackage(this.c, this.d.lastModified(), "framework");
    }
}
