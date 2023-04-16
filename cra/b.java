package cra.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.sdk.switchconfig.a;
import cra.w;
import q87.c;
import cra.b$a;
import java.lang.Runnable;
import com.kwai.framework.init.c;

public final class b	// class@002379
{
    public static boolean a;
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public static final void a(b p0,boolean p1){
       b.a = p1;
    }
    public final void b(int p0){
       boolean b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       b = false;
       if (a.t().d("disableReportAppList", b)) {
          Object[] objArray = new Object[b];
          w.C().w("AppListUploadUtil", "Switch disableReportAppList return true", objArray);
          return;
       }else if(b.a){
          return;
       }else {
          c.c(new b$a(p0));
          return;
       }
    }
}
