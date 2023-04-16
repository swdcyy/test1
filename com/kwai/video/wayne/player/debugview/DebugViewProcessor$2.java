package com.kwai.video.wayne.player.debugview.DebugViewProcessor$2;
import com.kwai.video.wayne.player.listeners.OnStopListener;
import com.kwai.video.wayne.player.debugview.DebugViewProcessor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.player.debuginfo.IDebugView;

public class DebugViewProcessor$2 implements OnStopListener	// class@000d23
{
    public final DebugViewProcessor this$0;

    public void DebugViewProcessor$2(DebugViewProcessor p0){
       this.this$0 = p0;
       super();
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, DebugViewProcessor$2.class, "1")) {
          return;
       }
       DebugViewProcessor mVodDebugInf = this.this$0.mVodDebugInfoView;
       if (mVodDebugInf != null) {
          mVodDebugInf.stopMonitor();
       }
       return;
    }
}
