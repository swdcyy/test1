package com.horcrux.svg.RenderableViewManager$RadialGradientManager;
import com.horcrux.svg.RenderableViewManager;
import com.horcrux.svg.RenderableViewManager$SVGClass;
import com.horcrux.svg.RenderableViewManager$1;
import ze.n0;
import android.view.View;
import com.horcrux.svg.VirtualView;
import ze.x;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.horcrux.svg.RadialGradientView;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;

public class RenderableViewManager$RadialGradientManager extends RenderableViewManager	// class@0005df
{

    public void RenderableViewManager$RadialGradientManager(){
       super(RenderableViewManager$SVGClass.RNSVGRadialGradient, null);
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
    public void setCx(RadialGradientView p0,Dynamic p1){
       p0.setCx(p1);
    }
    public void setCy(RadialGradientView p0,Dynamic p1){
       p0.setCy(p1);
    }
    public void setFx(RadialGradientView p0,Dynamic p1){
       p0.setFx(p1);
    }
    public void setFy(RadialGradientView p0,Dynamic p1){
       p0.setFy(p1);
    }
    public void setGradient(RadialGradientView p0,ReadableArray p1){
       p0.setGradient(p1);
    }
    public void setGradientTransform(RadialGradientView p0,ReadableArray p1){
       p0.setGradientTransform(p1);
    }
    public void setGradientUnits(RadialGradientView p0,int p1){
       p0.setGradientUnits(p1);
    }
    public void setOpacity(View p0,float p1){
       super.setOpacity(p0, p1);
    }
    public void setRx(RadialGradientView p0,Dynamic p1){
       p0.setRx(p1);
    }
    public void setRy(RadialGradientView p0,Dynamic p1){
       p0.setRy(p1);
    }
}
