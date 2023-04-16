package a58.m;
import java.lang.Runnable;
import com.mini.app.installer.f;
import com.mini.pms.packagemanager.model.MiniAppInfo;
import java.lang.String;
import java.lang.Object;
import com.mini.app.runtime.f;
import com.mini.pms.packagemanagerproxy.PackageManagerProxy;
import n88.b;

public final class m implements Runnable	// class@000039
{
    public final f b;
    public final MiniAppInfo c;
    public final long d;
    public final String e;

    public void m(f p0,MiniAppInfo p1,long p2,String p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       this.b.k.a.W().deleteInvalidPackage(this.c, this.d, this.e);
    }
}
