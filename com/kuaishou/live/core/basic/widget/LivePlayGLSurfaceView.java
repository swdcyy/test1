package com.kuaishou.live.core.basic.widget.LivePlayGLSurfaceView;
import com.yxcorp.gifshow.media.player.SafeGLSurfaceView;
import android.content.Context;
import android.util.AttributeSet;
import android.opengl.GLSurfaceView;
import d22.k;
import android.opengl.GLSurfaceView$Renderer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LivePlayGLSurfaceView extends SafeGLSurfaceView	// class@00090c
{
    public final k c;

    public void LivePlayGLSurfaceView(Context p0){
       super(p0, null);
    }
    public void LivePlayGLSurfaceView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.setEGLContextClientVersion(2);
       k ok = new k();
       this.c = ok;
       this.setRenderer(ok);
       this.setRenderMode(0);
       ok.i = this;
    }
    public k getRenderer(){
       return this.c;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LivePlayGLSurfaceView.class, "1")) {
          return;
       }
       super.onDetachedFromWindow();
       this.c.d();
       return;
    }
}
