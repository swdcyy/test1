package com.kwai.framework.krn.bridges.network.KrnNetErrorShowBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import ik0.m;
import java.lang.Throwable;
import java.lang.String;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import l86.a;
import java.lang.Runnable;
import com.facebook.react.bridge.UiThreadUtil;

public class KrnNetErrorShowBridge extends KrnBridge	// class@0015c4
{

    public void KrnNetErrorShowBridge(ReactApplicationContext p0){
       super(p0);
    }
    public static void a(KrnNetErrorShowBridge p0){
       p0.lambda$showFetchSettingsDataError$0();
    }
    private void lambda$showFetchSettingsDataError$0(){
       m rNView = this.getRNView();
       if (rNView != null) {
          rNView.Gd(null);
       }
       return;
    }
    public String getName(){
       return "KSRCTErrorShowingModule";
    }
    public void showFetchSettingsDataError(Callback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnNetErrorShowBridge.class, "1")) {
          return;
       }
       UiThreadUtil.runOnUiThread(new a(this));
       return;
    }
}
