package j5a.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import j5a.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.util.List;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class b extends PresenterV2	// class@00290c
{
    public List p;
    public PhotoDetailParam q;
    public BaseFragment r;
    public SlidePlayViewModel s;
    public b t;
    public final a u;

    public void b(){
       super();
       this.u = new b$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       b tr = this.r;
       if (tr != null) {
          this.s = SlidePlayViewModel.B0(tr.getParentFragment());
       }
       tr = this.s;
       if (tr != null) {
          tr.P(this.r, this.u);
       }else {
          tr = this.p;
          if (tr != null) {
             tr.add(this.u);
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       b ts = this.s;
       if (ts != null) {
          ts.D(this.r, this.u);
       }else {
          ts = this.p;
          if (ts != null) {
             ts.remove(this.u);
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.t8("DETAIL_ATTACH_LISTENERS");
       this.q = this.q8(PhotoDetailParam.class);
       this.r = this.t8("DETAIL_FRAGMENT");
       return;
    }
}
