package com.horcrux.svg.RenderableViewManager$GroupViewManager;
import com.horcrux.svg.RenderableViewManager;
import com.horcrux.svg.RenderableViewManager$SVGClass;
import com.horcrux.svg.RenderableViewManager$1;
import ze.n0;
import android.view.View;
import com.horcrux.svg.VirtualView;
import ze.x;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.horcrux.svg.GroupView;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JavaOnlyMap;
import com.horcrux.svg.RenderableViewManager$3;
import com.facebook.react.bridge.ReadableType;
import java.lang.Enum;
import java.lang.String;

public class RenderableViewManager$GroupViewManager extends RenderableViewManager	// class@0005ce
{

    public void RenderableViewManager$GroupViewManager(){
       super(RenderableViewManager$SVGClass.RNSVGGroup, null);
    }
    public void RenderableViewManager$GroupViewManager(RenderableViewManager$SVGClass p0){
       super(p0, null);
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
    public void setFont(GroupView p0,ReadableMap p1){
       p0.setFont(p1);
    }
    public void setFontSize(GroupView p0,Dynamic p1){
       JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
       int i = RenderableViewManager$3.$SwitchMap$com$facebook$react$bridge$ReadableType[p1.getType().ordinal()];
       if (i != 1) {
          if (i != 2) {
             return;
          }else {
             javaOnlyMap.putString("fontSize", p1.asString());
          }
       }else {
          javaOnlyMap.putDouble("fontSize", p1.asDouble());
       }
       p0.setFont(javaOnlyMap);
       return;
    }
    public void setFontWeight(GroupView p0,Dynamic p1){
       JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
       int i = RenderableViewManager$3.$SwitchMap$com$facebook$react$bridge$ReadableType[p1.getType().ordinal()];
       if (i != 1) {
          if (i != 2) {
             return;
          }else {
             javaOnlyMap.putString("fontWeight", p1.asString());
          }
       }else {
          javaOnlyMap.putDouble("fontWeight", p1.asDouble());
       }
       p0.setFont(javaOnlyMap);
       return;
    }
    public void setOpacity(View p0,float p1){
       super.setOpacity(p0, p1);
    }
}
