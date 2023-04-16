package com.horcrux.svg.RenderableViewManager$ForeignObjectManager;
import com.horcrux.svg.RenderableViewManager$GroupViewManager;
import com.horcrux.svg.RenderableViewManager$SVGClass;
import com.horcrux.svg.ForeignObjectView;
import com.facebook.react.bridge.Dynamic;

public class RenderableViewManager$ForeignObjectManager extends RenderableViewManager$GroupViewManager	// class@0005cc
{

    public void RenderableViewManager$ForeignObjectManager(){
       super(RenderableViewManager$SVGClass.RNSVGForeignObject);
    }
    public void setHeight(ForeignObjectView p0,Dynamic p1){
       p0.setHeight(p1);
    }
    public void setWidth(ForeignObjectView p0,Dynamic p1){
       p0.setWidth(p1);
    }
    public void setX(ForeignObjectView p0,Dynamic p1){
       p0.setX(p1);
    }
    public void setY(ForeignObjectView p0,Dynamic p1){
       p0.setY(p1);
    }
}
