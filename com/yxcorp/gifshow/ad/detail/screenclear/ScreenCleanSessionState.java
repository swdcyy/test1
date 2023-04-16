package com.yxcorp.gifshow.ad.detail.screenclear.ScreenCleanSessionState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ScreenCleanSessionState extends Enum	// class@0016f0
{
    public static final ScreenCleanSessionState[] $VALUES;
    public static final ScreenCleanSessionState CleanDone;
    public static final ScreenCleanSessionState CleanRequest;
    public static final ScreenCleanSessionState Cleaning;
    public static final ScreenCleanSessionState Reset;
    public static final ScreenCleanSessionState ResumeDone;
    public static final ScreenCleanSessionState ResumeRequest;
    public static final ScreenCleanSessionState Resuming;

    static {
       ScreenCleanSessionState screenCleanS1;
       ScreenCleanSessionState[] screenCleanS = new ScreenCleanSessionState[]{screenCleanS1,screenCleanS1,screenCleanS1,screenCleanS1,screenCleanS1,screenCleanS1,screenCleanS1};
       screenCleanS1 = new ScreenCleanSessionState("CleanRequest", 0);
       ScreenCleanSessionState.CleanRequest = screenCleanS1;
       screenCleanS1 = new ScreenCleanSessionState("Cleaning", 1);
       ScreenCleanSessionState.Cleaning = screenCleanS1;
       screenCleanS1 = new ScreenCleanSessionState("CleanDone", 2);
       ScreenCleanSessionState.CleanDone = screenCleanS1;
       screenCleanS1 = new ScreenCleanSessionState("ResumeRequest", 3);
       ScreenCleanSessionState.ResumeRequest = screenCleanS1;
       screenCleanS1 = new ScreenCleanSessionState("Resuming", 4);
       ScreenCleanSessionState.Resuming = screenCleanS1;
       screenCleanS1 = new ScreenCleanSessionState("ResumeDone", 5);
       ScreenCleanSessionState.ResumeDone = screenCleanS1;
       screenCleanS1 = new ScreenCleanSessionState("Reset", 6);
       ScreenCleanSessionState.Reset = screenCleanS1;
       ScreenCleanSessionState.$VALUES = screenCleanS;
    }
    public void ScreenCleanSessionState(String p0,int p1){
       super(p0, p1);
    }
    public static ScreenCleanSessionState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ScreenCleanSessionState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ScreenCleanSessionState.class, p0);
    }
    public static ScreenCleanSessionState[] values(){
       Object obj = PatchProxy.apply(null, null, ScreenCleanSessionState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ScreenCleanSessionState.$VALUES.clone();
    }
}
