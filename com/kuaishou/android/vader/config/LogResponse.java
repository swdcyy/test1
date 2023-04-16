package com.kuaishou.android.vader.config.LogResponse;
import com.kuaishou.android.vader.config.LogPolicy;
import java.lang.Object;
import java.lang.Long;

public class LogResponse	// class@000714
{
    public LogPolicy logPolicy;
    public Long nextRequestPeriodInMs;

    public void LogResponse(long p0,LogPolicy p1){
       super();
       this.nextRequestPeriodInMs = Long.valueOf(p0);
       this.logPolicy = p1;
    }
    public LogPolicy getLogPolicy(){
       LogResponse tlogPolicy = this.logPolicy;
       if (tlogPolicy == null) {
          tlogPolicy = LogPolicy.NORMAL;
       }
       return tlogPolicy;
    }
}
