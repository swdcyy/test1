package com.kuaishou.liveclient.resourcemanager.download.task.LiveMaterialResourceDownloadTask$TaskState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveMaterialResourceDownloadTask$TaskState extends Enum	// class@001089
{
    public static final LiveMaterialResourceDownloadTask$TaskState[] $VALUES;
    public static final LiveMaterialResourceDownloadTask$TaskState EXECUTING;
    public static final LiveMaterialResourceDownloadTask$TaskState FAILED;
    public static final LiveMaterialResourceDownloadTask$TaskState FINISH;
    public static final LiveMaterialResourceDownloadTask$TaskState INIT;

    static {
       LiveMaterialResourceDownloadTask$TaskState taskState;
       LiveMaterialResourceDownloadTask$TaskState[] taskStateArr = new LiveMaterialResourceDownloadTask$TaskState[]{taskState,taskState,taskState,taskState};
       taskState = new LiveMaterialResourceDownloadTask$TaskState("INIT", 0);
       LiveMaterialResourceDownloadTask$TaskState.INIT = taskState;
       taskState = new LiveMaterialResourceDownloadTask$TaskState("EXECUTING", 1);
       LiveMaterialResourceDownloadTask$TaskState.EXECUTING = taskState;
       taskState = new LiveMaterialResourceDownloadTask$TaskState("FINISH", 2);
       LiveMaterialResourceDownloadTask$TaskState.FINISH = taskState;
       taskState = new LiveMaterialResourceDownloadTask$TaskState("FAILED", 3);
       LiveMaterialResourceDownloadTask$TaskState.FAILED = taskState;
       LiveMaterialResourceDownloadTask$TaskState.$VALUES = taskStateArr;
    }
    public void LiveMaterialResourceDownloadTask$TaskState(String p0,int p1){
       super(p0, p1);
    }
    public static LiveMaterialResourceDownloadTask$TaskState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveMaterialResourceDownloadTask$TaskState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveMaterialResourceDownloadTask$TaskState.class, p0);
    }
    public static LiveMaterialResourceDownloadTask$TaskState[] values(){
       Object obj = PatchProxy.apply(null, null, LiveMaterialResourceDownloadTask$TaskState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveMaterialResourceDownloadTask$TaskState.$VALUES.clone();
    }
}
