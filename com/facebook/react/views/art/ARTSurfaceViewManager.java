package com.facebook.react.views.art.ARTSurfaceViewManager;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.views.art.ARTSurfaceViewManager$a;
import com.facebook.react.views.art.ARTSurfaceViewShadowNode;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lg.e;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import ze.x;
import ze.n0;
import android.view.View;
import com.facebook.react.views.art.ARTSurfaceView;
import android.content.Context;
import java.util.Objects;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.view.TextureView$SurfaceTextureListener;
import android.view.Surface;

public class ARTSurfaceViewManager extends BaseViewManager	// class@001396
{
    public static final e MEASURE_FUNCTION;

    static {
       ARTSurfaceViewManager.MEASURE_FUNCTION = new ARTSurfaceViewManager$a();
    }
    public void ARTSurfaceViewManager(){
       super();
    }
    public ARTSurfaceViewShadowNode createShadowNodeInstance(){
       ARTSurfaceViewShadowNode obj = PatchProxy.apply(null, this, ARTSurfaceViewManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ARTSurfaceViewShadowNode();
       obj.setMeasureFunction(ARTSurfaceViewManager.MEASURE_FUNCTION);
       return obj;
    }
    public x createShadowNodeInstance(){
       return this.createShadowNodeInstance();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public ARTSurfaceView createViewInstance(n0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ARTSurfaceViewManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ARTSurfaceView(p0);
    }
    public String getName(){
       return "ARTSurfaceView";
    }
    public Class getShadowNodeClass(){
       return ARTSurfaceViewShadowNode.class;
    }
    public void setBackgroundColor(View p0,int p1){
       this.setBackgroundColor(p0, p1);
    }
    public void setBackgroundColor(ARTSurfaceView p0,int p1){
    }
    public void updateExtraData(View p0,Object p1){
       this.updateExtraData(p0, p1);
    }
    public void updateExtraData(ARTSurfaceView p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ARTSurfaceViewManager.class, "3")) {
          return;
       }
       Objects.requireNonNull(p1);
       if (!PatchProxy.applyVoidOneRefs(p0, p1, ARTSurfaceViewShadowNode.class, "4")) {
          SurfaceTexture surfaceTextu = p0.getSurfaceTexture();
          p0.setSurfaceTextureListener(p1);
          if (surfaceTextu != null && p1.b == null) {
             p1.b = new Surface(surfaceTextu);
             p1.b(true);
          }
       }
       return;
    }
}
