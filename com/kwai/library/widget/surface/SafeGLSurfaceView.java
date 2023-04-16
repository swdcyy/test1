package com.kwai.library.widget.surface.SafeGLSurfaceView;
import android.opengl.GLSurfaceView;
import android.content.Context;
import g27.a;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.util.AttributeSet;

public class SafeGLSurfaceView extends GLSurfaceView	// class@000a2c
{
    public SurfaceHolder b;

    public void SafeGLSurfaceView(Context p0){
       super(p0);
       this.b = new a(super.getHolder(), this);
    }
    public void SafeGLSurfaceView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new a(super.getHolder(), this);
    }
    public SurfaceHolder getHolder(){
       SafeGLSurfaceView tb = this.b;
       if (tb != null) {
       }else {
          tb = super.getHolder();
       }
       return tb;
    }
}
