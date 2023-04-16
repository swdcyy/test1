package fn9.b$b$a;
import java.lang.Runnable;
import fn9.b$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fn9.b;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.refresh.RefreshType;
import com.kwai.component.homepage_interface.homeitemfragment.a;

public final class b$b$a implements Runnable	// class@002339
{
    public final b$b b;

    public void b$b$a(b$b p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b$b$a.class, "1")) {
          return;
       }
       b p = this.b.b.p;
       if (p == null) {
          a.S("mRefreshController");
       }
       p.f(RefreshType.SCHOOL_INFO_CHANGE);
       return;
    }
}
