package com.kwai.video.waynelive.mediaplayer.LiveMediaPlayerBuildListener;
import com.kwai.video.player.kwai_player.KwaiPlayerLiveBuilder;
import com.kwai.video.player.IKwaiMediaPlayer;

public interface abstract LiveMediaPlayerBuildListener	// class@000e06
{

    void onBuildMediaPlayer(KwaiPlayerLiveBuilder p0);
    void onCreatedMediaPlayer(IKwaiMediaPlayer p0);
}
