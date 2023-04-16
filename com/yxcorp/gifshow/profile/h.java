package com.yxcorp.gifshow.profile.h;
import vu5.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import android.app.Activity;
import tkd.b;
import tkd.d;
import yxb.b;
import os5.l;
import android.content.Context;
import rx5.c;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import com.kwai.framework.model.feed.BaseFeed;
import mxb.j0;
import mxb.i0;
import mxb.j;
import java.util.Objects;
import s1c.p0;
import lnc.c3$a;
import lnc.c3;
import com.yxcorp.gifshow.profile.g;
import erd.g;
import java.lang.Integer;
import android.content.Intent;
import com.kwai.framework.model.user.User;
import rkd.b;
import com.yxcorp.gifshow.profile.activity.MyProfileActivityTablet;
import com.yxcorp.gifshow.profile.activity.MyProfileActivity;
import android.net.Uri;
import ekd.x0;
import com.kwai.feature.api.router.social.profile.ProfileExtraKey;
import android.os.Bundle;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.profile.activity.UserProfileActivityTablet;
import com.yxcorp.gifshow.profile.activity.UserProfileActivity;
import com.kuaishou.android.model.mix.CommonMeta;
import com.yxcorp.gifshow.profile.c;
import tl8.d;
import ok.h;
import tl8.e;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.profile.d;
import com.yxcorp.gifshow.profile.e;
import com.kuaishou.android.model.feed.SearchParams;
import z5c.e3;
import nl9.x;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.view.View;
import vu5.a;
import java.lang.Number;
import s1c.a1;
import a1.a;
import android.view.ViewGroup;
import s1c.o0;
import a1.a$e;
import n3d.a;
import com.yxcorp.gifshow.entity.QPreInfo;
import com.yxcorp.gifshow.profile.f;
import com.yxcorp.gifshow.profile.fragment.UserProfileFragment;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.model.response.UserProfileResponse;
import com.yxcorp.gifshow.profile.fragment.MyProfileFragment;
import androidx.fragment.app.Fragment;
import s1c.q0;

public class h implements b	// class@001337
{

