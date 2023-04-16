package com.yxcorp.gifshow.detail.slidev2.presenter.CountdownToAutoPlayPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slidev2.presenter.CountdownToAutoPlayPresenter$a;
import nsd.u;
import java.util.BitSet;
import com.yxcorp.gifshow.detail.slidev2.presenter.CountdownToAutoPlayPresenter$mLifecycleObserver$1;
import com.yxcorp.gifshow.detail.slidev2.presenter.CountdownToAutoPlayPresenter$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.CountdownToAutoPlayPresenter$c;
import android.view.View$OnTouchListener;
import android.view.View;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import ib5.q;
import brd.t;
import com.yxcorp.gifshow.detail.slidev2.presenter.CountdownToAutoPlayPresenter$d;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;
import lnc.u1;
import i3a.b;
import com.yxcorp.utility.Log;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.detail.slidev2.presenter.CountdownToAutoPlayPresenter$e;
import lnc.b9;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import djc.l1;
import com.yxcorp.gifshow.detail.slidev2.presenter.CountdownToAutoPlayPresenter$STOP_REASON;

public final class CountdownToAutoPlayPresenter extends PresenterV2	// class@0018b0
{
    public SlidePlayViewModel p;
    public BaseFragment q;
    public b r;
    public boolean s;
    public PhotoDetailParam t;
    public final BitSet u;
    public View v;
    public final DefaultLifecycleObserver w;
    public final a x;
    public static final CountdownToAutoPlayPresenter$a y;

    static {
       CountdownToAutoPlayPresenter.y = new CountdownToAutoPlayPresenter$a(null);
    }
    public void CountdownToAutoPlayPresenter(){
       super();
       this.u = new BitSet();
       this.w = new CountdownToAutoPlayPresenter$mLifecycleObserver$1(this);
       this.x = new CountdownToAutoPlayPresenter$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, CountdownToAutoPlayPresenter.class, "7")) {
          return;
       }
       CountdownToAutoPlayPresenter tq = this.q;
       String str = "mFragment";
       if (tq == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tq.getParentFragment());
       this.p = slidePlayVie;
       if (slidePlayVie != null) {
          CountdownToAutoPlayPresenter tq1 = this.q;
          if (tq1 == null) {
             a.S(str);
          }
          slidePlayVie.P(tq1, this.x);
       }
       tq = this.v;
       if (tq != null) {
          tq.setOnTouchListener(new CountdownToAutoPlayPresenter$c(this));
       }
       FragmentActivity activity = this.getActivity();
       a.m(activity);
       q oq = q.p0(activity);
       a.o(oq, "MenuViewModel\n        .g\x20\x02 as FragmentActivity?\)!!\)\x00");
       this.X7(oq.r0().subscribe(new CountdownToAutoPlayPresenter$d(this)));
       return;
    }
    public void F8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CountdownToAutoPlayPresenter.class, "5")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity instanceof GifshowActivity) {
          objArray = activity;
       }
       if (objArray != null) {
          Lifecycle lifecycle = objArray.getLifecycle();
          if (lifecycle != null) {
             lifecycle.addObserver(this.w);
          }
       }
       u1.a(this);
       return;
    }
    public void H8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CountdownToAutoPlayPresenter.class, "6")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity instanceof GifshowActivity) {
          objArray = activity;
       }
       if (objArray != null) {
          Lifecycle lifecycle = objArray.getLifecycle();
          if (lifecycle != null) {
             lifecycle.removeObserver(this.w);
          }
       }
       u1.b(this);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, CountdownToAutoPlayPresenter.class, "8")) {
          return;
       }
       CountdownToAutoPlayPresenter tp = this.p;
       if (tp != null) {
          CountdownToAutoPlayPresenter tq = this.q;
          if (tq == null) {
             a.S("mFragment");
          }
          tp.D(tq, this.x);
       }
       this.R8();
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, CountdownToAutoPlayPresenter.class, "3")) {
          return;
       }
       if (!b.f()) {
          return;
       }
       if (this.s == null) {
          return;
       }
       if (this.u.cardinality()) {
          Log.g("SlidePlayAutoPlay", "mStopSet.cardinality\(\) != 0");
          return;
       }else {
          this.R8();
          this.r = t.intervalRange(1, 5, 1, 1, TimeUnit.SECONDS).observeOn(d.a).subscribe(new CountdownToAutoPlayPresenter$e(this));
          return;
       }
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, CountdownToAutoPlayPresenter.class, "2")) {
          return;
       }
       b9.a(this.r);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CountdownToAutoPlayPresenter.class, "1")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a4031);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, CountdownToAutoPlayPresenter.class, "4")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.q = obj;
       obj = this.q8(PhotoDetailParam.class);
       a.o(obj, "inject\(PhotoDetailParam::class.java\)");
       this.t = obj;
       return;
    }
    public final void onEventMainThread(l1 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CountdownToAutoPlayPresenter.class, "9")) {
          return;
       }
       a.p(p0, "shownEvent");
       if (this.s == null) {
          return;
       }
       if (p0.a != null) {
          this.u.set(CountdownToAutoPlayPresenter$STOP_REASON.STOP_BY_FEEDBACK_PANEL.getType());
          this.R8();
       }else {
          this.u.clear(CountdownToAutoPlayPresenter$STOP_REASON.STOP_BY_FEEDBACK_PANEL.getType());
          this.P8();
       }
       return;
    }
}
