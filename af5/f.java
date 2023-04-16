package af5.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import af5.f$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import k2b.c3;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import im8.f;
import wd5.p;
import k2b.v2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import yv8.c;
import w85.a;
import a95.b;
import com.kwai.component.detail.launcher.api.model.detail.DetailParamCreator;
import a95.a;

public class f extends PresenterV2	// class@000096
{
    public a A;
    public final a B;
    public PhotoDetailParam p;
    public f q;
    public QPhoto r;
    public List s;
    public p t;
    public c3 u;
    public v2 v;
    public f w;
    public SlidePlayViewModel x;
    public BaseFragment y;
    public c z;

    public void f(){
       super();
       this.B = new f$a(this);
    }
    public void E8(){
       boolean b;
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "7")) {
          return;
       }
       f ty = this.y;
       if (ty != null) {
          this.x = SlidePlayViewModel.S0(ty.getParentFragment());
       }
       ty = this.x;
       if (ty != null) {
          ty.r0(this.y, this.B);
       }else {
          ty = this.s;
          if (ty != null) {
             ty.add(this.B);
          }
       }
       if (this.u != null) {
          Object obj = PatchProxy.apply(objArray, this, uof, "11");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             uof = this.x;
             b = (uof == null || uof.C())? true: false;
          }
          if (b) {
             this.u.a(this.r.mEntity);
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "8")) {
          return;
       }
       f tx = this.x;
       if (tx != null) {
          tx.q0(this.y, this.B);
       }else {
          tx = this.s;
          if (tx != null) {
             tx.remove(this.B);
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.r = this.q8(QPhoto.class);
       this.p = this.s8(PhotoDetailParam.class);
       this.q = this.x8("DETAIL_LOGGER");
       this.s = this.t8("DETAIL_ATTACH_LISTENERS");
       this.t = this.t8("SLIDE_PLAY_PAGE_SELECT_EVENT");
       this.u = this.t8("RERANK_REALSHOW_EVENT");
       this.v = this.t8("PREFETCH_FEEDSHOW_EVENT");
       this.w = this.x8("LOG_LISTENER");
       this.y = this.t8("DETAIL_FRAGMENT");
       this.z = this.t8("REAL_ACTION_BIZ_TYPE");
       a uoa = this.s8(a.class);
       this.A = (uoa == null)? DetailParamCreator.b(false, this.p).b(): uoa.j();
       return;
    }
}
