package com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$h;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLConfig;
import java.lang.Object;
import javax.microedition.khronos.egl.EGLSurface;

public interface abstract LiveGLTextureView$h	// class@001b0b
{

    EGLSurface createWindowSurface(EGL10 p0,EGLDisplay p1,EGLConfig p2,Object p3);
    void destroySurface(EGL10 p0,EGLDisplay p1,EGLSurface p2);
}
