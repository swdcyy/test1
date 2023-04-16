package com.kwai.video.stannis.observers.AudioRecordingObserver;
import java.nio.ByteBuffer;

public interface abstract AudioRecordingObserver	// class@000c51
{

    void onAudioEncoded(ByteBuffer p0,int p1);
    void onAudioRecordFinished(int p0);
}
