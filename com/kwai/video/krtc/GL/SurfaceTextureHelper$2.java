package com.kwai.video.krtc.GL.SurfaceTextureHelper$2;
import java.lang.Runnable;
import com.kwai.video.krtc.GL.SurfaceTextureHelper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;

public class SurfaceTextureHelper$2 implements Runnable	// class@000749
{
    public final SurfaceTextureHelper this$0;

    public void SurfaceTextureHelper$2(SurfaceTextureHelper p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SurfaceTextureHelper$2.class, "1")) {
          return;
       }
       Log.i("SurfaceTextureHelper", "Setting listener to "+this.this$0.pendingListener);
       SurfaceTextureHelper$2 tthis$0 = this.this$0;
       tthis$0.listener = tthis$0.pendingListener;
       tthis$0.pendingListener = objArray;
       if (tthis$0.hasPendingTexture != null) {
          this.this$0.updateTexImage();
          this.this$0.hasPendingTexture = false;
       }
       return;
    }
}
