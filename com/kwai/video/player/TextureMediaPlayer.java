package com.kwai.video.player.TextureMediaPlayer;
import com.kwai.video.player.ISurfaceTextureHolder;
import com.kwai.video.player.MediaPlayerProxy;
import com.kwai.video.player.IMediaPlayer;
import android.graphics.SurfaceTexture;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.player.ISurfaceTextureHost;
import android.view.SurfaceHolder;
import android.view.Surface;

public class TextureMediaPlayer extends MediaPlayerProxy implements ISurfaceTextureHolder	// class@000b21
{
    public SurfaceTexture mSurfaceTexture;
    public ISurfaceTextureHost mSurfaceTextureHost;

    public void TextureMediaPlayer(IMediaPlayer p0){
       super(p0);
    }
    public SurfaceTexture getSurfaceTexture(){
       return this.mSurfaceTexture;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, TextureMediaPlayer.class, "3")) {
          return;
       }
       super.release();
       this.releaseSurfaceTexture();
       return;
    }
    public void releaseSurfaceTexture(){
       if (PatchProxy.applyVoid(null, this, TextureMediaPlayer.class, "1")) {
          return;
       }
       TextureMediaPlayer tmSurfaceTex = this.mSurfaceTexture;
       if (tmSurfaceTex != null) {
          TextureMediaPlayer tmSurfaceTex1 = this.mSurfaceTextureHost;
          if (tmSurfaceTex1 != null) {
             tmSurfaceTex1.releaseSurfaceTexture(tmSurfaceTex);
          }else {
             tmSurfaceTex.release();
          }
          this.mSurfaceTexture = null;
       }
       return;
    }
    public void reset(){
       if (PatchProxy.applyVoid(null, this, TextureMediaPlayer.class, "2")) {
          return;
       }
       super.reset();
       this.releaseSurfaceTexture();
       return;
    }
    public void setDisplay(SurfaceHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextureMediaPlayer.class, "4")) {
          return;
       }
       if (this.mSurfaceTexture == null) {
          super.setDisplay(p0);
       }
       return;
    }
    public void setSurface(Surface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextureMediaPlayer.class, "5")) {
          return;
       }
       if (this.mSurfaceTexture == null) {
          super.setSurface(p0);
       }
       return;
    }
    public void setSurfaceTexture(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextureMediaPlayer.class, "6")) {
          return;
       }
       if (this.mSurfaceTexture == p0) {
          return;
       }
       this.releaseSurfaceTexture();
       this.mSurfaceTexture = p0;
       if (p0 == null) {
          super.setSurface(null);
       }else {
          super.setSurface(new Surface(p0));
       }
       return;
    }
    public void setSurfaceTextureHost(ISurfaceTextureHost p0){
       this.mSurfaceTextureHost = p0;
    }
}
