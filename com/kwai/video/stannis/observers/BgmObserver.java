package com.kwai.video.stannis.observers.BgmObserver;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.video.stannis.observers.BgmObserver$BgmErrorType;
import com.kwai.video.stannis.observers.BgmObserver$KWStannisBgmState;

public abstract class BgmObserver	// class@000c56
{

    public void BgmObserver(){
       super();
    }
    public void onBgmPositionDuration(String p0,float p1,float p2){
    }
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
    public void onPrepareReady(){
    }
    public abstract void onProgressed(String p0,float p1,float p2);
    public abstract void onStart(String p0);
    public final void onStateChanged(String p0,int p1,int p2){
       if (PatchProxy.isSupport(BgmObserver.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, BgmObserver.class, "2")) {
          return;
       }
       this.onStateChanged(p0, BgmObserver$KWStannisBgmState.values()[p1], BgmObserver$BgmErrorType.values()[p2]);
       return;
    }
    public void onStateChanged(String p0,BgmObserver$KWStannisBgmState p1,BgmObserver$BgmErrorType p2){
    }
}
