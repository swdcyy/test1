package in9.a;
import tx4.f;
import java.lang.String;
import java.lang.Object;
import tx4.w;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import in9.c;
import java.lang.StringBuilder;
import q87.c;
import tx4.e;

public final class a implements f	// class@002882
{
    public final String a;

    public void a(String p0){
       this.a = p0;
       super();
    }
    public void a(w p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "2")) {
          return;
       }
       a.p(p1, "e");
       Object[] objArray = new Object[0];
       c.C().w("HomeUniversalTabTkBundlePreloadUtil", "Bundle "+this.a+" pre load failed", objArray);
       return;
    }
    public void b(boolean p0){
       e.a(this, p0);
    }
    public void c(w p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "tkBundleInfo");
       Object[] objArray = new Object[0];
       c.C().w("HomeUniversalTabTkBundlePreloadUtil", "Bundle "+this.a+" pre load success", objArray);
       return;
    }
}
