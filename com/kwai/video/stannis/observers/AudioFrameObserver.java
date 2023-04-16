package com.kwai.video.stannis.observers.AudioFrameObserver;

public interface abstract AudioFrameObserver	// class@000c4d
{

    boolean onMixedFrame(byte[] p0,int p1,int p2,int p3,int p4);
    boolean onPlaybackFrame(byte[] p0,int p1,int p2,int p3,int p4);
    boolean onRecordFrame(byte[] p0,int p1,int p2,int p3,int p4);
    boolean onRecordRawFrame(byte[] p0,int p1,int p2,int p3,int p4,int p5);
}
