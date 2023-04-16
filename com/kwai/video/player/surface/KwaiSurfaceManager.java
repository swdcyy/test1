package com.kwai.video.player.surface.KwaiSurfaceManager;
import java.lang.Object;
import com.kwai.video.player.surface.KwaiSurfaceManager$SurfaceSource;
import android.view.Surface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.SurfaceHolder;
import android.graphics.SurfaceTexture;
import java.lang.Boolean;

public class KwaiSurfaceManager	// class@000ba4
{
    public KwaiSurfaceManager$SurfaceSource mSource;
    public Surface mSurface;
    public SurfaceHolder mSurfaceHolder;

    public void KwaiSurfaceManager(){
       super();
       this.mSource = KwaiSurfaceManager$SurfaceSource.SOURCE_UNKNOWN;
    }
    public void asSurface(Surface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiSurfaceManager.class, "2")) {
          return;
       }
       this.release();
       if (p0 != null) {
          this.mSource = KwaiSurfaceManager$SurfaceSource.SOURCE_SURFACE;
          this.mSurface = p0;
       }
       return;
    }
    public void asSurfaceHolder(SurfaceHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiSurfaceManager.class, "3")) {
          return;
       }
       this.release();
       if (p0 != null) {
          this.mSource = KwaiSurfaceManager$SurfaceSource.SOURCE_SURFACE_HOLDER;
          this.mSurface = p0.getSurface();
          this.mSurfaceHolder = p0;
       }
       return;
    }
    public void asSurfaceTexture(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiSurfaceManager.class, "1")) {
          return;
       }
       this.release();
       if (p0 != null) {
          this.mSource = KwaiSurfaceManager$SurfaceSource.SOURCE_SURFACE_TEXTURE;
          this.mSurface = new Surface(p0);
       }
       return;
    }
    public Surface getSurface(){
       return this.mSurface;
    }
    public boolean isSourceSurfaceHolder(){
       boolean b = (this.mSource == KwaiSurfaceManager$SurfaceSource.SOURCE_SURFACE_HOLDER)? true: false;
       return b;
    }
    public boolean isSourceSurfaceTexture(){
       boolean b = (this.mSource == KwaiSurfaceManager$SurfaceSource.SOURCE_SURFACE_TEXTURE)? true: false;
       return b;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, KwaiSurfaceManager.class, "5")) {
          return;
       }
       if (this.isSourceSurfaceTexture()) {
          KwaiSurfaceManager tmSurface = this.mSurface;
          if (tmSurface != null) {
             tmSurface.release();
          }
       }
       this.mSource = KwaiSurfaceManager$SurfaceSource.SOURCE_UNKNOWN;
       this.mSurface = null;
       this.mSurfaceHolder = null;
       return;
    }
    public void setKeepScreenOn(boolean p0){
       KwaiSurfaceManager kwaiSurfaceM = KwaiSurfaceManager.class;
       if (PatchProxy.isSupport(kwaiSurfaceM) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kwaiSurfaceM, "4")) {
          return;
       }
       kwaiSurfaceM = this.mSurfaceHolder;
       if (kwaiSurfaceM != null) {
          kwaiSurfaceM.setKeepScreenOn(p0);
       }
       return;
    }
}
