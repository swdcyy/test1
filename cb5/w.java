package cb5.w;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import cb5.w$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import hka.i;
import com.kwai.component.homepage_interface.homeitemfragment.a;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public final class w extends PresenterV2	// class@00045f
{
    public RecyclerFragment p;
    public a q;
    public final a$a r;

    public void w(){
       super();
       this.r = new w$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, w.class, "6")) {
          return;
       }
       w tq = this.q;
       if (tq == null) {
          a.S("mRefreshController");
       }
       tq.s6(this.r);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, w.class, "7")) {
          return;
       }
       w tq = this.q;
       if (tq == null) {
          a.S("mRefreshController");
       }
       tq.w8(this.r);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, w.class, "1")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.p = obj;
       obj = this.r8("HOME_REFRESH_CONTROLLER");
       a.o(obj, "inject\(HomeItemAccessIds.HOME_REFRESH_CONTROLLER\)");
       this.q = obj;
       return;
    }
}
