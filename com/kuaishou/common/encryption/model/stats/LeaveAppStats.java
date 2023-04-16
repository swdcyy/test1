package com.kuaishou.common.encryption.model.stats.LeaveAppStats;
import java.io.Serializable;
import com.kuaishou.common.encryption.model.a;
import com.kuaishou.common.encryption.model.stats.LeaveAppStats$a;
import java.lang.String;
import java.lang.Integer;
import java.lang.Float;

public class LeaveAppStats extends a implements Serializable	// class@0016cc
{
    public String lastPageUri;
    public Integer scrollOutItemCount;
    public Float scrollOutScreenCount;
    public long usageTime;

    public void LeaveAppStats(){
       super();
    }
    public static LeaveAppStats$a newBuilder(){
       return new LeaveAppStats$a();
    }
    public String getLastPageUri(){
       return this.lastPageUri;
    }
    public Integer getScrollOutItemCount(){
       return this.scrollOutItemCount;
    }
    public Float getScrollOutScreenCount(){
       return this.scrollOutScreenCount;
    }
    public long getUsageTime(){
       return this.usageTime;
    }
}
