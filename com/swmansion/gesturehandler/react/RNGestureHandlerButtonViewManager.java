package com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import com.facebook.react.uimanager.ViewGroupManager;
import ze.n0;
import android.view.View;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$ButtonViewGroup;
import android.content.Context;
import java.lang.String;
import android.view.ViewGroup;
import java.lang.Integer;

public class RNGestureHandlerButtonViewManager extends ViewGroupManager	// class@000c81
{

    public void RNGestureHandlerButtonViewManager(){
       super();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public RNGestureHandlerButtonViewManager$ButtonViewGroup createViewInstance(n0 p0){
       return new RNGestureHandlerButtonViewManager$ButtonViewGroup(p0);
    }
    public String getName(){
       return "RNGestureHandlerButton";
    }
    public void onAfterUpdateTransaction(View p0){
       this.onAfterUpdateTransaction(p0);
    }
    public void onAfterUpdateTransaction(RNGestureHandlerButtonViewManager$ButtonViewGroup p0){
       p0.d();
    }
    public void setBorderRadius(View p0,float p1){
       this.setBorderRadius(p0, p1);
    }
    public void setBorderRadius(RNGestureHandlerButtonViewManager$ButtonViewGroup p0,float p1){
       p0.setBorderRadius(p1);
    }
    public void setBorderless(RNGestureHandlerButtonViewManager$ButtonViewGroup p0,boolean p1){
       p0.setUseBorderlessDrawable(p1);
    }
    public void setEnabled(RNGestureHandlerButtonViewManager$ButtonViewGroup p0,boolean p1){
       p0.setEnabled(p1);
    }
    public void setForeground(RNGestureHandlerButtonViewManager$ButtonViewGroup p0,boolean p1){
       p0.setUseDrawableOnForeground(p1);
    }
    public void setRippleColor(RNGestureHandlerButtonViewManager$ButtonViewGroup p0,Integer p1){
       p0.setRippleColor(p1);
    }
    public void setRippleRadius(RNGestureHandlerButtonViewManager$ButtonViewGroup p0,Integer p1){
       p0.setRippleRadius(p1);
    }
}
