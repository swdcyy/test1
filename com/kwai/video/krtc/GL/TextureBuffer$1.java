package com.kwai.video.krtc.GL.TextureBuffer$1;
import java.lang.Runnable;
import com.kwai.video.krtc.GL.TextureBuffer;
import java.nio.ByteBuffer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class TextureBuffer$1 implements Runnable	// class@000754
{
    public final TextureBuffer this$0;
    public final ByteBuffer val$byteBuffer;

    public void TextureBuffer$1(TextureBuffer p0,ByteBuffer p1){
       this.this$0 = p0;
       this.val$byteBuffer = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TextureBuffer$1.class, "1")) {
          return;
       }
       this.this$0.convert(this.val$byteBuffer);
       return;
    }
}
