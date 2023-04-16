package com.kwai.video.krtc.GL.EglBase10$Context;
import com.kwai.video.krtc.GL.EglBase$Context;
import javax.microedition.khronos.egl.EGLContext;
import java.lang.Object;

public class EglBase10$Context extends EglBase$Context	// class@000741
{
    public final EGLContext eglContext;

    public void EglBase10$Context(EGLContext p0){
       super();
       this.eglContext = p0;
    }
    public Object nativeEglContext(){
       return this.eglContext;
    }
}
