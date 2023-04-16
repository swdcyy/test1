package m5a.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import m5a.f$a;
import m5a.f$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ml8.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import uw9.j;
import ge5.d;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.util.List;
import m5a.e;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.yxcorp.gifshow.detail.PhotoDetailActivity;
import hn5.n;
import hn5.m;
import android.content.Context;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import im8.f;
import brd.y;
import w85.a;

public class f extends PresenterV2	// class@002f44
{
    public m A;
    public t B;
    public final a C;
    public final m$d D;
    public d p;
    public QPhoto q;
    public PhotoDetailParam r;
    public a s;
    public BaseFragment t;
    public List u;
    public f v;
    public y w;
    public f x;
    public SlidePlayViewModel y;
    public GifshowActivity z;

    public void f(){
       super();
       this.C = new f$a(this);
       this.D = new f$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       this.z = j.a(this);
       f tp = this.p;
       if (tp != null) {
          this.A = tp.d;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(this.t.getParentFragment());
       this.y = slidePlayVie;
       if (slidePlayVie != null) {
          slidePlayVie.P(this.t, this.C);
       }else {
          tp = this.u;
          if (tp != null && !tp.contains(this.C)) {
             this.u.add(this.C);
          }
       }
       tp = this.B;
       if (tp != null) {
          this.X7(tp.subscribe(new e(this), Functions.e));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       f ty = this.y;
       if (ty != null) {
          ty.D(this.t, this.C);
       }else {
          ty = this.u;
          if (ty != null) {
             ty.remove(this.C);
          }
       }
       return;
    }
    public final boolean P8(){
       Activity obj = PatchProxy.apply(null, this, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = ActivityContext.g().e();
       boolean b = (obj instanceof PhotoDetailActivity || m.a().U3(obj))? true: false;
       return b;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.q = this.q8(QPhoto.class);
       this.r = this.q8(PhotoDetailParam.class);
       this.t = this.r8("DETAIL_FRAGMENT");
       this.u = this.t8("DETAIL_ATTACH_LISTENERS");
       this.v = this.x8("DETAIL_LOGGER");
       this.w = this.r8("PAGE_SMOOTH_SWIPE_OBSERVER");
       this.x = this.w8("DETAIL_FOLLOW_CARD_BITMAP");
       this.p = this.t8("PHOTO_ROOTVIEW_TOUCH_MANAGER");
       this.B = this.t8("MORE_OPERATION_PANEL_SHOW_OBSERVABLE");
       this.s = this.s8(a.class);
       return;
    }
}
