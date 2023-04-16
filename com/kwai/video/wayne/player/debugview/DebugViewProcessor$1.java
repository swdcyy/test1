package com.kwai.video.wayne.player.debugview.DebugViewProcessor$1;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.video.wayne.player.debugview.DebugViewProcessor;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.player.debuginfo.IDebugView;
import com.kwai.video.wayne.player.main.WaynePlayer;
import com.kwai.video.wayne.player.main.AbsKpMidProcessor;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.player.debuginfo.KwaiPlayerDebugInfoProvider;

public class DebugViewProcessor$1 implements IMediaPlayer$OnPreparedListener	// class@000d22
{
    public final DebugViewProcessor this$0;

    public void DebugViewProcessor$1(DebugViewProcessor p0){
       this.this$0 = p0;
       super();
    }
    public void onPrepared(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DebugViewProcessor$1.class, "1")) {
          return;
       }
       DebugViewProcessor mVodDebugInf = this.this$0.mVodDebugInfoView;
       if (mVodDebugInf != null) {
          mVodDebugInf.stopMonitor();
          DebugViewProcessor$1 tthis$0 = this.this$0;
          tthis$0.mVodDebugInfoView.startMonitor(tthis$0.getMediaPlayer().getKernelPlayer());
       }
       return;
    }
}
