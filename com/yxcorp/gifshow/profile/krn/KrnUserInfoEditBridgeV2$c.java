package com.yxcorp.gifshow.profile.krn.KrnUserInfoEditBridgeV2$c;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$d;
import com.yxcorp.gifshow.profile.krn.KrnUserInfoEditBridgeV2;
import java.lang.Object;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.ReactContext;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.profile.krn.a;
import erd.o;
import p3c.e;
import erd.g;
import crd.b;
import crd.a;

public class KrnUserInfoEditBridgeV2$c implements ProfileBackgroundPublishManager$d	// class@001363
{
    public final KrnUserInfoEditBridgeV2 a;

    public void KrnUserInfoEditBridgeV2$c(KrnUserInfoEditBridgeV2 p0){
       this.a = p0;
       super();
    }
    public void a(ProfileBgVideoInfo p0){
    }
    public void b(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnUserInfoEditBridgeV2$c.class, "3")) {
          return;
       }
       ReactApplicationContext reactApplica = this.a.getReactApplicationContext();
       if (reactApplica != null) {
          KrnUserInfoEditBridgeV2.notifyBackgroundEvent(reactApplica, KrnUserInfoEditBridgeV2.newBackgroundMap("image", "success"));
       }
       return;
    }
    public void c(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnUserInfoEditBridgeV2$c.class, "2")) {
          return;
       }
       this.a.mAutoDisposables.c(t.just(p0).subscribeOn(d.c).map(a.b).observeOn(d.a).subscribe(new e(this)));
       return;
    }
    public void onFail(){
       if (PatchProxy.applyVoid(null, this, KrnUserInfoEditBridgeV2$c.class, "1")) {
          return;
       }
       ReactApplicationContext reactApplica = this.a.getReactApplicationContext();
       if (reactApplica != null) {
          KrnUserInfoEditBridgeV2.notifyBackgroundEvent(reactApplica, KrnUserInfoEditBridgeV2.newBackgroundMap("image", "fail"));
       }
       return;
    }
}
