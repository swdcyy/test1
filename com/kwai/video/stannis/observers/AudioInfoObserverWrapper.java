package com.kwai.video.stannis.observers.AudioInfoObserverWrapper;
import com.kwai.video.stannis.observers.AudioInfoObserver;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class AudioInfoObserverWrapper	// class@000c50
{
    public AudioInfoObserver observer;

    public void AudioInfoObserverWrapper(AudioInfoObserver p0){
       super();
       this.observer = p0;
    }
    public boolean onGetAudioInfo(Map p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AudioInfoObserverWrapper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.observer.onGetAudioInfo(p0);
    }
}
