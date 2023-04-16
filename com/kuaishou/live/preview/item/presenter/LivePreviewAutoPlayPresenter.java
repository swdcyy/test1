package com.kuaishou.live.preview.item.presenter.LivePreviewAutoPlayPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.preview.item.presenter.LivePreviewAutoPlayPresenter$a;
import nsd.u;
import java.util.BitSet;
import ll3.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import ok.x;
import java.lang.Long;
import com.kuaishou.live.preview.item.presenter.LivePreviewAutoPlayPresenter$mLifecycleObserver$1;
import com.kuaishou.live.preview.item.presenter.LivePreviewAutoPlayPresenter$b;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import ib5.q;
import brd.t;
import com.kuaishou.live.preview.item.presenter.LivePreviewAutoPlayPresenter$c;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;
import lnc.u1;
import tkd.b;
import tkd.d;
import vo5.j;
import pp.a;
import q87.c;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import com.kuaishou.live.preview.item.presenter.LivePreviewAutoPlayPresenter$d;
import lnc.b9;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import djc.l1;
import com.kuaishou.live.preview.item.presenter.LivePreviewAutoPlayPresenter$STOP_REASON;

public final class LivePreviewAutoPlayPresenter extends PresenterV2	// class@000dff
{
    public SlidePlayViewModel p;
    public BaseFragment q;
    public b r;
    public boolean s;
    public PhotoDetailParam t;
    public final BitSet u;
    public final long v;
    public final DefaultLifecycleObserver w;
    public final a x;
    public static final LivePreviewAutoPlayPresenter$a y;

    static {
       LivePreviewAutoPlayPresenter.y = new LivePreviewAutoPlayPresenter$a(null);
    }
    public void LivePreviewAutoPlayPresenter(){
       super();
       this.u = new BitSet();
       Object obj = PatchProxy.apply(null, null, j.class, "7");
       long l = (obj != PatchProxyResult.class)? obj.longValue(): j.b.get().longValue();
       this.v = l;
       this.w = new LivePreviewAutoPlayPresenter$mLifecycleObserver$1(this);
       this.x = new LivePreviewAutoPlayPresenter$b(this);
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, LivePreviewAutoPlayPresenter.class, "6")) {
          return;
       }
       LivePreviewAutoPlayPresenter tq = this.q;
       String str = "mFragment";
       if (tq == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tq.getParentFragment());
       this.p = slidePlayVie;
       if (slidePlayVie != null) {
          LivePreviewAutoPlayPresenter tq1 = this.q;
          if (tq1 == null) {
             a.S(str);
          }
          slidePlayVie.P(tq1, this.x);
       }
       FragmentActivity activity = this.getActivity();
       a.m(activity);
       q oq = q.p0(activity);
       a.o(oq, "MenuViewModel\n        .g\x20\x02 as FragmentActivity?\)!!\)\x00");
       this.X7(oq.r0().subscribe(new LivePreviewAutoPlayPresenter$c(this)));
       return;
    }
    public void F8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LivePreviewAutoPlayPresenter.class, "4")) {
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
       if (PatchProxy.applyVoid(objArray, this, LivePreviewAutoPlayPresenter.class, "5")) {
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
       if (PatchProxy.applyVoid(null, this, LivePreviewAutoPlayPresenter.class, "7")) {
          return;
       }
       LivePreviewAutoPlayPresenter tp = this.p;
       if (tp != null) {
          LivePreviewAutoPlayPresenter tq = this.q;
          if (tq == null) {
             a.S("mFragment");
          }
          tp.D(tq, this.x);
       }
       this.R8();
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, LivePreviewAutoPlayPresenter.class, "2")) {
          return;
       }
       if (!d.a(-1650007626).QW()) {
          return;
       }
       if (this.s == null) {
          return;
       }
       if (this.u.cardinality()) {
          Object[] objArray = new Object[0];
          a.C().w("SlidePlayAutoPlay", "mStopSet.cardinality\(\) != 0", objArray);
          return;
       }else {
          this.R8();
          this.r = t.intervalRange(1, this.v, 1, 1, TimeUnit.SECONDS).observeOn(d.a).subscribe(new LivePreviewAutoPlayPresenter$d(this));
          return;
       }
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, LivePreviewAutoPlayPresenter.class, "1")) {
          return;
       }
       b9.a(this.r);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LivePreviewAutoPlayPresenter.class, "3")) {
          return;
       }
       Object obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.q = obj;
       obj = this.q8(PhotoDetailParam.class);
       a.o(obj, "inject\(PhotoDetailParam::class.java\)");
       this.t = obj;
       return;
    }
    public final void onEventMainThread(l1 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePreviewAutoPlayPresenter.class, "8")) {
          return;
       }
       a.p(p0, "shownEvent");
       if (this.s == null) {
          return;
       }
       if (p0.a != null) {
          this.u.set(LivePreviewAutoPlayPresenter$STOP_REASON.STOP_BY_FEEDBACK_PANEL.getType());
          this.R8();
       }else {
          this.u.clear(LivePreviewAutoPlayPresenter$STOP_REASON.STOP_BY_FEEDBACK_PANEL.getType());
          this.P8();
       }
       return;
    }
}
