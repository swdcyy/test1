package com.yxcorp.login.userlogin.pluginimpl.c;
import ou5.b;
import java.lang.Object;
import com.yxcorp.login.http.response.AuthInfoResponse;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.login.http.response.AuthInfoResponse$Scope;
import java.util.ArrayList;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.Context;
import com.yxcorp.login.bind.ChangePhoneCheckActivity;
import android.content.Intent;
import java.lang.Boolean;
import w0d.f;
import com.yxcorp.gifshow.activity.GifshowActivity;
import n3d.a;
import java.lang.Integer;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import com.kwai.feature.api.social.login.model.LoginParams;
import d2d.r;
import com.yxcorp.login.util.LoginPageLauncher;
import com.yxcorp.login.util.LoginPageLauncher$LoginType;
import com.yxcorp.login.util.LoginPageLauncher$a;
import androidx.fragment.app.FragmentActivity;
import ou5.a;
import brd.t;
import b3d.n0;
import com.yxcorp.login.util.p;
import io.reactivex.g;
import t45.d;
import brd.z;
import b3d.m0;
import erd.g;
import b3d.l0;
import erd.a;
import com.kwai.feature.api.social.login.model.PhoneVerifyParams;
import n3d.d;
import okd.b;
import x1d.c;
import android.app.Activity;
import com.kwai.feature.api.social.login.model.BindPhoneParams;
import java.util.Map;
import java.util.HashMap;
import w1d.h;
import d2d.t;
import com.kwai.feature.api.social.login.model.AuthSource;
import wkd.b;
import m1d.a;
import m1d.e;
import cjd.e;
import erd.o;
import d2d.h;
import d2d.i;
import crd.b;
import com.yxcorp.login.userlogin.pluginimpl.a;
import d2d.s;
import d2d.p;
import com.yxcorp.login.util.LoginPageLauncher$b;
import rkd.b;
import com.yxcorp.login.userlogin.activity.AccountSecurityActivityTablet;
import com.yxcorp.login.userlogin.activity.AccountSecurityActivity;
import ov5.b;
import com.yxcorp.login.userlogin.fragment.LogoutDialogFragment$a;
import com.yxcorp.login.userlogin.fragment.LogoutDialogFragment;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import d2d.e;
import android.content.DialogInterface$OnCancelListener;
import androidx.fragment.app.KwaiDialogFragment;
import d2d.m;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.c;
import java.lang.IllegalStateException;
import d2d.g;
import d2d.k;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import oe6.e;
import android.text.TextUtils;
import fg6.a;
import com.google.gson.Gson;
import d2d.u;
import x1d.f;
import com.google.gson.JsonObject;
import com.yxcorp.login.http.response.AuthInfoResponse$UserInfo;
import java.lang.Number;
import com.yxcorp.login.http.response.AuthInfoResponse$PhoneNum;
import com.google.gson.JsonElement;
import d2d.l;
import d2d.j;
import com.yxcorp.login.userlogin.LaunchLoginHelper;
import o1d.a;
import o1d.g;
import d2d.q;
import com.yxcorp.login.userlogin.loginentryhelper.LoginEntrancePageManager;
import java.util.Objects;
import kotlin.jvm.internal.a;
import java.util.concurrent.atomic.AtomicBoolean;
import com.yxcorp.utility.SystemUtil;
import o56.c;
import o56.a;
import e17.i;
import z1d.d;
import ftd.j2;
import ftd.z0;
import ftd.z1;
import ftd.w;
import ftd.c3;
import kotlin.coroutines.CoroutineContext;
import asd.a;
import ftd.k0;
import ftd.l0;
import com.yxcorp.login.userlogin.loginentryhelper.LoginEntrancePageManager$startLogin$1;
import asd.c;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import kotlinx.coroutines.a;
import com.yxcorp.login.userlogin.selectcountry.SelectCountryActivity;

public class c implements b	// class@001b97
{

