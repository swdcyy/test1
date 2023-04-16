package com.kwai.video.player.ISurfaceTextureHolder;
import android.graphics.SurfaceTexture;
import com.kwai.video.player.ISurfaceTextureHost;

public interface abstract ISurfaceTextureHolder	// class@000acd
{

    SurfaceTexture getSurfaceTexture();
    void setSurfaceTexture(SurfaceTexture p0);
    void setSurfaceTextureHost(ISurfaceTextureHost p0);
}
