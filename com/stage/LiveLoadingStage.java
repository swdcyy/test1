package com.stage.LiveLoadingStage;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class LiveLoadingStage extends Enum	// class@000c7d
{
    public static final LiveLoadingStage[] $VALUES;
    public static final LiveLoadingStage Entered;
    public static final LiveLoadingStage PreLoading;
    public static final LiveLoadingStage Sliding;

    static {
       LiveLoadingStage liveLoadingS1;
       LiveLoadingStage[] liveLoadingS = new LiveLoadingStage[]{liveLoadingS1,liveLoadingS1,liveLoadingS1};
       liveLoadingS1 = new LiveLoadingStage("PreLoading", 0);
       LiveLoadingStage.PreLoading = liveLoadingS1;
       liveLoadingS1 = new LiveLoadingStage("Sliding", 1);
       LiveLoadingStage.Sliding = liveLoadingS1;
       liveLoadingS1 = new LiveLoadingStage("Entered", 2);
       LiveLoadingStage.Entered = liveLoadingS1;
       LiveLoadingStage.$VALUES = liveLoadingS;
    }
    public void LiveLoadingStage(String p0,int p1){
       super(p0, p1);
    }
    public static LiveLoadingStage valueOf(String p0){
       return Enum.valueOf(LiveLoadingStage.class, p0);
    }
    public static LiveLoadingStage[] values(){
       return LiveLoadingStage.$VALUES.clone();
    }
}
