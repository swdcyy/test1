package com.yxcorp.gifshow.util.q;
import erd.g;
import lnc.s2;
import x9a.k0;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.DialogResponse;
import java.util.Objects;
import com.yxcorp.gifshow.HomeActivity;
import android.app.Activity;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import com.yxcorp.gifshow.dialog.kem.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.dialog.kem.g;
import com.yxcorp.gifshow.model.response.dialog.KemCommonDialogResponse;
import x9a.a;
import x9a.h;
import com.yxcorp.gifshow.model.response.dialog.KemCheckableDialogResponse;
import com.yxcorp.gifshow.dialog.kem.a;
import com.yxcorp.gifshow.model.response.dialog.KemAdvanceCommonDialogResponse;
import tkd.b;
import tkd.d;
import hx5.a;
import com.yxcorp.gifshow.model.response.dialog.KemPymkDialogResponse;
import com.yxcorp.gifshow.dialog.kem.KemCommonConfirmCancelDialog;
import com.yxcorp.gifshow.model.response.dialog.KemCommonConfirmCancelDialogResponse;
import wh5.c;
import com.yxcorp.gifshow.dialog.kem.f;
import com.yxcorp.gifshow.model.response.dialog.KemCommonAgreementDialogResponse;
import x9a.f;
import com.yxcorp.gifshow.model.response.dialog.KemBottomDialogResponse;
import com.yxcorp.gifshow.dialog.kem.h;
import com.yxcorp.gifshow.model.response.dialog.KemCommonVideoDialogResponse;
import com.yxcorp.gifshow.dialog.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import uv8.q0;
import java.lang.reflect.Type;
import java.util.Map;
import tra.a;
import com.yxcorp.gifshow.model.response.DialogResponse$ActivityDialogData;
import com.yxcorp.gifshow.model.HomeDialogShowInfo;
import java.lang.System;
import kzc.d;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import lnc.o2;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.framework.model.user.QCurrentUser;
import ou5.b;
import com.kwai.feature.api.social.login.model.BindPhoneParams$b;
import com.kwai.feature.api.social.login.model.BindPhoneParams$FirstStepPageStyle;
import com.yxcorp.gifshow.model.response.dialog.BindPhoneDialogResponse;
import com.kwai.feature.api.social.login.model.BindPhoneParams;
import lnc.m2;
import android.content.Context;
import n3d.a;
import com.yxcorp.gifshow.model.response.DialogResponse$DialogData;
import java.lang.CharSequence;
import u07.t$a;
import lnc.q2;
import com.yxcorp.gifshow.util.s;
import com.yxcorp.gifshow.homepage.research.a;
import com.yxcorp.gifshow.model.response.DialogResponse$SurveyDialogData;
import lnc.r2;
import ayb.i;
import com.google.gson.JsonObject;
import com.yxcorp.gifshow.model.response.DialogResponse$WelcomeBackDialog;
import com.kwai.framework.model.user.User;
import gx5.b;

public final class q implements g	// class@001f98
{
    public final s2 b;
    public final k0 c;

