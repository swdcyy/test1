package com.yxcorp.gifshow.profile.dialog.ProfileBottomDialogSwitchTwoButtonFragment;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.BaseDialogFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import android.widget.ImageView;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.profile.dialog.ProfileBottomDialogSwitchTwoButtonFragment$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.profile.dialog.ProfileBottomDialogSwitchTwoButtonFragment$b;
import com.yxcorp.gifshow.profile.dialog.ProfileBottomDialogSwitchTwoButtonFragment$c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
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
import com.yxcorp.gifshow.profile.model.ProfileDialogInfo;
import com.yxcorp.gifshow.profile.model.ProfileDialogInfo$SwitchInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.profile.model.ProfileDialogInfo$TitleInfo;
import lnc.a1;
import com.yxcorp.gifshow.profile.model.ProfileDialogInfo$HeadInfo;
import ekd.j;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.profile.util.f;
import erd.g;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.profile.dialog.a;

public class ProfileBottomDialogSwitchTwoButtonFragment extends BaseDialogFragment implements d	// class@0012f0
{
    public ImageView p;
    public TextView q;
    public TextView r;
    public TextView s;
    public TextView t;
    public KwaiImageView u;
    public b v;
    public ProfileDialogInfo w;
    public User x;
    public static final int y;

    public void ProfileBottomDialogSwitchTwoButtonFragment(){
       super();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileBottomDialogSwitchTwoButtonFragment.class, "3")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0b6b);
       this.q = m1.f(p0, 0x7f0a0b93);
       this.r = m1.f(p0, 0x7f0a0b91);
       this.u = m1.f(p0, 0x7f0a0b56);
       this.s = m1.f(p0, 0x7f0a3188);
       this.t = m1.f(p0, 0x7f0a2d87);
       this.p.setOnClickListener(new ProfileBottomDialogSwitchTwoButtonFragment$a(this));
       this.s.setOnClickListener(new ProfileBottomDialogSwitchTwoButtonFragment$b(this));
       this.t.setOnClickListener(new ProfileBottomDialogSwitchTwoButtonFragment$c(this));
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ProfileBottomDialogSwitchTwoButtonFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.c(p0, 0x7f0d11e9, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, ProfileBottomDialogSwitchTwoButtonFragment.class, "13")) {
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
       if (PatchProxy.applyVoid(objArray, this, ProfileBottomDialogSwitchTwoButtonFragment.class, "5")) {
          return;
       }
       super.onStart();
       boolean b = false;
       this.setCancelable(b);
       if (this.getDialog().getWindow() != null) {
          if (!PatchProxy.applyVoid(objArray, this, ProfileBottomDialogSwitchTwoButtonFragment.class, "12")) {
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
       ProfileDialogInfo mHeadInfo;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfileBottomDialogSwitchTwoButtonFragment.class, "6")) {
          return;
       }
       super.onViewCreated(p0, p1);
       ProfileBottomDialogSwitchTwoButtonFragment tw = this.w;
       String obj = PatchProxy.applyOneRefs(tw, this, ProfileBottomDialogSwitchTwoButtonFragment.class, "8");
       int i = 0;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(tw != null && (tw.mSwitchInfo != null && !TextUtils.x(this.w.mSwitchInfo.mKey))){
          b = true;
       }else {
          b = false;
       }
       if (!b) {
          this.dismissAllowingStateLoss();
          return;
       }else {
          this.doBindView(p0);
          Object[] objArray = null;
          obj = 8;
          if (!PatchProxy.applyVoid(objArray, this, ProfileBottomDialogSwitchTwoButtonFragment.class, "10")) {
             mHeadInfo = this.w.mTitle;
             if (mHeadInfo == null || TextUtils.x(mHeadInfo.mText)) {
                this.q.setVisibility(obj);
             }else {
                this.q.setVisibility(i);
                this.q.setText(this.w.mTitle.mText);
             }
             if (TextUtils.x(this.w.mSubTitle)) {
                this.r.setVisibility(obj);
                this.q.setMaxLines(2);
             }else {
                this.r.setVisibility(i);
                this.r.setText(this.w.mSubTitle);
                this.q.setMaxLines(1);
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, ProfileBottomDialogSwitchTwoButtonFragment.class, "7")) {
             ProfileBottomDialogSwitchTwoButtonFragment tw1 = this.w;
             if (tw1 != null) {
                mHeadInfo = tw1.mSwitchInfo;
                if (mHeadInfo != null) {
                   ProfileBottomDialogSwitchTwoButtonFragment ts = this.s;
                   String str = (TextUtils.x(mHeadInfo.mOpenText))? a1.p(R.string.arg_RES_7f103ac5): this.w.mSwitchInfo.mOpenText;
                   ts.setText(str);
                   tw1 = this.t;
                   String str1 = (TextUtils.x(this.w.mSwitchInfo.mCloseText))? a1.p(R.string.arg_RES_7f1005f5): this.w.mSwitchInfo.mCloseText;
                   tw1.setText(str1);
                }
             }
          }
          mHeadInfo = this.w.mHeadInfo;
          if (!PatchProxy.applyVoidOneRefs(mHeadInfo, this, ProfileBottomDialogSwitchTwoButtonFragment.class, "11")) {
             if (mHeadInfo == null || j.h(mHeadInfo.mHeadUrl)) {
                this.u.setVisibility(obj);
             }else {
                this.u.setVisibility(i);
                a$a uoa = a.d();
                uoa.b(":ks-features:ft-social:profile");
                uoa.d(ImageSource.ICON);
                this.u.X(mHeadInfo.mHeadUrl, uoa.a());
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, ProfileBottomDialogSwitchTwoButtonFragment.class, "9")) {
             if (this.w.mCloseType == 1) {
                this.p.setImageResource(R.drawable.arg_RES_7f081d73);
             }else {
                this.p.setImageResource(R.drawable.arg_RES_7f081d72);
             }
          }
          return;
       }
    }
    public b th(String p0,boolean p1){
       if (PatchProxy.isSupport(ProfileBottomDialogSwitchTwoButtonFragment.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, ProfileBottomDialogSwitchTwoButtonFragment.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return f.b(p0, p1).subscribe(Functions.d(), a.b);
    }
}
