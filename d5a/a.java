package d5a.a;
import xjd.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d5a.a$a;
import nsd.u;
import d5a.a$c;
import d5a.a$b;
import mrd.c;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qe6.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.presenter.landscape.LandscapeUtil;
import uy6.h;
import uy6.b;
import d5a.u;
import android.app.Activity;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import d5a.u$a;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import uw9.o;
import q87.c;
import d5a.x;
import android.content.Context;
import d5a.w;
import j1b.e;
import java.lang.Runnable;
import t45.c;
import qrd.l1;
import d5a.a$d;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import vy6.a;
import xjd.a$a;
import io.reactivex.subjects.PublishSubject;

public final class a extends PresenterV2 implements a	// class@001e76
{
    public BaseFragment p;
    public QPhoto q;
    public PublishSubject r;
    public c s;
    public SlidePlayViewModel t;
    public u u;
    public e v;
    public a$c w;
    public boolean x;
    public final a$b y;
    public static final a$a z;

    static {
       a.z = new a$a(null);
    }
    public void a(){
       super();
       this.w = new a$c(this);
       this.y = new a$b(this);
    }
    public static final c P8(a p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("mRotationSubject");
       }
       return p0;
    }
    public void E8(){
       String str = "2";
       if (PatchProxy.applyVoid(null, this, a.class, str)) {
          return;
       }
       this.x = b.a();
       a tq = this.q;
       if (tq == null) {
          a.S("mPhoto");
       }
       if (LandscapeUtil.d(tq) && this.x != null) {
          int i = 0;
          if (h.a.f != null) {
             if (this.u == null) {
                u$a d = u.d;
                Activity activity = this.getActivity();
                Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                Objects.requireNonNull(d);
                u ou = u.class;
                String str1 = "1";
                ViewModel viewModel = PatchProxy.applyOneRefs(activity, d, u$a.class, str1);
                if (viewModel != PatchProxyResult.class) {
                }else {
                   a.p(activity, "activity");
                   viewModel = ViewModelProviders.of(activity).get(ou);
                   a.o(viewModel, "ViewModelProviders.of\(ac¡­nager::class.java\n      \)");
                   Objects.requireNonNull(viewModel);
                   if (!PatchProxy.applyVoidOneRefs(activity, viewModel, ou, str1) && viewModel.b == null) {
                      Object[] objArray1 = new Object[i];
                      String str2 = "WindowOrientationManager";
                      o.C().w(str2, "init", objArray1);
                      x ox = new x(viewModel, activity, activity);
                      if (!PatchProxy.applyVoidOneRefs(ox, viewModel, ou, str)) {
                         Object[] objArray2 = new Object[i];
                         o.C().w(str2, "enableWindowOrientationListener", objArray2);
                         c.a(new w(viewModel, ox));
                      }
                      viewModel.b = ox;
                   }
                }
                this.u = viewModel;
             }
          }else {
             this.v = new a$d(this, this.getContext());
          }
          tq = this.p;
          str = "mFragment";
          if (tq == null) {
             a.S(str);
          }
          this.t = SlidePlayViewModel.B0(tq.getParentFragment());
          Object[] objArray = new Object[i];
          o.C().y("GravityAccessLandscapePresenter", "registerSlideChangeListener", objArray);
          tq = this.p;
          if (tq == null) {
             a.S(str);
          }
          a tt = this.t;
          a ty = this.y;
          if (!PatchProxy.applyVoidThreeRefs(tq, tt, ty, this, a.class, "4")) {
             a.p(tq, "fragment");
             a.p(ty, "listener");
             a$a.a(this, tq, tt, ty);
          }
       }
    label_00fb :
       return;
    }
    public boolean G(){
       return false;
    }
    public void J7(BaseFragment p0,SlidePlayViewModel p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "5")) {
          return;
       }
       a.p(p0, "fragment");
       a.p(p2, "listener");
       a$a.b(this, p0, p1, p2);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a tq = this.q;
       if (tq == null) {
          a.S("mPhoto");
       }
       if (LandscapeUtil.d(tq) && this.x != null) {
          tq = this.p;
          if (tq == null) {
             a.S("mFragment");
          }
          a tt = this.t;
          a ty = this.y;
          if (!PatchProxy.applyVoidThreeRefs(tq, tt, ty, this, a.class, "5")) {
             a.p(tq, "fragment");
             a.p(ty, "listener");
             a$a.b(this, tq, tt, ty);
          }
       }
    label_0049 :
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       Object obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.p = obj;
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.q = obj;
       obj = this.r8("LANDSCAPE_ENTRANCE_CLICK_OBSERVER");
       a.o(obj, "inject\(AccessIds.LANDSCA¡­_ENTRANCE_CLICK_OBSERVER\)");
       this.r = obj;
       obj = this.r8("SENSOR_LANDSCAPE_SUBJECT");
       a.o(obj, "inject\(LandscapeAccessId¡­SENSOR_LANDSCAPE_SUBJECT\)");
       this.s = obj;
       return;
    }
    public void s5(BaseFragment p0,SlidePlayViewModel p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "4")) {
          return;
       }
       a.p(p0, "fragment");
       a.p(p2, "listener");
       a$a.a(this, p0, p1, p2);
       return;
    }
}
