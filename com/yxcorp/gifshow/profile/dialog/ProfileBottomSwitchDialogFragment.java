package com.yxcorp.gifshow.profile.dialog.ProfileBottomSwitchDialogFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.profile.dialog.ProfileBottomSwitchDialogFragment$a;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.library.widget.button.SlipSwitchButton$a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.yxcorp.gifshow.profile.dialog.b;
import android.view.View$OnClickListener;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.profile.model.ProfileDialogInfo;
import com.kwai.framework.model.user.User;
import l3c.e;
import qa9.s;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import ekd.m1;
import android.widget.ImageView;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import f3c.e;
import com.yxcorp.gifshow.profile.model.ProfileDialogInfo$TitleInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.profile.model.ProfileDialogInfo$SwitchInfo;
import com.yxcorp.gifshow.profile.model.ProfileDialogInfo$HeadInfo;
import ekd.j;
import zf6.k;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public class ProfileBottomSwitchDialogFragment extends BaseFragment	// class@0012f2
{
    public ImageView j;
    public TextView k;
    public TextView l;
    public KwaiImageView m;
    public SlipSwitchButton n;
    public ProfileDialogInfo o;
    public User p;
    public b q;
    public final SlipSwitchButton$a r;
    public static final int s;

    public void ProfileBottomSwitchDialogFragment(){
       super();
       this.r = new ProfileBottomSwitchDialogFragment$a(this);
    }
    public final void ch(SlipSwitchButton p0,boolean p1){
       if (PatchProxy.isSupport(ProfileBottomSwitchDialogFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, ProfileBottomSwitchDialogFragment.class, "10")) {
          return;
       }
       p0.setOnSwitchChangeListener2(null);
       p0.setSwitch(p1);
       p0.setOnSwitchChangeListener2(p0.getOnSwitchChangeListener2());
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ProfileBottomSwitchDialogFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d11e8, p1, false);
       view.findViewById(R.id.user_operation_layout).setOnClickListener(b.b);
       return view;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, ProfileBottomSwitchDialogFragment.class, "4")) {
          return;
       }
       GifshowActivity activity = this.getActivity();
       ProfileBottomSwitchDialogFragment to = this.o;
       ProfileBottomSwitchDialogFragment tp = this.p;
       String str = (this.n.getSwitch())? "on": "off";
       e.b(activity, to, tp, str);
       super.onDestroyView();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       ProfileDialogInfo mHeadInfo;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfileBottomSwitchDialogFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       p1 = this.getArguments();
       if (p1 == null) {
          s.b(this);
          return;
       }else {
          this.o = SerializableHook.getSerializable(p1, "USER_PROFILE_DIALOG_INFO");
          this.p = SerializableHook.getSerializable(p1, "USER_PROFILE_DIALOG_USER");
          ProfileBottomSwitchDialogFragment to = this.o;
          String str = 1;
          int i = 0;
          to = (to != null && to.mSwitchInfo != null)? 1: null;
          if (!to) {
             s.b(this);
             return;
          }else if(PatchProxy.applyVoidOneRefs(p0, this, ProfileBottomSwitchDialogFragment.class, "5")){
             this.j = m1.f(p0, 0x7f0a0b6b);
             this.k = m1.f(p0, 0x7f0a0b93);
             this.l = m1.f(p0, 0x7f0a0b91);
             this.m = m1.f(p0, 0x7f0a0b56);
             this.n = m1.f(p0, 0x7f0a0b92);
             this.j.setOnClickListener(new e(this));
          }
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, ProfileBottomSwitchDialogFragment.class, "6")) {
             mHeadInfo = this.o.mTitle;
             if (mHeadInfo == null || TextUtils.x(mHeadInfo.mText)) {
                this.k.setVisibility(8);
             }else {
                this.k.setVisibility(i);
                this.k.setText(this.o.mTitle.mText);
             }
             if (TextUtils.x(this.o.mSubTitle)) {
                this.l.setVisibility(8);
                this.k.setMaxLines(2);
             }else {
                this.l.setVisibility(i);
                this.l.setText(this.o.mSubTitle);
                this.k.setMaxLines(str);
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, ProfileBottomSwitchDialogFragment.class, "8")) {
             this.n.setOnSwitchChangeListener2(objArray);
             this.n.setSwitch(this.o.mSwitchInfo.mValue);
             this.n.setOnSwitchChangeListener2(this.r);
          }
          mHeadInfo = this.o.mHeadInfo;
          if (!PatchProxy.applyVoidOneRefs(mHeadInfo, this, ProfileBottomSwitchDialogFragment.class, "7")) {
             if (mHeadInfo == null || (j.h(mHeadInfo.mHeadUrl) && j.h(mHeadInfo.mDarkHeadUrl))) {
                this.m.setVisibility(8);
             }else {
                this.m.setVisibility(i);
                ProfileDialogInfo$HeadInfo mDarkHeadUrl = (k.d() && !j.h(mHeadInfo.mDarkHeadUrl))? mHeadInfo.mDarkHeadUrl: mHeadInfo.mHeadUrl;
                a$a uoa = a.d();
                uoa.b(":ks-features:ft-social:profile");
                uoa.d(ImageSource.ICON);
                this.m.X(mDarkHeadUrl, uoa.a());
             }
          }
          return;
       }
    }
}
