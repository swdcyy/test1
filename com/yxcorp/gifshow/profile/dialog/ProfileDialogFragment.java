package com.yxcorp.gifshow.profile.dialog.ProfileDialogFragment;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.BaseDialogFragment;
import com.yxcorp.gifshow.profile.model.ProfileDialogInfo;
import com.kwai.framework.model.user.User;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import ag6.a;
import android.content.DialogInterface;
import com.yxcorp.gifshow.profile.model.ProfileDialogInfo$BgImageInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import androidx.fragment.app.KwaiDialogFragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import lnc.a1;
import java.lang.Boolean;
import com.yxcorp.gifshow.profile.model.ProfileDialogInfo$ButtonInfo;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import com.yxcorp.gifshow.profile.model.ProfileDialogInfo$HeadInfo;
import ekd.j;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.facebook.drawee.generic.RoundingParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.profile.model.ProfileDialogInfo$TitleInfo;
import f3c.i;
import android.view.View$OnClickListener;
import f3c.h;
import java.lang.Integer;
import java.lang.Number;

public class ProfileDialogFragment extends BaseDialogFragment implements d	// class@0012f3
{
    public ProfileDialogInfo A;
    public User B;
    public View C;
    public KwaiImageView p;
    public LottieAnimationView q;
    public ImageView r;
    public View s;
    public KwaiImageView t;
    public TextView u;
    public KwaiImageView v;
    public KwaiImageView w;
    public TextView x;
    public KwaiImageView y;
    public TextView z;
    public static final int D;

