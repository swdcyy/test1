package com.horcrux.svg.RenderableViewManager$TextPathViewManager;
import com.horcrux.svg.RenderableViewManager$TextViewManager;
import com.horcrux.svg.RenderableViewManager$SVGClass;
import com.horcrux.svg.TextPathView;
import java.lang.String;
import com.facebook.react.bridge.Dynamic;

public class RenderableViewManager$TextPathViewManager extends RenderableViewManager$TextViewManager	// class@0005ea
{

    public void RenderableViewManager$TextPathViewManager(){
       super(RenderableViewManager$SVGClass.RNSVGTextPath);
    }
    public void setHref(TextPathView p0,String p1){
       p0.setHref(p1);
    }
    public void setMethod(TextPathView p0,String p1){
       p0.setMethod(p1);
    }
    public void setSharp(TextPathView p0,String p1){
       p0.setSharp(p1);
    }
    public void setSide(TextPathView p0,String p1){
       p0.setSide(p1);
    }
    public void setSpacing(TextPathView p0,String p1){
       p0.setSpacing(p1);
    }
    public void setStartOffset(TextPathView p0,Dynamic p1){
       p0.setStartOffset(p1);
    }
}
