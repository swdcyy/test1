package com.facebook.react.views.scroll.ReactHorizontalScrollContainerViewManager;
import com.facebook.react.views.view.ReactClippingViewManager;
import ze.n0;
import android.view.View;
import com.facebook.react.views.scroll.ReactHorizontalScrollContainerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;

public class ReactHorizontalScrollContainerViewManager extends ReactClippingViewManager	// class@0013e2
{

    public void ReactHorizontalScrollContainerViewManager(){
       super();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public ReactHorizontalScrollContainerView createViewInstance(n0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactHorizontalScrollContainerViewManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ReactHorizontalScrollContainerView(p0);
    }
    public String getName(){
       return "AndroidHorizontalScrollContentView";
    }
}
