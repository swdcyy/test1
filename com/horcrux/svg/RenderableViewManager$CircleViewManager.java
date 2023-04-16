package com.horcrux.svg.RenderableViewManager$CircleViewManager;
import com.horcrux.svg.RenderableViewManager;
import com.horcrux.svg.RenderableViewManager$SVGClass;
import com.horcrux.svg.RenderableViewManager$1;
import ze.n0;
import android.view.View;
import com.horcrux.svg.VirtualView;
import ze.x;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.horcrux.svg.CircleView;
import com.facebook.react.bridge.Dynamic;

public class RenderableViewManager$CircleViewManager extends RenderableViewManager	// class@0005c4
{

    public void RenderableViewManager$CircleViewManager(){
       super(RenderableViewManager$SVGClass.RNSVGCircle, null);
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
    public void setCx(CircleView p0,Dynamic p1){
       p0.setCx(p1);
    }
    public void setCy(CircleView p0,Dynamic p1){
       p0.setCy(p1);
    }
    public void setOpacity(View p0,float p1){
       super.setOpacity(p0, p1);
    }
    public void setR(CircleView p0,Dynamic p1){
       p0.setR(p1);
    }
}
