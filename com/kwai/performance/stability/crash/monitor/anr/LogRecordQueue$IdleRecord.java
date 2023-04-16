package com.kwai.performance.stability.crash.monitor.anr.LogRecordQueue$IdleRecord;
import java.io.Serializable;
import java.lang.Object;

public class LogRecordQueue$IdleRecord implements Serializable	// class@00119d
{
    public int count;
    public long cpu;
    public int keepCount;
    public long wall;

    public void LogRecordQueue$IdleRecord(){
       super();
       this.wall = 0;
       this.cpu = 0;
       this.count = 0;
       this.keepCount = 0;
    }
    public void update(long p0,long p1,boolean p2){
       this.count = this.count + 1;
       this.wall = this.wall + p0;
       this.cpu = this.cpu + p1;
       if (p2) {
          this.keepCount = this.keepCount + 1;
       }
       return;
    }
    public void update(LogRecordQueue$IdleRecord p0){
       this.wall = this.wall + p0.wall;
       this.cpu = this.cpu + p0.cpu;
       this.count = this.count + p0.count;
       this.keepCount = this.keepCount + p0.keepCount;
    }
}
