package com.th3rdwave.safeareacontext.SafeAreaViewManager;
import com.facebook.react.uimanager.ViewGroupManager;
import ar8.h;
import com.facebook.react.uimanager.LayoutShadowNode;
import ze.x;
import ze.n0;
import android.view.View;
import com.th3rdwave.safeareacontext.SafeAreaView;
import android.content.Context;
import java.lang.String;
import java.lang.Class;
import com.facebook.react.bridge.ReadableArray;
import com.th3rdwave.safeareacontext.SafeAreaViewEdges;
import java.util.EnumSet;
import java.lang.Object;
import com.th3rdwave.safeareacontext.SafeAreaViewMode;

public class SafeAreaViewManager extends ViewGroupManager	// class@000f98
{

    public void SafeAreaViewManager(){
       super();
    }
    public h createShadowNodeInstance(){
       return new h();
    }
    public LayoutShadowNode createShadowNodeInstance(){
       return this.createShadowNodeInstance();
    }
    public x createShadowNodeInstance(){
       return this.createShadowNodeInstance();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public SafeAreaView createViewInstance(n0 p0){
       return new SafeAreaView(p0);
    }
    public String getName(){
       return "RNCSafeAreaView";
    }
    public Class getShadowNodeClass(){
       return h.class;
    }
    public void setEdges(SafeAreaView p0,ReadableArray p1){
       EnumSet uEnumSet = EnumSet.noneOf(SafeAreaViewEdges.class);
       if (p1 != null) {
          int i = 0;
          while (i < p1.size()) {
             String str = p1.getString(i);
             if (("top").equals(str)) {
                uEnumSet.add(SafeAreaViewEdges.TOP);
             }else if(("right").equals(str)){
                uEnumSet.add(SafeAreaViewEdges.RIGHT);
             }else if(("bottom").equals(str)){
                uEnumSet.add(SafeAreaViewEdges.BOTTOM);
             }else if(("left").equals(str)){
                uEnumSet.add(SafeAreaViewEdges.LEFT);
             }
             i = i + 1;
          }
       }
       p0.setEdges(uEnumSet);
       return;
    }
    public void setMode(SafeAreaView p0,String p1){
       if (("padding").equals(p1)) {
          p0.setMode(SafeAreaViewMode.PADDING);
       }else if(("margin").equals(p1)){
          p0.setMode(SafeAreaViewMode.MARGIN);
       }
       return;
    }
}
