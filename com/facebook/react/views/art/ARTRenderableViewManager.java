package com.facebook.react.views.art.ARTRenderableViewManager;
import com.facebook.react.uimanager.ViewManager;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.views.art.ARTGroupViewManager;
import com.facebook.react.views.art.ARTShapeViewManager;
import com.facebook.react.views.art.ARTTextViewManager;
import ze.x;
import com.facebook.react.views.art.ARTGroupShadowNode;
import com.facebook.react.views.art.ARTShapeShadowNode;
import com.facebook.react.views.art.ARTTextShadowNode;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import ze.n0;
import android.view.View;

public class ARTRenderableViewManager extends ViewManager	// class@00138e
{
    public final String mClassName;

    public void ARTRenderableViewManager(String p0){
       super();
       this.mClassName = p0;
    }
    public static ARTRenderableViewManager createARTGroupViewManager(){
       Object obj = PatchProxy.apply(null, null, ARTRenderableViewManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ARTGroupViewManager();
    }
    public static ARTRenderableViewManager createARTShapeViewManager(){
       Object obj = PatchProxy.apply(null, null, ARTRenderableViewManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ARTShapeViewManager();
    }
    public static ARTRenderableViewManager createARTTextViewManager(){
       Object obj = PatchProxy.apply(null, null, ARTRenderableViewManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ARTTextViewManager();
    }
    public x createShadowNodeInstance(){
       Object obj = PatchProxy.apply(null, this, ARTRenderableViewManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (("ARTGroup").equals(this.mClassName)) {
          return new ARTGroupShadowNode();
       }
       if (("ARTShape").equals(this.mClassName)) {
          return new ARTShapeShadowNode();
       }
       if (("ARTText").equals(this.mClassName)) {
          return new ARTTextShadowNode();
       }
       throw new IllegalStateException("Unexpected type "+this.mClassName);
    }
    public View createViewInstance(n0 p0){
       p0 = PatchProxy.applyOneRefs(p0, this, ARTRenderableViewManager.class, "6");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       throw new IllegalStateException("ARTShape does not map into a native view");
    }
    public String getName(){
       return this.mClassName;
    }
    public Class getShadowNodeClass(){
       Object obj = PatchProxy.apply(null, this, ARTRenderableViewManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (("ARTGroup").equals(this.mClassName)) {
          return ARTGroupShadowNode.class;
       }
       if (("ARTShape").equals(this.mClassName)) {
          return ARTShapeShadowNode.class;
       }
       if (("ARTText").equals(this.mClassName)) {
          return ARTTextShadowNode.class;
       }
       throw new IllegalStateException("Unexpected type "+this.mClassName);
    }
    public void updateExtraData(View p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ARTRenderableViewManager.class, "7")) {
          return;
       }
       throw new IllegalStateException("ARTShape does not map into a native view");
    }
}
