package com.yxcorp.gifshow.profile.krn.ProfileStatusBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.Promise;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.HashMap;
import u36.b;
import w5c.i;
import android.content.Context;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.trello.rxlifecycle3.android.ActivityEvent;
import java.lang.Object;
import gr8.b;
import gr8.c;
import brd.x;
import java.util.Objects;
import p3c.m;
import p3c.n;
import erd.g;
import crd.b;
import s1c.q;
import q87.c;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import java.lang.Boolean;
import android.app.Activity;
import com.yxcorp.gifshow.profile.krn.status.KrnProfileStatusParams;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import ca9.b;
import brd.f0;
import p3c.q;
import com.yxcorp.gifshow.profile.krn.g;
import com.yxcorp.gifshow.profile.status.model.KrnStatusResponse;
import java.lang.Integer;
import q3c.b;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import qvb.i;
import n5c.a;
import com.yxcorp.gifshow.profile.status.model.HistoryStatusResponse;
import com.yxcorp.gifshow.profile.common.model.ProfileStatusInfo;
import q3c.c;
import com.yxcorp.gifshow.profile.krn.ProfileStatusBridge$a;
import q3c.a;
import fg6.a;
import com.google.gson.Gson;
import java.lang.RuntimeException;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.System;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import d6a.i;
import d6a.j;
import com.yxcorp.gifshow.detail.slideplay.b;
import p3c.o;
import com.yxcorp.gifshow.profile.krn.h;
import p3c.p;
import com.yxcorp.gifshow.profile.krn.i;
import com.facebook.react.bridge.ReactContext;
import lj0.c;
import lj0.d;
import bi5.a;
import com.yxcorp.gifshow.model.CDNUrl;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import com.kuaishou.krn.NativeToJsKt;
import com.kwai.framework.model.user.UserStatus;
import yl8.b;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;

public class ProfileStatusBridge extends KrnBridge	// class@001368
{

