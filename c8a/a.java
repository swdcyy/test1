package c8a.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import c8a.a$a;
import nsd.u;
import c8a.a$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import i3a.b;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.i3;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import android.app.Activity;
import com.kwai.feature.api.feed.home.common.SlideGuideManager;
import com.kwai.feature.api.feed.home.common.SlideGuideManager$a;
import uh5.e;
import hn5.n;
import hn5.m;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import za5.a;
import com.kwai.library.widget.popup.common.f;
import lnc.a1;
import c8a.a$c;
import c8a.a$d;
import com.yxcorp.gifshow.widget.h$a;
import com.yxcorp.gifshow.widget.h$b;
import e17.i$b;
import com.yxcorp.gifshow.widget.h;
import e17.i;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class a extends PresenterV2	// class@00056f
{
    public BaseFragment p;
    public SlidePlayViewModel q;
    public QPhoto r;
    public final a s;
    public static final a$a t;

    static {
       a.t = new a$a(null);
    }
    public void a(){
       super();
       this.s = new a$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       if (!b.a()) {
          return;
       }
       a tp = this.p;
       String str = "mFragment";
       if (tp == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tp.getParentFragment());
       a.o(slidePlayVie, "SlidePlayViewModel.get\(mFragment.parentFragment\)");
       this.q = slidePlayVie;
       if (slidePlayVie == null) {
          a.S("mSlidePlayViewModel");
       }
       a tp1 = this.p;
       if (tp1 == null) {
          a.S(str);
       }
       slidePlayVie.P(tp1, this.s);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a tq = this.q;
       if (tq == null) {
          a.S("mSlidePlayViewModel");
       }
       a tp = this.p;
       if (tp == null) {
          a.S("mFragment");
       }
       tq.D(tp, this.s);
       return;
    }
    public final int P8(QPhoto p0){
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.q;
       if (obj == null) {
          a.S("mSlidePlayViewModel");
       }
       a tq = this.q;
       if (tq == null) {
          a.S("mSlidePlayViewModel");
       }
       return obj.q(tq.M(p0));
    }
    public final void R8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.d("click_area", p0);
       p0 = oi3.e();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "CLOSE_AUTOPLAY_TOAST";
       uElementPack.params = p0;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       a tr = this.r;
       if (tr == null) {
          a.S("mPhoto");
       }
       uContentPack.photoPackage = w1.f(tr.mEntity);
       a tp = this.p;
       if (tp == null) {
          a.S("mFragment");
       }
       u1.M("", tp, 3, uElementPack, uContentPack, null);
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       if (!b.a()) {
          return;
       }
       if (!b.f()) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity == null || (!activity.isFinishing() && !activity.isDestroyed())) {
          if (SlideGuideManager.m.a().b(activity)) {
             return;
          }else {
             int i = e.c();
             if (m.a().U3(activity)) {
                a uoa = a.o0(activity);
                a.o(uoa, "HomeDataViewModel.get\(ac\x20\x02ity as FragmentActivity?\)\x00");
                if (uoa.p0() == 3) {
                   i = e.c() + f.h(activity);
                }
             }
             i$b uob = h.d(a1.p(R.string.arg_RES_7f105177), new a$c(this), new a$d(this), 3000, i, false, false);
             uob.v(false);
             a.o(uob, "BottomSkipToast.buildBot¡­     \).setResidual\(false\)");
             uob.s(R.layout.arg_RES_7f0d00e8);
             i.z(uob);
          }
       }
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
       this.r = obj;
       return;
    }
}
