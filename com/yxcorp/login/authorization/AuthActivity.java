package com.yxcorp.login.authorization.AuthActivity;
import w0d.g;
import w0d.h;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.login.authorization.AuthActivity$a;
import com.yxcorp.login.authorization.AuthActivity$b;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.StringBuilder;
import w0d.d;
import com.kwai.robust.PatchProxyResult;
import z0d.b;
import java.lang.Boolean;
import java.util.ArrayList;
import com.kwai.feature.api.social.login.model.AuthSource;
import k2b.e0;
import w0d.e;
import java.util.Objects;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.login.authorization.fragment.FullScreenAuthFragment;
import androidx.fragment.app.e;
import com.yxcorp.login.http.response.GrantAuthResponse;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.content.ComponentName;
import java.lang.Throwable;
import java.lang.Exception;
import com.yxcorp.login.authorization.mode.CheckedAgreementModel;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import ekd.j0;
import com.yxcorp.utility.TextUtils;
import org.json.JSONObject;
import org.json.JSONException;
import android.content.Context;
import lnc.n9;
import java.io.Serializable;
import com.yxcorp.login.http.response.AuthInfoResponse;
import android.content.res.Configuration;
import zf6.l;
import ekd.i;
import androidx.fragment.app.DialogFragment;
import android.content.DialogInterface$OnDismissListener;
import o56.a;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;
import java.util.HashMap;
import com.google.common.collect.Maps;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ThirdPartyAppPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import q2b.h$b;
import k2b.u1;
import com.yxcorp.login.authorization.fragment.HalfScreenAuthLandscapeFragment;
import com.yxcorp.login.authorization.fragment.HalfScreenAuthFragment;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.login.http.response.AuthInfoResponse$Scope;
import java.lang.CharSequence;
import com.google.gson.JsonObject;
import com.yxcorp.login.http.response.AuthInfoResponse$UserInfo;
import java.lang.Number;
import com.yxcorp.login.http.response.AuthInfoResponse$PhoneNum;
import com.google.gson.JsonElement;
import wkd.b;
import m1d.a;
import m1d.e;
import brd.t;
import cjd.e;
import erd.o;
import w0d.a;
import w0d.b;
import erd.g;
import crd.b;

public class AuthActivity extends GifshowActivity implements g, h	// class@001a2f
{
    public boolean A;
    public boolean B;
    public b C;
    public int D;
    public int E;
    public DialogInterface$OnDismissListener F;
    public final Application$ActivityLifecycleCallbacks G;
    public String y;
    public int z;
    public static final int H;

