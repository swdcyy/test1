package com.yxcorp.gifshow.ad.detail.presenter.ad.playend.PlayEndControlPresenter;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.PlayEndControlPresenter$onBind$1;
import msd.l;
import e59.b;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.PlayEndControlPresenter$a;
import g59.u;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.PlayEndControlPresenter$b;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.PlayEndControlPresenter$c;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.PlayEndControlPresenter$d;
import lnc.u1;
import com.kwai.robust.PatchProxyResult;
import a09.f;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.ad.dislike.thanosdetail.DislikeViewModel;
import io.reactivex.subjects.PublishSubject;
import im8.f;
import rf5.u;
import wl9.a;

public final class PlayEndControlPresenter extends PresenterV2 implements g	// class@0015ea
{
    public boolean A;
    public QPhoto p;
    public BaseFragment q;
    public DislikeViewModel r;
    public PublishSubject s;
    public PublishSubject t;
    public t u;
    public f v;
    public PublishSubject w;
    public u x;
    public boolean y;
    public boolean z;

    public void PlayEndControlPresenter(){
       super();
    }
    public void E8(){
       g a;
       if (PatchProxy.applyVoid(null, this, PlayEndControlPresenter.class, "2")) {
          return;
       }
       this.A = false;
       PlayEndControlPresenter tr = this.r;
       if (tr == null) {
          a.S("mThanosDislikeViewModel");
       }
       tr.b(new PlayEndControlPresenter$onBind$1(this));
       tr = this.s;
       if (tr == null) {
          a.S("mCommentFragmentVisiblePublisher");
       }
       a = u.a;
       this.X7(tr.subscribe(new PlayEndControlPresenter$a(this), a));
       tr = this.t;
       if (tr == null) {
          a.S("mHalfH5FragmentVisiblePublisher");
       }
       this.X7(tr.subscribe(new PlayEndControlPresenter$b(this), a));
       tr = this.u;
       if (tr == null) {
          a.S("mSimilarPhotoPanelShowObservable");
       }
       this.X7(tr.subscribe(new PlayEndControlPresenter$c(this), a));
       tr = this.w;
       if (tr == null) {
          a.S("mAdPlayEndViewState");
       }
       this.X7(tr.subscribe(new PlayEndControlPresenter$d(this), a));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, PlayEndControlPresenter.class, "3")) {
          return;
       }
       u1.a(this);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, PlayEndControlPresenter.class, "4")) {
          return;
       }
       u1.b(this);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PlayEndControlPresenter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, PlayEndControlPresenter.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(PlayEndControlPresenter.class, new f());
       }else {
          obj.put(PlayEndControlPresenter.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, PlayEndControlPresenter.class, "1")) {
          return;
       }
       f obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.q = obj;
       obj = this.r8("thanos_dislike_view_model");
       a.o(obj, "inject\(AccessIds.THANOS_DISLIKE_VIEW_MODEL\)");
       this.r = obj;
       obj = this.r8("DETAIL_SLIDE_COMMENT_FRAGMENT_VISIBLE");
       a.o(obj, "inject\(AccessIds.DETAIL_¡­COMMENT_FRAGMENT_VISIBLE\)");
       this.s = obj;
       obj = this.r8("DETAIL_HALF_H5_FRAGMENT_VISIBLE_PUBLISH");
       a.o(obj, "inject\(AccessIds.DETAIL_¡­FRAGMENT_VISIBLE_PUBLISH\)");
       this.t = obj;
       obj = this.r8("DETAIL_SIMILAR_PHOTO_PANEL_SHOW_OBSERVABLE");
       a.o(obj, "inject\(AccessIds.DETAIL_¡­TO_PANEL_SHOW_OBSERVABLE\)");
       this.u = obj;
       obj = this.x8("DETAIL_FULL_WEBVIEW_STATE");
       a.o(obj, "injectRef\(AccessIds.DETAIL_FULL_WEBVIEW_STATE\)");
       this.v = obj;
       Object obj1 = this.r8("AD_PLAY_END_VIEW_STATE");
       a.o(obj1, "inject\(AccessIds.AD_PLAY_END_VIEW_STATE\)");
       this.w = obj1;
       obj1 = this.q8(u.class);
       a.o(obj1, "inject\(SwipeToProfileFeedMovement::class.java\)");
       this.x = obj1;
       return;
    }
    public final void onEventMainThread(a p0){
       a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayEndControlPresenter.class, "5")) {
          return;
       }
       a.p(p0, "shownEvent");
       a = p0.a;
       a.o(a, "shownEvent.mPhoto");
       String photoId = a.getPhotoId();
       PlayEndControlPresenter tp = this.p;
       if (tp == null) {
          a.S("mPhoto");
       }
       if (a.g(photoId, tp.getPhotoId()) ^ 0x01) {
          return;
       }else {
          this.z = p0.b;
          return;
       }
    }
}
