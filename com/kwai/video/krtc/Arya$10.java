package com.kwai.video.krtc.Arya$10;
import com.kwai.video.krtc.a$c;
import com.kwai.video.krtc.Arya;
import com.kwai.video.krtc.observers.KaraokeScoreObserver;
import java.lang.String;
import java.lang.Object;
import com.kwai.video.krtc.KaraokeScore;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public class Arya$10 implements a$c	// class@000649
{
    public final Arya this$0;
    public final KaraokeScoreObserver val$observer;
    public final String val$songID;

    public void Arya$10(Arya p0,KaraokeScoreObserver p1,String p2){
       this.this$0 = p0;
       this.val$observer = p1;
       this.val$songID = p2;
       super();
    }
    public void onScore(KaraokeScore p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Arya$10.class, "1")) {
          return;
       }
       this.val$observer.onScore(p0);
       return;
    }
    public void onScore(String p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(Arya$10.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, Arya$10.class, "2")) {
          return;
       }
       this.val$observer.onScore(this.val$songID, p1, p2, p3);
       return;
    }
}
