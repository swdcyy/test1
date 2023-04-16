package com.kwai.video.krtc.GL.SurfaceTextureHelper$5;
import java.lang.Runnable;
import com.kwai.video.krtc.GL.SurfaceTextureHelper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.GL.b;

public class SurfaceTextureHelper$5 implements Runnable	// class@00074d
{
    public final SurfaceTextureHelper this$0;
    public final int val$id;

    public void SurfaceTextureHelper$5(SurfaceTextureHelper p0,int p1){
       this.this$0 = p0;
       this.val$id = p1;
       super();
    }
    public void run(){
       SurfaceTextureHelper$5 tthis$01;
       if (PatchProxy.applyVoid(null, this, SurfaceTextureHelper$5.class, "1")) {
          return;
       }
       SurfaceTextureHelper$5 tthis$0 = this.this$0;
       boolean b = false;
       if (this.val$id == tthis$0.oesTextureId) {
          tthis$0.isTextureInUse = b;
       }else {
          while (b < 3) {
             if (this.val$id == this.this$0.texFbs[b].b()) {
                tthis$01 = this.this$0;
                int i = 1 << b;
                i = ~ i;
                int i1 = tthis$01.texFbsInUseFlag & i;
                tthis$01.texFbsInUseFlag = i1;
             }
             b = b + 1;
          }
       }
       tthis$01 = this.this$0;
       if (tthis$01.isQuitting != null) {
          tthis$01.release();
       }else if(this.val$id == tthis$01.oesTextureId){
          tthis$01.tryDeliverTextureFrame();
       }
       return;
    }
}
