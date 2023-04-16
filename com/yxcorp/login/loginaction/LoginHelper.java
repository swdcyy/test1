package com.yxcorp.login.loginaction.LoginHelper;
import java.lang.Object;
import java.lang.Throwable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Boolean;
import com.yxcorp.retrofit.model.KwaiException;
import njd.a;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import java.util.HashMap;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import h3b.a;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.yxcorp.login.util.f;
import com.yxcorp.gifshow.activity.GifshowActivity;
import u07.t$a;
import com.kwai.library.widget.popup.common.c$b;
import com.yxcorp.login.util.e;
import u07.u;
import b3d.h;
import u07.t;
import u07.j;
import com.yxcorp.login.util.d;
import b3d.l;
import com.yxcorp.login.util.c;
import b3d.a;
import com.yxcorp.login.util.b;
import b3d.k;
import com.kwai.social.startup.relation.model.AccountFreezeConfig;
import java.lang.reflect.Type;
import mw4.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import o1d.m;
import b3d.j;
import b3d.b;
import u07.f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.utility.n;
import k2b.f3;
import b3d.i;
import java.util.Map;
import com.yxcorp.login.util.a;
import com.kwai.sdk.switchconfig.a;
import com.kuaishou.android.security.KSecurity;
import s00.b$b;
import s00.b;
import java.lang.Exception;
import oe6.e;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.kwai.framework.model.user.UserInfo;
import java.util.List;
import java.util.Arrays;
import com.yxcorp.login.util.ActivityPendingLaunchUtil$PendingCategory;
import eda.l$a;
import com.yxcorp.login.loginaction.LoginHelper$4;
import com.google.common.reflect.TypeToken;
import java.util.Collection;
import ekd.q;
import java.lang.System;
import com.yxcorp.login.util.ActivityPendingLaunchUtil$c;
import com.yxcorp.login.util.ActivityPendingLaunchUtil;
import hn5.n;
import hn5.m;
import java.security.PrivateKey;
import java.security.KeyPair;
import com.kwai.framework.accountsecurity.d;
import brd.t;
import p1d.c;
import erd.g;
import p1d.d;
import com.yxcorp.login.loginaction.LoginHelper$5;
import com.kwai.framework.model.user.QCurrentUser;
import wkd.b;
import mu7.e;
import eda.n$a;
import b3d.g0;
import v0d.j;
import com.yxcorp.login.loginaction.LoginHelper$2;
import o56.c;
import o56.a;
import j1d.e;
import java.util.Objects;
import com.yxcorp.login.debuglogin.DebugAccountInfo;
import oe6.n;
import km8.b;
import o1d.k;
import lnc.i3;
import java.lang.Number;
import k2b.u1;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.framework.model.user.ProfilePageInfo;
import com.yxcorp.login.loginaction.LoginHelper$3;
import java.util.ArrayList;
import ok.o;
import com.google.common.base.Predicates;
import java.lang.Iterable;
import qk.y;
import java.util.Iterator;
import com.kwai.feature.api.social.login.model.SwitchAccountModel;
import kotlin.jvm.internal.a;

public class LoginHelper	// class@001aea
{
    public KeyPair a;
    public boolean b;
    public static long c;

