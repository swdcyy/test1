package com.yxcorp.gifshow.message.krn.KSIMBridge$b;
import erd.g;
import com.yxcorp.gifshow.message.krn.KSIMBridge;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import com.kwai.emotionsdk.bean.EmotionPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.social.message.bridge.model.JsSuccessResult;
import com.facebook.react.bridge.WritableNativeMap;
import com.kuaishou.krn.base.KrnBridge;

public final class KSIMBridge$b implements g	// class@001d6e
{
    public final KSIMBridge b;
    public final Promise c;

    public void KSIMBridge$b(KSIMBridge p0,Promise p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSIMBridge$b.class, "1")) {
       }else {
          this.c.resolve(this.b.convertObjToNativeMap(new JsSuccessResult(null)));
       }
       return;
    }
}
