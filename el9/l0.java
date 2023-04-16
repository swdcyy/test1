package el9.l0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import el9.l0$a;
import nsd.u;
import el9.l0$b;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import el9.l0$c;
import erd.g;
import crd.b;
import brd.t;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Runnable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$l;

public final class l0 extends PresenterV2	// class@0021f8
{
    public RecyclerFragment p;
    public t q;
    public boolean r;
    public final Runnable s;
    public static final l0$a t;

    static {
       l0.t = new l0$a(null);
    }
    public void l0(){
       super();
       this.s = new l0$b(this);
    }
    public static final RecyclerFragment P8(l0 p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mFragment");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, l0.class, "2")) {
          return;
       }
       l0 tq = this.q;
       if (tq == null) {
          a.S("mCommentSetItemAnimObserver");
       }
       this.X7(tq.subscribe(new l0$c(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, l0.class, "3")) {
          return;
       }
       l0 tp = this.p;
       String str = "mFragment";
       if (tp == null) {
          a.S(str);
       }
       tp.h0().removeCallbacks(this.s);
       tp = this.p;
       if (tp == null) {
          a.S(str);
       }
       RecyclerView recyclerView = tp.h0();
       a.o(recyclerView, "mFragment.recyclerView");
       recyclerView.setItemAnimator(null);
       this.r = false;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l0.class, "1")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.p = obj;
       obj = this.r8("COMMENT_ITEM_ANIM_OBSERVABLE");
       a.o(obj, "inject\(CommentAccessIds.¡­SET_ITEM_ANIM_OBSERVABLE\)");
       this.q = obj;
       return;
    }
}
