package com.yxcorp.gifshow.relation.pymk.rn.KSPymkBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.yxcorp.gifshow.permission.ContactPermissionHolder;
import xwb.b;
import xwb.c;
import xwb.d;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.HashMap;
import com.yxcorp.gifshow.relation.pymk.rn.a;
import com.yxcorp.gifshow.relation.pymk.rn.KSPymkBridge$a;
import android.os.Looper;
import com.trello.rxlifecycle3.android.ActivityEvent;
import com.kwai.framework.model.user.RecoUser;
import android.app.Activity;
import java.lang.String;
import com.facebook.react.bridge.Promise;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.pymk.log.h;
import android.content.Intent;
import cx5.e;
import eda.q;
import com.kwai.framework.model.user.QCurrentUser;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactContext;
import java.lang.Object;
import com.kuaishou.krn.NativeToJsKt;
import k2b.h;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.yxcorp.gifshow.activity.GifshowActivity;
import nbc.k;
import java.lang.Runnable;
import com.yxcorp.gifshow.pymk.b;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import org.json.JSONObject;
import org.json.JSONException;
import java.lang.Throwable;
import java.util.Map;
import com.yxcorp.gifshow.util.rx.RxBus;
import nbc.e;
import ekd.k1;
import vq4.c;
import vq4.d;
import crd.b;
import lnc.b9;
import com.kuaishou.krn.event.a;
import oj0.a;
import com.yxcorp.gifshow.pymk.PymkGuideCard;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import java.lang.Class;
import brd.t;
import nbc.g;
import erd.g;
import nbc.j;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import nbc.i;
import tkd.b;
import tkd.d;
import gx5.c;
import android.content.Context;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import h7c.b;
import android.os.Message;
import android.os.Handler;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import lnc.a1;
import ou5.b;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import com.kwai.feature.api.social.login.model.LoginParams;
import nbc.f;
import n3d.a;
import nbc.b;
import com.yxcorp.utility.SystemUtil;
import h7c.a;
import jga.f$a;
import wca.b;
import jga.c;
import jga.f;
import nbc.h;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import oe6.e;
import c7c.d;
import com.yxcorp.gifshow.relation.pymk.rn.KSPymkBridge$b;
import fg6.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.activity.x;
import com.yxcorp.utility.TextUtils;
import ik0.m;
import androidx.fragment.app.Fragment;
import g7c.g;
import ada.c;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.relation.pymk.rn.KSPymkBridge$c;
import androidx.lifecycle.Lifecycle;
import com.yxcorp.gifshow.relation.pymk.rn.KSPymkBridge$2;
import androidx.lifecycle.LifecycleObserver;
import nbc.d;
import e17.i;
import com.yxcorp.gifshow.entity.QPhoto;
import mxb.j0;
import mxb.i0;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.relation.pymk.rn.b;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import os5.l;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import lj0.c;
import lj0.d;
import bi5.a;
import java.util.Set;
import nbc.c;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import gx5.d;
import qvb.i;
import d6a.f;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import d6a.i;
import d6a.j;
import com.yxcorp.gifshow.detail.slideplay.b;
import vm5.e;
import android.view.View;
import com.yxcorp.gifshow.relation.pymk.rn.c;
import nbc.a;
import ok.x;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import fka.e;
import vu5.b;

public class KSPymkBridge extends KrnBridge	// class@001956
{
    public b mActivityDisposable;
    public b mAvatarChangeDisposable;
    public b mDisposable;
    public final a mEventListener;
    public Handler mHandler;
    public boolean mHasUpload;
    public boolean mIsNameBridgeListenerRegister;
    public final HashMap mPageStatHashMap;
    public int mRootTag;
    public Map mShowUsers;
    public b mUserNameChangeDisposable;
    public static final ContactPermissionHolder mPermissionHolder;

