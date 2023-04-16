package com.taobao.gcanvas.bridges.rn.GReactTextureView;
import com.facebook.react.bridge.LifecycleEventListener;
import android.view.TextureView$SurfaceTextureListener;
import com.taobao.gcanvas.surface.GTextureView;
import android.content.Context;
import java.lang.String;
import com.facebook.react.bridge.ReactContext;
import com.taobao.gcanvas.surface.GTextureViewCallback;
import java.util.ArrayList;
import java.lang.Object;
import com.facebook.react.uimanager.UIManagerModule;
import java.lang.Class;
import com.facebook.react.bridge.NativeModule;
import df.c;
import vq8.b;
import android.view.TextureView;
import df.b;
import android.view.Surface;
import android.graphics.SurfaceTexture;

public class GReactTextureView extends GTextureView implements LifecycleEventListener, TextureView$SurfaceTextureListener	// class@000dfa
{
    public boolean c;
    public SurfaceTexture d;
    public boolean e;
    public ReactContext f;

    public void GReactTextureView(Context p0,String p1){
       super(p0, p1);
       boolean b = false;
       this.c = b;
       this.d = null;
       this.e = b;
       this.f = p0;
       GTextureView tb = this.b;
       if (tb != null) {
          if (tb.h == null) {
             tb.h = new ArrayList(1);
          }
          if (!tb.h.contains(this)) {
             tb.h.add(this);
          }
       }
       return;
    }
    public boolean a(){
       return this.c;
    }
    public final void b(){
       this.f.getNativeModule(UIManagerModule.class).getEventDispatcher().c(new b(this.getId(), this.c));
    }
    public void onHostDestroy(){
       TextureView$SurfaceTextureListener surfaceTextu = null;
       this.setSurfaceTextureListener(surfaceTextu);
       GTextureView tb = this.b;
       if (tb != null) {
          tb.onSurfaceDestroyed(tb.b, tb.d);
          GTextureViewCallback d = tb.d;
          if (d != null && d.isValid()) {
             tb.d.release();
             tb.d = surfaceTextu;
          }
          tb.onRenderExit(tb.b);
          GTextureViewCallback h = tb.h;
          if (h != null) {
             h.clear();
          }
       }
       return;
    }
    public void onHostPause(){
    }
    public void onHostResume(){
    }
    public void onSurfaceTextureAvailable(SurfaceTexture p0,int p1,int p2){
       if (this.c == null) {
          boolean b = true;
          if (!p1 || !p2) {
             this.e = b;
          }
          this.c = b;
          if (this.e == null) {
             GReactTextureView td = this.d;
             if (td != null) {
                this.setSurfaceTexture(td);
             }
             this.b();
          }
       }
       return;
    }
    public boolean onSurfaceTextureDestroyed(SurfaceTexture p0){
       this.c = false;
       this.b();
       this.d = p0;
       return false;
    }
    public void onSurfaceTextureSizeChanged(SurfaceTexture p0,int p1,int p2){
       if (this.e != null && (p1 || p2)) {
          GReactTextureView td = this.d;
          if (td != null) {
             this.setSurfaceTexture(td);
          }
          this.b();
          this.e = false;
       }
       return;
    }
    public void onSurfaceTextureUpdated(SurfaceTexture p0){
    }
}