    public void ProfileDialogFragment(){
       super();
    }
    public static ProfileDialogFragment uh(ProfileDialogInfo p0,User p1){
       ProfileDialogFragment obj = PatchProxy.applyTwoRefs(p0, p1, null, ProfileDialogFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ProfileDialogFragment();
       obj.A = p0;
       obj.B = p1;
       return obj;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileDialogFragment.class, "3")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0b5b);
       this.q = m1.f(p0, 0x7f0a0b5d);
       this.r = m1.f(p0, 0x7f0a0b6b);
       this.s = m1.f(p0, 0x7f0a0b70);
       this.u = m1.f(p0, 0x7f0a0b64);
       this.t = m1.f(p0, 0x7f0a0b63);
       this.v = m1.f(p0, 0x7f0a0b56);
       this.w = m1.f(p0, 0x7f0a0b84);
       this.x = m1.f(p0, 0x7f0a0b93);
       this.y = m1.f(p0, 0x7f0a0b94);
       this.z = m1.f(p0, 0x7f0a0b91);
       this.C = m1.f(p0, 0x7f0a0b5e);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ProfileDialogFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.c(p0, 0x7f0d11e5, p1, false);
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileDialogFragment.class, "14")) {
          return;
       }
       super.onDismiss(p0);
       ProfileDialogFragment tA = this.A;
       if (tA != null) {
          ProfileDialogInfo mBgImageInfo = tA.mBgImageInfo;
          if (mBgImageInfo != null && !TextUtils.x(mBgImageInfo.mBgLottie)) {
             this.q.f();
          }
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, ProfileDialogFragment.class, "4")) {
          return;
       }
       super.onStart();
       Window window = this.getDialog().getWindow();
       this.setCancelable(false);
       if (window != null) {
          window.setGravity(17);
          window.setBackgroundDrawableResource(0x106000d);
          ProfileDialogInfo mViewWidth = this.A.mViewWidth;
          int i = (mViewWidth != null)? a1.e((float)mViewWidth): a1.e(280.00f);
          window.setLayout(i, -2);
          window.setDimAmount(0.30f);
          this.getDialog().setCanceledOnTouchOutside(false);
          this.getDialog().setCancelable(false);
       }else {
          this.dismissAllowingStateLoss();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       boolean b;
       a$a uoa1;
       ConstraintLayout$LayoutParams layoutParams;
       int i1;
       ProfileDialogInfo$HeadInfo mHeadWidth;
       int i2;
       ProfileDialogInfo$HeadInfo mHeadWidth1;
       float f1;
       ProfileDialogInfo$HeadInfo mHeadHeight;
       int i3;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfileDialogFragment.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       ProfileDialogFragment tA = this.A;
       Object obj = PatchProxy.applyOneRefs(tA, this, ProfileDialogFragment.class, "6");
       String str = 1;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(tA != null){
          ProfileDialogInfo mButtonInfo = tA.mButtonInfo;
          if (mButtonInfo != null && !TextUtils.x(mButtonInfo.mText)) {
             b = true;
          }
       }
       b = false;
       if (!b) {
          this.dismissAllowingStateLoss();
          return;
       }else {
          this.doBindView(p0);
          ProfileDialogInfo mBgImageInfo = this.A.mBgImageInfo;
          int i = 8;
          String str1 = ":ks-features:ft-social:profile";
          if (!PatchProxy.applyVoidOneRefs(mBgImageInfo, this, ProfileDialogFragment.class, "9")) {
             if (!TextUtils.x(mBgImageInfo.mBgImg)) {
                uoa1 = a.d();
                uoa1.b(str1);
                this.p.M(mBgImageInfo.mBgImg, uoa1.a());
                this.vh(this.p, mBgImageInfo);
             }
             if (TextUtils.x(mBgImageInfo.mBgLottie)) {
                this.q.setVisibility(i);
             }else {
                this.q.setVisibility(0);
                this.vh(this.q, mBgImageInfo);
                this.q.setAnimationFromUrl(mBgImageInfo.mBgLottie);
                this.q.s();
             }
          }
          mBgImageInfo = this.A.mHeadInfo;
          if (!PatchProxy.applyVoidOneRefs(mBgImageInfo, this, ProfileDialogFragment.class, "12")) {
             layoutParams = this.C.getLayoutParams();
             if (mBgImageInfo == null || j.h(mBgImageInfo.mHeadUrl)) {
                this.v.setVisibility(i);
                layoutParams.i = 0x7f0a0b5b;
             }else {
                layoutParams.i = 0x7f0a0b56;
                if (mBgImageInfo.mHeadStyle == str) {
                   mHeadWidth1 = mBgImageInfo.mHeadWidth;
                   f1 = 88.00f;
                   i1 = (mHeadWidth1 != null)? a1.e((float)mHeadWidth1): a1.e(f1);
                   mHeadHeight = mBgImageInfo.mHeadHeight;
                   if (mHeadHeight != null) {
                      f1 = (float)mHeadHeight;
                   }
                   i2 = a1.e(f1);
                   i3 = a1.e(98.00f);
                }else {
                   mHeadWidth1 = mBgImageInfo.mHeadWidth;
                   f1 = 72.00f;
                   i1 = (mHeadWidth1 != null)? a1.e((float)mHeadWidth1): a1.e(f1);
                   mHeadHeight = mBgImageInfo.mHeadHeight;
                   if (mHeadHeight != null) {
                      f1 = (float)mHeadHeight;
                   }
                   i2 = a1.e(f1);
                   i3 = a1.e(36.00f);
                }
                if (mBgImageInfo.mHasBorder != null) {
                   i1 = i1 + a1.e(2.00f);
                   i2 = i2 + a1.e(2.00f);
                   a hierarchy = this.v.getHierarchy();
                   RoundingParams roundingPara = RoundingParams.a();
                   roundingPara.l((float)a1.e(2.00f));
                   roundingPara.k(a1.a(R.color.arg_RES_7f061c32));
                   hierarchy.L(roundingPara);
                   this.v.setHierarchy(hierarchy);
                }
                ConstraintLayout$LayoutParams layoutParams1 = this.v.getLayoutParams();
                layoutParams1.width = i1;
                layoutParams1.height = i2;
                layoutParams1.topMargin = i3;
                this.v.setLayoutParams(layoutParams1);
                this.v.setVisibility(0);
                uoa1 = a.d();
                uoa1.b(str1);
                this.v.X(mBgImageInfo.mHeadUrl, uoa1.a());
             }
             this.C.setLayoutParams(layoutParams);
          }
          mBgImageInfo = this.A.mHeadInfo;
          if (!PatchProxy.applyVoidOneRefs(mBgImageInfo, this, ProfileDialogFragment.class, "13")) {
             if (mBgImageInfo == null || j.h(mBgImageInfo.mPendantUrl)) {
                this.w.setVisibility(i);
             }else {
                layoutParams = this.w.getLayoutParams();
                if (mBgImageInfo.mHeadStyle == str) {
                   i1 = a1.e(110.00f);
                   mHeadWidth = mBgImageInfo.mHeadWidth;
                   i2 = (mHeadWidth != null)? this.th(mHeadWidth): i1;
                   layoutParams.width = i2;
                   mHeadWidth = mBgImageInfo.mHeadHeight;
                   if (mHeadWidth != null) {
                      i1 = this.th(mHeadWidth);
                   }
                   layoutParams.height = i1;
                }else {
                   i1 = a1.e(90.00f);
                   mHeadWidth = mBgImageInfo.mHeadWidth;
                   i2 = (mHeadWidth != null)? this.th(mHeadWidth): i1;
                   layoutParams.width = i2;
                   mHeadWidth = mBgImageInfo.mHeadHeight;
                   if (mHeadWidth != null) {
                      i1 = this.th(mHeadWidth);
                   }
                   layoutParams.height = i1;
                }
                this.w.setLayoutParams(layoutParams);
                this.w.setVisibility(0);
                a$a uoa2 = a.d();
                uoa2.b(str1);
                this.w.X(mBgImageInfo.mPendantUrl, uoa2.a());
             }
          }
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, ProfileDialogFragment.class, "11")) {
             mBgImageInfo = this.A.mTitle;
             if (mBgImageInfo == null || TextUtils.x(mBgImageInfo.mText)) {
                this.x.setVisibility(i);
             }else {
                this.x.setVisibility(0);
                this.x.setText(this.A.mTitle.mText);
             }
             mBgImageInfo = this.A.mTitle;
             if (mBgImageInfo == null || TextUtils.x(mBgImageInfo.mIconUrl)) {
                this.y.setVisibility(i);
             }else {
                this.y.setVisibility(0);
                uoa1 = a.d();
                uoa1.b(str1);
                this.y.M(this.A.mTitle.mIconUrl, uoa1.a());
             }
             if (TextUtils.x(this.A.mSubTitle)) {
                this.z.setVisibility(i);
                this.x.setMaxLines(2);
             }else {
                this.z.setVisibility(0);
                this.z.setText(this.A.mSubTitle);
                this.x.setMaxLines(str);
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, ProfileDialogFragment.class, "8")) {
             if (this.A.mCloseType == str) {
                this.r.setImageResource(R.drawable.arg_RES_7f081d73);
             }else {
                this.r.setImageResource(R.drawable.arg_RES_7f081d72);
             }
             this.r.setOnClickListener(new i(this));
          }
          if (!PatchProxy.applyVoid(objArray, this, ProfileDialogFragment.class, "7")) {
             this.s.setOnClickListener(new h(this));
             this.u.setText(this.A.mButtonInfo.mText);
             float f = 24.00f;
             if (TextUtils.x(this.A.mButtonInfo.iconUrl)) {
                this.t.setVisibility(i);
                this.s.setPadding(a1.e(f), 0, a1.e(f), 0);
             }else {
                this.t.setVisibility(0);
                a$a uoa = a.d();
                uoa.b(str1);
                this.t.M(this.A.mButtonInfo.iconUrl, uoa.a());
                this.s.setPadding(a1.e(f), 0, a1.e(f), 0);
             }
          }
          return;
       }
    }
    public final int th(int p0){
       if (PatchProxy.isSupport(ProfileDialogFragment.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ProfileDialogFragment.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return (int)(((float)a1.e((float)p0) * 0x3fa00000) + 0x3f000000);
    }
    public final void vh(View p0,ProfileDialogInfo$BgImageInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfileDialogFragment.class, "10")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       layoutParams.height = a1.e((((float)(this.A.mViewWidth * p1.mImageHeight) * 0x3f800000) / (float)p1.mImageWidth));
       p0.setLayoutParams(layoutParams);
       return;
    }
}
