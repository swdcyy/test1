package com.horcrux.svg.RenderableViewManager$LinearGradientManager;
import com.horcrux.svg.RenderableViewManager;
import com.horcrux.svg.RenderableViewManager$SVGClass;
import com.horcrux.svg.RenderableViewManager$1;
import ze.n0;
import android.view.View;
import com.horcrux.svg.VirtualView;
import ze.x;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.horcrux.svg.LinearGradientView;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.Dynamic;

public class RenderableViewManager$LinearGradientManager extends RenderableViewManager	// class@0005d4
{

    public void RenderableViewManager$LinearGradientManager(){
       super(RenderableViewManager$SVGClass.RNSVGLinearGradient, null);
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
    public void setGradient(LinearGradientView p0,ReadableArray p1){
       p0.setGradient(p1);
    }
    public void setGradientTransform(LinearGradientView p0,ReadableArray p1){
       p0.setGradientTransform(p1);
    }
    public void setGradientUnits(LinearGradientView p0,int p1){
       p0.setGradientUnits(p1);
    }
    public void setOpacity(View p0,float p1){
       super.setOpacity(p0, p1);
    }
    public void setX1(LinearGradientView p0,Dynamic p1){
       p0.setX1(p1);
    }
    public void setX2(LinearGradientView p0,Dynamic p1){
       p0.setX2(p1);
    }
    public void setY1(LinearGradientView p0,Dynamic p1){
       p0.setY1(p1);
    }
    public void setY2(LinearGradientView p0,Dynamic p1){
       p0.setY2(p1);
    }
}
