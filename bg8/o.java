package bg8.o;
import java.lang.Runnable;
import com.mini.packagemanager.PackageUpdateManagerImpl;
import com.mini.pms.packagemanager.model.MiniAppInfo;
import java.lang.String;
import nh8.b;
import java.lang.Object;
import java.util.Objects;
import ph8.e$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import ph8.e;
import n88.a;
import com.mini.pms.updatemanager.UpdateManager;
import n88.b;
import java.lang.System;
import eg8.d;
import com.mini.packagemanager.PackageManagerImpl;
import qg8.k;
import ph8.b;

public final class o implements Runnable	// class@00035a
{
    public final PackageUpdateManagerImpl b;
    public final MiniAppInfo c;
    public final String d;
    public final b e;
    public final String f;

    public void o(PackageUpdateManagerImpl p0,MiniAppInfo p1,String p2,b p3,String p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void run(){
       e$b uob;
       o tb = this.b;
       o tc = this.c;
       o td = this.d;
       o te = this.e;
       o tf = this.f;
       Objects.requireNonNull(tb);
       MiniAppInfo d = tc.d;
       MiniAppInfo e = tc.e;
       if (PatchProxy.isSupport(e$b.class)) {
          uob = PatchProxy.applyThreeRefs(d, Integer.valueOf(e), td, null, e$b.class, "3");
          if (uob != PatchProxyResult.class) {
          label_0048 :
             e uoe = uob.a();
             d uod = new d(tc, uoe, td, tb.c, tb.b, System.currentTimeMillis(), tb.V6(uoe.a(), te), tb, tf);
             tb.mCF.r0().update(uoe, v13);
             return;
          }
       }
       uob = new e$b();
       uob.a = d+e+td;
       goto label_0048 ;
    }
}
