package com.swmansion.rnscreens.ScreenViewManager;
import com.facebook.react.uimanager.ViewGroupManager;
import ze.n0;
import android.view.View;
import com.swmansion.rnscreens.Screen;
import com.facebook.react.bridge.ReactContext;
import java.util.Map;
import java.lang.Object;
import vd.d;
import java.lang.String;
import com.swmansion.rnscreens.Screen$StackAnimation;
import com.swmansion.rnscreens.Screen$StackPresentation;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.lang.StringBuilder;

public class ScreenViewManager extends ViewGroupManager	// class@000cba
{

    public void ScreenViewManager(){
       super();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public Screen createViewInstance(n0 p0){
       return new Screen(p0);
    }
    public Map getExportedCustomDirectEventTypeConstants(){
       return d.f("topDismissed", d.d("registrationName", "onDismissed"), "topAppear", d.d("registrationName", "onAppear"), "topFinishTransitioning", d.d("registrationName", "onFinishTransitioning"));
    }
    public String getName(){
       return "RNSScreen";
    }
    public void setActive(Screen p0,float p1){
       boolean b = (p1)? true: false;
       p0.setActive(b);
       return;
    }
    public void setGestureEnabled(Screen p0,boolean p1){
       p0.setGestureEnabled(p1);
    }
    public void setStackAnimation(Screen p0,String p1){
       if (p1 == null || ("default").equals(p1)) {
          p0.setStackAnimation(Screen$StackAnimation.DEFAULT);
       }else if(("none").equals(p1)){
          p0.setStackAnimation(Screen$StackAnimation.NONE);
       }else if(("fade").equals(p1)){
          p0.setStackAnimation(Screen$StackAnimation.FADE);
       }
       return;
    }
    public void setStackPresentation(Screen p0,String p1){
       if (("push").equals(p1)) {
          p0.setStackPresentation(Screen$StackPresentation.PUSH);
       }else if(!("modal").equals(p1) && (!("containedModal").equals(p1) && (("fullScreenModal").equals(p1) || ("formSheet").equals(p1)))){
          p0.setStackPresentation(Screen$StackPresentation.MODAL);
       }else if(("transparentModal").equals(p1) || ("containedTransparentModal").equals(p1)){
          p0.setStackPresentation(Screen$StackPresentation.TRANSPARENT_MODAL);
       }else {
          throw new JSApplicationIllegalArgumentException("Unknown presentation type "+p1);
       }
       return;
    }
}
