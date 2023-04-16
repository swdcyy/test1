package bg8.r;
import nh8.b;
import com.mini.packagemanager.PackageUpdateManagerImpl;
import com.mini.packagemanager.model.UpdatePackageInfoResult$UpdateInfo;
import java.lang.Object;
import nh8.a;
import com.mini.pms.packagemanager.model.MiniAppInfo;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import oh8.a$a;
import oh8.a;

public class r implements b	// class@00035d
{
    public final boolean a;
    public final UpdatePackageInfoResult$UpdateInfo b;
    public final PackageUpdateManagerImpl c;

    public void r(PackageUpdateManagerImpl p0,boolean p1,UpdatePackageInfoResult$UpdateInfo p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(boolean p0){
       a.c(this, p0);
    }
    public void b(){
       a.b(this);
    }
    public void c(MiniAppInfo p0){
       a.d(this, p0);
    }
    public void d(int p0,String p1,MiniAppInfo p2){
       if (PatchProxy.isSupport(r.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, r.class, "1")) {
          return;
       }
       if (this.a != null) {
          a$a uoa = new a$a();
          uoa.a(this.b.appId);
          uoa.h(4);
          uoa.g("client_package_renew");
          this.c.installMiniApp(uoa.b());
       }
       return;
    }
    public void e(MiniAppInfo p0){
       a.a(this, p0);
    }
}
