package com.kwai.video.stannis.observers.AudioSegmentPlayerObserver;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.video.stannis.observers.AudioSegmentPlayerObserver$ErrorType;

public abstract class AudioSegmentPlayerObserver	// class@000c53
{

    public void AudioSegmentPlayerObserver(){
       super();
    }
    public void onError(String p0,String p1,int p2){
       if (PatchProxy.isSupport(AudioSegmentPlayerObserver.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, AudioSegmentPlayerObserver.class, "1")) {
          return;
       }
       this.onError(p0, p1, AudioSegmentPlayerObserver$ErrorType.values()[p2]);
       return;
    }
    public abstract void onError(String p0,String p1,AudioSegmentPlayerObserver$ErrorType p2);
    public abstract void onFinished(String p0,String p1);
    public abstract void onProgressed(String p0,String p1,float p2,float p3);
    public abstract void onStartMixing(String p0,String p1,long p2);
}
