package com.yxcorp.gifshow.profile.krn.KrnUserInfoEditBridgeV2;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import t3c.g;
import crd.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import cx5.e;
import java.lang.Class;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.profile.krn.KrnUserInfoEditBridgeV2$e;
import com.facebook.react.bridge.ReactContext;
import erd.g;
import crd.b;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.kwai.framework.model.user.UserProfile;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$c;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.profile.common.model.ProfileStatusInfo;
import x2c.a;
import android.app.Activity;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.FragmentManager;
import tkd.b;
import tkd.d;
import gx5.c;
import com.kwai.framework.model.user.UserStatus;
import gx5.h;
import zf6.k;
import android.net.Uri;
import android.net.Uri$Builder;
import java.lang.ref.WeakReference;
import z5c.p1;
import kotlin.jvm.internal.a;
import z5c.o1;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$b;
import z5c.l1;
import lnc.b9;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import z5c.m1;
import erd.r;
import java.util.concurrent.TimeUnit;
import z5c.n1;
import z5c.l0;
import com.facebook.react.bridge.WritableMap;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.Arguments;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.krn.NativeToJsKt;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.User;
import qa6.b;
import com.yxcorp.gifshow.profile.activity.AvatarActivity;
import com.yxcorp.gifshow.profile.krn.KrnUserInfoEditBridgeV2$a;
import java.util.ArrayList;
import mz6.a;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier;
import mz6.b$d;
import java.util.List;
import p3c.d;
import java.lang.Runnable;
import ekd.k1;
import android.content.Context;
import java.lang.CharSequence;
import com.yxcorp.gifshow.profile.krn.KrnUserInfoEditBridgeV2$b;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$c;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$b;
import com.yxcorp.gifshow.profile.krn.KrnUserInfoEditBridgeV2$c;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$d;
import com.yxcorp.gifshow.profile.krn.KrnUserInfoEditBridgeV2$d;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$e;
import com.yxcorp.utility.TextUtils;
import ekd.l;
import com.kwai.framework.model.user.School;
import g3c.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import eda.z;
import eda.s;
import lu7.f;
import p3c.c;
import vu5.b;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import byc.d;
import com.facebook.react.bridge.BaseJavaModule;
import lj0.c;
import lj0.d;
import bi5.a;

public class KrnUserInfoEditBridgeV2 extends KrnBridge	// class@001366
{
    public a mAutoDisposables;
    public ProfileBackgroundPublishManager$d mImageListener;
    public final g mUserInfoEditLogger;
    public ProfileBackgroundPublishManager$e mVideoProgressListener;

