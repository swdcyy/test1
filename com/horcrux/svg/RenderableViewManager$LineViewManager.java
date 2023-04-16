package com.horcrux.svg.RenderableViewManager$LineViewManager;
import com.horcrux.svg.RenderableViewManager;
import com.horcrux.svg.RenderableViewManager$SVGClass;
import com.horcrux.svg.RenderableViewManager$1;
import ze.n0;
import android.view.View;
import com.horcrux.svg.VirtualView;
import ze.x;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.horcrux.svg.LineView;
import com.facebook.react.bridge.Dynamic;

public class RenderableViewManager$LineViewManager extends RenderableViewManager	// class@0005d2
{

    public void RenderableViewManager$LineViewManager(){
       super(RenderableViewManager$SVGClass.RNSVGLine, null);
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
    public void setOpacity(View p0,float p1){
       super.setOpacity(p0, p1);
    }
    public void setX1(LineView p0,Dynamic p1){
       p0.setX1(p1);
    }
    public void setX2(LineView p0,Dynamic p1){
       p0.setX2(p1);
    }
    public void setY1(LineView p0,Dynamic p1){
       p0.setY1(p1);
    }
    public void setY2(LineView p0,Dynamic p1){
       p0.setY2(p1);
    }
}
