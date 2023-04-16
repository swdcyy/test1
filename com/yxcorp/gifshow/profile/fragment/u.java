package com.yxcorp.gifshow.profile.fragment.u;
import lkd.b;
import com.yxcorp.gifshow.profile.fragment.UserProfilePhotoFragment;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.yxcorp.utility.n;
import java.lang.Integer;
import z5c.k0;
import android.view.View;
import com.yxcorp.gifshow.profile.fragment.ProfilePhotoFragment;
import android.content.Context;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.AppBarLayout;
import z5c.o2;
import z5c.j0;
import android.app.Application;
import o56.a;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder$c;
import java.lang.Math;
import k3c.u2;
import com.yxcorp.gifshow.profile.model.UserStateExtBuilder$b;
import com.yxcorp.gifshow.profile.fragment.BaseProfileFeedFragment;
import s1c.r0;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserProfile;

public final class u implements b	// class@001332
{
    public final UserProfilePhotoFragment a;

    public void u(UserProfilePhotoFragment p0){
       this.a = p0;
    }
    public final Object get(){
       int i;
       int i3;
       UserStateExtBuilder obj2;
       int i4;
       int[] ointArray1;
       int i7;
       u ta = this.a;
       Objects.requireNonNull(ta);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, ta, UserProfilePhotoFragment.class, "15");
       if (obj != patchProxyRe) {
          i = obj.intValue();
       }else {
          int i1 = n.j(ta.getActivity());
          int i2 = 2;
          FragmentActivity uFragmentAct = 1;
          if (PatchProxy.isSupport(UserProfilePhotoFragment.class)) {
             View obj1 = PatchProxy.applyOneRefs(Integer.valueOf(i1), ta, UserProfilePhotoFragment.class, "16");
             if (obj1 != patchProxyRe) {
                i3 = obj1.intValue();
             }else if(k0.s()){
                obj1 = ta.getActivity().findViewById(R.id.tab_round_corner_bg);
                ta.X = obj1;
                if (obj1 != null) {
                   ointArray1 = new int[i2];
                   obj1.getLocationOnScreen(ointArray1);
                   i3 = ointArray1[uFragmentAct];
                   i7 = n.c(ta.getContext(), 48.00f);
                label_008a :
                   i3 = i3 + i7;
                }
             }else {
                obj1 = ta.getActivity().findViewById(R.id.abnormal_tip);
                ta.b1 = obj1;
                if (obj1 != null && obj1 instanceof LinearLayout) {
                   ointArray1 = new int[i2];
                   obj1.getLocationOnScreen(ointArray1);
                   i3 = ointArray1[uFragmentAct];
                   i7 = ta.b1.getMeasuredHeight();
                   goto label_008a ;
                }
             }
             i3 = i1;
          }else {
             goto label_0043 ;
          }
          if (PatchProxy.isSupport(UserProfilePhotoFragment.class)) {
             obj2 = PatchProxy.applyOneRefs(Integer.valueOf(i1), ta, UserProfilePhotoFragment.class, "17");
             if (obj2 != patchProxyRe) {
                i4 = obj2.intValue();
             }else {
             label_00aa :
                View view1 = ta.getActivity().findViewById(R.id.header_operation_container);
                ta.c1 = view1;
                if (view1 != null && view1 instanceof ConstraintLayout) {
                   int[] ointArray = new int[i2];
                   view1.getLocationOnScreen(ointArray);
                   i4 = ointArray[uFragmentAct] + ta.c1.getMeasuredHeight();
                   Context context = ta.getContext();
                   float f = (k0.t())? 6.00f: 12.00f;
                   i4 = i4 + n.c(context, f);
                }else {
                   i4 = i1;
                }
             }
          }else {
             goto label_00aa ;
          }
          i2 = false;
          View view = ta.getActivity().findViewById(R.id.app_bar_layout);
          ta.Y = view;
          if (view != null && view instanceof AppBarLayout) {
             i2 = j0.a(view, o2.c(ta));
          }
          int i5 = n.c(a.b(), 250.00f);
          i3 = i1 - i3;
          obj2 = new UserStateExtBuilder().b(new UserStateExtBuilder$c(Integer.valueOf(Math.max(i3, i5)))).e(new UserStateExtBuilder$c(Integer.valueOf(Math.max(i3, i5))));
          int i6 = (k0.s())? Math.max(i3, i5): Math.max((i1 - i4), i5);
          obj2 = obj2.c(new UserStateExtBuilder$c(Integer.valueOf(i6)));
          i6 = (k0.s())? Math.max(i3, i5): Math.max((i1 - i4), i5);
          UserStateExtBuilder$c uoc = new UserStateExtBuilder$c(Integer.valueOf(i6));
          uoc.a(new u2(ta));
          obj2 = obj2.h(uoc);
          i4 = (k0.s())? Math.max(i3, i5): Math.max((i1 - i4), i5);
          BaseProfileFeedFragment g = ta.G;
          i = obj2.d(new UserStateExtBuilder$c(Integer.valueOf(i4))).g(new UserStateExtBuilder$c(Integer.valueOf(Math.max(i2, i5)))).f(g.b, g.d.mUserProfile).intValue();
       }
       return Integer.valueOf(i);
    }
}
