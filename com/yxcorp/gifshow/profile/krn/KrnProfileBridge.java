package com.yxcorp.gifshow.profile.krn.KrnProfileBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import com.yxcorp.gifshow.util.rx.RxBus;
import i3c.d;
import java.lang.Class;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.profile.krn.KrnProfileBridge$a;
import com.facebook.react.bridge.ReactContext;
import erd.g;
import crd.b;
import com.kuaishou.android.model.feed.VideoFeed;
import android.app.Activity;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.util.Objects;
import a2c.a;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import com.kwai.framework.ui.popupmanager.dialog.a;
import a2c.d;
import io.reactivex.internal.functions.Functions;
import com.facebook.react.bridge.BaseJavaModule;
import lnc.b9;
import lj0.c;
import lj0.d;
import bi5.a;
import fg6.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.google.gson.Gson;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.util.List;
import v2c.e;
import java.lang.Throwable;
import v2c.g;
import p3c.b;
import java.lang.Runnable;
import ekd.k1;

public class KrnProfileBridge extends KrnBridge	// class@001360
{
    public b mDisposable;
    public a mProfileBackgroundFeedClickHelper;

    public void KrnProfileBridge(ReactApplicationContext p0){
       super(p0);
       this.mDisposable = RxBus.f.f(d.class).observeOn(d.a).subscribe(new KrnProfileBridge$a(p0));
    }
    public static void a(KrnProfileBridge p0,VideoFeed p1){
       p0.lambda$updateVideoBackgroundFromFeed$0(p1);
    }
    private void lambda$updateVideoBackgroundFromFeed$0(VideoFeed p0){
       KrnProfileBridge tmProfileBac = this.mProfileBackgroundFeedClickHelper;
       GifshowActivity currentActiv = this.getCurrentActivity();
       Objects.requireNonNull(tmProfileBac);
       if (PatchProxy.applyVoidTwoRefs(currentActiv, p0, tmProfileBac, a.class, "1")) {
       }else {
          a.p(currentActiv, "activity");
          a.p(p0, "feed");
          tmProfileBac.a = p0;
          String str = "android.permission.WRITE_EXTERNAL_STORAGE";
          if (PermissionUtils.a(currentActiv, str)) {
             tmProfileBac.b(currentActiv);
          }else {
             String[] stringArray = new String[]{str};
             tmProfileBac.e = a.k(currentActiv, stringArray).subscribe(new d(tmProfileBac, currentActiv), Functions.d());
          }
       }
       return;
    }
    public String getName(){
       return "ProfileCommonModule";
    }
    public void onCatalystInstanceDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KrnProfileBridge.class, "2")) {
          return;
       }
       super.onCatalystInstanceDestroy();
       b9.a(this.mDisposable);
       KrnProfileBridge tmProfileBac = this.mProfileBackgroundFeedClickHelper;
       if (tmProfileBac != null) {
          Objects.requireNonNull(tmProfileBac);
          if (!PatchProxy.applyVoid(objArray, tmProfileBac, a.class, "7")) {
             b9.a(tmProfileBac.b);
             b9.a(tmProfileBac.e);
             b9.a(tmProfileBac.f);
          }
       }
       return;
    }
    public final void reportAndCheck(String p0,String p1,ReactApplicationContext p2){
       String str1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KrnProfileBridge.class, "3")) {
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
    public void updateVideoBackgroundFromFeed(String p0){
       int i;
       BaseFeed uBaseFeed;
       String str = "ProfileCommonModule";
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnProfileBridge.class, "1")) {
          return;
       }
       this.reportAndCheck(this.getName(), "updateVideoBackgroundFromFeed", this.getReactApplicationContext());
       try{
          i = 0;
          uBaseFeed = a.a.h(p0, BaseFeed.class);
       }catch(com.google.gson.JsonSyntaxException e5){
          g.d(KsLogProfileTag.BG_VIDEO.appendTag(str), "Feed fromJson Exception", e5);
          uBaseFeed = i;
       }
       if (!uBaseFeed instanceof VideoFeed) {
          g.d(KsLogProfileTag.BG_VIDEO.appendTag(str), "Feed is not VideoFeed", i);
          return;
       }else if(this.mProfileBackgroundFeedClickHelper == null){
          this.mProfileBackgroundFeedClickHelper = new a();
       }
       k1.o(new b(this, uBaseFeed));
       return;
    }
}
