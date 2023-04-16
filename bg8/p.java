package bg8.p;
import java.lang.Runnable;
import com.mini.packagemanager.PackageUpdateManagerImpl;
import nh8.b;
import java.lang.String;
import java.lang.Object;
import n88.a;
import com.mini.pms.updatemanager.UpdateManager;
import n88.b;
import ph8.e$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ph8.e;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import eg8.b;
import com.mini.packagemanager.i;
import com.mini.packagemanager.PackageManagerImpl;
import ph8.b;

public final class p implements Runnable	// class@00035b
{
    public final PackageUpdateManagerImpl b;
    public final b c;
    public final boolean d;
    public final int e;
    public final String f;

    public void p(PackageUpdateManagerImpl p0,b p1,boolean p2,int p3,String p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void run(){
       p tb = this.b;
       p tc = this.c;
       p td = this.d;
       p te = this.e;
       p tf = this.f;
       UpdateManager updateManage = tb.mCF.r0();
       String str = "installStartUpFramework";
       e$b uob = PatchProxy.applyOneRefs(str, null, e$b.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new e$b();
          uob.a = str;
       }
       e uoe = uob.a();
       List list = tb.f.get(uoe.a());
       ArrayList uArrayList = (list == null)? new ArrayList(): new ArrayList(list);
       uArrayList.add(tc);
       tb.f.put(str, uArrayList);
       b uob1 = new b((td ^ 0x01), te, new i(tb), tb, tb.c, tf);
       str.l = uoe;
       updateManage.update(uoe, str);
       return;
    }
}
