package com.kwai.video.stannis.observers.AudioCallbackObserver;
import java.lang.Object;
import java.nio.ByteBuffer;

public abstract class AudioCallbackObserver	// class@000c4c
{

    public void AudioCallbackObserver(){
       super();
    }
    public abstract void OnLiveChat(ByteBuffer p0,int p1,int p2,int p3,long p4);
    public abstract void OnPlayout(ByteBuffer p0,int p1,int p2,int p3,long p4);
    public abstract void onStream(ByteBuffer p0,int p1,int p2,int p3,long p4);
}
