package com.kwai.video.wayne.player.logreport.PlayerLogReportProcessor$1;
import com.kwai.video.wayne.player.listeners.OnSeekListener;
import com.kwai.video.wayne.player.logreport.PlayerLogReportProcessor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.atomic.AtomicInteger;

public class PlayerLogReportProcessor$1 implements OnSeekListener	// class@000d43
{
    public final PlayerLogReportProcessor this$0;

    public void PlayerLogReportProcessor$1(PlayerLogReportProcessor p0){
       this.this$0 = p0;
       super();
    }
    public void onSeekComplete(){
       if (PatchProxy.applyVoid(null, this, PlayerLogReportProcessor$1.class, "2")) {
          return;
       }
       this.this$0.mSeekExit.set(0);
       return;
    }
    public void onSeekStart(){
       if (PatchProxy.applyVoid(null, this, PlayerLogReportProcessor$1.class, "1")) {
          return;
       }
       this.this$0.mSeekExit.set(1);
       return;
    }
}
