package com.taobao.gcanvas.surface.GTextureViewCallback;
import android.view.TextureView$SurfaceTextureListener;
import java.lang.String;
import com.taobao.gcanvas.GCanvasJNI;
import android.view.TextureView;
import java.lang.Object;
import java.lang.Integer;
import java.util.Map;
import android.view.Surface;
import android.graphics.SurfaceTexture;
import java.lang.Double;
import java.lang.Boolean;
import com.taobao.gcanvas.surface.GTextureView;
import java.util.Objects;
import java.util.Iterator;
import java.util.ArrayList;

public class GTextureViewCallback implements TextureView$SurfaceTextureListener	// class@000e00
{
    public final String b;
    public String c;
    public Surface d;
    public int e;
    public int f;
    public TextureView g;
    public ArrayList h;

    static {
       GCanvasJNI.a("load\(\)");
    }
    public void GTextureViewCallback(TextureView p0,String p1){
       super();
       this.c = "#00000000";
       this.b = p1;
       this.g = p0;
       GCanvasJNI.setContextType(p1, 0);
       GCanvasJNI.d.put(p1, Integer.valueOf(0));
    }
    public void a(){
       this.onSurfaceChanged(this.b, this.d, 0, this.e, this.f, this.c);
    }
    public native final void onRenderExit(String p0);
    public native final void onSurfaceChanged(String p0,Surface p1,int p2,int p3,int p4,String p5);
    public native final void onSurfaceCreated(String p0,Surface p1);
    public native final void onSurfaceDestroyed(String p0,Surface p1);
    public void onSurfaceTextureAvailable(SurfaceTexture p0,int p1,int p2){
       if (this.d == null) {
          this.d = new Surface(p0);
       }
       if (p1 && p2) {
          this.e = p1;
          this.f = p2;
          this.a();
       }
       GTextureViewCallback tb = this.b;
       Integer integer = GCanvasJNI.d.get(tb);
       if (integer != null) {
          GCanvasJNI.setContextType(tb, integer.intValue());
       }
       Double uDouble = GCanvasJNI.e.get(tb);
       if (uDouble != null) {
          GCanvasJNI.setDevicePixelRatio(tb, uDouble.doubleValue());
       }
       Boolean uBoolean = GCanvasJNI.f.get(tb);
       if (uBoolean != null) {
          GCanvasJNI.setHiQuality(tb, uBoolean.booleanValue());
       }
       if (GCanvasJNI.sendEvent(this.b)) {
          tb = this.g;
          if (tb instanceof GTextureView) {
             Objects.requireNonNull(tb);
          }
       }
       tb = this.h;
       if (tb != null) {
          Iterator iterator = tb.iterator();
          while (iterator.hasNext()) {
             iterator.next().onSurfaceTextureAvailable(p0, p1, p2);
          }
       }
       return;
    }
    public boolean onSurfaceTextureDestroyed(SurfaceTexture p0){
       GTextureViewCallback th = this.h;
       if (th != null) {
          Iterator iterator = th.iterator();
          while (iterator.hasNext()) {
             iterator.next().onSurfaceTextureDestroyed(p0);
          }
       }
       return false;
    }
    public void onSurfaceTextureSizeChanged(SurfaceTexture p0,int p1,int p2){
       if (this.d == null) {
          this.d = new Surface(p0);
       }
       if (p1 && p2) {
          this.e = p1;
          this.f = p2;
       }
       GTextureViewCallback th = this.h;
       if (th != null) {
          Iterator iterator = th.iterator();
          while (iterator.hasNext()) {
             iterator.next().onSurfaceTextureSizeChanged(p0, p1, p2);
          }
       }
       return;
    }
    public void onSurfaceTextureUpdated(SurfaceTexture p0){
    }
}
