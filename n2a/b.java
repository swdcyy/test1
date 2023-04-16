package n2a.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.c;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import n2a.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import n2a.a;
import java.util.Objects;
import uw9.b;
import java.util.Set;
import androidx.fragment.app.c$b;
import im8.f;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import brd.y;
import com.yxcorp.gifshow.detail.nonslide.NonSlidePhotoConfig;

public class b extends PresenterV2	// class@0030c9
{
    public b p;
    public f q;
    public BaseFragment r;
    public QPhoto s;
    public y t;
    public NonSlidePhotoConfig u;
    public c v;
    public RecyclerView$Adapter w;
    public c$b x;

    public void b(c p0,RecyclerView$Adapter p1){
       super();
       this.x = new b$a(this);
       this.v = p0;
       this.w = p1;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       b tp = this.p;
       a uoa = new a(this);
       Objects.requireNonNull(tp);
       if (!PatchProxy.applyVoidOneRefs(uoa, tp, b.class, "2")) {
          if (tp.a == null) {
             tp.d.add(uoa);
          }else {
             uoa.a();
          }
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.v.registerFragmentLifecycleCallbacks(this.x, false);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.q8(b.class);
       this.q = this.x8("DETAIL_COMMENT_RECYCLER_VIEW");
       this.r = this.r8("DETAIL_FRAGMENT");
       this.s = this.q8(QPhoto.class);
       this.t = this.r8("DETAIL_PAGE_VISIBLE_OBSERVER");
       this.u = this.r8("DETAIL_PHOTO_NON_SLIDE_CONFIG");
       return;
    }
}
