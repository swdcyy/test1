package com.kuaishou.krn.bridges.kds.KdsBridge$d;
import f55.g;
import com.kuaishou.krn.bridges.kds.KdsBridge;
import java.lang.String;
import java.lang.Object;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import java.util.Map;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.Arguments;

public final class KdsBridge$d implements g	// class@000816
{
    public final KdsBridge b;
    public final g c;
    public final String d;

    public void KdsBridge$d(KdsBridge p0,g p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void a(int p0,String p1,Bundle p2){
       if (PatchProxy.isSupport(KdsBridge$d.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, KdsBridge$d.class, "1")) {
          return;
       }
       this.c.a(p0, p1, p2);
       return;
    }
    public void onSuccess(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KdsBridge$d.class, "2")) {
          return;
       }
       if (a.g("str", this.d)) {
          this.c.onSuccess(this.b.makeStrCallback(p0));
          return;
       }else if(p0 instanceof String){
          p0 = this.b.convertJsonToBean(p0, Map.class);
          if (!p0 instanceof Map) {
             p0 = null;
          }
          this.c.onSuccess(Arguments.makeNativeMap(p0));
       }else {
          this.c.onSuccess(this.b.convertObjToNativeMap(p0));
       }
       return;
    }
}
