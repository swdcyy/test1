package com.kwai.performance.stability.crash.monitor.util.BacktraceUtil$ThreadStateAndLockInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public class BacktraceUtil$ThreadStateAndLockInfo implements Serializable	// class@001209
{
    public String lockClassName;
    public String threadState;
    public int tid;
    public long updateTime;

    public void BacktraceUtil$ThreadStateAndLockInfo(){
       super();
    }
    public boolean isBlock(){
       boolean b = ((this.threadState).equals("Blocked") || (this.threadState).equals("WaitingForLockInflation"))? true: false;
       return b;
    }
}
