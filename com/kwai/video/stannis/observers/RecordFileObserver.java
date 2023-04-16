package com.kwai.video.stannis.observers.RecordFileObserver;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;

public abstract class RecordFileObserver	// class@000c64
{

    public void RecordFileObserver(){
       super();
    }
    public abstract void onComplete(String p0,long p1);
    public abstract void onError(String p0,int p1);
    public abstract void onProgress(String p0,long p1,long p2);
    public abstract void onStart(String p0);
    public void onStartWithBgmOffset(String p0,long p1){
       if (PatchProxy.isSupport(RecordFileObserver.class) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, RecordFileObserver.class, "1")) {
          return;
       }
       this.onStart(p0);
       return;
    }
}
