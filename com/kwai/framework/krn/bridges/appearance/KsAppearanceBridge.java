package com.kwai.framework.krn.bridges.appearance.KsAppearanceBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ekd.i;
import zf6.k;

public class KsAppearanceBridge extends KrnBridge	// class@0015a6
{

    public void KsAppearanceBridge(ReactApplicationContext p0){
       super(p0);
    }
    public boolean canImmersive(){
       Object obj = PatchProxy.apply(null, this, KsAppearanceBridge.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return i.c();
    }
    public String getColorScheme(){
       String obj = PatchProxy.apply(null, this, KsAppearanceBridge.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (k.d())? "dark": "light";
       return obj;
    }
    public String getName(){
       return "KSAppearance";
    }
}
