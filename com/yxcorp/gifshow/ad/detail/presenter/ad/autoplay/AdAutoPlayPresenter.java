package com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter$a;
import nsd.u;
import java.util.BitSet;
import com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter$d;
import com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter$c;
import com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter$mLifecycleObserver$1;
import com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import p5a.e;
import de5.a;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.framework.player.core.b;
import com.kwai.framework.player.core.b$b;
import com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter$e;
import erd.g;
import crd.b;
import brd.t;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import ib5.q;
import com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter$f;
import com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter$onBind$3;
import msd.l;
import e59.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;
import lnc.u1;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Boolean;
import lnc.y0;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter$g;
import com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter$h;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import vo5.j;
import lnc.b9;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.ad.dislike.thanosdetail.DislikeViewModel;
import im8.f;
import dda.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter$STOP_REASON;
import djc.l1;
import mhc.y1;
import wl9.a;

public final class AdAutoPlayPresenter extends PresenterV2	// class@001595
{
    public final IMediaPlayer$OnInfoListener A;
    public final b$b B;
    public final DefaultLifecycleObserver C;
    public final a D;
    public QPhoto p;
    public SlidePlayViewModel q;
    public BaseFragment r;
    public b s;
    public boolean t;
    public a u;
    public boolean v;
    public final BitSet w;
    public PublishSubject x;
    public DislikeViewModel y;
    public f z;
    public static final AdAutoPlayPresenter$a E;

