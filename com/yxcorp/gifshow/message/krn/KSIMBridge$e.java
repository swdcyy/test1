package com.yxcorp.gifshow.message.krn.KSIMBridge$e;
import erd.g;
import com.yxcorp.gifshow.message.krn.KSIMBridge;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import com.kwai.emotionsdk.bean.EmotionPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.social.message.bridge.model.JsSuccessResult;
import sv5.a;
import com.facebook.react.bridge.WritableNativeMap;
import com.kuaishou.krn.base.KrnBridge;

public final class KSIMBridge$e implements g	// class@001d73
{
    public final KSIMBridge b;
    public final Promise c;

    public void KSIMBridge$e(KSIMBridge p0,Promise p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSIMBridge$e.class, "1")) {
       }else {
          a.p(p0, "data");
          this.c.resolve(this.b.convertObjToNativeMap(new JsSuccessResult(new a(p0))));
       }
       return;
    }
}
