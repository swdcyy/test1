package com.horcrux.svg.RenderableViewManager$ImageViewManager;
import com.horcrux.svg.RenderableViewManager;
import com.horcrux.svg.RenderableViewManager$SVGClass;
import com.horcrux.svg.RenderableViewManager$1;
import ze.n0;
import android.view.View;
import com.horcrux.svg.VirtualView;
import ze.x;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.horcrux.svg.ImageView;
import java.lang.String;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;

public class RenderableViewManager$ImageViewManager extends RenderableViewManager	// class@0005d0
{

    public void RenderableViewManager$ImageViewManager(){
       super(RenderableViewManager$SVGClass.RNSVGImage, null);
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
    public void setAlign(ImageView p0,String p1){
       p0.setAlign(p1);
    }
    public void setHeight(ImageView p0,Dynamic p1){
       p0.setHeight(p1);
    }
    public void setMeetOrSlice(ImageView p0,int p1){
       p0.setMeetOrSlice(p1);
    }
    public void setOpacity(View p0,float p1){
       super.setOpacity(p0, p1);
    }
    public void setSrc(ImageView p0,ReadableMap p1){
       p0.setSrc(p1);
    }
    public void setWidth(ImageView p0,Dynamic p1){
       p0.setWidth(p1);
    }
    public void setX(ImageView p0,Dynamic p1){
       p0.setX(p1);
    }
    public void setY(ImageView p0,Dynamic p1){
       p0.setY(p1);
    }
}
