package com.yxcorp.gifshow.media.watermark.VideoWatermarkTask$TaskState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class VideoWatermarkTask$TaskState extends Enum	// class@001d28
{
    public static final VideoWatermarkTask$TaskState[] $VALUES;
    public static final VideoWatermarkTask$TaskState CANCEL;
    public static final VideoWatermarkTask$TaskState ERROR;
    public static final VideoWatermarkTask$TaskState FINISH;
    public static final VideoWatermarkTask$TaskState PROGRESS;

    static {
       VideoWatermarkTask$TaskState taskState = new VideoWatermarkTask$TaskState("PROGRESS", 0);
       VideoWatermarkTask$TaskState.PROGRESS = taskState;
       VideoWatermarkTask$TaskState taskState1 = new VideoWatermarkTask$TaskState("FINISH", 1);
       VideoWatermarkTask$TaskState.FINISH = taskState1;
       VideoWatermarkTask$TaskState taskState2 = new VideoWatermarkTask$TaskState("ERROR", 2);
       VideoWatermarkTask$TaskState.ERROR = taskState2;
       VideoWatermarkTask$TaskState taskState3 = new VideoWatermarkTask$TaskState("CANCEL", 3);
       VideoWatermarkTask$TaskState.CANCEL = taskState3;
       VideoWatermarkTask$TaskState[] taskStateArr = new VideoWatermarkTask$TaskState[]{taskState,taskState1,taskState2,taskState3};
       VideoWatermarkTask$TaskState.$VALUES = taskStateArr;
    }
    public void VideoWatermarkTask$TaskState(String p0,int p1){
       super(p0, p1);
    }
    public static VideoWatermarkTask$TaskState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VideoWatermarkTask$TaskState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(VideoWatermarkTask$TaskState.class, p0);
    }
    public static VideoWatermarkTask$TaskState[] values(){
       Object obj = PatchProxy.apply(null, null, VideoWatermarkTask$TaskState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return VideoWatermarkTask$TaskState.$VALUES.clone();
    }
}
