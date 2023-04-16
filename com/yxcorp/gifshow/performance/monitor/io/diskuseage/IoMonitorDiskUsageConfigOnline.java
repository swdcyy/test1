package com.yxcorp.gifshow.performance.monitor.io.diskuseage.IoMonitorDiskUsageConfigOnline;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public class IoMonitorDiskUsageConfigOnline implements Serializable	// class@0012c2
{
    public int appUesdTimeNeeded;
    public String[] blackDirList;
    public boolean disableChildProcess;
    public boolean isInnerDir;
    public boolean monitorChildDirEnable;
    public String monitorDir;
    public boolean monitorEnable;
    public int monitorIntervelDays;
    public int openFileCountLimit;
    public long randomDirLevelLimit;
    public long randomDirSizeLimit;
    public long unUsedFileSizeLimit;

    public void IoMonitorDiskUsageConfigOnline(){
       super();
       this.monitorEnable = false;
       this.monitorIntervelDays = 7;
       this.appUesdTimeNeeded = 0;
       this.unUsedFileSizeLimit = 0x100000;
       this.openFileCountLimit = 5;
       this.randomDirSizeLimit = 0xa00000;
       this.randomDirLevelLimit = 3;
       this.isInnerDir = true;
       this.disableChildProcess = true;
       this.monitorChildDirEnable = false;
       String[] stringArray = new String[]{"******"};
       this.blackDirList = stringArray;
    }
}