    public void KrnUserInfoEditBridgeV2(ReactApplicationContext p0){
       super(p0);
       this.mUserInfoEditLogger = new g();
       a uoa = new a();
       this.mAutoDisposables = uoa;
       uoa.c(RxBus.f.f(e.class).observeOn(d.a).subscribe(new KrnUserInfoEditBridgeV2$e(p0)));
    }
    public static void a(KrnUserInfoEditBridgeV2 p0,Promise p1,ReadableMap p2){
       p0.lambda$invoke$0(p1, p2);
    }
    public static void b(KrnUserInfoEditBridgeV2 p0,UserProfile p1,ImageSelectSupplier$c p2){
       p0.lambda$changeAvatarDirectly$1(p1, p2);
    }
    public static void handleUserInfoChangedEvent(ReactContext p0,e p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KrnUserInfoEditBridgeV2.class, "7")) {
          return;
       }
       String str = (p1.d != null)? "remove_avatar": "update_avatar";
       KrnUserInfoEditBridgeV2.notifyAvatarEvent(p0, str);
       return;
    }
    private void lambda$changeAvatarDirectly$1(UserProfile p0,ImageSelectSupplier$c p1){
       h oh;
       ProfileStatusInfo profileStatu = a.f(p0);
       profileStatu = (profileStatu != null)? profileStatu.mUserStatus: null;
       Activity currentActiv = this.getCurrentActivity();
       if (currentActiv instanceof GifshowActivity && !currentActiv.isDestroyed()) {
          FragmentManager fragmentMana = currentActiv.getFragmentManager();
          if (fragmentMana != null && !fragmentMana.isDestroyed()) {
             d.a(0x763547f8).AJ(currentActiv, profileStatu, null, p1);
          }
       }
       return;
    }
    private void lambda$invoke$0(Promise p0,ReadableMap p1){
       String str2;
       Activity currentActiv = this.getCurrentActivity();
       String str = "";
       String str1 = "0";
       if (!currentActiv instanceof GifshowActivity || currentActiv.isDestroyed()) {
          p0.reject(str1, str);
          return;
       }else {
          FragmentManager fragmentMana = currentActiv.getFragmentManager();
          if (fragmentMana == null || fragmentMana.isDestroyed()) {
             p0.reject(str1, str);
             return;
          }else if(k.d()){
             str2 = "%23222226";
          }else {
             str2 = "%23FFFFFF";
          }
          String str3 = "onUpdatedActionUrl";
          str3 = (p1.hasKey(str3))? Uri.parse(p1.getString(str3)).buildUpon().appendQueryParameter("bgColor", str2).toString(): null;
          str = "onCancelActionUrl";
          String str4 = (p1.hasKey(str))? Uri.parse(p1.getString(str)).buildUpon().appendQueryParameter("bgColor", str2).toString(): null;
          WeakReference weakReferenc = new WeakReference(this.getCurrentActivity());
          if (!PatchProxy.applyVoidThreeRefs(weakReferenc, str3, str4, null, p1.class, "1")) {
             a.p(weakReferenc, "activityRef");
             Object obj = weakReferenc.get();
             if (!obj instanceof GifshowActivity) {
                obj = null;
             }
             if (obj != null) {
                ImageSelectSupplier$c uoc = ImageSelectSupplier$c.a();
                uoc.b(new o1(obj, str4));
                d.a(0x763547f8).dx(obj, null, new l1(str3, obj, str4), uoc, true);
                b9.a(p1.b);
                p1.b = obj.m().filter(m1.b).debounce(1000, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new n1(obj, str4), l0.a);
             }
          }
          p0.resolve(null);
          return;
       }
    }
    public static WritableMap newBackgroundMap(String p0,String p1){
       WritableMap obj = PatchProxy.applyTwoRefs(p0, p1, null, KrnUserInfoEditBridgeV2.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Arguments.createMap();
       obj.putString("type", p0);
       obj.putString("status", p1);
       return obj;
    }
    public static void notifyAvatarEvent(ReactContext p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KrnUserInfoEditBridgeV2.class, "8")) {
          return;
       }
       WritableMap writableMap = Arguments.createMap();
       writableMap.putString("nameSpace", "EditProfile");
       WritableMap writableMap1 = Arguments.createMap();
       writableMap1.putString("eventName", "profile_select_avatar_directly");
       WritableMap writableMap2 = Arguments.createMap();
       writableMap2.putString("type", p1);
       writableMap2.putString("headurl", QCurrentUser.ME.getAvatar());
       writableMap1.putMap("params", writableMap2);
       writableMap.putMap("event", writableMap1);
       NativeToJsKt.e(p0, "NativeToRNEvent", writableMap);
       return;
    }
    public static void notifyBackgroundEvent(ReactContext p0,WritableMap p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KrnUserInfoEditBridgeV2.class, "9")) {
          return;
       }
       NativeToJsKt.e(p0, "UpdateBackgroundEvent", p1);
       return;
    }
    public void changeAvatar(UserProfile p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnUserInfoEditBridgeV2.class, "6")) {
          return;
       }
       if (p0 != null && p0.mProfile != null) {
          CDNUrl[] uCDNUrlArray = new CDNUrl[]{new CDNUrl("", QCurrentUser.me().getAvatar())};
          p0.mProfile.mBigHeadUrls = uCDNUrlArray;
       }
       AvatarActivity.A3(this.getCurrentActivity(), b.a(QCurrentUser.me()), p0);
       return;
    }
    public final void changeAvatarDirectly(UserProfile p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnUserInfoEditBridgeV2.class, "3")) {
          return;
       }
       ImageSelectSupplier$c uoc = ImageSelectSupplier$c.a();
       uoc.b(new KrnUserInfoEditBridgeV2$a(this, p0));
       if (p0 == null || p0.mIsDefaultHead == null) {
          ArrayList uArrayList = new ArrayList();
          a uoa = a.b();
          uoa.g(ImageSelectSupplier.p);
          uArrayList.add(uoa.a());
          uoa = a.b();
          uoa.g(ImageSelectSupplier.q);
          uArrayList.add(uoa.a());
          uoa = a.b();
          uoa.g(R.string.arg_RES_7f103fb8);
          uArrayList.add(uoa.a());
          uoc.c(uArrayList);
       }
       k1.o(new d(this, p0, uoc));
       return;
    }
    public void changeBackground(UserProfile p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnUserInfoEditBridgeV2.class, "4")) {
          return;
       }
       Activity currentActiv = this.getCurrentActivity();
       if (currentActiv instanceof GifshowActivity && !currentActiv.isDestroyed()) {
          ImageSelectSupplier$c uoc = ImageSelectSupplier$c.a();
          ArrayList uArrayList = new ArrayList();
          a uoa = a.b();
          uoa.g(ImageSelectSupplier.p);
          uoa.i(1);
          uoa.j(currentActiv.getApplicationContext().getString(R.string.arg_RES_7f103efe));
          uArrayList.add(uoa.a());
          uoa = a.b();
          uoa.g(ImageSelectSupplier.q);
          uArrayList.add(uoa.a());
          uoa = a.b();
          uoa.g(R.string.arg_RES_7f103fe9);
          uArrayList.add(uoa.a());
          uoc.c(uArrayList);
          uoc.b(new KrnUserInfoEditBridgeV2$b(this, p0, currentActiv));
          ProfileBackgroundPublishManager$c j = ProfileBackgroundPublishManager.j;
          j.a().v(new ProfileBackgroundPublishManager$b(1, 1, uoc), currentActiv);
          if (this.mImageListener == null) {
             this.mImageListener = new KrnUserInfoEditBridgeV2$c(this);
          }
          j.a().a(this.mImageListener);
          if (this.mVideoProgressListener == null) {
             this.mVideoProgressListener = new KrnUserInfoEditBridgeV2$d(this);
          }
          j.a().b(this.mVideoProgressListener);
       }
       return;
    }
    public String getName(){
       return "SocialEditProfile";
    }
    public void invoke(String p0,ReadableMap p1,Promise p2){
       String str3;
       CDNUrl[] uCDNUrlArray;
       ReadableMap map1;
       UserProfile userProfile;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KrnUserInfoEditBridgeV2.class, "1")) {
          return;
       }
       this.reportAndCheck(this.getName(), "invoke", this.getReactApplicationContext());
       int i = 0x763547f8;
       if (("updateCurrentUser").equals(p0)) {
          int i1 = 0;
          if (p1 != null) {
             String str = "setText";
             if (p1.hasKey(str)) {
                QCurrentUser.me().startEdit().setText(TextUtils.k(p1.getString(str))).commitChanges();
             }
             str = "setName";
             if (p1.hasKey(str)) {
                str = p1.getString(str);
                if (!TextUtils.x(str)) {
                   QCurrentUser.me().startEdit().setName(str).commitChanges();
                   d.a(i).Ws();
                }
             }
             str = "setAge";
             if (p1.hasKey(str)) {
                str = p1.getString(str);
                if (!TextUtils.x(str)) {
                   QCurrentUser.me().startEdit().setAge(l.a(str)).commitChanges();
                }
             }
             str = "setSex";
             if (p1.hasKey(str)) {
                str = p1.getString(str);
                if (!TextUtils.x(str)) {
                   QCurrentUser.me().startEdit().setSex(str).commitChanges();
                }
             }
             str = "setKwaiId";
             if (p1.hasKey(str)) {
                str = p1.getString(str);
                if (!TextUtils.x(str)) {
                   QCurrentUser.me().startEdit().setKwaiId(str).commitChanges();
                }
             }
             str = "setSchool";
             if (p1.hasKey(str)) {
                ReadableMap map = p1.getMap(str);
                if (map != null) {
                   String str1 = "actionType";
                   if (map.hasKey(str1)) {
                      i = ("delete_school").equals(map.getString(str1)) ^ 1;
                      try{
                      label_0101 :
                         if (i && map != null) {
                            String str2 = "schoolInfo";
                            if (map.hasKey(str2)) {
                               map = map.getMap(str2);
                               School school = this.parseParams(map, School.class);
                            }
                         }
                         SharedPreferences$Editor uEditor = a.a.edit();
                         uEditor.putBoolean(b.d("user")+"has_select_school", i);
                         g.a(uEditor);
                         if (!i) {
                            RxBus.f.b(new z());
                         }
                      }catch(java.lang.Exception e0){
                      }
                   }
                }
                i = 1;
                goto label_0101 ;
             }
          }
          if (!i1) {
             RxBus.f.b(s.c("EDIT_KRN_BRIDGE"));
          }
       }else if(("jumpFeedback").equals(p0)){
          if (this.getCurrentActivity() instanceof GifshowActivity) {
             d.a(i).gV(this.getCurrentActivity());
             p2.resolve(null);
             return;
          }else {
             p2.reject("0", "");
          }
       }else if(("selectAvatarDirectly").equals(p0)){
          if (p1.hasKey("userProfile")) {
             map1 = p1.getMap("userProfile");
             if (map1 != null) {
                this.changeAvatarDirectly(this.parseParams(map1, UserProfile.class));
                p2.resolve(null);
                return;
             }
          }
          p2.reject(v4, v3);
       }else if(("selectBackgroundDirectly").equals(p0)){
          if (p1.hasKey("userProfile")) {
             map1 = p1.getMap("userProfile");
             if (map1 != null) {
                userProfile = this.parseParams(map1, UserProfile.class);
                if (userProfile != null && userProfile.mProfile == null) {
                   userProfile.mProfile = f.p(QCurrentUser.ME);
                }
                this.changeBackground(userProfile);
                p2.resolve(null);
                return;
             }
          }
          p2.reject("0", "");
       }else if(("selectAvatarForDialog").equals(p0)){
          k1.r(new c(this, p2, p1), 200);
       }else if(("jumpToProfilePage").equals(p0)){
          if (this.getCurrentActivity() instanceof GifshowActivity) {
             d.a(-1718536792).wT(this.getCurrentActivity(), ProfileStartParam.i());
             p2.resolve(null);
             return;
          }else {
             p2.reject("0", "");
          }
       }else if(("webTriggerEvent").equals(p0)){
          if (p1 != null) {
             p0 = "triggerEvent";
             if (p1.hasKey(p0)) {
                p0 = p1.getString(p0);
                if (!TextUtils.x(p0)) {
                   RxBus.f.b(new d(p0));
                   p2.resolve(null);
                   return;
                }
             }
          }
          p2.reject("0", "");
       }
    }
    public void onCatalystInstanceDestroy(){
       if (PatchProxy.applyVoid(null, this, KrnUserInfoEditBridgeV2.class, "10")) {
          return;
       }
       super.onCatalystInstanceDestroy();
       b9.a(this.mAutoDisposables);
       if (this.mImageListener != null) {
          ProfileBackgroundPublishManager.j.a().p(this.mImageListener);
       }
       if (this.mVideoProgressListener != null) {
          ProfileBackgroundPublishManager.j.a().q(this.mVideoProgressListener);
       }
       return;
    }
    public final void reportAndCheck(String p0,String p1,ReactApplicationContext p2){
       String str1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KrnUserInfoEditBridgeV2.class, "2")) {
          return;
       }
       c uoc = d.a(p2);
       String str = "";
       if (uoc != null) {
          str = uoc.b();
          str1 = uoc.f();
       }else {
          str1 = str;
       }
       a.a(p0, p1, str, str1);
       return;
    }
}
