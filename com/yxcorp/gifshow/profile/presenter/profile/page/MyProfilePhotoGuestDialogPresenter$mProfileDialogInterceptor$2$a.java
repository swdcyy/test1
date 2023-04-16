package com.yxcorp.gifshow.profile.presenter.profile.page.MyProfilePhotoGuestDialogPresenter$mProfileDialogInterceptor$2$a;
import t2c.b;
import com.yxcorp.gifshow.profile.presenter.profile.page.MyProfilePhotoGuestDialogPresenter$mProfileDialogInterceptor$2;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.UserProfileResponse;
import w2c.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.plugin.impl.setting.SettingPluginHelper;
import z5c.k0;
import com.yxcorp.gifshow.profile.presenter.profile.page.MyProfilePhotoGuestDialogPresenter;
import com.kwai.framework.model.user.QCurrentUser;
import lt7.b;
import mw4.a;
import s1c.o;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import b5c.a;
import com.yxcorp.gifshow.plugin.impl.setting.SettingPluginHelper$showFollowListPrivacyGuideDefaultAllDialog$$inlined$let$lambda$1;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import android.content.Context;
import msd.a;
import b5c.b;
import com.yxcorp.gifshow.plugin.impl.setting.SettingPluginHelper$showFollowListPrivacyGuideDialog$$inlined$let$lambda$1;
import com.kwai.framework.model.user.User;
import brd.t;
import z5c.x1;
import t2c.a;

public final class MyProfilePhotoGuestDialogPresenter$mProfileDialogInterceptor$2$a implements b	// class@001566
{
    public final MyProfilePhotoGuestDialogPresenter$mProfileDialogInterceptor$2 a;

    public void MyProfilePhotoGuestDialogPresenter$mProfileDialogInterceptor$2$a(MyProfilePhotoGuestDialogPresenter$mProfileDialogInterceptor$2 p0){
       this.a = p0;
       super();
    }
    public final boolean a(UserProfileResponse p0,a p1){
       boolean b1;
       Activity activity;
       Object[] objArray;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MyProfilePhotoGuestDialogPresenter$mProfileDialogInterceptor$2$a.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "dismissListener");
       MyProfilePhotoGuestDialogPresenter$mProfileDialogInterceptor$2 this$0 = this.a.this$0;
       Objects.requireNonNull(this$0);
       k0 ok0 = k0.class;
       MyProfilePhotoGuestDialogPresenter myProfilePho = MyProfilePhotoGuestDialogPresenter.class;
       String str = "4";
       Object obj1 = PatchProxy.applyOneRefs(p1, this$0, myProfilePho, str);
       boolean b = true;
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          a obj2 = PatchProxy.apply(null, this$0, myProfilePho, "5");
          if (obj2 != patchProxyRe) {
             b1 = obj2.booleanValue();
          }else {
             QCurrentUser mE = QCurrentUser.ME;
             a.o(mE, "QCurrentUser.ME");
             if (mE.getFollowListVisibilityOption() != 2 && (b.a() && !a.e())) {
                Object obj4 = PatchProxy.apply(null, null, ok0, "31");
                b1 = (obj4 != patchProxyRe)? obj4.booleanValue(): k0.q("profileFanFolloDialogNoLimit", false);
                if (b1 || !o.a.getBoolean(b.d("user")+"has_profile_follow_fan_dialog_shown", false)) {
                   b1 = true;
                }
             }
          label_00a0 :
             b1 = false;
          }
          if (b1) {
             String obj3 = PatchProxy.apply(null, null, ok0, "30");
             boolean b2 = (obj3 != patchProxyRe)? obj3.booleanValue(): k0.l("profileFanFollowListVisibleAll", false);
             obj3 = "listener";
             if (b2) {
                activity = this$0.getActivity();
                if (!activity instanceof GifshowActivity) {
                   activity = null;
                }
                obj2 = new a(p1);
                if (!PatchProxy.applyVoidTwoRefsWithListener(activity, obj2, null, SettingPluginHelper.class, str)) {
                   a.p(obj2, obj3);
                   if (activity != null) {
                      SettingPluginHelper.a.a(activity, new SettingPluginHelper$showFollowListPrivacyGuideDefaultAllDialog$$inlined$let$lambda$1(activity, obj2));
                   }
                   PatchProxy.onMethodExit(SettingPluginHelper.class, str);
                }
             }else {
                activity = this$0.getActivity();
                if (!activity instanceof GifshowActivity) {
                   objArray = null;
                }
                b uob = new b(p1);
                String str1 = "3";
                if (!PatchProxy.applyVoidTwoRefsWithListener(objArray, uob, null, SettingPluginHelper.class, str1)) {
                   a.p(uob, obj3);
                   if (objArray != null) {
                      SettingPluginHelper.a.a(objArray, new SettingPluginHelper$showFollowListPrivacyGuideDialog$$inlined$let$lambda$1(objArray, uob));
                   }
                   PatchProxy.onMethodExit(SettingPluginHelper.class, str1);
                }
             }
             MyProfilePhotoGuestDialogPresenter q = this$0.q;
             if (q == null) {
                a.S("mUser");
             }
             x1.a(q.getId(), 3, b, b, null);
          }else {
             b = false;
          }
       }
       return b;
    }
    public int getPriority(){
       return a.a(this);
    }
}
