package com.yxcorp.login.userlogin.pluginimpl.LoginPluginImpl;
import pv5.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import o1d.c;
import q2b.h$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import k2b.e0;
import k2b.u1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import android.app.Application;
import o56.a;
import com.kwai.feature.api.social.login.model.PhoneVerifyParams$b;
import com.kwai.feature.api.social.login.model.PhoneVerifyParams;
import android.content.Context;
import n3d.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.net.URL;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.kwai.feature.api.social.login.model.BindPhoneParams$b;
import com.kwai.feature.api.social.login.model.BindPhoneParams$FirstStepPageStyle;
import com.kwai.feature.api.social.login.model.BindPhoneParams;
import java.util.Map;
import n3d.a;
import d2d.x;
import lnc.c3$a;
import lnc.c3;
import com.yxcorp.login.util.x;
import da6.a;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.HashMap;
import p1d.b;
import q1d.a;
import gud.a;
import brd.t;
import d2d.y;
import com.yxcorp.login.userlogin.pluginimpl.e;
import erd.g;
import crd.b;
import com.yxcorp.login.debuglogin.DebugLoginActivity;
import android.content.Intent;
import ov5.e;
import com.kwai.feature.api.social.login.model.LoginParams;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import r1d.q0;
import com.yxcorp.login.userlogin.activity.LoginActivity;
import com.yxcorp.login.userlogin.activity.FullScreenLoginActivity;
import com.yxcorp.login.loginaction.LoginHelper;
import s1d.a;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;
import com.yxcorp.login.userlogin.activity.QRCodeLoginActivity;
import com.yxcorp.login.userlogin.pluginimpl.LoginPluginImpl$a;
import ou5.a;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import x2d.a$a;
import x2d.a;
import android.os.Bundle;
import com.yxcorp.gifshow.widget.adpter.bottomSheet.c;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.c;
import android.content.ComponentName;
import com.yxcorp.login.userlogin.selectcountry.SelectCountryActivity;
import java.util.List;
import com.yxcorp.login.userlogin.pluginimpl.LoginPluginImpl$3;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import h3b.a;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import com.kwai.feature.api.social.login.model.SwitchAccountModel;
import com.yxcorp.login.helper.d;
import o1d.k;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import tid.b;
import java.util.Set;
import java.util.Iterator;
import r4d.a;
import java.lang.Exception;
import wkd.b;
import mu7.e;
import com.kuaishou.weapon.i.WeaponHI;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import o1d.a;
import java.lang.StringBuilder;
import o1d.g;
import oe6.e;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.Collections;
import java.util.Arrays;
import com.yxcorp.login.loginaction.LoginHelper$1;
import android.content.SharedPreferences;
import ua6.b;
import ua6.b$a;
import ia0.c;
import mw4.a;
import m1d.a;
import cjd.e;
import erd.o;
import com.yxcorp.login.loginaction.b;
import com.yxcorp.login.loginaction.a;
import com.yxcorp.login.userlogin.pluginimpl.k;
import d2d.z;
import com.yxcorp.login.userlogin.pluginimpl.j;
import ov5.a;
import com.yxcorp.login.userlogin.LaunchLoginHelper;

public class LoginPluginImpl implements c	// class@00139d
{
    public static boolean b;
    public static String c;