    public void LoginHelper(){
       super();
    }
    public static boolean a(Throwable p0,int p1){
       LoginUserResponse obj2;
       Object[] objArray;
       Object[] obj3;
       LoginUserResponse mDestroyAcco;
       Activity obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LoginHelper loginHelper = LoginHelper.class;
       String str = "1";
       t$a obj1 = null;
       if (PatchProxy.isSupport(loginHelper)) {
          obj2 = PatchProxy.applyTwoRefs(obj, Integer.valueOf(p1), obj1, loginHelper, str);
          if (obj2 != patchProxyRe) {
             return obj2.booleanValue();
          }
       }
       int i = 0;
       if (obj instanceof KwaiException) {
          obj2 = obj.mResponse.a();
          KwaiException mErrorCode = obj.mErrorCode;
          HashMap hashMap = new HashMap();
          hashMap.put("login_type", Integer.valueOf(p1));
          hashMap.put("resultMsg", obj.mErrorMessage);
          String str1 = "error_url";
          hashMap.put(str1, obj.mResponse.d());
          if (obj2 != null && !TextUtils.x(obj2.mQuickLoginToken)) {
             a.t(obj2.mQuickLoginToken);
             a.u(obj2.mQuickloginTokenExpireTime);
          }
          obj = ActivityContext.g().e();
          int i1 = 4;
          int i2 = 3;
          int i3 = 5;
          if (PatchProxy.isSupport(f.class)) {
             objArray = new Object[i3];
             objArray[i] = obj;
             objArray[1] = Integer.valueOf(mErrorCode);
             objArray[2] = obj2;
             objArray[i2] = obj1;
             objArray[i1] = hashMap;
             obj3 = PatchProxy.apply(objArray, obj1, f.class, str);
             if (obj3 != patchProxyRe) {
                i = obj3.booleanValue();
             }
          }
          if (f.i(mErrorCode) && obj instanceof GifshowActivity) {
             if (PatchProxy.isSupport2(f.class, "2")) {
                obj3 = new Object[i3];
                obj3[i] = obj;
                obj3[1] = Integer.valueOf(mErrorCode);
                obj3[2] = obj2;
                obj3[i2] = obj1;
                obj3[i1] = hashMap;
                if (PatchProxy.applyVoid(obj3, obj1, f.class, "2")) {
                label_0276 :
                   i = true;
                }
             }
             t$a uoa = new t$a(obj);
             uoa.W0(R.string.arg_RES_7f10004b);
             objArray = (mErrorCode != 0x4e3c && mErrorCode != 0x4e3d)? 0: 1;
             int i4 = (objArray)? 0x7f10004d: 0x7f10004e;
             uoa.y0(i4);
             uoa.z(i);
             if (!PatchProxy.isSupport(f.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(mErrorCode), obj1, f.class, "8")) {
                switch (mErrorCode){
                    case 0x4e3a:
                      f.g(i2);
                      break;
                    case 0x4e3b:
                      f.g(i1);
                      break;
                    case 0x4e3c:
                      f.g(1);
                      break;
                    case 0x4e3d:
                      f.g(2);
                      break;
                    default:
                }
             }
             if (mErrorCode != 0x4e71) {
                if (mErrorCode != 0x4e9a) {
                   b uob = 0x7f104ef7;
                   switch (mErrorCode){
                       case 0x4e3a:
                         if (obj2 != null) {
                            uoa.S0(R.string.arg_RES_7f1042c0);
                            uoa.u0(new b(obj, obj2, obj1));
                            uoa.Q0(R.string.cancel);
                            uoa.t0(new k(obj2));
                            j.d(uoa);
                         }
                         break;
                       case 0x4e3b:
                         if (obj2 != null) {
                            obj2.mLoginSource = 18;
                            uoa.S0(R.string.arg_RES_7f1042c0);
                            uoa.u0(new c(obj, obj2, obj1));
                            uoa.Q0(R.string.arg_RES_7f1015ac);
                            uoa.t0(new a(obj, obj2, obj1));
                            j.d(uoa);
                         }
                         break;
                       case 0x4e3c:
                         if (obj2 != null && obj2.mBindVerifyTokenInfo != null) {
                            uoa.S0(uob);
                            uoa.u0(new d(obj, obj2, obj1));
                            uoa.Q0(R.string.cancel);
                            uoa.t0(new l(obj2));
                            j.d(uoa);
                         }
                         break;
                       case 0x4e3d:
                         if (obj2 != null && obj2.mBindVerifyTokenInfo != null) {
                            obj2.mLoginSource = 19;
                            uoa.S0(uob);
                            uoa.u0(new e(obj, obj2, obj1));
                            uoa.Q0(R.string.arg_RES_7f1015ac);
                            uoa.t0(new h(obj, obj2, obj1));
                            j.d(uoa);
                         }
                         break;
                       default:
                   }
                }else {
                   str = hashMap.get(str1).toString();
                   if (TextUtils.x(str)) {
                      AccountFreezeConfig mUnFreezeUrl = a.a(AccountFreezeConfig.class).mUnFreezeUrl;
                      if (!TextUtils.x(mUnFreezeUrl)) {
                      }
                   }else {
                   }
                }
             }else {
                n.C(obj);
                if (obj2 != null) {
                   f3.l("", "SHOW_CANCEL_ACCOUNT_POPUP_WINDOWS").g();
                   uoa = new t$a(obj);
                   String str2 = (TextUtils.x(obj2.mDestroyAccountPopupText))? obj.getString(R.string.arg_RES_7f103062): obj2.mDestroyAccountPopupText;
                   uoa.z0(str2);
                   str2 = (TextUtils.x(obj2.mDestroyAccountButtonTextLeft))? obj.getString(R.string.arg_RES_7f103060): obj2.mDestroyAccountButtonTextLeft;
                   uoa.R0(str2);
                   str2 = (TextUtils.x(obj2.mDestroyAccountButtonTextRight))? obj.getString(R.string.arg_RES_7f103061): obj2.mDestroyAccountButtonTextRight;
                   uoa.T0(str2);
                   uoa.u0(new i(obj, obj2, hashMap));
                   uoa.t0(new a(obj2, obj, hashMap));
                   uoa.z(i);
                   j.d(uoa);
                }
             }
          label_0273 :
             PatchProxy.onMethodExit(f.class, "2");
             goto label_0276 ;
          }
       }
    label_0277 :
       return i;
    }
    public static String b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LoginHelper.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          if (a.t().d("encryptPhoneNum", false) && KSecurity.isInitialize()) {
             p0 = b.b().a(KSecurity.atlasEncrypt(p0.getBytes()));
          }
          return p0;
       }catch(com.kuaishou.android.security.base.exception.KSException e3){
          e3.printStackTrace();
          return "";
       }
    }
    public static void e(LoginUserResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, LoginHelper.class, "10")) {
          return;
       }
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putBoolean("first_login", false);
       g.a(uEditor);
       if (p0 != null) {
          LoginUserResponse mUserInfo = p0.mUserInfo;
          if (mUserInfo != null) {
             e.s0(mUserInfo.mName);
             e.p0(Arrays.asList(p0.mUserInfo.mHeadUrls));
          }
       }
       return;
    }
    public static void g(Activity p0,LoginUserResponse p1,boolean p2,ActivityPendingLaunchUtil$PendingCategory p3,String p4,boolean p5){
       ActivityPendingLaunchUtil$c uoc;
       LoginHelper loginHelper = LoginHelper.class;
       if (PatchProxy.isSupport(loginHelper)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),p3,p4,Boolean.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, null, loginHelper, "9")) {
             return;
          }
       }
       LoginHelper.e(p1);
       if (!p5) {
          l$a uoa = l$a.a("onAfterLoginFinished");
          if (p2 || (p1 != null && (p1.mIsNewRegisterUser != null || p1.mIsNewThirdPlatformUser != null))) {
             uoa.a = true;
          }
          List list = a.l(new LoginHelper$4().getType());
          if (!q.f(list) && list.size() > 1) {
             uoa.b();
          }
          uoa.c();
          LoginHelper.c = System.currentTimeMillis();
       }
       if (p1 != null && (p1.mIsNewThirdPlatformUser != null || (p1.mBindPhoneRequired != null && !p2))) {
          if (p3 == null) {
             p3 = ActivityPendingLaunchUtil$PendingCategory.NEW_OTHER_PLATFORM_REGISTER;
          }
          uoc = new ActivityPendingLaunchUtil$c(p3, p4);
       }else if(p2){
          uoc = new ActivityPendingLaunchUtil$c(ActivityPendingLaunchUtil$PendingCategory.NEW_PHONE_REGISTER, p4);
       }else {
          uoc = null;
       }
       if (uoc != null) {
          if (("dialog").equals(p4)) {
             ActivityPendingLaunchUtil.c(null, uoc);
          }else {
             ActivityPendingLaunchUtil.c(m.a().w50(), uoc);
          }
       }
       if (p0 != null && (!("auto_dialog").equals(p4) && !("welcome_back_login").equals(p4))) {
          p0.setResult(-1);
          p0.finish();
       }
    label_00c0 :
       return;
    }
    public void c(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LoginHelper.class, "4")) {
          return;
       }
       if (this.a != null) {
          String str = String.valueOf(System.currentTimeMillis());
          String str1 = "raw";
          try{
             p0.put(str1, str);
             p0.put("secret", d.j(this.a.getPrivate(), str));
          }catch(java.security.InvalidKeyException e4){
          }catch(java.security.NoSuchAlgorithmException e4){
          }catch(java.io.UnsupportedEncodingException e4){
          }catch(java.security.SignatureException e4){
          }
          e4.printStackTrace();
       }
       return;
    }
    public t d(){
       LoginHelper obj = PatchProxy.apply(null, this, LoginHelper.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj == null && this.b == null) {
          return d.b().doOnNext(new c(this)).doOnError(new d(this));
       }
       return t.just(obj);
    }
    public void f(LoginUserResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LoginHelper.class, "12")) {
          return;
       }
       if (q.f(a.l(new LoginHelper$5(this).getType()))) {
          return;
       }
       if (p0 != null && p0.mUserInfo != null) {
          e.U((QCurrentUser.ME.getId()).equals(p0.mUserInfo.mId));
       }else {
          e.U(false);
       }
       b.a(-1878684066).h();
       QCurrentUser.ME.clearUserPreferenceValues();
       n$a uoa = n$a.a("logoutFeatures");
       uoa.a = true;
       uoa.b();
       return;
    }
    public void h(LoginUserResponse p0){
       LoginHelper loginHelper1;
       String str2;
       UserInfo userInfo;
       UserInfo userInfo1;
       e uoe1;
       QCurrentUser obj = this;
       Iterator obj1 = p0;
       g0 og0 = g0.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LoginHelper loginHelper = LoginHelper.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, loginHelper, "5")) {
          return;
       }
       String str = "loginSource";
       if (obj1 != null) {
          j.a = obj1.mSkipResetAfterSucc;
          j.i(obj1.mSkipUploadContact);
          List list = a.l(new LoginHelper$2(obj).getType());
          a.t(obj1.mQuickLoginToken);
          String str1 = str;
          a.u(obj1.mQuickloginTokenExpireTime);
          if (PatchProxy.applyVoidOneRefs(obj1, obj, loginHelper, "7") || !a.a().c()) {
          label_0081 :
             loginHelper1 = loginHelper;
          }else {
             LoginUserResponse mUserInfo = obj1.mUserInfo;
             str = "";
             if (mUserInfo != null) {
                userInfo = mUserInfo.mId;
                userInfo1 = mUserInfo.mName;
             }else {
                userInfo1 = str;
             }
             e uoe = e.c();
             LoginUserResponse mQuickLoginT = obj1.mQuickLoginToken;
             Objects.requireNonNull(uoe);
             if (PatchProxy.applyVoidThreeRefs(userInfo, userInfo1, mQuickLoginT, uoe, e.class, "1") || !a.a().c()) {
                goto label_0081 ;
             }else {
                loginHelper1 = loginHelper;
                int i = 0;
                if (uoe.b().size() >= 20) {
                   uoe.b().remove(i);
                }
                while (true) {
                   if (i < uoe.b().size()) {
                      if (userInfo.equals(uoe.b().get(i).mUid) && (uoe.a()).equals(uoe.b().get(i).mEnv)) {
                         uoe1 = -1;
                      label_00df :
                         if (i != uoe1) {
                            uoe.b().remove(i);
                         }
                         List list2 = uoe.b();
                         DebugAccountInfo uDebugAccoun = PatchProxy.applyThreeRefs(userInfo, userInfo1, mQuickLoginT, uoe, e.class, "2");
                         if (uDebugAccoun != patchProxyRe) {
                         }else {
                            uDebugAccoun = new DebugAccountInfo(uoe.a(), userInfo, userInfo1, mQuickLoginT);
                         }
                         list2.add(uDebugAccoun);
                         if (!PatchProxy.applyVoid(null, uoe, e.class, "7")) {
                            SharedPreferences$Editor uEditor1 = n.b().edit();
                            uEditor1.putString("debug_account_login_info", b.e(uoe.a));
                            g.a(uEditor1);
                         }
                      }else {
                         i = i + 1;
                      }
                   }else {
                      uoe1 = -1;
                      i = -1;
                      goto label_00df ;
                   }
                }
             }
          }
          if (q.f(list) || (!q.f(list) && list.size() < 2)) {
             a.q(System.currentTimeMillis());
          }
          obj = QCurrentUser.ME.startEdit();
          k.c.b(obj1);
          LoginUserResponse mNewTokenCli = (!TextUtils.x(obj1.mNewTokenClientSalt))? obj1.mNewTokenClientSalt: obj1.mTokenClientSalt;
          if (!PatchProxy.applyVoidOneRefs(obj1, null, og0, "4") && (!TextUtils.x(obj1.mPassToken) && (TextUtils.x(obj1.mApiServiceToken) || TextUtils.x(obj1.mH5ServiceToken)))) {
             i3 oi31 = g0.a();
             oi31.d("token", obj1.mToken);
             oi31.d("passToken", obj1.mPassToken);
             oi31.d("apiServiceToken", obj1.mApiServiceToken);
             oi31.d("h5ServiceToken", obj1.mH5ServiceToken);
             str2 = str1;
             oi31.c(str2, Integer.valueOf(obj1.mLoginSource));
             u1.R("LOGIN_TOKEN_ERROR", oi31.e(), 9);
          }else {
             str2 = str1;
          }
          obj.setToken(obj1.mToken).setSecurityToken(obj1.mSecurityToken).setTokenClientSalt(mNewTokenCli).setIsNewRegisterUser(obj1.mIsNewRegisterUser).setPassToken(obj1.mPassToken).setApiServiceToken(obj1.mApiServiceToken).setH5ServiceToken(obj1.mH5ServiceToken);
          mNewTokenCli = obj1.mUserInfo;
          if (mNewTokenCli != null) {
             SharedPreferences$Editor uEditor = a.a.edit();
             uEditor.putString("UserId", mNewTokenCli.mId);
             g.a(uEditor);
             obj.setId(obj1.mUserInfo.mId).setKwaiId(obj1.mUserInfo.mKwaiId).setName(obj1.mUserInfo.mName).setSex(obj1.mUserInfo.mSex).setText(obj1.mUserInfo.mText).setAvatar(obj1.mUserInfo.mHeadUrl).setAvatars(obj1.mUserInfo.mHeadUrls).setDefaultHead(obj1.mUserInfo.mDefaultHead).setPendantType(obj1.mUserInfo.mPendantType).setPendants(obj1.mUserInfo.mAvatarPendants).setBackground(obj1.mUserInfo.mProfileBgUrl).setBackgrounds(obj1.mUserInfo.mProfileBgUrls);
             UserInfo mProfilePage = obj1.mUserInfo.mProfilePageInfo;
             if (mProfilePage != null) {
                obj.setUserType(mProfilePage.mUserType);
             }
          }
          obj.commitChanges();
       }else {
          loginHelper1 = loginHelper;
          str2 = str;
       }
       LoginUserResponse mLoginSource = (obj1 != null)? obj1.mLoginSource: -1;
       if (PatchProxy.isSupport(loginHelper1)) {
          loginHelper = this;
          if (PatchProxy.applyOneRefs(Integer.valueOf(mLoginSource), loginHelper, loginHelper1, "8") != patchProxyRe) {
          }else {
          label_0281 :
             List list1 = a.l(new LoginHelper$3(loginHelper).getType());
             if (list1 == null) {
                list1 = new ArrayList();
             }
             y.q(list1, Predicates.f());
             obj1 = list1.iterator();
             while (true) {
                if (obj1.hasNext()) {
                   SwitchAccountModel switchAccoun = obj1.next();
                   if (!TextUtils.x(QCurrentUser.ME.getId())) {
                      if ((QCurrentUser.ME.getId()).equals(switchAccoun.mUserId)) {
                         switchAccoun.mNickName = QCurrentUser.me().getName();
                         switchAccoun.mAvatar = QCurrentUser.me().getAvatar();
                         switchAccoun.mAvatars = QCurrentUser.me().getAvatars();
                         switchAccoun.mLastTimeRefreshServiceToken = a.d();
                         switchAccoun.mPassToken = QCurrentUser.ME.getPassToken();
                         switchAccoun.mApiServiceToken = QCurrentUser.ME.getApiServiceToken();
                         switchAccoun.mH5ServiceToken = QCurrentUser.ME.getH5ServiceToken();
                         switchAccoun.mToken = QCurrentUser.ME.getToken();
                         switchAccoun.mSecurityToken = QCurrentUser.ME.getSecurityToken();
                         switchAccoun.mTokenClientSalt = QCurrentUser.ME.getTokenClientSalt();
                         a.x(list1);
                         break ;
                      }else {
                         continue ;
                      }
                   }
                }else {
                   SwitchAccountModel switchAccoun1 = new SwitchAccountModel();
                   switchAccoun1.mNickName = QCurrentUser.ME.getDisplayName();
                   switchAccoun1.mToken = QCurrentUser.ME.getToken();
                   switchAccoun1.mAvatars = QCurrentUser.ME.getAvatars();
                   switchAccoun1.mUserId = QCurrentUser.ME.getId();
                   switchAccoun1.mSex = QCurrentUser.ME.getSex();
                   switchAccoun1.mProfileBgUrl = QCurrentUser.ME.getBackgroundUrl();
                   switchAccoun1.mProfileBgUrls = QCurrentUser.ME.getBackgroundUrls();
                   switchAccoun1.mKwaiId = QCurrentUser.ME.getKwaiId();
                   switchAccoun1.mSecurityToken = QCurrentUser.ME.getSecurityToken();
                   switchAccoun1.mTokenClientSalt = QCurrentUser.ME.getTokenClientSalt();
                   switchAccoun1.mAvatar = QCurrentUser.ME.getAvatar();
                   switchAccoun1.mPassToken = QCurrentUser.ME.getPassToken();
                   switchAccoun1.mApiServiceToken = QCurrentUser.ME.getApiServiceToken();
                   switchAccoun1.mH5ServiceToken = QCurrentUser.ME.getH5ServiceToken();
                   switchAccoun1.mLastTimeRefreshServiceToken = a.d();
                   switchAccoun1.mLoginType = a.c();
                   list1.add(switchAccoun1);
                   k c = k.c;
                   Objects.requireNonNull(c);
                   k ok = k.class;
                   if (!PatchProxy.isSupport(ok) || !PatchProxy.applyVoidTwoRefs(switchAccoun1, Integer.valueOf(mLoginSource), c, ok, "3")) {
                      a.p(switchAccoun1, "account");
                      if (TextUtils.x(switchAccoun1.mToken) || (TextUtils.x(switchAccoun1.mPassToken) || (!TextUtils.x(switchAccoun1.mApiServiceToken) && (TextUtils.x(switchAccoun1.mH5ServiceToken) && (!PatchProxy.isSupport(og0) || !PatchProxy.applyVoidTwoRefs(switchAccoun1, Integer.valueOf(mLoginSource), null, og0, "7")))))) {
                         i3 oi3 = g0.a();
                         oi3.d("accountUid", switchAccoun1.mUserId);
                         oi3.d("token", switchAccoun1.mToken);
                         oi3.d("passToken", switchAccoun1.mPassToken);
                         oi3.d("apiServiceToken", switchAccoun1.mApiServiceToken);
                         oi3.d("h5ServiceToken", switchAccoun1.mH5ServiceToken);
                         oi3.c(str2, Integer.valueOf(mLoginSource));
                         String str3 = oi3.e();
                         u1.R("CREATE_ACCOUNT_ERROR", str3, 9);
                      }
                   }
                   a.x(list1);
                   break ;
                }
             }
          }
       }else {
          loginHelper = this;
          goto label_0281 ;
       }
       return;
    }
}
