package com.yxcorp.download.DownloadDispatcher$PromoteTaskReason;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DownloadDispatcher$PromoteTaskReason extends Enum	// class@0011a4
{
    public static final DownloadDispatcher$PromoteTaskReason[] $VALUES;
    public static final DownloadDispatcher$PromoteTaskReason Focus_Change;
    public static final DownloadDispatcher$PromoteTaskReason InitParallel_Timeout;
    public static final DownloadDispatcher$PromoteTaskReason InitPriority_Update;
    public static final DownloadDispatcher$PromoteTaskReason LaunchBizFt_Update;
    public static final DownloadDispatcher$PromoteTaskReason MaxParallel_Change;
    public static final DownloadDispatcher$PromoteTaskReason PeakTraffic;
    public static final DownloadDispatcher$PromoteTaskReason Task_Enqueue;
    public static final DownloadDispatcher$PromoteTaskReason Task_Pause;
    public static final DownloadDispatcher$PromoteTaskReason Task_Stop;

    static {
       DownloadDispatcher$PromoteTaskReason promoteTaskR = new DownloadDispatcher$PromoteTaskReason("Task_Enqueue", 0);
       DownloadDispatcher$PromoteTaskReason.Task_Enqueue = promoteTaskR;
       DownloadDispatcher$PromoteTaskReason promoteTaskR1 = new DownloadDispatcher$PromoteTaskReason("Focus_Change", 1);
       DownloadDispatcher$PromoteTaskReason.Focus_Change = promoteTaskR1;
       DownloadDispatcher$PromoteTaskReason promoteTaskR2 = new DownloadDispatcher$PromoteTaskReason("Task_Stop", 2);
       DownloadDispatcher$PromoteTaskReason.Task_Stop = promoteTaskR2;
       DownloadDispatcher$PromoteTaskReason promoteTaskR3 = new DownloadDispatcher$PromoteTaskReason("Task_Pause", 3);
       DownloadDispatcher$PromoteTaskReason.Task_Pause = promoteTaskR3;
       DownloadDispatcher$PromoteTaskReason promoteTaskR4 = new DownloadDispatcher$PromoteTaskReason("MaxParallel_Change", 4);
       DownloadDispatcher$PromoteTaskReason.MaxParallel_Change = promoteTaskR4;
       DownloadDispatcher$PromoteTaskReason promoteTaskR5 = new DownloadDispatcher$PromoteTaskReason("PeakTraffic", 5);
       DownloadDispatcher$PromoteTaskReason.PeakTraffic = promoteTaskR5;
       DownloadDispatcher$PromoteTaskReason promoteTaskR6 = new DownloadDispatcher$PromoteTaskReason("LaunchBizFt_Update", 6);
       DownloadDispatcher$PromoteTaskReason.LaunchBizFt_Update = promoteTaskR6;
       DownloadDispatcher$PromoteTaskReason promoteTaskR7 = new DownloadDispatcher$PromoteTaskReason("InitParallel_Timeout", 7);
       DownloadDispatcher$PromoteTaskReason.InitParallel_Timeout = promoteTaskR7;
       DownloadDispatcher$PromoteTaskReason promoteTaskR8 = new DownloadDispatcher$PromoteTaskReason("InitPriority_Update", 8);
       DownloadDispatcher$PromoteTaskReason.InitPriority_Update = promoteTaskR8;
       DownloadDispatcher$PromoteTaskReason[] promoteTaskR9 = new DownloadDispatcher$PromoteTaskReason[9];
       promoteTaskR9[0] = promoteTaskR;
       promoteTaskR9[1] = promoteTaskR1;
       promoteTaskR9[2] = promoteTaskR2;
       promoteTaskR9[3] = promoteTaskR3;
       promoteTaskR9[4] = promoteTaskR4;
       promoteTaskR9[5] = promoteTaskR5;
       promoteTaskR9[6] = promoteTaskR6;
       promoteTaskR9[7] = promoteTaskR7;
       promoteTaskR9[8] = promoteTaskR8;
       DownloadDispatcher$PromoteTaskReason.$VALUES = promoteTaskR9;
    }
    public void DownloadDispatcher$PromoteTaskReason(String p0,int p1){
       super(p0, p1);
    }
    public static DownloadDispatcher$PromoteTaskReason valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DownloadDispatcher$PromoteTaskReason.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DownloadDispatcher$PromoteTaskReason.class, p0);
    }
    public static DownloadDispatcher$PromoteTaskReason[] values(){
       Object obj = PatchProxy.apply(null, null, DownloadDispatcher$PromoteTaskReason.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DownloadDispatcher$PromoteTaskReason.$VALUES.clone();
    }
}
