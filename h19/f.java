package h19.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import h19.f$a;
import h19.f$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import ge5.d;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.activitycontext.ActivityContext;
import tkd.b;
import tkd.d;
import yxb.b;
import hn5.n;
import hn5.m;
import android.content.Context;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import im8.f;
import brd.y;

public class f extends PresenterV2	// class@002541
{
    public d A;
    public final a B;
    public final m$d C;
    public QPhoto p;
    public PhotoDetailParam q;
    public BaseFragment r;
    public List s;
    public f t;
    public y u;
    public f v;
    public Activity w;
    public m x;
    public boolean y;
    public SlidePlayViewModel z;

    public void f(){
       super();
       this.B = new f$a(this);
       this.C = new f$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       this.w = this.getActivity();
       f tA = this.A;
       if (tA != null) {
          this.x = tA.d;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(this.r.getParentFragment());
       this.z = slidePlayVie;
       if (slidePlayVie != null) {
          slidePlayVie.P(this.r, this.B);
       }else {
          tA = this.s;
          if (tA != null && !tA.contains(this.B)) {
             this.s.add(this.B);
          }
       }
       return;
    }
    public final boolean P8(){
       Activity obj = PatchProxy.apply(null, this, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = ActivityContext.g().e();
       boolean b = (d.a(-430326918).cR(obj) || m.a().U3(obj))? true: false;
       return b;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.q8(PhotoDetailParam.class);
       this.r = this.r8("DETAIL_FRAGMENT");
       this.s = this.t8("DETAIL_ATTACH_LISTENERS");
       this.t = this.x8("DETAIL_LOGGER");
       this.v = this.w8("DETAIL_FOLLOW_CARD_BITMAP");
       this.A = this.t8("PHOTO_ROOTVIEW_TOUCH_MANAGER");
       this.u = this.r8("PAGE_SMOOTH_SWIPE_OBSERVER");
       return;
    }
}
