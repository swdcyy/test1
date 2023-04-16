package com.kwai.video.player.kwai_player.KwaiPlayerCreatorDefaultImpl$1;
import com.kwai.video.player.kwai_player.KwaiPlayerCreator$InternalKwaiPlayer;
import com.kwai.video.player.kwai_player.KwaiPlayerCreatorDefaultImpl;
import java.lang.Object;
import com.kwai.video.player.kwai_player.KwaiMediaPlayer;
import com.kwai.video.player.kwai_player.IBuildKwaiPlayer;
import com.kwai.video.player.IKwaiMediaPlayer;

public class KwaiPlayerCreatorDefaultImpl$1 implements KwaiPlayerCreator$InternalKwaiPlayer	// class@000b42
{
    public final KwaiMediaPlayer mediaPlayer;
    public final KwaiPlayerCreatorDefaultImpl this$0;

    public void KwaiPlayerCreatorDefaultImpl$1(KwaiPlayerCreatorDefaultImpl p0){
       this.this$0 = p0;
       super();
       this.mediaPlayer = new KwaiMediaPlayer();
    }
    public IBuildKwaiPlayer getBuildKwaiPlayer(){
       return this.mediaPlayer;
    }
    public IKwaiMediaPlayer getIKwaiMediaPlayer(){
       return this.mediaPlayer;
    }
}
