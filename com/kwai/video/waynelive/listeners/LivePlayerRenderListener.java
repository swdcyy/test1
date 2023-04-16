package com.kwai.video.waynelive.listeners.LivePlayerRenderListener;

public interface abstract LivePlayerRenderListener	// class@000dff
{

    void onAudioRenderingStart();
    void onLivePlayViewShow();
    void onRenderingStartAfterResume();
    void onSwitchToAudioStreamFromVideoStream();
    void onSwitchToVideoStreamFromAudioStream();
    void onVideoRenderingStart();
}
