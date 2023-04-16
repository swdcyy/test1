package com.gifshow.kuaishou.thanos.milano.MilanoAttachCallbackPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ef5.c;
import com.gifshow.kuaishou.thanos.milano.MilanoAttachCallbackPresenter$ContainerPhotoState;
import com.gifshow.kuaishou.thanos.milano.MilanoAttachCallbackPresenter$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import qw6.a;
import qh.b;
import erd.g;
import crd.b;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import qh.c;
import java.util.Objects;
import qh.e;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.utility.Log;
import kotlin.jvm.internal.a;
import com.kwai.component.photo.detail.slide.milano.listener.sticky.ContainerPhotoState;
import ef5.a;
import java.util.Iterator;
import java.lang.Iterable;
import df5.b;
import com.yxcorp.gifshow.util.LatestBrowsedFeedCache;
import java.lang.Boolean;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class MilanoAttachCallbackPresenter extends PresenterV2	// class@0015d3
{
    public BaseFragment p;
    public QPhoto q;
    public SlidePlayViewModel r;
    public final c s;
    public e t;
    public t u;
    public MilanoAttachCallbackPresenter$ContainerPhotoState v;
    public final a w;

    public void MilanoAttachCallbackPresenter(c p0){
       super();
       this.v = MilanoAttachCallbackPresenter$ContainerPhotoState.NO_PHOTO_ATTACH;
       this.w = new MilanoAttachCallbackPresenter$a(this);
       this.s = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, MilanoAttachCallbackPresenter.class, "3")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.p);
       this.r = slidePlayVie;
       slidePlayVie.h(this.w);
       this.X7(this.u.subscribe(new b(this)));
       this.X7(this.p.m().subscribe(new c(this)));
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, MilanoAttachCallbackPresenter.class, "6")) {
          return;
       }
       MilanoAttachCallbackPresenter tq = this.q;
       if (this.v == MilanoAttachCallbackPresenter$ContainerPhotoState.BECAME_ATTACH && tq != null) {
          MilanoAttachCallbackPresenter tt = this.t;
          Objects.requireNonNull(tt);
          if (!PatchProxy.applyVoidOneRefs(tq, tt, e.class, "7")) {
             Log.g("MilanoContainer", "pageSessionId="+tt.b+": Attached photoId="+tq.getPhotoId());
          }
          tt = this.s;
          Objects.requireNonNull(tt);
          if (!PatchProxy.applyVoidOneRefs(tq, tt, c.class, "3")) {
             a.p(tq, "photo");
             tt.c = ContainerPhotoState.ATTACHED;
             tt.b = tq;
             Iterator iterator = tt.a.iterator();
             while (iterator.hasNext()) {
                iterator.next().a(tq);
             }
          }
          this.v = MilanoAttachCallbackPresenter$ContainerPhotoState.ATTACHED;
       }else {
          Log.g("MilanoAttachP", "callAttached\(\) failed : mCurrentState ="+this.v.toString()+" photo=["+tq+"]");
       }
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, MilanoAttachCallbackPresenter.class, "7")) {
          return;
       }
       MilanoAttachCallbackPresenter tq = this.q;
       MilanoAttachCallbackPresenter tv = this.v;
       if (tv == MilanoAttachCallbackPresenter$ContainerPhotoState.BECAME_ATTACH || (tv == MilanoAttachCallbackPresenter$ContainerPhotoState.ATTACHED && tq != null)) {
          tv = this.t;
          Objects.requireNonNull(tv);
          if (!PatchProxy.applyVoidOneRefs(tq, tv, e.class, "6")) {
             Log.g("MilanoContainer", "pageSessionId="+tv.b+": BecomesDetached photoId="+tq.getPhotoId());
          }
          tv = this.s;
          Objects.requireNonNull(tv);
          if (!PatchProxy.applyVoidOneRefs(tq, tv, c.class, "4")) {
             a.p(tq, "photo");
             tv.c = ContainerPhotoState.NO_PHOTO_ATTACH;
             tv.b = tq;
             Iterator iterator = tv.a.iterator();
             while (iterator.hasNext()) {
                iterator.next().c(tq);
             }
          }
          LatestBrowsedFeedCache.h.d(tq);
          this.v = MilanoAttachCallbackPresenter$ContainerPhotoState.NO_PHOTO_ATTACH;
       }else {
          Log.g("MilanoAttachP", "callBecomesDetached\(\) failed : mCurrentState ="+this.v.toString()+" photo=["+tq+"]");
       }
       return;
    }
    public void S8(boolean p0){
       MilanoAttachCallbackPresenter milanoAttach = MilanoAttachCallbackPresenter.class;
       if (PatchProxy.isSupport(milanoAttach) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, milanoAttach, "2")) {
          return;
       }
       if (p0) {
          this.P8();
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MilanoAttachCallbackPresenter.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.t = this.q8(e.class);
       this.u = this.r8("MILANO_FIRST_LAST_ATTACH_OBSERVABLE");
       return;
    }
}
