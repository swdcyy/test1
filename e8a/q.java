package e8a.q;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e8a.q$a;
import e8a.q$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ml8.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import uw9.j;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import androidx.viewpager.widget.ViewPager$i;
import ge5.d;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.yxcorp.utility.SystemUtil;
import java.lang.Integer;
import joc.q;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import joc.m;
import foc.m$d;
import joc.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class q extends PresenterV2	// class@0020d1
{
    public d p;
    public PhotoDetailParam q;
    public BaseFragment r;
    public SlidePlayViewModel s;
    public GifshowActivity t;
    public m u;
    public g v;
    public final ViewPager$i w;
    public final m$d x;

    public void q(){
       super();
       this.w = new q$a(this);
       this.x = new q$b(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, q.class, "2")) {
          return;
       }
       this.t = j.a(this);
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.r);
       this.s = slidePlayVie;
       slidePlayVie.i(this.w);
       q tp = this.p;
       this.u = tp.d;
       this.v = tp.c;
       QPhoto currentPhoto = this.s.getCurrentPhoto();
       if (currentPhoto != null) {
          objArray = currentPhoto.getEntity();
       }
       if (objArray != null && (r1.S2(objArray) && SystemUtil.a(23))) {
          this.R8();
          this.P8(this.s.j());
       }
    label_0052 :
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, q.class, "4")) {
          return;
       }
       this.s.g(this.w);
       return;
    }
    public void P8(int p0){
       q oq = q.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oq, "3")) {
          return;
       }
       oq = this.v;
       if (oq != null) {
          boolean b = (p0 > this.s.j0())? true: false;
          oq.f(b);
       }
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, q.class, "5")) {
          return;
       }
       q tu = this.u;
       if (tu != null) {
          tu.i(this.q.getDetailCommonParam().getUnserializableBundleId());
          this.u.h(this.x);
       }
       tu = this.v;
       if (tu != null) {
          tu.h(this.q.getDetailCommonParam().getUnserializableBundleId());
          this.v.g(this.x);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, q.class, "1")) {
          return;
       }
       this.q = this.q8(PhotoDetailParam.class);
       this.r = this.r8("FRAGMENT");
       this.p = this.r8("PHOTO_ROOTVIEW_TOUCH_MANAGER");
       return;
    }
}
