package com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$SurfaceTextureListener;
import android.view.TextureView$SurfaceTextureListener;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer;
import java.lang.Object;
import com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$1;
import android.graphics.SurfaceTexture;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.Surface;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import com.kwai.video.waynelive.wayneplayer.LivePlayerStatusMonitorImpl;
import com.kwai.video.player.IMediaPlayer;
import java.lang.StringBuilder;
import com.kwai.video.waynelive.debug.DebugLog;
import java.lang.StackTraceElement;
import java.lang.Exception;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class WayneLivePlayer$SurfaceTextureListener implements TextureView$SurfaceTextureListener	// class@000e4c
{
    public final WayneLivePlayer this$0;

    public void WayneLivePlayer$SurfaceTextureListener(WayneLivePlayer p0){
       this.this$0 = p0;
       super();
    }
    public void WayneLivePlayer$SurfaceTextureListener(WayneLivePlayer p0,WayneLivePlayer$1 p1){
       super(p0);
    }
    public void onSurfaceTextureAvailable(SurfaceTexture p0,int p1,int p2){
       if (PatchProxy.isSupport(WayneLivePlayer$SurfaceTextureListener.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, WayneLivePlayer$SurfaceTextureListener.class, "1")) {
          return;
       }
       try{
          WayneLivePlayer mPlayTexture = this.this$0.mPlayTextureView;
          Surface surface = (mPlayTexture == null)? null: mPlayTexture.b(true);
          WayneLivePlayer$SurfaceTextureListener tthis$0 = this.this$0;
          if (tthis$0.mSurface != surface) {
             tthis$0.mSurface = surface;
             LivePlayerStatusMonitorImpl mLiveMediaPl = tthis$0.mLiveMediaPlayer;
             if (mLiveMediaPl != null) {
                mLiveMediaPl.setSurface(surface);
                this.this$0.releasePreviousSurface();
             }
          }
          DebugLog.i(this.this$0.getTag(), "onSurfaceTextureAvailable mSurfaceTexture nullsurfaceTexture"+p0+" mSurface "+this.this$0.mSurface);
       }catch(java.lang.Exception e9){
          DebugLog.e(this.this$0.getTag(), "onSurfaceTextureAvailable failed surfaceTexture"+p0+e9.getStackTrace());
       }
       return;
    }
    public boolean onSurfaceTextureDestroyed(SurfaceTexture p0){
       p0 = PatchProxy.applyOneRefs(p0, this, WayneLivePlayer$SurfaceTextureListener.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       WayneLivePlayer mPlayTexture = this.this$0.mPlayTextureView;
       if (mPlayTexture != null && mPlayTexture.d()) {
          WayneLivePlayer$SurfaceTextureListener tthis$0 = this.this$0;
          tthis$0.mSurface = null;
          LivePlayerStatusMonitorImpl mLiveMediaPl = tthis$0.mLiveMediaPlayer;
          if (mLiveMediaPl != null) {
             mLiveMediaPl.setSurface(null);
          }
       }
       return false;
    }
    public void onSurfaceTextureSizeChanged(SurfaceTexture p0,int p1,int p2){
       if (PatchProxy.isSupport(WayneLivePlayer$SurfaceTextureListener.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, WayneLivePlayer$SurfaceTextureListener.class, "2")) {
          return;
       }
       DebugLog.i(this.this$0.getTag(), "onSurfaceTextureSizeChanged mPlayTextureView "+this.this$0.mPlayTextureView);
       return;
    }
    public void onSurfaceTextureUpdated(SurfaceTexture p0){
    }
}
