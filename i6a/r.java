package i6a.r;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import i6a.r$a;
import i6a.r$h;
import i6a.r$i;
import i6a.r$k;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.InterestManageSnackBarInfo;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import brd.t;
import i6a.r$b;
import erd.g;
import crd.b;
import i6a.r$c;
import io.reactivex.internal.functions.Functions;
import i6a.r$d;
import xx9.a;
import i6a.r$e;
import i6a.r$f;
import com.yxcorp.gifshow.util.rx.RxBus;
import ujc.e;
import t45.d;
import brd.z;
import i6a.r$g;
import jta.c;
import rf5.u;
import android.app.Activity;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$d;
import uo5.a;
import java.lang.Boolean;
import e17.i;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import tkd.b;
import tkd.d;
import nl9.h0;
import com.yxcorp.gifshow.detail.view.InterestSnackBar;
import i6a.r$j;
import java.util.Objects;
import com.yxcorp.gifshow.detail.view.InterestSnackBar$a;
import com.kwai.robust.PatchProxyResult;
import e17.i$b;
import java.lang.CharSequence;
import com.yxcorp.gifshow.detail.view.a;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import com.yxcorp.gifshow.detail.view.b;
import com.yxcorp.gifshow.detail.view.c;
import com.yxcorp.gifshow.detail.view.InterestSnackBar$b;
import e17.i$e;
import io.reactivex.subjects.PublishSubject;

public final class r extends PresenterV2	// class@0027b7
{
    public boolean A;
    public final r$a B;
    public final r$h C;
    public final Runnable D;
    public final c E;
    public BaseFragment p;
    public SlidePlayViewModel q;
    public QPhoto r;
    public t s;
    public a t;
    public PublishSubject u;
    public u v;
    public PublishSubject w;
    public i x;
    public boolean y;
    public boolean z;

