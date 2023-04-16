package com.kwai.video.stannis.observers.AudioFrameObserverWrapper;
import com.kwai.video.stannis.observers.AudioFrameObserver;
import java.lang.Object;
import java.nio.ByteBuffer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class AudioFrameObserverWrapper	// class@000c4e
{
    public AudioFrameObserver observer;

    public void AudioFrameObserverWrapper(AudioFrameObserver p0){
       super();
       this.observer = p0;
    }
    public boolean onMixedFrame(ByteBuffer p0,int p1,int p2,int p3,int p4){
       AudioFrameObserverWrapper uAudioFrameO = AudioFrameObserverWrapper.class;
       if (PatchProxy.isSupport(uAudioFrameO)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, uAudioFrameO, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       byte[] uobyteArray = new byte[p0.capacity()];
       p0.get(uobyteArray);
       return this.observer.onMixedFrame(uobyteArray, p1, p2, p3, p4);
    }
    public boolean onPlaybackFrame(ByteBuffer p0,int p1,int p2,int p3,int p4){
       AudioFrameObserverWrapper uAudioFrameO = AudioFrameObserverWrapper.class;
       if (PatchProxy.isSupport(uAudioFrameO)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, uAudioFrameO, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       byte[] uobyteArray = new byte[p0.capacity()];
       p0.get(uobyteArray);
       return this.observer.onPlaybackFrame(uobyteArray, p1, p2, p3, p4);
    }
    public boolean onRecordFrame(ByteBuffer p0,int p1,int p2,int p3,int p4){
       AudioFrameObserverWrapper uAudioFrameO = AudioFrameObserverWrapper.class;
       if (PatchProxy.isSupport(uAudioFrameO)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, uAudioFrameO, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       byte[] uobyteArray = new byte[p0.capacity()];
       p0.get(uobyteArray);
       return this.observer.onRecordFrame(uobyteArray, p1, p2, p3, p4);
    }
    public boolean onRecordRawFrame(ByteBuffer p0,int p1,int p2,int p3,int p4,int p5){
       AudioFrameObserverWrapper uAudioFrameO = AudioFrameObserverWrapper.class;
       if (PatchProxy.isSupport(uAudioFrameO)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          Object obj = PatchProxy.apply(objArray, this, uAudioFrameO, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       byte[] uobyteArray = new byte[p0.capacity()];
       p0.get(uobyteArray);
       return this.observer.onRecordRawFrame(uobyteArray, p1, p2, p3, p4, p5);
    }
}
