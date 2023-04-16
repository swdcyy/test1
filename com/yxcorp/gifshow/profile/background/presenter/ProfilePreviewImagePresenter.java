package com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewImagePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewImagePresenter$mScreenWidth$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewImagePresenter$mControllerListener$2;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import s0d.f;
import java.util.Collection;
import s0d.e;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ac.a;
import com.facebook.drawee.view.DraweeView;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewImagePresenter$mControllerListener$2$a;
import ub.b;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import java.io.File;
import android.net.Uri;
import ib.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import yic.o0;
import ekd.a0;
import java.lang.System;
import android.content.Context;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewImagePresenter$b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.image.fresco.wrapper.a$g;
import com.yxcorp.image.fresco.wrapper.a;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewImagePresenter$c;
import erd.o;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewImagePresenter$d;
import erd.g;
import crd.b;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewImagePresenter$a;
import android.view.View$OnLongClickListener;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class ProfilePreviewImagePresenter extends PresenterV2	// class@001268
{
    public KwaiImageView p;
    public ArrayList q;
    public String r;
    public BaseFragment s;
    public final p t;
    public final p u;

    public void ProfilePreviewImagePresenter(){
       super();
       this.t = s.c(new ProfilePreviewImagePresenter$mScreenWidth$2(this));
       this.u = s.c(new ProfilePreviewImagePresenter$mControllerListener$2(this));
    }
    public static final KwaiImageView P8(ProfilePreviewImagePresenter p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mImageView");
       }
       return p0;
    }
    public void E8(){
       a$a uoa;
       d uod;
       AbstractDraweeController uAbstractDra;
       ProfilePreviewImagePresenter tp;
       if (PatchProxy.applyVoid(null, this, ProfilePreviewImagePresenter.class, "5")) {
          return;
       }
       ProfilePreviewImagePresenter tq = this.q;
       String str = ":ks-features:ft-social:profile";
       if (tq != null) {
          uoa = a.d();
          uoa.b(str);
          uoa.d(ImageSource.ICON);
          uod = Fresco.newDraweeControllerBuilder().r(uoa.a());
          uod.v(f.x().q(tq).w(), false);
          tq = this.p;
          if (tq == null) {
             a.S("mImageView");
          }
          uod.y(tq.getController());
          uod.s(this.S8());
          uAbstractDra = uod.e();
          a.o(uAbstractDra, "Fresco.newDraweeControll¡­istener\)\n        .build\(\)");
          tp = this.p;
          if (tp == null) {
             a.S("mImageView");
          }
          tp.setController(uAbstractDra);
          return;
       }else {
          tq = this.r;
          File uFile = (tq == null || !tq.length())? 1: null;
          if (!uFile) {
             uoa = a.d();
             uoa.b(str);
             uoa.d(ImageSource.ICON);
             uod = Fresco.newDraweeControllerBuilder().r(uoa.a());
             uod.v(f.x().s(c.d(new File(this.r))).w(), false);
             tq = this.p;
             if (tq == null) {
                a.S("mImageView");
             }
             uod.y(tq.getController());
             uod.s(this.S8());
             uAbstractDra = uod.e();
             a.o(uAbstractDra, "Fresco.newDraweeControll¡­tener\)\n          .build\(\)");
             tp = this.p;
             if (tp == null) {
                a.S("mImageView");
             }
             tp.setController(uAbstractDra);
          }
          return;
       }
    }
    public final String R8(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfilePreviewImagePresenter.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return o0.b().getAbsolutePath()+File.separator+a0.c(p0)+System.currentTimeMillis()+".jpg";
    }
    public final ProfilePreviewImagePresenter$mControllerListener$2$a S8(){
       Object obj = PatchProxy.apply(null, this, ProfilePreviewImagePresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.u.getValue();
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, ProfilePreviewImagePresenter.class, "7")) {
          return;
       }
       ProfilePreviewImagePresenter tq = this.q;
       int i = 0;
       if (tq != null) {
          CDNUrl mUrl = tq.get(i).mUrl;
          a.o(mUrl, "this[0].mUrl");
          a.j(this.getContext(), f.x().q(tq).w()[i], this.R8(mUrl), ProfilePreviewImagePresenter$b.a);
          return;
       }else {
          tq = this.r;
          if (tq == null || !tq.length()) {
             i = 1;
          }
          if (!i) {
             this.X7(t.just(this.r).subscribeOn(d.c).map(new ProfilePreviewImagePresenter$c(this)).observeOn(d.a).subscribe(ProfilePreviewImagePresenter$d.b));
          }
          return;
       }
    }
    public void doBindView(View p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfilePreviewImagePresenter.class, "3")) {
          return;
       }
       a.p(p0, "view");
       view = m1.f(p0, R.id.background_image);
       a.o(view, "ViewBindUtils.bindWidget¡­w, R.id.background_image\)");
       this.p = view;
       m1.d(p0, new ProfilePreviewImagePresenter$a(this), R.id.option_view);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ProfilePreviewImagePresenter.class, "4")) {
          return;
       }
       this.q = this.t8("PROFILE_PREVIEW_IMAGE_URLS");
       this.r = this.t8("PROFILE_PREVIEW_IMAGE_LOCAL_PATH");
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(PageAccessIds.FRAGMENT\)");
       this.s = obj;
       return;
    }
}
