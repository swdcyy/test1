package com.kwai.performance.overhead.io.monitor.IoMonitorArgsConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public class IoMonitorArgsConfig implements Serializable	// class@001154
{
    public int bigFileSizeByte;
    public boolean debug;
    public boolean detectInMainThread;
    public boolean fileIssueCollect;
    public int fileReportCount;
    public long nativeLogPtr;
    public int openCloseCount;
    public float openCloseFrequently;
    public int overviewSaveDurationMs;
    public int overviewSaveSizeByte;
    public boolean replaceEnable;
    public int smallBufferByte;
    public int smallBufferCount;
    public int startTimeMs;
    public double traceRatio;
    public int traceReportCount;
    public int traceReportSeconds;

    public void IoMonitorArgsConfig(){
       super();
       this.debug = false;
       this.nativeLogPtr = -1;
       this.replaceEnable = false;
       this.detectInMainThread = false;
       this.fileIssueCollect = false;
       this.traceRatio = 0x3f60624de0000000;
       this.fileReportCount = 40;
       this.overviewSaveDurationMs = 0x7530;
       this.overviewSaveSizeByte = 0x1e00000;
       this.openCloseFrequently = 0x3f000000;
       this.openCloseCount = 10;
       this.startTimeMs = 4000;
       this.smallBufferByte = 128;
       this.smallBufferCount = 5;
       this.bigFileSizeByte = 0x1400000;
       this.traceReportCount = 40;
       this.traceReportSeconds = 120;
    }
    public String toString(){
       return "IoMonitorArgsConfig{debug="+this.debug+", nativeLogPtr="+this.nativeLogPtr+", detectInMainThread="+this.detectInMainThread+", fileIssueCollect="+this.fileIssueCollect+", traceRatio="+this.traceRatio+", fileReportCount="+this.fileReportCount+", overviewSaveDurationMs="+this.overviewSaveDurationMs+", overviewSaveSizeByte="+this.overviewSaveSizeByte+", openCloseFrequently="+this.openCloseFrequently+", openCloseCount="+this.openCloseCount+", startTimeMs="+this.startTimeMs+", smallBufferByte="+this.smallBufferByte+", smallBufferCount="+this.smallBufferCount+", bigFileSizeByte="+this.bigFileSizeByte+", traceReportCount="+this.traceReportCount+", traceReportSeconds="+this.traceReportSeconds+'}';
    }
}
