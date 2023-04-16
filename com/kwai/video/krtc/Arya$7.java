package com.kwai.video.krtc.Arya$7;
import com.kwai.video.krtc.observers.LiveStreamBgmOffsetObserver;
import com.kwai.video.krtc.Arya;
import com.kwai.video.krtc.observers.BgmObserver;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class Arya$7 implements LiveStreamBgmOffsetObserver	// class@000657
{
    public final Arya this$0;
    public final BgmObserver val$observer;

    public void Arya$7(Arya p0,BgmObserver p1){
       this.this$0 = p0;
       this.val$observer = p1;
       super();
    }
    public void onBgmOffset(int p0){
       Arya$7 u7 = Arya$7.class;
       if (PatchProxy.isSupport(u7) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, u7, "1")) {
          return;
       }
       this.val$observer.offsetInLiveStream(p0);
       return;
    }
}
