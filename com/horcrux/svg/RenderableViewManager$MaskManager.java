package com.horcrux.svg.RenderableViewManager$MaskManager;
import com.horcrux.svg.RenderableViewManager$GroupViewManager;
import com.horcrux.svg.RenderableViewManager$SVGClass;
import com.horcrux.svg.MaskView;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;

public class RenderableViewManager$MaskManager extends RenderableViewManager$GroupViewManager	// class@0005d8
{

    public void RenderableViewManager$MaskManager(){
       super(RenderableViewManager$SVGClass.RNSVGMask);
    }
    public void setHeight(MaskView p0,Dynamic p1){
       p0.setHeight(p1);
    }
    public void setMaskContentUnits(MaskView p0,int p1){
       p0.setMaskContentUnits(p1);
    }
    public void setMaskTransform(MaskView p0,ReadableArray p1){
       p0.setMaskTransform(p1);
    }
    public void setMaskUnits(MaskView p0,int p1){
       p0.setMaskUnits(p1);
    }
    public void setWidth(MaskView p0,Dynamic p1){
       p0.setWidth(p1);
    }
    public void setX(MaskView p0,Dynamic p1){
       p0.setX(p1);
    }
    public void setY(MaskView p0,Dynamic p1){
       p0.setY(p1);
    }
}
