package com.yxcorp.gifshow.message.krn.KSIMBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.yxcorp.gifshow.message.krn.KSIMBridge$a;
import nsd.u;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.facebook.react.bridge.Promise;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import ak5.j;
import brd.t;
import com.yxcorp.gifshow.message.krn.KSIMBridge$b;
import com.yxcorp.gifshow.message.krn.KSIMBridge$c;
import erd.g;
import crd.b;
import com.facebook.react.bridge.ReadableMap;
import ik0.m;
import android.app.Activity;
import ik0.g;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import java.lang.CharSequence;
import tkd.b;
import tkd.d;
import pu5.a;
import qu5.r;
import com.kwai.feature.api.social.message.bridge.model.JsSuccessResult;
import qrd.l1;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.HashMap;
import fg6.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.message.krn.model.CreateGroupParams;
import com.kwai.imsdk.internal.db.GroupLocation;
import hw5.c;
import vv5.a0;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import gr8.c;
import brd.x;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.message.krn.KSIMBridge$createPublicGroup$1;
import com.yxcorp.gifshow.message.krn.KSIMBridge$createPublicGroup$2;
import msd.l;
import msd.a;
import io.reactivex.rxkotlin.SubscribersKt;
import com.yxcorp.gifshow.message.krn.KSIMBridge$d;
import java.lang.Runnable;
import com.facebook.react.bridge.UiThreadUtil;
import sv5.b;
import java.lang.Boolean;
import brd.a0;
import com.yxcorp.gifshow.message.krn.KSIMBridge$e;
import com.yxcorp.gifshow.message.krn.KSIMBridge$f;
import com.facebook.react.bridge.ReactContext;
import lj0.c;
import lj0.d;
import bi5.a;
import hw5.e;
import vv5.l1;
import com.yxcorp.gifshow.message.krn.KSIMBridge$g;
import com.yxcorp.gifshow.message.krn.KSIMBridge$h;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class KSIMBridge extends KrnBridge	// class@001d77
{
    public static final KSIMBridge$a Companion;
    public static String GROUP_CREATE_SUCCESS;

    static {
       KSIMBridge.Companion = new KSIMBridge$a(null);
       KSIMBridge.GROUP_CREATE_SUCCESS = "group_create_success";
    }
    public void KSIMBridge(ReactApplicationContext p0){
       a.p(p0, "reactContext");
       super(p0);
    }
    public final void addFavoriteEmotion(String p0,int p1,Promise p2){
       if (PatchProxy.isSupport(KSIMBridge.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, KSIMBridge.class, "4")) {
          return;
       }
       a.p(p0, "emotionId");
       a.p(p2, "promise");
       this.reportAndCheck(this.getName(), "addFavoriteEmotion", this.getReactApplicationContext());
       j.o().b(p0, String.valueOf(p1)).subscribe(new KSIMBridge$b(this, p2), new KSIMBridge$c(p2));
       return;
    }
    public final void createGroupChat(ReadableMap p0,int p1,Promise p2){
       if (PatchProxy.isSupport(KSIMBridge.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, KSIMBridge.class, "7")) {
          return;
       }
       a.p(p2, "promise");
       this.reportAndCheck(this.getName(), "createGroupChat", this.getReactApplicationContext());
       m rNView = this.getRNView(p1);
       String str = null;
       Activity activity = (rNView != null)? rNView.getActivity(): str;
       if (!activity instanceof RxFragmentActivity) {
          activity = str;
       }
       if (p0 != null) {
          str = p0.getString("userId");
       }
       if (activity != null) {
          String str1 = (str == null || !str.length())? 1: null;
          if (!str1) {
             d.a(-1497343380).ym(activity, str);
             p2.resolve(this.convertObjToNativeMap(new JsSuccessResult(l1.a)));
             return;
          }
       }
       p2.reject("-1", "");
       return;
    }
    public final void createPublicGroup(ReadableMap p0,int p1,Promise p2){
       Gson a;
       CreateGroupParams uCreateGroup;
       GroupLocation groupLocatio;
       if (PatchProxy.isSupport(KSIMBridge.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, KSIMBridge.class, "2")) {
          return;
       }
       a.p(p2, "promise");
       this.reportAndCheck(this.getName(), "createPublicGroup", this.getReactApplicationContext());
       String str = "";
       if (p0 != null) {
          HashMap hashMap = p0.toHashMap();
          if (hashMap != null) {
             a = a.a;
             String str1 = a.q(hashMap);
             if (str1 != null) {
                KSIMBridge$createPublicGroup$2 uocreatePubl = null;
                try{
                   uCreateGroup = a.h(str1, CreateGroupParams.class);
                }catch(java.lang.Exception e0){
                   uCreateGroup = uocreatePubl;
                }
                if (uCreateGroup != null) {
                   m rNView = this.getRNView(p1);
                   Activity activity = (rNView != null)? rNView.getActivity(): uocreatePubl;
                   if (!activity instanceof RxFragmentActivity) {
                      activity = uocreatePubl;
                   }
                   if (activity != null) {
                      try{
                         groupLocatio = a.a.h(uCreateGroup.getGroupLocation(), GroupLocation.class);
                      }catch(java.lang.Exception e0){
                         groupLocatio = uocreatePubl;
                      }
                      t ot = d.a(0x16b5eb97).PO(uCreateGroup.getGroupName(), uCreateGroup.getGroupHeadUrl(), groupLocatio, uCreateGroup.getSubCategoryId(), 4, uCreateGroup.getIntroduction()).compose(c.c(activity.m(), ActivityEvent.DESTROY)).observeOn(d.a);
                      a.o(ot, "PluginManager\n      .get¡­veOn\(KwaiSchedulers.MAIN\)");
                      SubscribersKt.d(ot, new KSIMBridge$createPublicGroup$2(p2), null, new KSIMBridge$createPublicGroup$1(activity), 2, null);
                      return;
                   }else {
                      p2.reject(e0, "activity=null");
                      return;
                   }
                }
             }
          }
       }
       p2.reject(e0, "params=null");
       return;
    }
    public final void exitWhatsUpGuidePage(int p0,Promise p1){
       KSIMBridge kSIMBridge = KSIMBridge.class;
       if (PatchProxy.isSupport(kSIMBridge) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, kSIMBridge, "8")) {
          return;
       }
       a.p(p1, "promise");
       this.reportAndCheck(this.getName(), "exitWhatsUpGuidePage", this.getReactApplicationContext());
       m rNView = this.getRNView(p0);
       String str = null;
       Activity activity = (rNView != null)? rNView.getActivity(): str;
       if (activity instanceof RxFragmentActivity) {
          str = activity;
       }
       if (str == null) {
          p1.reject("-1", "");
          return;
       }else {
          UiThreadUtil.runOnUiThread(new KSIMBridge$d(this, p1), 1000);
          return;
       }
    }
    public final void favoriteEmotionExistsWithEmotionId(String p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSIMBridge.class, "5")) {
          return;
       }
       a.p(p0, "emotionId");
       a.p(p1, "promise");
       this.reportAndCheck(this.getName(), "favoriteEmotionExistsWithEmotionId", this.getReactApplicationContext());
       int i = (j.o().v(p0) && j.o().v(p0))? 1: 0;
       p1.resolve(this.convertObjToNativeMap(new JsSuccessResult(new b(i))));
       return;
    }
    public final void fetchEmotionPackageWithPackageId(String p0,boolean p1,Promise p2){
       if (PatchProxy.isSupport(KSIMBridge.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, KSIMBridge.class, "3")) {
          return;
       }
       a.p(p0, "packageId");
       a.p(p2, "promise");
       this.reportAndCheck(this.getName(), "fetchEmotionPackageWithPackageId", this.getReactApplicationContext());
       j.o().y(p0).R(new KSIMBridge$e(this, p2), new KSIMBridge$f(p2));
       return;
    }
    public String getName(){
       return "IMBridge";
    }
    public final void reportAndCheck(String p0,String p1,ReactApplicationContext p2){
       String str1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KSIMBridge.class, "9")) {
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
    public final void shareEmotion(String p0,int p1,Promise p2){
       if (PatchProxy.isSupport(KSIMBridge.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, KSIMBridge.class, "6")) {
          return;
       }
       a.p(p0, "emotionMsgJsonString");
       a.p(p2, "promise");
       this.reportAndCheck(this.getName(), "shareEmotion", this.getReactApplicationContext());
       d.a(-854594802).F4(p0).subscribe(new KSIMBridge$g(this, p2), new KSIMBridge$h(p2));
       return;
    }
    public final void sharePublicGroup(String p0,String p1,int p2,String p3,String p4){
       KSIMBridge kSIMBridge = KSIMBridge.class;
       if (PatchProxy.isSupport(kSIMBridge)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, this, kSIMBridge, "1")) {
             return;
          }
       }
       this.reportAndCheck(this.getName(), "sharePublicGroup", this.getReactApplicationContext());
       Activity currentActiv = this.getCurrentActivity();
       if (!currentActiv instanceof GifshowActivity) {
          currentActiv = 0;
       }
       Activity uActivity = currentActiv;
       if (uActivity != null) {
          d.a(0x16b5eb97).pX(uActivity, p0, p1, p2, p3);
       }
       return;
    }
}
