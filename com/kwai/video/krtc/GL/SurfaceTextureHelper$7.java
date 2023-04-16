package com.kwai.video.krtc.GL.SurfaceTextureHelper$7;
import java.lang.Runnable;
import com.kwai.video.krtc.GL.SurfaceTextureHelper;
import com.kwai.video.krtc.GL.TextureBuffer;
import java.nio.ByteBuffer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.GL.e;

public class SurfaceTextureHelper$7 implements Runnable	// class@00074f
{
    public final SurfaceTextureHelper this$0;
    public final ByteBuffer val$byteBuffer;
    public final TextureBuffer val$textureBuffer;

    public void SurfaceTextureHelper$7(SurfaceTextureHelper p0,TextureBuffer p1,ByteBuffer p2){
       this.this$0 = p0;
       this.val$textureBuffer = p1;
       this.val$byteBuffer = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, SurfaceTextureHelper$7.class, "1")) {
          return;
       }
       this.this$0.yuvConverter.a(this.val$textureBuffer, this.val$byteBuffer);
       return;
    }
}
