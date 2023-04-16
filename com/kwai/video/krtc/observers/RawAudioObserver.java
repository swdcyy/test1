package com.kwai.video.krtc.observers.RawAudioObserver;
import java.lang.Object;
import java.nio.ByteBuffer;

public abstract class RawAudioObserver	// class@0007d2
{

    public void RawAudioObserver(){
       super();
    }
    public abstract void onRawAudio(int p0,ByteBuffer p1,int p2,int p3,int p4,long p5,short p6,int p7);
}
