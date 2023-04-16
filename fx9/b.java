package fx9.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fx9.a;
import fx9.b$a;
import fx9.b$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p5a.e;
import de5.a;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.framework.player.core.b;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import xk9.j;
import com.yxcorp.gifshow.comment.e;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class b extends PresenterV2	// class@002366
{
    public BaseFragment p;
    public a q;
    public e r;
    public int s;
    public SlidePlayViewModel t;
    public final IMediaPlayer$OnInfoListener u;
    public final a v;
    public final j w;

    public void b(){
       super();
       this.u = new a(this);
       this.v = new b$a(this);
       this.w = new b$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.q.getPlayer().addOnInfoListener(this.u);
       b tp = this.p;
       if (tp != null) {
          this.t = SlidePlayViewModel.S0(tp.getParentFragment());
       }
       tp = this.t;
       if (tp != null) {
          tp.r0(this.p, this.v);
       }
       this.r.d(this.w);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.s = 0;
       this.q.getPlayer().removeOnInfoListener(this.u);
       this.r.k(this.w);
       b tt = this.t;
       if (tt != null) {
          tt.D(this.p, this.v);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.r8("DETAIL_FRAGMENT");
       this.q = this.q8(a.class);
       this.r = this.r8("COMMENT_HELPER");
       return;
    }
}
