package com.kwai.video.krtc.observers.AudioMixerObserver;
import java.nio.ByteBuffer;

public interface abstract AudioMixerObserver	// class@0007c2
{

    void onAudioMixPcmData(ByteBuffer p0,int p1,int p2,long p3);
}