    public void c(){
       super();
    }
    public final String F(AuthInfoResponse p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, this, c.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       Iterator iterator = p0.mScopeList.iterator();
       while (iterator.hasNext()) {
          AuthInfoResponse$Scope scope = iterator.next();
          AuthInfoResponse$Scope mUserInfoLis = scope.mUserInfoList;
          if (mUserInfoLis == null || mUserInfoLis.size() <= 0) {
             mUserInfoLis = scope.mPhoneNumList;
             if (mUserInfoLis == null || mUserInfoLis.size() <= 0) {
             }
          }
          obj = obj+scope.mScope+",";
       }
       String str = obj;
       if (!TextUtils.x(str)) {
          return str.substring(0, (str.length() - 1));
       }
       return "";
    }
    public void OH(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "9")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, ChangePhoneCheckActivity.class, "1")) {
          p0.startActivity(new Intent(p0, ChangePhoneCheckActivity.class));
       }
       return;
    }
    public final boolean S(AuthInfoResponse p0){
       AuthInfoResponse$Scope obj = PatchProxy.applyOneRefs(p0, this, c.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Iterator iterator = p0.mScopeList.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          obj = iterator.next();
          if (obj.isGranted == null) {
             AuthInfoResponse$Scope mUserInfoLis = obj.mUserInfoList;
             if (mUserInfoLis == null || (mUserInfoLis.size() > 0 || (f.a(obj.mScope) && obj.mPhoneNumList != null))) {
                break ;
             }
          }
       }
       return true;
    }
    public void Ue(GifshowActivity p0,String p1,int p2,a p3){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, c.class, "13")) {
          return;
       }
       if (!QCurrentUser.ME.isLogined()) {
          r or = new r(this, p0, p1, p2, p3);
          this.x00(p0, 127, new LoginParams$a().a(), v8);
       }else {
          this.n(p0, p1, p2, p3);
       }
       return;
    }
    public void Vl(Context p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "11")) {
          return;
       }
       LoginPageLauncher loginPageLau = LoginPageLauncher.i.a(LoginPageLauncher$LoginType.SWITCH_ACCOUNT);
       loginPageLau.b(p0);
       loginPageLau.i(8);
       loginPageLau.h(p1);
       loginPageLau.f();
       return;
    }
    public t W00(FragmentActivity p0,int p1,boolean p2,LoginParams p3,a p4){
       Object[] objArray;
       n0 obj;
       t ot;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       int i = 4;
       int i1 = 3;
       int i2 = 1;
       int i3 = 0;
       if (PatchProxy.isSupport(uoc)) {
          objArray = new Object[]{p0,Integer.valueOf(p1),Boolean.valueOf(p2),p3,p4};
          obj = PatchProxy.apply(objArray, this, uoc, "8");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = n0.class;
       if (PatchProxy.isSupport(obj)) {
          objArray = new Object[]{p0,Integer.valueOf(p1),Boolean.valueOf(p2),p3,p4};
          ot = PatchProxy.apply(objArray, null, obj, "1");
          if (ot != patchProxyRe) {
          label_0078 :
             return ot;
          }
       }
       ot = t.create(new p(p1, p0, p3, p4)).subscribeOn(d.a).doOnNext(new m0(p2)).doFinally(new l0(p1));
       goto label_0078 ;
    }
    public d ZD(Context p0,PhoneVerifyParams p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c uoc = b.a(-1546603246).init(p0).d(p1);
       if (!p0 instanceof Activity) {
          uoc.Y(0x10000000);
       }
       uoc.Y(0x20000000);
       return uoc;
    }
    public void ew(Context p0,BindPhoneParams p1,Map p2,String p3,a p4){
       HashMap hashMap;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uoc, "5")) {
             return;
          }
       }
       if (p2 == null) {
          hashMap = new HashMap();
       }
       hashMap.put("bind_source", p3);
       p1.mCommonPageParams = hashMap;
       b.a(-439371630).Z(p0, p1, p4).K(0).w(new t(p4)).h();
       return;
    }
    public final void g0(GifshowActivity p0,String p1,String p2,String p3,String p4,String p5,int p6,AuthSource p7,a p8){
       object oobject = p8;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = p7;
          objArray[8] = oobject;
          if (PatchProxy.applyVoid(objArray, this, uoc, "16")) {
             return;
          }
       }else {
          int i = this;
       }
       h oh = new h(this, p8, p6, p1, p2, p4, p5, p0, p3, p7);
       b.a(0x5cfaafff).p(e.b(), p1, "", p2, p3, null, null, p5, p4).map(new e()).subscribe(v13, new i(oobject, p6));
       return;
    }
    public t gC(FragmentActivity p0,String p1,String p2,String p3,boolean p4,String p5,int p6,boolean p7,boolean p8,boolean p9,boolean p10){
       Object obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[11];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = Boolean.valueOf(p4);
          objArray[5] = p5;
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Boolean.valueOf(p7);
          objArray[8] = Boolean.valueOf(p8);
          objArray[9] = Boolean.valueOf(p9);
          objArray[10] = Boolean.valueOf(p10);
          obj = PatchProxy.apply(objArray, this, uoc, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a uoa = new a(this, p4, p8, p1, p5, p3, p6, p7, p9, p10, p0, p2);
       return t.create(obj);
    }
    public void i10(GifshowActivity p0,String p1,String p2,String p3,String p4,String p5,int p6,AuthSource p7,a p8){
       Object obj = this;
       object oobject = p0;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[9];
          objArray[0] = oobject;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = p7;
          objArray[8] = p8;
          if (PatchProxy.applyVoid(objArray, obj, uoc, "12")) {
             return;
          }
       }
       if (!QCurrentUser.ME.isLogined()) {
          s os = new s(this, p0, p1, p2, p3, p4, p5, p6, p7, p8);
          obj.x00(oobject, 127, new LoginParams$a().a(), v15);
       }else {
          this.g0(p0, p1, p2, p3, p4, p5, p6, p7, p8);
       }
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public void jE(Context p0,String p1,int p2,String p3,a p4){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uoc, "10")) {
             return;
          }
       }
       LoginPageLauncher loginPageLau = LoginPageLauncher.i.a(LoginPageLauncher$LoginType.RETRIEVE_PASSWORD);
       loginPageLau.b(p0);
       loginPageLau.c(new p(p1, p2, p3));
       loginPageLau.i(0);
       loginPageLau.h(p4);
       loginPageLau.f();
       return;
    }
    public void kn(GifshowActivity p0,int p1,a p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, c.class, "15")) {
          return;
       }
       AccountSecurityActivityTablet uAccountSecu = (b.g())? AccountSecurityActivityTablet.class: AccountSecurityActivity.class;
       p0.t1(new Intent(p0, uAccountSecu), p1, p2);
       return;
    }
    public void m50(FragmentActivity p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "4")) {
          return;
       }
       LogoutDialogFragment$a a = new LogoutDialogFragment$a().a;
       LogoutDialogFragment logoutDialog = PatchProxy.applyOneRefs(a, null, LogoutDialogFragment.class, "2");
       if (logoutDialog != PatchProxyResult.class) {
       }else {
          logoutDialog = new LogoutDialogFragment();
          logoutDialog.setArguments(a);
       }
       logoutDialog.oh(new e(p1));
       logoutDialog.k0(new m(p1));
       try{
          logoutDialog.u = p1;
          logoutDialog.show(p0.getSupportFragmentManager(), "logout_dialog");
       }catch(java.lang.IllegalStateException e5){
          e5.printStackTrace();
       }
       return;
    }
    public final void n(GifshowActivity p0,String p1,int p2,a p3){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, c.class, "20")) {
          return;
       }
       b.a(0x5cfaafff).g(p1).map(new e()).subscribe(new g(this, p3, p2, p0), new k(p3, p2));
       return;
    }
    public d ne(Context p0,String p1,String p2,int p3,String p4,BaseFeed p5,User p6,QPreInfo p7,a p8){
       if (PatchProxy.isSupport(c.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          p1 = PatchProxy.apply(objArray, this, c.class, "6");
          if (p1 != PatchProxyResult.class) {
             return p1;
          }
       }
       if (p5 != null || p6 != null) {
          p1 = e.v();
          if (!TextUtils.isEmpty(p1)) {
             p7 = a.a.h(p1, QPreInfo.class);
          }
       }
       LoginParams$a uoa = new LoginParams$a();
       uoa.c(p3);
       uoa.d(p4);
       uoa.h(p5);
       uoa.c = p7;
       LoginParams loginParams = uoa.a();
       if (p3 != 89 && (p3 == 4 || p3 == 81)) {
          loginParams.mPublishVideo = true;
       }
       d uod = b.a(-184892580);
       a[] uoaArray = new a[]{new u(p8, uod, uoaArray)};
       this.x00(p0, p3, loginParams, uoaArray[0]);
       return uod;
    }
    public d o00(Context p0,PhoneVerifyParams p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       f uof = b.a(0x72424aee).init(p0).d(p1);
       if (!p0 instanceof Activity) {
          uof.Y(0x10000000);
       }
       uof.Y(0x20000000);
       return uof;
    }
    public final void q0(String p0,String p1,String p2,String p3,int p4,AuthInfoResponse p5,a p6){
       AuthInfoResponse$Scope obj1;
       Iterator iterator1;
       Object obj = this;
       object oobject = p3;
       int i = p4;
       object oobject1 = p5;
       object oobject2 = p6;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,p2,oobject,Integer.valueOf(p4),oobject1,oobject2};
          if (PatchProxy.applyVoid(objArray, obj, uoc, "17")) {
             return;
          }
       }
       a uoa = b.a(0x5cfaafff);
       String str = e.c();
       String str1 = obj.F(oobject1);
       String str2 = PatchProxy.applyOneRefs(oobject1, obj, uoc, "19");
       if (str2 != PatchProxyResult.class) {
       }else {
          JsonObject jsonObject = new JsonObject();
          Iterator iterator = oobject1.mScopeList.iterator();
          while (iterator.hasNext()) {
             obj1 = iterator.next();
             AuthInfoResponse$Scope mUserInfoLis = obj1.mUserInfoList;
             if (mUserInfoLis != null && mUserInfoLis.size() > 0) {
                iterator1 = obj1.mUserInfoList.iterator();
                while (iterator1.hasNext()) {
                   AuthInfoResponse$UserInfo userInfo = iterator1.next();
                   if (userInfo.isSelected != null) {
                      jsonObject.a0(obj1.mScope, Integer.valueOf(userInfo.mUserIndex));
                   }else {
                      continue ;
                   }
                }
             }else {
                mUserInfoLis = obj1.mPhoneNumList;
                if (mUserInfoLis != null && mUserInfoLis.size() > 0) {
                   iterator1 = obj1.mPhoneNumList.iterator();
                   while (iterator1.hasNext()) {
                      AuthInfoResponse$PhoneNum phoneNum = iterator1.next();
                      if (phoneNum.isSelected != null) {
                         jsonObject.a0(obj1.mScope, Integer.valueOf(phoneNum.mPhoneIndex));
                      }else {
                         continue ;
                      }
                   }
                }
             }
          }
          str2 = jsonObject.toString();
       }
       obj1 = str2;
       uoa.h0(str, p0, p1, str1, "", null, obj1, oobject1.mConfirmToken, p2, false, p3).map(new e()).subscribe(new l(oobject, oobject2, i), new j(oobject2, i));
       return;
    }
    public void x00(Context p0,int p1,LoginParams p2,a p3){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, c.class, "7")) {
          return;
       }
       LaunchLoginHelper.b(p1);
       if (!PatchProxy.applyVoid(null, null, a.class, "1")) {
          String[] stringArray = new String[]{"帐号日志"};
          g.c("开始登录", stringArray);
       }
       if (p2 == null) {
          p2 = new LoginParams$a().a();
          if (p1 == 203 || p1 == 88) {
             p2.mPublishVideo = true;
          }
       }
       p2.mLoginSource = p1;
       if (TextUtils.x(p2.mSourcePage)) {
          p2.mSourcePage = LoginParams.getStartPage();
          p2.mSourcePageSessionId = LoginParams.generateLoginSessionId();
       }
       q oq = new q(p1, p3);
       LoginEntrancePageManager e = LoginEntrancePageManager.e;
       Objects.requireNonNull(e);
       if (!PatchProxy.applyVoidThreeRefs(p0, p2, oq, e, LoginEntrancePageManager.class, "1")) {
          a.p(p0, "context");
          a.p(p2, "loginParams");
          a.p(oq, "callback");
          if (LoginEntrancePageManager.b.get()) {
             if (SystemUtil.K()) {
                c uoc = a.a();
                a.o(uoc, "AppEnv.get\(\)");
                if (uoc.c()) {
                   i.d(R.style.arg_RES_7f110668, "正在登录流程，拦截登录页启动");
                }
             }
          }else {
             a.f(l0.a(z0.g().plus(c3.c(null, true, null))), null, null, new LoginEntrancePageManager$startLogin$1(new d(p0, p2, oq), oq, null), 3, null);
          }
       }
       return;
    }
    public void zk(GifshowActivity p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "14")) {
          return;
       }
       p0.t1(new Intent(p0, SelectCountryActivity.class), 1, p1);
       return;
    }
}