    public void ProfileStatusBridge(ReactApplicationContext p0){
       super(p0);
    }
    public static void lambda$doFaceDetect$2(Promise p0,Throwable p1){
       p0.reject("1", p1.getMessage());
    }
    public static void lambda$doFaceDetect$3(GifshowActivity p0,HashMap p1,Promise p2,b p3){
       Objects.requireNonNull(p2);
       p3.ys(p0, i.a.a(), p1).compose(c.c(p0.m(), ActivityEvent.DESTROY)).subscribe(new m(p2), new n(p2));
    }
    public static void lambda$doFaceDetect$4(Throwable p0){
       q.C().e("ProfileStatusBridge", "get plugin error", p0);
    }
    public static void lambda$jumpToPostStateEditPage$5(GifshowActivity p0,HashMap p1,b p2){
       p2.x8(p0, p1, true);
    }
    public static void lambda$jumpToPostStateEditPage$6(Throwable p0){
       q.C().e("ProfileStatusBridge", "get plugin error", p0);
    }
    public static void lambda$launchLiveAvatarPage$0(GifshowActivity p0,HashMap p1,b p2){
       p2.x8(p0, p1, false);
    }
    public static void lambda$launchLiveAvatarPage$1(Throwable p0){
       q.C().e("ProfileStatusBridge", "get plugin error", p0);
    }
    public void checkAndSaveAvatarImage(ReadableMap p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfileStatusBridge.class, "3")) {
          return;
       }
       this.reportAndCheck(this.getName(), "checkAndSaveAvatarImage", this.getReactApplicationContext());
       boolean b = i.a.c();
       p1.resolve(Boolean.valueOf(b));
       if (b) {
          return;
       }
       this.saveAvatarImage(p0);
       return;
    }
    public void doFaceDetect(ReadableMap p0,Promise p1){
       HashMap hashMap;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfileStatusBridge.class, "4")) {
          return;
       }
       this.reportAndCheck(this.getName(), "doFaceDetect", this.getReactApplicationContext());
       GifshowActivity currentActiv = this.getCurrentActivity();
       if (currentActiv == null) {
          return;
       }
       try{
          hashMap = new HashMap();
          KrnProfileStatusParams krnProfileSt = this.parseParams(p0, KrnProfileStatusParams.class);
          hashMap.put("KEY_SERVER_PARAMS", krnProfileSt.mServerParams);
          hashMap.put("KEY_AVATAR_IMAGE_PATH", i.a.a());
          hashMap.put("KEY_MOOD_ID", krnProfileSt.mMoodId);
       }catch(java.lang.Exception e0){
          p1.reject("0", "parseParams error");
       }
       b.s(b.class, LoadPolicy.DIALOG).g(c.c(e0.m(), ActivityEvent.DESTROY)).R(new q(e0, hashMap, p1), g.b);
       return;
    }
    public final void enterFriendSlidePage(KrnStatusResponse p0,GifshowActivity p1,int p2){
       if (PatchProxy.isSupport(ProfileStatusBridge.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, ProfileStatusBridge.class, "9")) {
          return;
       }
       a.b(p1, p0.getItems().get(p2), p2, this.getPhotoSlideId(p1, new b(p0)));
       return;
    }
    public final void enterHistorySlidePage(KrnStatusResponse p0,GifshowActivity p1,int p2){
       if (PatchProxy.isSupport(ProfileStatusBridge.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, ProfileStatusBridge.class, "8")) {
          return;
       }
       HistoryStatusResponse historyStatu = new HistoryStatusResponse();
       historyStatu.setMProfileStatusInfo(p0.getProfileStatusInfo());
       historyStatu.setMItems(p0.getItems());
       historyStatu.setMCursor(p0.getCursor());
       a.b(p1, p0.getItems().get(p2), p2, this.getPhotoSlideId(p1, new c(historyStatu, new ProfileStatusBridge$a(this))));
       return;
    }
    public void enterSlidePage(String p0,int p1){
       int i;
       KrnStatusResponse krnStatusRes;
       Object[] objArray1;
       ProfileStatusBridge profileStatu = ProfileStatusBridge.class;
       String str = "ProfileStatusBridge";
       if (PatchProxy.isSupport(profileStatu) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, profileStatu, "7")) {
          return;
       }
       this.reportAndCheck(this.getName(), "enterSlidePage", this.getReactApplicationContext());
       try{
          i = 0;
          krnStatusRes = a.a.h(p0, KrnStatusResponse.class);
       }catch(com.google.gson.JsonSyntaxException e6){
          Object[] objArray = new Object[1];
          objArray[i] = e6.getMessage();
          q.C().t(str, "fromJson e", objArray);
       }
       if (krnStatusRes == null) {
          objArray1 = new Object[i];
          q.C().t(str, "params invalid", objArray1);
          return;
       }else {
          GifshowActivity currentActiv = this.getCurrentActivity();
          if (currentActiv == null) {
             objArray1 = new Object[i];
             q.C().t(str, "enterSlidePage activity=null", objArray1);
             return;
          }else if(TextUtils.n(krnStatusRes.getListType(), "history")){
             this.enterHistorySlidePage(krnStatusRes, currentActiv, p1);
          }else if(TextUtils.n(krnStatusRes.getListType(), "friend")){
             this.enterFriendSlidePage(krnStatusRes, currentActiv, p1);
          }
          return;
       }
    }
    public String getName(){
       return "ProfileStatusBridge";
    }
    public final String getPhotoSlideId(GifshowActivity p0,i p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ProfileStatusBridge.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = p0.hashCode()+"#"+System.currentTimeMillis();
       b.g(j.d(p1, str, SlideMediaType.ALL));
       return str;
    }
    public void jumpToPostStateEditPage(ReadableMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileStatusBridge.class, "5")) {
          return;
       }
       this.reportAndCheck(this.getName(), "jumpToPostStateEditPage", this.getReactApplicationContext());
       GifshowActivity currentActiv = this.getCurrentActivity();
       if (currentActiv == null) {
          return;
       }
       try{
          HashMap hashMap = new HashMap();
          KrnProfileStatusParams krnProfileSt = this.parseParams(p0, KrnProfileStatusParams.class);
          hashMap.put("KEY_SERVER_PARAMS", krnProfileSt.mServerParams);
          hashMap.put("KEY_AVATAR_IMAGE_PATH", i.a.a());
          hashMap.put("KEY_MOOD_ID", krnProfileSt.mMoodId);
          b.s(b.class, LoadPolicy.DIALOG).g(c.c(e0.m(), ActivityEvent.DESTROY)).R(new o(e0, hashMap), h.b);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void launchLiveAvatarPage(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileStatusBridge.class, "1")) {
          return;
       }
       this.reportAndCheck(this.getName(), "launchLiveAvatarPage", this.getReactApplicationContext());
       GifshowActivity currentActiv = this.getCurrentActivity();
       if (currentActiv == null) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       HashMap hashMap = new HashMap();
       hashMap.put("KEY_SERVER_PARAMS", p0);
       hashMap.put("KEY_AVATAR_IMAGE_PATH", i.a.a());
       b.s(b.class, LoadPolicy.DIALOG).g(c.c(currentActiv.m(), ActivityEvent.DESTROY)).R(new p(currentActiv, hashMap), i.b);
       return;
    }
    public final void reportAndCheck(String p0,String p1,ReactApplicationContext p2){
       String str1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ProfileStatusBridge.class, "13")) {
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
    public void saveAvatarImage(ReadableMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileStatusBridge.class, "2")) {
          return;
       }
       String name = this.getName();
       ReactApplicationContext reactApplica = this.getReactApplicationContext();
       String str = "saveAvatarImage";
       try{
          this.reportAndCheck(name, str, reactApplica);
          KrnProfileStatusParams krnProfileSt = this.parseParams(p0, KrnProfileStatusParams.class);
          KrnProfileStatusParams mHeadUrls = krnProfileSt.mHeadUrls;
          if (mHeadUrls != null && mHeadUrls.length > 0) {
             i.a.d(mHeadUrls);
          }else if(!TextUtils.x(krnProfileSt.mHeadUrl)){
             CDNUrl[] uCDNUrlArray = new CDNUrl[]{new CDNUrl("", krnProfileSt.mHeadUrl)};
             i.a.d(uCDNUrlArray);
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void sendRemoveEvent(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileStatusBridge.class, "11")) {
          return;
       }
       WritableMap writableMap = Arguments.createMap();
       writableMap.putString("moodId", p0);
       NativeToJsKt.e(this.getReactApplicationContext(), "DeleteProfileHistoryState", writableMap);
       return;
    }
    public void sendUpdateEvent(HistoryStatusResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileStatusBridge.class, "12")) {
          return;
       }
       WritableMap writableMap = Arguments.createMap();
       writableMap.putString("response", a.a.q(p0));
       NativeToJsKt.e(this.getReactApplicationContext(), "UpdateProfileHistoryStatePage", writableMap);
       return;
    }
    public void updateUserProfileState(String p0){
       UserStatus userStatus;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileStatusBridge.class, "6")) {
          return;
       }
       this.reportAndCheck(this.getName(), "updateUserProfileState", this.getReactApplicationContext());
       try{
          int i = 0;
          userStatus = a.a.h(p0, UserStatus.class);
       }catch(com.google.gson.JsonSyntaxException e5){
          Object[] objArray = new Object[]{e5.getMessage()};
          q.C().t("ProfileStatusBridge", "UserStatus fromJson Exception", objArray);
       }
       if (userStatus == null) {
          return;
       }
       userStatus.b();
       userStatus.notifyChanged();
       userStatus.fireSync();
       return;
    }
}
