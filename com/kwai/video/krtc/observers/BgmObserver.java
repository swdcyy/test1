package com.kwai.video.krtc.observers.BgmObserver;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.video.krtc.observers.BgmObserver$BgmErrorType;

public abstract class BgmObserver	// class@0007c8
{

    public void BgmObserver(){
       super();
    }
    public abstract void offsetInLiveStream(int p0);
    public abstract void onCompleted(String p0);
    public final void onError(String p0,int p1){
       BgmObserver uBgmObserver = BgmObserver.class;
       if (PatchProxy.isSupport(uBgmObserver) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uBgmObserver, "1")) {
          return;
       }
       this.onError(p0, BgmObserver$BgmErrorType.values()[p1]);
       return;
    }
    public abstract void onError(String p0,BgmObserver$BgmErrorType p1);
    public abstract void onProgressed(String p0,float p1,float p2);
    public abstract void onStart(String p0);
}
