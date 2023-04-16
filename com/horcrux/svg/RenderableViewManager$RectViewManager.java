package com.horcrux.svg.RenderableViewManager$RectViewManager;
import com.horcrux.svg.RenderableViewManager;
import com.horcrux.svg.RenderableViewManager$SVGClass;
import com.horcrux.svg.RenderableViewManager$1;
import ze.n0;
import android.view.View;
import com.horcrux.svg.VirtualView;
import ze.x;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.horcrux.svg.RectView;
import com.facebook.react.bridge.Dynamic;

public class RenderableViewManager$RectViewManager extends RenderableViewManager	// class@0005e1
{

    public void RenderableViewManager$RectViewManager(){
       super(RenderableViewManager$SVGClass.RNSVGRect, null);
    }
    public void addEventEmitters(n0 p0,View p1){
       super.addEventEmitters(p0, p1);
    }
    public x createShadowNodeInstance(){
       return super.createShadowNodeInstance();
    }
    public View createViewInstance(n0 p0){
       return super.createViewInstance(p0);
    }
    public void onAfterUpdateTransaction(View p0){
       super.onAfterUpdateTransaction(p0);
    }
    public void onDropViewInstance(View p0){
       super.onDropViewInstance(p0);
    }
    public void setHeight(RectView p0,Dynamic p1){
       p0.setHeight(p1);
    }
    public void setOpacity(View p0,float p1){
       super.setOpacity(p0, p1);
    }
    public void setRx(RectView p0,Dynamic p1){
       p0.setRx(p1);
    }
    public void setRy(RectView p0,Dynamic p1){
       p0.setRy(p1);
    }
    public void setWidth(RectView p0,Dynamic p1){
       p0.setWidth(p1);
    }
    public void setX(RectView p0,Dynamic p1){
       p0.setX(p1);
    }
    public void setY(RectView p0,Dynamic p1){
       p0.setY(p1);
    }
}
