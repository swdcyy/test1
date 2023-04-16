package com.kwai.video.player.surface.DummySurfaceTexture;
import java.lang.Object;
import java.nio.FloatBuffer;
import android.view.Surface;
import android.graphics.SurfaceTexture$OnFrameAvailableListener;

public abstract class DummySurfaceTexture	// class@000b99
{

    public void DummySurfaceTexture(){
       super();
    }
    public abstract FloatBuffer getMatrix();
    public abstract Surface getSurface();
    public abstract long getSurfaceTextureId();
    public abstract void rebindSurface();
    public abstract void release();
    public abstract void setDefaultBufferSize(int p0,int p1);
    public abstract void setOnFrameAvailableListener(SurfaceTexture$OnFrameAvailableListener p0);
    public abstract int updateTexImage(int p0);
}
