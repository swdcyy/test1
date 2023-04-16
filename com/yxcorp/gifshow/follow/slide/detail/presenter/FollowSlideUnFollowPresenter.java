package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideUnFollowPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideUnFollowPresenter$mSidebarStatusListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lnc.u1;
import jta.c;
import hf5.e;
import java.util.Objects;
import cia.w;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import cia.w$a;
import xl8.b;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideUnFollowPresenter$a;
import erd.r;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideUnFollowPresenter$b;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideUnFollowPresenter$c;
import kga.c;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideUnFollowPresenter$d;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideUnFollowPresenter$e;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideUnFollowPresenter$f;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideUnFollowPresenter$g;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideUnFollowPresenter$h;
import erd.o;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideUnFollowPresenter$i;
import cda.i;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.entity.QPhoto;
import xga.c;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.utility.TextUtils;
import java.util.List;

public final class FollowSlideUnFollowPresenter extends PresenterV2	// class@001140
{
    public final PublishSubject p;
    public List q;
    public w r;
    public e s;
    public boolean t;
    public final p u;

    public void FollowSlideUnFollowPresenter(){
       super();
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<FollowUpdateEvent>\(\)");
       this.p = publishSubje;
       this.q = new ArrayList();
       this.u = s.c(new FollowSlideUnFollowPresenter$mSidebarStatusListener$2(this));
    }
    public void E8(){
       g a;
       w d;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FollowSlideUnFollowPresenter.class, "5")) {
          return;
       }
       u1.a(this);
       FollowSlideUnFollowPresenter ts = this.s;
       if (ts == null) {
          a.S("mGestureProtocol");
       }
       ts.D0(this.R8());
       ts = this.r;
       if (ts == null) {
          a.S("mFollowSlideInjectAdapter");
       }
       Objects.requireNonNull(ts);
       t ot = PatchProxy.apply(objArray, ts, w.class, "3");
       if (ot != PatchProxyResult.class) {
       }else {
          d = ts.d;
          if (d != null) {
             ot = d.m();
          }else {
             w l = ts.l;
             ot = (l != null)? l.b.observable(): new b(objArray).observable();
          }
       }
       a = c.a;
       this.X7(ot.filter(FollowSlideUnFollowPresenter$a.b).filter(new FollowSlideUnFollowPresenter$b(this)).subscribe(new FollowSlideUnFollowPresenter$c(this), a));
       this.X7(RxBus.f.f(n.class).observeOn(d.a).subscribe(new FollowSlideUnFollowPresenter$d(this), a));
       this.X7(this.p.filter(new FollowSlideUnFollowPresenter$e(this)).filter(FollowSlideUnFollowPresenter$f.b).filter(new FollowSlideUnFollowPresenter$g(this)).map(FollowSlideUnFollowPresenter$h.b).subscribe(new FollowSlideUnFollowPresenter$i(this), a));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, FollowSlideUnFollowPresenter.class, "9")) {
          return;
       }
       u1.b(this);
       FollowSlideUnFollowPresenter ts = this.s;
       if (ts == null) {
          a.S("mGestureProtocol");
       }
       ts.w0(this.R8());
       return;
    }
    public final w P8(){
       FollowSlideUnFollowPresenter obj = PatchProxy.apply(null, this, FollowSlideUnFollowPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r;
       if (obj == null) {
          a.S("mFollowSlideInjectAdapter");
       }
       return obj;
    }
    public final c R8(){
       Object obj = PatchProxy.apply(null, this, FollowSlideUnFollowPresenter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.u.getValue();
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, FollowSlideUnFollowPresenter.class, "3")) {
          return;
       }
       Object obj = this.q8(w.class);
       a.o(obj, "inject\(FollowSlideInjectAdapter::class.java\)");
       this.r = obj;
       obj = this.q8(e.class);
       a.o(obj, "inject\(GestureMilanoProtocol::class.java\)");
       this.s = obj;
       return;
    }
    public final void onEventMainThread(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowSlideUnFollowPresenter.class, "10")) {
          return;
       }
       a.p(p0, "event");
       FollowSlideUnFollowPresenter tr = this.r;
       if (tr == null) {
          a.S("mFollowSlideInjectAdapter");
       }
       SlidePlayViewModel slidePlayVie = tr.O();
       if (slidePlayVie != null) {
          QPhoto currentPhoto = slidePlayVie.getCurrentPhoto();
          if (currentPhoto != null) {
             a.o(currentPhoto, "it");
             String photoId = currentPhoto.getPhotoId();
             if (photoId != null && a.g(photoId, p0.a)) {
                c.a("negative_feedback", "follow_slide_detail", currentPhoto);
             }
          }
       }
       return;
    }
    public final void onEventMainThread(n p0){
       Object obj;
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowSlideUnFollowPresenter.class, "8")) {
          return;
       }
       FollowSlideUnFollowPresenter tr = this.r;
       if (tr == null) {
          a.S("mFollowSlideInjectAdapter");
       }
       if (tr.P()) {
          this.p.onNext(p0);
       }else if(p0.d != null || p0.c != null){
          if (this.t != null) {
             tr = this.s;
             if (tr == null) {
                a.S("mGestureProtocol");
             }
             tr.h1();
          }
          n b = p0.b;
          Iterator iterator = this.q.iterator();
          while (true) {
             if (iterator.hasNext()) {
                obj = iterator.next();
                if (!TextUtils.m(b, obj.b)) {
                   continue ;
                }
             }else {
                obj = null;
             }
             if (obj == null) {
                this.q.add(p0);
                break ;
             }
          }
       }
       return;
    }
}
