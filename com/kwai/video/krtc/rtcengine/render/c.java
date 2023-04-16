package com.kwai.video.krtc.rtcengine.render.c;
import android.view.SurfaceHolder;
import android.opengl.GLSurfaceView;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import com.kwai.video.krtc.utils.Log;
import android.view.SurfaceHolder$Callback;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.Surface;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Rect;
import java.lang.Boolean;
import android.graphics.Canvas;
import java.lang.Integer;

public class c implements SurfaceHolder	// class@0008b7
{
    public final SurfaceHolder a;
    public final GLSurfaceView b;

    public void c(SurfaceHolder p0,GLSurfaceView p1){
       super();
       Log.i("SurfaceHolderProxy", this+" SurfaceHolderProxy\(\)");
       this.a = p0;
       this.b = p1;
    }
    public void addCallback(SurfaceHolder$Callback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       Log.i("SurfaceHolderProxy", this+" addCallback\(\)");
       this.a.addCallback(p0);
       this.a.removeCallback(this.b);
       this.a.addCallback(this.b);
       return;
    }
    public Surface getSurface(){
       Object obj = PatchProxy.apply(null, this, c.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getSurface();
    }
    public Rect getSurfaceFrame(){
       Object obj = PatchProxy.apply(null, this, c.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getSurfaceFrame();
    }
    public boolean isCreating(){
       Object obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Log.i("SurfaceHolderProxy", this+" isCreating\(\)");
       return this.a.isCreating();
    }
    public Canvas lockCanvas(){
       Object obj = PatchProxy.apply(null, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.lockCanvas();
    }
    public Canvas lockCanvas(Rect p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.lockCanvas(p0);
    }
    public void removeCallback(SurfaceHolder$Callback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       Log.i("SurfaceHolderProxy", this+" removeCallback\(\)");
       this.a.removeCallback(p0);
       return;
    }
    public void setFixedSize(int p0,int p1){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, c.class, "5")) {
          return;
       }
       Log.i("SurfaceHolderProxy", this+" setKeepScreenOn\("+p0+"£¬"+p1+"\)");
       this.a.setFixedSize(p0, p1);
       return;
    }
    public void setFormat(int p0){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, c.class, "7")) {
          return;
       }
       this.a.setFormat(p0);
       return;
    }
    public void setKeepScreenOn(boolean p0){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, c.class, "8")) {
          return;
       }
       Log.i("SurfaceHolderProxy", this+" setKeepScreenOn\("+p0+"\)");
       this.a.setKeepScreenOn(p0);
       return;
    }
    public void setSizeFromLayout(){
       if (PatchProxy.applyVoid(null, this, c.class, "6")) {
          return;
       }
       Log.i("SurfaceHolderProxy", this+" setSizeFromLayout\(\)");
       this.a.setSizeFromLayout();
       return;
    }
    public void setType(int p0){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, c.class, "4")) {
          return;
       }
       Log.i("SurfaceHolderProxy", this+" setType\("+p0+"\)");
       this.a.setType(p0);
       return;
    }
    public void unlockCanvasAndPost(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "11")) {
          return;
       }
       this.a.unlockCanvasAndPost(p0);
       return;
    }
}
