package el9.k0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import el9.k0$a;
import el9.k0$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import l17.a;
import androidx.recyclerview.widget.RecyclerView$r;
import java.lang.Integer;
import xl8.b;
import pk9.i$a;
import pk9.i;
import java.util.Set;
import im8.f;

public class k0 extends PresenterV2	// class@0021f3
{
    public Set p;
    public RecyclerFragment q;
    public f r;
    public b s;
    public i t;
    public a u;
    public RecyclerView$r v;
    public final i$a w;

    public void k0(){
       super();
       this.v = new k0$a(this);
       this.w = new k0$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, k0.class, "3")) {
          return;
       }
       this.u = a.a(this.q.h0());
       this.q.h0().addOnScrollListener(this.v);
       this.s.d(Integer.valueOf(0));
       this.t.a(this.w);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, k0.class, "2")) {
          return;
       }
       this.t = new i(1200, 800, 8);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, k0.class, "4")) {
          return;
       }
       this.q.h0().removeOnScrollListener(this.v);
       this.t.a(null);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k0.class, "1")) {
          return;
       }
       this.p = this.r8("COMMENT_SCROLL_LISTENERS");
       this.q = this.r8("FRAGMENT");
       this.r = this.x8("DETAIL_SCROLL_DISTANCE");
       this.s = this.r8("COMMENT_RECYCLE_VIEW_SCROLL_FAST_STATE");
       return;
    }
}
