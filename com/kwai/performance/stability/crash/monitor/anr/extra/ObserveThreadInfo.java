package com.kwai.performance.stability.crash.monitor.anr.extra.ObserveThreadInfo;
import java.io.Serializable;
import java.lang.Object;

public class ObserveThreadInfo implements Serializable	// class@0011ca
{
    public long dispatchToken;
    public long idleToken;
    public int tid;

    public void ObserveThreadInfo(){
       super();
    }
    public void ObserveThreadInfo(int p0,long p1,long p2){
       super();
       this.tid = p0;
       this.dispatchToken = p1;
       this.idleToken = p2;
    }
}
