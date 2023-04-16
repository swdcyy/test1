package com.kwai.video.aemonplayer.surface.OesSurface;
import android.view.Surface;
import android.graphics.SurfaceTexture;
import java.nio.FloatBuffer;

public abstract class OesSurface extends Surface	// class@0019e4
{

    public void OesSurface(SurfaceTexture p0){
       super(p0);
    }
    public abstract void Destroy();
    public abstract FloatBuffer GetMatrix();
    public abstract long GetSharedContextHandle();
    public abstract long GetSurfaceTextureId();
    public abstract long GetTimestamp();
    public abstract int UpdateTexImage(int p0);
}
