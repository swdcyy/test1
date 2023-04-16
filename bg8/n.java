package bg8.n;
import java.lang.Runnable;
import com.mini.packagemanager.PackageUpdateManagerImpl;
import com.mini.pms.packagemanager.model.MiniAppInfo;
import java.lang.String;
import java.lang.Object;
import n88.a;
import com.mini.filemanager.b;
import n88.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.StringBuilder;
import com.mini.d;
import com.mini.packagemanager.PackageManagerImpl;
import com.mini.utils.g;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class n implements Runnable	// class@000359
{
    public final PackageUpdateManagerImpl b;
    public final MiniAppInfo c;
    public final long d;
    public final String e;

    public void n(PackageUpdateManagerImpl p0,MiniAppInfo p1,long p2,String p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       String str;
       String str1;
       n tb = this.b;
       n tc = this.c;
       n td = this.d;
       n te = this.e;
       PackageUpdateManagerImpl packageUpdat = PackageUpdateManagerImpl.class;
       b uob = tb.mCF.a0();
       if (tc != null && td - null > 0) {
          if (("framework").equals(te)) {
             if (PatchProxy.isSupport(packageUpdat) && (!PatchProxy.applyVoidThreeRefs(tc, Long.valueOf(td), uob, tb, PackageUpdateManagerImpl.class, "14") && tb.X6(uob.M0(tc.b), "framework.pkg", td))) {
                d.c("package_manager", "DeleteInvalidPackage kma code = "+tc.b);
                tb.c.removeFramework(tc.b);
                g.m(uob.M0(tc.b));
             }
          }else if(PatchProxy.isSupport(packageUpdat) && PatchProxy.applyVoidFourRefs(tc, Long.valueOf(td), te, uob, tb, PackageUpdateManagerImpl.class, "15")){
             if (("mainPackage").equals(te)) {
                str = uob.Q(tc.d, tc.e, tc.g);
                str1 = "main.pkg";
             }else {
                str = uob.z5(tc.d, tc.e, tc.g);
                str1 = (TextUtils.isEmpty(te))? null: uob.N6(te);
             }
             if (!TextUtils.isEmpty(str1) && tb.X6(str, str1, td)) {
                d.c("package_manager", "DeleteInvalidPackage app id = "+tc+" type = "+te);
                tb.c.updateMiniAppInfoEnv(tc.d, tc.e, tc.g);
             }
          }
       }
    label_00e8 :
       return;
    }
}
