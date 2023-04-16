package com.swmansion.gesturehandler.react.RNGestureHandlerRootViewManager;
import com.facebook.react.uimanager.ViewGroupManager;
import ze.n0;
import android.view.View;
import com.swmansion.gesturehandler.react.RNGestureHandlerRootView;
import android.content.Context;
import java.util.Map;
import java.lang.Object;
import vd.d;
import java.lang.String;
import gn8.g;

public class RNGestureHandlerRootViewManager extends ViewGroupManager	// class@000c8f
{

    public void RNGestureHandlerRootViewManager(){
       super();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public RNGestureHandlerRootView createViewInstance(n0 p0){
       return new RNGestureHandlerRootView(p0);
    }
    public Map getExportedCustomDirectEventTypeConstants(){
       return d.e("onGestureHandlerEvent", d.d("registrationName", "onGestureHandlerEvent"), "onGestureHandlerStateChange", d.d("registrationName", "onGestureHandlerStateChange"));
    }
    public String getName(){
       return "GestureHandlerRootView";
    }
    public void onDropViewInstance(View p0){
       this.onDropViewInstance(p0);
    }
    public void onDropViewInstance(RNGestureHandlerRootView p0){
       p0 = p0.c;
       if (p0 != null) {
          p0.e();
       }
       return;
    }
    public void setForbiddenMultiFinger(RNGestureHandlerRootView p0,boolean p1){
       p0.setForbiddenMultiFinger(p1);
    }
}
