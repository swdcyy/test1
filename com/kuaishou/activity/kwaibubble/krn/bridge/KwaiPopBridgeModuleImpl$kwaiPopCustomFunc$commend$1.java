package com.kuaishou.activity.kwaibubble.krn.bridge.KwaiPopBridgeModuleImpl$kwaiPopCustomFunc$commend$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import f55.g;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import java.lang.Integer;
import java.util.Map;

public final class KwaiPopBridgeModuleImpl$kwaiPopCustomFunc$commend$1 extends Lambda implements l	// class@00077f
{
    public final g $callback;

    public void KwaiPopBridgeModuleImpl$kwaiPopCustomFunc$commend$1(g p0){
       this.$callback = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiPopBridgeModuleImpl$kwaiPopCustomFunc$commend$1.class, "1")) {
          return;
       }
       HashMap hashMap = new HashMap();
       if (p0 == null) {
          p0 = Integer.valueOf(1);
       }
       hashMap.put("data", p0);
       p0 = this.$callback;
       if (p0 != null) {
          p0.onSuccess(hashMap);
       }
       return;
    }
}