    public void r(){
       super();
       this.B = new r$a(this);
       this.C = new r$h(this);
       this.D = new r$i(this);
       this.E = new r$k(this);
    }
    public static final QPhoto P8(r p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("photo");
       }
       return p0;
    }
    public static void S8(r p0,boolean p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = false;
       }
       p0.R8(p1);
       return;
    }
    public void E8(){
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, r.class, "3")) {
          return;
       }
       r tr = this.r;
       if (tr == null) {
          a.S("photo");
       }
       PhotoMeta photoMeta = tr.getPhotoMeta();
       photoMeta = (photoMeta != null)? photoMeta.mInterestManageSnackBarInfo: objArray;
       if (photoMeta == null || photoMeta.mHasShow != null) {
          PatchProxy.onMethodExit(r.class, "3");
          return;
       }else {
          this.z = true;
          tr = this.p;
          String str = "fragment";
          if (tr == null) {
             a.S(str);
          }
          SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tr.getParentFragment());
          this.q = slidePlayVie;
          if (slidePlayVie != null) {
             r tp = this.p;
             if (tp == null) {
                a.S(str);
             }
             slidePlayVie.P(tp, this.B);
          }
          tr = this.p;
          if (tr == null) {
             a.S(str);
          }
          BaseFragment parentFragme = tr.getParentFragment();
          if (parentFragme != null) {
             this.X7(parentFragme.Vg().i().subscribe(new r$b(this)));
          }
          tr = this.s;
          if (tr == null) {
             a.S("nasaScaleCleanControllerShow");
          }
          this.X7(tr.subscribe(new r$c(this), Functions.e));
          tr = this.t;
          if (tr == null) {
             a.S("screenCleanStatusCombination");
          }
          this.X7(a.j(tr, new r$d(this), objArray, 2, objArray));
          r tu = this.u;
          if (tu == null) {
             a.S("configurationChangedPublisher");
          }
          this.X7(tu.subscribe(new r$e(this)));
          tu = this.w;
          if (tu == null) {
             a.S("commentFragmentVisiblePublisher");
          }
          this.X7(tu.subscribe(new r$f(this)));
          this.X7(RxBus.f.f(e.class).observeOn(d.a).subscribe(new r$g(this)));
          tu = this.v;
          if (tu == null) {
             a.S("swipeToProfileFeedMovement");
          }
          tu.j(this.E);
          a.b(this.getActivity(), this.C);
          PatchProxy.onMethodExit(r.class, "3");
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, r.class, "6")) {
          return;
       }
       if (this.z == null) {
          PatchProxy.onMethodExit(r.class, "6");
          return;
       }else {
          this.z = false;
          this.A = false;
          r tq = this.q;
          if (tq != null) {
             r tp = this.p;
             if (tp == null) {
                a.S("fragment");
             }
             tq.D(tp, this.B);
          }
          tq = this.v;
          if (tq == null) {
             a.S("swipeToProfileFeedMovement");
          }
          tq.B(this.E);
          a.d(this.getActivity(), this.C);
          PatchProxy.onMethodExit(r.class, "6");
          return;
       }
    }
    public final void R8(boolean p0){
       r tx;
       if (PatchProxy.isSupport2(r.class, "5") && PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), this, r.class, "5")) {
          return;
       }
       if (p0) {
          tx = this.x;
          if (tx != null) {
             tx.i();
          }
       }
       tx = this.x;
       if (tx != null) {
          tx.h();
       }
       PatchProxy.onMethodExit(r.class, "5");
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoidWithListener(null, this, r.class, "4")) {
          return;
       }
       if (this.y != null) {
          this.y = false;
          k1.m(this.D);
       }
       this.R8(true);
       PatchProxy.onMethodExit(r.class, "4");
       return;
    }
    public final void W8(InterestManageSnackBarInfo p0,String p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, r.class, "8")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "TOAST_INFO_CARD";
       i3 oi3 = i3.f();
       oi3.d("toast_content", p0.mContent);
       oi3.d("click_type", p1);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       r tr = this.r;
       if (tr == null) {
          a.S("photo");
       }
       uContentPack.photoPackage = w1.f(tr.mEntity);
       r tp = this.p;
       if (tp == null) {
          a.S("fragment");
       }
       u1.M("", tp, 1, uElementPack, uContentPack, null);
       PatchProxy.onMethodExit(r.class, "8");
       return;
    }
    public final void X8(InterestManageSnackBarInfo p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, r.class, "1")) {
          return;
       }
       b uob = d.a(-536296199);
       a.o(uob, "PluginManager.get\(SplashPlugin::class.java\)");
       if (uob.Q4()) {
          this.A = true;
          PatchProxy.onMethodExit(r.class, "1");
          return;
       }else {
          Activity activity = this.getActivity();
          if (activity != null) {
             InterestSnackBar$a f = InterestSnackBar.f;
             a.o(activity, "it");
             r$j oj = new r$j(this, p0);
             Objects.requireNonNull(f);
             i$b uob1 = PatchProxy.applyThreeRefs(activity, p0, oj, f, InterestSnackBar$a.class, "1");
             if (uob1 != PatchProxyResult.class) {
             }else {
                a.p(activity, "activity");
                a.p(p0, "snackBarInfo");
                a.p(oj, "listener");
                uob1 = new i$b();
                uob1.o(5000);
                uob1.y(p0.mContent);
                uob1.r(a.a);
                uob1.u(b.a);
                uob1.v(false);
                uob1.s(R.layout.arg_RES_7f0d0636);
                uob1.A(new c(oj, activity, p0));
             }
             this.x = i.z(uob1);
          }
          PatchProxy.onMethodExit(r.class, "1");
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, r.class, "2")) {
          return;
       }
       Object obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.p = obj;
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.r = obj;
       obj = this.r8("NASA_SCALE_CLEAN_CONTROLLER_SHOW_OBSERVABLE");
       a.o(obj, "inject\(DetailAccessIds.N¡­NTROLLER_SHOW_OBSERVABLE\)");
       this.s = obj;
       obj = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       a.o(obj, "inject\(DetailAccessIds.DETAIL_SCREEN_CLEAN_STATUS\)");
       this.t = obj;
       obj = this.r8("DETAIL_ON_CONFIGURATION_CHANGED_EVENT");
       a.o(obj, "inject\(AccessIds.DETAIL_¡­FIGURATION_CHANGED_EVENT\)");
       this.u = obj;
       obj = this.q8(u.class);
       a.o(obj, "inject\(SwipeToProfileFeedMovement::class.java\)");
       this.v = obj;
       obj = this.r8("DETAIL_SLIDE_COMMENT_FRAGMENT_VISIBLE");
       a.o(obj, "inject\(AccessIds.DETAIL_¡­COMMENT_FRAGMENT_VISIBLE\)");
       this.w = obj;
       PatchProxy.onMethodExit(r.class, "2");
       return;
    }
}
