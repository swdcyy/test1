package com.kwai.video.stannis.Stannis$4;
import java.lang.Thread;
import com.kwai.video.stannis.Stannis;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import com.kwai.video.stannis.observers.StannisAudioSceneObserver;

public class Stannis$4 extends Thread	// class@000bca
{
    public final Stannis this$0;
    public final int val$audioScene;
    public final boolean val$start;

    public void Stannis$4(Stannis p0,boolean p1,int p2){
       this.this$0 = p0;
       this.val$start = p1;
       this.val$audioScene = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, Stannis$4.class, "1")) {
          return;
       }
       Iterator iterator = this.this$0.audioSceneObservers.iterator();
       while (iterator.hasNext()) {
          StannisAudioSceneObserver stannisAudio = iterator.next();
          if (this.val$start != null) {
             stannisAudio.onAudioSceneStart(this.val$audioScene);
          }else {
             stannisAudio.onAudioSceneStop(this.val$audioScene);
          }
       }
       return;
    }
}
