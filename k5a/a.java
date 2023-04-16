package k5a.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import k5a.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import im8.f;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class a extends PresenterV2	// class@002be4
{
    public PhotoDetailParam p;
    public f q;
    public BaseFragment r;
    public QPhoto s;
    public f t;
    public SlidePlayViewModel u;
    public final a$a v;

    public void a(){
       super();
       this.v = new a$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "12")) {
          return;
       }
       a tr = this.r;
       String str = "mFragment";
       if (tr == null) {
          a.S(str);
       }
       Fragment parentFragme = tr.getParentFragment();
       if (parentFragme != null) {
          a.o(parentFragme, "mFragment.parentFragment ?: return");
          SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(parentFragme);
          this.u = slidePlayVie;
          if (slidePlayVie != null) {
             a tr1 = this.r;
             if (tr1 == null) {
                a.S(str);
             }
             slidePlayVie.P(tr1, this.v);
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "13")) {
          return;
       }
       a tu = this.u;
       if (tu != null) {
          a tr = this.r;
          if (tr == null) {
             a.S("mFragment");
          }
          tu.D(tr, this.v);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "11")) {
          return;
       }
       f obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.s = obj;
       obj = this.q8(PhotoDetailParam.class);
       a.o(obj, "inject\(PhotoDetailParam::class.java\)");
       this.p = obj;
       obj = this.x8("DETAIL_LOGGER");
       a.o(obj, "injectRef\(AccessIds.DETAIL_LOGGER\)");
       this.q = obj;
       Object obj1 = this.r8("DETAIL_FRAGMENT");
       a.o(obj1, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.r = obj1;
       obj = this.x8("HAS_REPORT_USERFEATURE");
       a.o(obj, "injectRef\(AccessIds.HAS_REPORT_USERFEATURE\)");
       this.t = obj;
       return;
    }
}
