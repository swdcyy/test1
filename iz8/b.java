package iz8.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import iz8.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import com.yxcorp.gifshow.entity.QPhoto;
import kp.r1;
import com.yxcorp.gifshow.ad.report.monitor.DynamicMonitorFactory;
import com.kwai.framework.model.feed.BaseFeed;
import android.view.View;
import cm9.a;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import iz8.b$b;
import g59.u;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;

public final class b extends PresenterV2	// class@00273e
{
    public QPhoto p;
    public BaseFragment q;
    public PhotoDetailParam r;
    public SlidePlayViewModel s;
    public a t;
    public final a u;

    public void b(){
       super();
       this.u = new b$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       b tq = this.q;
       String str = "mFragment";
       if (tq == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(tq.getParentFragment());
       this.s = slidePlayVie;
       if (slidePlayVie != null) {
          b tq1 = this.q;
          if (tq1 == null) {
             a.S(str);
          }
          slidePlayVie.r0(tq1, this.u);
       }
       tq = this.p;
       String str1 = "mPhoto";
       if (tq == null) {
          a.S(str1);
       }
       if (!r1.w3(tq)) {
          DynamicMonitorFactory c = DynamicMonitorFactory.c;
          b tp = this.p;
          if (tp == null) {
             a.S(str1);
          }
          BaseFeed entity = tp.getEntity();
          a.o(entity, "mPhoto.entity");
          View view = this.m8();
          a.o(view, "rootView");
          this.t = c.b(entity, "ad_detail_page", view);
       }
       tq = this.q;
       if (tq == null) {
          a.S(str);
       }
       this.X7(tq.m().subscribe(new b$b(this), u.a));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       b ts = this.s;
       if (ts != null) {
          b tq = this.q;
          if (tq == null) {
             a.S("mFragment");
          }
          ts.q0(tq, this.u);
       }
       ts = this.t;
       if (ts != null) {
          ts.stop();
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.q = obj;
       obj = this.q8(PhotoDetailParam.class);
       a.o(obj, "inject\(PhotoDetailParam::class.java\)");
       this.r = obj;
       return;
    }
}
