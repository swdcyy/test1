package com.kwai.performance.overhead.io.monitor.FDMonitorArgsConfig;
import java.io.Serializable;
import java.lang.Object;
import dg7.b;
import java.lang.String;
import java.lang.StringBuilder;

public class FDMonitorArgsConfig implements Serializable	// class@001150
{
    public int fdAbortStep;
    public int fdAbortThreshold;
    public float fdMonitorRate;
    public float fdRandomTraceRate;
    public int fdTraceThreshold;

    public void FDMonitorArgsConfig(){
       super();
       this.fdTraceThreshold = b.h;
       this.fdAbortThreshold = b.i;
       this.fdRandomTraceRate = b.j;
       this.fdMonitorRate = b.k;
       this.fdAbortStep = b.l;
    }
    public String toString(){
       return "FDMonitorArgsConfig{fdTraceThreshold="+this.fdTraceThreshold+", fdAbortThreshold="+this.fdAbortThreshold+", fdAbortStep="+this.fdAbortStep+'}';
    }
}
