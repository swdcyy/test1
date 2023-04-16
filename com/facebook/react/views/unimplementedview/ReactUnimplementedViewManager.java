package com.facebook.react.views.unimplementedview.ReactUnimplementedViewManager;
import com.facebook.react.uimanager.ViewGroupManager;
import ze.n0;
import android.view.View;
import com.facebook.react.views.unimplementedview.ReactUnimplementedView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;

public class ReactUnimplementedViewManager extends ViewGroupManager	// class@001434
{

    public void ReactUnimplementedViewManager(){
       super();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public ReactUnimplementedView createViewInstance(n0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactUnimplementedViewManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ReactUnimplementedView(p0);
    }
    public String getName(){
       return "UnimplementedNativeView";
    }
    public void setName(ReactUnimplementedView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactUnimplementedViewManager.class, "2")) {
          return;
       }
       p0.setName(p1);
       return;
    }
}
