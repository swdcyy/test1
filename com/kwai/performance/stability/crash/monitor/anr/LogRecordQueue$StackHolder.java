package com.kwai.performance.stability.crash.monitor.anr.LogRecordQueue$StackHolder;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.String;
import java.lang.StringBuilder;

public class LogRecordQueue$StackHolder implements Serializable	// class@0011a1
{
    public Object[] lastStacks;
    public long lastUpdate;
    public List stackDiff;
    public List threadStateInfo;
    public int updateTimes;

    public void LogRecordQueue$StackHolder(){
       super();
       this.threadStateInfo = new ArrayList();
       this.updateTimes = 0;
       this.stackDiff = new ArrayList();
    }
    public LogRecordQueue$StackHolder copy(){
       LogRecordQueue$StackHolder stackHolder = new LogRecordQueue$StackHolder();
       stackHolder.lastUpdate = this.lastUpdate;
       stackHolder.stackDiff = new ArrayList(this.stackDiff);
       return stackHolder;
    }
    public String toString(){
       return "StackHolder {lastUpdate="+this.lastUpdate+", stackDiff="+this.stackDiff+'}';
    }
}
