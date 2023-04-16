package com.yxcorp.gifshow.minigame.api.krn.MiniGameApiRNBridges;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import oib.f;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import oib.d;
import io.reactivex.g;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.minigame.api.krn.MiniGameApiRNBridges$a;
import erd.g;
import crd.b;
import tkd.b;
import tkd.d;
import oib.b;
import android.app.Activity;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import android.content.Context;

public class MiniGameApiRNBridges extends KrnBridge	// class@001dd9
{

    public void MiniGameApiRNBridges(ReactApplicationContext p0){
       super(p0);
    }
    public void MiniGameRNBridge(String p0,Callback p1){
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MiniGameApiRNBridges.class, str)) {
          return;
       }
       if (!f.a()) {
          t ot = PatchProxy.apply(null, null, f.class, str);
          if (ot != PatchProxyResult.class) {
          }else {
             ot = t.create(d.b).subscribeOn(d.c);
          }
          ot.subscribe(new MiniGameApiRNBridges$a(this, p0, p1));
       }else {
          this.callbackToJS(p1, d.a(0x173837f0).eL(p0, this.getCurrentActivity(), this.getReactApplicationContext()));
       }
       return;
    }
    public String getName(){
       return "KSMiniGame";
    }
}
