package d99.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d99.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import d99.a;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import java.util.Set;
import im8.f;
import com.yxcorp.gifshow.entity.QPhoto;
import uw9.b;

public class b extends PresenterV2	// class@002098
{
    public Set p;
    public f q;
    public f r;
    public QPhoto s;
    public t t;
    public b u;
    public RecyclerView$r v;

    public void b(){
       super();
       this.v = new b$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.X7(this.t.subscribe(new a(this), Functions.e));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.r8("DETAIL_SCROLL_LISTENERS");
       this.q = this.x8("DETAIL_SCROLL_DISTANCE");
       this.r = this.x8("DETAIL_COMMENT_RECYCLER_VIEW");
       this.s = this.q8(QPhoto.class);
       this.t = this.r8("DETAIL_PAGE_VISIBLE_OBSERVABLE");
       this.u = this.q8(b.class);
       return;
    }
}
