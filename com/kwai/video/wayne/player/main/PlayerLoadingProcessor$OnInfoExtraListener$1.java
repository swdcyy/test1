package com.kwai.video.wayne.player.main.PlayerLoadingProcessor$OnInfoExtraListener$1;
import com.kwai.video.player.IMediaPlayer$OnInfoExtraListener;
import com.kwai.video.wayne.player.main.PlayerLoadingProcessor;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import com.kwai.video.player.OnInfoExtra;

public final class PlayerLoadingProcessor$OnInfoExtraListener$1 implements IMediaPlayer$OnInfoExtraListener	// class@000d79
{
    public final PlayerLoadingProcessor this$0;

    public void PlayerLoadingProcessor$OnInfoExtraListener$1(PlayerLoadingProcessor p0){
       this.this$0 = p0;
       super();
    }
    public final boolean OnInfoExtra(IMediaPlayer p0,int p1,OnInfoExtra p2){
       if (p1 != 0x3e81) {
       }else {
          p0.mAudioStreamCount = p2.arg1;
          p0.mVideoStreamCount = p2.arg2;
       }
       return false;
    }
}
