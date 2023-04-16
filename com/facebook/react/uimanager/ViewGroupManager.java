package com.facebook.react.uimanager.ViewGroupManager;
import ze.g;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.WeakHashMap;
import android.view.View;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup;
import java.util.List;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.LayoutShadowNode;
import ze.x;
import java.lang.Number;

public abstract class ViewGroupManager extends BaseViewManager implements g	// class@001334
{
    public static WeakHashMap mZIndexHash;

    static {
       ViewGroupManager.mZIndexHash = new WeakHashMap();
    }
    public void ViewGroupManager(){
       super();
    }
    public static Integer getViewZIndex(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ViewGroupManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ViewGroupManager.mZIndexHash.get(p0);
    }
    public static void setViewZIndex(View p0,int p1){
       ViewGroupManager viewGroupMan = ViewGroupManager.class;
       if (PatchProxy.isSupport(viewGroupMan) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, viewGroupMan, "4")) {
          return;
       }
       ViewGroupManager.mZIndexHash.put(p0, Integer.valueOf(p1));
       return;
    }
    public void addView(ViewGroup p0,View p1,int p2){
       if (PatchProxy.isSupport(ViewGroupManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, ViewGroupManager.class, "2")) {
          return;
       }
       p0.addView(p1, p2);
       return;
    }
    public void addViews(ViewGroup p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ViewGroupManager.class, "3")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       int i1 = p1.size();
       for (int i = 0; i < i1; i = i + 1) {
          this.addView(p0, p1.get(i), i);
       }
       return;
    }
    public LayoutShadowNode createShadowNodeInstance(){
       Object obj = PatchProxy.apply(null, this, ViewGroupManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LayoutShadowNode();
    }
    public x createShadowNodeInstance(){
       return this.createShadowNodeInstance();
    }
    public View getChildAt(ViewGroup p0,int p1){
       ViewGroupManager viewGroupMan = ViewGroupManager.class;
       if (PatchProxy.isSupport(viewGroupMan)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, viewGroupMan, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return p0.getChildAt(p1);
    }
    public int getChildCount(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ViewGroupManager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return p0.getChildCount();
    }
    public Class getShadowNodeClass(){
       return LayoutShadowNode.class;
    }
    public boolean needsCustomLayoutForChildren(){
       return false;
    }
    public void removeAllViews(ViewGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewGroupManager.class, "10")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       for (int i = this.getChildCount(p0) - 1; i >= 0; i = i - 1) {
          this.removeViewAt(p0, i);
       }
       return;
    }
    public void removeView(ViewGroup p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ViewGroupManager.class, "9")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       int i = 0;
       while (i < this.getChildCount(p0)) {
          if (this.getChildAt(p0, i) == p1) {
             this.removeViewAt(p0, i);
             break ;
          }else {
             i = i + 1;
          }
       }
       return;
    }
    public void removeViewAt(ViewGroup p0,int p1){
       ViewGroupManager viewGroupMan = ViewGroupManager.class;
       if (PatchProxy.isSupport(viewGroupMan) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, viewGroupMan, "8")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       p0.removeViewAt(p1);
       return;
    }
    public boolean shouldPromoteGrandchildren(){
       return false;
    }
    public void updateExtraData(View p0,Object p1){
       this.updateExtraData(p0, p1);
    }
    public void updateExtraData(ViewGroup p0,Object p1){
    }
}
