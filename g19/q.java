package g19.q;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import g19.q$a;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import jta.c;
import g19.l;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class q extends PresenterV2	// class@0023d9
{
    public QPhoto p;
    public BaseFragment q;
    public l r;
    public SlidePlayViewModel s;
    public final c t;

    public void q(){
       super();
       this.t = new q$a(this);
    }
    public static final QPhoto P8(q p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mPhoto");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, q.class, "2")) {
          return;
       }
       q tr = this.r;
       if (tr == null) {
          a.S("mSidebarStatusHelper");
       }
       tr.a(this.t);
       tr = this.q;
       if (tr == null) {
          a.S("mFragment");
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tr.getParentFragment());
       a.o(slidePlayVie, "SlidePlayViewModel.get\(mFragment.parentFragment\)");
       this.s = slidePlayVie;
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, q.class, "3")) {
          return;
       }
       q tr = this.r;
       if (tr == null) {
          a.S("mSidebarStatusHelper");
       }
       tr.c(this.t);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, q.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.q = obj;
       obj = this.r8("NASA_SIDEBAR_STATUS");
       a.o(obj, "inject\(AccessIds.NASA_SIDEBAR_STATUS\)");
       this.r = obj;
       return;
    }
}
