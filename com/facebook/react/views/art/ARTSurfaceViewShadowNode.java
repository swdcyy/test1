package com.facebook.react.views.art.ARTSurfaceViewShadowNode;
import android.view.TextureView$SurfaceTextureListener;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.uimanager.LayoutShadowNode;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.view.Surface;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.PorterDuff$Mode;
import java.lang.Integer;
import android.graphics.Paint;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import kf.a;
import java.lang.StringBuilder;
import cb.a;
import ze.x;
import android.os.Build$VERSION;
import ze.n0;
import com.facebook.react.uimanager.j;
import android.graphics.SurfaceTexture;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.uimanager.ViewManager;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;

public class ARTSurfaceViewShadowNode extends LayoutShadowNode implements TextureView$SurfaceTextureListener, LifecycleEventListener	// class@001398
{
    public Surface b;
    public Integer c;

    public void ARTSurfaceViewShadowNode(){
       super();
    }
    public final void b(boolean p0){
       if (PatchProxy.isSupport(ARTSurfaceViewShadowNode.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ARTSurfaceViewShadowNode.class, "3")) {
          return;
       }
       ARTSurfaceViewShadowNode tb = this.b;
       if (tb == null || !tb.isValid()) {
          this.c(this);
          return;
       }else {
          try{
             Canvas uCanvas = this.b.lockCanvas(null);
             int i = 0;
             uCanvas.drawColor(i, PorterDuff$Mode.CLEAR);
             ARTSurfaceViewShadowNode tc = this.c;
             if (tc != null) {
                uCanvas.drawColor(tc.intValue());
             }
             Paint paint = new Paint();
             while (i < this.getChildCount()) {
                a childAt = this.getChildAt(i);
                childAt.b(uCanvas, paint, 0x3f800000);
                if (p0) {
                   childAt.markUpdated();
                }else {
                   childAt.markUpdateSeen();
                }
                i = i + 1;
             }
             ARTSurfaceViewShadowNode tb1 = this.b;
             if (tb1 == null) {
                return;
             }else {
                tb1.unlockCanvasAndPost(uCanvas);
             label_0086 :
                return;
             }
          }catch(java.lang.IllegalArgumentException e6){
          }catch(java.lang.IllegalStateException e6){
          }
          a.g("ReactNative", e6.getClass().getSimpleName()+" in Surface.unlockCanvasAndPost");
          goto label_0086 ;
       }
    }
    public final void c(x p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ARTSurfaceViewShadowNode.class, "5")) {
          return;
       }
       for (int i = 0; i < p0.getChildCount(); i = i + 1) {
          x childAt = p0.getChildAt(i);
          childAt.markUpdateSeen();
          this.c(childAt);
       }
       return;
    }
    public void dispose(){
       if (PatchProxy.applyVoid(null, this, ARTSurfaceViewShadowNode.class, "7")) {
          return;
       }
       super.dispose();
       if (Build$VERSION.SDK_INT > 24) {
          this.getThemedContext().removeLifecycleEventListener(this);
       }
       return;
    }
    public boolean isVirtual(){
       return false;
    }
    public boolean isVirtualAnchor(){
       return true;
    }
    public void onCollectExtraUpdates(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ARTSurfaceViewShadowNode.class, "2")) {
          return;
       }
       super.onCollectExtraUpdates(p0);
       this.b(false);
       p0.h(this.getReactTag(), this);
       return;
    }
    public void onHostDestroy(){
    }
    public void onHostPause(){
    }
    public void onHostResume(){
       if (PatchProxy.applyVoid(null, this, ARTSurfaceViewShadowNode.class, "8")) {
          return;
       }
       this.b(false);
       return;
    }
    public void onSurfaceTextureAvailable(SurfaceTexture p0,int p1,int p2){
       if (PatchProxy.isSupport(ARTSurfaceViewShadowNode.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ARTSurfaceViewShadowNode.class, "9")) {
          return;
       }
       this.b = new Surface(p0);
       this.b(false);
       return;
    }
    public boolean onSurfaceTextureDestroyed(SurfaceTexture p0){
       p0 = PatchProxy.applyOneRefs(p0, this, ARTSurfaceViewShadowNode.class, "10");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       this.b.release();
       this.b = null;
       return true;
    }
    public void onSurfaceTextureSizeChanged(SurfaceTexture p0,int p1,int p2){
    }
    public void onSurfaceTextureUpdated(SurfaceTexture p0){
    }
    public void setBackgroundColor(Integer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ARTSurfaceViewShadowNode.class, "1")) {
          return;
       }
       this.c = p0;
       this.markUpdated();
       return;
    }
    public void setThemedContext(n0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ARTSurfaceViewShadowNode.class, "6")) {
          return;
       }
       super.setThemedContext(p0);
       if (Build$VERSION.SDK_INT > 24) {
          p0.addLifecycleEventListener(this);
       }
       return;
    }
    public void synchronouslyUpdateLayoutInfoForKdsList(ViewManager p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ARTSurfaceViewShadowNode.class, "11")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       p0.updateExtraData(p1, this);
       return;
    }
}
