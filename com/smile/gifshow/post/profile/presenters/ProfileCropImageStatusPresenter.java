package com.smile.gifshow.post.profile.presenters.ProfileCropImageStatusPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.smile.gifshow.post.profile.presenters.ProfileCropImageStatusPresenter$a;
import nsd.u;
import com.smile.gifshow.post.profile.presenters.ProfileCropImageStatusPresenter$mShowPreviewRunnable$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.smile.gifshow.post.profile.presenters.ProfileCropImageStatusPresenter$mStartPreviewAnimation$2;
import com.smile.gifshow.post.profile.presenters.ProfileCropImageStatusPresenter$mStartMovingAnimation$2;
import com.smile.gifshow.post.profile.presenters.ProfileCropImageStatusPresenter$mBgPreviewAnimatio$2;
import com.smile.gifshow.post.profile.presenters.ProfileCropImageStatusPresenter$mBgMoveAnimatio$2;
import com.smile.gifshow.post.profile.presenters.ProfileCropImageStatusPresenter$mBcPreviewAnimatio$2;
import com.smile.gifshow.post.profile.presenters.ProfileCropImageStatusPresenter$mBcMoveAnimatio$2;
import com.smile.gifshow.post.profile.presenters.ProfileCropImageStatusPresenter$mAvatarWhiteBorderPreviewAnimator$2;
import com.smile.gifshow.post.profile.presenters.ProfileCropImageStatusPresenter$mAvatarWhiteBorderMoveAnimator$2;
import com.smile.gifshow.post.profile.AvatarCropBorderView;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.View;
import com.albinmathew.photocrop.cropoverlay.CropOverlayView;
import ym8.f;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$ImageSelectType;
import android.widget.TextView;
import android.view.ViewGroup;
import android.app.Activity;
import android.view.ViewTreeObserver;
import com.smile.gifshow.post.profile.presenters.ProfileCropImageStatusPresenter$c;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import xm8.d;
import java.lang.Object;
import q87.c;
import java.lang.Throwable;
import lnc.i1;
import java.lang.Runnable;
import ekd.k1;
import com.smile.gifshow.post.profile.presenters.ProfileCropImageStatusPresenter$d;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.CheckBox;
import xm8.g;
import java.util.Objects;
import k2b.e0;
import k2b.f3;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.Context;
import com.yxcorp.utility.n;
import android.animation.ObjectAnimator;
import ekd.m1;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.image.KwaiZoomImageView;
import com.smile.gifshow.post.profile.presenters.ProfileCropImageStatusPresenter$b;
import android.view.View$OnTouchListener;
import java.lang.Boolean;
import java.lang.Class;

public final class ProfileCropImageStatusPresenter extends PresenterV2	// class@000c6f
{
    public View A;
    public View B;
    public View C;
    public boolean D;
    public boolean E;
    public boolean F;
    public final p G;
    public final p H;
    public final p I;
    public final p J;
    public final p K;
    public final p L;
    public final p M;
    public final p N;
    public final p O;
    public View p;
    public f q;
    public CropOverlayView r;
    public AvatarCropBorderView s;
    public ConstraintLayout t;
    public TextView u;
    public TextView v;
    public FrameLayout w;
    public TextView x;
    public CheckBox y;
    public KwaiZoomImageView z;
    public static final ProfileCropImageStatusPresenter$a P;

