package com.kwai.video.waynelive.wayneplayer.logger.LogReport;
import java.lang.Object;
import com.kwai.video.waynelive.wayneplayer.logger.LogReport$1;
import com.kwai.video.waynelive.wayneplayer.logger.LogReport$Holder;
import com.kwai.video.waynelive.wayneplayer.logger.IKSLogReport;

public class LogReport	// class@000e59
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
       return this.mLogger;
    }
    public void setLogger(IKSLogReport p0){
       this.mLogger = p0;
    }
}
