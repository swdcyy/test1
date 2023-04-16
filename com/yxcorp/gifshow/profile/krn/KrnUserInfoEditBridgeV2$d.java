package com.yxcorp.gifshow.profile.krn.KrnUserInfoEditBridgeV2$d;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$e;
import com.yxcorp.gifshow.profile.krn.KrnUserInfoEditBridgeV2;
import java.lang.Object;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.ReactContext;
import android.app.Activity;
import e17.i$b;
import e17.i;
import java.io.File;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.profile.krn.b;
import erd.o;
import p3c.f;
import erd.g;
import crd.b;
import crd.a;
import com.yxcorp.gifshow.profile.krn.c;
import p3c.g;
import java.lang.Integer;
import java.lang.Throwable;

public class KrnUserInfoEditBridgeV2$d implements ProfileBackgroundPublishManager$e	// class@001364
{
    public final KrnUserInfoEditBridgeV2 a;

    public void KrnUserInfoEditBridgeV2$d(KrnUserInfoEditBridgeV2 p0){
       this.a = p0;
       super();
    }
    public void a(ProfileBgVideoInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnUserInfoEditBridgeV2$d.class, "1")) {
          return;
       }
       ReactApplicationContext reactApplica = this.a.getReactApplicationContext();
       if (reactApplica != null) {
          KrnUserInfoEditBridgeV2.notifyBackgroundEvent(reactApplica, KrnUserInfoEditBridgeV2.newBackgroundMap("video", "success"));
       }
       return;
    }
    public void b(ProfileBgVideoInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnUserInfoEditBridgeV2$d.class, "4")) {
          return;
       }
       ReactApplicationContext reactApplica = this.a.getReactApplicationContext();
       if (reactApplica != null) {
          WritableMap writableMap = KrnUserInfoEditBridgeV2.newBackgroundMap("video", "uploading");
          writableMap.putDouble("progress", 0x3ff0000000000000);
          KrnUserInfoEditBridgeV2.notifyBackgroundEvent(reactApplica, writableMap);
          Activity currentActiv = this.a.getCurrentActivity();
          if (currentActiv != null) {
             i$b uob = i.m();
             uob.x(R.string.arg_RES_7f103e9b);
             uob.p(R.drawable.arg_RES_7f082463);
             uob.o(3000);
             uob.k(currentActiv);
             i.z(uob);
          }
       }
       return;
    }
    public void c(ProfileBgVideoInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnUserInfoEditBridgeV2$d.class, "2")) {
          return;
       }
       ReactApplicationContext reactApplica = this.a.getReactApplicationContext();
       if (reactApplica != null) {
          WritableMap writableMap = KrnUserInfoEditBridgeV2.newBackgroundMap("video", "begin");
          if (p0.getLocalCoverFile() != null) {
             this.a.mAutoDisposables.c(t.just(p0.getLocalCoverFile()).subscribeOn(d.c).map(b.b).observeOn(d.a).subscribe(new f(writableMap, reactApplica)));
          }else {
             this.a.mAutoDisposables.c(t.just(p0).subscribeOn(d.c).map(c.b).subscribe(new g(writableMap, reactApplica)));
          }
       }
       return;
    }
    public void d(ProfileBgVideoInfo p0,int p1,int p2){
       if (PatchProxy.isSupport(KrnUserInfoEditBridgeV2$d.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, KrnUserInfoEditBridgeV2$d.class, "3")) {
          return;
       }
       ReactApplicationContext reactApplica = this.a.getReactApplicationContext();
       if (reactApplica != null) {
          WritableMap writableMap = KrnUserInfoEditBridgeV2.newBackgroundMap("video", "uploading");
          writableMap.putDouble("progress", ((double)p1 / (double)p2));
          KrnUserInfoEditBridgeV2.notifyBackgroundEvent(reactApplica, writableMap);
       }
       return;
    }
    public void e(ProfileBgVideoInfo p0,int p1,String p2,Throwable p3){
       if (PatchProxy.isSupport(KrnUserInfoEditBridgeV2$d.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, KrnUserInfoEditBridgeV2$d.class, "5")) {
          return;
       }
       ReactApplicationContext reactApplica = this.a.getReactApplicationContext();
       if (reactApplica != null) {
          WritableMap writableMap = KrnUserInfoEditBridgeV2.newBackgroundMap("video", "fail");
          if (p2 != null) {
             writableMap.putString("error_msg", p2);
          }
          KrnUserInfoEditBridgeV2.notifyBackgroundEvent(reactApplica, writableMap);
          Activity currentActiv = this.a.getCurrentActivity();
          if (currentActiv != null && p0.getStatus() == 2) {
             i$b uob = i.m();
             uob.x(R.string.arg_RES_7f104f9d);
             uob.p(R.drawable.arg_RES_7f082462);
             uob.o(3000);
             uob.k(currentActiv);
             i.z(uob);
          }
       }
    label_005f :
       return;
    }
}
