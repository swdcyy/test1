package com.kwai.video.wayne.player.main.WaynePlayer$mOnRenderStartListener$1;
import com.kwai.video.player.IMediaPlayer$OnRenderingStartListener;
import com.kwai.video.wayne.player.main.WaynePlayer;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.os.SystemClock;

public final class WaynePlayer$mOnRenderStartListener$1 implements IMediaPlayer$OnRenderingStartListener	// class@000d9f
{
    public final WaynePlayer this$0;

    public void WaynePlayer$mOnRenderStartListener$1(WaynePlayer p0){
       this.this$0 = p0;
       super();
    }
    public final void onRenderingStart(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(WaynePlayer$mOnRenderStartListener$1.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, WaynePlayer$mOnRenderStartListener$1.class, "1")) {
          return;
       }
       if (p1 != 3) {
          if (p1 == 0x2712) {
             p0.mStartToFirstScreenAudioFirstFrameCT = SystemClock.elapsedRealtime() - this.this$0.mStForStartCall;
          }
       }else {
          p0.mStartToFirstScreenVideoFirstFrameCT = SystemClock.elapsedRealtime() - this.this$0.mStForStartCall;
       }
       return;
    }
}