    public void LoginPluginImpl(){
       super();
    }
    public static void F(int p0,String p1,String p2){
       if (!PatchProxy.isSupport(LoginPluginImpl.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, null, LoginPluginImpl.class, "14")) {
          c uoc = c.class;
          if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, uoc, "3")) {
             h$b uob = h$b.e(10, "BIND_ACCOUNT_FAIL_RESULT");
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "BIND_ACCOUNT_FAIL_RESULT";
             i3 oi3 = i3.f();
             oi3.c("code", Integer.valueOf(p0));
             uElementPack.params = oi3.e();
             uob.k(uElementPack);
             u1.p0("", null, uob);
          }
       }
       return;
    }
    public static void S(int p0,String p1,String p2){
       LoginPluginImpl loginPluginI = LoginPluginImpl.class;
       if (!PatchProxy.isSupport(loginPluginI) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, null, LoginPluginImpl.class, "15")) {
          if (TextUtils.x(p2)) {
             if (!PatchProxy.applyVoidOneRefs(p1, null, loginPluginI, "18") && QCurrentUser.me().isLogined()) {
                PhoneVerifyParams$b uob = new PhoneVerifyParams$b();
                uob.h(p1);
                uob.f(true);
                d.a(-1712118428).ZD(a.b(), uob.a()).h();
             }
          }else {
             LoginPluginImpl.z0(p2);
          }
       }
       return;
    }
    public static boolean g0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LoginPluginImpl.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       try{
          p0 = new URL(p0).getPath();
          if (!TextUtils.x(p0) && p0.equals(LoginPluginImpl.c)) {
             b = true;
          }
       label_002d :
          return e0;
       }catch(java.net.MalformedURLException e0){
       }
    }
    public static void n(int p0,String p1,String p2){
       LoginPluginImpl loginPluginI = LoginPluginImpl.class;
       if (!PatchProxy.isSupport(loginPluginI) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, null, LoginPluginImpl.class, "13")) {
          if (TextUtils.x(p2)) {
             if (!PatchProxy.applyVoidOneRefs(p1, null, loginPluginI, "17") && QCurrentUser.me().isLogined()) {
                BindPhoneParams$b uob = new BindPhoneParams$b();
                uob.f(BindPhoneParams$FirstStepPageStyle.ORIGIN_BIND_PAGE_FIRST);
                uob.m(false);
                uob.g(p1);
                uob.n(true);
                d.a(-1712118428).ew(ActivityContext.g().e(), uob.a(), null, "unknown", null);
             }
          }else {
             LoginPluginImpl.z0(p2);
          }
       }
       return;
    }
    public static void z0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, LoginPluginImpl.class, "16")) {
          return;
       }
       c3.c(ActivityContext.g().e(), new x(p0));
       return;
    }
    public void HF(){
       if (PatchProxy.applyVoid(null, this, LoginPluginImpl.class, "25")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, null, x.class, "1")) {
          a.c(0);
          x.a(RequestTiming.DEFAULT);
       }
       return;
    }
    public void He(GifshowActivity p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LoginPluginImpl.class, "26")) {
          return;
       }
       HashMap hashMap = new HashMap();
       hashMap.put("email", p1);
       hashMap.put("password", a.f("0"));
       t ot = a.a(4).b(p0, hashMap);
       ot.subscribe(new y(p0), e.b);
       return;
    }
    public void Js(GifshowActivity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LoginPluginImpl.class, "28")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, DebugLoginActivity.class, "2")) {
          p0.startActivity(new Intent(p0, DebugLoginActivity.class));
       }
       return;
    }
    public void P30(GifshowActivity p0,e p1,String p2,LoginParams p3,String p4){
       LoginParams$a uoa;
       LoginPluginImpl loginPluginI = LoginPluginImpl.class;
       if (PatchProxy.isSupport(loginPluginI)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, loginPluginI, "8")) {
             return;
          }
       }
       if (p3 == null) {
          uoa = new LoginParams$a();
          uoa.f(LoginParams.getStartPage());
          uoa.g(LoginParams.generateLoginSessionId());
          uoa = uoa.a();
       }
       a.a(6).d(p0, 6, p2, p1, uoa, p4);
       return;
    }
    public boolean Uu(Context p0){
       boolean b = (p0 instanceof LoginActivity || p0 instanceof FullScreenLoginActivity)? true: false;
       return b;
    }
    public long Vs(){
       Object obj = PatchProxy.apply(null, this, LoginPluginImpl.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return LoginHelper.c;
    }
    public void WU(GifshowActivity p0,int p1,String p2,e p3){
       if (PatchProxy.isSupport(LoginPluginImpl.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, LoginPluginImpl.class, "27")) {
          return;
       }
       LoginParams$a uoa = new LoginParams$a();
       uoa.f(LoginParams.getStartPage());
       uoa.g(LoginParams.generateLoginSessionId());
       LoginParams loginParams = uoa.a();
       a.a(6).d(p0, p1, p2, p3, loginParams, "");
       return;
    }
    public void XA(RequestTiming p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LoginPluginImpl.class, "24")) {
          return;
       }
       c.k(new a(p0));
       return;
    }
    public void f10(GifshowActivity p0,String p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, LoginPluginImpl.class, "32")) {
          return;
       }
       p0.t1(new Intent(p0, QRCodeLoginActivity.class).setPackage(p0.getPackageName()).putExtra("qrLoginToken", p1).putExtra("loginText", p2).putExtra("qrLoginMessage", p3), 1927, new LoginPluginImpl$a(this, p0));
       return;
    }
    public void fp(GifshowActivity p0,String p1,String p2,String p3,a p4){
       LoginPluginImpl loginPluginI = LoginPluginImpl.class;
       if (PatchProxy.isSupport(loginPluginI)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, loginPluginI, "29")) {
             return;
          }
       }
       if (VisitorModeManager.f()) {
          return;
       }else {
          a$a a = new a$a(194, p1, p2, p3).a;
          a uoa = PatchProxy.applyTwoRefs(a, p4, null, a.class, "1");
          if (uoa != PatchProxyResult.class) {
          }else {
             uoa = new a(a, p4);
          }
          c uoc = new c(p0);
          uoc.L(uoa);
          uoc.k().Z();
          return;
       }
    }
    public ComponentName getCountryCodeActivityName(){
       Object obj = PatchProxy.apply(null, this, LoginPluginImpl.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ComponentName(a.b(), SelectCountryActivity.class);
    }
    public boolean isAvailable(){
       return true;
    }
    public List k6(){
       ArrayList uArrayList;
       List obj = PatchProxy.apply(null, this, LoginPluginImpl.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.l(new LoginPluginImpl$3(this).getType());
       if (q.f(obj)) {
          uArrayList = new ArrayList();
       }
       return uArrayList;
    }
    public t mi(SwitchAccountModel p0,int p1){
       LoginPluginImpl loginPluginI = LoginPluginImpl.class;
       if (PatchProxy.isSupport(loginPluginI)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, loginPluginI, "31");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new d().a(p0, p1);
    }
    public final void q0(){
       if (PatchProxy.applyVoid(null, this, LoginPluginImpl.class, "7")) {
          return;
       }
       QCurrentUser.ME.clearUserPreferenceValues();
       k c = k.c;
       try{
          c.b(null);
          ArrayList uArrayList = PatchProxy.apply(null, null, b.class, "1");
          if (uArrayList != PatchProxyResult.class) {
          label_0032 :
             if (uArrayList.size() > 0) {
                Iterator iterator = uArrayList.iterator();
                while (iterator.hasNext()) {
                   a uoa = b.a(iterator.next().intValue(), a.B);
                   if (uoa != null) {
                      uoa.logout();
                   }
                }
             }
          }else {
             uArrayList = new ArrayList(b.a.keySet());
             goto label_0032 ;
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       b.a(-1878684066).h();
       a.x(null);
       return;
    }
    public void uA(Activity p0,g p1){
       String[] obj4;
       Object obj = this;
       String obj1 = p0;
       Object obj2 = p1;
       LoginHelper loginHelper = LoginHelper.class;
       LoginPluginImpl loginPluginI = LoginPluginImpl.class;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, loginPluginI, "5")) {
          return;
       }
       QCurrentUser mE = QCurrentUser.ME;
       if (!mE.isLogined()) {
          this.q0();
          return;
       }else {
          WeaponHI.t(1003);
          ProgressFragment progressFrag = new ProgressFragment();
          if (obj1 instanceof FragmentActivity) {
             progressFrag.Ih(R.string.arg_RES_7f103667);
             progressFrag.show(obj1.getSupportFragmentManager(), "logout");
          }
          obj1 = mE.getId();
          PatchProxyResult obj3 = null;
          if (!PatchProxy.applyVoidOneRefs(obj1, obj3, a.class, "18")) {
             obj4 = new String[]{"帐号日志"};
             g.c("开始退出登录,uid="+obj1, obj4);
          }
          Map mapFromUserP = mE.getMapFromUserPreference();
          HashMap hashMap = new HashMap();
          hashMap.put("client_salt", mE.getTokenClientSalt());
          String str = "kuaishou.api_st";
          hashMap.put(str, QCurrentUser.ME.getApiServiceToken());
          obj1 = "6";
          if (!PatchProxy.applyVoid(obj3, obj3, loginHelper, obj1)) {
             e.s0(QCurrentUser.ME.getName());
             List list1 = (QCurrentUser.ME.getAvatars() == null)? Collections.emptyList(): Arrays.asList(QCurrentUser.ME.getAvatars());
             e.p0(list1);
          }
          obj3 = PatchProxyResult.class;
          t ot = PatchProxy.applyOneRefs(hashMap, obj, loginPluginI, obj1);
          if (ot != obj3) {
          }else {
             LoginHelper loginHelper1 = new LoginHelper();
             t ot1 = PatchProxy.applyOneRefs(hashMap, loginHelper1, loginHelper, "2");
             if (ot1 != obj3) {
             }else {
                String str1 = hashMap.get("client_salt");
                String str2 = hashMap.get(str);
                e.U(false);
                List list = a.l(new LoginHelper$1(loginHelper1).getType());
                hashMap = new HashMap();
                hashMap.put("forceLogout", Boolean.valueOf(e.a.getBoolean("LogoutShownSetPasswordDialog", false)));
                String str3 = b.c.a().e().a();
                if (!TextUtils.x(str3)) {
                   hashMap.put("token", str3);
                }
                if (q.f(list) || list.size() == 1) {
                   hashMap.put("client_salt", str1);
                   if (!TextUtils.x(str2)) {
                      hashMap.put(str, str2);
                   }
                   ot1 = b.a(0x5cfaafff).M(hashMap).map(new e()).doOnNext(a.b);
                }else {
                   ArrayList uArrayList = new ArrayList();
                   Iterator iterator = list.iterator();
                   String str4 = "";
                   while (iterator.hasNext()) {
                      SwitchAccountModel switchAccoun = iterator.next();
                      if (!TextUtils.x(switchAccoun.mApiServiceToken)) {
                         uArrayList.add(switchAccoun.mApiServiceToken);
                      }
                      if (!(QCurrentUser.ME.getId()).equals(switchAccoun.mUserId)) {
                         str4 = switchAccoun.mToken;
                      }
                   }
                   if (!a.h() && !TextUtils.x(str4)) {
                      hashMap.put("switchUserOldTokens", str4);
                   }
                   if (!TextUtils.x(str2)) {
                      hashMap.put(str, str2);
                   }
                   if (!TextUtils.x(str1)) {
                      hashMap.put("client_salt", str1);
                   }
                   if (!q.f(uArrayList)) {
                      hashMap.put("switchUserOldServiceTokens", uArrayList);
                   }
                   ot1 = b.a(0x5cfaafff).T(hashMap).map(new e()).doOnNext(b.b);
                }
             }
             ot = ot1.map(new k(obj));
          }
          obj4 = ot;
          j oj = new j(this, progressFrag, mapFromUserP, mE, p1);
          obj4.subscribe(new z(obj, progressFrag, obj2), hashMap);
          QCurrentUser.ME.clearUserPreferenceValues();
          return;
       }
    }
    public void wX(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LoginPluginImpl.class, "4")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, LaunchLoginHelper.class, "2")) {
          LaunchLoginHelper.a.remove(p0);
       }
       return;
    }
    public void xI(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LoginPluginImpl.class, "3")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, LaunchLoginHelper.class, "1")) {
          LaunchLoginHelper.a.add(p0);
       }
       return;
    }
}
