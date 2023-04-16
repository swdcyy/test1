package com.kuaishou.merchant.krn.bowl.MerchantEngineBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import vx4.f;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import java.lang.Boolean;
import com.facebook.react.bridge.ReadableMap;
import java.util.Map;
import ri0.a;

public final class MerchantEngineBridge extends KrnBridge	// class@00185e
{

    public void MerchantEngineBridge(ReactApplicationContext p0){
       super(p0);
    }
    public final void dispatchGlobalEvent(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantEngineBridge.class, "3")) {
          return;
       }
       d.a(-409516709).tL(p0, p1);
       return;
    }
    public final void dispatchPageEvent(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantEngineBridge.class, "2")) {
          return;
       }
       d.a(-409516709).nD(p0, p1);
       return;
    }
    public String getName(){
       return "MerchantEngineBridge";
    }
    public final String getPageId(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, MerchantEngineBridge.class, "8");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return d.a(-409516709).kh(this.getCurrentActivity());
    }
    public final boolean hasMethod(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MerchantEngineBridge.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       d.a(-409516709).nK(p0);
       return false;
    }
    public final boolean hasMethodForPage(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MerchantEngineBridge.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       d.a(-409516709).wI(p0);
       return false;
    }
    public final void invokeGlobalMethod(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantEngineBridge.class, "4")) {
          return;
       }
       d.a(-409516709).sr(p0);
       return;
    }
    public final void invokePageMethod(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantEngineBridge.class, "5")) {
          return;
       }
       d.a(-409516709).ML(p0);
       return;
    }
    public final void onRenderEnd(ReadableMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantEngineBridge.class, "1")) {
          return;
       }
       d.a(-409516709).RZ(a.b(p0));
       return;
    }
}
