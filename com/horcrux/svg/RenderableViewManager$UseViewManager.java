package com.horcrux.svg.RenderableViewManager$UseViewManager;
import com.horcrux.svg.RenderableViewManager;
import com.horcrux.svg.RenderableViewManager$SVGClass;
import com.horcrux.svg.RenderableViewManager$1;
import ze.n0;
import android.view.View;
import com.horcrux.svg.VirtualView;
import ze.x;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.horcrux.svg.UseView;
import com.facebook.react.bridge.Dynamic;
import java.lang.String;

public class RenderableViewManager$UseViewManager extends RenderableViewManager	// class@0005ee
{

    public void RenderableViewManager$UseViewManager(){
       super(RenderableViewManager$SVGClass.RNSVGUse, null);
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
    public void setHeight(UseView p0,Dynamic p1){
       p0.setHeight(p1);
    }
    public void setHref(UseView p0,String p1){
       p0.setHref(p1);
    }
    public void setOpacity(View p0,float p1){
       super.setOpacity(p0, p1);
    }
    public void setWidth(UseView p0,Dynamic p1){
       p0.setWidth(p1);
    }
    public void setX(UseView p0,Dynamic p1){
       p0.setX(p1);
    }
    public void setY(UseView p0,Dynamic p1){
       p0.setY(p1);
    }
}
