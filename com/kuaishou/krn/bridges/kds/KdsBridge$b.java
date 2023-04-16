package com.kuaishou.krn.bridges.kds.KdsBridge$b;
import f55.g;
import com.kuaishou.krn.bridges.kds.KdsBridge;
import java.lang.String;
import java.lang.Object;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import com.kuaishou.krn.bridges.kds.KdsErrorResult;
import com.facebook.react.bridge.WritableNativeMap;
import com.kuaishou.krn.base.KrnBridge;

public final class KdsBridge$b implements g	// class@000814
{
    public final KdsBridge b;
    public final String c;
    public final String d;

    public void KdsBridge$b(KdsBridge p0,String p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void a(int p0,String p1,Bundle p2){
       KdsBridge$b tb;
       if (PatchProxy.isSupport(KdsBridge$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, KdsBridge$b.class, "2")) {
          return;
       }
       if (a.g(this.d, "str")) {
          tb = this.b;
          tb.invokeCallback(this.c, tb.makeStrCallback(new KdsErrorResult(p0, p1)));
       }else {
          tb = this.b;
          tb.invokeCallback(this.c, tb.convertObjToNativeMap(new KdsErrorResult(p0, p1)));
       }
       return;
    }
    public void onSuccess(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KdsBridge$b.class, "1")) {
          return;
       }
       this.b.invokeCallback(this.c, p0);
       return;
    }
}
