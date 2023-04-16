package com.BV.LinearGradient.LinearGradientManager;
import com.facebook.react.uimanager.SimpleViewManager;
import ze.n0;
import android.view.View;
import com.BV.LinearGradient.LinearGradientView;
import android.content.Context;
import java.lang.String;
import com.facebook.react.bridge.ReadableArray;

public class LinearGradientManager extends SimpleViewManager	// class@000d47
{

    public void LinearGradientManager(){
       super();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public LinearGradientView createViewInstance(n0 p0){
       return new LinearGradientView(p0);
    }
    public String getName(){
       return "BVLinearGradient";
    }
    public void setAngle(LinearGradientView p0,float p1){
       p0.setAngle(p1);
    }
    public void setAngleCenter(LinearGradientView p0,ReadableArray p1){
       p0.setAngleCenter(p1);
    }
    public void setBorderRadii(LinearGradientView p0,ReadableArray p1){
       p0.setBorderRadii(p1);
    }
    public void setColors(LinearGradientView p0,ReadableArray p1){
       p0.setColors(p1);
    }
    public void setEndPosition(LinearGradientView p0,ReadableArray p1){
       p0.setEndPosition(p1);
    }
    public void setLocations(LinearGradientView p0,ReadableArray p1){
       if (p1 != null) {
          p0.setLocations(p1);
       }
       return;
    }
    public void setStartPosition(LinearGradientView p0,ReadableArray p1){
       p0.setStartPosition(p1);
    }
    public void setUseAngle(LinearGradientView p0,boolean p1){
       p0.setUseAngle(p1);
    }
}
