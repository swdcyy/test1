package com.yxcorp.gifshow.media.player.SafeGLSurfaceView;
import android.opengl.GLSurfaceView;
import android.content.Context;
import android.util.AttributeSet;
import w6b.a;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class SafeGLSurfaceView extends GLSurfaceView	// class@001d1a
{
    public SurfaceHolder b;

    public void SafeGLSurfaceView(Context p0){
       super(p0, null);
    }
    public void SafeGLSurfaceView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new a(super.getHolder(), this);
    }
    public SurfaceHolder getHolder(){
       SafeGLSurfaceView obj = PatchProxy.apply(null, this, SafeGLSurfaceView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null) {
          SurfaceHolder holder = super.getHolder();
       }
       return obj;
    }
}