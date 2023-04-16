package com.yxcorp.gifshow.profile.dialog.ProfileBottomDialogFragment;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.BaseDialogFragment;
import com.yxcorp.gifshow.profile.model.ProfileDialogInfo;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import ekd.m1;
import android.widget.ImageView;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import f3c.c;
import android.view.View$OnClickListener;
import f3c.d;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import ag6.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.view.Window;
import android.app.Activity;
import lnc.i5;
import androidx.fragment.app.KwaiDialogFragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.WindowManager$LayoutParams;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.lang.Boolean;
import com.yxcorp.gifshow.profile.model.ProfileDialogInfo$ButtonInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.profile.model.ProfileDialogInfo$TitleInfo;
import lnc.a1;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.profile.model.ProfileDialogInfo$BgImageInfo;
import com.yxcorp.image.callercontext.ImageSource;
import com.yxcorp.gifshow.profile.model.ProfileDialogInfo$HeadInfo;
import ekd.j;
import com.yxcorp.gifshow.model.CDNUrl;

public class ProfileBottomDialogFragment extends BaseDialogFragment implements d	// class@0012ec
{
    public ImageView p;
    public TextView q;
    public TextView r;
    public View s;
    public TextView t;
    public KwaiImageView u;
    public KwaiImageView v;
    public KwaiImageView w;
    public ProfileDialogInfo x;
    public User y;
    public int z;
    public static final int A;

