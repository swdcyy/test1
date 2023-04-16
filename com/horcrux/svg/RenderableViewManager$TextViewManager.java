package com.horcrux.svg.RenderableViewManager$TextViewManager;
import com.horcrux.svg.RenderableViewManager$GroupViewManager;
import com.horcrux.svg.RenderableViewManager$SVGClass;
import com.horcrux.svg.TextView;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.horcrux.svg.GroupView;
import java.lang.String;

public class RenderableViewManager$TextViewManager extends RenderableViewManager$GroupViewManager	// class@0005ec
{

    public void RenderableViewManager$TextViewManager(){
       super(RenderableViewManager$SVGClass.RNSVGText);
    }
    public void RenderableViewManager$TextViewManager(RenderableViewManager$SVGClass p0){
       super(p0);
    }
    public void setBaselineShift(TextView p0,Dynamic p1){
       p0.setBaselineShift(p1);
    }
    public void setDeltaX(TextView p0,Dynamic p1){
       p0.setDeltaX(p1);
    }
    public void setDeltaY(TextView p0,Dynamic p1){
       p0.setDeltaY(p1);
    }
    public void setFont(TextView p0,ReadableMap p1){
       p0.setFont(p1);
    }
    public void setInlineSize(TextView p0,Dynamic p1){
       p0.setInlineSize(p1);
    }
    public void setLengthAdjust(TextView p0,String p1){
       p0.setLengthAdjust(p1);
    }
    public void setMethod(TextView p0,String p1){
       p0.setMethod(p1);
    }
    public void setRotate(TextView p0,Dynamic p1){
       p0.setRotate(p1);
    }
    public void setTextLength(TextView p0,Dynamic p1){
       p0.setTextLength(p1);
    }
    public void setVerticalAlign(TextView p0,String p1){
       p0.setVerticalAlign(p1);
    }
    public void setX(TextView p0,Dynamic p1){
       p0.setPositionX(p1);
    }
    public void setY(TextView p0,Dynamic p1){
       p0.setPositionY(p1);
    }
}
