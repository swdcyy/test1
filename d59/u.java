package d59.u;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d59.u$a;
import nsd.u;
import d59.u$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import c59.n;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkHalfFrameLayout;
import java.lang.Boolean;
import c59.j;
import java.util.Objects;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.entity.QPhoto;
import yx.j0;

public final class u extends PresenterV2	// class@00205f
{
    public AdtkHalfFrameLayout p;
    public boolean q;
    public QPhoto r;
    public final u$b s;
    public static final u$a t;

    static {
       u.t = new u$a(null);
    }
    public void u(){
       super();
       this.q = true;
       this.s = new u$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, u.class, "3")) {
          return;
       }
       u tp = this.p;
       if (tp == null) {
          a.S("mHalfContainerView");
       }
       tp.a(this.s);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, u.class, "4")) {
          return;
       }
       u tp = this.p;
       if (tp == null) {
          a.S("mHalfContainerView");
       }
       tp.i(this.s);
       this.P8(true);
       return;
    }
    public final void P8(boolean p0){
       u ou = u.class;
       if (PatchProxy.isSupport(ou) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ou, "2")) {
          return;
       }
       if (p0 == this.q) {
          return;
       }
       this.q = p0;
       j b = j.b;
       u tr = this.r;
       if (tr == null) {
          a.S("mQPhoto");
       }
       Objects.requireNonNull(b);
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && (!PatchProxy.applyVoidTwoRefs(tr, Boolean.valueOf(p0), b, oj, "1") && tr != null)) {
          PlayEvent$Status rESUME = (p0)? PlayEvent$Status.RESUME: PlayEvent$Status.PAUSE;
          a.d().k(new PlayEvent(tr, rESUME, 40));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, u.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("AdtkPlay", "AdtkConfigPlayEventPresenter doInject", objArray);
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.r = obj;
       obj = this.q8(AdtkHalfFrameLayout.class);
       a.o(obj, "inject\(AdtkHalfFrameLayout::class.java\)");
       this.p = obj;
       return;
    }
}