    public void ProfileBottomDialogFragment(){
       super();
       this.z = 1;
    }
    public static ProfileBottomDialogFragment th(ProfileDialogInfo p0,User p1,int p2){
       ProfileBottomDialogFragment obj;
       if (PatchProxy.isSupport(ProfileBottomDialogFragment.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, ProfileBottomDialogFragment.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ProfileBottomDialogFragment();
       obj.x = p0;
       obj.y = p1;
       obj.z = p2;
       return obj;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileBottomDialogFragment.class, "3")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0b6b);
       this.q = m1.f(p0, 0x7f0a0b93);
       this.r = m1.f(p0, 0x7f0a0b91);
       this.s = m1.f(p0, 0x7f0a0b70);
       this.u = m1.f(p0, 0x7f0a0b56);
       if (this.z == 3) {
          this.t = this.s;
       }else {
          this.t = m1.f(p0, 0x7f0a0b64);
          this.v = m1.f(p0, 0x7f0a0b63);
          this.w = m1.f(p0, 0x7f0a0b84);
       }
       this.p.setOnClickListener(new c(this));
       this.s.setOnClickListener(new d(this));
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ProfileBottomDialogFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       int i = (this.z == 3)? 0x7f0d11e7: 0x7f0d11ea;
       return a.c(p0, i, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, ProfileBottomDialogFragment.class, "14")) {
          return;
       }
       if (this.getActivity() != null) {
          i5.j(this.getActivity().getWindow(), -1);
       }
       super.onDestroyView();
       return;
    }
    public void onStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ProfileBottomDialogFragment.class, "4")) {
          return;
       }
       super.onStart();
       boolean b = false;
       this.setCancelable(b);
       if (this.getDialog().getWindow() != null) {
          if (!PatchProxy.applyVoid(objArray, this, ProfileBottomDialogFragment.class, "13")) {
             Dialog dialog = this.getDialog();
             if (dialog != null && this.getActivity() != null) {
                Window window = dialog.getWindow();
                if (window != null) {
                   WindowManager$LayoutParams attributes = window.getAttributes();
                   window.setBackgroundDrawable(new ColorDrawable(b));
                   attributes.gravity = 80;
                   attributes.width = -1;
                   attributes.height = -2;
                   window.setAttributes(attributes);
                   window.setWindowAnimations(R.style.arg_RES_7f1103bf);
                   window.setDimAmount(0.30f);
                   i5.j(this.getActivity().getWindow(), 0xff000000);
                }
             }
          }
       }else {
          this.dismissAllowingStateLoss();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       boolean b;
       ProfileDialogInfo mBgImageInfo;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfileBottomDialogFragment.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       ProfileBottomDialogFragment tx = this.x;
       String obj = PatchProxy.applyOneRefs(tx, this, ProfileBottomDialogFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(tx != null){
          ProfileDialogInfo mButtonInfo = tx.mButtonInfo;
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
          Object[] objArray = null;
          obj = 8;
          if (!PatchProxy.applyVoid(objArray, this, ProfileBottomDialogFragment.class, "10")) {
             mBgImageInfo = this.x.mTitle;
             if (mBgImageInfo == null || TextUtils.x(mBgImageInfo.mText)) {
                this.q.setVisibility(obj);
             }else {
                this.q.setVisibility(0);
                this.q.setText(this.x.mTitle.mText);
             }
             if (TextUtils.x(this.x.mSubTitle)) {
                this.r.setVisibility(obj);
                this.q.setMaxLines(2);
             }else {
                this.r.setVisibility(0);
                this.r.setText(this.x.mSubTitle);
                this.q.setMaxLines(1);
             }
          }
          ImageSource imageSource = 3;
          if (!PatchProxy.applyVoid(objArray, this, ProfileBottomDialogFragment.class, "8")) {
             this.t.setText(this.x.mButtonInfo.mText);
             if (this.z != imageSource) {
                float f = 24.00f;
                if (TextUtils.x(this.x.mButtonInfo.iconUrl)) {
                   this.v.setVisibility(obj);
                   this.s.setPadding(a1.e(f), 0, a1.e(f), 0);
                }else {
                   this.v.setVisibility(0);
                   a$a uoa3 = a.d();
                   uoa3.b(":ks-features:ft-social:profile");
                   this.v.M(this.x.mButtonInfo.iconUrl, uoa3.a());
                   this.s.setPadding(a1.e(f), 0, a1.e(f), 0);
                }
             }
          }
          if (this.z == imageSource) {
             mBgImageInfo = this.x.mBgImageInfo;
             if (!PatchProxy.applyVoidOneRefs(mBgImageInfo, this, ProfileBottomDialogFragment.class, "6") && (mBgImageInfo != null && !TextUtils.x(mBgImageInfo.mBgImg))) {
                a$a uoa = a.d();
                uoa.b(":ks-features:ft-social:profile");
                uoa.d(ImageSource.ICON);
                this.u.M(mBgImageInfo.mBgImg, uoa.a());
             }
          }else {
             mBgImageInfo = this.x.mHeadInfo;
             if (!PatchProxy.applyVoidOneRefs(mBgImageInfo, this, ProfileBottomDialogFragment.class, "11")) {
                if (mBgImageInfo == null || j.h(mBgImageInfo.mHeadUrl)) {
                   this.u.setVisibility(obj);
                }else {
                   this.u.setVisibility(0);
                   a$a uoa2 = a.d();
                   uoa2.b(":ks-features:ft-social:profile");
                   this.u.X(mBgImageInfo.mHeadUrl, uoa2.a());
                }
             }
             mBgImageInfo = this.x.mHeadInfo;
             if (!PatchProxy.applyVoidOneRefs(mBgImageInfo, this, ProfileBottomDialogFragment.class, "12")) {
                if (mBgImageInfo == null || j.h(mBgImageInfo.mPendantUrl)) {
                   this.w.setVisibility(obj);
                }else {
                   this.w.setVisibility(0);
                   a$a uoa1 = a.d();
                   uoa1.b(":ks-features:ft-social:profile");
                   this.w.X(mBgImageInfo.mPendantUrl, uoa1.a());
                }
             }
             if (!PatchProxy.applyVoid(objArray, this, ProfileBottomDialogFragment.class, "9")) {
                if (this.x.mCloseType == 1) {
                   this.p.setImageResource(R.drawable.arg_RES_7f081d73);
                }else {
                   this.p.setImageResource(R.drawable.arg_RES_7f081d72);
                }
             }
          }
       label_01c8 :
          return;
       }
    }
}
