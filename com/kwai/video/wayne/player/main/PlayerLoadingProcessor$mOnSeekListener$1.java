package com.kwai.video.wayne.player.main.PlayerLoadingProcessor$mOnSeekListener$1;
import com.kwai.video.wayne.player.listeners.OnSeekListener;
import com.kwai.video.wayne.player.main.PlayerLoadingProcessor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.wayne.player.main.WaynePlayer;
import com.kwai.video.wayne.player.main.AbsKpMidProcessor;
import android.os.Handler;
import java.lang.Runnable;

public final class PlayerLoadingProcessor$mOnSeekListener$1 implements OnSeekListener	// class@000d7b
{
    public final PlayerLoadingProcessor this$0;

    public void PlayerLoadingProcessor$mOnSeekListener$1(PlayerLoadingProcessor p0){
       this.this$0 = p0;
       super();
    }
    public void onSeekComplete(){
    }
    public void onSeekStart(){
       if (PatchProxy.applyVoid(null, this, PlayerLoadingProcessor$mOnSeekListener$1.class, "1")) {
          return;
       }
       this.this$0.getMediaPlayer().getHandler().postDelayed(this.this$0.seekRunable, 500);
       return;
    }
}
