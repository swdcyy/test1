package com.kwai.video.wayne.player.logreport.LogReport;
import java.lang.Object;
import com.kwai.video.wayne.player.logreport.LogReport$1;
import com.kwai.video.wayne.player.logreport.LogReport$Holder;
import com.kwai.video.wayne.player.logreport.IKSLogReport;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.wayne.player.WaynePlayerInitor;
import java.lang.IllegalStateException;

public class LogReport	// class@000d42
{
    public IKSLogReport mLogger;

    public void LogReport(){
       super();
       this.mLogger = new LogReport$1(this);
    }
    public static LogReport get(){
       return LogReport$Holder.sInstance;
    }
    public IKSLogReport getLogger(){
       Object obj = PatchProxy.apply(null, this, LogReport.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mLogger != null || !WaynePlayerInitor.isApkInDebug()) {
          return this.mLogger;
       }
       throw new IllegalStateException("Invoker setLogger\(\) first!!");
    }
    public void setLogger(IKSLogReport p0){
       this.mLogger = p0;
    }
}
