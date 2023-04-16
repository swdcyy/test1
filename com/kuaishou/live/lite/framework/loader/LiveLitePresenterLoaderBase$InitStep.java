package com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase$InitStep;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLitePresenterLoaderBase$InitStep extends Enum	// class@000921
{
    public static final LiveLitePresenterLoaderBase$InitStep[] $VALUES;
    public static final LiveLitePresenterLoaderBase$InitStep Create;
    public static final LiveLitePresenterLoaderBase$InitStep InjectModel;
    public static final LiveLitePresenterLoaderBase$InitStep InjectService;
    public static final LiveLitePresenterLoaderBase$InitStep Register;

    static {
       LiveLitePresenterLoaderBase$InitStep initStep;
       LiveLitePresenterLoaderBase$InitStep[] initStepArra = new LiveLitePresenterLoaderBase$InitStep[]{initStep,initStep,initStep,initStep};
       initStep = new LiveLitePresenterLoaderBase$InitStep("Register", 0);
       LiveLitePresenterLoaderBase$InitStep.Register = initStep;
       initStep = new LiveLitePresenterLoaderBase$InitStep("InjectModel", 1);
       LiveLitePresenterLoaderBase$InitStep.InjectModel = initStep;
       initStep = new LiveLitePresenterLoaderBase$InitStep("InjectService", 2);
       LiveLitePresenterLoaderBase$InitStep.InjectService = initStep;
       initStep = new LiveLitePresenterLoaderBase$InitStep("Create", 3);
       LiveLitePresenterLoaderBase$InitStep.Create = initStep;
       LiveLitePresenterLoaderBase$InitStep.$VALUES = initStepArra;
    }
    public void LiveLitePresenterLoaderBase$InitStep(String p0,int p1){
       super(p0, p1);
    }
    public static LiveLitePresenterLoaderBase$InitStep valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveLitePresenterLoaderBase$InitStep.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveLitePresenterLoaderBase$InitStep.class, p0);
    }
    public static LiveLitePresenterLoaderBase$InitStep[] values(){
       Object obj = PatchProxy.apply(null, null, LiveLitePresenterLoaderBase$InitStep.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLitePresenterLoaderBase$InitStep.$VALUES.clone();
    }
}
