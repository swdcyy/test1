package com.kwai.performance.stability.crash.monitor.anr.config.AsyncScheduleConfig;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class AsyncScheduleConfig implements Serializable	// class@0011be
{
    public boolean enableBgLockResMgrSchedule;
    public boolean enableConfChangeSchedule;
    public boolean enableDoubleQueue;
    public boolean enableHeadMsgCheck;
    public boolean enableLowMemorySchedule;
    public boolean enableReceiverSchedule;
    public boolean enableServiceSchedule;
    public boolean enableTrimMemorySchedule;
    public List excludedException;
    public boolean forceSchedForReceiver;
    public List forceSchedReceiverAction;
    public List forceSchedReceiverCmp;
    public List receiverBlackList;
    public List receiverClassBlackList;
    public List receiverWhiteList;
    public int recentSchedCount;
    public List serviceBlackList;
    public List serviceWhatList;
    public boolean tempCatchRegistryRecycleException;
    public int tempCheckDelayTime;
    public boolean tempEnable113Schedule;
    public boolean tempEnableDelayMapCheck;
    public boolean tempEnableDumpSchedQueue;
    public boolean tempEnableLooperHook;
    public boolean tempEnableWhat114Wait;
    public boolean tempReceiverErrorToMain;
    public boolean tempReportForDebug;
    public boolean tempTryScheduleOnFound;
    public int whatConfChange;
    public int whatCreateService;
    public int whatLowMemory;
    public int whatReceiver;
    public int whatServiceArgs;
    public int whatStopService;
    public int whatTrimMemory;

    public void AsyncScheduleConfig(){
       super();
       this.enableServiceSchedule = false;
       this.enableReceiverSchedule = false;
       this.enableDoubleQueue = false;
       this.enableHeadMsgCheck = false;
       this.enableTrimMemorySchedule = false;
       this.enableLowMemorySchedule = false;
       this.enableConfChangeSchedule = false;
       this.enableBgLockResMgrSchedule = false;
       this.recentSchedCount = 50;
       this.whatReceiver = 113;
       this.whatCreateService = 114;
       this.whatServiceArgs = 115;
       this.whatStopService = 116;
       this.whatTrimMemory = 140;
       this.whatLowMemory = 124;
       this.whatConfChange = 118;
       this.tempCatchRegistryRecycleException = true;
       this.tempReceiverErrorToMain = true;
       this.tempEnable113Schedule = true;
       this.tempEnableWhat114Wait = true;
       this.tempEnableDelayMapCheck = false;
       this.tempTryScheduleOnFound = false;
       this.tempEnableLooperHook = false;
       this.tempEnableDumpSchedQueue = false;
       this.tempReportForDebug = false;
       this.forceSchedForReceiver = false;
       this.tempCheckDelayTime = -1;
    }
    public static AsyncScheduleConfig createDefaultConfig(){
       AsyncScheduleConfig uAsyncSchedu = new AsyncScheduleConfig();
       uAsyncSchedu.enableServiceSchedule = true;
       uAsyncSchedu.enableReceiverSchedule = true;
       uAsyncSchedu.enableTrimMemorySchedule = true;
       uAsyncSchedu.enableBgLockResMgrSchedule = true;
       ArrayList uArrayList = new ArrayList();
       uArrayList.add("com.mini.app.service.MiniAppServiceM");
       uArrayList.add("com.kuaishou.live.core.show.screenrecord.LiveScreenRecordForegroundService");
       uArrayList.add("com.kwai.component.misc.wallpaper.VideoWallpaperService");
       uAsyncSchedu.serviceBlackList = uArrayList;
       return uAsyncSchedu;
    }
    public boolean isDefault(){
       boolean b = (this.enableServiceSchedule == null && this.enableReceiverSchedule == null)? true: false;
       return b;
    }
}