    public void AuthActivity(){
       super();
       this.y = "cancel";
       this.z = -1;
       this.A = false;
       this.D = 1;
       this.E = 0;
       this.F = new AuthActivity$a(this);
       this.G = new AuthActivity$b(this);
    }
    public void C2(int p0,String p1){
       AuthActivity uAuthActivit = AuthActivity.class;
       if (PatchProxy.isSupport(uAuthActivit) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uAuthActivit, "14")) {
          return;
       }
       d.b("AuthActivity", "onFailAndFinish\(\) called with: errCode = ["+p0+"], errMsg = ["+p1+"]");
       this.z = p0;
       this.y = p1;
       this.finish();
       return;
    }
    public void I0(){
       boolean b;
       e obj1;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AuthActivity uAuthActivit = AuthActivity.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uAuthActivit, "5")) {
          return;
       }
       d.b("AuthActivity", "changeNextFragment\(\) called");
       if (this.C.a()) {
          Object obj = PatchProxy.apply(objArray, this, uAuthActivit, "16");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(this.C.t.size() > 0){
             b = true;
          }else {
             b = false;
          }
          if (!b) {
             obj1 = PatchProxy.apply(objArray, this, uAuthActivit, "17");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else if(this.C.u.size() > 0){
                b1 = true;
             }else {
                b1 = false;
             }
             if (!b1) {
                uAuthActivit = this.C;
                e.d(this, this.C.n.getValue(), uAuthActivit.i, uAuthActivit.f, false);
                this.C2(0x2714, "no scopes is granted");
             }
          }
          this.y3(true);
       }else {
          AuthActivity tC = this.C;
          Objects.requireNonNull(tC);
          if (!PatchProxy.applyVoid(objArray, tC, b.class, "3")) {
             int i = tC.s.indexOf(tC.r) + true;
             if (i < tC.s.size()) {
                tC.r = tC.s.get(i);
             }
          }
          if (this.C.m != null) {
             this.getSupportFragmentManager().findFragmentByTag("auth"+this.D).dismissAllowingStateLoss();
          }else {
             obj1 = this.getSupportFragmentManager().beginTransaction();
             obj1.y(R.anim.arg_RES_7f01001f, 0x7f010020);
             obj1.v(R.id.fragment_container, new FullScreenAuthFragment());
             obj1.m();
          }
       }
       return;
    }
    public b J0(){
       return this.C;
    }
    public void K0(){
       if (PatchProxy.applyVoid(null, this, AuthActivity.class, "15")) {
          return;
       }
       this.C.b();
       return;
    }
    public int M(){
       return 1;
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, AuthActivity.class, "6")) {
          return;
       }
       this.y3(false);
       return;
    }
    public void Y1(GrantAuthResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AuthActivity.class, "13")) {
          return;
       }
       d.b("AuthActivity", "onSuccessAndFinish\(\) called with: successResponse = ["+p0+"]");
       this.A = true;
       this.z = 1;
       String str = "success";
       try{
          this.y = str;
          Intent intent = new Intent();
          intent.putExtra("kwai_command", this.C.k);
          intent.putExtra("kwai_state", p0.mState);
          intent.putExtra("kwai_response_error_code", true);
          intent.putExtra("kwai_response_code", p0.mCode);
          d.b("AuthActivity", "onSuccessAndFinish: intent extra="+intent.getExtras());
          if (this.v3()) {
             d.b("AuthActivity", "onSuccessAndFinish: setResult OK");
             this.setResult(-1, intent);
          }else {
             intent.setClassName(this.C.o, this.C.o+".kwai.KwaiHandlerActivity");
             d.b("AuthActivity", "onSuccessAndFinish: startActivityForResult");
             d.b("AuthActivity", "onSuccessAndFinish: intent.component="+intent.getComponent());
             this.startActivityForResult(intent, true);
          }
          this.finish();
       }catch(java.lang.Exception e6){
          d.a("AuthActivity", "onSuccessAndFinish: exception", e6);
          e6.printStackTrace();
       }
       return;
    }
    public void e2(int p0,String p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(AuthActivity.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), Boolean.valueOf(p3), this, AuthActivity.class, "7")) {
          return;
       }
       CheckedAgreementModel uCheckedAgre = new CheckedAgreementModel();
       uCheckedAgre.isChecked = Boolean.valueOf(p3);
       uCheckedAgre.agreementId = p1;
       uCheckedAgre.isNeed = Boolean.valueOf(p2);
       if (p0 >= this.C.z.size()) {
          this.C.z.add(p0, uCheckedAgre);
       }else {
          this.C.z.set(p0, uCheckedAgre);
       }
       this.K0();
       return;
    }
    public void f3(){
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, AuthActivity.class, "9")) {
          return;
       }
       d.b("AuthActivity", "finish\(\) called");
       if (this.isFinishing()) {
          return;
       }
       this.w3();
       super.finish();
       this.overridePendingTransition(0, 0);
       return;
    }
    public void g2(){
       this.C.x = false;
    }
    public int getPage(){
       return 0x7d86;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, AuthActivity.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://kwaiAuth";
    }
    public void onCreate(Bundle p0){
       Configuration orientation;
       int i1;
       b i2;
       b f;
       AuthActivity c;
       b f1;
       HashMap hashMap;
       ClientEvent$ElementPackage uElementPack;
       h$b f1;
       HashMap hashMap1;
       ClientContent$ContentPackage uContentPack;
       ClientContent$ThirdPartyAppPackage thirdPartyAp;
       ClientEvent$UrlPackage urlPackage;
       KwaiDialogFragment kwaiDialogFr;
       e uoe;
       b uob = this;
       AuthActivity obj = p0;
       AuthActivity uAuthActivit = AuthActivity.class;
       if (PatchProxy.applyVoidOneRefs(obj, uob, uAuthActivit, "1")) {
          return;
       }
       String str = "AuthActivity";
       d.b(str, "onCreate\(\) called with: savedInstanceState = ["+obj+"]");
       int i = 0;
       if (!PatchProxy.applyVoid(null, uob, uAuthActivit, "10")) {
          d.b(str, "init\(\) called");
          uob.C = new b();
          Intent intent = this.getIntent();
          uob.C.f = TextUtils.I(j0.f(intent, "kwai_request_app_id"));
          String str1 = TextUtils.I(j0.f(intent, "kwai_request_prop_extra"));
          if (!PatchProxy.applyVoidOneRefs(str1, uob, uAuthActivit, "11")) {
             try{
                str1 = new JSONObject(str1).optString("kwaiRemoteDid");
             }catch(org.json.JSONException e0){
                e0.printStackTrace();
                str1 = "";
             }
             uob.C.g = str1;
          }
          uob.C.h = TextUtils.I(j0.f(intent, "kwai_request_type"));
          uob.C.i = TextUtils.I(j0.f(intent, "kwai_request_scope"));
          uob.C.j = TextUtils.I(j0.f(intent, "kwai_state"));
          uob.C.k = TextUtils.I(j0.f(intent, "kwai_command"));
          uob.C.l = TextUtils.I(j0.f(intent, "kwai_request_url"));
          if (j0.a(intent, "call_source_is_js", i)) {
             c = uob.C;
             c.n = AuthSource.JS_BRIDGE;
             c.m = true;
          }else if(j0.a(intent, "call_source_is_game", i)){
             c = uob.C;
             c.n = AuthSource.WE_GAME;
             c.m = true;
          }else if(j0.a(intent, "call_source_is_qrcode", i)){
             c = uob.C;
             c.n = AuthSource.QR_CODE;
             c.m = i;
          }else {
             c = uob.C;
             c.n = AuthSource.KWAI_SDK;
             c.m = i;
          }
          c = uob.C;
          if (c.n == AuthSource.KWAI_SDK) {
             c.o = TextUtils.I(this.getCallingPackage());
             c = uob.C;
             c.p = TextUtils.I(n9.a(c.o, uob));
          }
          str1 = "kwai_request_auth_info_response";
          if (j0.g(intent, str1)) {
             try{
                uob.C.c = j0.e(intent, str1);
                c = uob.C;
                c.d = true;
                c.b();
             }catch(java.lang.Exception e0){
                e0.printStackTrace();
             }
          }
       }
    }
    public void onDestroy(){
       AuthActivity uAuthActivit = AuthActivity.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uAuthActivit, "8")) {
          return;
       }
       d.b("AuthActivity", "onDestroy\(\) called");
       this.w3();
       this.x3();
       this.F = objArray;
       if (!PatchProxy.applyVoid(objArray, this, uAuthActivit, "23")) {
          d.b("AuthActivity", "unRegister\(\) called");
          a.B.unregisterActivityLifecycleCallbacks(this.G);
       }
       super.onDestroy();
       return;
    }
    public KwaiDialogFragment u3(){
       HalfScreenAuthFragment halfScreenAu;
       HalfScreenAuthLandscapeFragment obj = PatchProxy.apply(null, this, AuthActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.E == 2)? new HalfScreenAuthLandscapeFragment(): new HalfScreenAuthFragment();
       return obj;
    }
    public final boolean v3(){
       b n = this.C.n;
       boolean b = (n != AuthSource.JS_BRIDGE && (n == AuthSource.QR_CODE || n == AuthSource.WE_GAME))? true: false;
       return b;
    }
    public final void w3(){
       if (PatchProxy.applyVoid(null, this, AuthActivity.class, "12")) {
          return;
       }
       d.b("AuthActivity", "onFailCallback\(\) called");
       if (this.A == null && this.B == null) {
          boolean b = true;
          this.B = b;
          try{
             Intent intent = new Intent();
             intent.putExtra("kwai_command", this.C.k);
             intent.putExtra("kwai_state", this.C.j);
             intent.putExtra("kwai_response_error_code", this.z);
             intent.putExtra("kwai_response_error_msg", this.y);
             d.b("AuthActivity", "onFailCallback: intent extra="+intent.getExtras());
             if (this.v3()) {
                d.b("AuthActivity", "onFailCallback: setResult OK");
                this.setResult(0, intent);
             }else {
                intent.setClassName(this.C.o, this.C.o+".kwai.KwaiHandlerActivity");
                d.b("AuthActivity", "onFailCallback: startActivityForResult");
                d.b("AuthActivity", "onFailCallback: intent.component="+intent.getComponent());
                this.startActivityForResult(intent, b);
             }
          }catch(java.lang.Exception e1){
             e1.printStackTrace();
             d.a("AuthActivity", "onFailCallback: exception", e1);
          }
       }
    }
    public void x3(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AuthActivity.class, "4")) {
          return;
       }
       KwaiDialogFragment kwaiDialogFr = this.getSupportFragmentManager().findFragmentByTag("auth"+this.D);
       if (kwaiDialogFr != null) {
          kwaiDialogFr.k0(objArray);
          this.getSupportFragmentManager().beginTransaction().u(kwaiDialogFr).m();
       }
       return;
    }
    public final void y3(boolean p0){
       String str5;
       String str6;
       String str7;
       String str8;
       Iterator iterator2;
       Iterator iterator3;
       AuthInfoResponse$Scope scope1;
       Object obj = this;
       boolean b = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AuthActivity uAuthActivit = AuthActivity.class;
       if (PatchProxy.isSupport(uAuthActivit) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), obj, uAuthActivit, "21")) {
          return;
       }
       String str = "AuthActivity";
       d.b(str, "sendGrantRequest\(\) called with: isSelected = ["+b+"]");
       String str1 = "";
       b z = obj.C.z;
       String str2 = ",";
       StringBuilder str3 = null;
       if (z != null) {
          Iterator iterator = z.iterator();
          int i = 0;
          while (iterator.hasNext()) {
             CheckedAgreementModel uCheckedAgre = iterator.next();
             if (uCheckedAgre.isChecked.booleanValue()) {
                if (i > 0) {
                   str1 = str1+str2+uCheckedAgre.agreementId;
                }else {
                   str1 = str1+uCheckedAgre.agreementId;
                   i = i + 1;
                }
             }
          }
       }
       AuthActivity c = obj.C;
       b f = c.f;
       b h = c.h;
       String str4 = "";
       if (PatchProxy.isSupport(uAuthActivit)) {
          str5 = PatchProxy.applyOneRefs(Boolean.valueOf(p0), obj, uAuthActivit, "19");
          if (str5 != patchProxyRe) {
          label_008c :
             str6 = str5;
          label_00eb :
             str5 = PatchProxy.apply(null, obj, uAuthActivit, "20");
             if (str5 != patchProxyRe) {
             }else {
                str5 = "";
                iterator3 = obj.C.c.mScopeList.iterator();
                while (iterator3.hasNext()) {
                   scope1 = iterator3.next();
                   if (obj.C.u.contains(scope1.mScope)) {
                      AuthInfoResponse$Scope mUserInfoLis1 = scope1.mUserInfoList;
                      if (mUserInfoLis1 == null || mUserInfoLis1.size() <= 0) {
                         mUserInfoLis1 = scope1.mPhoneNumList;
                         if (mUserInfoLis1 == null || mUserInfoLis1.size() <= 0) {
                         label_013b :
                            mUserInfoLis1 = null;
                         }
                      }
                      str5 = str5+scope1.mScope+str2;
                      goto label_013b ;
                   }
                }
                str5 = str5;
                if (!TextUtils.x(str5)) {
                   str5 = str5.substring(0, (str5.length() - 1));
                }else {
                   str7 = str4;
                label_0154 :
                   str1 = str1;
                   if (PatchProxy.isSupport(uAuthActivit)) {
                      b obj1 = PatchProxy.applyOneRefs(Boolean.valueOf(p0), obj, uAuthActivit, "18");
                      if (obj1 != patchProxyRe) {
                         str8 = obj1;
                      label_0204 :
                         AuthActivity c1 = obj.C;
                         obj1 = c1.l;
                         z = c1.q;
                         b j = c1.j;
                         AuthInfoResponse mConfirmToke = c1.c.mConfirmToken;
                         d.b(str, "sendGrantRequest: request params:"+"appId="+f+",type="+h+",grantScope="+str6+",denyScope="+str7+",agreementStr="+str1+",grandIndex="+str8+",webViewUrl="+obj1+",isFollowSelected="+z+",state="+j+",confirmToken="+mConfirmToke);
                         b uob = f;
                         b.a(0x5cfaafff).h0(e.c(), f, h, str6, str7, str1, str8, mConfirmToke, obj1, z, j).map(new e()).subscribe(new a(obj, uob), new b(obj, uob));
                         return;
                      }
                   }
                   JsonObject jsonObject = new JsonObject();
                   Iterator iterator1 = obj.C.c.mScopeList.iterator();
                   while (iterator1.hasNext()) {
                      AuthInfoResponse$Scope scope = iterator1.next();
                      AuthInfoResponse$Scope mUserInfoLis = scope.mUserInfoList;
                      if (mUserInfoLis != null && mUserInfoLis.size() > 0) {
                         if (b && !obj.C.t.contains(scope.mScope)) {
                         }else {
                            iterator2 = scope.mUserInfoList.iterator();
                            while (iterator2.hasNext()) {
                               AuthInfoResponse$UserInfo userInfo = iterator2.next();
                               if (userInfo.isSelected != null) {
                                  jsonObject.a0(scope.mScope, Integer.valueOf(userInfo.mUserIndex));
                               }else {
                                  continue ;
                               }
                            }
                         }
                      }else {
                         mUserInfoLis = scope.mPhoneNumList;
                         if (mUserInfoLis != null && (mUserInfoLis.size() <= 0 || (b && !obj.C.t.contains(scope.mScope)))) {
                            continue ;
                         }else {
                            iterator2 = scope.mPhoneNumList.iterator();
                            while (iterator2.hasNext()) {
                               AuthInfoResponse$PhoneNum phoneNum = iterator2.next();
                               if (phoneNum.isSelected != null) {
                                  jsonObject.a0(scope.mScope, Integer.valueOf(phoneNum.mPhoneIndex));
                               }else {
                                  continue ;
                               }
                            }
                         }
                      }
                   }
                   str8 = jsonObject.toString();
                   goto label_0204 ;
                }
             }
             str7 = str5;
             goto label_0154 ;
          }
       }
       str5 = "";
       iterator3 = obj.C.c.mScopeList.iterator();
       while (iterator3.hasNext()) {
          scope1 = iterator3.next();
          if (b && !obj.C.t.contains(scope1.mScope)) {
             continue ;
          }else {
             AuthInfoResponse$Scope mUserInfoLis2 = scope1.mUserInfoList;
             if (mUserInfoLis2 == null || mUserInfoLis2.size() <= 0) {
                mUserInfoLis2 = scope1.mPhoneNumList;
                if (mUserInfoLis2 == null || mUserInfoLis2.size() <= 0) {
                }
             }
             str5 = str5+scope1.mScope+str2;
          }
       }
       str5 = str5;
       if (!TextUtils.x(str5)) {
          str5 = str5.substring(str3, (str5.length() - 1));
          goto label_008c ;
       }else {
          str6 = str4;
          goto label_00eb ;
       }
    }
}