    public void q(s2 p0,k0 p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       BindPhoneParams$b obj;
       d obj1;
       q tb = this.b;
       q tc = this.c;
       Objects.requireNonNull(tb);
       HomeActivity homeActivity = HomeActivity.H3();
       if (homeActivity != null && (!homeActivity.isFinishing() && !VisitorModeManager.f())) {
          DialogResponse mCommonDialo = p0.mCommonDialogResponse;
          if (mCommonDialo != null && !PatchProxy.applyVoidThreeRefs(homeActivity, mCommonDialo, tc, null, k.class, "4")) {
             k.c(new g(homeActivity, mCommonDialo, tc));
          }
          mCommonDialo = p0.mCheckableDialogResponse;
          if (mCommonDialo != null && !PatchProxy.applyVoidThreeRefs(homeActivity, mCommonDialo, tc, null, k.class, "7")) {
             k.c(new h(homeActivity, mCommonDialo, tc));
          }
          mCommonDialo = p0.mAdvanceCommonDialogResponse;
          if (mCommonDialo != null && !PatchProxy.applyVoidThreeRefs(homeActivity, mCommonDialo, tc, null, k.class, "6")) {
             k.c(new a(homeActivity, mCommonDialo, tc));
          }
          mCommonDialo = p0.mPymkDialogResponse;
          if (mCommonDialo != null && !PatchProxy.applyVoidThreeRefs(homeActivity, mCommonDialo, tc, null, k.class, "8")) {
             k.c(d.a(0x5a2b5479).vw(homeActivity, mCommonDialo, tc));
          }
          mCommonDialo = p0.mKemCommonConfirmCancelDialogResponse;
          if (mCommonDialo != null && !PatchProxy.applyVoidThreeRefs(homeActivity, mCommonDialo, tc, null, k.class, "5")) {
             k.c(new KemCommonConfirmCancelDialog(homeActivity, mCommonDialo, tc));
          }
          if (p0.mKemRewardDialogResponse != null && !c.b()) {
             mCommonDialo = p0.mKemRewardDialogResponse;
             if (!PatchProxy.applyVoidThreeRefs(homeActivity, mCommonDialo, tc, null, k.class, "11")) {
                k.c(new f(homeActivity, mCommonDialo, tc));
             }
          }
          mCommonDialo = p0.mKemBottomDialogResponse;
          if (mCommonDialo != null && !PatchProxy.applyVoidThreeRefs(homeActivity, mCommonDialo, tc, null, k.class, "10")) {
             k.c(new f(homeActivity, mCommonDialo, tc));
          }
          mCommonDialo = p0.mKemVideoDialogResponse;
          if (mCommonDialo != null && !PatchProxy.applyVoidThreeRefs(homeActivity, mCommonDialo, tc, null, k.class, "9")) {
             k.c(new h(homeActivity, mCommonDialo, tc));
          }
          DialogResponse mActivityDia = p0.mActivityDialogData;
          if (mActivityDia != null) {
             obj = null;
             obj1 = PatchProxy.applyOneRefs(mActivityDia, obj, a.class, "14");
             boolean b = false;
             if (obj1 != PatchProxyResult.class) {
                b = obj1.booleanValue();
             }else {
                Map map = a.c(q0.K);
                String str = String.valueOf(mActivityDia.mDialogId);
                if (map != null) {
                   obj = map.get(str);
                }
                if (obj != null) {
                   map = a.a(q0.J);
                   obj1 = (map != null && Boolean.TRUE.equals(map.get(str)))? 1: null;
                   if (mActivityDia.mMaxTimes <= obj.mShowTimes || ((System.currentTimeMillis() - obj.mLastShowTime) - mActivityDia.mSilencePeriod <= 0 || obj1)) {
                   label_0168 :
                      if (b) {
                         obj1 = new d(homeActivity);
                         obj1.Z0(23);
                         obj1.L(new a(p0.mActivityDialogData));
                         obj1.Y(new o2(tb));
                      }
                   }
                }
                b = true;
                goto label_0168 ;
             }
          }
          mActivityDia = p0.mBindPhoneDialogData;
          if (mActivityDia != null && (QCurrentUser.me().isLogined() && !QCurrentUser.me().isNewThirdPlatformUser())) {
             obj = new BindPhoneParams$b();
             obj.f(BindPhoneParams$FirstStepPageStyle.PHONE_ONEKEY_BIND_DIALOG_FIRST);
             obj.A = mActivityDia.mContent;
             obj.B = mActivityDia.mTitle;
             d.a(-1712118428).ew(homeActivity, obj.a(), null, "pop_bind", new m2(homeActivity));
          }
       label_01ca :
          mActivityDia = p0.mDialogData;
          if (mActivityDia != null) {
             obj1 = new d(homeActivity);
             obj1.Z0(66);
             obj1.X0(mActivityDia.mTitle);
             obj1.z0(mActivityDia.mContent);
             obj1.z(true);
             obj1.L(new q2(tb, R.layout.arg_RES_7f0d02de));
             obj1.Y(new s(tb, mActivityDia));
          }
          mActivityDia = p0.mSurveyData;
          if (mActivityDia != null) {
             obj1 = new d(homeActivity);
             obj1.Z0(27);
             obj1.z(true);
             obj1.A(true);
             obj1.L(new a(mActivityDia));
             obj1.Y(new r2(tb));
          }
          int i = 0x4f878389;
          if (p0.mUnLoginCashRewardDialogResponse != null) {
             d.a(i).C20(p0.mUnLoginCashRewardDialogResponse);
          }
          DialogResponse mWelcomeBack = p0.mWelcomeBackDialogResponse;
          if (mWelcomeBack != null) {
             DialogResponse$WelcomeBackDialog mUser = mWelcomeBack.mUser;
             if (mUser != null) {
                d.a(i).Rb(mUser.getName(), p0.mWelcomeBackDialogResponse.mUser.getAvatar(), p0.mWelcomeBackDialogResponse.mLoginType);
             }
          }
          if (p0.mTraceQuestionnaireDialogResponse != null) {
             d.a(i).Il(homeActivity, p0.mTraceQuestionnaireDialogResponse);
          }
          if (p0.mKemKwaiBubbleDialog != null) {
             d.a(i).B20(p0.mKemKwaiBubbleDialog);
          }
          if (p0.mKemDialog9Response != null) {
             d.a(i).QU(homeActivity, p0.mKemDialog9Response);
          }
          if (p0.mKemGrowthDialogResponse != null) {
             d.a(i).Ww(p0.mKemGrowthDialogResponse);
          }
          if (p0.mKemBottomDialogNew != null) {
             d.a(0x3673894c).B60(p0.mKemBottomDialogNew);
          }
       }
    label_029d :
       return;
    }
}
