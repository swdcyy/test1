package com.kwai.performance.overhead.io.monitor.IoMonitorDiskUsageConfig;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import dg7.b;

public class IoMonitorDiskUsageConfig implements Serializable	// class@001155
{
    public boolean isDiskUsageMode;
    public String[] monitorBlackDirs;
    public String monitorDir;
    public String monitorDirParent;

    public void IoMonitorDiskUsageConfig(boolean p0,String p1,String p2,String[] p3){
       super();
       this.isDiskUsageMode = false;
       this.monitorDir = "";
       this.monitorDirParent = "";
       this.monitorBlackDirs = b.m;
       this.isDiskUsageMode = p0;
       this.monitorDir = p1;
       this.monitorDirParent = p2;
       this.monitorBlackDirs = p3;
    }
}
