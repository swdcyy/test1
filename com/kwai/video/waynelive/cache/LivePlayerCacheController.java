package com.kwai.video.waynelive.cache.LivePlayerCacheController;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public abstract class LivePlayerCacheController	// class@000ddc
{
    public final boolean mEnableSticky;
    public boolean mIsStarted;
    public final ILivePlayerStatusMonitor mLivePlayerStatusMonitor;

    public void LivePlayerCacheController(boolean p0,ILivePlayerStatusMonitor p1){
       super();
       this.mEnableSticky = p0;
       this.mLivePlayerStatusMonitor = p1;
    }
    public abstract void doNotify(Object p0);
    public void end(){
       if (PatchProxy.applyVoid(null, this, LivePlayerCacheController.class, "4")) {
          return;
       }
       this.mIsStarted = false;
       this.onClean();
       return;
    }
    public void notifyIfNeed(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerCacheController.class, "2")) {
          return;
       }
       if (this.mEnableSticky != null && this.mIsStarted != null) {
          this.doNotify(p0);
       }
       return;
    }
    public abstract void onClean();
    public abstract void onReceiveData(Object p0);
    public void setDataIfNeed(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayerCacheController.class, "1")) {
          return;
       }
       if (this.mIsStarted != null) {
          this.onReceiveData(p0);
       }
       return;
    }
    public void start(){
       if (PatchProxy.applyVoid(null, this, LivePlayerCacheController.class, "3")) {
          return;
       }
       this.mIsStarted = true;
       this.onClean();
       return;
    }
}
