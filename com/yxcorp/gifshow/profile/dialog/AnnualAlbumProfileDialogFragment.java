package com.yxcorp.gifshow.profile.dialog.AnnualAlbumProfileDialogFragment;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.BaseDialogFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import ag6.a;
import android.content.DialogInterface;
import androidx.fragment.app.KwaiDialogFragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import com.yxcorp.gifshow.profile.model.ProfileDialogInfo;
import lnc.a1;
import java.lang.Boolean;
import c16.c;
import com.yxcorp.gifshow.profile.model.ProfileDialogInfo$BgImageInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.profile.model.ProfileDialogInfo$HeadInfo;
import ekd.j;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.gifshow.model.CDNUrl;
import f3c.b;
import android.view.View$OnClickListener;
import f3c.a;
import com.yxcorp.gifshow.profile.model.ProfileDialogInfo$ButtonInfo;

public class AnnualAlbumProfileDialogFragment extends BaseDialogFragment implements d	// class@0012eb
{
    public KwaiImageView p;
    public ImageView q;
    public View r;
    public KwaiImageView s;
    public TextView t;
    public ProfileDialogInfo u;
    public User v;
    public KwaiImageView w;
    public View x;
    public static final int y;

    public void AnnualAlbumProfileDialogFragment(){
       super();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AnnualAlbumProfileDialogFragment.class, "3")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0b5b);
       this.q = m1.f(p0, 0x7f0a0b6b);
       this.r = m1.f(p0, 0x7f0a0b70);
       this.t = m1.f(p0, 0x7f0a0b64);
       this.s = m1.f(p0, 0x7f0a0b63);
       this.w = m1.f(p0, 0x7f0a0b56);
       this.x = m1.f(p0, 0x7f0a0b57);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, AnnualAlbumProfileDialogFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.c(p0, 0x7f0d11e6, p1, false);
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AnnualAlbumProfileDialogFragment.class, "12")) {
          return;
       }
       super.onDismiss(p0);
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, AnnualAlbumProfileDialogFragment.class, "4")) {
          return;
       }
       super.onStart();
       Window window = this.getDialog().getWindow();
       this.setCancelable(false);
       if (window != null) {
          window.setGravity(17);
          window.setBackgroundDrawableResource(0x106000d);
          ProfileDialogInfo mViewWidth = this.u.mViewWidth;
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
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AnnualAlbumProfileDialogFragment.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       Object[] objArray = null;
       p1 = PatchProxy.apply(objArray, this, AnnualAlbumProfileDialogFragment.class, "13");
       if (p1 != patchProxyRe) {
          b = p1.booleanValue();
       }else {
          String str1 = 1;
          b = (this.th(this.u) && this.u.mSubBizId == str1)? true: false;
       }
       if (b) {
          b = PatchProxy.apply(objArray, this, AnnualAlbumProfileDialogFragment.class, "14");
          b = (b != patchProxyRe)? b.booleanValue(): c.d();
          if (b) {
             this.doBindView(p0);
             ProfileDialogInfo mBgImageInfo = this.u.mBgImageInfo;
             String str = ":ks-features:ft-social:profile";
             if (!PatchProxy.applyVoidOneRefs(mBgImageInfo, this, AnnualAlbumProfileDialogFragment.class, "9") && !TextUtils.x(mBgImageInfo.mBgImg)) {
                uoa1 = a.d();
                uoa1.b(str);
                this.p.M(mBgImageInfo.mBgImg, uoa1.a());
                AnnualAlbumProfileDialogFragment tp = this.p;
                if (!PatchProxy.applyVoidTwoRefs(tp, mBgImageInfo, this, AnnualAlbumProfileDialogFragment.class, "11")) {
                   ViewGroup$LayoutParams layoutParams2 = tp.getLayoutParams();
                   layoutParams2.height = a1.e((((float)(this.u.mViewWidth * mBgImageInfo.mImageHeight) * 0x3f800000) / (float)mBgImageInfo.mImageWidth));
                   tp.setLayoutParams(layoutParams2);
                }
             }
             mBgImageInfo = this.u.mHeadInfo;
             if (!PatchProxy.applyVoidOneRefs(mBgImageInfo, this, AnnualAlbumProfileDialogFragment.class, "10")) {
                if (mBgImageInfo == null || j.h(mBgImageInfo.mHeadUrl)) {
                   this.w.setVisibility(8);
                   this.x.setVisibility(8);
                }else {
                   ProfileDialogInfo$HeadInfo mHeadWidth = mBgImageInfo.mHeadWidth;
                   float f = (mHeadWidth != null)? (float)mHeadWidth: 134.00f;
                   b = a1.e(f);
                   ProfileDialogInfo$HeadInfo mHeadHeight = mBgImageInfo.mHeadHeight;
                   float f1 = (mHeadHeight != null)? (float)mHeadHeight: 174.00f;
                   int i = a1.e(f1);
                   ConstraintLayout$LayoutParams layoutParams = this.w.getLayoutParams();
                   ConstraintLayout$LayoutParams layoutParams1 = this.x.getLayoutParams();
                   layoutParams1.width = b;
                   layoutParams1.height = i;
                   layoutParams.width = b - a1.e(4.00f);
                   layoutParams.height = i - a1.e(4.00f);
                   this.w.setLayoutParams(layoutParams);
                   this.x.setLayoutParams(layoutParams1);
                   this.w.setVisibility(0);
                   this.x.setVisibility(0);
                   uoa1 = a.d();
                   uoa1.b(str);
                   this.w.X(mBgImageInfo.mHeadUrl, uoa1.a());
                }
             }
             if (!PatchProxy.applyVoid(objArray, this, AnnualAlbumProfileDialogFragment.class, "8")) {
                this.q.setOnClickListener(new b(this));
             }
             if (!PatchProxy.applyVoid(objArray, this, AnnualAlbumProfileDialogFragment.class, "7")) {
                this.r.setOnClickListener(new a(this));
                this.t.setText(this.u.mButtonInfo.mText);
                if (TextUtils.x(this.u.mButtonInfo.iconUrl)) {
                   this.s.setVisibility(8);
                }else {
                   this.s.setVisibility(0);
                   a$a uoa = a.d();
                   uoa.b(str);
                   this.s.M(this.u.mButtonInfo.iconUrl, uoa.a());
                }
                this.r.setPadding(a1.e(24.00f), 0, a1.e(24.00f), 0);
             }
             return;
          }
       }
       this.dismissAllowingStateLoss();
       return;
    }
    public boolean th(ProfileDialogInfo p0){
       boolean b;
       ProfileDialogInfo obj = PatchProxy.applyOneRefs(p0, this, AnnualAlbumProfileDialogFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          obj = p0.mButtonInfo;
          if (obj != null && (!TextUtils.x(obj.mText) && !TextUtils.x(p0.mButtonInfo.mActionUrl))) {
             b = true;
          label_002e :
             return b;
          }
       }
       b = false;
       goto label_002e ;
    }
}
