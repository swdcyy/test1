package bg8.c;
import erd.g;
import com.mini.packagemanager.PackageUpdateManagerImpl;
import java.lang.Object;
import com.mini.packagemanager.model.UpdatePackageInfoResult;
import java.util.Objects;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.List;
import n88.a;
import s68.a;
import n88.b;
import java.util.Iterator;
import com.mini.packagemanager.model.UpdatePackageInfoResult$UpdateInfo;
import bg8.r;
import nh8.b;
import oh8.a$a;
import oh8.a;
import java.lang.StringBuilder;
import com.mini.d;

public final class c implements g	// class@00034e
{
    public final PackageUpdateManagerImpl b;

    public void c(PackageUpdateManagerImpl p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a$a uoa;
       c tb = this.b;
       Objects.requireNonNull(tb);
       Objects.toString(p0);
       if (PatchProxy.applyVoidOneRefs(p0, tb, PackageUpdateManagerImpl.class, "24")) {
       }else if(p0 != null){
          UpdatePackageInfoResult action = p0.action;
          if (action != null && action.size() > 0) {
             List list = tb.mCF.P().S4();
             p0 = p0.action.iterator();
             int i = 0;
             while (p0.hasNext()) {
                UpdatePackageInfoResult$UpdateInfo updateInfo = p0.next();
                if (updateInfo != null) {
                   UpdatePackageInfoResult$UpdateInfo whenUsing = updateInfo.whenUsing;
                   String str = "client_package_renew";
                   boolean b = true;
                   if (whenUsing == b) {
                      if (!list.contains(updateInfo.appId)) {
                         if (updateInfo.preDownload != b || i >= 6) {
                            b = false;
                         }
                         if (b) {
                            i = i + 1;
                         }
                         tb.T6(updateInfo.appId, false, new r(tb, b, updateInfo));
                      }else if(updateInfo.preDownload == b && i < 6){
                         i = i + 1;
                         uoa = new a$a();
                         uoa.a(updateInfo.appId);
                         uoa.h(4);
                         uoa.g(str);
                         tb.installMiniApp(uoa.b());
                      }
                   }else if(whenUsing == null && (updateInfo.preDownload == b && i < 6)){
                      i = i + 1;
                      uoa = new a$a();
                      uoa.a(updateInfo.appId);
                      uoa.h(4);
                      uoa.g(str);
                      tb.installMiniApp(uoa.b());
                   }
                }
             }
             d.c("package_manager", "dealPreDownloadAndDeleteIfNeed download num = "+i);
          }
       }
       return;
    }
}
