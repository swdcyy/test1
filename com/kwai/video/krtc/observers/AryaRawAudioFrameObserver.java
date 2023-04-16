package com.kwai.video.krtc.observers.AryaRawAudioFrameObserver;

public interface abstract AryaRawAudioFrameObserver	// class@0007bd
{

    boolean onMixedFrame(byte[] p0,int p1,int p2,int p3,int p4);
    boolean onPlaybackFrame(byte[] p0,int p1,int p2,int p3,int p4);
    boolean onRecordAudioFrame(byte[] p0,int p1,int p2,int p3,int p4);
    boolean onRecordRawAudioFrame(byte[] p0,int p1,int p2,int p3,int p4,int p5);
}
