package com.kwai.video.krtc.GL.SurfaceTextureHelper$9;
import java.lang.Runnable;
import com.kwai.video.krtc.GL.SurfaceTextureHelper;
import com.kwai.video.krtc.GL.TextureBuffer$Type;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.GL.TextureBuffer;

public class SurfaceTextureHelper$9 implements Runnable	// class@000751
{
    public final SurfaceTextureHelper this$0;
    public final long val$fenceId;
    public final int val$height;
    public final int val$orgHeight;
    public final int val$orgWidth;
    public final int val$rotation;
    public final int val$srcId;
    public final long val$timestamp;
    public final float[] val$transformMatrix;
    public final TextureBuffer$Type val$type;
    public final int val$width;

    public void SurfaceTextureHelper$9(SurfaceTextureHelper p0,long p1,TextureBuffer$Type p2,int p3,int p4,int p5,int p6,int p7,int p8,long p9,float[] p10){
       this.this$0 = p0;
       this.val$fenceId = p1;
       this.val$type = p2;
       this.val$srcId = p3;
       this.val$width = p4;
       this.val$height = p5;
       this.val$rotation = p6;
       this.val$orgWidth = p7;
       this.val$orgHeight = p8;
       this.val$timestamp = p9;
       this.val$transformMatrix = p10;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, SurfaceTextureHelper$9.class, "1")) {
          return;
       }
       this.this$0.waitSyncInGpu(this.val$fenceId, true);
       SurfaceTextureHelper$9 tthis$0 = this.this$0;
       tthis$0.texture = tthis$0.cloneTextureBufferPrivate(this.val$type, this.val$srcId, this.val$width, this.val$height, this.val$rotation, this.val$orgWidth, this.val$orgHeight, this.val$timestamp, this.val$transformMatrix);
       return;
    }
}
