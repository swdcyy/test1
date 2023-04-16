package com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewSelectImagePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewSelectImagePresenter$mScreenWidth$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewSelectImagePresenter$mControllerListener$2;
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
import com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewSelectImagePresenter$mControllerListener$2$a;
import ub.b;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import z5c.k0;
import vb5.a;
import jd.c;
import s0d.a;
import android.graphics.drawable.ColorDrawable;
import lnc.a1;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;
import java.io.File;
import android.net.Uri;
import ib.c;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import android.view.View;
import z5c.f3;
import android.widget.ImageView;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import yic.o0;
import ekd.a0;
import java.lang.System;
import android.content.Context;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewSelectImagePresenter$f;
import com.yxcorp.image.fresco.wrapper.a$g;
import com.yxcorp.image.fresco.wrapper.a;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewSelectImagePresenter$g;
import erd.o;
import com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewSelectImagePresenter$h;
import erd.g;
import crd.b;
import android.app.Activity;
import com.yxcorp.gifshow.util.PermissionUtils;
import com.kwai.framework.ui.popupmanager.dialog.a;
import com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewSelectImagePresenter$i;
import io.reactivex.internal.functions.Functions;
import mz6.b;
import com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewSelectImagePresenter$j;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;
import ekd.m1;
import android.view.ViewStub;
import com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewSelectImagePresenter$a;
import android.view.View$OnLongClickListener;
import com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewSelectImagePresenter$b;
import com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewSelectImagePresenter$c;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Boolean;
import android.widget.ImageButton;
import com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewSelectImagePresenter$d;
import com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewSelectImagePresenter$e;

public final class ProfilePreviewSelectImagePresenter extends PresenterV2	// class@00128b
{
    public KwaiImageView p;
    public KwaiImageView q;
    public ViewStub r;
    public ViewStub s;
    public BaseFragment t;
    public ArrayList u;
    public String v;
    public boolean w;
    public final p x;
    public final p y;