    static {
       KSPymkBridge.mPermissionHolder = new ContactPermissionHolder(new b(new c()));
    }
    public void KSPymkBridge(ReactApplicationContext p0){
       super(p0);
       this.mShowUsers = new HashMap();
       this.mHasUpload = true;
       this.mPageStatHashMap = new HashMap();
       this.mEventListener = a.b;
       this.mHandler = new KSPymkBridge$a(this, Looper.getMainLooper());
    }
    public static void a(KSPymkBridge p0,ActivityEvent p1){
       p0.lambda$showHalfInfoEditDialog$10(p1);
    }
    public static void b(KSPymkBridge p0,RecoUser p1,Activity p2,int p3){
       p0.lambda$showHalfInfoEditDialog$11(p1, p2, p3);
    }
    public static void c(KSPymkBridge p0){
       p0.lambda$connectContact$12();
    }
    public static void d(KSPymkBridge p0,String p1,String p2,Promise p3){
       p0.lambda$invoke$2(p1, p2, p3);
    }
    public static void e(KSPymkBridge p0,int p1,Activity p2){
       p0.lambda$connectContact$13(p1, p2);
    }
    public static void f(KSPymkBridge p0,User p1,h p2,int p3,int p4,Intent p5){
       p0.lambda$checkHasLogin$4(p1, p2, p3, p4, p5);
    }
    public static void g(KSPymkBridge p0,e p1){
       p0.lambda$showHalfInfoEditDialog$8(p1);
    }
    public static void h(KSPymkBridge p0,q p1){
       p0.lambda$showHalfInfoEditDialog$9(p1);
    }
    public static void i(KSPymkBridge p0,User p1){
       p0.lambda$doFollow$5(p1);
    }
    private void lambda$checkHasLogin$4(User p0,h p1,int p2,int p3,Intent p4){
       if (QCurrentUser.me().isLogined()) {
          this.doFollow(p0, p1);
       }
       return;
    }
    private void lambda$connectContact$12(){
       WritableMap writableMap = Arguments.createMap();
       writableMap.putInt("isAuthorized", KSPymkBridge.mPermissionHolder.d());
       NativeToJsKt.e(this.getReactApplicationContext(), "krnChangeContactAccess", writableMap);
    }
    private void lambda$connectContact$13(int p0,Activity p1){
       h oh = h.k("OPEN_CONTACTS_CARD");
       i3 oi3 = i3.f();
       oi3.c("portal", Integer.valueOf(p0));
       oi3.d("click_area", "open");
       oh.n(oi3.e());
       oh.h();
       KSPymkBridge.mPermissionHolder.h(p1, new k(this));
    }
    private void lambda$doFollow$5(User p0){
       if (b.j(p0)) {
          b.n(this.getCurrentActivity(), p0);
       }
       return;
    }
    private void lambda$invoke$2(String p0,String p1,Promise p2){
       try{
          Log.g("KSPymkBridge", "invoke: action = "+p0);
          if (this.getCurrentActivity() == null) {
             return;
          }else {
             JSONObject jSONObject = new JSONObject(p1);
             if (("INIT").equalsIgnoreCase(p0)) {
                this.init(jSONObject);
             }else if(("SHOW_USER").equalsIgnoreCase(p0)){
                this.cacheShowUser(jSONObject);
             }else if(("FOLLOW_USER").equalsIgnoreCase(p0) || ("UN_FOLLOW_USER").equalsIgnoreCase(p0)){
                this.followUser(jSONObject);
             }else if(("DELETE_USER").equalsIgnoreCase(p0)){
                this.deleteUser(jSONObject);
             }else if(("DELETE_ALL").equalsIgnoreCase(p0)){
                this.deleteAll(jSONObject);
             }else if(("REFRESH").equalsIgnoreCase(p0)){
                this.refresh(jSONObject);
             }else if(("JUMP_TO_LIVE").equalsIgnoreCase(p0)){
                this.toFeed(jSONObject);
             }else if(("JUMP_TO_FEED").equalsIgnoreCase(p0)){
                this.toFeed(jSONObject);
             }else if(("JUMP_TO_PROFILE").equalsIgnoreCase(p0)){
                this.toProfile(jSONObject);
             }else if(("EDIT_NAME").equalsIgnoreCase(p0)){
                this.editAliasName(jSONObject);
             }else if(("UPDATE_PRSID").equalsIgnoreCase(p0)){
                this.updatePrsid(jSONObject);
             }else if(("UPDATE_RECO_PORTAL").equalsIgnoreCase(p0)){
                this.updatePortal(jSONObject);
             }else if(("CONTACT_ACCESS").equalsIgnoreCase(p0)){
                this.connectContact(jSONObject);
             }else if(("EDIT_PROFILE_DIALOG").equalsIgnoreCase(p0)){
                this.showHalfInfoEditDialog(jSONObject);
             }
             WritableMap writableMap = Arguments.createMap();
             writableMap.putInt("result", 1);
             p2.resolve(writableMap);
          }
       }catch(org.json.JSONException e4){
          e4.printStackTrace();
          p2.reject("error", e4);
       }
       return;
    }
    public static void lambda$new$0(Map p0){
       if (p0 != null) {
          RxBus.f.b(new q(p0));
       }
       return;
    }
    public static void lambda$new$1(Map p0){
       k1.o(new e(p0));
    }
    public static void lambda$openLiveStream$7(c p0){
       p0.p0 = 1;
    }
    private void lambda$showHalfInfoEditDialog$10(ActivityEvent p0){
       if (p0 == ActivityEvent.DESTROY) {
          b[] uobArray = new b[]{this.mAvatarChangeDisposable,this.mUserNameChangeDisposable,this.mActivityDisposable};
          int i = 0;
          b9.b(uobArray);
          if (this.mIsNameBridgeListenerRegister != null) {
             this.mIsNameBridgeListenerRegister = i;
             a.b().c("KRNSocialProfileRefreshEvent", this.mEventListener);
          }
       }
       return;
    }
    private void lambda$showHalfInfoEditDialog$11(RecoUser p0,Activity p1,int p2){
       p0 = p0.mPymkGuideCard;
       if (p0 == null) {
          return;
       }
       b[] uobArray = new b[]{this.mAvatarChangeDisposable,this.mUserNameChangeDisposable,this.mActivityDisposable};
       int i = 1;
       b9.b(uobArray);
       if (p0.mIsHeadEmpty != null) {
          this.mAvatarChangeDisposable = RxBus.f.g(e.class, RxBus$ThreadMode.MAIN).subscribe(new g(this));
       }
       if (p0.mIsNameEmpty != null) {
          this.mIsNameBridgeListenerRegister = i;
          a.b().a("KRNSocialProfileRefreshEvent", this.mEventListener);
          this.mUserNameChangeDisposable = RxBus.f.g(q.class, RxBus$ThreadMode.MAIN).subscribe(new j(this));
       }
       this.mActivityDisposable = p1.m().subscribe(new i(this));
       h oh = h.k("PROFILE_FILL_CARD");
       i3 oi3 = i3.f();
       oi3.c("portal", Integer.valueOf(p2));
       oi3.d("click_area", "edit");
       oh.n(oi3.e());
       oh.h();
       d.a(0x763547f8).Sf(p1, p0, p2);
       return;
    }
    private void lambda$showHalfInfoEditDialog$8(e p0){
       if (p0.c != null && p0.a != null) {
          WritableMap writableMap = Arguments.createMap();
          writableMap.putString("headUrl", QCurrentUser.ME.getAvatar());
          NativeToJsKt.e(this.getReactApplicationContext(), "krnChangeAvatar", writableMap);
       }
       return;
    }
    private void lambda$showHalfInfoEditDialog$9(q p0){
       String str = "USER_NAME";
       if (p0.a.containsKey(str)) {
          p0 = p0.a.get(str);
          if (p0 instanceof String) {
             WritableMap writableMap = Arguments.createMap();
             writableMap.putString("userName", p0);
             NativeToJsKt.e(this.getReactApplicationContext(), "krnChangeMyUserName", writableMap);
          }
       }
       return;
    }
    public static void lambda$unfollow$6(User p0){
    }
    public static JSONObject lambda$updateExtraInfo$3(JSONObject p0){
       return p0;
    }
    public final void cacheShowUser(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSPymkBridge.class, "16")) {
          return;
       }
       if (("user").equalsIgnoreCase(p0.optString("type"))) {
          String str = p0.optString("sessionId");
          RecoUser userObject = this.getUserObject(p0);
          if (this.checkRecoUser(userObject)) {
             userObject.mUser.mPosition = this.getExtraUserIndex(p0);
             h oh = this.mPageStatHashMap.get(str);
             ArrayList uArrayList = this.mShowUsers.get(str);
             if (uArrayList != null) {
                uArrayList.add(userObject);
             }else {
                uArrayList = new ArrayList();
                uArrayList.add(userObject);
                this.mShowUsers.put(str, uArrayList);
             }
             if (oh != null) {
                this.updateExtraInfo(p0);
                if (!PatchProxy.applyVoidOneRefs(uArrayList, oh, h.class, "23")) {
                   oh.g.clear();
                   Iterator iterator = uArrayList.iterator();
                   while (iterator.hasNext()) {
                      RecoUser recoUser = iterator.next();
                      oh.g.add(new b(recoUser.mUser, recoUser.mFeedList));
                   }
                }
             }
             if (this.mHasUpload != null) {
                KSPymkBridge tmHandler = this.mHandler;
                tmHandler.sendMessageDelayed(tmHandler.obtainMessage(0x10000), 2000);
                this.mHasUpload = false;
             }
          }
       }
       return;
    }
    public final boolean checkHasLogin(User p0,h p1){
       LoginParams obj = PatchProxy.applyTwoRefs(p0, p1, this, KSPymkBridge.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (QCurrentUser.me().isLogined()) {
          return true;
       }
       LoginParams$a uoa = new LoginParams$a();
       uoa.d(a1.p(R.string.arg_RES_7f103077));
       obj = uoa.a();
       d.a(-1712118428).x00(this.getCurrentActivity(), 23, obj, new f(this, p0, p1));
       return false;
    }
    public final boolean checkRecoUser(RecoUser p0){
       boolean b = (p0 != null && p0.mUser != null)? true: false;
       return b;
    }
    public final void connectContact(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSPymkBridge.class, "29")) {
          return;
       }
       Activity currentActiv = this.getCurrentActivity();
       if (!currentActiv instanceof GifshowActivity || currentActiv.isDestroyed()) {
          return;
       }
       try{
          k1.o(new b(this, p0.optInt("recoPortal"), currentActiv));
       }catch(java.lang.Exception e3){
          if (SystemUtil.K()) {
             throw e3;
          }
          Log.e("KSPymkBridge", "connectContact", e3);
       }
       return;
    }
    public final void deleteAll(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSPymkBridge.class, "15")) {
          return;
       }
       h oh = this.mPageStatHashMap.get(p0.optString("sessionId"));
       if (oh != null) {
          oh.n();
       }
       return;
    }
    public final void deleteUser(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSPymkBridge.class, "14")) {
          return;
       }
       if (("user").equalsIgnoreCase(p0.optString("type"))) {
          String str = p0.optString("sessionId");
          RecoUser userObject = this.getUserObject(p0);
          if (userObject != null) {
             RecoUser mUser = userObject.mUser;
             if (mUser != null) {
                mUser.mPosition = this.getExtraUserIndex(p0);
                h oh = this.mPageStatHashMap.get(str);
                if (oh != null) {
                   this.updateExtraInfo(p0);
                   oh.k(new b(userObject.mUser, userObject.mFeedList), this.getExtraCloseBtnType(p0));
                }
             }
          }
       }
       return;
    }
    public final void doFollow(User p0,h p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSPymkBridge.class, "10")) {
          return;
       }
       if (p1 != null) {
          h b = p1.b;
          a a = b.a;
          if (a == null) {
             a = 1;
          }
          f$a uoa = new f$a(p0, this.getPageReferer(b.b));
          uoa.o(this.getCurrentActivity().getUrl());
          f$a uoa1 = uoa.h(p0.mFollowActionReasonTextId);
          uoa1.i(b.i(p0.getId(), p0.getId(), 1, b.a(a)));
          uoa1.d(p0.getThirdPartyName());
          b.m(uoa1, p0);
          p1.l(new b(p0));
          if (p0.isFollowingOrFollowRequesting()) {
             this.unfollow(uoa1);
          }else {
             FollowHelper.d(uoa1.b(), new h(this), Functions.e);
          }
          e.f0(false);
       }
       return;
    }
    public final void editAliasName(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSPymkBridge.class, "19")) {
          return;
       }
       if (("user").equalsIgnoreCase(p0.optString("type"))) {
          RecoUser userObject = this.getUserObject(p0);
          if (!this.checkRecoUser(userObject)) {
             return;
          }else {
             d.R8(userObject.mUser);
             k1.o(new KSPymkBridge$b(this, userObject));
          }
       }
       return;
    }
    public final void followUser(JSONObject p0){
       User user;
       if (PatchProxy.applyVoidOneRefs(p0, this, KSPymkBridge.class, "7")) {
          return;
       }
       JSONObject jSONObject = p0.optJSONObject("object");
       String str = p0.optString("sessionId");
       String str1 = "user";
       if (str1.equalsIgnoreCase(p0.optString("type")) && jSONObject != null) {
          user = a.a.h(jSONObject.optString(str1), User.class);
          if (user != null) {
             user.mPosition = this.getExtraUserIndex(p0);
             this.updateExtraInfo(p0);
             this.onFollowClick(user, str);
          }
       }
       return;
    }
    public final String getExtraCloseBtnType(JSONObject p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KSPymkBridge.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          p0 = p0.optJSONObject("extra");
          if (p0 != null) {
             return p0.optString("clickArea");
          }
       }catch(java.lang.Exception e3){
          if (!SystemUtil.K()) {
             Log.e("KSPymkBridge", "getUserObject", e3);
          }else {
             throw e3;
          }
       }
       return "close";
    }
    public final int getExtraPhotoIndex(JSONObject p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KSPymkBridge.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       try{
          p0 = p0.optJSONObject("extra");
          if (p0 != null) {
             return p0.optInt("photoIndex");
          }
       }catch(java.lang.Exception e3){
          if (!SystemUtil.K()) {
             Log.e("KSPymkBridge", "getUserObject", e3);
          }else {
             throw e3;
          }
       }
       return -1;
    }
    public final int getExtraUserIndex(JSONObject p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KSPymkBridge.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = -1;
       try{
          p0 = p0.optJSONObject("extra");
          if (p0 != null) {
             int i1 = p0.optInt("index");
             if (i1 > 0) {
                return (i1 + i);
             }
          }
       }catch(java.lang.Exception e4){
          if (!SystemUtil.K()) {
             Log.e("KSPymkBridge", "getUserObject", e4);
          }else {
             throw e4;
          }
       }
       return i;
    }
    public String getName(){
       return "KRNRecommendModule";
    }
    public final String getPageReferer(int p0){
       GifshowActivity obj;
       KSPymkBridge kSPymkBridge = KSPymkBridge.class;
       if (PatchProxy.isSupport(kSPymkBridge)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kSPymkBridge, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.getCurrentActivity();
       if (p0) {
          return TextUtils.I(x.a(obj.Q2(), p0));
       }else {
          return TextUtils.I(obj.Q2());
       }
    }
    public final RecoUser getUserObject(JSONObject p0){
       JSONObject obj = PatchProxy.applyOneRefs(p0, this, KSPymkBridge.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = p0.optJSONObject("object");
          if (("user").equalsIgnoreCase(p0.get("type")) && obj != null) {
             return a.a.h(obj.toString(), RecoUser.class);
          }
       }catch(java.lang.Exception e3){
          if (!SystemUtil.K()) {
             Log.e("KSPymkBridge", "getUserObject", e3);
          }else {
             throw e3;
          }
       }
       return null;
    }
    public final void init(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSPymkBridge.class, "18")) {
          return;
       }
       int i = p0.optInt("recoPortal");
       String str = p0.optString("sessionId");
       this.mRootTag = p0.optInt("rootTag");
       int i1 = p0.optInt("followRefer");
       String str1 = p0.optString("referPage");
       KSPymkBridge tmRootTag = this.mRootTag;
       if (tmRootTag > null) {
          m rNView = this.getRNView(tmRootTag);
          if (rNView instanceof Fragment) {
             a uoa = new a(i, i1, str1);
             Object obj = null;
             h oh = PatchProxy.applyOneRefs(uoa, obj, h.class, "2");
             if (oh != PatchProxyResult.class) {
             }else {
                oh = new h(uoa, obj, false, obj);
             }
             this.mPageStatHashMap.put(str, oh);
             this.mDisposable = RxBus.f.f(c.class).observeOn(d.a).subscribe(new KSPymkBridge$c(rNView, oh));
             rNView.getLifecycle().addObserver(new KSPymkBridge$2(this, oh));
          }
       }
       return;
    }
    public void invoke(String p0,String p1,Promise p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KSPymkBridge.class, "2")) {
          return;
       }
       this.reportAndCheck(this.getName(), "invoke", this.getReactApplicationContext());
       k1.o(new d(this, p0, p1, p2));
       return;
    }
    public void onCatalystInstanceDestroy(){
       if (PatchProxy.applyVoid(null, this, KSPymkBridge.class, "1")) {
          return;
       }
       this.mHandler.removeMessages(0x10000);
       this.showEvent(this.mShowUsers);
       KSPymkBridge tmDisposable = this.mDisposable;
       if (tmDisposable != null) {
          tmDisposable.dispose();
       }
       return;
    }
    public final void onFollowClick(User p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSPymkBridge.class, "9")) {
          return;
       }
       if (p0.mIsHiddenUser != null) {
          i.a(R.style.arg_RES_7f110668, 0x7f104fe7);
          return;
       }else {
          h oh = this.mPageStatHashMap.get(p1);
          if (oh != null) {
             oh.m(p0);
             if (!this.checkHasLogin(p0, oh)) {
                return;
             }else {
                this.doFollow(p0, oh);
             }
          }
          return;
       }
    }
    public final void openLiveStream(GifshowActivity p0,QPhoto p1,int p2,int p3){
       if (PatchProxy.isSupport(KSPymkBridge.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, KSPymkBridge.class, "27")) {
          return;
       }
       if (p1.isLiveStream()) {
          i0.a().e(61, p1.mEntity).d(b.b).a();
       }
       LiveAudienceParam$a uoa = new LiveAudienceParam$a();
       uoa.j(p1.mEntity);
       uoa.g(d.a(-1492894991).KL(p3));
       uoa.d(p2);
       d.a(-1492894991).wV(p0, uoa.a(), 1025);
       return;
    }
    public final void refresh(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSPymkBridge.class, "13")) {
          return;
       }
       h oh = this.mPageStatHashMap.get(p0.optString("sessionId"));
       if (oh != null) {
          oh.b();
       }
       return;
    }
    public final void reportAndCheck(String p0,String p1,ReactApplicationContext p2){
       String str1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KSPymkBridge.class, "3")) {
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
    public void showEvent(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSPymkBridge.class, "17")) {
          return;
       }
       Iterator iterator = p0.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          h oh = this.mPageStatHashMap.get(str);
          if (oh != null) {
             ArrayList uArrayList = new ArrayList();
             ArrayList uArrayList1 = p0.get(str);
             if (uArrayList1 != null && uArrayList1.size() > 0) {
                Iterator iterator1 = uArrayList1.iterator();
                while (iterator1.hasNext()) {
                   RecoUser recoUser = iterator1.next();
                   if (this.checkRecoUser(recoUser)) {
                      uArrayList.add(new b(recoUser.mUser, recoUser.mFeedList));
                   }else {
                      continue ;
                   }
                }
                oh.o(uArrayList);
                if (PatchProxy.applyVoid(null, oh, h.class, "24")) {
                   continue ;
                }else {
                   oh.g.clear();
                }
             }
          }
       }
       return;
    }
    public final void showHalfInfoEditDialog(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSPymkBridge.class, "28")) {
          return;
       }
       Activity currentActiv = this.getCurrentActivity();
       if (!currentActiv instanceof GifshowActivity || currentActiv.isDestroyed()) {
          return;
       }
       try{
          int i = p0.optInt("recoPortal");
          if (("user").equalsIgnoreCase(p0.optString("type"))) {
             k1.o(new c(this, this.getUserObject(p0), currentActiv, i));
          }
       }catch(java.lang.Exception e5){
          if (!SystemUtil.K()) {
             Log.e("KSPymkBridge", "showHalfInfoEditDialog", e5);
          }else {
             throw e5;
          }
       }
       return;
    }
    public final void toFeed(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSPymkBridge.class, "22")) {
          return;
       }
       if (("user").equalsIgnoreCase(p0.optString("type"))) {
          String str = p0.optString("sessionId");
          int extraPhotoIn = this.getExtraPhotoIndex(p0);
          RecoUser userObject = this.getUserObject(p0);
          if (this.checkRecoUser(userObject)) {
             userObject.mUser.mPosition = this.getExtraUserIndex(p0);
             QPhoto qPhoto = new QPhoto(userObject.mFeedList.get(extraPhotoIn));
             RecoUser mUser = userObject.mUser;
             if (mUser != null) {
                qPhoto.setUser(mUser);
             }
             h oh = this.mPageStatHashMap.get(str);
             this.updateExtraInfo(p0);
             if (qPhoto.isLiveStream() && oh != null) {
                this.openLiveStream(this.getCurrentActivity(), qPhoto, extraPhotoIn, oh.b.b);
                oh.p(qPhoto.mEntity, new b(userObject.mUser, userObject.mFeedList), extraPhotoIn);
             }else {
                PhotoDetailParam photoDetailP = new PhotoDetailParam(qPhoto);
                m rNView = this.getRNView(this.mRootTag);
                if (rNView instanceof Fragment && this.getCurrentActivity() != null) {
                   String str1 = f.b(rNView);
                   b.g(j.e(d.a(-1188553266).gx(userObject, this.getCurrentActivity().getUrl()), str1, SlideMediaType.PHOTO));
                   photoDetailP.setSlidePlayId(str1);
                   d.a(-1818031860).L5(this.getCurrentActivity(), 1025, photoDetailP, null);
                   if (oh != null) {
                      oh.q(qPhoto.mEntity, new b(userObject.mUser, userObject.mFeedList), extraPhotoIn);
                   }
                }
             }
          }
       }
    label_00db :
       return;
    }
    public final void toProfile(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSPymkBridge.class, "20")) {
          return;
       }
       if (("user").equalsIgnoreCase(p0.optString("type"))) {
          String str = p0.optString("sessionId");
          int extraUserInd = this.getExtraUserIndex(p0);
          RecoUser userObject = this.getUserObject(p0);
          if (this.checkRecoUser(userObject)) {
             userObject.mUser.mPosition = extraUserInd;
             h oh = this.mPageStatHashMap.get(str);
             if (oh != null) {
                this.updateExtraInfo(p0);
                oh.h(new b(userObject.mUser, userObject.mFeedList));
             }
             this.visitProfile(userObject);
          }
       }
       return;
    }
    public final void unfollow(f$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSPymkBridge.class, "12")) {
          return;
       }
       p0.q(true);
       FollowHelper.k(p0.b()).subscribe(c.b, Functions.d());
       return;
    }
    public final void updateExtraInfo(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSPymkBridge.class, "6")) {
          return;
       }
       String str = p0.optString("sessionId");
       p0 = p0.optJSONObject("extra");
       if (p0 != null) {
          p0 = p0.optJSONObject("eventPackage");
          h oh = this.mPageStatHashMap.get(str);
          if (oh != null && p0 != null) {
             try{
                p0.put("pymk_render_type", 2);
             }catch(org.json.JSONException e1){
                e1.printStackTrace();
             }
             oh.b.d(new a(p0));
          }
       }
       return;
    }
    public final void updatePortal(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSPymkBridge.class, "4")) {
          return;
       }
       int i = p0.optInt("recoPortal");
       h oh = this.mPageStatHashMap.get(p0.optString("sessionId"));
       if (oh != null) {
          oh.r(i);
       }
       return;
    }
    public final void updatePrsid(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSPymkBridge.class, "5")) {
          return;
       }
       String str = p0.optString("prsid");
       h oh = this.mPageStatHashMap.get(p0.optString("sessionId"));
       if (oh != null) {
          oh.b.f = str;
       }
       return;
    }
    public final void visitProfile(RecoUser p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSPymkBridge.class, "21")) {
          return;
       }
       if (!this.checkRecoUser(p0)) {
          return;
       }
       c uoc = new c();
       uoc.b(p0.mUser.getId());
       uoc.c(1);
       e.a().j(uoc);
       d.a(-1718536792).dK(this.getCurrentActivity(), ProfileStartParam.l(p0.mUser));
       return;
    }
}
