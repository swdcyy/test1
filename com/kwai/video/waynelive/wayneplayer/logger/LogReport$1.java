package com.kwai.video.waynelive.wayneplayer.logger.LogReport$1;
import com.kwai.video.waynelive.wayneplayer.logger.IKSLogReport;
import com.kwai.video.waynelive.wayneplayer.logger.LogReport;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.kwai.video.waynelive.debug.DebugLog;

public class LogReport$1 implements IKSLogReport	// class@000e57
{
    public final LogReport this$0;

    public void LogReport$1(LogReport p0){
       this.this$0 = p0;
       super();
    }
    public void logEvent(String p0,String p1,boolean p2){
       if (PatchProxy.isSupport(LogReport$1.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, LogReport$1.class, "1")) {
          return;
       }
       DebugLog.i("LogReport", p0+": isRealTime: "+p2+" : "+p1);
       return;
    }
}
