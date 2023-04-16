package com.kwai.video.krtc.observers.AudioSegmentPlayerObserver;
import java.lang.Object;
import java.lang.String;
import com.kwai.video.krtc.observers.AudioSegmentPlayerObserver$ErrorType;

public abstract class AudioSegmentPlayerObserver	// class@0007c6
{

    public void AudioSegmentPlayerObserver(){
       super();
    }
    public abstract void onFinished(String p0,String p1,AudioSegmentPlayerObserver$ErrorType p2);
    public abstract void onProgressed(String p0,String p1,float p2,float p3);
    public abstract void onStarted(String p0,String p1,long p2);
}
