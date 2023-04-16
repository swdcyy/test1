package com.yxcorp.gifshow.detail.nonslide.presenter.share.c;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import hw5.c;
import vv5.a0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import z2a.f;
import vy6.a;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.yxcorp.gifshow.util.rx.RxBus;
import w16.k;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.b;
import z2a.d;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import zhc.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.entity.QPhoto;
import wkd.b;
import m9a.c;
import java.util.Objects;
import java.util.List;
import zhc.d;
import pm6.m;
import rq.a;
import android.app.Activity;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import z2a.e;
import java.lang.Runnable;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class c extends a	// class@0015dd
{
    public Runnable s;
    public PhotoDetailParam t;
    public BaseFragment u;
    public String v;
    public b w;
    public NasaBizParam x;

    public void c(){
       super();
       this.s = null;
    }
    public void E8(){
       boolean b;
       c uoc = c.class;
       if (PatchProxy.applyVoid(null, this, uoc, "2")) {
          return;
       }
       this.R8();
       if (!d.a(0x16b5eb97).r9()) {
          SlidePlayViewModel obj = PatchProxy.applyOneRefs(this.u, this, uoc, "6");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             uoc = this.u;
             if (uoc != null) {
                obj = SlidePlayViewModel.S0(uoc.getParentFragment());
                if (obj != null) {
                   obj.P(this.u, new f(this));
                   b = true;
                }
             }
             b = false;
          }
          if (!b) {
             this.V8();
          }
       }
       uoc = this.x;
       if (uoc != null && uoc.getNasaSlideParam().isFriendPage()) {
          this.X7(RxBus.f.g(k.class, RxBus$ThreadMode.MAIN).subscribe(new b(this), new d(this)));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "8")) {
          return;
       }
       a tq = this.q;
       if (tq != null) {
          tq.h();
       }
       return;
    }
    public void R8(){
       this.s = null;
    }
    public final void S8(GifshowActivity p0){
       int b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "10")) {
          return;
       }
       Object obj = PatchProxy.apply(null, this, uoc, "7");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(this.t.mPhoto.getPostWorkInfoId() >= 0){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          b = 0x7ea62562;
          c uoc1 = b.a(b);
          String photoId = this.t.mPhoto.getPhotoId();
          Objects.requireNonNull(uoc1);
          Object obj1 = PatchProxy.applyOneRefs(photoId, uoc1, c.class, "2");
          boolean b1 = (obj1 != patchProxyRe)? obj1.booleanValue(): uoc1.a.contains(photoId);
          if (!b1) {
             d uod = new d(p0, this.t, "PHOTO_PUBLISH_GUIDE", "PHOTO_AUTOLINK");
             this.q = uod;
             uod.f();
             b.a(b).a(this.t.mPhoto.getPhotoId());
             String photoId1 = this.t.mPhoto.getPhotoId();
             if (!PatchProxy.applyVoidOneRefs(photoId1, null, m.class, "11")) {
                a.Q(photoId1);
             }
          }
       }
    label_0091 :
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, c.class, "9")) {
          return;
       }
       if (this.getActivity() == null) {
          return;
       }
       PhotoDetailParam mPhoto = this.t.mPhoto;
       if (mPhoto != null && mPhoto.getPhotoMeta() != null) {
          if (this.t.mPhoto.getPhotoMeta() != null && (!TextUtils.x(this.t.mPhoto.getPhotoMeta().getMockFeedShareSubBiz()) && !TextUtils.n("PHOTO_PUBLISH_GUIDE", this.t.mPhoto.getPhotoMeta().getMockFeedShareSubBiz()))) {
             b.a(0x7ea62562).a(this.t.mPhoto.getPhotoId());
             return;
          }else {
             c tx = this.x;
             if (tx != null && (!tx.getNasaSlideParam().isFriendPage() || (this.t.mPhoto.getPhotoId()).equals(this.v))) {
                this.S8(this.getActivity());
             }else {
                this.s = new e(this);
             }
          }
       }
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       c ts = this.s;
       if (ts != null) {
          ts.run();
          this.s = null;
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.x = this.s8(NasaBizParam.class);
       this.t = this.q8(PhotoDetailParam.class);
       this.u = this.t8("DETAIL_FRAGMENT");
       return;
    }
}
