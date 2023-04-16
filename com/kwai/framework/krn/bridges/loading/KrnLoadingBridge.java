package com.kwai.framework.krn.bridges.loading.KrnLoadingBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ik0.m;

public class KrnLoadingBridge extends KrnBridge	// class@0015b7
{

    public void KrnLoadingBridge(ReactApplicationContext p0){
       super(p0);
    }
    public String getName(){
       return "RNAndroidLoading";
    }
    public void hide(){
       if (PatchProxy.applyVoid(null, this, KrnLoadingBridge.class, "2")) {
          return;
       }
       m rNView = this.getRNView();
       if (rNView != null) {
          rNView.x();
       }
       return;
    }
    public void show(){
       if (PatchProxy.applyVoid(null, this, KrnLoadingBridge.class, "1")) {
          return;
       }
       m rNView = this.getRNView();
       if (rNView != null) {
          rNView.fc();
       }
       return;
    }
}
