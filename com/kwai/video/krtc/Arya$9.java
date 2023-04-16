package com.kwai.video.krtc.Arya$9;
import com.kwai.video.krtc.observers.AudioSegmentPlayerObserver;
import com.kwai.video.krtc.Arya;
import java.lang.String;
import com.kwai.video.krtc.observers.AudioSegmentPlayerObserver$ErrorType;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Long;

public class Arya$9 extends AudioSegmentPlayerObserver	// class@000659
{
    public final Arya this$0;
    public final boolean val$isSendMetaData;
    public final AudioSegmentPlayerObserver val$observer;

    public void Arya$9(Arya p0,AudioSegmentPlayerObserver p1,boolean p2){
       this.this$0 = p0;
       this.val$observer = p1;
       this.val$isSendMetaData = p2;
       super();
    }
    public void onFinished(String p0,String p1,AudioSegmentPlayerObserver$ErrorType p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, Arya$9.class, "3")) {
          return;
       }
       this.val$observer.onFinished(p0, p1, p2);
       Arya.a(this.this$0, false);
       return;
    }
    public void onProgressed(String p0,String p1,float p2,float p3){
       if (PatchProxy.isSupport(Arya$9.class) && PatchProxy.applyVoidFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, Arya$9.class, "2")) {
          return;
       }
       this.val$observer.onProgressed(p0, p1, p2, p3);
       return;
    }
    public void onStarted(String p0,String p1,long p2){
       if (PatchProxy.isSupport(Arya$9.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Long.valueOf(p2), this, Arya$9.class, "1")) {
          return;
       }
       this.val$observer.onStarted(p0, p1, p2);
       if (this.val$isSendMetaData != null) {
          Arya$9 tthis$0 = this.this$0;
          Arya.a(tthis$0, Arya.c(tthis$0), "vc", p0, p2);
       }
       return;
    }
}
