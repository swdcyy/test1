package com.kwai.video.wayne.player.KSActionEventCollector;
import java.lang.Object;
import com.kwai.video.wayne.player.KSActionEventCollector$Holder;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.UUID;

public class KSActionEventCollector	// class@000ca3
{
    public String mLaunchSessionId;
    public long mLaunchTimeStamp;
    public final Object mLock;

    public void KSActionEventCollector(){
       super();
       this.mLock = new Object();
    }
    public static KSActionEventCollector getInstance(){
       return KSActionEventCollector$Holder.sKsActionEventCollector;
    }
    public String getLaunchSessionId(){
       KSActionEventCollector obj = PatchProxy.apply(null, this, KSActionEventCollector.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLock;
       _monitor_enter(obj);
       if (this.mLaunchSessionId == null) {
          this.mLaunchSessionId = UUID.randomUUID().toString();
       }
       _monitor_exit(obj);
       return this.mLaunchSessionId;
    }
    public long getLaunchTimeStamp(){
       KSActionEventCollector tmLock = this.mLock;
       _monitor_enter(tmLock);
       _monitor_exit(tmLock);
       return this.mLaunchTimeStamp;
    }
    public void setColdStartSessionId(String p0){
       KSActionEventCollector tmLock = this.mLock;
       _monitor_enter(tmLock);
       if (this.mLaunchSessionId == null) {
          this.mLaunchSessionId = p0;
       }
       _monitor_exit(tmLock);
       return;
    }
    public void setColdStartTimeStamp(long p0){
       KSActionEventCollector tmLock = this.mLock;
       _monitor_enter(tmLock);
       this.mLaunchTimeStamp = p0;
       _monitor_exit(tmLock);
    }
}
