package fn9.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fn9.b$a;
import nsd.u;
import fn9.b$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.event.a;
import oj0.a;
import kotlin.jvm.internal.a;
import com.kwai.component.homepage_interface.homeitemfragment.a;

public final class b extends PresenterV2	// class@00233b
{
    public a p;
    public final a q;
    public static final b$a r;

    static {
       b.r = new b$a(null);
    }
    public void b(){
       super();
       this.q = new b$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       a.b().a("KSFeedHomeSchoolTabNeedRefreshNotify", this.q);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       a.b().c("KSFeedHomeSchoolTabNeedRefreshNotify", this.q);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       Object obj = this.r8("HOME_REFRESH_CONTROLLER");
       a.o(obj, "inject\(HomeItemAccessIds.HOME_REFRESH_CONTROLLER\)");
       this.p = obj;
       return;
    }
}
