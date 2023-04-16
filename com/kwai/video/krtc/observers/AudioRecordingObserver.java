package com.kwai.video.krtc.observers.AudioRecordingObserver;
import java.nio.ByteBuffer;

public interface abstract AudioRecordingObserver	// class@0007c3
{

    void onAudioEncoded(ByteBuffer p0,int p1);
    void onAudioRecordFinished(int p0,int p1);
    void onAudioRecordStart(int p0);
}
