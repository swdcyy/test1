package com.kuaishou.activity.kwaibubble.krn.bridge.KwaiPopBridgeModuleImpl;
import wn.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import p55.a;
import com.kuaishou.activity.kwaibubble.krn.bridge.JsKwaiPopParams;
import f55.g;
import kotlin.jvm.internal.a;
import sn.a;
import com.kuaishou.activity.kwaibubble.krn.bridge.KwaiPopBridgeModuleImpl$kwaiPopCustomFunc$commend$1;
import msd.l;
import sn.b;
import java.lang.ref.WeakReference;
import qrd.l1;

public final class KwaiPopBridgeModuleImpl implements a	// class@000780
{

    public void KwaiPopBridgeModuleImpl(){
       super();
    }
    public String getNameSpace(){
       Object obj = PatchProxy.apply(null, this, KwaiPopBridgeModuleImpl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "growth";
    }
    public void w6(a p0,JsKwaiPopParams p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KwaiPopBridgeModuleImpl.class, "1")) {
          return;
       }
       a.p(p0, "bridgeContext");
       a.p(p1, "params");
       b uob = a.c.b(p1.getName(), p1.getParams(), new KwaiPopBridgeModuleImpl$kwaiPopCustomFunc$commend$1(p2));
       if (uob != null) {
          p1 = uob.e();
          if (p1 != null) {
             WeakReference weakReferenc = uob.b();
             if (weakReferenc != null) {
                l ol = weakReferenc.get();
                if (ol != null) {
                   ol.invoke(p1);
                }
             }
          }
       }
       return;
    }
}
