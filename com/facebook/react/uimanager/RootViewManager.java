package com.facebook.react.uimanager.RootViewManager;
import com.facebook.react.uimanager.ViewGroupManager;
import ze.n0;
import android.view.View;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.FrameLayout;
import android.content.Context;

public class RootViewManager extends ViewGroupManager	// class@001328
{

    public void RootViewManager(){
       super();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public ViewGroup createViewInstance(n0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RootViewManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new FrameLayout(p0);
    }
    public String getName(){
       return "RootView";
    }
}
