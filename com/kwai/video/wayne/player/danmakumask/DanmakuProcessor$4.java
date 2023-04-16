package com.kwai.video.wayne.player.danmakumask.DanmakuProcessor$4;
import android.view.Choreographer$FrameCallback;
import com.kwai.video.wayne.player.danmakumask.DanmakuProcessor;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import tv.acfun.core.player.mask.KSDanmakuMaskManager;

public class DanmakuProcessor$4 implements Choreographer$FrameCallback	// class@000d11
{
    public final DanmakuProcessor this$0;

    public void DanmakuProcessor$4(DanmakuProcessor p0){
       this.this$0 = p0;
       super();
    }
    public void doFrame(long p0){
       if (PatchProxy.isSupport(DanmakuProcessor$4.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, DanmakuProcessor$4.class, "1")) {
          return;
       }
       DanmakuProcessor$4 tthis$0 = this.this$0;
       if (tthis$0.mMaskManager != null) {
          tthis$0 = tthis$0.getDanmakuPosition();
          DanmakuProcessor$4 tthis$01 = this.this$0;
          if (tthis$01.lastPosition - tthis$0) {
             tthis$01.lastPosition = tthis$0;
             tthis$01.mMaskManager.H(tthis$01.videoId, tthis$0);
          }
          this.this$0.startMaskTimer(true);
       }
       return;
    }
}