    public void h(){
       super();
    }
    public static boolean H0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, h.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (QCurrentUser.ME.isLogined() && TextUtils.equals(p0, QCurrentUser.ME.getId()))? true: false;
       return b;
    }
    public static boolean L0(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, h.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (TextUtils.isEmpty(p1) || (h.H0(p1) && ("ks://self").equals(p0)))? true: false;
       return b;
    }
    public static String S(String p0,String p1,String p2,String p3){
       StringBuilder obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, h.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "ks://profile"+'/'+p0+'/'+p1+'/'+p2;
       if (p3 != null) {
          obj = obj+'/'+p3;
       }
       return obj;
    }
    public static boolean T0(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, h.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (TextUtils.isEmpty(p0)) {
          return false;
       }
       if (TextUtils.isEmpty(p1)) {
          return p0.contains("ks://profile");
       }
       return p0.contains(h.z0(p1));
    }
    public static boolean VA(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, h.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (h.L0(p0, p1) || h.T0(p0, p1))? true: false;
       return b;
    }
    public static boolean g0(Activity p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, h.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!d.a(-430326918).cR(p0)) {
          int i = -1492894991;
          if (d.a(i).Ur(p0) || (!d.a(i).q50(p0) && !d.a(0x77cfa10c).Nf(p0))) {
             b = false;
          label_0051 :
             return b;
          }
       }
       b = true;
       goto label_0051 ;
    }
    public static void n(ProfileStartParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, h.class, "28")) {
          return;
       }
       BaseFeed uBaseFeed = p0.d();
       if (uBaseFeed != null && p0.i == null) {
          j oj = i0.a().g(uBaseFeed);
          Objects.requireNonNull(oj);
          c3.c(p0.k, new p0(oj));
          if (TextUtils.equals(p0.e(), "COCREATE")) {
             oj.a(g.b);
             oj.l("co_creator_rank", Integer.valueOf((p0.n + 1))).l("co_creator_user_id", p0.g());
          }
          i0.a().c(oj);
       }
       return;
    }
    public static Intent q0(Activity p0,ProfileStartParam p1){
       Intent intent;
       boolean b1;
       Object obj = p0;
       Object obj1 = p1;
       String obj2 = PatchProxy.applyTwoRefs(obj, obj1, null, h.class, "2");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       if (obj1 == null || (p1.f() == null && TextUtils.isEmpty(p1.g()))) {
          return null;
       }
       obj2 = p1.g();
       if (TextUtils.isEmpty(obj2) && p1.f() != null) {
          obj2 = p1.f().getId();
       }
       String str = obj2;
       boolean b = true;
       if (h.H0(str)) {
          intent = PatchProxy.applyTwoRefs(obj, obj1, null, h.class, "6");
          if (intent != PatchProxyResult.class) {
          }else {
             MyProfileActivityTablet myProfileAct = PatchProxy.apply(null, null, h.class, "12");
             if (myProfileAct != PatchProxyResult.class) {
             }else if(b.g()){
                myProfileAct = MyProfileActivityTablet.class;
             }else {
                myProfileAct = MyProfileActivity.class;
             }
             intent = new Intent(obj, myProfileAct);
             intent.setData(x0.f("ks://self"));
             if (h.g0(p0) || p1.h()) {
                intent.putExtra(ProfileExtraKey.ENABLE_SMOOTH_SWIPE.getValue(), b);
             }
             intent.putExtras(p1.b());
             if (p1.c()) {
                intent.putExtra("profile_tab", p1.c());
             }
          }
       }else {
          h.n(p1);
          User obj3 = PatchProxy.applyTwoRefs(obj, str, null, h.class, "27");
          if (obj3 != PatchProxyResult.class) {
             b1 = obj3.booleanValue();
          }else if(obj instanceof GifshowActivity){
             Object obj4 = obj;
             if (!obj4.a3() && h.VA(obj4.U2(), str)) {
                obj4.finish();
                b1 = true;
             }
          }
          b1 = false;
          if (b1) {
             return null;
          }else {
             intent = PatchProxy.applyThreeRefs(p0, p1, str, null, h.class, "4");
             if (intent != PatchProxyResult.class) {
             }else {
                obj3 = p1.f();
                User user = (obj3 == null)? new User(str, "", "", "", null): obj3;
                intent = PatchProxy.applyThreeRefs(p0, p1, user, null, h.class, "11");
                if (intent != PatchProxyResult.class) {
                }else {
                   UserProfileActivityTablet userProfileA = PatchProxy.apply(null, null, h.class, "13");
                   if (userProfileA != PatchProxyResult.class) {
                   }else if(b.g()){
                      userProfileA = UserProfileActivityTablet.class;
                   }else {
                      userProfileA = UserProfileActivity.class;
                   }
                   intent = new Intent(obj, userProfileA);
                   String str1 = "DEFAULT";
                   if (p1.d() == null) {
                      intent.setData(x0.f(h.z0(user.getId())));
                   }else {
                      intent.setData(x0.f(h.S(user.getId(), p1.d().getId(), e.h(p1.d(), CommonMeta.class, c.b), null)));
                      SerializableHook.putExtra(intent, ProfileExtraKey.REFER_PHOTO.getValue(), p1.d());
                      intent.putExtra(ProfileExtraKey.PHOTO_ID.getValue(), p1.d().getId());
                      intent.putExtra(ProfileExtraKey.PHOTO_EXP_TAG.getValue(), e.h(p1.d(), CommonMeta.class, d.b));
                      intent.putExtra(ProfileExtraKey.PHOTO_LLSID.getValue(), e.h(p1.d(), CommonMeta.class, e.b));
                      String value = ProfileExtraKey.PHOTO_SCENE_TYPE.getValue();
                      String str2 = PatchProxy.applyOneRefs(obj1, null, h.class, "29");
                      if (str2 != PatchProxyResult.class) {
                      }else if(!TextUtils.isEmpty(p1.e())){
                         str2 = p1.e();
                      }else if(SearchParams.getSearchParams(p1.d()) != null){
                         str2 = "SEARCH";
                      }else {
                         str2 = str1;
                      }
                      intent.putExtra(value, str2);
                   }
                   SerializableHook.putExtra(intent, ProfileExtraKey.USER.getValue(), user);
                   intent.putExtra(ProfileExtraKey.PHOTO_INDEX.getValue(), obj1.g);
                   if (h.g0(p0) || p1.h()) {
                      intent.putExtra(ProfileExtraKey.ENABLE_SMOOTH_SWIPE.getValue(), true);
                   }
                   if (p1.c()) {
                      intent.putExtra(ProfileExtraKey.PROFILE_TAB.getValue(), p1.c());
                   }
                   intent.putExtras(p1.b());
                   intent.putExtra("start_exit_page_animation", R.anim.arg_RES_7f0100d4);
                   if (e3.a(user)) {
                      ProfileStartParam profileStart = PatchProxy.apply(null, obj1, ProfileStartParam.class, "8");
                      if (profileStart != PatchProxyResult.class) {
                      }else if(d.a(0x25c7329).bb(obj1.e)){
                         profileStart = obj1.f;
                      }
                      str1 = profileStart;
                   }
                   intent.putExtra(ProfileExtraKey.BUSINESS_SCENE_TYPE.getValue(), str1);
                   SerializableHook.putExtra(intent, ProfileExtraKey.AD_EXTRA_INFO.getValue(), obj1.o);
                   PhotoAdvertisement photoAdverti = k.A(p1.d());
                   if (photoAdverti != null && !TextUtils.isEmpty(photoAdverti.mCallbackParam)) {
                      intent.putExtra(ProfileExtraKey.AD_CALLBACK_PARAM.getValue(), photoAdverti.mCallbackParam);
                   }
                }
             }
          }
       }
    label_0295 :
       return intent;
    }
    public static String z0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, h.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return "ks://profile";
       }
       return "ks://profile/"+p0;
    }
    public final BaseFragment F(BaseFragment p0,View p1,a p2){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, h.class, "19");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyOneRefs(p0, this, h.class, "20");
       if (obj != patchProxyRe) {
          i = obj.intValue();
       }else if(p0 instanceof a1){
          i = p0.getLayoutResId();
       }else {
          i = 0;
       }
       new a(p1.getContext()).b(i, p1, new o0(p0, p2));
       return p0;
    }
    public void Kp(Activity p0,ProfileStartParam p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "1")) {
          return;
       }
       Intent intent = h.q0(p0, p1);
       if (intent == null) {
          return;
       }
       if (p0 instanceof GifshowActivity) {
          p0.p3(intent, p1.a());
       }else {
          p0.startActivity(intent);
       }
       return;
    }
    public BaseFragment My(boolean p0,View p1,a p2){
       if (PatchProxy.isSupport(h.class)) {
          Object obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), p1, p2, this, h.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       BaseFragment uBaseFragmen = this.T7(p0);
       this.F(uBaseFragmen, p1, p2);
       return uBaseFragmen;
    }
    public void Nl(GifshowActivity p0,ProfileStartParam p1,int p2){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, h.class, "10")) {
          return;
       }
       if (p2 > 0) {
          this.rw(p0, p1, p2, null);
       }else {
          this.Kp(p0, p1);
       }
       return;
    }
    public BaseFragment Pd(User p0,BaseFeed p1,QPreInfo p2,boolean p3){
       UserProfileFragment userProfileF;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(h.class)) {
          p2 = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, h.class, "17");
          if (p2 != patchProxyRe) {
             return p2;
          }
       }
       String id = p1.getId();
       String str = e.h(p1, CommonMeta.class, f.b);
       if (PatchProxy.isSupport(UserProfileFragment.class)) {
          Object[] objArray = new Object[]{p0,id,str,p1,Boolean.valueOf(p3)};
          userProfileF = PatchProxy.apply(objArray, null, UserProfileFragment.class, "1");
          if (userProfileF != patchProxyRe) {
          label_00a8 :
             return userProfileF;
          }
       }
       Bundle uBundle = new Bundle();
       SerializableHook.putSerializable(uBundle, ProfileExtraKey.USER.getValue(), p0);
       uBundle.putString(ProfileExtraKey.PHOTO_ID.getValue(), id);
       uBundle.putString(ProfileExtraKey.PHOTO_EXP_TAG.getValue(), str);
       SerializableHook.putSerializable(uBundle, ProfileExtraKey.REFER_PHOTO.getValue(), p1);
       PhotoAdvertisement photoAdverti = k.A(p1);
       if (photoAdverti != null && !TextUtils.x(photoAdverti.mCallbackParam)) {
          uBundle.putString(ProfileExtraKey.AD_CALLBACK_PARAM.getValue(), photoAdverti.mCallbackParam);
       }
       userProfileF = UserProfileFragment.Hh(uBundle, null, p3, 0, 0, 0, null, null);
       goto label_00a8 ;
    }
    public BaseFragment T7(boolean p0){
       MyProfileFragment obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, oh, "15");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (PatchProxy.isSupport(MyProfileFragment.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), null, MyProfileFragment.class, "2");
          if (obj != patchProxyRe) {
          label_0047 :
             return obj;
          }
       }
       Bundle uBundle = new Bundle();
       uBundle.putBoolean("MyProfileFragment.arg_isPartOfDetail", p0);
       obj = new MyProfileFragment();
       obj.setArguments(uBundle);
       goto label_0047 ;
    }
    public void Y7(GifshowActivity p0,ProfileStartParam p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "7")) {
          return;
       }
       this.Kp(p0, p1);
       return;
    }
    public void dK(Activity p0,ProfileStartParam p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "8")) {
          return;
       }
       this.Kp(p0, p1);
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public BaseFragment ix(User p0,BaseFeed p1,QPreInfo p2,boolean p3,View p4,a p5){
       String obj1;
       String obj2;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p4;
       object oobject3 = p5;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h oh = h.class;
       int i = 4;
       int i1 = 3;
       int i2 = 2;
       int i3 = 1;
       int i4 = 0;
       int i5 = 5;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{oobject,oobject1,p2,Boolean.valueOf(p3),oobject2,oobject3};
          obj1 = PatchProxy.apply(objArray, obj, oh, "18");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       if (PatchProxy.isSupport(oh)) {
          i = 5;
          obj2 = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, h.class, "17");
          if (obj2 != patchProxyRe) {
          }else {
          label_005e :
             obj2 = p1.getId();
             obj1 = e.h(oobject1, CommonMeta.class, f.b);
             if (PatchProxy.isSupport(UserProfileFragment.class)) {
                Object[] objArray1 = new Object[i];
                objArray1[i4] = oobject;
                objArray1[i3] = obj2;
                objArray1[i2] = obj1;
                objArray1[i1] = oobject1;
                objArray1[4] = Boolean.valueOf(p3);
                Object obj3 = PatchProxy.apply(objArray1, null, UserProfileFragment.class, "1");
                if (obj3 != patchProxyRe) {
                   obj2 = obj3;
                }
             }
             Bundle uBundle = new Bundle();
             SerializableHook.putSerializable(uBundle, ProfileExtraKey.USER.getValue(), oobject);
             uBundle.putString(ProfileExtraKey.PHOTO_ID.getValue(), obj2);
             uBundle.putString(ProfileExtraKey.PHOTO_EXP_TAG.getValue(), obj1);
             SerializableHook.putSerializable(uBundle, ProfileExtraKey.REFER_PHOTO.getValue(), oobject1);
             PhotoAdvertisement photoAdverti = k.A(p1);
             if (photoAdverti != null && !TextUtils.x(photoAdverti.mCallbackParam)) {
                uBundle.putString(ProfileExtraKey.AD_CALLBACK_PARAM.getValue(), photoAdverti.mCallbackParam);
             }
             obj2 = UserProfileFragment.Hh(uBundle, null, p3, 0, 0, 0, null, null);
          }
       }else {
          i = 5;
          goto label_005e ;
       }
       obj.F(obj2, oobject2, oobject3);
       return obj2;
    }
    public void rw(GifshowActivity p0,ProfileStartParam p1,int p2,a p3){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, h.class, "3")) {
          return;
       }
       Intent intent = h.q0(p0, p1);
       if (intent == null) {
          return;
       }
       if (p3 != null) {
          p0.t1(intent, p2, new q0(p3));
       }else {
          p0.q3(intent, p2, p1.a());
       }
       return;
    }
    public void tn(GifshowActivity p0,ProfileStartParam p1,int p2,a p3){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, h.class, "9")) {
          return;
       }
       this.rw(p0, p1, p2, p3);
       return;
    }
    public void wT(GifshowActivity p0,ProfileStartParam p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "5")) {
          return;
       }
       if (p1 == null) {
          p1 = ProfileStartParam.m(QCurrentUser.ME.getId());
       }
       this.Kp(p0, p1);
       return;
    }
}
