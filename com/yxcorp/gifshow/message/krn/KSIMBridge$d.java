package com.yxcorp.gifshow.message.krn.KSIMBridge$d;
import java.lang.Runnable;
import com.yxcorp.gifshow.message.krn.KSIMBridge;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.social.message.bridge.model.JsSuccessResult;
import qrd.l1;
import com.facebook.react.bridge.WritableNativeMap;
import com.kuaishou.krn.base.KrnBridge;

public final class KSIMBridge$d implements Runnable	// class@001d72
{
    public final KSIMBridge b;
    public final Promise c;

    public void KSIMBridge$d(KSIMBridge p0,Promise p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, KSIMBridge$d.class, "1")) {
          return;
       }
       this.c.resolve(this.b.convertObjToNativeMap(new JsSuccessResult(l1.a)));
       return;
    }
}
