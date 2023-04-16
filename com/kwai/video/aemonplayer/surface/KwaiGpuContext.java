package com.kwai.video.aemonplayer.surface.KwaiGpuContext;
import java.lang.Object;
import javax.microedition.khronos.egl.EGLContext;

public abstract class KwaiGpuContext	// class@0019dd
{

    public void KwaiGpuContext(){
       super();
    }
    public abstract Object getContext();
    public abstract long getContextHandler();
    public abstract EGLContext getEGLContext10();
    public abstract void release();
}