    static {
       AdAutoPlayPresenter.E = new AdAutoPlayPresenter$a(null);
    }
    public void AdAutoPlayPresenter(){
       super();
       this.w = new BitSet();
       this.A = new AdAutoPlayPresenter$d(this);
       this.B = new AdAutoPlayPresenter$c(this);
       this.C = new AdAutoPlayPresenter$mLifecycleObserver$1(this);
       this.D = new AdAutoPlayPresenter$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, AdAutoPlayPresenter.class, "7")) {
          return;
       }
       AdAutoPlayPresenter tr = this.r;
       String str = "mFragment";
       if (tr == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tr.getParentFragment());
       this.q = slidePlayVie;
       if (slidePlayVie != null) {
          AdAutoPlayPresenter tr1 = this.r;
          if (tr1 == null) {
             a.S(str);
          }
          slidePlayVie.P(tr1, this.D);
       }
       tr = this.u;
       str = "mPlayModule";
       if (tr == null) {
          a.S(str);
       }
       e player = tr.getPlayer();
       if (player != null) {
          player.addOnInfoListener(this.A);
       }
       tr = this.u;
       if (tr == null) {
          a.S(str);
       }
       player = tr.getPlayer();
       if (player != null) {
          player.w(this.B);
       }
       tr = this.x;
       if (tr == null) {
          a.S("mCommentFragmentVisiblePublisher");
       }
       this.X7(tr.subscribe(new AdAutoPlayPresenter$e(this)));
       FragmentActivity activity = this.getActivity();
       a.m(activity);
       q oq = q.p0(activity);
       a.o(oq, "MenuViewModel\n      .get\x20\x02 as FragmentActivity?\)!!\)\x00");
       this.X7(oq.r0().subscribe(new AdAutoPlayPresenter$f(this)));
       tr = this.y;
       if (tr == null) {
          a.S("mDislikeViewModel");
       }
       tr.b(new AdAutoPlayPresenter$onBind$3(this));
       return;
    }
    public void F8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdAutoPlayPresenter.class, "5")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity instanceof GifshowActivity) {
          objArray = activity;
       }
       if (objArray != null) {
          Lifecycle lifecycle = objArray.getLifecycle();
          if (lifecycle != null) {
             lifecycle.addObserver(this.C);
          }
       }
       u1.a(this);
       return;
    }
    public void H8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdAutoPlayPresenter.class, "6")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity instanceof GifshowActivity) {
          objArray = activity;
       }
       if (objArray != null) {
          Lifecycle lifecycle = objArray.getLifecycle();
          if (lifecycle != null) {
             lifecycle.removeObserver(this.C);
          }
       }
       u1.b(this);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, AdAutoPlayPresenter.class, "8")) {
          return;
       }
       this.w.clear();
       AdAutoPlayPresenter tq = this.q;
       if (tq != null) {
          AdAutoPlayPresenter tr = this.r;
          if (tr == null) {
             a.S("mFragment");
          }
          tq.D(tr, this.D);
       }
       tq = this.u;
       String str = "mPlayModule";
       if (tq == null) {
          a.S(str);
       }
       e player = tq.getPlayer();
       if (player != null) {
          player.removeOnInfoListener(this.A);
       }
       tq = this.u;
       if (tq == null) {
          a.S(str);
       }
       player = tq.getPlayer();
       if (player != null) {
          player.O(this.B);
       }
       this.V8();
       return;
    }
    public final void P8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdAutoPlayPresenter.class, "9")) {
          return;
       }
       AdAutoPlayPresenter tq = this.q;
       if (tq != null) {
          AdAutoPlayPresenter tp = this.p;
          if (tp == null) {
             a.S("mPhoto");
          }
          objArray = Boolean.valueOf(tq.H(tp));
       }
       if (y0.p(objArray)) {
          tq = this.q;
          if (tq != null) {
             tq.L(false);
          }
       }
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, AdAutoPlayPresenter.class, "2")) {
          return;
       }
       if (!this.S8()) {
          return;
       }
       this.V8();
       this.s = t.intervalRange(1, 5, 1, 1, TimeUnit.SECONDS).observeOn(d.a).subscribe(new AdAutoPlayPresenter$g(this), new AdAutoPlayPresenter$h(this));
       return;
    }
    public final boolean S8(){
       Object obj = PatchProxy.apply(null, this, AdAutoPlayPresenter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!d.a(-1650007626).QW()) {
          return false;
       }
       if (this.t == null) {
          return false;
       }
       if (this.w.cardinality()) {
          return false;
       }
       return true;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, AdAutoPlayPresenter.class, "1")) {
          return;
       }
       b9.a(this.s);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, AdAutoPlayPresenter.class, "4")) {
          return;
       }
       f obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.r = obj;
       obj = this.q8(a.class);
       a.o(obj, "inject\(DetailPlayModule::class.java\)");
       this.u = obj;
       obj = this.r8("DETAIL_SLIDE_COMMENT_FRAGMENT_VISIBLE");
       a.o(obj, "inject\(AccessIds.DETAIL_¡­COMMENT_FRAGMENT_VISIBLE\)");
       this.x = obj;
       obj = this.r8("thanos_dislike_view_model");
       a.o(obj, "inject\(AccessIds.THANOS_DISLIKE_VIEW_MODEL\)");
       this.y = obj;
       obj = this.x8("PHOTO_VIDEO_PLAY_END_PREPARE");
       a.o(obj, "injectRef\(AccessIds.PHOTO_VIDEO_PLAY_END_PREPARE\)");
       this.z = obj;
       return;
    }
    public final void onEventMainThread(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdAutoPlayPresenter.class, "13")) {
          return;
       }
       a.p(p0, "event");
       if (this.t != null) {
          p0 = p0.a;
          String id = (p0 != null)? p0.getId(): null;
          AdAutoPlayPresenter tp = this.p;
          if (tp == null) {
             a.S("mPhoto");
          }
          if (!(a.g(id, tp.getPhotoId()) ^ 0x01)) {
             this.w.set(AdAutoPlayPresenter$STOP_REASON.STOP_BY_COMMERCIAL_CONVERT.getType());
             this.V8();
          }
       }
       return;
    }
    public final void onEventMainThread(l1 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdAutoPlayPresenter.class, "11")) {
          return;
       }
       a.p(p0, "shownEvent");
       if (this.t == null) {
          return;
       }
       if (p0.a != null) {
          this.w.set(AdAutoPlayPresenter$STOP_REASON.STOP_BY_FEEDBACK_PANEL.getType());
          this.V8();
       }else {
          this.w.clear(AdAutoPlayPresenter$STOP_REASON.STOP_BY_FEEDBACK_PANEL.getType());
          this.R8();
       }
       return;
    }
    public final void onEventMainThread(y1 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdAutoPlayPresenter.class, "10")) {
          return;
       }
       a.p(p0, "shownEvent");
       if (this.t == null) {
          return;
       }
       if (p0.a != null) {
          this.w.set(AdAutoPlayPresenter$STOP_REASON.STOP_BY_SHARE_PANEL.getType());
          this.V8();
       }else {
          this.w.clear(AdAutoPlayPresenter$STOP_REASON.STOP_BY_SHARE_PANEL.getType());
          this.R8();
       }
       return;
    }
    public final void onEventMainThread(a p0){
       a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, AdAutoPlayPresenter.class, "12")) {
          return;
       }
       a.p(p0, "shownEvent");
       if (this.t != null) {
          a = p0.a;
          a.o(a, "shownEvent.mPhoto");
          String photoId = a.getPhotoId();
          AdAutoPlayPresenter tp = this.p;
          if (tp == null) {
             a.S("mPhoto");
          }
          if (!(a.g(photoId, tp.getPhotoId()) ^ 0x01)) {
             if (p0.b != null) {
                this.w.set(AdAutoPlayPresenter$STOP_REASON.STOP_BY_FEEDBACK_SUBMENU.getType());
                this.V8();
             }else {
                this.w.clear(AdAutoPlayPresenter$STOP_REASON.STOP_BY_FEEDBACK_SUBMENU.getType());
                this.R8();
             }
          }
       }
       return;
    }
}
