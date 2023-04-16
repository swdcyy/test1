package com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$g;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;

public interface abstract LiveGLTextureView$g	// class@001b0a
{

    EGLContext createContext(EGL10 p0,EGLDisplay p1,EGLConfig p2);
    void destroyContext(EGL10 p0,EGLDisplay p1,EGLContext p2);
}
