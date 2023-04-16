package com.kwai.video.krtc.GL.TextureBuffer$2;
import com.kwai.video.krtc.utils.d$a;
import com.kwai.video.krtc.GL.TextureBuffer;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import android.opengl.GLES30;

public class TextureBuffer$2 implements d$a	// class@000755
{
    public final TextureBuffer this$0;

    public void TextureBuffer$2(TextureBuffer p0){
       this.this$0 = p0;
       super();
    }
    public void release(long p0){
       TextureBuffer$2 u2 = TextureBuffer$2.class;
       if (PatchProxy.isSupport(u2) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, u2, "1")) {
          return;
       }
       GLES30.glDeleteSync(p0);
       return;
    }
}
