package com.kuaishou.post.story.aiVideo.model.AIVideoBackgroundLoadingStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AIVideoBackgroundLoadingStatus extends Enum	// class@000abc
{
    public static final AIVideoBackgroundLoadingStatus[] $VALUES;
    public static final AIVideoBackgroundLoadingStatus BACKGROUND_LOADING_CANCEL;
    public static final AIVideoBackgroundLoadingStatus BACKGROUND_LOADING_FAILED;
    public static final AIVideoBackgroundLoadingStatus BACKGROUND_LOADING_FINISH;
    public static final AIVideoBackgroundLoadingStatus BACKGROUND_LOADING_PROGRESSING;
    public static final AIVideoBackgroundLoadingStatus BACKGROUND_LOADING_RETRY;
    public static final AIVideoBackgroundLoadingStatus BACKGROUND_LOADING_START;

    static {
       AIVideoBackgroundLoadingStatus uAIVideoBack1;
       AIVideoBackgroundLoadingStatus[] uAIVideoBack = new AIVideoBackgroundLoadingStatus[]{uAIVideoBack1,uAIVideoBack1,uAIVideoBack1,uAIVideoBack1,uAIVideoBack1,uAIVideoBack1};
       uAIVideoBack1 = new AIVideoBackgroundLoadingStatus("BACKGROUND_LOADING_START", 0);
       AIVideoBackgroundLoadingStatus.BACKGROUND_LOADING_START = uAIVideoBack1;
       uAIVideoBack1 = new AIVideoBackgroundLoadingStatus("BACKGROUND_LOADING_PROGRESSING", 1);
       AIVideoBackgroundLoadingStatus.BACKGROUND_LOADING_PROGRESSING = uAIVideoBack1;
       uAIVideoBack1 = new AIVideoBackgroundLoadingStatus("BACKGROUND_LOADING_CANCEL", 2);
       AIVideoBackgroundLoadingStatus.BACKGROUND_LOADING_CANCEL = uAIVideoBack1;
       uAIVideoBack1 = new AIVideoBackgroundLoadingStatus("BACKGROUND_LOADING_FAILED", 3);
       AIVideoBackgroundLoadingStatus.BACKGROUND_LOADING_FAILED = uAIVideoBack1;
       uAIVideoBack1 = new AIVideoBackgroundLoadingStatus("BACKGROUND_LOADING_FINISH", 4);
       AIVideoBackgroundLoadingStatus.BACKGROUND_LOADING_FINISH = uAIVideoBack1;
       uAIVideoBack1 = new AIVideoBackgroundLoadingStatus("BACKGROUND_LOADING_RETRY", 5);
       AIVideoBackgroundLoadingStatus.BACKGROUND_LOADING_RETRY = uAIVideoBack1;
       AIVideoBackgroundLoadingStatus.$VALUES = uAIVideoBack;
    }
    public void AIVideoBackgroundLoadingStatus(String p0,int p1){
       super(p0, p1);
    }
    public static AIVideoBackgroundLoadingStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AIVideoBackgroundLoadingStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AIVideoBackgroundLoadingStatus.class, p0);
    }
    public static AIVideoBackgroundLoadingStatus[] values(){
       Object obj = PatchProxy.apply(null, null, AIVideoBackgroundLoadingStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AIVideoBackgroundLoadingStatus.$VALUES.clone();
    }
}
