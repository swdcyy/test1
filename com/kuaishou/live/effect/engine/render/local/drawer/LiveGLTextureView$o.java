package com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView$o;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.egl.EGLConfig;

public interface abstract LiveGLTextureView$o	// class@001b12
{

    void a(GL10 p0);
    void onDrawFrame(GL10 p0);
    void onSurfaceChanged(GL10 p0,int p1,int p2);
    void onSurfaceCreated(GL10 p0,EGLConfig p1);
}
