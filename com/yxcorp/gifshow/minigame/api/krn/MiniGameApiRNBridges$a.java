package com.yxcorp.gifshow.minigame.api.krn.MiniGameApiRNBridges$a;
import erd.g;
import com.yxcorp.gifshow.minigame.api.krn.MiniGameApiRNBridges;
import java.lang.String;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import oib.b;
import android.app.Activity;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import android.content.Context;
import com.kuaishou.krn.base.KrnBridge;

public class MiniGameApiRNBridges$a implements g	// class@001dd8
{
    public final String b;
    public final Callback c;
    public final MiniGameApiRNBridges d;

    public void MiniGameApiRNBridges$a(MiniGameApiRNBridges p0,String p1,Callback p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MiniGameApiRNBridges$a.class, "1")) {
       }else {
          this.d.callbackToJS(this.c, d.a(0x173837f0).eL(this.b, this.d.getCurrentActivity(), this.d.getReactApplicationContext()));
       }
       return;
    }
}
