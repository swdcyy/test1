package com.kwai.video.wayne.player.listeners.InnerPlayerLifeCycleListener;
import com.kwai.video.player.IKwaiMediaPlayer;
import java.lang.String;
import com.kwai.video.player.kwai_player.KwaiPlayerVodBuilder;
import com.kwai.video.wayne.player.InstancePriority;

public interface abstract InnerPlayerLifeCycleListener	// class@000d28
{

    void onPlayerCreated(IKwaiMediaPlayer p0,int p1,String p2);
    void onPlayerCreating(KwaiPlayerVodBuilder p0);
    void onPlayerPriorityChanged(InstancePriority p0,InstancePriority p1);
    void onPlayerReleased();
}