    static {
       ProfileCropImageStatusPresenter.P = new ProfileCropImageStatusPresenter$a(null);
    }
    public void ProfileCropImageStatusPresenter(){
       super();
       this.F = true;
       this.G = s.c(new ProfileCropImageStatusPresenter$mShowPreviewRunnable$2(this));
       this.H = s.c(new ProfileCropImageStatusPresenter$mStartPreviewAnimation$2(this));
       this.I = s.c(new ProfileCropImageStatusPresenter$mStartMovingAnimation$2(this));
       this.J = s.c(new ProfileCropImageStatusPresenter$mBgPreviewAnimatio$2(this));
       this.K = s.c(new ProfileCropImageStatusPresenter$mBgMoveAnimatio$2(this));
       this.L = s.c(new ProfileCropImageStatusPresenter$mBcPreviewAnimatio$2(this));
       this.M = s.c(new ProfileCropImageStatusPresenter$mBcMoveAnimatio$2(this));
       this.N = s.c(new ProfileCropImageStatusPresenter$mAvatarWhiteBorderPreviewAnimator$2(this));
       this.O = s.c(new ProfileCropImageStatusPresenter$mAvatarWhiteBorderMoveAnimator$2(this));
    }
    public static final AvatarCropBorderView P8(ProfileCropImageStatusPresenter p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("mAvatarCropBorderView");
       }
       return p0;
    }
    public static final ConstraintLayout R8(ProfileCropImageStatusPresenter p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("mBgPreviewBottomView");
       }
       return p0;
    }
    public static final View S8(ProfileCropImageStatusPresenter p0){
       p0 = p0.B;
       if (p0 == null) {
          a.S("mBlackCover");
       }
       return p0;
    }
    public static final CropOverlayView V8(ProfileCropImageStatusPresenter p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("mCropOverlayView");
       }
       return p0;
    }
    public void E8(){
       g a;
       Activity activity;
       ProfileCropImageStatusPresenter ty;
       f3 uof3;
       Activity activity1;
       Activity activity2;
       ProfileCropImageStatusPresenter tp;
       ViewGroup$LayoutParams layoutParams;
       ProfileCropImageStatusPresenter tq = this.q;
       String str = "mDelegate";
       if (tq == null) {
          a.S(str);
       }
       boolean b = true;
       int i = 0;
       boolean b1 = (tq.z() == ImageSelectSupplier$ImageSelectType.BACKGROUND.getValue())? true: false;
       this.D = b1;
       tq = this.q;
       if (tq == null) {
          a.S(str);
       }
       if (tq.z() != ImageSelectSupplier$ImageSelectType.MIYOU.getValue()) {
          b = false;
       }
       this.E = b;
       this.e9();
       tq = this.v;
       if (tq == null) {
          a.S("mTvMoveHint");
       }
       tq.setVisibility(i);
       tq = this.r;
       str = "mCropOverlayView";
       if (tq == null) {
          a.S(str);
       }
       tq.setAlpha(0.30f);
       tq = this.t;
       String str1 = "mBgPreviewBottomView";
       if (tq == null) {
          a.S(str1);
       }
       tq.setVisibility(i);
       tq = this.t;
       if (tq == null) {
          a.S(str1);
       }
       float f = 0;
       tq.setAlpha(f);
       tq = this.B;
       String str2 = "mBlackCover";
       if (tq == null) {
          a.S(str2);
       }
       tq.setVisibility(i);
       tq = this.B;
       if (tq == null) {
          a.S(str2);
       }
       tq.setAlpha(f);
       if (this.D != null) {
          try{
             if (this.getActivity() != null) {
                tq = this.r;
                if (tq == null) {
                   a.S(str);
                }
                tq.getViewTreeObserver().addOnGlobalLayoutListener(new ProfileCropImageStatusPresenter$c(this));
             }else {
                Object[] objArray = new Object[i];
                d.D().A("ProfileCropImageStatusPresenter", "ProfileUpdatePostImageCropActivity is null", objArray);
             }
          }catch(java.lang.Exception e0){
             i1.c(e0);
          }
       }else {
          k1.r(this.c9(), 1000);
       }
    }
    public void J8(){
       k1.m(this.c9());
    }
    public final ObjectAnimator W8(){
       return this.O.getValue();
    }
    public final ObjectAnimator X8(){
       return this.N.getValue();
    }
    public final ObjectAnimator Y8(){
       return this.M.getValue();
    }
    public final ObjectAnimator Z8(){
       return this.L.getValue();
    }
    public final ObjectAnimator a9(){
       return this.K.getValue();
    }
    public final ObjectAnimator b9(){
       return this.J.getValue();
    }
    public final Runnable c9(){
       return this.G.getValue();
    }
    public final boolean d9(){
       ProfileCropImageStatusPresenter tq = this.q;
       if (tq == null) {
          a.S("mDelegate");
       }
       boolean b = (tq.z() == ImageSelectSupplier$ImageSelectType.AVATAR.getValue())? true: false;
       return b;
    }
    public void doBindView(View p0){
       View view = m1.f(p0, R.id.title_root);
       a.o(view, "bindWidget\(rootView, R.id.title_root\)");
       this.p = view;
       view = m1.f(p0, R.id.crop_overlay);
       a.o(view, "bindWidget\(rootView, R.id.crop_overlay\)");
       this.r = view;
       view = m1.f(p0, R.id.avatar_crop_overlay);
       a.o(view, "bindWidget\(rootView, R.id.avatar_crop_overlay\)");
       this.s = view;
       view = m1.f(p0, R.id.preview_bottom);
       a.o(view, "bindWidget\(rootView, R.id.preview_bottom\)");
       this.t = view;
       view = m1.f(p0, R.id.title_tv);
       a.o(view, "bindWidget\(rootView, R.id.title_tv\)");
       this.u = view;
       view = m1.f(p0, R.id.tv_move_hint);
       a.o(view, "bindWidget\(rootView, R.id.tv_move_hint\)");
       this.v = view;
       view = m1.f(p0, R.id.post_hint_layout);
       a.o(view, "bindWidget\(rootView, R.id.post_hint_layout\)");
       this.w = view;
       view = m1.f(p0, R.id.btn_upload);
       a.o(view, "bindWidget\(rootView, R.id.btn_upload\)");
       this.x = view;
       view = m1.f(p0, R.id.cb_enable_post);
       a.o(view, "bindWidget\(rootView, R.id.cb_enable_post\)");
       this.y = view;
       view = m1.f(p0, R.id.image_editor);
       a.o(view, "bindWidget\(rootView, R.id.image_editor\)");
       this.z = view;
       view = m1.f(p0, R.id.crop_rect);
       a.o(view, "bindWidget\(rootView, R.id.crop_rect\)");
       this.A = view;
       view = m1.f(p0, R.id.black_cover);
       a.o(view, "bindWidget\(rootView, R.id.black_cover\)");
       this.B = view;
       p0 = m1.f(p0, R.id.jump_yitian_edit_container);
       a.o(p0, "bindWidget\(rootView, R.i¡­mp_yitian_edit_container\)");
       this.C = p0;
       ProfileCropImageStatusPresenter tz = this.z;
       if (tz == null) {
          a.S("mImageView");
       }
       tz.setOnTouchListener(new ProfileCropImageStatusPresenter$b(this));
       return;
    }
    public final void e9(){
       this.F = true;
       ProfileCropImageStatusPresenter tv = this.v;
       if (tv == null) {
          a.S("mTvMoveHint");
       }
       int i = 0;
       tv.setVisibility(i);
       tv = this.w;
       if (tv == null) {
          a.S("mPostHintLayout");
       }
       tv.setVisibility(8);
       tv = this.x;
       if (tv == null) {
          a.S("mBtnUpload");
       }
       tv.setVisibility(8);
       if (this.D != null || this.E != null) {
          tv = this.A;
          if (tv == null) {
             a.S("mCropRect");
          }
          tv.setVisibility(i);
       }
       tv = this.C;
       if (tv == null) {
          a.S("mYiTianWrapper");
       }
       tv.setVisibility(8);
       tv = this.s;
       if (tv == null) {
          a.S("mAvatarCropBorderView");
       }
       if (!this.d9()) {
          i = 8;
       }
       tv.setVisibility(i);
       return;
    }
    public final void h9(){
       this.F = false;
       ProfileCropImageStatusPresenter tv = this.v;
       if (tv == null) {
          a.S("mTvMoveHint");
       }
       int i = 8;
       tv.setVisibility(i);
       tv = this.q;
       if (tv == null) {
          a.S("mDelegate");
       }
       if (tv.g()) {
          tv = this.w;
          if (tv == null) {
             a.S("mPostHintLayout");
          }
          tv.setVisibility(false);
       }
       tv = this.x;
       if (tv == null) {
          a.S("mBtnUpload");
       }
       tv.setVisibility(false);
       tv = this.A;
       if (tv == null) {
          a.S("mCropRect");
       }
       tv.setVisibility(i);
       tv = this.C;
       if (tv == null) {
          a.S("mYiTianWrapper");
       }
       if (a.g(tv.getTag(), Boolean.TRUE)) {
          tv = this.C;
          if (tv == null) {
             a.S("mYiTianWrapper");
          }
          tv.setVisibility(false);
       }
       return;
    }
    public void j8(){
       Object obj = this.q8(f.class);
       a.o(obj, "inject\(ProfilePostDelegate::class.java\)");
       this.q = obj;
    }
}