    public void ProfilePreviewSelectImagePresenter(){
       super();
       this.w = true;
       this.x = s.c(new ProfilePreviewSelectImagePresenter$mScreenWidth$2(this));
       this.y = s.c(new ProfilePreviewSelectImagePresenter$mControllerListener$2(this));
    }
    public static final KwaiImageView P8(ProfilePreviewSelectImagePresenter p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mImageView");
       }
       return p0;
    }
    public void E8(){
       d uod;
       AbstractDraweeController uAbstractDra;
       AbstractDraweeController uAbstractDra1;
       ProfilePreviewSelectImagePresenter tq;
       if (PatchProxy.applyVoid(null, this, ProfilePreviewSelectImagePresenter.class, "5")) {
          return;
       }
       ProfilePreviewSelectImagePresenter tu = this.u;
       String str = ":ks-features:ft-social:profile";
       ProfilePreviewSelectImagePresenter profilePrevi = 1;
       String str1 = "mImageView";
       if (tu != null) {
          a$a uoa = a.d();
          uoa.b(str);
          uoa.d(ImageSource.ICON);
          uod = Fresco.newDraweeControllerBuilder().r(uoa.a());
          uod.v(f.x().q(tu).w(), false);
          ProfilePreviewSelectImagePresenter tp = this.p;
          if (tp == null) {
             a.S(str1);
          }
          uod.y(tp.getController());
          uod.s(this.S8());
          uAbstractDra = uod.e();
          a.o(uAbstractDra, "Fresco.newDraweeControll¡­istener\)\n        .build\(\)");
          tp = this.p;
          if (tp == null) {
             a.S(str1);
          }
          tp.setController(uAbstractDra);
          if (!k0.u()) {
             e[] uoeArray = f.x().q(tu).l(new a(150)).w();
             if (uoeArray != null) {
                uod = (!uoeArray.length)? 1: null;
                if (!uod) {
                   profilePrevi = null;
                }
             }
             if (profilePrevi) {
                return;
             }else {
                uod = Fresco.newDraweeControllerBuilder();
                profilePrevi = this.q;
                if (profilePrevi == null) {
                   a.S("mImageBgView");
                }
                uod.y(profilePrevi.getController());
                uod.u(uoeArray);
                uAbstractDra1 = uod.e();
                a.o(uAbstractDra1, "Fresco.newDraweeControll¡­uests\)\n          .build\(\)");
                tq = this.q;
                if (tq == null) {
                   a.S("mImageBgView");
                }
                tq.setForegroundDrawable(new ColorDrawable(a1.a(R.color.arg_RES_7f061c10)));
                tq = this.q;
                if (tq == null) {
                   a.S("mImageBgView");
                }
                tq.setController(uAbstractDra1);
             }
          }
          return;
       }else {
          tu = this.v;
          if (tu != null && tu.length()) {
             profilePrevi = null;
          }
          if (profilePrevi == null) {
             File uFile = new File(this.v);
             a$a uoa1 = a.d();
             uoa1.b(str);
             uoa1.d(ImageSource.ICON);
             uod = Fresco.newDraweeControllerBuilder().r(uoa1.a());
             uod.v(f.x().s(c.d(uFile)).w(), false);
             profilePrevi = this.p;
             if (profilePrevi == null) {
                a.S(str1);
             }
             uod.y(profilePrevi.getController());
             uod.s(this.S8());
             uAbstractDra = uod.e();
             a.o(uAbstractDra, "Fresco.newDraweeControll¡­tener\)\n          .build\(\)");
             profilePrevi = this.p;
             if (profilePrevi == null) {
                a.S(str1);
             }
             profilePrevi.setController(uAbstractDra);
             if (!k0.u()) {
                ImageRequestBuilder imageRequest = ImageRequestBuilder.k(c.d(uFile));
                imageRequest.r(new a(100));
                ImageRequest imageRequest1 = imageRequest.a();
                uod = Fresco.newDraweeControllerBuilder();
                profilePrevi = this.q;
                if (profilePrevi == null) {
                   a.S("mImageBgView");
                }
                uod.y(profilePrevi.getController());
                uod.w(imageRequest1);
                uAbstractDra1 = uod.e();
                a.o(uAbstractDra1, "Fresco.newDraweeControll¡­sts\)\n            .build\(\)");
                tq = this.q;
                if (tq == null) {
                   a.S("mImageBgView");
                }
                tq.setController(uAbstractDra1);
             }
          }else {
             tu = this.r;
             if (tu == null) {
                a.S("mEmptyBgViewStub");
             }
             f3.a(tu);
             tu = this.p;
             if (tu == null) {
                a.S(str1);
             }
             tu.setVisibility(8);
          }
          return;
       }
    }
    public final String R8(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfilePreviewSelectImagePresenter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return o0.b().getAbsolutePath()+File.separator+a0.c(p0)+System.currentTimeMillis()+".jpg";
    }
    public final ProfilePreviewSelectImagePresenter$mControllerListener$2$a S8(){
       Object obj = PatchProxy.apply(null, this, ProfilePreviewSelectImagePresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.y.getValue();
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, ProfilePreviewSelectImagePresenter.class, "8")) {
          return;
       }
       ProfilePreviewSelectImagePresenter tu = this.u;
       int i = 0;
       if (tu != null) {
          CDNUrl mUrl = tu.get(i).mUrl;
          a.o(mUrl, "this[0].mUrl");
          a.j(this.getContext(), f.x().q(tu).w()[i], this.R8(mUrl), ProfilePreviewSelectImagePresenter$f.a);
          return;
       }else {
          tu = this.v;
          if (tu == null || !tu.length()) {
             i = 1;
          }
          if (!i) {
             this.X7(t.just(this.v).subscribeOn(d.c).map(new ProfilePreviewSelectImagePresenter$g(this)).observeOn(d.a).subscribe(ProfilePreviewSelectImagePresenter$h.b));
          }
          return;
       }
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, ProfilePreviewSelectImagePresenter.class, "7")) {
          return;
       }
       String str = "android.permission.WRITE_EXTERNAL_STORAGE";
       if (PermissionUtils.a(this.getActivity(), str)) {
          this.V8();
       }else {
          String[] stringArray = new String[]{str};
          this.X7(a.k(this.getActivity(), stringArray).subscribe(new ProfilePreviewSelectImagePresenter$i(this), Functions.d()));
       }
       return;
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, ProfilePreviewSelectImagePresenter.class, "6")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity != null) {
          a.o(activity, "activity ?: return");
          b uob = new b(activity);
          uob.e(true);
          int[] ointArray = new int[true];
          ointArray[0] = 0x7f1043c7;
          uob.j(ointArray);
          uob.h(true);
          uob.l(new ProfilePreviewSelectImagePresenter$j(this));
          uob.q();
       }
       return;
    }
    public void doBindView(View p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfilePreviewSelectImagePresenter.class, "3")) {
          return;
       }
       a.p(p0, "view");
       int i = 0x7f0a03a1;
       view = m1.f(p0, i);
       a.o(view, "ViewBindUtils.bindWidget¡­w, R.id.background_image\)");
       this.p = view;
       view = m1.f(p0, R.id.empty_bg_tip);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.empty_bg_tip\)");
       this.r = view;
       m1.d(p0, new ProfilePreviewSelectImagePresenter$a(this), i);
       m1.d(p0, new ProfilePreviewSelectImagePresenter$b(this), R.id.photo_preview_bg);
       if (k0.u()) {
          ProfilePreviewSelectImagePresenter$c uoc = new ProfilePreviewSelectImagePresenter$c(this);
          m1.b(p0, uoc, R.id.title_root);
          m1.b(p0, uoc, i);
          m1.b(p0, uoc, R.id.photo_preview_bg);
       }
       p0 = m1.f(p0, R.id.photo_preview_bg);
       a.o(p0, "ViewBindUtils.bindWidget¡­w, R.id.photo_preview_bg\)");
       this.q = p0;
       return;
    }
    public void j8(){
       View view;
       if (PatchProxy.applyVoid(null, this, ProfilePreviewSelectImagePresenter.class, "4")) {
          return;
       }
       this.u = this.t8("PROFILE_PREVIEW_IMAGE_URLS");
       this.v = this.t8("PROFILE_PREVIEW_IMAGE_LOCAL_PATH");
       Boolean obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(PageAccessIds.FRAGMENT\)");
       this.t = obj;
       obj = this.t8("PROFILE_PREVIEW_IS_MINE");
       if (obj != null) {
          boolean b = obj.booleanValue();
          this.w = b;
          if (b) {
             view = m1.f(this.m8(), R.id.more_btn);
             a.o(view, "ViewBindUtils.bindWidget¡­\(rootView, R.id.more_btn\)");
             view.setVisibility(0);
             m1.b(this.m8(), new ProfilePreviewSelectImagePresenter$d(this), R.id.more_btn);
          }else {
             view = m1.f(this.m8(), R.id.save_background_layout);
             a.o(view, "ViewBindUtils.bindWidget¡­d.save_background_layout\)");
             this.s = view;
             if (view == null) {
                a.S("mSaveBgViewStub");
             }
             f3.a(view);
             m1.b(this.m8(), new ProfilePreviewSelectImagePresenter$e(this), R.id.save_background_layout);
          }
       }
       return;
    }
}
